package com.jagex.runetek4;

import com.jagex.runetek4.game.shared.framework.gwc.GWCWorld;
import com.jagex.runetek4.util.ArrayUtils;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "runetek4.client!wb", name = "l", descriptor = "Lclient!fd;")
	public static WorldMapFont aClass41_9;

	@OriginalMember(owner = "runetek4.client!wb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg4 - arg6;
		@Pc(20) int local20 = arg4 * arg4;
		@Pc(25) int local25 = arg5 - arg6;
		@Pc(29) int local29 = arg5 * arg5;
		@Pc(33) int local33 = local25 * local25;
		@Pc(37) int local37 = local29 << 1;
		@Pc(41) int local41 = local20 << 1;
		@Pc(45) int local45 = local33 << 1;
		@Pc(49) int local49 = local16 * local16;
		@Pc(53) int local53 = local49 << 1;
		@Pc(57) int local57 = arg5 << 1;
		@Pc(61) int local61 = local25 << 1;
		@Pc(70) int local70 = local29 - (local57 - 1) * local41;
		@Pc(80) int local80 = local49 * (1 - local61) + local45;
		@Pc(89) int local89 = (1 - local57) * local20 + local37;
		@Pc(93) int local93 = local20 << 2;
		@Pc(102) int local102 = local33 - local53 * (local61 - 1);
		@Pc(106) int local106 = local49 << 2;
		@Pc(110) int local110 = local29 << 2;
		@Pc(114) int local114 = local33 << 2;
		@Pc(120) int local120 = (local57 - 3) * local41;
		@Pc(124) int local124 = local37 * 3;
		@Pc(130) int local130 = (local61 - 3) * local53;
		@Pc(134) int local134 = local45 * 3;
		@Pc(136) int local136 = local110;
		@Pc(138) int local138 = local114;
		@Pc(144) int local144 = (local25 - 1) * local106;
		@Pc(162) int local162 = (arg5 - 1) * local93;
		@Pc(166) int[] local166 = ObjTypeList.anIntArrayArray10[arg2];
		ArrayUtils.fillRange(local166, arg1 - arg4, -local16 + arg1, arg3);
		ArrayUtils.fillRange(local166, arg1 - local16, arg1 - -local16, arg0);
		ArrayUtils.fillRange(local166, arg1 + local16, arg4 + arg1, arg3);
		while (local9 > 0) {
			if (local89 < 0) {
				while (local89 < 0) {
					local70 += local136;
					local89 += local124;
					local7++;
					local136 += local110;
					local124 += local110;
				}
			}
			if (local70 < 0) {
				local89 += local124;
				local7++;
				local124 += local110;
				local70 += local136;
				local136 += local110;
			}
			@Pc(258) boolean local258 = local9 <= local25;
			if (local258) {
				if (local80 < 0) {
					while (local80 < 0) {
						local80 += local134;
						local134 += local114;
						local11++;
						local102 += local138;
						local138 += local114;
					}
				}
				if (local102 < 0) {
					local80 += local134;
					local11++;
					local134 += local114;
					local102 += local138;
					local138 += local114;
				}
				local102 += -local130;
				local130 -= local106;
				local80 += -local144;
				local144 -= local106;
			}
			local89 += -local162;
			local70 += -local120;
			local120 -= local93;
			local9--;
			@Pc(348) int local348 = arg2 - local9;
			@Pc(352) int local352 = local7 + arg1;
			local162 -= local93;
			@Pc(360) int local360 = local9 + arg2;
			@Pc(365) int local365 = arg1 - local7;
			if (local258) {
				@Pc(371) int local371 = arg1 + local11;
				@Pc(376) int local376 = arg1 - local11;
				ArrayUtils.fillRange(ObjTypeList.anIntArrayArray10[local348], local365, local376, arg3);
				ArrayUtils.fillRange(ObjTypeList.anIntArrayArray10[local348], local376, local371, arg0);
				ArrayUtils.fillRange(ObjTypeList.anIntArrayArray10[local348], local371, local352, arg3);
				ArrayUtils.fillRange(ObjTypeList.anIntArrayArray10[local360], local365, local376, arg3);
				ArrayUtils.fillRange(ObjTypeList.anIntArrayArray10[local360], local376, local371, arg0);
				ArrayUtils.fillRange(ObjTypeList.anIntArrayArray10[local360], local371, local352, arg3);
			} else {
				ArrayUtils.fillRange(ObjTypeList.anIntArrayArray10[local348], local365, local352, arg3);
				ArrayUtils.fillRange(ObjTypeList.anIntArrayArray10[local360], local365, local352, arg3);
			}
		}
	}

	@OriginalMember(owner = "runetek4.client!wb", name = "a", descriptor = "(Lclient!ba;IILclient!ba;Z)I")
	public static int method4595(@OriginalArg(0) GWCWorld arg0, @OriginalArg(1) int arg1, @OriginalArg(3) GWCWorld arg2, @OriginalArg(4) boolean arg3) {
		if (arg1 == 1) {
			@Pc(11) int local11 = arg0.players;
			@Pc(14) int local14 = arg2.players;
			if (!arg3) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local11 == -1) {
					local11 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg1 == 2) {
			return arg0.getGWCLocation().name.compare(arg2.getGWCLocation().name);
		} else if (arg1 == 3) {
			if (arg0.activity.strEquals(Static111.aClass100_570)) {
				if (arg2.activity.strEquals(Static111.aClass100_570)) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.activity.strEquals(Static111.aClass100_570)) {
				return arg3 ? 1 : -1;
			} else {
				return arg0.activity.compare(arg2.activity);
			}
		} else if (arg1 == 4) {
			return arg0.isLootShare() ? (arg2.isLootShare() ? 0 : 1) : arg2.isLootShare() ? -1 : 0;
		} else if (arg1 == 5) {
			return arg0.isQuickChat() ? (arg2.isQuickChat() ? 0 : 1) : (arg2.isQuickChat() ? -1 : 0);
		} else if (arg1 == 6) {
			return arg0.isPvp() ? (arg2.isPvp() ? 0 : 1) : (arg2.isPvp() ? -1 : 0);
		} else if (arg1 == 7) {
			return arg0.isMembers() ? (arg2.isMembers() ? 0 : 1) : (arg2.isMembers() ? -1 : 0);
		} else {
			return arg0.id - arg2.id;
		}
	}
}
