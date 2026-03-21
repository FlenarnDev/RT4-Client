package com.jagex3;

import deob.Static129;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Pix2D {
    @OriginalMember(owner = "com.jagex3.client.client!kb", name = "d", descriptor = "I")
    public static int anInt3147 = 0;
    @OriginalMember(owner = "com.jagex3.client.client!kb", name = "h", descriptor = "I")
    public static int anInt3149 = 0;

    @OriginalMember(owner = "com.jagex3.client.client!kb", name = "c", descriptor = "(IIII)V")
    public static void method2496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Static129.anInt3144) {
            arg2 = Static129.anInt3144;
        }
        if (arg3 > Static129.anInt3146) {
            arg3 = Static129.anInt3146;
        }
        Static129.anInt3145 = arg0;
        anInt3147 = arg1;
        Static129.anInt3148 = arg2;
        anInt3149 = arg3;
        method2482();
    }

    @OriginalMember(owner = "com.jagex3.client.client!kb", name = "c", descriptor = "(IIIII)V")
    public static void method2495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
        if (arg0 < Static129.anInt3145) {
            arg2 -= Static129.anInt3145 - arg0;
            arg0 = Static129.anInt3145;
        }
        if (arg1 < anInt3147) {
            arg3 -= anInt3147 - arg1;
            arg1 = anInt3147;
        }
        if (arg0 + arg2 > Static129.anInt3148) {
            arg2 = Static129.anInt3148 - arg0;
        }
        if (arg1 + arg3 > anInt3149) {
            arg3 = anInt3149 - arg1;
        }
        @Pc(43) int local43 = Static129.anInt3144 - arg2;
        @Pc(49) int local49 = arg0 + arg1 * Static129.anInt3144;
        for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
            for (@Pc(57) int local57 = -arg2; local57 < 0; local57++) {
                Static129.anIntArray297[local49++] = arg4;
            }
            local49 += local43;
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!kb", name = "a", descriptor = "(IIIII)V")
    public static void method2483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
        Static129.method2489(arg0, arg1, arg2, arg4);
        Static129.method2489(arg0, arg1 + arg3 - 1, arg2, arg4);
        Static129.method2490(arg0, arg1, arg3, arg4);
        Static129.method2490(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "com.jagex3.client.client!kb", name = "a", descriptor = "(IIIIII)V")
	public static void method2484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < Static129.anInt3145) {
			arg2 -= Static129.anInt3145 - arg0;
			arg0 = Static129.anInt3145;
		}
		if (arg1 < anInt3147) {
			arg3 -= anInt3147 - arg1;
			arg1 = anInt3147;
		}
		if (arg0 + arg2 > Static129.anInt3148) {
			arg2 = Static129.anInt3148 - arg0;
		}
		if (arg1 + arg3 > anInt3149) {
			arg3 = anInt3149 - arg1;
		}
		@Pc(59) int local59 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
		@Pc(63) int local63 = 256 - arg5;
		@Pc(67) int local67 = Static129.anInt3144 - arg2;
		@Pc(73) int local73 = arg0 + arg1 * Static129.anInt3144;
		for (@Pc(75) int local75 = 0; local75 < arg3; local75++) {
			for (@Pc(81) int local81 = -arg2; local81 < 0; local81++) {
				@Pc(87) int local87 = Static129.anIntArray297[local73];
				@Pc(107) int local107 = ((local87 & 0xFF00FF) * local63 >> 8 & 0xFF00FF) + ((local87 & 0xFF00) * local63 >> 8 & 0xFF00);
				Static129.anIntArray297[local73++] = local59 + local107;
			}
			local73 += local67;
		}
	}

    @OriginalMember(owner = "com.jagex3.client.client!kb", name = "b", descriptor = "(IIIIII)V")
    public static void method2487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
        method2493(arg0, arg1, arg2, arg4, arg5);
        method2493(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method2499(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method2499(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!kb", name = "b", descriptor = "(IIIII)V")
    private static void method2493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
        if (arg1 < anInt3147 || arg1 >= anInt3149) {
            return;
        }
        if (arg0 < Static129.anInt3145) {
            arg2 -= Static129.anInt3145 - arg0;
            arg0 = Static129.anInt3145;
        }
        if (arg0 + arg2 > Static129.anInt3148) {
            arg2 = Static129.anInt3148 - arg0;
        }
        @Pc(30) int local30 = 256 - arg4;
        @Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
        @Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
        @Pc(52) int local52 = (arg3 & 0xFF) * arg4;
        @Pc(58) int local58 = arg0 + arg1 * Static129.anInt3144;
        for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
            @Pc(73) int local73 = (Static129.anIntArray297[local58] >> 16 & 0xFF) * local30;
            @Pc(83) int local83 = (Static129.anIntArray297[local58] >> 8 & 0xFF) * local30;
            @Pc(91) int local91 = (Static129.anIntArray297[local58] & 0xFF) * local30;
            @Pc(113) int local113 = (local38 + local73 >> 8 << 16) + (local46 + local83 >> 8 << 8) + (local52 + local91 >> 8);
            Static129.anIntArray297[local58++] = local113;
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!kb", name = "d", descriptor = "(IIIII)V")
    private static void method2499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
        if (arg0 < Static129.anInt3145 || arg0 >= Static129.anInt3148) {
            return;
        }
        if (arg1 < anInt3147) {
            arg2 -= anInt3147 - arg1;
            arg1 = anInt3147;
        }
        if (arg1 + arg2 > anInt3149) {
            arg2 = anInt3149 - arg1;
        }
        @Pc(30) int local30 = 256 - arg4;
        @Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
        @Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
        @Pc(52) int local52 = (arg3 & 0xFF) * arg4;
        @Pc(58) int local58 = arg0 + arg1 * Static129.anInt3144;
        for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
            @Pc(73) int local73 = (Static129.anIntArray297[local58] >> 16 & 0xFF) * local30;
            @Pc(83) int local83 = (Static129.anIntArray297[local58] >> 8 & 0xFF) * local30;
            @Pc(91) int local91 = (Static129.anIntArray297[local58] & 0xFF) * local30;
            @Pc(113) int local113 = (local38 + local73 >> 8 << 16) + (local46 + local83 >> 8 << 8) + (local52 + local91 >> 8);
            Static129.anIntArray297[local58] = local113;
            local58 += Static129.anInt3144;
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!kb", name = "e", descriptor = "(IIIII)V")
	public static void method2500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				Static129.method2489(arg0, arg1, arg2 + 1, arg4);
			} else {
				Static129.method2489(arg0 + arg2, arg1, 1 - arg2, arg4);
			}
		} else if (arg2 != 0) {
			if (arg2 + arg3 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(96) int local96;
			@Pc(127) int local127;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(86) int local86 = arg3 << 16;
				local96 = (int) Math.floor((double) local86 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < Static129.anInt3145) {
					arg1 += local96 * (Static129.anInt3145 - arg0);
					arg0 = Static129.anInt3145;
				}
				if (arg2 >= Static129.anInt3148) {
					arg2 = Static129.anInt3148 - 1;
				}
				while (arg0 <= arg2) {
					local127 = arg1 >> 16;
					if (local127 >= anInt3147 && local127 < anInt3149) {
						Static129.anIntArray297[arg0 + local127 * Static129.anInt3144] = arg4;
					}
					arg1 += local96;
					arg0++;
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(160) int local160 = arg2 << 16;
				local96 = (int) Math.floor((double) local160 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < anInt3147) {
					arg0 += local96 * (anInt3147 - arg1);
					arg1 = anInt3147;
				}
				if (arg3 >= anInt3149) {
					arg3 = anInt3149 - 1;
				}
				while (arg1 <= arg3) {
					local127 = arg0 >> 16;
					if (local127 >= Static129.anInt3145 && local127 < Static129.anInt3148) {
						Static129.anIntArray297[local127 + arg1 * Static129.anInt3144] = arg4;
					}
					arg0 += local96;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			Static129.method2490(arg0, arg1, arg3 + 1, arg4);
		} else {
			Static129.method2490(arg0, arg1 + arg3, -arg3 + 1, arg4);
		}
	}

    @OriginalMember(owner = "com.jagex3.client.client!kb", name = "c", descriptor = "(IIIIII)V")
	public static void method2494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 - arg0;
		@Pc(7) int local7 = arg3 - arg1;
		@Pc(14) int local14 = local3 >= 0 ? local3 : -local3;
		@Pc(21) int local21 = local7 >= 0 ? local7 : -local7;
		@Pc(23) int local23 = local14;
		if (local14 < local21) {
			local23 = local21;
		}
		if (local23 == 0) {
			return;
		}
		@Pc(37) int local37 = (local3 << 16) / local23;
		@Pc(43) int local43 = (local7 << 16) / local23;
		if (local43 <= local37) {
			local37 = -local37;
		} else {
			local43 = -local43;
		}
		@Pc(59) int local59 = arg5 * local43 >> 17;
		@Pc(67) int local67 = arg5 * local43 + 1 >> 17;
		@Pc(73) int local73 = arg5 * local37 >> 17;
		@Pc(81) int local81 = arg5 * local37 + 1 >> 17;
		@Pc(85) int local85 = arg0 - Rasteriser.method1913();
		@Pc(89) int local89 = arg1 - Rasteriser.method1927();
		@Pc(93) int local93 = local85 + local59;
		@Pc(97) int local97 = local85 - local67;
		@Pc(103) int local103 = local85 + local3 - local67;
		@Pc(109) int local109 = local85 + local3 + local59;
		@Pc(113) int local113 = local89 + local73;
		@Pc(117) int local117 = local89 - local81;
		@Pc(123) int local123 = local89 + local7 - local81;
		@Pc(129) int local129 = local89 + local7 + local73;
		Rasteriser.method1922(local93, local97, local103);
		Rasteriser.method1918(local113, local117, local123, local93, local97, local103, arg4);
		Rasteriser.method1922(local93, local103, local109);
		Rasteriser.method1918(local113, local123, local129, local93, local103, local109, arg4);
	}

    @OriginalMember(owner = "com.jagex3.client.client!kb", name = "d", descriptor = "(IIII)V")
    public static void method2498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        if (Static129.anInt3145 < arg0) {
            Static129.anInt3145 = arg0;
        }
        if (anInt3147 < arg1) {
            anInt3147 = arg1;
        }
        if (Static129.anInt3148 > arg2) {
            Static129.anInt3148 = arg2;
        }
        if (anInt3149 > arg3) {
            anInt3149 = arg3;
        }
        method2482();
    }

    @OriginalMember(owner = "com.jagex3.client.client!kb", name = "c", descriptor = "()V")
    public static void method2503() {
        Static129.anInt3145 = 0;
        anInt3147 = 0;
        Static129.anInt3148 = Static129.anInt3144;
        anInt3149 = Static129.anInt3146;
        method2482();
    }

    @OriginalMember(owner = "com.jagex3.client.client!kb", name = "a", descriptor = "([I[I)V")
    public static void method2486(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
        if (arg0.length != anInt3149 - anInt3147 || arg1.length != anInt3149 - anInt3147) {
            throw new IllegalArgumentException();
        }
        Static129.anIntArray295 = arg0;
        Static129.anIntArray296 = arg1;
    }

    @OriginalMember(owner = "com.jagex3.client.client!kb", name = "a", descriptor = "()V")
	public static void method2482() {
		Static129.anIntArray295 = null;
		Static129.anIntArray296 = null;
	}

    @OriginalMember(owner = "com.jagex3.client.client!kb", name = "a", descriptor = "(III[I[I)V")
	public static void method2504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		@Pc(5) int local5 = arg0 + arg1 * Static129.anInt3144;
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(17) int local17 = local5 + arg2[local7];
			for (@Pc(22) int local22 = -arg3[local7]; local22 < 0; local22++) {
				Static129.anIntArray297[local17++] = 0;
			}
			local5 += Static129.anInt3144;
		}
	}
}
