package com.jagex3;

import com.jagex3.client.Client;
import deob.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class WorldMap {
    @OriginalMember(owner = "com.jagex3.client.client!bc", name = "W", descriptor = "I")
    public static int anInt435;
    @OriginalMember(owner = "com.jagex3.client.client!tb", name = "X", descriptor = "Lclient!se;")
    public static MapElementList aMapElementList_2;

    @OriginalMember(owner = "com.jagex3.client.client!je", name = "a", descriptor = "(IIIII)V")
    public static void method2387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
        anInt435 = Static48.anInt1449 * arg2 / arg0;
        Static28.anInt919 = Static181.anInt4296 * arg1 / arg3;
        Static142.anInt3482 = -1;
        Static217.anInt4901 = -1;
        Static38.method965();
    }

    @OriginalMember(owner = "com.jagex3.client.client!bb", name = "a", descriptor = "(I)V")
	public static void method447() {
		if (Static83.aFloat3 < Static138.aFloat14) {
			Static83.aFloat3 = (float) ((double) Static83.aFloat3 + (double) Static83.aFloat3 / 30.0D);
			if (Static138.aFloat14 < Static83.aFloat3) {
				Static83.aFloat3 = Static138.aFloat14;
			}
			Static38.method965();
		} else if (Static138.aFloat14 < Static83.aFloat3) {
			Static83.aFloat3 = (float) ((double) Static83.aFloat3 - (double) Static83.aFloat3 / 30.0D);
			if (Static138.aFloat14 > Static83.aFloat3) {
				Static83.aFloat3 = Static138.aFloat14;
			}
			Static38.method965();
		}
		if (Static142.anInt3482 == -1 || Static217.anInt4901 == -1) {
			return;
		}
		@Pc(60) int local60 = Static142.anInt3482 - anInt435;
		if (local60 < 2 || local60 > 2) {
			local60 >>= 0x4;
		}
		@Pc(78) int local78 = Static217.anInt4901 - Static28.anInt919;
		if (local78 < 2 || local78 > 2) {
			local78 >>= 0x4;
		}
		Static28.anInt919 -= -local78;
		anInt435 += local60;
		if (local60 == 0 && local78 == 0) {
			Static142.anInt3482 = -1;
			Static217.anInt4901 = -1;
		}
		Static38.method965();
	}

    @OriginalMember(owner = "com.jagex3.client.client!jb", name = "a", descriptor = "(IZ)V")
    public static void method2325(@OriginalArg(1) boolean arg0) {
        Static90.aByteArrayArrayArray8 = null;
        Static83.anIntArrayArrayArray3 = null;
        Static24.component = null;
        Static34.aByteArrayArrayArray3 = null;
        Static145.anIntArray330 = null;
        Static125.aByteArrayArrayArray10 = null;
        if (arg0 && Static269.aClass3_Sub2_Sub4_2 != null) {
            Static153.aClass100_724 = Static269.aClass3_Sub2_Sub4_2.aClass100_138;
        } else {
            Static153.aClass100_724 = null;
        }
        Static70.aByteArrayArrayArray7 = null;
        Static229.aByteArrayArrayArray12 = null;
        Static58.anIntArrayArrayArray5 = null;
        Static248.anIntArrayArrayArray17 = null;
        Static41.anInt1309 = 0;
        Static269.aClass3_Sub2_Sub4_2 = null;
        Static145.aClass69_84.method2278();
        Static203.aMapElementList_1 = null;
        Static217.anInt4901 = -1;
        Static130.aClass41_2 = null;
        Static160.aClass41_4 = null;
        Static152.aClass41_3 = null;
        Static270.aClass41_9 = null;
        Static273.aClass41_7 = null;
        Static169.aClass41_5 = null;
        Static130.aClass41_1 = null;
        Static203.aClass41_8 = null;
        Static70.aClass3_Sub2_Sub1_2 = null;
        Static142.anInt3482 = -1;
        Static153.aClass3_Sub2_Sub1_Sub1_2 = null;
    }

    @OriginalMember(owner = "com.jagex3.client.client!wa", name = "a", descriptor = "(IIIII)V")
	public static void method2225(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static41.anInt1309 < 100) {
			Static186.method3413();
		}
		if (GlRenderer.enabled) {
			Static46.method1187(arg0, arg1, arg0 + arg3, arg2 + arg1);
		} else {
			Pix2D.method2496(arg0, arg1, arg0 + arg3, arg2 + arg1);
		}
		@Pc(50) int local50;
		@Pc(61) int local61;
		if (Static41.anInt1309 < 100) {
			local50 = arg0 + arg3 / 2;
			local61 = arg2 / 2 + arg1 - 18 - 20;
			if (GlRenderer.enabled) {
				Static46.method1186(arg0, arg1, arg3, arg2, 0);
				Static46.method1179(local50 - 152, local61, 304, 34, 9179409);
				Static46.method1179(local50 - 151, local61 + 1, 302, 32, 0);
				Static46.method1186(local50 - 150, local61 + 2, Static41.anInt1309 * 3, 30, 9179409);
				Static46.method1186(local50 + Static41.anInt1309 * 3 - 150, local61 - -2, 300 - Static41.anInt1309 * 3, 30, 0);
			} else {
				Pix2D.method2495(arg0, arg1, arg3, arg2, 0);
				Pix2D.method2483(local50 - 152, local61, 304, 34, 9179409);
				Pix2D.method2483(local50 - 151, local61 + 1, 302, 32, 0);
				Pix2D.method2495(local50 - 150, local61 + 2, Static41.anInt1309 * 3, 30, 9179409);
				Pix2D.method2495(Static41.anInt1309 * 3 + local50 - 150, local61 - -2, 300 - Static41.anInt1309 * 3, 30, 0);
			}
			Static280.aClass3_Sub2_Sub9_43.method2875(LocalizedText.LOADINGDOTDOTDOT, local50, local61 + 20, 16777215, -1);
			return;
		}
		Static37.anInt1176 = (int) ((float) (arg2 * 2) / Static83.aFloat3);
		Static109.anInt2882 = anInt435 - (int) ((float) arg3 / Static83.aFloat3);
		@Pc(211) int local211 = anInt435 - (int) ((float) arg3 / Static83.aFloat3);
		local50 = Static28.anInt919 - (int) ((float) arg2 / Static83.aFloat3);
		Static109.anInt2884 = Static28.anInt919 - (int) ((float) arg2 / Static83.aFloat3);
		@Pc(236) int local236 = Static28.anInt919 + (int) ((float) arg2 / Static83.aFloat3);
		local61 = (int) ((float) arg3 / Static83.aFloat3) + anInt435;
		Static89.anInt2387 = (int) ((float) (arg3 * 2) / Static83.aFloat3);
		if (GlRenderer.enabled) {
			if (Static153.aClass3_Sub2_Sub1_Sub1_2 == null || Static153.aClass3_Sub2_Sub1_Sub1_2.anInt1867 != arg3 || Static153.aClass3_Sub2_Sub1_Sub1_2.anInt1859 != arg2) {
				Static153.aClass3_Sub2_Sub1_Sub1_2 = null;
				Static153.aClass3_Sub2_Sub1_Sub1_2 = new Pix32(arg3, arg2);
			}
			Static129.method2491(Static153.aClass3_Sub2_Sub1_Sub1_2.anIntArray20, arg3, arg2);
			Static214.method4364(arg3, 0, local61, local50, 0, local236, arg2, local211);
			Static48.method1195(arg3, 0, local61, local236, arg2, 0, local211, local50);
			Static38.method959(0, 0, local211, arg3, local236, local50, local61, arg2);
			Static46.method1178(Static153.aClass3_Sub2_Sub1_Sub1_2.anIntArray20, arg0, arg1, arg3, arg2);
			Static129.anIntArray297 = null;
		} else {
			Static214.method4364(arg3 + arg0, arg1, local61, local50, arg0, local236, arg1 + arg2, local211);
			Static48.method1195(arg0 + arg3, arg0, local61, local236, arg2 + arg1, arg1, local211, local50);
			Static38.method959(arg0, arg1, local211, arg0 + arg3, local236, local50, local61, arg2 + arg1);
		}
		if (Static201.anInt1864 > 0) {
			Static91.anInt2428--;
			if (Static91.anInt2428 == 0) {
				Static91.anInt2428 = 20;
				Static201.anInt1864--;
			}
		}
		if (!Client.displayFps) {
			return;
		}
		@Pc(405) int local405 = arg1 + arg2 - 8;
		@Pc(412) int local412 = arg0 + arg3 - 5;
		Static215.aClass3_Sub2_Sub9_32.method2864(JagString.join(new JagString[] { Static115.aClass100_579, JagString.parseInt(Static243.anInt5359) }), local412, local405, 16776960, -1);
		@Pc(434) Runtime local434 = Runtime.getRuntime();
		@Pc(443) int local443 = (int) ((local434.totalMemory() - local434.freeMemory()) / 1024L);
		@Pc(445) int local445 = 16776960;
		@Pc(446) int local446 = local405 - 15;
		if (local443 > 65536) {
			local445 = 16711680;
		}
		Static215.aClass3_Sub2_Sub9_32.method2864(JagString.join(new JagString[] { Static203.aClass100_894, JagString.parseInt(local443), Static19.aClass100_112 }), local412, local446, local445, -1);
		local405 = local446 - 15;
	}
}
