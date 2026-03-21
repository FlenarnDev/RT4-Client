package com.jagex3;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;

import com.jagex.signlink.SignLink;
import deob.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex3.client.client!uf")
public final class ClientKeyboardListener implements KeyListener, FocusListener {

    @OriginalMember(owner = "com.jagex3.client.client!pb", name = "q", descriptor = "[Z")
    public static final boolean[] keyHeld = new boolean[112];
    @OriginalMember(owner = "com.jagex3.client.client!hn", name = "Z", descriptor = "I")
    public static int code;
    @OriginalMember(owner = "com.jagex3.client.client!pi", name = "Y", descriptor = "I")
    public static int ch;

    @OriginalMember(owner = "com.jagex3.client.client!c", name = "d", descriptor = "(I)Z")
    public static boolean pollKey() {
        @Pc(6) ClientKeyboardListener local6 = Static10.aClass149_1;
        synchronized (Static10.aClass149_1) {
            if (Static228.anInt5105 == Static102.anInt2678) {
                return false;
            } else {
                code = Static221.anIntArray375[Static102.anInt2678];
                ch = Static264.anIntArray413[Static102.anInt2678];
                Static102.anInt2678 = Static102.anInt2678 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!ch", name = "a", descriptor = "(Ljava/awt/deob.Component;I)V")
	public static void shutdown(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static10.aClass149_1);
		arg0.removeFocusListener(Static10.aClass149_1);
		Static114.anInt5844 = -1;
	}

    @OriginalMember(owner = "com.jagex3.client.client!bi", name = "a", descriptor = "(BLjava/awt/deob.Component;)V")
    public static void addListeners(@OriginalArg(1) Component arg0) {
        @Pc(10) Method local10 = SignLink.aMethod6;
        if (local10 != null) {
            try {
                local10.invoke(arg0, Boolean.FALSE);
            } catch (@Pc(25) Throwable local25) {
            }
        }
        arg0.addKeyListener(Static10.aClass149_1);
        arg0.addFocusListener(Static10.aClass149_1);
    }

    @OriginalMember(owner = "com.jagex3.client.client!ag", name = "h", descriptor = "(I)V")
    public static void method82() {
        if (Static10.aClass149_1 != null) {
            @Pc(4) ClientKeyboardListener local4 = Static10.aClass149_1;
            synchronized (Static10.aClass149_1) {
                Static10.aClass149_1 = null;
            }
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!mf", name = "e", descriptor = "(I)V")
	public static void setupKeyCodeMap() {
		if (SignLink.aString20.toLowerCase().indexOf("microsoft") != -1) {
			Static196.anIntArray407[187] = 27;
			Static196.anIntArray407[223] = 28;
			Static196.anIntArray407[221] = 43;
			Static196.anIntArray407[188] = 71;
			Static196.anIntArray407[222] = 59;
			Static196.anIntArray407[192] = 58;
			Static196.anIntArray407[191] = 73;
			Static196.anIntArray407[219] = 42;
			Static196.anIntArray407[190] = 72;
			Static196.anIntArray407[186] = 57;
			Static196.anIntArray407[220] = 74;
			Static196.anIntArray407[189] = 26;
			return;
		}
		if (SignLink.aMethod6 == null) {
			Static196.anIntArray407[192] = 58;
			Static196.anIntArray407[222] = 59;
		} else {
			Static196.anIntArray407[222] = 58;
			Static196.anIntArray407[192] = 28;
			Static196.anIntArray407[520] = 59;
		}
		Static196.anIntArray407[45] = 26;
		Static196.anIntArray407[61] = 27;
		Static196.anIntArray407[91] = 42;
		Static196.anIntArray407[59] = 57;
		Static196.anIntArray407[93] = 43;
		Static196.anIntArray407[44] = 71;
		Static196.anIntArray407[92] = 74;
		Static196.anIntArray407[46] = 72;
		Static196.anIntArray407[47] = 73;
	}

    @OriginalMember(owner = "com.jagex3.client.client!fc", name = "b", descriptor = "(I)V")
	public static void loop() {
		@Pc(12) ClientKeyboardListener local12 = Static10.aClass149_1;
		synchronized (Static10.aClass149_1) {
			Static102.anInt2678 = Static228.anInt5105;
			Static229.anInt5140++;
			@Pc(23) int local23;
			if (Static114.anInt5844 < 0) {
				for (local23 = 0; local23 < 112; local23++) {
					keyHeld[local23] = false;
				}
				Static114.anInt5844 = Static227.anInt5087;
			} else {
				while (Static114.anInt5844 != Static227.anInt5087) {
					local23 = Static17.anIntArray53[Static227.anInt5087];
					Static227.anInt5087 = Static227.anInt5087 + 1 & 0x7F;
					if (local23 >= 0) {
						keyHeld[local23] = true;
					} else {
						keyHeld[~local23] = false;
					}
				}
			}
			Static228.anInt5105 = Static53.anInt1708;
		}
	}

    @OriginalMember(owner = "com.jagex3.client.client!uf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static10.aClass149_1 == null) {
			return;
		}
		Static229.anInt5140 = 0;
		@Pc(7) int local7 = arg0.getKeyCode();
		if (local7 >= 0 && Static196.anIntArray407.length > local7) {
			local7 = Static196.anIntArray407[local7];
			if ((local7 & 0x80) != 0) {
				local7 = -1;
			}
		} else {
			local7 = -1;
		}
		if (Static114.anInt5844 >= 0 && local7 >= 0) {
			Static17.anIntArray53[Static114.anInt5844] = local7;
			Static114.anInt5844 = Static114.anInt5844 + 1 & 0x7F;
			if (Static114.anInt5844 == Static227.anInt5087) {
				Static114.anInt5844 = -1;
			}
		}
		@Pc(68) int local68;
		if (local7 >= 0) {
			local68 = Static53.anInt1708 + 1 & 0x7F;
			if (local68 != Static102.anInt2678) {
				Static221.anIntArray375[Static53.anInt1708] = local7;
				Static264.anIntArray413[Static53.anInt1708] = -1;
				Static53.anInt1708 = local68;
			}
		}
		local68 = arg0.getModifiers();
		if ((local68 & 0xA) != 0 || local7 == 85 || local7 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!uf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static10.aClass149_1 != null) {
			@Pc(9) int local9 = Static136.method2650(arg0);
			if (local9 >= 0) {
				@Pc(21) int local21 = Static53.anInt1708 + 1 & 0x7F;
				if (Static102.anInt2678 != local21) {
					Static221.anIntArray375[Static53.anInt1708] = -1;
					Static264.anIntArray413[Static53.anInt1708] = local9;
					Static53.anInt1708 = local21;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "com.jagex3.client.client!uf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static10.aClass149_1 != null) {
			Static114.anInt5844 = -1;
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!uf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static10.aClass149_1 != null) {
			Static229.anInt5140 = 0;
			@Pc(11) int local11 = arg0.getKeyCode();
			if (local11 >= 0 && Static196.anIntArray407.length > local11) {
				local11 = Static196.anIntArray407[local11] & 0xFFFFFF7F;
			} else {
				local11 = -1;
			}
			if (Static114.anInt5844 >= 0 && local11 >= 0) {
				Static17.anIntArray53[Static114.anInt5844] = ~local11;
				Static114.anInt5844 = Static114.anInt5844 + 1 & 0x7F;
				if (Static227.anInt5087 == Static114.anInt5844) {
					Static114.anInt5844 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "com.jagex3.client.client!uf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
