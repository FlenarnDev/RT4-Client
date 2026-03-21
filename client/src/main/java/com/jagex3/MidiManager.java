package com.jagex3;

import deob.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class MidiManager {
    @OriginalMember(owner = "com.jagex3.client.client!ce", name = "a", descriptor = "(II)V")
    public static void method801() {
        Static253.anInt5527 = 0;
        Static226.anInt5085 = -1;
        Static14.anInt441 = 1;
        Static57.anInt1757 = 2;
        Static72.aBoolean116 = false;
        Static172.aClass153_70 = null;
        Static277.anInt5853 = -1;
    }

    @OriginalMember(owner = "com.jagex3.client.client!kk", name = "a", descriptor = "(I)Z")
    public static boolean isInitialised() {
        return Static14.anInt441 == 0 ? Static172.aClass3_Sub3_Sub4_2.method4414() : true;
    }

    @OriginalMember(owner = "com.jagex3.client.client!jh", name = "a", descriptor = "(Lclient!ve;ZIIZI)V")
	public static void play(@OriginalArg(0) Js5 arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		Static172.aClass153_70 = arg0;
		Static14.anInt441 = 1;
		Static253.anInt5527 = arg2;
		Static226.anInt5085 = 0;
		Static277.anInt5853 = arg1;
		Static72.aBoolean116 = false;
		Static57.anInt1757 = 10000;
	}

    @OriginalMember(owner = "com.jagex3.client.client!v", name = "a", descriptor = "(ZIILclient!ve;ZII)V")
    public static void method526(@OriginalArg(1) int arg0, @OriginalArg(3) Js5 arg1, @OriginalArg(5) int arg2) {
        Static172.aClass153_70 = arg1;
        Static226.anInt5085 = 0;
        Static277.anInt5853 = arg0;
        Static72.aBoolean116 = false;
        Static14.anInt441 = 1;
        Static57.anInt1757 = 2;
        Static253.anInt5527 = arg2;
    }

    @OriginalMember(owner = "com.jagex3.client.client!km", name = "c", descriptor = "(Z)Z")
	public static boolean updateLoading() {
		try {
			if (Static14.anInt441 == 2) {
				if (Static144.aClass3_Sub29_1 == null) {
					Static144.aClass3_Sub29_1 = Static291.method3742(Static172.aClass153_70, Static277.anInt5853, Static226.anInt5085);
					if (Static144.aClass3_Sub29_1 == null) {
						return false;
					}
				}
				if (Static27.aClass89_1 == null) {
					Static27.aClass89_1 = new WaveCache(Static78.aClass153_32, Static252.aClass153_103);
				}
				if (Static172.aClass3_Sub3_Sub4_2.method4411(Static144.aClass3_Sub29_1, Static210.aClass153_87, Static27.aClass89_1)) {
					Static172.aClass3_Sub3_Sub4_2.method4412();
					Static172.aClass3_Sub3_Sub4_2.method4447(Static253.anInt5527);
					Static172.aClass3_Sub3_Sub4_2.method4431(Static72.aBoolean116, Static144.aClass3_Sub29_1);
					Static14.anInt441 = 0;
					Static144.aClass3_Sub29_1 = null;
					Static27.aClass89_1 = null;
					Static172.aClass153_70 = null;
					return true;
				}
			}
		} catch (@Pc(68) Exception local68) {
			local68.printStackTrace();
			Static172.aClass3_Sub3_Sub4_2.method4446();
			Static172.aClass153_70 = null;
			Static144.aClass3_Sub29_1 = null;
			Static14.anInt441 = 0;
			Static27.aClass89_1 = null;
		}
		return false;
	}

    @OriginalMember(owner = "com.jagex3.client.client!sj", name = "a", descriptor = "(Z)V")
    public static void updateFadeOut() {
        try {
            if (Static14.anInt441 == 1) {
                @Pc(16) int local16 = Static172.aClass3_Sub3_Sub4_2.method4440();
                if (local16 > 0 && Static172.aClass3_Sub3_Sub4_2.method4414()) {
                    local16 -= Static57.anInt1757;
                    if (local16 < 0) {
                        local16 = 0;
                    }
                    Static172.aClass3_Sub3_Sub4_2.method4447(local16);
                    return;
                }
                Static172.aClass3_Sub3_Sub4_2.method4446();
                Static172.aClass3_Sub3_Sub4_2.method4426();
                Static144.aClass3_Sub29_1 = null;
                Static27.aClass89_1 = null;
                if (Static172.aClass153_70 == null) {
                    Static14.anInt441 = 0;
                } else {
                    Static14.anInt441 = 2;
                }
            }
        } catch (@Pc(62) Exception local62) {
            local62.printStackTrace();
            Static172.aClass3_Sub3_Sub4_2.method4446();
            Static172.aClass153_70 = null;
            Static144.aClass3_Sub29_1 = null;
            Static14.anInt441 = 0;
            Static27.aClass89_1 = null;
        }
    }
}
