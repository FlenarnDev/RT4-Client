package com.jagex3;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import com.jagex.signlink.MonotonicClock;
import deob.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex3.client.client!ug")
public final class ClientMouseListener implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "com.jagex3.client.client!rh", name = "o", descriptor = "I")
    public static int mouseX = 0;
    @OriginalMember(owner = "com.jagex3.client.client!sc", name = "v", descriptor = "I")
    public static int mouseY = 0;
    @OriginalMember(owner = "com.jagex3.client.client!bl", name = "Q", descriptor = "I")
	public static int mouseButton = 0;
    @OriginalMember(owner = "com.jagex3.client.client!lk", name = "Z", descriptor = "I")
    public static int mouseClickButton = 0;
    @OriginalMember(owner = "com.jagex3.client.client!ah", name = "s", descriptor = "I")
    public static int mouseClickX = 0;
    @OriginalMember(owner = "com.jagex3.client.client!em", name = "y", descriptor = "I")
    public static int mouseClickY = 0;

    @OriginalMember(owner = "com.jagex3.client.client!lc", name = "a", descriptor = "(B)I")
    public static int getIdleTimer() {
        return Static93.anInt2467;
    }

    @OriginalMember(owner = "com.jagex3.client.client!sc", name = "a", descriptor = "(ILjava/awt/deob.Component;)V")
    public static void shutdown(@OriginalArg(1) Component arg0) {
        arg0.removeMouseListener(Static93.aClass150_1);
        arg0.removeMouseMotionListener(Static93.aClass150_1);
        arg0.removeFocusListener(Static93.aClass150_1);
        Static57.anInt1759 = 0;
    }

    @OriginalMember(owner = "com.jagex3.client.client!h", name = "a", descriptor = "(Ljava/awt/deob.Component;Z)V")
    public static void addListeners(@OriginalArg(0) Component arg0) {
        arg0.addMouseListener(Static93.aClass150_1);
        arg0.addMouseMotionListener(Static93.aClass150_1);
        arg0.addFocusListener(Static93.aClass150_1);
    }

    @OriginalMember(owner = "com.jagex3.client.client!ug", name = "a", descriptor = "(I)V")
    public static void method4277() {
        if (Static93.aClass150_1 != null) {
            @Pc(5) ClientMouseListener local5 = Static93.aClass150_1;
            synchronized (Static93.aClass150_1) {
                Static93.aClass150_1 = null;
            }
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!ii", name = "b", descriptor = "(I)V")
    public static void loop() {
        @Pc(2) ClientMouseListener local2 = Static93.aClass150_1;
        synchronized (Static93.aClass150_1) {
            mouseButton = Static57.anInt1759;
            mouseX = Static147.anInt3521;
            mouseY = Static165.anInt4039;
            mouseClickButton = Static41.anInt1313;
            mouseClickX = Static34.anInt1034;
            Static93.anInt2467++;
            mouseClickY = Static222.anInt4973;
            Static133.clickTime = Static209.aLong161;
            Static41.anInt1313 = 0;
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!ug", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass150_1 != null) {
			Static93.anInt2467 = 0;
			Static147.anInt3521 = arg0.getX();
			Static165.anInt4039 = arg0.getY();
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!ug", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static93.aClass150_1 != null) {
			Static57.anInt1759 = 0;
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!ug", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass150_1 != null) {
			Static93.anInt2467 = 0;
			Static147.anInt3521 = arg0.getX();
			Static165.anInt4039 = arg0.getY();
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!ug", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass150_1 != null) {
			Static93.anInt2467 = 0;
			Static57.anInt1759 = 0;
			@Pc(14) int local14 = arg0.getModifiers();
			if ((local14 & 0x10) == 0) {
			}
			if ((local14 & 0x4) == 0) {
			}
			if ((local14 & 0x8) == 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!ug", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!ug", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "com.jagex3.client.client!ug", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass150_1 != null) {
			Static93.anInt2467 = 0;
			Static34.anInt1034 = arg0.getX();
			Static222.anInt4973 = arg0.getY();
			Static209.aLong161 = MonotonicClock.currentTime();
			if ((arg0.getModifiersEx() & MouseEvent.BUTTON3_DOWN_MASK) == 0) {
				Static41.anInt1313 = 1;
				Static57.anInt1759 = 1;
			} else {
				Static41.anInt1313 = 2;
				Static57.anInt1759 = 2;
			}
			@Pc(29) int local29 = arg0.getModifiers();
			if ((local29 & 0x10) == 0) {
			}
			if ((local29 & 0x4) != 0) {
			}
			if ((local29 & 0x8) != 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!ug", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass150_1 != null) {
			Static93.anInt2467 = 0;
			Static147.anInt3521 = -1;
			Static165.anInt4039 = -1;
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!ug", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass150_1 != null) {
			Static93.anInt2467 = 0;
			Static147.anInt3521 = arg0.getX();
			Static165.anInt4039 = arg0.getY();
		}
	}
}
