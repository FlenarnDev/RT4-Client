package com.jagex.runetek4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static152 {

	@OriginalMember(owner = "runetek4.client!ma", name = "q", descriptor = "Lclient!fd;")
	public static WorldMapFont aClass41_3;

	@OriginalMember(owner = "runetek4.client!ma", name = "a", descriptor = "(IIBIIII)V")
	public static void method2826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 - arg3 >= Static172.anInt4164 && FloorUnderlayTypeList.anInt5063 >= arg4 + arg3 && Static267.anInt5773 <= arg1 - arg3 && Static106.anInt2869 >= arg3 + arg1) {
			Static8.method120(arg5, arg0, arg1, arg2, arg3, arg4);
		} else {
			Static280.method4670(arg2, arg1, arg3, arg5, arg0, arg4);
		}
	}

}
