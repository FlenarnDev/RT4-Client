package com.jagex.runetek4;

import com.jagex.runetek4.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "runetek4.client!ej", name = "X", descriptor = "I")
	public static int anInt1815;

	@OriginalMember(owner = "runetek4.client!ej", name = "bb", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "runetek4.client!ej", name = "U", descriptor = "I")
	public static int anInt1812 = 0;

	@OriginalMember(owner = "runetek4.client!ej", name = "W", descriptor = "I")
	public static int minimapAnticheatAngle = 0;

	@OriginalMember(owner = "runetek4.client!ej", name = "h", descriptor = "(I)V")
	public static void method1372() {
		if (Static162.anInt3953 == 2) {
			if (Static155.anInt3751 == Static277.anInt5850 && Static60.anInt1892 == Static280.anInt5895) {
				Static162.anInt3953 = 0;
				if (Static172.shiftClick && Static187.pressedKeys[81] && PreciseSleep.anInt5204 > 2) {
					Static103.method2232(PreciseSleep.anInt5204 - 2);
				} else {
					Static103.method2232(PreciseSleep.anInt5204 - 1);
				}
			}
		} else if (Static155.anInt3751 == Static7.mouseClickX && Static60.anInt1892 == Static60.mouseClickY) {
			Static162.anInt3953 = 0;
			if (Static172.shiftClick && Static187.pressedKeys[81] && PreciseSleep.anInt5204 > 2) {
				Static103.method2232(PreciseSleep.anInt5204 - 2);
			} else {
				Static103.method2232(PreciseSleep.anInt5204 - 1);
			}
		} else {
			Static280.anInt5895 = Static60.mouseClickY;
			Static162.anInt3953 = 2;
			Static277.anInt5850 = Static7.mouseClickX;
		}
	}

	@OriginalMember(owner = "runetek4.client!ej", name = "i", descriptor = "(I)V")
	public static void method1373() {
		Static6.outboundBuffer.pIsaac1(243);
		Static6.outboundBuffer.p1b(Static144.method2736());
		Static6.outboundBuffer.p2(Static48.canvasWidth);
		Static6.outboundBuffer.p2(Static254.canvasHeigth);
		Static6.outboundBuffer.p1b(Static186.antialiasingMode);
	}

	@OriginalMember(owner = "runetek4.client!ej", name = "a", descriptor = "(Lclient!ve;ILclient!ve;Lclient!of;)V")
	public static void method1374(@OriginalArg(0) Js5 arg0, @OriginalArg(2) Js5 arg1, @OriginalArg(3) QuickChatCommandDecoder arg2) {
		Static262.configClientLarge = arg0;
		Static107.anInterface3_1 = arg2;
		Static238.configClientSmall = arg1;
		if (Static238.configClientSmall != null) {
			Static144.anInt3490 = Static238.configClientSmall.method4504(1);
		}
		if (Static262.configClientLarge != null) {
			Static34.anInt1047 = Static262.configClientLarge.method4504(1);
		}
	}

	@OriginalMember(owner = "runetek4.client!ej", name = "a", descriptor = "(IZIJ)Lclient!na;")
	public static JagString method1376(@OriginalArg(3) long arg0) {
		@Pc(35) long local35 = arg0 / (long) 10;
		@Pc(37) int local37 = 1;
		while (local35 != 0L) {
			local37++;
			local35 /= 10;
		}
		@Pc(51) int local51 = local37;
		if (arg0 < 0L) {
			local51 = local37 + 1;
		}
		@Pc(61) byte[] local61 = new byte[local51];
		if (arg0 < 0L) {
			local61[0] = 45;
		}
		for (@Pc(79) int local79 = 0; local79 < local37; local79++) {
			@Pc(92) int local92 = (int) (arg0 % (long) 10);
			arg0 /= 10;
			if (local92 < 0) {
				local92 = -local92;
			}
			if (local92 > 9) {
				local92 += 39;
			}
			local61[local51 - local79 - 1] = (byte) (local92 + 48);
		}
		@Pc(126) JagString local126 = new JagString();
		local126.aByteArray52 = local61;
		local126.anInt4030 = local51;
		return local126;
	}
}
