package com.jagex3.client.applet;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

import com.jagex.signlink.MonotonicClock;
import com.jagex.signlink.PrivilegedRequest;
import com.jagex.signlink.SignLink;
import com.jagex3.*;
import com.jagex3.client.Client;
import deob.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex3.client.client!rc")
public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "com.jagex3.client.client!dk", name = "j", descriptor = "[Lclient!en;")
    public static final BufferedRandomAccessFile[] cacheIndexes = new BufferedRandomAccessFile[28];
    @OriginalMember(owner = "com.jagex3.client.client!fk", name = "l", descriptor = "Lsignlink!ll;")
    public static SignLink signLink;
    @OriginalMember(owner = "com.jagex3.client.client!vd", name = "w", descriptor = "Lclient!vk;")
    public static PixMap drawArea;
    @OriginalMember(owner = "com.jagex3.client.client!cl", name = "bb", descriptor = "Z")
    public static volatile boolean canvasReplaceRecommended = false;
    @OriginalMember(owner = "com.jagex3.client.client!fh", name = "Y", descriptor = "Ljava/awt/Frame;")
    public static Frame aFrame2;
    @OriginalMember(owner = "com.jagex3.client.client!d", name = "Y", descriptor = "Ljava/awt/Frame;")
    public static Frame frame;
    @OriginalMember(owner = "com.jagex3.client.client!dl", name = "d", descriptor = "I")
    public static int anInt1448;
    @OriginalMember(owner = "com.jagex3.client.client!uj", name = "B", descriptor = "I")
    public static int anInt5554;
    @OriginalMember(owner = "com.jagex3.client.client!rc", name = "b", descriptor = "Z")
	private boolean alreadyerrored = false;

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "providesignlink", descriptor = "(Lsignlink!ll;)V")
	public static void providesignlink(@OriginalArg(0) SignLink arg0) {
		signLink = arg0;
		Static69.aClass213_4 = arg0;
	}

    @OriginalMember(owner = "com.jagex3.client.client!nf", name = "a", descriptor = "(Lclient!na;BZ)V")
    public static void openUrl(@OriginalArg(0) JagString arg0, @OriginalArg(2) boolean arg1) {
        if (!arg1) {
            try {
                Static230.anApplet_Sub1_1.getAppletContext().showDocument(arg0.method3127(Static230.anApplet_Sub1_1.getCodeBase()), "_top");
            } catch (@Pc(22) Exception local22) {
            }
            return;
        }
        if (GlRenderer.enabled && Static40.aBoolean78) {
            try {
                Static287.method1758(signLink.applet, "openjs", new Object[] { arg0.method3127(Static230.anApplet_Sub1_1.getCodeBase()).toString() });
                return;
            } catch (@Pc(48) Throwable local48) {
            }
        }
        try {
            Static230.anApplet_Sub1_1.getAppletContext().showDocument(arg0.method3127(Static230.anApplet_Sub1_1.getCodeBase()), "_blank");
        } catch (@Pc(59) Exception local59) {
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!n", name = "a", descriptor = "(B)V")
    public static void resetProgress() {
        Static240.aFontMetrics1 = null;
        Static222.aFont1 = null;
        Static149.anImage3 = null;
    }

    @OriginalMember(owner = "com.jagex3.client.client!qh", name = "a", descriptor = "(Z)V")
    public static void method3662() {
        @Pc(8) Container local8;
        if (aFrame2 != null) {
            local8 = aFrame2;
        } else if (frame == null) {
            local8 = signLink.applet;
        } else {
            local8 = frame;
        }
        Client.canvasWid = local8.getSize().width;
        Client.canvasHei = local8.getSize().height;
        @Pc(35) Insets local35;
        if (local8 == frame) {
            local35 = frame.getInsets();
            Client.canvasHei -= local35.bottom + local35.top;
            Client.canvasWid -= local35.right + local35.left;
        }
        if (Static144.method2736() >= 2) {
            anInt1448 = Client.canvasWid;
            Client.anInt3497 = 0;
            Client.anInt4246 = 0;
            anInt5554 = Client.canvasHei;
        } else {
            Client.anInt4246 = 0;
            Client.anInt3497 = (Client.canvasWid - 765) / 2;
            anInt5554 = 503;
            anInt1448 = 765;
        }
        if (GlRenderer.enabled) {
            GlRenderer.setCanvasSize(anInt1448, anInt5554);
        }
        GameCanvas.canvas.setSize(anInt1448, anInt5554);
        if (local8 == frame) {
            local35 = frame.getInsets();
            GameCanvas.canvas.setLocation(local35.left + Client.anInt3497, Client.anInt4246 + local35.top);
        } else {
            GameCanvas.canvas.setLocation(Client.anInt3497, Client.anInt4246);
        }
        if (Client.toplevelinterface != -1) {
            Client.method3712(true);
        }
        Static139.method2704();
    }

    @OriginalMember(owner = "com.jagex3.client.client!ta", name = "a", descriptor = "(Z)V")
    public static void doneslowupdate() {
        Static200.aClass93_1.method3394();
        @Pc(10) int local10;
        for (local10 = 0; local10 < 32; local10++) {
            Static7.aLongArray2[local10] = 0L;
        }
        for (local10 = 0; local10 < 32; local10++) {
            Static228.aLongArray8[local10] = 0L;
        }
        Static227.anInt5097 = 0;
    }

    @OriginalMember(owner = "com.jagex3.client.client!rc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static233.aBoolean253 = false;
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "a", descriptor = "(B)V")
	protected abstract void method921();

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (frame == null) {
			return signLink == null || signLink.applet == this ? super.getAppletContext() : signLink.applet.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static233.aBoolean253 = true;
		Static69.fullredraw = true;
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

    // com.jagex.game.runetek6.client.GameShell3.checkhost
	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "b", descriptor = "(I)Z")
	protected final boolean checkhost() {
		return true;
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "b", descriptor = "(B)V")
	public final synchronized void addcanvas() {
		if (GameCanvas.canvas != null) {
			GameCanvas.canvas.removeFocusListener(this);
			GameCanvas.canvas.getParent().remove(GameCanvas.canvas);
		}
		@Pc(19) Container local19;
		if (aFrame2 != null) {
			local19 = aFrame2;
		} else if (frame == null) {
			local19 = signLink.applet;
		} else {
			local19 = frame;
		}
		local19.setLayout(null);
		GameCanvas.canvas = new GameCanvas(this);
		local19.add(GameCanvas.canvas);
		GameCanvas.canvas.setSize(anInt1448, anInt5554);
		GameCanvas.canvas.setVisible(true);
		if (local19 == frame) {
			@Pc(66) Insets local66 = frame.getInsets();
			GameCanvas.canvas.setLocation(Client.anInt3497 + local66.left, local66.top + Client.anInt4246);
		} else {
			GameCanvas.canvas.setLocation(Client.anInt3497, Client.anInt4246);
		}
		GameCanvas.canvas.addFocusListener(this);
		GameCanvas.canvas.requestFocus();
		Static233.aBoolean253 = true;
		Static69.fullredraw = true;
		Client.focus = true;
		canvasReplaceRecommended = false;
		Static243.aLong178 = MonotonicClock.currentTime();
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static230.anApplet_Sub1_1 == this && !Static58.aBoolean101) {
			Static72.aLong74 = MonotonicClock.currentTime();
			Static231.sleepPrecise(5000L);
			Static69.aClass213_4 = null;
			this.method931(false);
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void error(@OriginalArg(0) String err) {
		if (this.alreadyerrored) {
			return;
		}
		this.alreadyerrored = true;
		System.out.println("error_game_" + err);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + err + ".ws"), "_top");
		} catch (@Pc(47) Exception ignore) {
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "c", descriptor = "(B)V")
	protected abstract void method928();

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "c", descriptor = "(I)V")
	protected abstract void onKilled();

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (frame == null) {
			return signLink == null || signLink.applet == this ? super.getDocumentBase() : signLink.applet.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static230.anApplet_Sub1_1 != this || Static58.aBoolean101) {
			return;
		}
		Static69.fullredraw = true;
		if (Static236.aBoolean256 && !GlRenderer.enabled && MonotonicClock.currentTime() - Static243.aLong178 > 1000L) {
			@Pc(29) Rectangle local29 = arg0.getClipBounds();
			if (local29 == null || local29.width >= Client.canvasWid && Client.canvasHei <= local29.height) {
				canvasReplaceRecommended = true;
			}
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "a", descriptor = "(IZ)V")
	private void method931(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static58.aBoolean101) {
				return;
			}
			Static58.aBoolean101 = true;
		}
		if (signLink.applet != null) {
			signLink.applet.destroy();
		}
		try {
			this.method928();
		} catch (@Pc(34) Exception local34) {
		}
		if (GameCanvas.canvas != null) {
			try {
				GameCanvas.canvas.removeFocusListener(this);
				GameCanvas.canvas.getParent().remove(GameCanvas.canvas);
			} catch (@Pc(45) Exception local45) {
			}
		}
		if (signLink != null) {
			try {
				signLink.method5124();
			} catch (@Pc(53) Exception local53) {
			}
		}
		this.onKilled();
		if (frame != null) {
			try {
				System.exit(0);
			} catch (@Pc(77) Throwable local77) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "b", descriptor = "(Z)V")
	private void method932() {
		@Pc(6) long local6 = MonotonicClock.currentTime();
		@Pc(10) long local10 = Static228.aLongArray8[Static261.anInt5741];
		Static228.aLongArray8[Static261.anInt5741] = local6;
		Static261.anInt5741 = Static261.anInt5741 + 1 & 0x1F;
		synchronized (this) {
			Client.focus = Static233.aBoolean253;
		}
		this.method921();
		if (local10 != 0L && local6 <= local10) {
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "e", descriptor = "(I)V")
	private void method933() {
		@Pc(2) long local2 = MonotonicClock.currentTime();
		@Pc(6) long local6 = Static7.aLongArray2[Static111.anInt2903];
		Static7.aLongArray2[Static111.anInt2903] = local2;
		Static111.anInt2903 = Static111.anInt2903 + 1 & 0x1F;
		if (local6 != 0L && local2 > local6) {
			@Pc(41) int local41 = (int) (local2 - local6);
			Static243.anInt5359 = ((local41 >> 1) + 32000) / local41;
		}
		if (Static184.anInt4355++ > 50) {
			Static69.fullredraw = true;
			Static184.anInt4355 -= 50;
			GameCanvas.canvas.setSize(anInt1448, anInt5554);
			GameCanvas.canvas.setVisible(true);
			if (frame != null && aFrame2 == null) {
				@Pc(84) Insets local84 = frame.getInsets();
				GameCanvas.canvas.setLocation(local84.left + Client.anInt3497, Client.anInt4246 + local84.top);
			} else {
				GameCanvas.canvas.setLocation(Client.anInt3497, Client.anInt4246);
			}
		}
		this.mainredraw();
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "f", descriptor = "(I)V")
	protected abstract void mainredraw();

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (frame == null) {
			return signLink == null || signLink.applet == this ? super.getCodeBase() : signLink.applet.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (SignLink.aString20 != null) {
				@Pc(12) String local12 = SignLink.aString20.toLowerCase();
				if (local12.indexOf("sun") != -1 || local12.indexOf("apple") != -1) {
					@Pc(24) String local24 = SignLink.aString14;
					if (local24.equals("1.1") || local24.startsWith("1.1.") || local24.equals("1.2") || local24.startsWith("1.2.")) {
						this.error("wrongjava");
						return;
					}
					Static226.anInt5081 = 5;
				} else if (local12.indexOf("ibm") != -1 && (SignLink.aString14 == null || SignLink.aString14.equals("1.4.2"))) {
					this.error("wrongjava");
					return;
				}
			}
			@Pc(76) int local76;
			if (SignLink.aString14 != null && SignLink.aString14.startsWith("1.")) {
				local76 = 2;
				@Pc(78) int local78 = 0;
				while (local76 < SignLink.aString14.length()) {
					@Pc(90) char local90 = SignLink.aString14.charAt(local76);
					if (local90 < '0' || local90 > '9') {
						break;
					}
					local78 = local78 * 10 + local90 - 48;
					local76++;
				}
				if (local78 >= 5) {
					Static236.aBoolean256 = true;
				}
			}
			if (signLink.applet != null) {
				@Pc(125) Method local125 = SignLink.aMethod5;
				if (local125 != null) {
					try {
						local125.invoke(signLink.applet, Boolean.TRUE);
					} catch (@Pc(142) Throwable local142) {
					}
				}
			}
			Static224.method3888();
			this.addcanvas();
			drawArea = Static131.method2579(anInt5554, anInt1448, GameCanvas.canvas);
			this.method935();
			Static200.aClass93_1 = Static70.method1547();
			while (Static72.aLong74 == 0L || Static72.aLong74 > MonotonicClock.currentTime()) {
				Static227.anInt5097 = Static200.aClass93_1.method3391(Static226.anInt5081, Static11.anInt386);
				for (local76 = 0; local76 < Static227.anInt5097; local76++) {
					this.method932();
				}
				this.method933();
				Static140.method2708(signLink, GameCanvas.canvas);
			}
		} catch (@Pc(198) Exception local198) {
			JagException.report(null, local198);
			this.error("crash");
		}
		this.method931(true);
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (frame == null) {
			return signLink == null || signLink.applet == this ? super.getParameter(arg0) : signLink.applet.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "g", descriptor = "(I)V")
	protected abstract void method935();

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static230.anApplet_Sub1_1 == this && !Static58.aBoolean101) {
			Static72.aLong74 = MonotonicClock.currentTime() + 4000L;
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "a", descriptor = "(IIZILjava/lang/String;III)V")
	protected final void method936(@OriginalArg(0) int arg0, @OriginalArg(4) String arg1) {
		try {
			anInt5554 = 768;
			Client.canvasHei = 768;
			Client.anInt3497 = 0;
			Static131.anInt3252 = 530;
			anInt1448 = 1024;
			Client.canvasWid = 1024;
			Client.anInt4246 = 0;
			Static230.anApplet_Sub1_1 = this;
			frame = new Frame();
			frame.setTitle("Jagex");
			frame.setResizable(true);
			frame.addWindowListener(this);
			frame.setVisible(true);
			frame.toFront();
			@Pc(44) Insets local44 = frame.getInsets();
			frame.setSize(local44.left + Client.canvasWid + local44.right, local44.top + Client.canvasHei + local44.bottom);
			Static69.aClass213_4 = signLink = new SignLink(null, arg0, arg1, 28);
			@Pc(76) PrivilegedRequest local76 = signLink.threadreq(1, this);
			while (local76.status == 0) {
				Static231.sleepPrecise(10L);
			}
			Client.thread = (Thread) local76.result;
		} catch (@Pc(91) Exception local91) {
			JagException.report(null, local91);
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static230.anApplet_Sub1_1 == this && !Static58.aBoolean101) {
			Static72.aLong74 = 0L;
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!rc", name = "a", descriptor = "(BIIII)V")
	protected final void startCommon(@OriginalArg(2) int arg0) {
		try {
			if (Static230.anApplet_Sub1_1 != null) {
				Static70.anInt2014++;
				if (Static70.anInt2014 >= 3) {
					this.error("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			Static230.anApplet_Sub1_1 = this;
			Client.anInt4246 = 0;
			Static131.anInt3252 = 1530;
			anInt1448 = 765;
			Client.canvasWid = 765;
			Client.anInt3497 = 0;
			anInt5554 = 503;
			Client.canvasHei = 503;
			@Pc(54) String local54 = this.getParameter("openwinjs");
			if (local54 != null && local54.equals("1")) {
				Static40.aBoolean78 = true;
			} else {
				Static40.aBoolean78 = false;
			}
			if (signLink == null) {
				Static69.aClass213_4 = signLink = new SignLink(this, arg0, null, 0);
			}
			@Pc(86) PrivilegedRequest local86 = signLink.threadreq(1, this);
			while (local86.status == 0) {
				Static231.sleepPrecise(10L);
			}
			Client.thread = (Thread) local86.result;
		} catch (@Pc(103) Exception local103) {
			JagException.report(null, local103);
			this.error("crash");
		}
	}
}
