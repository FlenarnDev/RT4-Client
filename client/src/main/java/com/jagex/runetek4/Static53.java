package com.jagex.runetek4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Lclient!gn;")
	public static final LruHashTable aClass54_5 = new LruHashTable(16);

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "[[I")
	public static final int[][] anIntArrayArray8 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

	@OriginalMember(owner = "runetek4.client!ec", name = "a", descriptor = "([[IZILclient!hg;[IIIIZ[[FZI[[FIIIZ[[I[[FBI[Z)V")
	public static void method1291(@OriginalArg(0) int[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) GlTile arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) float[][] arg9, @OriginalArg(10) boolean arg10, @OriginalArg(12) float[][] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) boolean arg15, @OriginalArg(17) int[][] arg16, @OriginalArg(18) float[][] arg17, @OriginalArg(19) byte arg18, @OriginalArg(20) int arg19, @OriginalArg(21) boolean[] arg20) {
		@Pc(11) int local11 = (arg2 << 8) + (arg1 ? 255 : 0);
		@Pc(25) int local25 = (arg8 ? 255 : 0) + (arg14 << 8);
		@Pc(31) int[] local31 = new int[arg4.length / 2];
		@Pc(41) int local41 = (arg10 ? 255 : 0) + (arg13 << 8);
		@Pc(51) int local51 = (arg19 << 8) + (arg15 ? 255 : 0);
		for (@Pc(53) int local53 = 0; local53 < local31.length; local53++) {
			@Pc(67) int local67 = arg4[local53 + local53];
			@Pc(80) int[][] local80 = arg0 == null || arg20 == null || !arg20[local53] ? arg16 : arg0;
			@Pc(88) int local88 = arg4[local53 + local53 + 1];
			local31[local53] = Static207.method3683(local41, (float) arg12, local11, local51, arg0, local80, arg7, arg17, local25, arg18, false, arg3, arg9, arg5, local67, arg11, local88);
		}
		arg3.method1945(arg6, arg7, arg5, local31, null, false);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	public static void clear() {
		Static125.varbitDefinitionCache.clean();
	}
}
