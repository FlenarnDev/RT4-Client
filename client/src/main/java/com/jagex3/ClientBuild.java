package com.jagex3;

import com.jagex3.client.Client;
import deob.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class ClientBuild {
    @OriginalMember(owner = "com.jagex3.client.client!bb", name = "g", descriptor = "[[[B")
    public static final byte[][][] mapl = new byte[4][104][104];
    @OriginalMember(owner = "com.jagex3.client.client!ta", name = "B", descriptor = "I")
	public static int anInt5245 = 0;
    @OriginalMember(owner = "com.jagex3.client.client!lg", name = "k", descriptor = "I")
    public static int minusedlevel = 99;

    @OriginalMember(owner = "com.jagex3.client.client!il", name = "a", descriptor = "(BII)Z")
    public static boolean changeLocAvailable(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        @Pc(30) LocType local30 = LocType.list(arg0);
        return local30.method3416(arg1);
    }

    @OriginalMember(owner = "com.jagex3.client.client!wa", name = "a", descriptor = "([Lclient!mj;ZIIIII[B)V")
    public static void method2203(@OriginalArg(0) CollisionMap[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6) {
        @Pc(14) int local14;
        @Pc(21) int local21;
        if (!arg1) {
            for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
                for (local14 = 0; local14 < 64; local14++) {
                    for (local21 = 0; local21 < 64; local21++) {
                        if (arg4 + local14 > 0 && local14 + arg4 < 103 && arg3 + local21 > 0 && local21 + arg3 < 103) {
                            arg0[local9].flags[local14 + arg4][arg3 + local21] &= 0xFEFFFFFF;
                        }
                    }
                }
            }
        }
        @Pc(95) Packet local95 = new Packet(arg6);
        @Pc(99) byte local99;
        if (arg1) {
            local99 = 1;
        } else {
            local99 = 4;
        }
        @Pc(117) int local117;
        for (local14 = 0; local14 < local99; local14++) {
            for (local21 = 0; local21 < 64; local21++) {
                for (local117 = 0; local117 < 64; local117++) {
                    Static278.method4651(arg2, arg5, arg1, local95, local117 + arg3, arg4 + local21, 0, local14);
                }
            }
        }
        @Pc(146) boolean local146 = false;
        @Pc(243) int local243;
        @Pc(188) int local188;
        @Pc(190) int local190;
        @Pc(194) int local194;
        while (local95.pos < local95.data.length) {
            local21 = local95.g1();
            if (local21 != 129) {
                local95.pos--;
                break;
            }
            for (local117 = 0; local117 < 4; local117++) {
                @Pc(168) byte local168 = local95.g1b();
                if (local168 == 0) {
                    local243 = arg4;
                    if (arg4 < 0) {
                        local243 = 0;
                    } else if (arg4 >= 104) {
                        local243 = 104;
                    }
                    local190 = arg3;
                    if (arg3 < 0) {
                        local190 = 0;
                    } else if (arg3 >= 104) {
                        local190 = 104;
                    }
                    local188 = arg4 + 64;
                    local194 = arg3 + 64;
                    if (local194 < 0) {
                        local194 = 0;
                    } else if (local194 >= 104) {
                        local194 = 104;
                    }
                    if (local188 < 0) {
                        local188 = 0;
                    } else if (local188 >= 104) {
                        local188 = 104;
                    }
                    while (local243 < local188) {
                        while (local190 < local194) {
                            World.aByteArrayArrayArray13[local117][local243][local190] = 0;
                            local190++;
                        }
                        local243++;
                    }
                } else if (local168 == 1) {
                    for (local243 = 0; local243 < 64; local243 += 4) {
                        for (local188 = 0; local188 < 64; local188 += 4) {
                            @Pc(305) byte local305 = local95.g1b();
                            for (local194 = local243 + arg4; local194 < arg4 + local243 + 4; local194++) {
                                for (@Pc(320) int local320 = arg3 + local188; local320 < arg3 + local188 + 4; local320++) {
                                    if (local194 >= 0 && local194 < 104 && local320 >= 0 && local320 < 104) {
                                        World.aByteArrayArrayArray13[local117][local194][local320] = local305;
                                    }
                                }
                            }
                        }
                    }
                } else if (local168 == 2 && local117 > 0) {
                    local188 = arg4 + 64;
                    local190 = arg3;
                    local194 = arg3 + 64;
                    if (local188 < 0) {
                        local188 = 0;
                    } else if (local188 >= 104) {
                        local188 = 104;
                    }
                    if (arg3 < 0) {
                        local190 = 0;
                    } else if (arg3 >= 104) {
                        local190 = 104;
                    }
                    if (local194 < 0) {
                        local194 = 0;
                    } else if (local194 >= 104) {
                        local194 = 104;
                    }
                    local243 = arg4;
                    if (arg4 < 0) {
                        local243 = 0;
                    } else if (arg4 >= 104) {
                        local243 = 104;
                    }
                    while (local188 > local243) {
                        while (local190 < local194) {
                            World.aByteArrayArrayArray13[local117][local243][local190] = World.aByteArrayArrayArray13[local117 - 1][local243][local190];
                            local190++;
                        }
                        local243++;
                    }
                }
            }
            local146 = true;
        }
        @Pc(515) int local515;
        if (GlRenderer.enabled && !arg1) {
            @Pc(490) Environment local490 = null;
            label270: while (true) {
                label263: do {
                    while (local95.pos < local95.data.length) {
                        local117 = local95.g1();
                        if (local117 != 0) {
                            if (local117 != 1) {
                                throw new IllegalStateException();
                            }
                            local515 = local95.g1();
                            continue label263;
                        }
                        local490 = new Environment(local95);
                    }
                    if (local490 == null) {
                        local490 = new Environment();
                    }
                    for (local117 = 0; local117 < 8; local117++) {
                        for (local515 = 0; local515 < 8; local515++) {
                            local243 = local117 + (arg4 >> 3);
                            local188 = (arg3 >> 3) + local515;
                            if (local243 >= 0 && local243 < 13 && local188 >= 0 && local188 < 13) {
                                Static192.aClass92ArrayArray1[local243][local188] = local490;
                            }
                        }
                    }
                    break label270;
                } while (local515 <= 0);
                for (local243 = 0; local243 < local515; local243++) {
                    @Pc(529) Light local529 = new Light(local95);
                    if (local529.anInt2243 == 31) {
                        @Pc(541) LightType local541 = Static140.method2709(local95.g2());
                        local529.method1762(local541.anInt2865, local541.anInt2873, local541.anInt2867, local541.anInt2872);
                    }
                    local529.anInt2245 += arg3 << 7;
                    local529.anInt2240 += arg4 << 7;
                    local194 = local529.anInt2245 >> 7;
                    local190 = local529.anInt2240 >> 7;
                    if (local190 >= 0 && local194 >= 0 && local190 < 104 && local194 < 104) {
                        local529.aBoolean125 = (mapl[1][local190][local194] & 0x2) != 0;
                        local529.anInt2235 = World.groundh[local529.anInt2241][local190][local194] - local529.anInt2235;
                        Static120.method2389(local529);
                    }
                }
            }
        }
        if (local146) {
            return;
        }
        for (local21 = 0; local21 < 4; local21++) {
            for (local117 = 0; local117 < 16; local117++) {
                for (local515 = 0; local515 < 16; local515++) {
                    local243 = (arg4 >> 2) + local117;
                    local188 = local515 + (arg3 >> 2);
                    if (local243 >= 0 && local243 < 26 && local188 >= 0 && local188 < 26) {
                        World.aByteArrayArrayArray13[local21][local243][local188] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!p", name = "a", descriptor = "(IZIZLclient!mj;IIIBII)V")
    public static void method3397(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) CollisionMap arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
        if (arg1 && !Client.highDetail() && (mapl[0][arg7][arg8] & 0x2) == 0) {
            if ((mapl[arg2][arg7][arg8] & 0x10) != 0) {
                return;
            }
            if (Static4.method22(arg8, arg7, arg2) != Static41.anInt1316) {
                return;
            }
        }
        if (arg2 < minusedlevel) {
            minusedlevel = arg2;
        }
        @Pc(62) LocType local62 = LocType.list(arg5);
        if (GlRenderer.enabled && local62.aBoolean216) {
            return;
        }
        @Pc(84) int local84;
        @Pc(81) int local81;
        if (arg9 == 1 || arg9 == 3) {
            local81 = local62.anInt4397;
            local84 = local62.anInt4403;
        } else {
            local84 = local62.anInt4397;
            local81 = local62.anInt4403;
        }
        @Pc(103) int local103;
        @Pc(112) int local112;
        if (arg7 + local84 <= 104) {
            local103 = arg7 + (local84 >> 1);
            local112 = arg7 + (local84 + 1 >> 1);
        } else {
            local112 = arg7 + 1;
            local103 = arg7;
        }
        @Pc(129) int local129;
        @Pc(133) int local133;
        if (local81 + arg8 > 104) {
            local129 = arg8;
            local133 = arg8 + 1;
        } else {
            local129 = (local81 >> 1) + arg8;
            local133 = arg8 + (local81 + 1 >> 1);
        }
        @Pc(153) int[][] local153 = World.groundh[arg0];
        @Pc(165) int local165 = (local84 << 6) + (arg7 << 7);
        @Pc(173) int local173 = (local81 << 6) + (arg8 << 7);
        @Pc(199) int local199 = local153[local103][local133] + local153[local112][local129] + local153[local103][local129] + local153[local112][local133] >> 2;
        @Pc(201) int local201 = 0;
        @Pc(213) int[][] local213;
        if (GlRenderer.enabled && arg0 != 0) {
            local213 = World.groundh[0];
            local201 = local199 - (local213[local112][local133] + local213[local112][local129] + local213[local103][local129] + local213[local103][local133] >> 2);
        }
        local213 = null;
        @Pc(261) long local261 = (long) (arg7 | 0x40000000 | arg8 << 7 | arg6 << 14 | arg9 << 20);
        if (arg3) {
            local213 = Static107.anIntArrayArrayArray10[0];
        } else if (arg0 < 3) {
            local213 = World.groundh[arg0 + 1];
        }
        if (local62.anInt4429 == 0 || arg3) {
            local261 |= Long.MIN_VALUE;
        }
        if (local62.anInt4438 == 1) {
            local261 |= 0x400000L;
        }
        if (local62.aBoolean213) {
            local261 |= 0x80000000L;
        }
        if (local62.method3422()) {
            BgSound.method2411(arg8, local62, arg9, null, arg7, arg2, null);
        }
        @Pc(330) boolean local330 = local62.aBoolean212 & !arg3;
        local261 |= (long) arg5 << 32;
        @Pc(387) ModelSource local387;
        @Pc(403) Class139 local403;
        if (arg6 == 22) {
            if (Static250.aBoolean283 || local62.anInt4429 != 0 || local62.anInt4435 == 1 || local62.aBoolean206) {
                if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
                    local403 = local62.method3428(arg9, local165, local153, 22, local199, local213, arg1, null, local330, local173);
                    if (GlRenderer.enabled && local330) {
                        Static242.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
                    }
                    local387 = local403.aClass8_10;
                } else {
                    local387 = new ClientLocAnim(arg5, 22, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
                }
                Static170.method2570(arg2, arg7, arg8, local199, local387, local261, local62.aBoolean211);
                if (local62.anInt4435 == 1 && arg4 != null) {
                    arg4.method3057(arg7, arg8);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
                local403 = local62.method3428(arg6 == 11 ? arg9 + 4 : arg9, local165, local153, 10, local199, local213, arg1, null, local330, local173);
                if (GlRenderer.enabled && local330) {
                    Static242.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
                }
                local387 = local403.aClass8_10;
            } else {
                local387 = new ClientLocAnim(arg5, 10, arg6 == 11 ? arg9 + 4 : arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
            }
            if (local387 != null) {
                @Pc(531) boolean local531 = Static5.method35(arg2, arg7, arg8, local199, local84, local81, local387, local261);
                if (local62.aBoolean215 && local531 && arg1) {
                    @Pc(541) int local541 = 15;
                    if (local387 instanceof ModelLit) {
                        local541 = ((ModelLit) local387).method4566() / 4;
                        if (local541 > 30) {
                            local541 = 30;
                        }
                    }
                    for (@Pc(560) int local560 = 0; local560 <= local84; local560++) {
                        for (@Pc(565) int local565 = 0; local565 <= local81; local565++) {
                            if (Static118.aByteArrayArrayArray9[arg2][arg7 + local560][local565 + arg8] < local541) {
                                Static118.aByteArrayArrayArray9[arg2][arg7 + local560][arg8 + local565] = (byte) local541;
                            }
                        }
                    }
                }
            }
            if (local62.anInt4435 != 0 && arg4 != null) {
                arg4.method3043(arg7, local62.aBoolean207, arg8, local84, local81);
            }
        } else if (arg6 >= 12) {
            if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
                local403 = local62.method3428(arg9, local165, local153, arg6, local199, local213, arg1, null, local330, local173);
                if (GlRenderer.enabled && local330) {
                    Static242.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
                }
                local387 = local403.aClass8_10;
            } else {
                local387 = new ClientLocAnim(arg5, arg6, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
            }
            Static5.method35(arg2, arg7, arg8, local199, 1, 1, local387, local261);
            if (arg1 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg2 > 0) {
                Static60.anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x4;
            }
            if (local62.anInt4435 != 0 && arg4 != null) {
                arg4.method3043(arg7, local62.aBoolean207, arg8, local84, local81);
            }
        } else if (arg6 == 0) {
            if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
                local403 = local62.method3428(arg9, local165, local153, 0, local199, local213, arg1, null, local330, local173);
                if (GlRenderer.enabled && local330) {
                    Static242.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
                }
                local387 = local403.aClass8_10;
            } else {
                local387 = new ClientLocAnim(arg5, 0, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
            }
            Static262.method4508(arg2, arg7, arg8, local199, local387, null, Static267.anIntArray517[arg9], 0, local261);
            if (arg1) {
                if (arg9 == 0) {
                    if (local62.aBoolean215) {
                        Static118.aByteArrayArrayArray9[arg2][arg7][arg8] = 50;
                        Static118.aByteArrayArrayArray9[arg2][arg7][arg8 + 1] = 50;
                    }
                    if (local62.aBoolean220) {
                        Static60.anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x1;
                    }
                } else if (arg9 == 1) {
                    if (local62.aBoolean215) {
                        Static118.aByteArrayArrayArray9[arg2][arg7][arg8 + 1] = 50;
                        Static118.aByteArrayArrayArray9[arg2][arg7 + 1][arg8 + 1] = 50;
                    }
                    if (local62.aBoolean220) {
                        Static60.anIntArrayArrayArray6[arg2][arg7][arg8 + 1] |= 0x2;
                    }
                } else if (arg9 == 2) {
                    if (local62.aBoolean215) {
                        Static118.aByteArrayArrayArray9[arg2][arg7 + 1][arg8] = 50;
                        Static118.aByteArrayArrayArray9[arg2][arg7 + 1][arg8 + 1] = 50;
                    }
                    if (local62.aBoolean220) {
                        Static60.anIntArrayArrayArray6[arg2][arg7 + 1][arg8] |= 0x1;
                    }
                } else if (arg9 == 3) {
                    if (local62.aBoolean215) {
                        Static118.aByteArrayArrayArray9[arg2][arg7][arg8] = 50;
                        Static118.aByteArrayArrayArray9[arg2][arg7 + 1][arg8] = 50;
                    }
                    if (local62.aBoolean220) {
                        Static60.anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x2;
                    }
                }
            }
            if (local62.anInt4435 != 0 && arg4 != null) {
                arg4.method3040(arg9, arg6, local62.aBoolean207, arg8, arg7);
            }
            if (local62.anInt4428 != 16) {
                Static18.method559(arg2, arg7, arg8, local62.anInt4428);
            }
        } else if (arg6 == 1) {
            if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
                local403 = local62.method3428(arg9, local165, local153, 1, local199, local213, arg1, null, local330, local173);
                if (GlRenderer.enabled && local330) {
                    Static242.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
                }
                local387 = local403.aClass8_10;
            } else {
                local387 = new ClientLocAnim(arg5, 1, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
            }
            Static262.method4508(arg2, arg7, arg8, local199, local387, null, Static78.anIntArray204[arg9], 0, local261);
            if (local62.aBoolean215 && arg1) {
                if (arg9 == 0) {
                    Static118.aByteArrayArrayArray9[arg2][arg7][arg8 + 1] = 50;
                } else if (arg9 == 1) {
                    Static118.aByteArrayArrayArray9[arg2][arg7 + 1][arg8 + 1] = 50;
                } else if (arg9 == 2) {
                    Static118.aByteArrayArrayArray9[arg2][arg7 + 1][arg8] = 50;
                } else if (arg9 == 3) {
                    Static118.aByteArrayArrayArray9[arg2][arg7][arg8] = 50;
                }
            }
            if (local62.anInt4435 != 0 && arg4 != null) {
                arg4.method3040(arg9, arg6, local62.aBoolean207, arg8, arg7);
            }
        } else {
            @Pc(1226) int local1226;
            if (arg6 == 2) {
                local1226 = arg9 + 1 & 0x3;
                @Pc(1269) ModelSource local1269;
                @Pc(1254) ModelSource local1254;
                if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
                    @Pc(1287) Class139 local1287 = local62.method3428(arg9 + 4, local165, local153, 2, local199, local213, arg1, null, local330, local173);
                    if (GlRenderer.enabled && local330) {
                        Static242.method4211(local1287.aClass36_Sub1_3, local165, local201, local173);
                    }
                    local1254 = local1287.aClass8_10;
                    local1287 = local62.method3428(local1226, local165, local153, 2, local199, local213, arg1, null, local330, local173);
                    if (GlRenderer.enabled && local330) {
                        Static242.method4211(local1287.aClass36_Sub1_3, local165, local201, local173);
                    }
                    local1269 = local1287.aClass8_10;
                } else {
                    local1254 = new ClientLocAnim(arg5, 2, arg9 + 4, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
                    local1269 = new ClientLocAnim(arg5, 2, local1226, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
                }
                Static262.method4508(arg2, arg7, arg8, local199, local1254, local1269, Static267.anIntArray517[arg9], Static267.anIntArray517[local1226], local261);
                if (local62.aBoolean220 && arg1) {
                    if (arg9 == 0) {
                        Static60.anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x1;
                        Static60.anIntArrayArrayArray6[arg2][arg7][arg8 + 1] |= 0x2;
                    } else if (arg9 == 1) {
                        Static60.anIntArrayArrayArray6[arg2][arg7][arg8 + 1] |= 0x2;
                        Static60.anIntArrayArrayArray6[arg2][arg7 + 1][arg8] |= 0x1;
                    } else if (arg9 == 2) {
                        Static60.anIntArrayArrayArray6[arg2][arg7 + 1][arg8] |= 0x1;
                        Static60.anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x2;
                    } else if (arg9 == 3) {
                        Static60.anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x2;
                        Static60.anIntArrayArrayArray6[arg2][arg7][arg8] |= 0x1;
                    }
                }
                if (local62.anInt4435 != 0 && arg4 != null) {
                    arg4.method3040(arg9, arg6, local62.aBoolean207, arg8, arg7);
                }
                if (local62.anInt4428 != 16) {
                    Static18.method559(arg2, arg7, arg8, local62.anInt4428);
                }
            } else if (arg6 == 3) {
                if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
                    local403 = local62.method3428(arg9, local165, local153, 3, local199, local213, arg1, null, local330, local173);
                    if (GlRenderer.enabled && local330) {
                        Static242.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
                    }
                    local387 = local403.aClass8_10;
                } else {
                    local387 = new ClientLocAnim(arg5, 3, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
                }
                Static262.method4508(arg2, arg7, arg8, local199, local387, null, Static78.anIntArray204[arg9], 0, local261);
                if (local62.aBoolean215 && arg1) {
                    if (arg9 == 0) {
                        Static118.aByteArrayArrayArray9[arg2][arg7][arg8 + 1] = 50;
                    } else if (arg9 == 1) {
                        Static118.aByteArrayArrayArray9[arg2][arg7 + 1][arg8 + 1] = 50;
                    } else if (arg9 == 2) {
                        Static118.aByteArrayArrayArray9[arg2][arg7 + 1][arg8] = 50;
                    } else if (arg9 == 3) {
                        Static118.aByteArrayArrayArray9[arg2][arg7][arg8] = 50;
                    }
                }
                if (local62.anInt4435 != 0 && arg4 != null) {
                    arg4.method3040(arg9, arg6, local62.aBoolean207, arg8, arg7);
                }
            } else if (arg6 == 9) {
                if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
                    local403 = local62.method3428(arg9, local165, local153, arg6, local199, local213, arg1, null, local330, local173);
                    if (GlRenderer.enabled && local330) {
                        Static242.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
                    }
                    local387 = local403.aClass8_10;
                } else {
                    local387 = new ClientLocAnim(arg5, arg6, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
                }
                Static5.method35(arg2, arg7, arg8, local199, 1, 1, local387, local261);
                if (local62.anInt4435 != 0 && arg4 != null) {
                    arg4.method3043(arg7, local62.aBoolean207, arg8, local84, local81);
                }
                if (local62.anInt4428 != 16) {
                    Static18.method559(arg2, arg7, arg8, local62.anInt4428);
                }
            } else if (arg6 == 4) {
                if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
                    local403 = local62.method3428(arg9, local165, local153, 4, local199, local213, arg1, null, local330, local173);
                    if (GlRenderer.enabled && local330) {
                        Static242.method4211(local403.aClass36_Sub1_3, local165, local201, local173);
                    }
                    local387 = local403.aClass8_10;
                } else {
                    local387 = new ClientLocAnim(arg5, 4, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
                }
                Static91.method1880(arg2, arg7, arg8, local199, local387, null, Static267.anIntArray517[arg9], 0, 0, 0, local261);
            } else {
                @Pc(1889) long local1889;
                @Pc(1934) ModelSource local1934;
                @Pc(1950) Class139 local1950;
                if (arg6 == 5) {
                    local1226 = 16;
                    local1889 = World.method4521(arg2, arg7, arg8);
                    if (local1889 != 0L) {
                        local1226 = LocType.list(Integer.MAX_VALUE & (int) (local1889 >>> 32)).anInt4428;
                    }
                    if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
                        local1950 = local62.method3428(arg9, local165, local153, 4, local199, local213, arg1, null, local330, local173);
                        if (GlRenderer.enabled && local330) {
                            Static242.method4211(local1950.aClass36_Sub1_3, local165 - Static34.anIntArray80[arg9] * 8, local201, local173 - Static238.anIntArray469[arg9] * 8);
                        }
                        local1934 = local1950.aClass8_10;
                    } else {
                        local1934 = new ClientLocAnim(arg5, 4, arg9, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
                    }
                    Static91.method1880(arg2, arg7, arg8, local199, local1934, null, Static267.anIntArray517[arg9], 0, local1226 * Static34.anIntArray80[arg9], Static238.anIntArray469[arg9] * local1226, local261);
                } else if (arg6 == 6) {
                    local1226 = 8;
                    local1889 = World.method4521(arg2, arg7, arg8);
                    if (local1889 != 0L) {
                        local1226 = LocType.list(Integer.MAX_VALUE & (int) (local1889 >>> 32)).anInt4428 / 2;
                    }
                    if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
                        local1950 = local62.method3428(arg9 + 4, local165, local153, 4, local199, local213, arg1, null, local330, local173);
                        if (GlRenderer.enabled && local330) {
                            Static242.method4211(local1950.aClass36_Sub1_3, local165 - Static114.anIntArray565[arg9] * 8, local201, local173 - Static64.anIntArray154[arg9] * 8);
                        }
                        local1934 = local1950.aClass8_10;
                    } else {
                        local1934 = new ClientLocAnim(arg5, 4, arg9 + 4, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
                    }
                    Static91.method1880(arg2, arg7, arg8, local199, local1934, null, 256, arg9, local1226 * Static114.anIntArray565[arg9], local1226 * Static64.anIntArray154[arg9], local261);
                } else if (arg6 == 7) {
                    @Pc(2137) int local2137 = arg9 + 2 & 0x3;
                    if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
                        @Pc(2183) Class139 local2183 = local62.method3428(local2137 + 4, local165, local153, 4, local199, local213, arg1, null, local330, local173);
                        if (GlRenderer.enabled && local330) {
                            Static242.method4211(local2183.aClass36_Sub1_3, local165, local201, local173);
                        }
                        local387 = local2183.aClass8_10;
                    } else {
                        local387 = new ClientLocAnim(arg5, 4, local2137 + 4, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
                    }
                    Static91.method1880(arg2, arg7, arg8, local199, local387, null, 256, local2137, 0, 0, local261);
                } else if (arg6 == 8) {
                    local1226 = 8;
                    local1889 = World.method4521(arg2, arg7, arg8);
                    if (local1889 != 0L) {
                        local1226 = LocType.list(Integer.MAX_VALUE & (int) (local1889 >>> 32)).anInt4428 / 2;
                    }
                    @Pc(2244) int local2244 = arg9 + 2 & 0x3;
                    @Pc(2289) ModelSource local2289;
                    if (local62.anInt4430 == -1 && local62.anIntArray380 == null && !local62.aBoolean214) {
                        @Pc(2297) int local2297 = Static64.anIntArray154[arg9] * 8;
                        @Pc(2303) int local2303 = Static114.anIntArray565[arg9] * 8;
                        @Pc(2319) Class139 local2319 = local62.method3428(arg9 + 4, local165, local153, 4, local199, local213, arg1, null, local330, local173);
                        if (GlRenderer.enabled && local330) {
                            Static242.method4211(local2319.aClass36_Sub1_3, local165 - local2303, local201, local173 - local2297);
                        }
                        local1934 = local2319.aClass8_10;
                        local2319 = local62.method3428(local2244 + 4, local165, local153, 4, local199, local213, arg1, null, local330, local173);
                        if (GlRenderer.enabled && local330) {
                            Static242.method4211(local2319.aClass36_Sub1_3, local165 - local2303, local201, local173 - local2297);
                        }
                        local2289 = local2319.aClass8_10;
                    } else {
                        local1934 = new ClientLocAnim(arg5, 4, arg9 + 4, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
                        local2289 = new ClientLocAnim(arg5, 4, local2244 + 4, arg0, arg7, arg8, local62.anInt4430, local62.aBoolean209, null);
                    }
                    Static91.method1880(arg2, arg7, arg8, local199, local1934, local2289, 256, arg9, local1226 * Static114.anIntArray565[arg9], Static64.anIntArray154[arg9] * local1226, local261);
                }
            }
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!dm", name = "a", descriptor = "(BII[B)Z")
	public static boolean checkLocations(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(15) boolean local15 = true;
		@Pc(17) int local17 = -1;
		@Pc(22) Packet local22 = new Packet(arg2);
		label70: while (true) {
			@Pc(26) int local26 = local22.gVarSmart();
			if (local26 == 0) {
				return local15;
			}
			@Pc(33) int local33 = 0;
			local17 += local26;
			@Pc(39) boolean local39 = false;
			while (true) {
				@Pc(78) int local78;
				@Pc(95) LocType local95;
				do {
					@Pc(72) int local72;
					@Pc(68) int local68;
					do {
						do {
							do {
								do {
									@Pc(45) int local45;
									while (local39) {
										local45 = local22.gsmart();
										if (local45 == 0) {
											continue label70;
										}
										local22.g1();
									}
									local45 = local22.gsmart();
									if (local45 == 0) {
										continue label70;
									}
									local33 += local45 - 1;
									@Pc(58) int local58 = local33 & 0x3F;
									@Pc(64) int local64 = local33 >> 6 & 0x3F;
									local68 = arg1 + local58;
									local72 = arg0 + local64;
									local78 = local22.g1() >> 2;
								} while (local72 <= 0);
							} while (local68 <= 0);
						} while (local72 >= 103);
					} while (local68 >= 103);
					local95 = LocType.list(local17);
				} while (local78 == 22 && !Static250.aBoolean283 && local95.anInt4429 == 0 && local95.anInt4435 != 1 && !local95.aBoolean206);
				local39 = true;
				if (!local95.method3426()) {
					local15 = false;
					Client.locModelLoadCount++;
				}
			}
		}
	}

    @OriginalMember(owner = "com.jagex3.client.client!pl", name = "a", descriptor = "(ZI)V")
	public static void init(@OriginalArg(0) boolean arg0) {
		Static221.anIntArray376 = new int[104];
		Static139.anIntArray325 = new int[104];
		minusedlevel = 99;
		Static251.anIntArray479 = new int[104];
		@Pc(14) byte local14;
		if (arg0) {
			local14 = 1;
		} else {
			local14 = 4;
		}
		Static163.aByteArrayArrayArray11 = new byte[local14][104][104];
		Static128.anIntArray293 = new int[104];
		Static60.anIntArrayArrayArray6 = new int[local14][105][105];
		Static118.aByteArrayArrayArray9 = new byte[local14][105][105];
		Static240.aByteArrayArrayArray14 = new byte[local14][104][104];
		Static279.anIntArray568 = new int[104];
		Static4.aByteArrayArrayArray1 = new byte[local14][104][104];
		Static253.aByteArrayArrayArray16 = new byte[local14][104][104];
	}

    @OriginalMember(owner = "com.jagex3.client.client!fm", name = "a", descriptor = "(ZII)V")
	public static void loadGround(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static85.anInt2263 = Static192.aClass92ArrayArray1[arg1][arg0].anInt3530;
		Static159.anInt3893 = Static192.aClass92ArrayArray1[arg1][arg0].anInt3528;
		Static148.anInt3534 = Static192.aClass92ArrayArray1[arg1][arg0].anInt3527;
		Static161.method3063((float) Static85.anInt2263, (float) Static159.anInt3893, (float) Static148.anInt3534);
	}

    @OriginalMember(owner = "com.jagex3.client.client!di", name = "a", descriptor = "([Lclient!mj;ZI)V")
    public static void finishBuild(@OriginalArg(0) CollisionMap[] arg0, @OriginalArg(1) boolean arg1) {
        @Pc(10) int local10;
        @Pc(15) int local15;
        if (!arg1) {
            for (local10 = 0; local10 < 4; local10++) {
                for (local15 = 0; local15 < 104; local15++) {
                    for (@Pc(22) int local22 = 0; local22 < 104; local22++) {
                        if ((mapl[local10][local15][local22] & 0x1) == 1) {
                            @Pc(43) int local43 = local10;
                            if ((mapl[1][local15][local22] & 0x2) == 2) {
                                local43 = local10 - 1;
                            }
                            if (local43 >= 0) {
                                arg0[local43].method3051(local22, local15);
                            }
                        }
                    }
                }
            }
            Static183.anInt4272 += (int) (Math.random() * 5.0D) - 2;
            if (Static183.anInt4272 < -16) {
                Static183.anInt4272 = -16;
            }
            if (Static183.anInt4272 > 16) {
                Static183.anInt4272 = 16;
            }
            Static86.anInt2293 += (int) (Math.random() * 5.0D) - 2;
            if (Static86.anInt2293 < -8) {
                Static86.anInt2293 = -8;
            }
            if (Static86.anInt2293 > 8) {
                Static86.anInt2293 = 8;
            }
        }
        @Pc(128) byte local128;
        if (arg1) {
            local128 = 1;
        } else {
            local128 = 4;
        }
        local10 = Static86.anInt2293 >> 2 << 10;
        @Pc(142) int[][] local142 = new int[104][104];
        @Pc(146) int[][] local146 = new int[104][104];
        local15 = Static183.anInt4272 >> 1;
        @Pc(152) int local152;
        @Pc(168) int local168;
        @Pc(173) int local173;
        @Pc(178) int local178;
        @Pc(194) int local194;
        @Pc(200) int local200;
        @Pc(202) int local202;
        @Pc(209) int local209;
        @Pc(349) int local349;
        @Pc(234) int local234;
        @Pc(254) int local254;
        @Pc(267) int local267;
        for (local152 = 0; local152 < local128; local152++) {
            @Pc(159) byte[][] local159 = Static118.aByteArrayArrayArray9[local152];
            @Pc(273) int local273;
            @Pc(326) int local326;
            @Pc(332) int local332;
            @Pc(322) int local322;
            if (!GlRenderer.enabled) {
                local168 = (int) Math.sqrt(5100.0D);
                local173 = local168 * 768 >> 8;
                for (local178 = 1; local178 < 103; local178++) {
                    for (local194 = 1; local194 < 103; local194++) {
                        local209 = World.groundh[local152][local194][local178 + 1] - World.groundh[local152][local194][local178 - 1];
                        local202 = World.groundh[local152][local194 + 1][local178] - World.groundh[local152][local194 - 1][local178];
                        local349 = (int) Math.sqrt((double) (local202 * local202 + local209 * local209 + 65536));
                        local267 = (local209 << 8) / local349;
                        local254 = -65536 / local349;
                        local234 = (local202 << 8) / local349;
                        local273 = (local159[local194][local178] >> 1) + (local159[local194][local178 - 1] >> 2) + (local159[local194 - -1][local178] >> 3) + (local159[local194 - 1][local178] >> 2) + (local159[local194][local178 + 1] >> 3);
                        local200 = (local267 * -50 + local234 * -50 + local254 * -10) / local173 + 74;
                        local146[local194][local178] = local200 - local273;
                    }
                }
            } else if (Static178.highDetailLighting) {
                for (local168 = 1; local168 < 103; local168++) {
                    for (local173 = 1; local173 < 103; local173++) {
                        local194 = (local159[local173 + 1][local168] >> 3) + (local159[local173 - 1][local168] >> 2) + (local159[local173][local168 + -1] >> 2) + (local159[local173][local168 + 1] >> 3) + (local159[local173][local168] >> 1);
                        local146[local173][local168] = 74 - local194;
                    }
                }
            } else {
                local168 = (int) Static161.aFloatArray18[0];
                local173 = (int) Static161.aFloatArray18[1];
                local178 = (int) Static161.aFloatArray18[2];
                local194 = (int) Math.sqrt((double) (local173 * local173 + local168 * local168 + local178 * local178));
                local200 = local194 * 1024 >> 8;
                for (local202 = 1; local202 < 103; local202++) {
                    for (local209 = 1; local209 < 103; local209++) {
                        local234 = World.groundh[local152][local209 + 1][local202] - World.groundh[local152][local209 - 1][local202];
                        local254 = World.groundh[local152][local209][local202 + 1] - World.groundh[local152][local209][local202 - 1];
                        local267 = (int) Math.sqrt((double) (local234 * local234 + local254 * local254 + 65536));
                        local273 = (local234 << 8) / local267;
                        local322 = (local159[local209][local202 + 1] >> 3) + (local159[local209][local202 - 1] >> 2) + (local159[local209 - 1][local202] >> 2) + (local159[local209 + 1][local202] >> 3) + (local159[local209][local202] >> 1);
                        local326 = -65536 / local267;
                        local332 = (local254 << 8) / local267;
                        local349 = (local178 * local332 + local168 * local273 + local326 * local173) / local200 + 96;
                        local146[local209][local202] = local349 - (int) ((float) local322 * 1.7F);
                    }
                }
            }
            for (local168 = 0; local168 < 104; local168++) {
                Static221.anIntArray376[local168] = 0;
                Static139.anIntArray325[local168] = 0;
                Static279.anIntArray568[local168] = 0;
                Static251.anIntArray479[local168] = 0;
                Static128.anIntArray293[local168] = 0;
            }
            for (local168 = -5; local168 < 104; local168++) {
                for (local173 = 0; local173 < 104; local173++) {
                    local178 = local168 + 5;
                    @Pc(729) int local729;
                    if (local178 < 104) {
                        local194 = Static253.aByteArrayArrayArray16[local152][local178][local173] & 0xFF;
                        if (local194 > 0) {
                            @Pc(693) FluType local693 = Static199.method3593(local194 - 1);
                            Static221.anIntArray376[local173] += local693.anInt4154;
                            Static139.anIntArray325[local173] += local693.anInt4149;
                            Static279.anIntArray568[local173] += local693.anInt4158;
                            Static251.anIntArray479[local173] += local693.anInt4161;
                            local729 = Static128.anIntArray293[local173]++;
                        }
                    }
                    local194 = local168 - 5;
                    if (local194 >= 0) {
                        local200 = Static253.aByteArrayArrayArray16[local152][local194][local173] & 0xFF;
                        if (local200 > 0) {
                            @Pc(758) FluType local758 = Static199.method3593(local200 - 1);
                            Static221.anIntArray376[local173] -= local758.anInt4154;
                            Static139.anIntArray325[local173] -= local758.anInt4149;
                            Static279.anIntArray568[local173] -= local758.anInt4158;
                            Static251.anIntArray479[local173] -= local758.anInt4161;
                            local729 = Static128.anIntArray293[local173]--;
                        }
                    }
                }
                if (local168 >= 0) {
                    local173 = 0;
                    local194 = 0;
                    local178 = 0;
                    local200 = 0;
                    local202 = 0;
                    for (local209 = -5; local209 < 104; local209++) {
                        local349 = local209 + 5;
                        if (local349 < 104) {
                            local178 += Static139.anIntArray325[local349];
                            local202 += Static128.anIntArray293[local349];
                            local173 += Static221.anIntArray376[local349];
                            local200 += Static251.anIntArray479[local349];
                            local194 += Static279.anIntArray568[local349];
                        }
                        local234 = local209 - 5;
                        if (local234 >= 0) {
                            local178 -= Static139.anIntArray325[local234];
                            local200 -= Static251.anIntArray479[local234];
                            local173 -= Static221.anIntArray376[local234];
                            local202 -= Static128.anIntArray293[local234];
                            local194 -= Static279.anIntArray568[local234];
                        }
                        if (local209 >= 0 && local202 > 0) {
                            local142[local168][local209] = Static54.method1309(local194 / local202, local178 / local202, local173 * 256 / local200);
                        }
                    }
                }
            }
            for (local168 = 1; local168 < 103; local168++) {
                label771: for (local173 = 1; local173 < 103; local173++) {
                    if (arg1 || Client.highDetail() || (mapl[0][local168][local173] & 0x2) != 0 || (mapl[local152][local168][local173] & 0x10) == 0 && Static4.method22(local173, local168, local152) == Static41.anInt1316) {
                        if (minusedlevel > local152) {
                            minusedlevel = local152;
                        }
                        local178 = Static253.aByteArrayArrayArray16[local152][local168][local173] & 0xFF;
                        local194 = Static240.aByteArrayArrayArray14[local152][local168][local173] & 0xFF;
                        if (local178 > 0 || local194 > 0) {
                            local202 = World.groundh[local152][local168 + 1][local173];
                            local200 = World.groundh[local152][local168][local173];
                            local349 = World.groundh[local152][local168][local173 + 1];
                            local209 = World.groundh[local152][local168 + 1][local173 + 1];
                            if (local152 > 0) {
                                @Pc(1067) boolean local1067 = true;
                                if (local178 == 0 && Static163.aByteArrayArrayArray11[local152][local168][local173] != 0) {
                                    local1067 = false;
                                }
                                if (local194 > 0 && !Static256.method4395(local194 - 1).aBoolean312) {
                                    local1067 = false;
                                }
                                if (local1067 && local200 == local202 && local200 == local209 && local349 == local200) {
                                    Static60.anIntArrayArrayArray6[local152][local168][local173] |= 0x4;
                                }
                            }
                            if (local178 <= 0) {
                                local234 = -1;
                                local254 = 0;
                            } else {
                                local234 = local142[local168][local173];
                                local267 = (local234 & 0x7F) + local15;
                                if (local267 < 0) {
                                    local267 = 0;
                                } else if (local267 > 127) {
                                    local267 = 127;
                                }
                                local273 = (local234 & 0x380) + (local234 + local10 & 0xFC00) + local267;
                                local254 = Rasteriser.anIntArray220[Static87.method1814(96, local273)];
                            }
                            local267 = local146[local168][local173];
                            local332 = local146[local168][local173 + 1];
                            local273 = local146[local168 + 1][local173];
                            local326 = local146[local168 + 1][local173 + 1];
                            if (local194 == 0) {
                                Static176.method3305(local152, local168, local173, 0, 0, -1, local200, local202, local209, local349, Static87.method1814(local267, local234), Static87.method1814(local273, local234), Static87.method1814(local326, local234), Static87.method1814(local332, local234), 0, 0, 0, 0, local254, 0);
                                if (GlRenderer.enabled && local152 > 0 && local234 != -1 && Static199.method3593(local178 - 1).aBoolean198) {
                                    Static242.method4197(0, 0, true, false, local168, local173, local200 - World.groundh[0][local168][local173], -World.groundh[0][local168 + 1][local173] + local202, local209 - World.groundh[0][local168 + 1][local173 + 1], local349 - World.groundh[0][local168][local173 + 1]);
                                }
                                if (GlRenderer.enabled && !arg1 && Static62.anIntArrayArray11 != null && local152 == 0) {
                                    for (local322 = local168 - 1; local322 <= local168 + 1; local322++) {
                                        for (@Pc(1794) int local1794 = local173 - 1; local1794 <= local173 + 1; local1794++) {
                                            if ((local322 != local168 || local173 != local1794) && local322 >= 0 && local322 < 104 && local1794 >= 0 && local1794 < 104) {
                                                @Pc(1834) int local1834 = Static240.aByteArrayArrayArray14[local152][local322][local1794] & 0xFF;
                                                if (local1834 != 0) {
                                                    @Pc(1842) FloType local1842 = Static256.method4395(local1834 - 1);
                                                    if (local1842.anInt5892 != -1 && Pix3D.anInterface1_2.method3237(local1842.anInt5892) == 4) {
                                                        Static62.anIntArrayArray11[local168][local173] = local1842.anInt5889 + (local1842.anInt5898 << 24);
                                                        continue label771;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                local322 = Static163.aByteArrayArrayArray11[local152][local168][local173] + 1;
                                @Pc(1242) byte local1242 = Static4.aByteArrayArrayArray1[local152][local168][local173];
                                @Pc(1248) FloType local1248 = Static256.method4395(local194 - 1);
                                @Pc(1301) int local1301;
                                @Pc(1353) int local1353;
                                @Pc(1288) int local1288;
                                if (GlRenderer.enabled && !arg1 && Static62.anIntArrayArray11 != null && local152 == 0) {
                                    if (local1248.anInt5892 != -1 && Pix3D.anInterface1_2.method3237(local1248.anInt5892) == 4) {
                                        Static62.anIntArrayArray11[local168][local173] = (local1248.anInt5898 << 24) + local1248.anInt5889;
                                    } else {
                                        label737: for (local1288 = local168 - 1; local1288 <= local168 + 1; local1288++) {
                                            for (local1301 = local173 - 1; local1301 <= local173 + 1; local1301++) {
                                                if ((local168 != local1288 || local1301 != local173) && local1288 >= 0 && local1288 < 104 && local1301 >= 0 && local1301 < 104) {
                                                    local1353 = Static240.aByteArrayArrayArray14[local152][local1288][local1301] & 0xFF;
                                                    if (local1353 != 0) {
                                                        @Pc(1366) FloType local1366 = Static256.method4395(local1353 - 1);
                                                        if (local1366.anInt5892 != -1 && Pix3D.anInterface1_2.method3237(local1366.anInt5892) == 4) {
                                                            Static62.anIntArrayArray11[local168][local173] = local1366.anInt5889 + (local1366.anInt5898 << 24);
                                                            break label737;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                local1288 = local1248.anInt5892;
                                if (local1288 >= 0 && !Pix3D.anInterface1_2.method3236(local1288)) {
                                    local1288 = -1;
                                }
                                @Pc(1458) int local1458;
                                @Pc(1429) int local1429;
                                if (local1288 >= 0) {
                                    local1301 = -1;
                                    local1353 = Rasteriser.anIntArray220[Static230.method3949(Pix3D.anInterface1_2.method3234(local1288), 96)];
                                } else if (local1248.anInt5899 == -1) {
                                    local1301 = -2;
                                    local1353 = 0;
                                } else {
                                    local1301 = local1248.anInt5899;
                                    local1429 = local15 + (local1301 & 0x7F);
                                    if (local1429 < 0) {
                                        local1429 = 0;
                                    } else if (local1429 > 127) {
                                        local1429 = 127;
                                    }
                                    local1458 = (local1301 & 0x380) + ((local1301 + local10 & 0xFC00) + local1429);
                                    local1353 = Rasteriser.anIntArray220[Static230.method3949(local1458, 96)];
                                }
                                if (local1248.anInt5894 >= 0) {
                                    local1429 = local1248.anInt5894;
                                    local1458 = local15 + (local1429 & 0x7F);
                                    if (local1458 < 0) {
                                        local1458 = 0;
                                    } else if (local1458 > 127) {
                                        local1458 = 127;
                                    }
                                    @Pc(1529) int local1529 = (local1429 & 0x380) + ((local1429 + local10 & 0xFC00) + local1458);
                                    local1353 = Rasteriser.anIntArray220[Static230.method3949(local1529, 96)];
                                }
                                Static176.method3305(local152, local168, local173, local322, local1242, local1288, local200, local202, local209, local349, Static87.method1814(local267, local234), Static87.method1814(local273, local234), Static87.method1814(local326, local234), Static87.method1814(local332, local234), Static230.method3949(local1301, local267), Static230.method3949(local1301, local273), Static230.method3949(local1301, local326), Static230.method3949(local1301, local332), local254, local1353);
                                if (GlRenderer.enabled && local152 > 0) {
                                    Static242.method4197(local322, local1242, local1301 == -2 || !local1248.aBoolean311, local234 == -1 || !Static199.method3593(local178 - 1).aBoolean198, local168, local173, local200 - World.groundh[0][local168][local173], local202 - World.groundh[0][local168 + 1][local173], local209 - World.groundh[0][local168 + 1][local173 + 1], -World.groundh[0][local168][local173 + 1] + local349);
                                }
                            }
                        }
                    }
                }
            }
            if (GlRenderer.enabled) {
                @Pc(1888) float[][] local1888 = new float[105][105];
                @Pc(1892) int[][] local1892 = World.groundh[local152];
                @Pc(1896) float[][] local1896 = new float[105][105];
                @Pc(1900) float[][] local1900 = new float[105][105];
                local200 = 1;
                while (true) {
                    if (local200 > 103) {
                        @Pc(2025) GlSquare[] local2025;
                        if (arg1) {
                            local2025 = Static193.method3501(mapl, Static163.aByteArrayArrayArray11[local152], Static253.aByteArrayArrayArray16[local152], local146, local1896, Static62.anIntArrayArray11, Static240.aByteArrayArrayArray14[local152], Static4.aByteArrayArrayArray1[local152], local1888, local152, local1900, local142, World.groundh[local152], Static107.anIntArrayArrayArray10[0]);
                            Static110.method2280(local152, local2025);
                            break;
                        }
                        local2025 = Static193.method3501(mapl, Static163.aByteArrayArrayArray11[local152], Static253.aByteArrayArrayArray16[local152], local146, local1896, null, Static240.aByteArrayArrayArray14[local152], Static4.aByteArrayArrayArray1[local152], local1888, local152, local1900, local142, World.groundh[local152], null);
                        @Pc(2049) GlSquare[] local2049 = Static1.method2(local1896, local1888, World.groundh[local152], local152, local1900, Static4.aByteArrayArrayArray1[local152], local146, Static163.aByteArrayArrayArray11[local152], Static253.aByteArrayArrayArray16[local152], Static240.aByteArrayArrayArray14[local152], mapl);
                        @Pc(2057) GlSquare[] local2057 = new GlSquare[local2025.length + local2049.length];
                        for (local349 = 0; local349 < local2025.length; local349++) {
                            local2057[local349] = local2025[local349];
                        }
                        for (local349 = 0; local349 < local2049.length; local349++) {
                            local2057[local2025.length + local349] = local2049[local349];
                        }
                        Static110.method2280(local152, local2057);
                        Static221.method3393(local1900, Static253.aByteArrayArrayArray16[local152], Static4.aByteArrayArrayArray1[local152], Static120.aClass51Array1, local152, Static120.anInt3034, local1896, Static163.aByteArrayArrayArray11[local152], Static240.aByteArrayArrayArray14[local152], World.groundh[local152], local1888);
                        break;
                    }
                    for (local202 = 1; local202 <= 103; local202++) {
                        local349 = local1892[local202][local200 + 1] - local1892[local202][local200 - 1];
                        local209 = local1892[local202 + 1][local200] - local1892[local202 - 1][local200];
                        @Pc(1962) float local1962 = (float) Math.sqrt((double) (local209 * local209 + local349 * local349 + 65536));
                        local1888[local202][local200] = (float) local209 / local1962;
                        local1896[local202][local200] = -256.0F / local1962;
                        local1900[local202][local200] = (float) local349 / local1962;
                    }
                    local200++;
                }
            }
            Static253.aByteArrayArrayArray16[local152] = null;
            Static240.aByteArrayArrayArray14[local152] = null;
            Static163.aByteArrayArrayArray11[local152] = null;
            Static4.aByteArrayArrayArray1[local152] = null;
            Static118.aByteArrayArrayArray9[local152] = null;
        }
        Static220.method3801();
        if (arg1) {
            return;
        }
        @Pc(2204) int local2204;
        for (local152 = 0; local152 < 104; local152++) {
            for (local2204 = 0; local2204 < 104; local2204++) {
                if ((mapl[1][local152][local2204] & 0x2) == 2) {
                    Static224.method3884(local152, local2204);
                }
            }
        }
        for (local152 = 0; local152 < 4; local152++) {
            for (local2204 = 0; local2204 <= 104; local2204++) {
                for (local168 = 0; local168 <= 104; local168++) {
                    if ((Static60.anIntArrayArrayArray6[local152][local168][local2204] & 0x1) != 0) {
                        local200 = local152;
                        for (local173 = local2204; local173 > 0 && (Static60.anIntArrayArrayArray6[local152][local168][local173 - 1] & 0x1) != 0; local173--) {
                        }
                        local194 = local152;
                        for (local178 = local2204; local178 < 104 && (Static60.anIntArrayArrayArray6[local152][local168][local178 + 1] & 0x1) != 0; local178++) {
                        }
                        label454: while (local194 > 0) {
                            for (local202 = local173; local202 <= local178; local202++) {
                                if ((Static60.anIntArrayArrayArray6[local194 - 1][local168][local202] & 0x1) == 0) {
                                    break label454;
                                }
                            }
                            local194--;
                        }
                        label443: while (local200 < 3) {
                            for (local202 = local173; local202 <= local178; local202++) {
                                if ((Static60.anIntArrayArrayArray6[local200 + 1][local168][local202] & 0x1) == 0) {
                                    break label443;
                                }
                            }
                            local200++;
                        }
                        local202 = (local200 + 1 - local194) * (-local173 + (local178 - -1));
                        if (local202 >= 8) {
                            local349 = World.groundh[local200][local168][local173] - 240;
                            local234 = World.groundh[local194][local168][local173];
                            Static278.method4647(1, local168 * 128, local168 * 128, local173 * 128, local178 * 128 + 128, local349, local234);
                            for (local254 = local194; local254 <= local200; local254++) {
                                for (local267 = local173; local267 <= local178; local267++) {
                                    Static60.anIntArrayArrayArray6[local254][local168][local267] &= 0xFFFFFFFE;
                                }
                            }
                        }
                    }
                    if ((Static60.anIntArrayArrayArray6[local152][local168][local2204] & 0x2) != 0) {
                        for (local173 = local168; local173 > 0 && (Static60.anIntArrayArrayArray6[local152][local173 - 1][local2204] & 0x2) != 0; local173--) {
                        }
                        local200 = local152;
                        local194 = local152;
                        for (local178 = local168; local178 < 104 && (Static60.anIntArrayArrayArray6[local152][local178 + 1][local2204] & 0x2) != 0; local178++) {
                        }
                        label508: while (local194 > 0) {
                            for (local202 = local173; local202 <= local178; local202++) {
                                if ((Static60.anIntArrayArrayArray6[local194 - 1][local202][local2204] & 0x2) == 0) {
                                    break label508;
                                }
                            }
                            local194--;
                        }
                        label497: while (local200 < 3) {
                            for (local202 = local173; local202 <= local178; local202++) {
                                if ((Static60.anIntArrayArrayArray6[local200 + 1][local202][local2204] & 0x2) == 0) {
                                    break label497;
                                }
                            }
                            local200++;
                        }
                        local202 = (local178 + 1 - local173) * (-local194 + local200 - -1);
                        if (local202 >= 8) {
                            local349 = World.groundh[local200][local173][local2204] - 240;
                            local234 = World.groundh[local194][local173][local2204];
                            Static278.method4647(2, local173 * 128, local178 * 128 + 128, local2204 * 128, local2204 * 128, local349, local234);
                            for (local254 = local194; local254 <= local200; local254++) {
                                for (local267 = local173; local267 <= local178; local267++) {
                                    Static60.anIntArrayArrayArray6[local254][local267][local2204] &= 0xFFFFFFFD;
                                }
                            }
                        }
                    }
                    if ((Static60.anIntArrayArrayArray6[local152][local168][local2204] & 0x4) != 0) {
                        local173 = local168;
                        local178 = local168;
                        for (local194 = local2204; local194 > 0 && (Static60.anIntArrayArrayArray6[local152][local168][local194 - 1] & 0x4) != 0; local194--) {
                        }
                        for (local200 = local2204; local200 < 104 && (Static60.anIntArrayArrayArray6[local152][local168][local200 + 1] & 0x4) != 0; local200++) {
                        }
                        label562: while (local173 > 0) {
                            for (local202 = local194; local202 <= local200; local202++) {
                                if ((Static60.anIntArrayArrayArray6[local152][local173 - 1][local202] & 0x4) == 0) {
                                    break label562;
                                }
                            }
                            local173--;
                        }
                        label551: while (local178 < 104) {
                            for (local202 = local194; local202 <= local200; local202++) {
                                if ((Static60.anIntArrayArrayArray6[local152][local178 + 1][local202] & 0x4) == 0) {
                                    break label551;
                                }
                            }
                            local178++;
                        }
                        if ((local178 + 1 - local173) * (local200 - (local194 - 1)) >= 4) {
                            local202 = World.groundh[local152][local173][local194];
                            Static278.method4647(4, local173 * 128, local178 * 128 + 128, local194 * 128, local200 * 128 + 128, local202, local202);
                            for (local209 = local173; local209 <= local178; local209++) {
                                for (local349 = local194; local349 <= local200; local349++) {
                                    Static60.anIntArrayArrayArray6[local152][local209][local349] &= 0xFFFFFFFB;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!ib", name = "b", descriptor = "(I)V")
    public static void quit() {
        Static251.anIntArray479 = null;
        Static60.anIntArrayArrayArray6 = null;
        Static128.anIntArray293 = null;
        Static163.aByteArrayArrayArray11 = null;
        Static4.aByteArrayArrayArray1 = null;
        Static118.aByteArrayArrayArray9 = null;
        Static240.aByteArrayArrayArray14 = null;
        Static253.aByteArrayArrayArray16 = null;
        Static139.anIntArray325 = null;
        Static221.anIntArray376 = null;
        Static279.anIntArray568 = null;
    }
}
