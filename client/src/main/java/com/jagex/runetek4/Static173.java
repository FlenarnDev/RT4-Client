package com.jagex.runetek4;

import com.jagex.runetek4.audio.SynthSound;
import com.jagex.runetek4.cache.media.SoftwareSprite;
import com.jagex.runetek4.util.ArrayUtils;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "runetek4.client!nk", name = "L", descriptor = "[Lclient!mm;")
	public static SoftwareSprite[] aClass3_Sub2_Sub1_Sub1Array9;

	@OriginalMember(owner = "runetek4.client!nk", name = "n", descriptor = "[Lclient!sl;")
	public static final SynthSound[] aClass138Array1 = new SynthSound[50];

	@OriginalMember(owner = "runetek4.client!nk", name = "a", descriptor = "(IIIIIB)V")
	public static void method3246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 > Static106.anInt2869 || arg2 < Static267.anInt5773) {
			return;
		}
		@Pc(24) boolean local24;
		if (Static172.anInt4164 > arg1) {
			local24 = false;
			arg1 = Static172.anInt4164;
		} else if (FloorUnderlayTypeList.anInt5063 >= arg1) {
			local24 = true;
		} else {
			local24 = false;
			arg1 = FloorUnderlayTypeList.anInt5063;
		}
		@Pc(43) boolean local43;
		if (arg3 < Static172.anInt4164) {
			arg3 = Static172.anInt4164;
			local43 = false;
		} else if (arg3 > FloorUnderlayTypeList.anInt5063) {
			arg3 = FloorUnderlayTypeList.anInt5063;
			local43 = false;
		} else {
			local43 = true;
		}
		if (Static267.anInt5773 > arg4) {
			arg4 = Static267.anInt5773;
		} else {
			ArrayUtils.fillRange(ObjTypeList.anIntArrayArray10[arg4++], arg1, arg3, arg0);
		}
		if (arg2 <= Static106.anInt2869) {
			ArrayUtils.fillRange(ObjTypeList.anIntArrayArray10[arg2--], arg1, arg3, arg0);
		} else {
			arg2 = Static106.anInt2869;
		}
		@Pc(98) int local98;
		if (local24 && local43) {
			for (local98 = arg4; local98 <= arg2; local98++) {
				@Pc(105) int[] local105 = ObjTypeList.anIntArrayArray10[local98];
				local105[arg1] = local105[arg3] = arg0;
			}
		} else if (local24) {
			for (local98 = arg4; local98 <= arg2; local98++) {
				ObjTypeList.anIntArrayArray10[local98][arg1] = arg0;
			}
		} else if (local43) {
			for (local98 = arg4; local98 <= arg2; local98++) {
				ObjTypeList.anIntArrayArray10[local98][arg3] = arg0;
			}
		}
	}
}
