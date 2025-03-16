package com.jagex.runetek4.input;

import com.jagex.runetek4.Static215;
import com.jagex.runetek4.Static223;
import com.jagex.runetek4.util.ThreadUtils;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("runetek4.client!jd")
public final class MouseCapturer implements Runnable {

	@OriginalMember(owner = "runetek4.client!od", name = "f", descriptor = "Lclient!jd;")
	public static MouseCapturer instance;

	@OriginalMember(owner = "runetek4.client!jd", name = "e", descriptor = "Z")
	public boolean running = true;

	@OriginalMember(owner = "runetek4.client!jd", name = "f", descriptor = "Ljava/lang/Object;")
	public final Object lock = new Object();

	@OriginalMember(owner = "runetek4.client!jd", name = "k", descriptor = "I")
	public int samples = 0;

	@OriginalMember(owner = "runetek4.client!jd", name = "l", descriptor = "[I")
	public final int[] y = new int[500];

	@OriginalMember(owner = "runetek4.client!jd", name = "n", descriptor = "[I")
	public final int[] x = new int[500];

	@OriginalMember(owner = "runetek4.client!jd", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		while (this.running) {
			@Pc(12) Object local12 = this.lock;
			synchronized (this.lock) {
				if (this.samples < 500) {
					this.x[this.samples] = Static215.anInt4873;
					this.y[this.samples] = Static223.anInt5032;
					this.samples++;
				}
			}
			ThreadUtils.sleep(50L);
		}
	}
}
