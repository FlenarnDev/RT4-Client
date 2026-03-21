package com.jagex3;

import com.jogamp.opengl.GL2;
import deob.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class World {
    @OriginalMember(owner = "com.jagex3.client.client!ef", name = "g", descriptor = "I")
    public static int groundX = -1;
    @OriginalMember(owner = "com.jagex3.client.client!jb", name = "p", descriptor = "I")
	public static int groundZ = -1;
    @OriginalMember(owner = "com.jagex3.client.client!sm", name = "e", descriptor = "[[[B")
    public static byte[][][] aByteArrayArrayArray13;
    @OriginalMember(owner = "com.jagex3.client.client!gj", name = "m", descriptor = "[[[I")
    public static int[][][] groundh;
    @OriginalMember(owner = "com.jagex3.client.client!kc", name = "o", descriptor = "[[[Lclient!bj;")
    public static Square[][][] activeTiles;
    @OriginalMember(owner = "com.jagex3.client.client!jf", name = "g", descriptor = "[[[I")
    public static int[][][] anIntArrayArrayArray11;
    @OriginalMember(owner = "com.jagex3.client.client!jf", name = "j", descriptor = "I")
    public static int anInt3032;
    @OriginalMember(owner = "com.jagex3.client.client!jf", name = "o", descriptor = "I")
    public static int anInt3036;
    @OriginalMember(owner = "com.jagex3.client.client!jf", name = "p", descriptor = "I")
    public static int anInt3037;
    @OriginalMember(owner = "com.jagex3.client.client!jf", name = "d", descriptor = "I")
    public static int anInt3029;
    @OriginalMember(owner = "com.jagex3.client.client!jf", name = "e", descriptor = "I")
    public static int anInt3030;
    @OriginalMember(owner = "com.jagex3.client.client!jf", name = "i", descriptor = "I")
    public static int anInt3031;
    @OriginalMember(owner = "com.jagex3.client.client!jf", name = "k", descriptor = "I")
    public static int anInt3033;
    @OriginalMember(owner = "com.jagex3.client.client!jf", name = "n", descriptor = "I")
    public static int anInt3035;
    @OriginalMember(owner = "com.jagex3.client.client!jf", name = "f", descriptor = "[Z")
    public static boolean[] aBooleanArray65;
    @OriginalMember(owner = "com.jagex3.client.client!jf", name = "h", descriptor = "[I")
    public static int[] anIntArray284;

    @OriginalMember(owner = "com.jagex3.client.client!pb", name = "b", descriptor = "(III)Lclient!jj;")
    public static GroundObject delObj(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(7) Square local7 = activeTiles[arg0][arg1][arg2];
        if (local7 == null) {
            return null;
        } else {
            @Pc(14) GroundObject local14 = local7.aClass79_1;
            local7.aClass79_1 = null;
            return local14;
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!fh", name = "a", descriptor = "(IIIILclient!th;JLclient!th;Lclient!th;)V")
	public static void setObj(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) ModelSource arg4, @OriginalArg(5) long arg5, @OriginalArg(6) ModelSource arg6, @OriginalArg(7) ModelSource arg7) {
		@Pc(3) GroundObject local3 = new GroundObject();
		local3.aClass8_9 = arg4;
		local3.anInt3064 = arg1 * 128 + 64;
		local3.anInt3061 = arg2 * 128 + 64;
		local3.anInt3057 = arg3;
		local3.aLong108 = arg5;
		local3.aClass8_7 = arg6;
		local3.aClass8_8 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Square local42 = activeTiles[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.spriteCount; local46++) {
				@Pc(55) Sprite local55 = local42.sprites[local46];
				if ((local55.typecode & 0x400000L) == 4194304L) {
					@Pc(66) int local66 = local55.aClass8_4.calcBoundingCylinder();
					if (local66 != -32768 && local66 < local34) {
						local34 = local66;
					}
				}
			}
		}
		local3.anInt3063 = -local34;
		if (activeTiles[arg0][arg1][arg2] == null) {
			activeTiles[arg0][arg1][arg2] = new Square(arg0, arg1, arg2);
		}
		activeTiles[arg0][arg1][arg2].aClass79_1 = local3;
	}

    @OriginalMember(owner = "com.jagex3.client.client!fc", name = "a", descriptor = "()V")
    public static void method1500() {
        @Pc(3) int local3;
        @Pc(9) int local9;
        @Pc(14) int local14;
        if (Static197.aClass3_Sub5ArrayArrayArray2 != null) {
            for (local3 = 0; local3 < Static197.aClass3_Sub5ArrayArrayArray2.length; local3++) {
                for (local9 = 0; local9 < Static152.anInt3594; local9++) {
                    for (local14 = 0; local14 < Static99.anInt2550; local14++) {
                        Static197.aClass3_Sub5ArrayArrayArray2[local3][local9][local14] = null;
                    }
                }
            }
        }
        Static36.aGlSquareArrayArray1 = null;
        if (Static276.aClass3_Sub5ArrayArrayArray3 != null) {
            for (local3 = 0; local3 < Static276.aClass3_Sub5ArrayArrayArray3.length; local3++) {
                for (local9 = 0; local9 < Static152.anInt3594; local9++) {
                    for (local14 = 0; local14 < Static99.anInt2550; local14++) {
                        Static276.aClass3_Sub5ArrayArrayArray3[local3][local9][local14] = null;
                    }
                }
            }
        }
        Static195.aClass3_Sub14ArrayArray3 = null;
        Static28.anInt917 = 0;
        if (Static91.aOccludeArray1 != null) {
            for (local3 = 0; local3 < Static28.anInt917; local3++) {
                Static91.aOccludeArray1[local3] = null;
            }
        }
        if (Static243.aClass31Array3 != null) {
            for (local3 = 0; local3 < Static22.anInt726; local3++) {
                Static243.aClass31Array3[local3] = null;
            }
            Static22.anInt726 = 0;
        }
        if (Static25.aClass31Array2 != null) {
            for (local3 = 0; local3 < Static25.aClass31Array2.length; local3++) {
                Static25.aClass31Array2[local3] = null;
            }
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!il", name = "a", descriptor = "(III)V")
    public static void method3556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        Static158.aBoolean187 = true;
        Static160.anInt3902 = arg0;
        Static89.anInt2388 = arg1;
        Static131.anInt3259 = arg2;
        groundX = -1;
        groundZ = -1;
    }

    @OriginalMember(owner = "com.jagex3.client.client!cd", name = "a", descriptor = "(IIIIZ)V")
    public static void resetMap(@OriginalArg(3) int arg0, @OriginalArg(4) boolean arg1) {
        Static152.anInt3594 = 104;
        Static99.anInt2550 = 104;
        Static277.anInt5855 = arg0;
        Static197.aClass3_Sub5ArrayArrayArray2 = new Square[4][Static152.anInt3594][Static99.anInt2550];
        Static107.anIntArrayArrayArray10 = new int[4][Static152.anInt3594 + 1][Static99.anInt2550 + 1];
        if (GlRenderer.enabled) {
            Static36.aGlSquareArrayArray1 = new GlSquare[4][];
        }
        if (arg1) {
            Static276.aClass3_Sub5ArrayArrayArray3 = new Square[1][Static152.anInt3594][Static99.anInt2550];
            Static62.anIntArrayArray11 = new int[Static152.anInt3594][Static99.anInt2550];
            Static80.anIntArrayArrayArray19 = new int[1][Static152.anInt3594 + 1][Static99.anInt2550 + 1];
            if (GlRenderer.enabled) {
                Static195.aClass3_Sub14ArrayArray3 = new GlSquare[1][];
            }
        } else {
            Static276.aClass3_Sub5ArrayArrayArray3 = null;
            Static62.anIntArrayArray11 = null;
            Static80.anIntArrayArrayArray19 = null;
            Static195.aClass3_Sub14ArrayArray3 = null;
        }
        setActiveTiles(false);
        Static91.aOccludeArray1 = new Occlude[500];
        Static28.anInt917 = 0;
        Static247.aOccludeArray2 = new Occlude[500];
        Static215.anInt4870 = 0;
        Static140.anIntArrayArrayArray12 = new int[4][Static152.anInt3594 + 1][Static99.anInt2550 + 1];
        Static243.aClass31Array3 = new Sprite[5000];
        Static22.anInt726 = 0;
        Static25.aClass31Array2 = new Sprite[100];
        Static48.aBooleanArrayArray1 = new boolean[Static277.anInt5855 + Static277.anInt5855 + 1][Static277.anInt5855 + Static277.anInt5855 + 1];
        Static89.aBooleanArrayArray3 = new boolean[Static277.anInt5855 + Static277.anInt5855 + 2][Static277.anInt5855 + Static277.anInt5855 + 2];
        aByteArrayArrayArray13 = new byte[4][Static152.anInt3594][Static99.anInt2550];
    }

    @OriginalMember(owner = "com.jagex3.client.client!jf", name = "g", descriptor = "()V")
    public static void method2404() {
        Static120.anInt3034 = 0;
        for (@Pc(3) int local3 = 0; local3 < anInt3032; local3++) {
            for (@Pc(8) int local8 = 0; local8 < anInt3037; local8++) {
                for (@Pc(13) int local13 = 0; local13 < anInt3036; local13++) {
                    anIntArrayArrayArray11[local3][local8][local13] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!jf", name = "b", descriptor = "()V")
    public static void method2395() {
        for (@Pc(1) int local1 = 0; local1 < Static120.anInt3034; local1++) {
            @Pc(8) Light local8 = Static120.aClass51Array1[local1];
            @Pc(11) int local11 = local8.anInt2241;
            if (local8.aBoolean124) {
                local11 = 0;
            }
            @Pc(19) int local19 = local8.anInt2241;
            if (local8.aBoolean126) {
                local19 = 3;
            }
            for (@Pc(26) int local26 = local11; local26 <= local19; local26++) {
                @Pc(31) int local31 = 0;
                @Pc(39) int local39 = (local8.anInt2245 >> 7) - local8.anInt2236;
                if (local39 < 0) {
                    local31 = -local39;
                    local39 = 0;
                }
                @Pc(55) int local55 = (local8.anInt2245 >> 7) + local8.anInt2236;
                if (local55 > anInt3036 - 1) {
                    local55 = anInt3036 - 1;
                }
                for (@Pc(66) int local66 = local39; local66 <= local55; local66++) {
                    @Pc(75) short local75 = local8.aShortArray30[local31++];
                    @Pc(87) int local87 = (local8.anInt2240 >> 7) + (local75 >> 8) - local8.anInt2236;
                    @Pc(95) int local95 = local87 + (local75 & 0xFF) - 1;
                    if (local87 < 0) {
                        local87 = 0;
                    }
                    if (local95 > anInt3037 - 1) {
                        local95 = anInt3037 - 1;
                    }
                    for (@Pc(110) int local110 = local87; local110 <= local95; local110++) {
                        @Pc(121) int local121 = anIntArrayArrayArray11[local26][local110][local66];
                        if ((local121 & 0xFF) == 0) {
                            anIntArrayArrayArray11[local26][local110][local66] = local121 | local1 + 1;
                        } else if ((local121 & 0xFF00) == 0) {
                            anIntArrayArrayArray11[local26][local110][local66] = local121 | local1 + 1 << 8;
                        } else if ((local121 & 0xFF0000) == 0) {
                            anIntArrayArrayArray11[local26][local110][local66] = local121 | local1 + 1 << 16;
                        } else if ((local121 & 0xFF000000) == 0) {
                            anIntArrayArrayArray11[local26][local110][local66] = local121 | local1 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!lg", name = "a", descriptor = "(I)V")
    public static void fillBaseLevel(@OriginalArg(0) int arg0) {
        Static235.anInt5276 = arg0;
        for (@Pc(3) int local3 = 0; local3 < Static152.anInt3594; local3++) {
            for (@Pc(8) int local8 = 0; local8 < Static99.anInt2550; local8++) {
                if (activeTiles[arg0][local3][local8] == null) {
                    activeTiles[arg0][local3][local8] = new Square(arg0, local3, local8);
                }
            }
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!wj", name = "a", descriptor = "(Z)V")
    public static void setActiveTiles(@OriginalArg(0) boolean arg0) {
        if (arg0) {
            activeTiles = Static276.aClass3_Sub5ArrayArrayArray3;
            groundh = Static80.anIntArrayArrayArray19;
            Static182.aGlSquareArrayArray2 = Static195.aClass3_Sub14ArrayArray3;
        } else {
            activeTiles = Static197.aClass3_Sub5ArrayArrayArray2;
            groundh = Static107.anIntArrayArrayArray10;
            Static182.aGlSquareArrayArray2 = Static36.aGlSquareArrayArray1;
        }
        Static126.anInt3114 = activeTiles.length;
    }

    @OriginalMember(owner = "com.jagex3.client.client!vf", name = "a", descriptor = "(III)Lclient!jh;")
    public static Wall getWall(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(7) Square local7 = activeTiles[arg0][arg1][arg2];
        return local7 == null ? null : local7.wall;
    }

    @OriginalMember(owner = "com.jagex3.client.client!gj", name = "a", descriptor = "(III)Lclient!df;")
    public static WallDecor getDecor(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(7) Square local7 = activeTiles[arg0][arg1][arg2];
        return local7 == null ? null : local7.aClass24_1;
    }

    @OriginalMember(owner = "com.jagex3.client.client!kf", name = "b", descriptor = "(III)Lclient!ec;")
	public static Sprite getScene(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Square local7 = activeTiles[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.spriteCount; local13++) {
			@Pc(22) Sprite local22 = local7.sprites[local13];
			if ((local22.typecode >> 29 & 0x3L) == 2L && local22.anInt1701 == arg1 && local22.anInt1696 == arg2) {
				return local22;
			}
		}
		return null;
	}

    @OriginalMember(owner = "com.jagex3.client.client!wa", name = "a", descriptor = "(III)Lclient!bm;")
	public static GroundDecor getGroundDecor(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Square local7 = activeTiles[arg0][arg1][arg2];
		return local7 == null || local7.aClass15_1 == null ? null : local7.aClass15_1;
	}

    @OriginalMember(owner = "com.jagex3.client.client!dg", name = "a", descriptor = "(IIIIILclient!th;IJZ)Z")
    public static boolean addDynamic(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) ModelSource arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        @Pc(7) int local7 = arg1 - arg4;
        @Pc(11) int local11 = arg2 - arg4;
        @Pc(15) int local15 = arg1 + arg4;
        @Pc(19) int local19 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                local19 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                local15 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                local11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                local7 -= 128;
            }
        }
        local7 /= 128;
        local11 /= 128;
        local15 /= 128;
        local19 /= 128;
        return Static105.method2256(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "com.jagex3.client.client!vj", name = "a", descriptor = "(III)J")
    public static long method4521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(7) Square local7 = activeTiles[arg0][arg1][arg2];
        return local7 == null || local7.wall == null ? 0L : local7.wall.aLong107;
    }

    @OriginalMember(owner = "com.jagex3.client.client!l", name = "a", descriptor = "(III)J")
    public static long method2703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(7) Square local7 = activeTiles[arg0][arg1][arg2];
        return local7 == null || local7.aClass24_1 == null ? 0L : local7.aClass24_1.aLong52;
    }

    @OriginalMember(owner = "com.jagex3.client.client!cl", name = "a", descriptor = "(III)J")
    public static long method899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(7) Square local7 = activeTiles[arg0][arg1][arg2];
        if (local7 == null) {
            return 0L;
        }
        for (@Pc(13) int local13 = 0; local13 < local7.spriteCount; local13++) {
            @Pc(22) Sprite local22 = local7.sprites[local13];
            if ((local22.typecode >> 29 & 0x3L) == 2L && local22.anInt1701 == arg1 && local22.anInt1696 == arg2) {
                return local22.typecode;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "com.jagex3.client.client!bj", name = "a", descriptor = "(III)J")
    public static long method602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(7) Square local7 = activeTiles[arg0][arg1][arg2];
        return local7 == null || local7.aClass15_1 == null ? 0L : local7.aClass15_1.aLong26;
    }

    @OriginalMember(owner = "com.jagex3.client.client!jf", name = "a", descriptor = "(IZ)V")
    public static void method2394(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
        for (@Pc(1) int local1 = 0; local1 < Static120.anInt3034; local1++) {
            Static120.aClass51Array1[local1].method1765(arg1, arg0);
        }
        anInt3031 = -1;
        anInt3033 = -1;
        anInt3029 = -1;
        anInt3035 = -1;
        anInt3030 = -1;
    }

    @OriginalMember(owner = "com.jagex3.client.client!mf", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static void method2954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= Static152.anInt3594 * 128) {
            arg0 = Static152.anInt3594 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= Static99.anInt2550 * 128) {
            arg2 = Static99.anInt2550 * 128 - 1;
        }
        Static109.anInt2886 = Pix3D.sinTable[arg3];
        Static121.anInt3038 = Pix3D.cosTable[arg3];
        Static231.anInt5205 = Pix3D.sinTable[arg4];
        Static81.anInt2222 = Pix3D.cosTable[arg4];
        Static149.anInt3555 = arg0;
        Static162.anInt3947 = arg1;
        Static217.anInt4903 = arg2;
        Static167.anInt4069 = arg0 / 128;
        Static193.anInt4539 = arg2 / 128;
        Static31.anInt987 = Static167.anInt4069 - Static277.anInt5855;
        if (Static31.anInt987 < 0) {
            Static31.anInt987 = 0;
        }
        Static80.anInt4698 = Static193.anInt4539 - Static277.anInt5855;
        if (Static80.anInt4698 < 0) {
            Static80.anInt4698 = 0;
        }
        Static2.anInt15 = Static167.anInt4069 + Static277.anInt5855;
        if (Static2.anInt15 > Static152.anInt3594) {
            Static2.anInt15 = Static152.anInt3594;
        }
        Static215.anInt4866 = Static193.anInt4539 + Static277.anInt5855;
        if (Static215.anInt4866 > Static99.anInt2550) {
            Static215.anInt4866 = Static99.anInt2550;
        }
        @Pc(99) short local99;
        if (GlRenderer.enabled) {
            local99 = 3584;
        } else {
            local99 = 3500;
        }
        @Pc(104) int local104;
        @Pc(113) int local113;
        for (local104 = 0; local104 < Static277.anInt5855 + Static277.anInt5855 + 2; local104++) {
            for (local113 = 0; local113 < Static277.anInt5855 + Static277.anInt5855 + 2; local113++) {
                @Pc(130) int local130 = (local104 - Static277.anInt5855 << 7) - (Static149.anInt3555 & 0x7F);
                @Pc(140) int local140 = (local113 - Static277.anInt5855 << 7) - (Static217.anInt4903 & 0x7F);
                @Pc(146) int local146 = Static167.anInt4069 + local104 - Static277.anInt5855;
                @Pc(152) int local152 = Static193.anInt4539 + local113 - Static277.anInt5855;
                if (local146 >= 0 && local152 >= 0 && local146 < Static152.anInt3594 && local152 < Static99.anInt2550) {
                    @Pc(176) int local176;
                    if (Static80.anIntArrayArrayArray19 == null) {
                        local176 = Static107.anIntArrayArrayArray10[0][local146][local152] + 128 - Static162.anInt3947;
                    } else {
                        local176 = Static80.anIntArrayArrayArray19[0][local146][local152] + 128 - Static162.anInt3947;
                    }
                    @Pc(201) int local201 = Static107.anIntArrayArrayArray10[3][local146][local152] - Static162.anInt3947 - 1000;
                    Static89.aBooleanArrayArray3[local104][local113] = Static160.method3049(local130, local201, local176, local140, local99);
                } else {
                    Static89.aBooleanArrayArray3[local104][local113] = false;
                }
            }
        }
        for (local104 = 0; local104 < Static277.anInt5855 + Static277.anInt5855 + 1; local104++) {
            for (local113 = 0; local113 < Static277.anInt5855 + Static277.anInt5855 + 1; local113++) {
                Static48.aBooleanArrayArray1[local104][local113] = Static89.aBooleanArrayArray3[local104][local113] || Static89.aBooleanArrayArray3[local104 + 1][local113] || Static89.aBooleanArrayArray3[local104][local113 + 1] || Static89.aBooleanArrayArray3[local104 + 1][local113 + 1];
            }
        }
        Static8.anIntArray8 = arg6;
        Static127.anIntArray292 = arg7;
        Static96.anIntArray234 = arg8;
        Static234.anIntArray454 = arg9;
        Static206.anIntArray427 = arg10;
        Static123.method2419();
        if (Static276.aClass3_Sub5ArrayArrayArray3 != null) {
            setActiveTiles(true);
            Static248.method3292(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
            if (GlRenderer.enabled) {
                Static119.aBoolean153 = false;
                Static27.setMaterial(0, 0);
                Static161.method3066(null);
                method2390();
            }
            setActiveTiles(false);
        }
        Static248.method3292(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "com.jagex3.client.client!jf", name = "a", descriptor = "()V")
    public static void method2390() {
        for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
            anIntArray284[local1] = -1;
            method2396(local1);
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!jf", name = "a", descriptor = "(I)V")
    public static void method2396(@OriginalArg(0) int arg0) {
		if (aBooleanArray65[arg0]) {
			aBooleanArray65[arg0] = false;
			@Pc(14) int local14 = arg0 + 16384 + 4;
			@Pc(16) GL2 local16 = GlRenderer.gl;
			local16.glDisable(local14);
		}
	}

    @OriginalMember(owner = "com.jagex3.client.client!sc", name = "a", descriptor = "()V")
	public static void method3858() {
		for (@Pc(1) int local1 = 0; local1 < Static22.anInt726; local1++) {
			@Pc(8) Sprite local8 = Static243.aClass31Array3[local1];
			Static266.method4193(local8);
			Static243.aClass31Array3[local1] = null;
		}
		Static22.anInt726 = 0;
	}
}
