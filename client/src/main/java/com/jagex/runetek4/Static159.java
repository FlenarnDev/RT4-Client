package com.jagex.runetek4;

import com.jagex.runetek4.cache.media.SeqType;
import com.jagex.runetek4.dash3d.entity.Npc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "runetek4.client!mi", name = "W", descriptor = "[Z")
	public static boolean[] aBooleanArray87;

	@OriginalMember(owner = "runetek4.client!mi", name = "U", descriptor = "[J")
	public static final long[] aLongArray5 = new long[500];

	@OriginalMember(owner = "runetek4.client!mi", name = "ab", descriptor = "Z")
	public static boolean aBoolean189 = true;

	@OriginalMember(owner = "runetek4.client!mi", name = "a", descriptor = "([IBLclient!km;[I[I)V")
	public static void method3037(@OriginalArg(0) int[] arg0, @OriginalArg(2) Npc arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
			@Pc(15) int local15 = arg3[local3];
			@Pc(19) int local19 = arg0[local3];
			@Pc(23) int local23 = arg2[local3];
			for (@Pc(25) int local25 = 0; local19 != 0 && arg1.aClass147Array3.length > local25; local25++) {
				if ((local19 & 0x1) != 0) {
					if (local15 == -1) {
						arg1.aClass147Array3[local25] = null;
					} else {
						@Pc(60) SeqType local60 = SeqTypeList.getAnimationSequence(local15);
						@Pc(65) Class147 local65 = arg1.aClass147Array3[local25];
						@Pc(68) int local68 = local60.anInt5347;
						if (local65 != null) {
							if (local15 == local65.anInt5396) {
								if (local68 == 0) {
									local65 = arg1.aClass147Array3[local25] = null;
								} else if (local68 == 1) {
									local65.anInt5399 = 0;
									local65.anInt5400 = 0;
									local65.anInt5398 = 1;
									local65.anInt5404 = 0;
									local65.anInt5408 = local23;
									Static152.method2836(arg1.zFine, local60, arg1.xFine, false, 0);
								} else if (local68 == 2) {
									local65.anInt5400 = 0;
								}
							} else if (local60.priority >= SeqTypeList.getAnimationSequence(local65.anInt5396).priority) {
								local65 = arg1.aClass147Array3[local25] = null;
							}
						}
						if (local65 == null) {
							local65 = arg1.aClass147Array3[local25] = new Class147();
							local65.anInt5398 = 1;
							local65.anInt5404 = 0;
							local65.anInt5408 = local23;
							local65.anInt5396 = local15;
							local65.anInt5400 = 0;
							local65.anInt5399 = 0;
							Static152.method2836(arg1.zFine, local60, arg1.xFine, false, 0);
						}
					}
				}
				local19 >>>= 0x1;
			}
		}
	}
}
