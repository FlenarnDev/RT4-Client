package com.jagex.runetek4;

import com.jagex.runetek4.cache.media.component.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bn", name = "N", descriptor = "Lclient!be;")
	public static Component component;

	@OriginalMember(owner = "client!bn", name = "O", descriptor = "I")
	public static int anInt761;

	@OriginalMember(owner = "client!bn", name = "eb", descriptor = "I")
	public static int anInt773 = 0;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)I")
	public static int method667(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = 0;
		while (arg0 > 0) {
			local8 = local8 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local8;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIB)I")
	public static int method670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(47) int local47 = Static138.method2695(arg0 - 1, arg1 + -1) + Static138.method2695(arg0 + 1, arg1 + -1) + Static138.method2695(arg0 + -1, arg1 - -1) + Static138.method2695(arg0 + 1, arg1 - -1);
		@Pc(76) int local76 = Static138.method2695(arg0 - 1, arg1) + Static138.method2695(arg0 + 1, arg1) + Static138.method2695(arg0, arg1 + -1) + Static138.method2695(arg0, arg1 + 1);
		@Pc(81) int local81 = Static138.method2695(arg0, arg1);
		return local76 / 8 + local47 / 16 + local81 / 4;
	}

}
