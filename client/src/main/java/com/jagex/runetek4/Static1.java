package com.jagex.runetek4;

import com.jagex.runetek4.core.datastruct.HashTable;
import com.jagex.runetek4.game.config.flotype.FloorOverlayType;
import com.jagex.runetek4.game.config.flotype.FloorOverlayTypeList;
import com.jagex.runetek4.util.ArrayUtils;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "runetek4.client!a", name = "h", descriptor = "I")
	public static int anInt5;

	@OriginalMember(owner = "runetek4.client!a", name = "j", descriptor = "Lclient!na;")
	public static final JString aClass100_2 = JString.parse("<col=ffffff> )4 ");

	@OriginalMember(owner = "runetek4.client!a", name = "a", descriptor = "([[F[[F[[II[[F[[B[[II[[B[[B[[B[[[B)[Lclient!hg;")
	public static Class3_Sub14[] method2(@OriginalArg(0) float[][] arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) byte[][][] arg10) {
		@Pc(10) HashTable local10 = new HashTable(128);
		@Pc(12) int local12;
		@Pc(17) int local17;
		@Pc(30) int local30;
		@Pc(38) int local38;
		@Pc(131) int local131;
		@Pc(168) int local168;
		@Pc(143) int local143;
		@Pc(163) int local163;
		@Pc(153) int local153;
		@Pc(190) int local190;
		@Pc(180) int local180;
		@Pc(214) int local214;
		@Pc(202) int local202;
		@Pc(226) int local226;
		@Pc(274) byte local274;
		@Pc(299) int local299;
		@Pc(317) int local317;
		@Pc(127) int local127;
		@Pc(133) int local133;
		@Pc(777) int local777;
		@Pc(1035) int local1035;
		@Pc(1055) boolean[] local1055;
		@Pc(1068) boolean[] local1068;
		@Pc(1086) boolean[] local1086;
		for (local12 = 1; local12 <= 102; local12++) {
			for (local17 = 1; local17 <= 102; local17++) {
				local30 = arg8[local12][local17] & 0xFF;
				local38 = arg9[local12][local17] & 0xFF;
				if (local38 != 0) {
					@Pc(50) FloorOverlayType local50 = FloorOverlayTypeList.method4395(local38 - 1);
					if (local50.baseColor == -1) {
						continue;
					}
					@Pc(61) Class3_Sub14 local61 = Static243.method4212(local10, local50);
					@Pc(67) byte local67 = arg7[local12][local17];
					@Pc(71) int[] local71 = Static228.anIntArrayArray35[local67];
					local61.anInt2482 += local71.length / 2;
					local61.anInt2484++;
					if (local50.blend && local30 != 0) {
						local61.anInt2482 += Static80.anIntArray419[local67];
					}
				}
				if ((arg8[local12][local17] & 0xFF) != 0 || local38 != 0 && arg7[local12][local17] == 0) {
					local127 = 0;
					@Pc(129) int local129 = 0;
					local131 = 0;
					local133 = 0;
					local143 = arg9[local12][local17 + 1] & 0xFF;
					local153 = arg9[local12][local17 - 1] & 0xFF;
					local163 = arg9[local12 - 1][local17] & 0xFF;
					@Pc(166) int[] local166 = new int[8];
					local168 = 0;
					local180 = arg9[local12 - 1][local17 + 1] & 0xFF;
					local190 = arg9[local12 + 1][local17] & 0xFF;
					local202 = arg9[local12 + 1][local17 - 1] & 0xFF;
					local214 = arg9[local12 - 1][local17 - 1] & 0xFF;
					local226 = arg9[local12 + 1][local17 + 1] & 0xFF;
					@Pc(242) FloorOverlayType local242;
					@Pc(264) byte local264;
					@Pc(287) int local287;
					if (local180 != 0 && local38 != local180) {
						local242 = FloorOverlayTypeList.method4395(local180 - 1);
						if (local242.blend && local242.baseColor != -1) {
							local264 = arg5[local12 - 1][local17 + 1];
							local274 = arg7[local12 - 1][local17 + 1];
							local287 = Static130.anIntArray300[local274 * 4 + (local264 + 2 & 0x3)];
							local299 = Static130.anIntArray300[(local264 + 3 & 0x3) + local274 * 4];
							if (!Static277.aBooleanArrayArray4[local299][1] || !Static277.aBooleanArrayArray4[local287][0]) {
								for (local317 = 0; local317 < 8; local317++) {
									if (local317 == 0) {
										local127++;
										local166[0] = local180;
										break;
									}
									if (local180 == local166[local317]) {
										break;
									}
								}
							}
						}
					}
					if (local214 != 0 && local214 != local38) {
						local242 = FloorOverlayTypeList.method4395(local214 - 1);
						if (local242.blend && local242.baseColor != -1) {
							local264 = arg5[local12 - 1][local17 - 1];
							local274 = arg7[local12 - 1][local17 - 1];
							local287 = Static130.anIntArray300[local274 * 4 + (local264 & 0x3)];
							local299 = Static130.anIntArray300[(local264 + 3 & 0x3) + local274 * 4];
							if (!Static277.aBooleanArrayArray4[local287][1] || !Static277.aBooleanArrayArray4[local299][0]) {
								for (local317 = 0; local317 < 8; local317++) {
									if (local127 == local317) {
										local166[local127++] = local214;
										break;
									}
									if (local166[local317] == local214) {
										break;
									}
								}
							}
						}
					}
					if (local202 != 0 && local38 != local202) {
						local242 = FloorOverlayTypeList.method4395(local202 - 1);
						if (local242.blend && local242.baseColor != -1) {
							local264 = arg5[local12 + 1][local17 - 1];
							local274 = arg7[local12 + 1][local17 - 1];
							local299 = Static130.anIntArray300[local274 * 4 + (local264 + 1 & 0x3)];
							local287 = Static130.anIntArray300[local274 * 4 + (local264 & 0x3)];
							if (!Static277.aBooleanArrayArray4[local299][1] || !Static277.aBooleanArrayArray4[local287][0]) {
								for (local317 = 0; local317 < 8; local317++) {
									if (local127 == local317) {
										local166[local127++] = local202;
										break;
									}
									if (local202 == local166[local317]) {
										break;
									}
								}
							}
						}
					}
					if (local226 != 0 && local226 != local38) {
						local242 = FloorOverlayTypeList.method4395(local226 - 1);
						if (local242.blend && local242.baseColor != -1) {
							local264 = arg5[local12 + 1][local17 + 1];
							local274 = arg7[local12 + 1][local17 + 1];
							local299 = Static130.anIntArray300[local274 * 4 + (local264 + 1 & 0x3)];
							local287 = Static130.anIntArray300[local274 * 4 + (local264 + 2 & 0x3)];
							if (!Static277.aBooleanArrayArray4[local287][1] || !Static277.aBooleanArrayArray4[local299][0]) {
								for (local317 = 0; local317 < 8; local317++) {
									if (local127 == local317) {
										local166[local127++] = local226;
										break;
									}
									if (local226 == local166[local317]) {
										break;
									}
								}
							}
						}
					}
					if (local143 != 0 && local38 != local143) {
						local242 = FloorOverlayTypeList.method4395(local143 - 1);
						if (local242.blend && local242.baseColor != -1) {
							local129 = Static130.anIntArray300[arg7[local12][local17 + 1] * 4 + (arg5[local12][local17 + 1] + 2 & 0x3)];
							for (local777 = 0; local777 < 8; local777++) {
								if (local127 == local777) {
									local166[local127++] = local143;
									break;
								}
								if (local166[local777] == local143) {
									break;
								}
							}
						}
					}
					if (local163 != 0 && local38 != local163) {
						local242 = FloorOverlayTypeList.method4395(local163 - 1);
						if (local242.blend && local242.baseColor != -1) {
							local133 = Static130.anIntArray300[(arg5[local12 - 1][local17] + 3 & 0x3) + arg7[local12 - 1][local17] * 4];
							for (local777 = 0; local777 < 8; local777++) {
								if (local127 == local777) {
									local166[local127++] = local163;
									break;
								}
								if (local163 == local166[local777]) {
									break;
								}
							}
						}
					}
					if (local153 != 0 && local38 != local153) {
						local242 = FloorOverlayTypeList.method4395(local153 - 1);
						if (local242.blend && local242.baseColor != -1) {
							local131 = Static130.anIntArray300[(arg5[local12][local17 - 1] & 0x3) + arg7[local12][local17 - 1] * 4];
							for (local777 = 0; local777 < 8; local777++) {
								if (local777 == local127) {
									local166[local127++] = local153;
									break;
								}
								if (local153 == local166[local777]) {
									break;
								}
							}
						}
					}
					if (local190 != 0 && local38 != local190) {
						local242 = FloorOverlayTypeList.method4395(local190 - 1);
						if (local242.blend && local242.baseColor != -1) {
							local168 = Static130.anIntArray300[(arg5[local12 + 1][local17] + 1 & 0x3) + arg7[local12 + 1][local17] * 4];
							for (local777 = 0; local777 < 8; local777++) {
								if (local127 == local777) {
									local166[local127++] = local190;
									break;
								}
								if (local166[local777] == local190) {
									break;
								}
							}
						}
					}
					for (local1035 = 0; local1035 < local127; local1035++) {
						local777 = local166[local1035];
						local1055 = Static277.aBooleanArrayArray4[local163 == local777 ? local133 : 0];
						local1068 = Static277.aBooleanArrayArray4[local777 == local153 ? local131 : 0];
						@Pc(1077) boolean[] local1077 = Static277.aBooleanArrayArray4[local143 == local777 ? local129 : 0];
						local1086 = Static277.aBooleanArrayArray4[local190 == local777 ? local168 : 0];
						@Pc(1092) FloorOverlayType local1092 = FloorOverlayTypeList.method4395(local777 - 1);
						@Pc(1097) Class3_Sub14 local1097 = Static243.method4212(local10, local1092);
						local1097.anInt2482 += 5;
						local1097.anInt2482 += local1077.length - 2;
						local1097.anInt2482 += local1055.length - 2;
						local1097.anInt2482 += local1068.length - 2;
						local1097.anInt2482 += local1086.length - 2;
						local1097.anInt2484++;
					}
				}
			}
		}
		@Pc(1161) Class3_Sub14 local1161;
		for (local1161 = (Class3_Sub14) local10.head(); local1161 != null; local1161 = (Class3_Sub14) local10.prev()) {
			local1161.method1940();
		}
		for (local12 = 1; local12 <= 102; local12++) {
			for (local17 = 1; local17 <= 102; local17++) {
				local38 = arg8[local12][local17] & 0xFF;
				local127 = arg9[local12][local17] & 0xFF;
				if ((arg10[arg3][local12][local17] & 0x8) != 0) {
					local30 = 0;
				} else if ((arg10[1][local12][local17] & 0x2) == 2 && arg3 > 0) {
					local30 = arg3 - 1;
				} else {
					local30 = arg3;
				}
				if (local127 != 0) {
					@Pc(1250) FloorOverlayType local1250 = FloorOverlayTypeList.method4395(local127 - 1);
					if (local1250.baseColor == -1) {
						continue;
					}
					@Pc(1261) Class3_Sub14 local1261 = Static243.method4212(local10, local1250);
					@Pc(1267) byte local1267 = arg7[local12][local17];
					@Pc(1273) byte local1273 = arg5[local12][local17];
					local168 = Static19.method588(local1250.material, local1250.baseColor, arg6[local12][local17]);
					local143 = Static19.method588(local1250.material, local1250.baseColor, arg6[local12 + 1][local17]);
					local163 = Static19.method588(local1250.material, local1250.baseColor, arg6[local12 + 1][local17 + 1]);
					local153 = Static19.method588(local1250.material, local1250.baseColor, arg6[local12][local17 + 1]);
					Static58.method1324(local168, arg2, arg1, local12, arg0, local143, local1273, local30, local163, local38 != 0 && local1250.blend, local1267, local17, arg4, local153, local1261);
				}
				if ((arg8[local12][local17] & 0xFF) != 0 || local127 != 0 && arg7[local12][local17] == 0) {
					@Pc(1382) int[] local1382 = new int[8];
					local133 = 0;
					@Pc(1386) int local1386 = 0;
					local131 = 0;
					local168 = 0;
					local163 = arg9[local12][local17 + 1] & 0xFF;
					local143 = 0;
					local153 = arg9[local12 - 1][local17] & 0xFF;
					local180 = arg9[local12 + 1][local17] & 0xFF;
					local190 = arg9[local12][local17 - 1] & 0xFF;
					local214 = arg9[local12 - 1][local17 + 1] & 0xFF;
					local202 = arg9[local12 - 1][local17 - 1] & 0xFF;
					local226 = arg9[local12 + 1][local17 - 1] & 0xFF;
					local1035 = arg9[local12 + 1][local17 + 1] & 0xFF;
					@Pc(1527) byte local1527;
					@Pc(1496) FloorOverlayType local1496;
					@Pc(1571) int local1571;
					if (local214 == 0 || local214 == local127) {
						local214 = 0;
					} else {
						local1496 = FloorOverlayTypeList.method4395(local214 - 1);
						if (local1496.blend && local1496.baseColor != -1) {
							local274 = arg5[local12 - 1][local17 + 1];
							local1527 = arg7[local12 - 1][local17 + 1];
							local299 = Static130.anIntArray300[local1527 * 4 + (local274 + 2 & 0x3)];
							local317 = Static130.anIntArray300[local1527 * 4 + (local274 + 3 & 0x3)];
							if (Static277.aBooleanArrayArray4[local317][1] && Static277.aBooleanArrayArray4[local299][0]) {
								local214 = 0;
							} else {
								for (local1571 = 0; local1571 < 8; local1571++) {
									if (local1571 == 0) {
										local1386++;
										local1382[0] = local214;
										break;
									}
									if (local1382[local1571] == local214) {
										break;
									}
								}
							}
						} else {
							local214 = 0;
						}
					}
					if (local202 == 0 || local127 == local202) {
						local202 = 0;
					} else {
						local1496 = FloorOverlayTypeList.method4395(local202 - 1);
						if (local1496.blend && local1496.baseColor != -1) {
							local274 = arg5[local12 - 1][local17 - 1];
							local1527 = arg7[local12 - 1][local17 - 1];
							local299 = Static130.anIntArray300[(local274 & 0x3) + local1527 * 4];
							local317 = Static130.anIntArray300[(local274 + 3 & 0x3) + local1527 * 4];
							if (Static277.aBooleanArrayArray4[local299][1] && Static277.aBooleanArrayArray4[local317][0]) {
								local202 = 0;
							} else {
								for (local1571 = 0; local1571 < 8; local1571++) {
									if (local1571 == local1386) {
										local1382[local1386++] = local202;
										break;
									}
									if (local202 == local1382[local1571]) {
										break;
									}
								}
							}
						} else {
							local202 = 0;
						}
					}
					if (local226 == 0 || local226 == local127) {
						local226 = 0;
					} else {
						local1496 = FloorOverlayTypeList.method4395(local226 - 1);
						if (local1496.blend && local1496.baseColor != -1) {
							local274 = arg5[local12 + 1][local17 - 1];
							local1527 = arg7[local12 + 1][local17 - 1];
							local317 = Static130.anIntArray300[(local274 + 1 & 0x3) + local1527 * 4];
							local299 = Static130.anIntArray300[local1527 * 4 + (local274 & 0x3)];
							if (Static277.aBooleanArrayArray4[local317][1] && Static277.aBooleanArrayArray4[local299][0]) {
								local226 = 0;
							} else {
								for (local1571 = 0; local1571 < 8; local1571++) {
									if (local1571 == local1386) {
										local1382[local1386++] = local226;
										break;
									}
									if (local1382[local1571] == local226) {
										break;
									}
								}
							}
						} else {
							local226 = 0;
						}
					}
					if (local1035 == 0 || local127 == local1035) {
						local1035 = 0;
					} else {
						local1496 = FloorOverlayTypeList.method4395(local1035 - 1);
						if (local1496.blend && local1496.baseColor != -1) {
							local1527 = arg7[local12 + 1][local17 + 1];
							local274 = arg5[local12 + 1][local17 + 1];
							local299 = Static130.anIntArray300[(local274 + 2 & 0x3) + local1527 * 4];
							local317 = Static130.anIntArray300[(local274 + 1 & 0x3) + local1527 * 4];
							if (Static277.aBooleanArrayArray4[local299][1] && Static277.aBooleanArrayArray4[local317][0]) {
								local1035 = 0;
							} else {
								for (local1571 = 0; local1571 < 8; local1571++) {
									if (local1571 == local1386) {
										local1382[local1386++] = local1035;
										break;
									}
									if (local1382[local1571] == local1035) {
										break;
									}
								}
							}
						} else {
							local1035 = 0;
						}
					}
					@Pc(2003) int local2003;
					if (local163 != 0 && local163 != local127) {
						local1496 = FloorOverlayTypeList.method4395(local163 - 1);
						if (local1496.blend && local1496.baseColor != -1) {
							local133 = Static130.anIntArray300[arg7[local12][local17 + 1] * 4 + (arg5[local12][local17 + 1] + 2 & 0x3)];
							for (local2003 = 0; local2003 < 8; local2003++) {
								if (local2003 == local1386) {
									local1382[local1386++] = local163;
									break;
								}
								if (local1382[local2003] == local163) {
									break;
								}
							}
						}
					}
					if (local153 != 0 && local127 != local153) {
						local1496 = FloorOverlayTypeList.method4395(local153 - 1);
						if (local1496.blend && local1496.baseColor != -1) {
							local131 = Static130.anIntArray300[(arg5[local12 - 1][local17] + 3 & 0x3) + arg7[local12 - 1][local17] * 4];
							for (local2003 = 0; local2003 < 8; local2003++) {
								if (local1386 == local2003) {
									local1382[local1386++] = local153;
									break;
								}
								if (local153 == local1382[local2003]) {
									break;
								}
							}
						}
					}
					if (local190 != 0 && local190 != local127) {
						local1496 = FloorOverlayTypeList.method4395(local190 - 1);
						if (local1496.blend && local1496.baseColor != -1) {
							local168 = Static130.anIntArray300[(arg5[local12][local17 - 1] & 0x3) + arg7[local12][local17 - 1] * 4];
							for (local2003 = 0; local2003 < 8; local2003++) {
								if (local1386 == local2003) {
									local1382[local1386++] = local190;
									break;
								}
								if (local190 == local1382[local2003]) {
									break;
								}
							}
						}
					}
					if (local180 != 0 && local180 != local127) {
						local1496 = FloorOverlayTypeList.method4395(local180 - 1);
						if (local1496.blend && local1496.baseColor != -1) {
							local143 = Static130.anIntArray300[arg7[local12 + 1][local17] * 4 + (arg5[local12 + 1][local17] + 1 & 0x3)];
							for (local2003 = 0; local2003 < 8; local2003++) {
								if (local2003 == local1386) {
									local1382[local1386++] = local180;
									break;
								}
								if (local1382[local2003] == local180) {
									break;
								}
							}
						}
					}
					for (local777 = 0; local777 < local1386; local777++) {
						local2003 = local1382[local777];
						local1055 = Static277.aBooleanArrayArray4[local2003 == local163 ? local133 : 0];
						local1068 = Static277.aBooleanArrayArray4[local153 == local2003 ? local131 : 0];
						local1086 = Static277.aBooleanArrayArray4[local2003 == local190 ? local168 : 0];
						@Pc(2318) boolean[] local2318 = Static277.aBooleanArrayArray4[local2003 == local180 ? local143 : 0];
						@Pc(2324) FloorOverlayType local2324 = FloorOverlayTypeList.method4395(local2003 - 1);
						@Pc(2329) Class3_Sub14 local2329 = Static243.method4212(local10, local2324);
						@Pc(2345) int local2345 = Static19.method588(local2324.material, local2324.baseColor, arg6[local12][local17]) << 8 | 0xFF;
						@Pc(2365) int local2365 = Static19.method588(local2324.material, local2324.baseColor, arg6[local12 + 1][local17]) << 8 | 0xFF;
						@Pc(2385) int local2385 = Static19.method588(local2324.material, local2324.baseColor, arg6[local12 + 1][local17 + 1]) << 8 | 0xFF;
						@Pc(2403) int local2403 = Static19.method588(local2324.material, local2324.baseColor, arg6[local12][local17 + 1]) << 8 | 0xFF;
						@Pc(2422) boolean local2422 = local2003 != local202 && local1086[0] && local1068[1];
						@Pc(2441) boolean local2441 = local2003 != local1035 && local1055[0] && local2318[1];
						@Pc(2456) boolean local2456 = local214 != local2003 && local1068[0] && local1055[1];
						@Pc(2463) int local2463 = local1055.length + 6 - 2;
						@Pc(2482) boolean local2482 = local2003 != local226 && local2318[0] && local1086[1];
						@Pc(2489) int local2489 = local2463 + local1068.length - 2;
						@Pc(2496) int local2496 = local2489 + local1086.length - 2;
						@Pc(2503) int local2503 = local2496 + local2318.length - 2;
						@Pc(2524) int local2524 = Static207.method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, true, local2329, arg1, local17, 64, arg0, 64);
						@Pc(2527) int[] local2527 = new int[local2503];
						@Pc(2529) byte local2529 = 0;
						@Pc(2550) int local2550 = Static207.method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local2456, local2329, arg1, local17, 0, arg0, 128);
						@Pc(2571) int local2571 = Static207.method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local2441, local2329, arg1, local17, 128, arg0, 128);
						@Pc(2592) int local2592 = Static207.method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local2422, local2329, arg1, local17, 0, arg0, 0);
						@Pc(2613) int local2613 = Static207.method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local2482, local2329, arg1, local17, 128, arg0, 0);
						@Pc(2616) int local2616 = local2529 + 1;
						local2527[0] = local2524;
						@Pc(2621) int local2621 = local2616 + 1;
						local2527[1] = local2571;
						if (local1055.length > 2) {
							local2621++;
							local2527[2] = Static207.method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local1055[2], local2329, arg1, local17, 64, arg0, 128);
						}
						local2527[local2621++] = local2550;
						if (local1068.length > 2) {
							local2527[local2621++] = Static207.method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local1068[2], local2329, arg1, local17, 0, arg0, 64);
						}
						local2527[local2621++] = local2592;
						if (local1086.length > 2) {
							local2527[local2621++] = Static207.method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local1086[2], local2329, arg1, local17, 64, arg0, 0);
						}
						local2527[local2621++] = local2613;
						if (local2318.length > 2) {
							local2527[local2621++] = Static207.method3683(local2403, 0.0F, local2345, local2365, null, arg2, local12, arg4, local2385, 0, local2318[2], local2329, arg1, local17, 128, arg0, 64);
						}
						local2527[local2621++] = local2571;
						local2329.method1945(local30, local12, local17, local2527, null, true);
					}
				}
			}
		}
		for (local1161 = (Class3_Sub14) local10.head(); local1161 != null; local1161 = (Class3_Sub14) local10.prev()) {
			if (local1161.anInt2483 == 0) {
				local1161.unlink();
			} else {
				local1161.method1943();
			}
		}
		local12 = local10.length();
		@Pc(2823) Class3_Sub14[] local2823 = new Class3_Sub14[local12];
		@Pc(2826) long[] local2826 = new long[local12];
		local10.addNodes(local2823);
		for (local38 = 0; local38 < local12; local38++) {
			local2826[local38] = local2823[local38].nodeId;
		}
		ArrayUtils.sort(local2826, local2823);
		return local2823;
	}
}