package com.jagex.runetek4;

import com.jagex.runetek4.cache.def.VarbitType;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "runetek4.client!wd", name = "a", descriptor = "(BII)V")
	public static void method3995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) VarbitType local14 = VarBitTypeList.get(arg1);
		@Pc(17) int local17 = local14.baseVar;
		@Pc(20) int local20 = local14.endBit;
		@Pc(23) int local23 = local14.startBit;
		@Pc(29) int local29 = VarpDomain.varbitMasks[local20 - local23];
		if (arg0 < 0 || local29 < arg0) {
			arg0 = 0;
		}
		local29 <<= local23;
		VarpDomain.set(arg0 << local23 & local29 | ~local29 & VarpDomain.varp[local17], local17);
	}
}
