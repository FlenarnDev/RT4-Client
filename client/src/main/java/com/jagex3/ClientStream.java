package com.jagex3;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import com.jagex.signlink.PrivilegedRequest;
import com.jagex.signlink.SignLink;
import deob.Static231;
import deob.Static89;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex3.client.client!ma")
public final class ClientStream implements Runnable {

	@OriginalMember(owner = "com.jagex3.client.client!ma", name = "h", descriptor = "[B")
	private byte[] buf;

	@OriginalMember(owner = "com.jagex3.client.client!ma", name = "n", descriptor = "Lsignlink!im;")
	private PrivilegedRequest writer;

	@OriginalMember(owner = "com.jagex3.client.client!ma", name = "l", descriptor = "I")
	private int tcyl = 0;

	@OriginalMember(owner = "com.jagex3.client.client!ma", name = "b", descriptor = "I")
	private int tnum = 0;

	@OriginalMember(owner = "com.jagex3.client.client!ma", name = "v", descriptor = "Z")
	private boolean dummy = false;

	@OriginalMember(owner = "com.jagex3.client.client!ma", name = "y", descriptor = "Z")
	private boolean ioerror = false;

	@OriginalMember(owner = "com.jagex3.client.client!ma", name = "r", descriptor = "Lsignlink!ll;")
	private final SignLink signlink;

	@OriginalMember(owner = "com.jagex3.client.client!ma", name = "k", descriptor = "Ljava/net/Socket;")
	private final Socket socket;

	@OriginalMember(owner = "com.jagex3.client.client!ma", name = "e", descriptor = "Ljava/io/InputStream;")
	private InputStream in;

	@OriginalMember(owner = "com.jagex3.client.client!ma", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream out;

	@OriginalMember(owner = "com.jagex3.client.client!ma", name = "<init>", descriptor = "(Ljava/net/Socket;Lsignlink!ll;)V")
	public ClientStream(@OriginalArg(0) Socket arg0, @OriginalArg(1) SignLink arg1) throws IOException {
		this.signlink = arg1;
		this.socket = arg0;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.in = this.socket.getInputStream();
		this.out = this.socket.getOutputStream();
	}

    @OriginalMember(owner = "com.jagex3.client.client!ma", name = "e", descriptor = "(I)V")
    public final void close() {
        if (this.dummy) {
            return;
        }
        synchronized (this) {
            this.dummy = true;
            this.notifyAll();
        }
        if (this.writer != null) {
            while (this.writer.status == 0) {
                Static231.sleepPrecise(1L);
            }
            if (this.writer.status == 1) {
                try {
                    ((Thread) this.writer.result).join();
                } catch (@Pc(59) InterruptedException local59) {
                }
            }
        }
        this.writer = null;
    }

    @OriginalMember(owner = "com.jagex3.client.client!ma", name = "a", descriptor = "(I)I")
    public final int read() throws IOException {
        return this.dummy ? 0 : this.in.read();
    }

    @OriginalMember(owner = "com.jagex3.client.client!ma", name = "c", descriptor = "(I)I")
    public final int available() throws IOException {
        return this.dummy ? 0 : this.in.available();
    }

    @OriginalMember(owner = "com.jagex3.client.client!ma", name = "a", descriptor = "(III[B)V")
    public final void read(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
        if (this.dummy) {
            return;
        }
        while (arg1 > 0) {
            @Pc(23) int local23 = this.in.read(arg2, arg0, arg1);
            if (local23 <= 0) {
                throw new EOFException();
            }
            arg0 += local23;
            arg1 -= local23;
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!ma", name = "a", descriptor = "(ZI[BI)V")
    public final void write(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
        if (this.dummy) {
            return;
        }
        if (this.ioerror) {
            this.ioerror = false;
            throw new IOException();
        }
        if (this.buf == null) {
            this.buf = new byte[5000];
        }
        synchronized (this) {
            for (@Pc(34) int local34 = 0; local34 < arg1; local34++) {
                this.buf[this.tnum] = arg0[local34];
                this.tnum = (this.tnum + 1) % 5000;
                if (this.tnum == (this.tcyl + 4900) % 5000) {
                    throw new IOException();
                }
            }
            if (this.writer == null) {
                this.writer = this.signlink.threadreq(3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!ma", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			while (true) {
				@Pc(39) int var1;
				@Pc(24) int var2;
				label85: {
					synchronized (this) {
						label86: {
							if (this.tnum == this.tcyl) {
								if (this.dummy) {
									break label86;
								}
								try {
									this.wait();
								} catch (@Pc(21) InterruptedException local21) {
								}
							}
							var2 = this.tcyl;
							if (this.tcyl > this.tnum) {
								var1 = 5000 - this.tcyl;
							} else {
								var1 = this.tnum - this.tcyl;
							}
							break label85;
						}
					}
					try {
						if (this.in != null) {
							this.in.close();
						}
						if (this.out != null) {
							this.out.close();
						}
						if (this.socket != null) {
							this.socket.close();
						}
					} catch (@Pc(119) IOException local119) {
					}
					this.buf = null;
					break;
				}
				if (var1 > 0) {
					try {
						this.out.write(this.buf, var2, var1);
					} catch (@Pc(67) IOException local67) {
						this.ioerror = true;
					}
					this.tcyl = (var1 + this.tcyl) % 5000;
					try {
						if (this.tnum == this.tcyl) {
							this.out.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.ioerror = true;
					}
				}
			}
		} catch (@Pc(124) Exception local124) {
			Static89.report(null, local124);
		}
	}





	@OriginalMember(owner = "com.jagex3.client.client!ma", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.close();
	}



	@OriginalMember(owner = "com.jagex3.client.client!ma", name = "d", descriptor = "(I)V")
	public final void method2832() throws IOException {
		if (!this.dummy && this.ioerror) {
			this.ioerror = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!ma", name = "a", descriptor = "(Z)V")
	public final void method2833() {
		if (!this.dummy) {
			this.in = new BrokenInputStream();
			this.out = new BrokenOutputStream();
		}
	}


}
