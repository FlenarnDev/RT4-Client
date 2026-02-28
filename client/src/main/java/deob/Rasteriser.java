package deob;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Rasteriser {

	@OriginalMember(owner = "com.jagex3.client.client!hf", name = "b", descriptor = "I")
	public static int anInt2469;

	@OriginalMember(owner = "com.jagex3.client.client!hf", name = "e", descriptor = "Lclient!m;")
	public static TextureProvider anInterface1_2;

    @OriginalMember(owner = "com.jagex3.client.client!hf", name = "m", descriptor = "I")
	public static int anInt2471;

	@OriginalMember(owner = "com.jagex3.client.client!hf", name = "n", descriptor = "I")
	public static int anInt2472;

	@OriginalMember(owner = "com.jagex3.client.client!hf", name = "a", descriptor = "[I")
	public static final int[] anIntArray220 = new int[65536];

    @OriginalMember(owner = "com.jagex3.client.client!hf", name = "d", descriptor = "Z")
	public static boolean aBoolean134 = false;

    @OriginalMember(owner = "com.jagex3.client.client!hf", name = "j", descriptor = "Z")
	public static boolean aBoolean136 = true;

    @OriginalMember(owner = "com.jagex3.client.client!hf", name = "p", descriptor = "Z")
	public static boolean aBoolean138 = false;

	@OriginalMember(owner = "com.jagex3.client.client!hf", name = "q", descriptor = "I")
	public static int anInt2473 = 0;

	@OriginalMember(owner = "com.jagex3.client.client!hf", name = "a", descriptor = "()V")
	public static void method1908() {
		Pix3D.method1925(Static129.anInt3145, Static129.anInt3147, Static129.anInt3148, Static129.anInt3149);
	}

	@OriginalMember(owner = "com.jagex3.client.client!hf", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public static void method1909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18) {
		@Pc(5) int[] local5 = anInterface1_2.method3232(arg18, Pix3D.aFloat11);
		@Pc(12) int local12;
		if (local5 == null) {
			local12 = anInterface1_2.method3234(arg18);
			method1928(arg0, arg1, arg2, arg3, arg4, arg5, method1910(local12, arg6), method1910(local12, arg7), method1910(local12, arg8));
			return;
		}
		Pix3D.aBoolean137 = anInterface1_2.method3233(arg18);
		Pix3D.aBoolean135 = anInterface1_2.method3226(arg18);
		local12 = arg4 - arg3;
		@Pc(47) int local47 = arg1 - arg0;
		@Pc(51) int local51 = arg5 - arg3;
		@Pc(55) int local55 = arg2 - arg0;
		@Pc(59) int local59 = arg7 - arg6;
		@Pc(63) int local63 = arg8 - arg6;
		@Pc(65) int local65 = 0;
		if (arg1 != arg0) {
			local65 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(80) int local80 = 0;
		if (arg2 != arg1) {
			local80 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(95) int local95 = 0;
		if (arg2 != arg0) {
			local95 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(116) int local116 = local12 * local55 - local51 * local47;
		if (local116 == 0) {
			return;
		}
		@Pc(131) int local131 = (local59 * local55 - local63 * local47 << 9) / local116;
		@Pc(143) int local143 = (local63 * local12 - local59 * local51 << 9) / local116;
		@Pc(147) int local147 = arg9 - arg10;
		@Pc(151) int local151 = arg12 - arg13;
		@Pc(155) int local155 = arg15 - arg16;
		@Pc(159) int local159 = arg11 - arg9;
		@Pc(163) int local163 = arg14 - arg12;
		@Pc(167) int local167 = arg17 - arg15;
		@Pc(177) int local177 = local159 * arg12 - local163 * arg9 << 14;
		@Pc(187) int local187 = local163 * arg15 - local167 * arg12 << 5;
		@Pc(197) int local197 = local167 * arg9 - local159 * arg15 << 5;
		@Pc(207) int local207 = local147 * arg12 - local151 * arg9 << 14;
		@Pc(217) int local217 = local151 * arg15 - local155 * arg12 << 5;
		@Pc(227) int local227 = local155 * arg9 - local147 * arg15 << 5;
		@Pc(237) int local237 = local151 * local159 - local147 * local163 << 14;
		@Pc(247) int local247 = local155 * local163 - local151 * local167 << 5;
		@Pc(257) int local257 = local147 * local167 - local155 * local159 << 5;
		@Pc(336) int local336;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < Pix3D.anInt2470) {
				if (arg1 > Pix3D.anInt2470) {
					arg1 = Pix3D.anInt2470;
				}
				if (arg2 > Pix3D.anInt2470) {
					arg2 = Pix3D.anInt2470;
				}
				arg6 = (arg6 << 9) + local131 - local131 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local95 * arg0;
						arg3 -= local65 * arg0;
						arg6 -= local143 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local80 * arg1;
						arg1 = 0;
					}
					local336 = arg0 - anInt2469;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if (arg0 != arg1 && local95 < local65 || arg0 == arg1 && local95 > local80) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1917(Static129.anIntArray297, local5, arg0, arg5 >> 16, arg4 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
									arg5 += local95;
									arg4 += local80;
									arg6 += local143;
									arg0 += Static129.anInt3144;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							Pix3D.method1917(Static129.anIntArray297, local5, arg0, arg5 >> 16, arg3 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
							arg5 += local95;
							arg3 += local65;
							arg6 += local143;
							arg0 += Static129.anInt3144;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1917(Static129.anIntArray297, local5, arg0, arg4 >> 16, arg5 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
									arg5 += local95;
									arg4 += local80;
									arg6 += local143;
									arg0 += Static129.anInt3144;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							Pix3D.method1917(Static129.anIntArray297, local5, arg0, arg3 >> 16, arg5 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
							arg5 += local95;
							arg3 += local65;
							arg6 += local143;
							arg0 += Static129.anInt3144;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local95 * arg0;
						arg3 -= local65 * arg0;
						arg6 -= local143 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local80 * arg2;
						arg2 = 0;
					}
					local336 = arg0 - anInt2469;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if ((arg0 == arg2 || local95 >= local65) && (arg0 != arg2 || local80 <= local65)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									Pix3D.method1917(Static129.anIntArray297, local5, arg0, arg3 >> 16, arg5 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
									arg5 += local80;
									arg3 += local65;
									arg6 += local143;
									arg0 += Static129.anInt3144;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							Pix3D.method1917(Static129.anIntArray297, local5, arg0, arg3 >> 16, arg4 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
							arg4 += local95;
							arg3 += local65;
							arg6 += local143;
							arg0 += Static129.anInt3144;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									Pix3D.method1917(Static129.anIntArray297, local5, arg0, arg5 >> 16, arg3 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
									arg5 += local80;
									arg3 += local65;
									arg6 += local143;
									arg0 += Static129.anInt3144;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							Pix3D.method1917(Static129.anIntArray297, local5, arg0, arg4 >> 16, arg3 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
							arg4 += local95;
							arg3 += local65;
							arg6 += local143;
							arg0 += Static129.anInt3144;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < Pix3D.anInt2470) {
				if (arg2 > Pix3D.anInt2470) {
					arg2 = Pix3D.anInt2470;
				}
				if (arg0 > Pix3D.anInt2470) {
					arg0 = Pix3D.anInt2470;
				}
				arg7 = (arg7 << 9) + local131 - local131 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local65 * arg1;
						arg4 -= local80 * arg1;
						arg7 -= local143 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local95 * arg2;
						arg2 = 0;
					}
					local336 = arg1 - anInt2469;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if (arg1 != arg2 && local65 < local80 || arg1 == arg2 && local65 > local95) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									Pix3D.method1917(Static129.anIntArray297, local5, arg1, arg3 >> 16, arg5 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
									arg3 += local65;
									arg5 += local95;
									arg7 += local143;
									arg1 += Static129.anInt3144;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							Pix3D.method1917(Static129.anIntArray297, local5, arg1, arg3 >> 16, arg4 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
							arg3 += local65;
							arg4 += local80;
							arg7 += local143;
							arg1 += Static129.anInt3144;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									Pix3D.method1917(Static129.anIntArray297, local5, arg1, arg5 >> 16, arg3 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
									arg3 += local65;
									arg5 += local95;
									arg7 += local143;
									arg1 += Static129.anInt3144;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							Pix3D.method1917(Static129.anIntArray297, local5, arg1, arg4 >> 16, arg3 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
							arg3 += local65;
							arg4 += local80;
							arg7 += local143;
							arg1 += Static129.anInt3144;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local65 * arg1;
						arg4 -= local80 * arg1;
						arg7 -= local143 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local95 * arg0;
						arg0 = 0;
					}
					local336 = arg1 - anInt2469;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if (local65 < local80) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1917(Static129.anIntArray297, local5, arg1, arg3 >> 16, arg4 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
									arg3 += local95;
									arg4 += local80;
									arg7 += local143;
									arg1 += Static129.anInt3144;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							Pix3D.method1917(Static129.anIntArray297, local5, arg1, arg5 >> 16, arg4 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
							arg5 += local65;
							arg4 += local80;
							arg7 += local143;
							arg1 += Static129.anInt3144;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1917(Static129.anIntArray297, local5, arg1, arg4 >> 16, arg3 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
									arg3 += local95;
									arg4 += local80;
									arg7 += local143;
									arg1 += Static129.anInt3144;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							Pix3D.method1917(Static129.anIntArray297, local5, arg1, arg4 >> 16, arg5 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
							arg5 += local65;
							arg4 += local80;
							arg7 += local143;
							arg1 += Static129.anInt3144;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				}
			}
		} else if (arg2 < Pix3D.anInt2470) {
			if (arg0 > Pix3D.anInt2470) {
				arg0 = Pix3D.anInt2470;
			}
			if (arg1 > Pix3D.anInt2470) {
				arg1 = Pix3D.anInt2470;
			}
			arg8 = (arg8 << 9) + local131 - local131 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local80 * arg2;
					arg5 -= local95 * arg2;
					arg8 -= local143 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local65 * arg0;
					arg0 = 0;
				}
				local336 = arg2 - anInt2469;
				local177 += local197 * local336;
				local207 += local227 * local336;
				local237 += local257 * local336;
				if (local80 < local95) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Pix3D.method1917(Static129.anIntArray297, local5, arg2, arg4 >> 16, arg3 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
								arg4 += local80;
								arg3 += local65;
								arg8 += local143;
								arg2 += Static129.anInt3144;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}
						Pix3D.method1917(Static129.anIntArray297, local5, arg2, arg4 >> 16, arg5 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
						arg4 += local80;
						arg5 += local95;
						arg8 += local143;
						arg2 += Static129.anInt3144;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Pix3D.method1917(Static129.anIntArray297, local5, arg2, arg3 >> 16, arg4 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
								arg4 += local80;
								arg3 += local65;
								arg8 += local143;
								arg2 += Static129.anInt3144;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}
						Pix3D.method1917(Static129.anIntArray297, local5, arg2, arg5 >> 16, arg4 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
						arg4 += local80;
						arg5 += local95;
						arg8 += local143;
						arg2 += Static129.anInt3144;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local80 * arg2;
					arg5 -= local95 * arg2;
					arg8 -= local143 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local65 * arg1;
					arg1 = 0;
				}
				local336 = arg2 - anInt2469;
				local177 += local197 * local336;
				local207 += local227 * local336;
				local237 += local257 * local336;
				if (local80 < local95) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Pix3D.method1917(Static129.anIntArray297, local5, arg2, arg4 >> 16, arg5 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
								arg4 += local65;
								arg5 += local95;
								arg8 += local143;
								arg2 += Static129.anInt3144;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}
						Pix3D.method1917(Static129.anIntArray297, local5, arg2, arg3 >> 16, arg5 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
						arg3 += local80;
						arg5 += local95;
						arg8 += local143;
						arg2 += Static129.anInt3144;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Pix3D.method1917(Static129.anIntArray297, local5, arg2, arg5 >> 16, arg4 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
								arg4 += local65;
								arg5 += local95;
								arg8 += local143;
								arg2 += Static129.anInt3144;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}
						Pix3D.method1917(Static129.anIntArray297, local5, arg2, arg5 >> 16, arg3 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
						arg3 += local80;
						arg5 += local95;
						arg8 += local143;
						arg2 += Static129.anInt3144;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!hf", name = "a", descriptor = "(II)I")
	private static int method1910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

    @OriginalMember(owner = "com.jagex3.client.client!hf", name = "b", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public static void method1912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18) {
		@Pc(5) int[] local5 = anInterface1_2.method3232(arg18, Pix3D.aFloat11);
		@Pc(15) int local15;
		if (local5 == null || anInt2473 > 10) {
			local15 = anInterface1_2.method3234(arg18);
			aBoolean134 = true;
			method1928(arg0, arg1, arg2, arg3, arg4, arg5, method1910(local15, arg6), method1910(local15, arg7), method1910(local15, arg8));
			return;
		}
		Pix3D.aBoolean137 = anInterface1_2.method3233(arg18);
		Pix3D.aBoolean135 = anInterface1_2.method3226(arg18);
		local15 = arg4 - arg3;
		@Pc(52) int local52 = arg1 - arg0;
		@Pc(56) int local56 = arg5 - arg3;
		@Pc(60) int local60 = arg2 - arg0;
		@Pc(64) int local64 = arg7 - arg6;
		@Pc(68) int local68 = arg8 - arg6;
		@Pc(70) int local70 = 0;
		if (arg1 != arg0) {
			local70 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(85) int local85 = 0;
		if (arg2 != arg1) {
			local85 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(100) int local100 = 0;
		if (arg2 != arg0) {
			local100 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(121) int local121 = local15 * local60 - local56 * local52;
		if (local121 == 0) {
			return;
		}
		@Pc(136) int local136 = (local64 * local60 - local68 * local52 << 9) / local121;
		@Pc(148) int local148 = (local68 * local15 - local64 * local56 << 9) / local121;
		@Pc(152) int local152 = arg9 - arg10;
		@Pc(156) int local156 = arg12 - arg13;
		@Pc(160) int local160 = arg15 - arg16;
		@Pc(164) int local164 = arg11 - arg9;
		@Pc(168) int local168 = arg14 - arg12;
		@Pc(172) int local172 = arg17 - arg15;
		@Pc(182) int local182 = local164 * arg12 - local168 * arg9 << 14;
		@Pc(192) int local192 = local168 * arg15 - local172 * arg12 << 8;
		@Pc(202) int local202 = local172 * arg9 - local164 * arg15 << 5;
		@Pc(212) int local212 = local152 * arg12 - local156 * arg9 << 14;
		@Pc(222) int local222 = local156 * arg15 - local160 * arg12 << 8;
		@Pc(232) int local232 = local160 * arg9 - local152 * arg15 << 5;
		@Pc(242) int local242 = local156 * local164 - local152 * local168 << 14;
		@Pc(252) int local252 = local160 * local168 - local156 * local172 << 8;
		@Pc(262) int local262 = local152 * local172 - local160 * local164 << 5;
		@Pc(341) int local341;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < Pix3D.anInt2470) {
				if (arg1 > Pix3D.anInt2470) {
					arg1 = Pix3D.anInt2470;
				}
				if (arg2 > Pix3D.anInt2470) {
					arg2 = Pix3D.anInt2470;
				}
				arg6 = (arg6 << 9) + local136 - local136 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local100 * arg0;
						arg3 -= local70 * arg0;
						arg6 -= local148 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local85 * arg1;
						arg1 = 0;
					}
					local341 = arg0 - anInt2469;
					local182 += local202 * local341;
					local212 += local232 * local341;
					local242 += local262 * local341;
					if (arg0 != arg1 && local100 < local70 || arg0 == arg1 && local100 > local85) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1916(Static129.anIntArray297, local5, arg0, arg5 >> 16, arg4 >> 16, arg6, local136, local182, local212, local242, local192, local222, local252);
									arg5 += local100;
									arg4 += local85;
									arg6 += local148;
									arg0 += Static129.anInt3144;
									local182 += local202;
									local212 += local232;
									local242 += local262;
								}
							}
							Pix3D.method1916(Static129.anIntArray297, local5, arg0, arg5 >> 16, arg3 >> 16, arg6, local136, local182, local212, local242, local192, local222, local252);
							arg5 += local100;
							arg3 += local70;
							arg6 += local148;
							arg0 += Static129.anInt3144;
							local182 += local202;
							local212 += local232;
							local242 += local262;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1916(Static129.anIntArray297, local5, arg0, arg4 >> 16, arg5 >> 16, arg6, local136, local182, local212, local242, local192, local222, local252);
									arg5 += local100;
									arg4 += local85;
									arg6 += local148;
									arg0 += Static129.anInt3144;
									local182 += local202;
									local212 += local232;
									local242 += local262;
								}
							}
							Pix3D.method1916(Static129.anIntArray297, local5, arg0, arg3 >> 16, arg5 >> 16, arg6, local136, local182, local212, local242, local192, local222, local252);
							arg5 += local100;
							arg3 += local70;
							arg6 += local148;
							arg0 += Static129.anInt3144;
							local182 += local202;
							local212 += local232;
							local242 += local262;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local100 * arg0;
						arg3 -= local70 * arg0;
						arg6 -= local148 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local85 * arg2;
						arg2 = 0;
					}
					local341 = arg0 - anInt2469;
					local182 += local202 * local341;
					local212 += local232 * local341;
					local242 += local262 * local341;
					if ((arg0 == arg2 || local100 >= local70) && (arg0 != arg2 || local85 <= local70)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									Pix3D.method1916(Static129.anIntArray297, local5, arg0, arg3 >> 16, arg5 >> 16, arg6, local136, local182, local212, local242, local192, local222, local252);
									arg5 += local85;
									arg3 += local70;
									arg6 += local148;
									arg0 += Static129.anInt3144;
									local182 += local202;
									local212 += local232;
									local242 += local262;
								}
							}
							Pix3D.method1916(Static129.anIntArray297, local5, arg0, arg3 >> 16, arg4 >> 16, arg6, local136, local182, local212, local242, local192, local222, local252);
							arg4 += local100;
							arg3 += local70;
							arg6 += local148;
							arg0 += Static129.anInt3144;
							local182 += local202;
							local212 += local232;
							local242 += local262;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									Pix3D.method1916(Static129.anIntArray297, local5, arg0, arg5 >> 16, arg3 >> 16, arg6, local136, local182, local212, local242, local192, local222, local252);
									arg5 += local85;
									arg3 += local70;
									arg6 += local148;
									arg0 += Static129.anInt3144;
									local182 += local202;
									local212 += local232;
									local242 += local262;
								}
							}
							Pix3D.method1916(Static129.anIntArray297, local5, arg0, arg4 >> 16, arg3 >> 16, arg6, local136, local182, local212, local242, local192, local222, local252);
							arg4 += local100;
							arg3 += local70;
							arg6 += local148;
							arg0 += Static129.anInt3144;
							local182 += local202;
							local212 += local232;
							local242 += local262;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < Pix3D.anInt2470) {
				if (arg2 > Pix3D.anInt2470) {
					arg2 = Pix3D.anInt2470;
				}
				if (arg0 > Pix3D.anInt2470) {
					arg0 = Pix3D.anInt2470;
				}
				arg7 = (arg7 << 9) + local136 - local136 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local70 * arg1;
						arg4 -= local85 * arg1;
						arg7 -= local148 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local100 * arg2;
						arg2 = 0;
					}
					local341 = arg1 - anInt2469;
					local182 += local202 * local341;
					local212 += local232 * local341;
					local242 += local262 * local341;
					if (arg1 != arg2 && local70 < local85 || arg1 == arg2 && local70 > local100) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									Pix3D.method1916(Static129.anIntArray297, local5, arg1, arg3 >> 16, arg5 >> 16, arg7, local136, local182, local212, local242, local192, local222, local252);
									arg3 += local70;
									arg5 += local100;
									arg7 += local148;
									arg1 += Static129.anInt3144;
									local182 += local202;
									local212 += local232;
									local242 += local262;
								}
							}
							Pix3D.method1916(Static129.anIntArray297, local5, arg1, arg3 >> 16, arg4 >> 16, arg7, local136, local182, local212, local242, local192, local222, local252);
							arg3 += local70;
							arg4 += local85;
							arg7 += local148;
							arg1 += Static129.anInt3144;
							local182 += local202;
							local212 += local232;
							local242 += local262;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									Pix3D.method1916(Static129.anIntArray297, local5, arg1, arg5 >> 16, arg3 >> 16, arg7, local136, local182, local212, local242, local192, local222, local252);
									arg3 += local70;
									arg5 += local100;
									arg7 += local148;
									arg1 += Static129.anInt3144;
									local182 += local202;
									local212 += local232;
									local242 += local262;
								}
							}
							Pix3D.method1916(Static129.anIntArray297, local5, arg1, arg4 >> 16, arg3 >> 16, arg7, local136, local182, local212, local242, local192, local222, local252);
							arg3 += local70;
							arg4 += local85;
							arg7 += local148;
							arg1 += Static129.anInt3144;
							local182 += local202;
							local212 += local232;
							local242 += local262;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local70 * arg1;
						arg4 -= local85 * arg1;
						arg7 -= local148 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local100 * arg0;
						arg0 = 0;
					}
					local341 = arg1 - anInt2469;
					local182 += local202 * local341;
					local212 += local232 * local341;
					local242 += local262 * local341;
					if (local70 < local85) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1916(Static129.anIntArray297, local5, arg1, arg3 >> 16, arg4 >> 16, arg7, local136, local182, local212, local242, local192, local222, local252);
									arg3 += local100;
									arg4 += local85;
									arg7 += local148;
									arg1 += Static129.anInt3144;
									local182 += local202;
									local212 += local232;
									local242 += local262;
								}
							}
							Pix3D.method1916(Static129.anIntArray297, local5, arg1, arg5 >> 16, arg4 >> 16, arg7, local136, local182, local212, local242, local192, local222, local252);
							arg5 += local70;
							arg4 += local85;
							arg7 += local148;
							arg1 += Static129.anInt3144;
							local182 += local202;
							local212 += local232;
							local242 += local262;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1916(Static129.anIntArray297, local5, arg1, arg4 >> 16, arg3 >> 16, arg7, local136, local182, local212, local242, local192, local222, local252);
									arg3 += local100;
									arg4 += local85;
									arg7 += local148;
									arg1 += Static129.anInt3144;
									local182 += local202;
									local212 += local232;
									local242 += local262;
								}
							}
							Pix3D.method1916(Static129.anIntArray297, local5, arg1, arg4 >> 16, arg5 >> 16, arg7, local136, local182, local212, local242, local192, local222, local252);
							arg5 += local70;
							arg4 += local85;
							arg7 += local148;
							arg1 += Static129.anInt3144;
							local182 += local202;
							local212 += local232;
							local242 += local262;
						}
					}
				}
			}
		} else if (arg2 < Pix3D.anInt2470) {
			if (arg0 > Pix3D.anInt2470) {
				arg0 = Pix3D.anInt2470;
			}
			if (arg1 > Pix3D.anInt2470) {
				arg1 = Pix3D.anInt2470;
			}
			arg8 = (arg8 << 9) + local136 - local136 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local85 * arg2;
					arg5 -= local100 * arg2;
					arg8 -= local148 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local70 * arg0;
					arg0 = 0;
				}
				local341 = arg2 - anInt2469;
				local182 += local202 * local341;
				local212 += local232 * local341;
				local242 += local262 * local341;
				if (local85 < local100) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Pix3D.method1916(Static129.anIntArray297, local5, arg2, arg4 >> 16, arg3 >> 16, arg8, local136, local182, local212, local242, local192, local222, local252);
								arg4 += local85;
								arg3 += local70;
								arg8 += local148;
								arg2 += Static129.anInt3144;
								local182 += local202;
								local212 += local232;
								local242 += local262;
							}
						}
						Pix3D.method1916(Static129.anIntArray297, local5, arg2, arg4 >> 16, arg5 >> 16, arg8, local136, local182, local212, local242, local192, local222, local252);
						arg4 += local85;
						arg5 += local100;
						arg8 += local148;
						arg2 += Static129.anInt3144;
						local182 += local202;
						local212 += local232;
						local242 += local262;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Pix3D.method1916(Static129.anIntArray297, local5, arg2, arg3 >> 16, arg4 >> 16, arg8, local136, local182, local212, local242, local192, local222, local252);
								arg4 += local85;
								arg3 += local70;
								arg8 += local148;
								arg2 += Static129.anInt3144;
								local182 += local202;
								local212 += local232;
								local242 += local262;
							}
						}
						Pix3D.method1916(Static129.anIntArray297, local5, arg2, arg5 >> 16, arg4 >> 16, arg8, local136, local182, local212, local242, local192, local222, local252);
						arg4 += local85;
						arg5 += local100;
						arg8 += local148;
						arg2 += Static129.anInt3144;
						local182 += local202;
						local212 += local232;
						local242 += local262;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local85 * arg2;
					arg5 -= local100 * arg2;
					arg8 -= local148 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local70 * arg1;
					arg1 = 0;
				}
				local341 = arg2 - anInt2469;
				local182 += local202 * local341;
				local212 += local232 * local341;
				local242 += local262 * local341;
				if (local85 < local100) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Pix3D.method1916(Static129.anIntArray297, local5, arg2, arg4 >> 16, arg5 >> 16, arg8, local136, local182, local212, local242, local192, local222, local252);
								arg4 += local70;
								arg5 += local100;
								arg8 += local148;
								arg2 += Static129.anInt3144;
								local182 += local202;
								local212 += local232;
								local242 += local262;
							}
						}
						Pix3D.method1916(Static129.anIntArray297, local5, arg2, arg3 >> 16, arg5 >> 16, arg8, local136, local182, local212, local242, local192, local222, local252);
						arg3 += local85;
						arg5 += local100;
						arg8 += local148;
						arg2 += Static129.anInt3144;
						local182 += local202;
						local212 += local232;
						local242 += local262;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Pix3D.method1916(Static129.anIntArray297, local5, arg2, arg5 >> 16, arg4 >> 16, arg8, local136, local182, local212, local242, local192, local222, local252);
								arg4 += local70;
								arg5 += local100;
								arg8 += local148;
								arg2 += Static129.anInt3144;
								local182 += local202;
								local212 += local232;
								local242 += local262;
							}
						}
						Pix3D.method1916(Static129.anIntArray297, local5, arg2, arg5 >> 16, arg3 >> 16, arg8, local136, local182, local212, local242, local192, local222, local252);
						arg3 += local85;
						arg5 += local100;
						arg8 += local148;
						arg2 += Static129.anInt3144;
						local182 += local202;
						local212 += local232;
						local242 += local262;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!hf", name = "b", descriptor = "()I")
	public static int method1913() {
		return Pix3D.anIntArray221[0] % Static129.anInt3144;
	}

    @OriginalMember(owner = "com.jagex3.client.client!hf", name = "c", descriptor = "()V")
	public static void method1915() {
		anInt2471 = anInt2472 / 2;
		anInt2469 = Pix3D.anInt2470 / 2;
		Static240.anInt5334 = -anInt2471;
		Static247.anInt5405 = anInt2472 - anInt2471;
		Static1.anInt4 = -anInt2469;
		Static148.anInt3535 = Pix3D.anInt2470 - anInt2469;
	}

    @OriginalMember(owner = "com.jagex3.client.client!hf", name = "a", descriptor = "(IIIIIII)V")
	public static void method1918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		if (arg1 != arg0) {
			local1 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(16) int local16 = 0;
		if (arg2 != arg1) {
			local16 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(31) int local31 = 0;
		if (arg2 != arg0) {
			local31 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < Pix3D.anInt2470) {
				if (arg1 > Pix3D.anInt2470) {
					arg1 = Pix3D.anInt2470;
				}
				if (arg2 > Pix3D.anInt2470) {
					arg2 = Pix3D.anInt2470;
				}
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local31 * arg0;
						arg3 -= local1 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local16 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && local31 < local1 || arg0 == arg1 && local31 > local16) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1923(Static129.anIntArray297, arg0, arg6, arg5 >> 16, arg4 >> 16);
									arg5 += local31;
									arg4 += local16;
									arg0 += Static129.anInt3144;
								}
							}
							Pix3D.method1923(Static129.anIntArray297, arg0, arg6, arg5 >> 16, arg3 >> 16);
							arg5 += local31;
							arg3 += local1;
							arg0 += Static129.anInt3144;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1923(Static129.anIntArray297, arg0, arg6, arg4 >> 16, arg5 >> 16);
									arg5 += local31;
									arg4 += local16;
									arg0 += Static129.anInt3144;
								}
							}
							Pix3D.method1923(Static129.anIntArray297, arg0, arg6, arg3 >> 16, arg5 >> 16);
							arg5 += local31;
							arg3 += local1;
							arg0 += Static129.anInt3144;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local31 * arg0;
						arg3 -= local1 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local16 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local31 < local1 || arg0 == arg2 && local16 > local1) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									Pix3D.method1923(Static129.anIntArray297, arg0, arg6, arg5 >> 16, arg3 >> 16);
									arg5 += local16;
									arg3 += local1;
									arg0 += Static129.anInt3144;
								}
							}
							Pix3D.method1923(Static129.anIntArray297, arg0, arg6, arg4 >> 16, arg3 >> 16);
							arg4 += local31;
							arg3 += local1;
							arg0 += Static129.anInt3144;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									Pix3D.method1923(Static129.anIntArray297, arg0, arg6, arg3 >> 16, arg5 >> 16);
									arg5 += local16;
									arg3 += local1;
									arg0 += Static129.anInt3144;
								}
							}
							Pix3D.method1923(Static129.anIntArray297, arg0, arg6, arg3 >> 16, arg4 >> 16);
							arg4 += local31;
							arg3 += local1;
							arg0 += Static129.anInt3144;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < Pix3D.anInt2470) {
				if (arg2 > Pix3D.anInt2470) {
					arg2 = Pix3D.anInt2470;
				}
				if (arg0 > Pix3D.anInt2470) {
					arg0 = Pix3D.anInt2470;
				}
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local1 * arg1;
						arg4 -= local16 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local31 * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && local1 < local16 || arg1 == arg2 && local1 > local31) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									Pix3D.method1923(Static129.anIntArray297, arg1, arg6, arg3 >> 16, arg5 >> 16);
									arg3 += local1;
									arg5 += local31;
									arg1 += Static129.anInt3144;
								}
							}
							Pix3D.method1923(Static129.anIntArray297, arg1, arg6, arg3 >> 16, arg4 >> 16);
							arg3 += local1;
							arg4 += local16;
							arg1 += Static129.anInt3144;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									Pix3D.method1923(Static129.anIntArray297, arg1, arg6, arg5 >> 16, arg3 >> 16);
									arg3 += local1;
									arg5 += local31;
									arg1 += Static129.anInt3144;
								}
							}
							Pix3D.method1923(Static129.anIntArray297, arg1, arg6, arg4 >> 16, arg3 >> 16);
							arg3 += local1;
							arg4 += local16;
							arg1 += Static129.anInt3144;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local1 * arg1;
						arg4 -= local16 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local31 * arg0;
						arg0 = 0;
					}
					if (local1 < local16) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1923(Static129.anIntArray297, arg1, arg6, arg3 >> 16, arg4 >> 16);
									arg3 += local31;
									arg4 += local16;
									arg1 += Static129.anInt3144;
								}
							}
							Pix3D.method1923(Static129.anIntArray297, arg1, arg6, arg5 >> 16, arg4 >> 16);
							arg5 += local1;
							arg4 += local16;
							arg1 += Static129.anInt3144;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1923(Static129.anIntArray297, arg1, arg6, arg4 >> 16, arg3 >> 16);
									arg3 += local31;
									arg4 += local16;
									arg1 += Static129.anInt3144;
								}
							}
							Pix3D.method1923(Static129.anIntArray297, arg1, arg6, arg4 >> 16, arg5 >> 16);
							arg5 += local1;
							arg4 += local16;
							arg1 += Static129.anInt3144;
						}
					}
				}
			}
		} else if (arg2 < Pix3D.anInt2470) {
			if (arg0 > Pix3D.anInt2470) {
				arg0 = Pix3D.anInt2470;
			}
			if (arg1 > Pix3D.anInt2470) {
				arg1 = Pix3D.anInt2470;
			}
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local16 * arg2;
					arg5 -= local31 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local1 * arg0;
					arg0 = 0;
				}
				if (local16 < local31) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Pix3D.method1923(Static129.anIntArray297, arg2, arg6, arg4 >> 16, arg3 >> 16);
								arg4 += local16;
								arg3 += local1;
								arg2 += Static129.anInt3144;
							}
						}
						Pix3D.method1923(Static129.anIntArray297, arg2, arg6, arg4 >> 16, arg5 >> 16);
						arg4 += local16;
						arg5 += local31;
						arg2 += Static129.anInt3144;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Pix3D.method1923(Static129.anIntArray297, arg2, arg6, arg3 >> 16, arg4 >> 16);
								arg4 += local16;
								arg3 += local1;
								arg2 += Static129.anInt3144;
							}
						}
						Pix3D.method1923(Static129.anIntArray297, arg2, arg6, arg5 >> 16, arg4 >> 16);
						arg4 += local16;
						arg5 += local31;
						arg2 += Static129.anInt3144;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local16 * arg2;
					arg5 -= local31 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local1 * arg1;
					arg1 = 0;
				}
				if (local16 < local31) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Pix3D.method1923(Static129.anIntArray297, arg2, arg6, arg4 >> 16, arg5 >> 16);
								arg4 += local1;
								arg5 += local31;
								arg2 += Static129.anInt3144;
							}
						}
						Pix3D.method1923(Static129.anIntArray297, arg2, arg6, arg3 >> 16, arg5 >> 16);
						arg3 += local16;
						arg5 += local31;
						arg2 += Static129.anInt3144;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Pix3D.method1923(Static129.anIntArray297, arg2, arg6, arg5 >> 16, arg4 >> 16);
								arg4 += local1;
								arg5 += local31;
								arg2 += Static129.anInt3144;
							}
						}
						Pix3D.method1923(Static129.anIntArray297, arg2, arg6, arg5 >> 16, arg3 >> 16);
						arg3 += local16;
						arg5 += local31;
						arg2 += Static129.anInt3144;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!hf", name = "b", descriptor = "(II)V")
	public static void method1919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = Pix3D.anIntArray221[0];
		@Pc(7) int local7 = local3 / Static129.anInt3144;
		@Pc(13) int local13 = local3 - local7 * Static129.anInt3144;
		anInt2471 = arg0 - local13;
		anInt2469 = arg1 - local7;
		Static240.anInt5334 = -anInt2471;
		Static247.anInt5405 = anInt2472 - anInt2471;
		Static1.anInt4 = -anInt2469;
		Static148.anInt3535 = Pix3D.anInt2470 - anInt2469;
	}

    @OriginalMember(owner = "com.jagex3.client.client!hf", name = "a", descriptor = "([BIIIIIII)V")
	public static void method1921(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) int local1 = 0;
		if (arg2 != arg1) {
			local1 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(16) int local16 = 0;
		if (arg3 != arg2) {
			local16 = (arg6 - arg5 << 16) / (arg3 - arg2);
		}
		@Pc(31) int local31 = 0;
		if (arg3 != arg1) {
			local31 = (arg4 - arg6 << 16) / (arg1 - arg3);
		}
		if (arg1 <= arg2 && arg1 <= arg3) {
			if (arg2 < arg3) {
				arg6 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg6 -= local31 * arg1;
					arg4 -= local1 * arg1;
					arg1 = 0;
				}
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local16 * arg2;
					arg2 = 0;
				}
				if ((arg1 == arg2 || local31 >= local1) && (arg1 != arg2 || local31 <= local16)) {
					arg3 -= arg2;
					arg2 -= arg1;
					arg1 *= arg7;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Pix3D.method1930(arg0, arg1, arg5 >> 16, arg6 >> 16);
								arg6 += local31;
								arg5 += local16;
								arg1 += arg7;
							}
						}
						Pix3D.method1930(arg0, arg1, arg4 >> 16, arg6 >> 16);
						arg6 += local31;
						arg4 += local1;
						arg1 += arg7;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg1;
					arg1 *= arg7;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Pix3D.method1930(arg0, arg1, arg6 >> 16, arg5 >> 16);
								arg6 += local31;
								arg5 += local16;
								arg1 += arg7;
							}
						}
						Pix3D.method1930(arg0, arg1, arg6 >> 16, arg4 >> 16);
						arg6 += local31;
						arg4 += local1;
						arg1 += arg7;
					}
				}
			} else {
				arg5 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= local31 * arg1;
					arg4 -= local1 * arg1;
					arg1 = 0;
				}
				arg6 <<= 0x10;
				if (arg3 < 0) {
					arg6 -= local16 * arg3;
					arg3 = 0;
				}
				if ((arg1 == arg3 || local31 >= local1) && (arg1 != arg3 || local16 <= local1)) {
					arg2 -= arg3;
					arg3 -= arg1;
					arg1 *= arg7;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Pix3D.method1930(arg0, arg1, arg4 >> 16, arg6 >> 16);
								arg6 += local16;
								arg4 += local1;
								arg1 += arg7;
							}
						}
						Pix3D.method1930(arg0, arg1, arg4 >> 16, arg5 >> 16);
						arg5 += local31;
						arg4 += local1;
						arg1 += arg7;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg1;
					arg1 *= arg7;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Pix3D.method1930(arg0, arg1, arg6 >> 16, arg4 >> 16);
								arg6 += local16;
								arg4 += local1;
								arg1 += arg7;
							}
						}
						Pix3D.method1930(arg0, arg1, arg5 >> 16, arg4 >> 16);
						arg5 += local31;
						arg4 += local1;
						arg1 += arg7;
					}
				}
			}
		} else if (arg2 <= arg3) {
			if (arg3 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local1 * arg2;
					arg5 -= local16 * arg2;
					arg2 = 0;
				}
				arg6 <<= 0x10;
				if (arg3 < 0) {
					arg6 -= local31 * arg3;
					arg3 = 0;
				}
				if (arg2 != arg3 && local1 < local16 || arg2 == arg3 && local1 > local31) {
					arg1 -= arg3;
					arg3 -= arg2;
					arg2 *= arg7;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Pix3D.method1930(arg0, arg2, arg4 >> 16, arg6 >> 16);
								arg4 += local1;
								arg6 += local31;
								arg2 += arg7;
							}
						}
						Pix3D.method1930(arg0, arg2, arg4 >> 16, arg5 >> 16);
						arg4 += local1;
						arg5 += local16;
						arg2 += arg7;
					}
				} else {
					arg1 -= arg3;
					arg3 -= arg2;
					arg2 *= arg7;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Pix3D.method1930(arg0, arg2, arg6 >> 16, arg4 >> 16);
								arg4 += local1;
								arg6 += local31;
								arg2 += arg7;
							}
						}
						Pix3D.method1930(arg0, arg2, arg5 >> 16, arg4 >> 16);
						arg4 += local1;
						arg5 += local16;
						arg2 += arg7;
					}
				}
			} else {
				arg6 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg6 -= local1 * arg2;
					arg5 -= local16 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local31 * arg1;
					arg1 = 0;
				}
				if (local1 < local16) {
					arg3 -= arg1;
					arg1 -= arg2;
					arg2 *= arg7;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Pix3D.method1930(arg0, arg2, arg4 >> 16, arg5 >> 16);
								arg4 += local31;
								arg5 += local16;
								arg2 += arg7;
							}
						}
						Pix3D.method1930(arg0, arg2, arg6 >> 16, arg5 >> 16);
						arg6 += local1;
						arg5 += local16;
						arg2 += arg7;
					}
				} else {
					arg3 -= arg1;
					arg1 -= arg2;
					arg2 *= arg7;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Pix3D.method1930(arg0, arg2, arg5 >> 16, arg4 >> 16);
								arg4 += local31;
								arg5 += local16;
								arg2 += arg7;
							}
						}
						Pix3D.method1930(arg0, arg2, arg5 >> 16, arg6 >> 16);
						arg6 += local1;
						arg5 += local16;
						arg2 += arg7;
					}
				}
			}
		} else if (arg1 < arg2) {
			arg5 = arg6 <<= 0x10;
			if (arg3 < 0) {
				arg5 -= local16 * arg3;
				arg6 -= local31 * arg3;
				arg3 = 0;
			}
			arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= local1 * arg1;
				arg1 = 0;
			}
			if (local16 < local31) {
				arg2 -= arg1;
				arg1 -= arg3;
				arg3 *= arg7;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Pix3D.method1930(arg0, arg3, arg5 >> 16, arg4 >> 16);
							arg5 += local16;
							arg4 += local1;
							arg3 += arg7;
						}
					}
					Pix3D.method1930(arg0, arg3, arg5 >> 16, arg6 >> 16);
					arg5 += local16;
					arg6 += local31;
					arg3 += arg7;
				}
			} else {
				arg2 -= arg1;
				arg1 -= arg3;
				arg3 *= arg7;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Pix3D.method1930(arg0, arg3, arg4 >> 16, arg5 >> 16);
							arg5 += local16;
							arg4 += local1;
							arg3 += arg7;
						}
					}
					Pix3D.method1930(arg0, arg3, arg6 >> 16, arg5 >> 16);
					arg5 += local16;
					arg6 += local31;
					arg3 += arg7;
				}
			}
		} else {
			arg4 = arg6 <<= 0x10;
			if (arg3 < 0) {
				arg4 -= local16 * arg3;
				arg6 -= local31 * arg3;
				arg3 = 0;
			}
			arg5 <<= 0x10;
			if (arg2 < 0) {
				arg5 -= local1 * arg2;
				arg2 = 0;
			}
			if (local16 < local31) {
				arg1 -= arg2;
				arg2 -= arg3;
				arg3 *= arg7;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Pix3D.method1930(arg0, arg3, arg5 >> 16, arg6 >> 16);
							arg5 += local1;
							arg6 += local31;
							arg3 += arg7;
						}
					}
					Pix3D.method1930(arg0, arg3, arg4 >> 16, arg6 >> 16);
					arg4 += local16;
					arg6 += local31;
					arg3 += arg7;
				}
			} else {
				arg1 -= arg2;
				arg2 -= arg3;
				arg3 *= arg7;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Pix3D.method1930(arg0, arg3, arg6 >> 16, arg5 >> 16);
							arg5 += local1;
							arg6 += local31;
							arg3 += arg7;
						}
					}
					Pix3D.method1930(arg0, arg3, arg6 >> 16, arg4 >> 16);
					arg4 += local16;
					arg6 += local31;
					arg3 += arg7;
				}
			}
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!hf", name = "a", descriptor = "(III)V")
	public static void method1922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		aBoolean138 = arg0 < 0 || arg0 > anInt2472 || arg1 < 0 || arg1 > anInt2472 || arg2 < 0 || arg2 > anInt2472;
	}

    @OriginalMember(owner = "com.jagex3.client.client!hf", name = "d", descriptor = "()I")
	public static int method1927() {
		return Pix3D.anIntArray221[0] / Static129.anInt3144;
	}

	@OriginalMember(owner = "com.jagex3.client.client!hf", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg4 - arg3;
		@Pc(7) int local7 = arg1 - arg0;
		@Pc(11) int local11 = arg5 - arg3;
		@Pc(15) int local15 = arg2 - arg0;
		@Pc(19) int local19 = arg7 - arg6;
		@Pc(23) int local23 = arg8 - arg6;
		@Pc(36) int local36;
		if (arg2 == arg1) {
			local36 = 0;
		} else {
			local36 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(48) int local48;
		if (arg1 == arg0) {
			local48 = 0;
		} else {
			local48 = (local3 << 16) / local7;
		}
		@Pc(60) int local60;
		if (arg2 == arg0) {
			local60 = 0;
		} else {
			local60 = (local11 << 16) / local15;
		}
		@Pc(71) int local71 = local3 * local15 - local11 * local7;
		if (local71 == 0) {
			return;
		}
		@Pc(86) int local86 = (local19 * local15 - local23 * local7 << 8) / local71;
		@Pc(98) int local98 = (local23 * local3 - local19 * local11 << 8) / local71;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < Pix3D.anInt2470) {
				if (arg1 > Pix3D.anInt2470) {
					arg1 = Pix3D.anInt2470;
				}
				if (arg2 > Pix3D.anInt2470) {
					arg2 = Pix3D.anInt2470;
				}
				arg6 = (arg6 << 8) + local86 - local86 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local60 * arg0;
						arg3 -= local48 * arg0;
						arg6 -= local98 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local36 * arg1;
						arg1 = 0;
					}
					if ((arg0 == arg1 || local60 >= local48) && (arg0 != arg1 || local60 <= local36)) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1920(Static129.anIntArray297, arg0, arg4 >> 16, arg5 >> 16, arg6, local86);
									arg5 += local60;
									arg4 += local36;
									arg6 += local98;
									arg0 += Static129.anInt3144;
								}
							}
							Pix3D.method1920(Static129.anIntArray297, arg0, arg3 >> 16, arg5 >> 16, arg6, local86);
							arg5 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += Static129.anInt3144;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1920(Static129.anIntArray297, arg0, arg5 >> 16, arg4 >> 16, arg6, local86);
									arg5 += local60;
									arg4 += local36;
									arg6 += local98;
									arg0 += Static129.anInt3144;
								}
							}
							Pix3D.method1920(Static129.anIntArray297, arg0, arg5 >> 16, arg3 >> 16, arg6, local86);
							arg5 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += Static129.anInt3144;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local60 * arg0;
						arg3 -= local48 * arg0;
						arg6 -= local98 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local36 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local60 < local48 || arg0 == arg2 && local36 > local48) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									Pix3D.method1920(Static129.anIntArray297, arg0, arg5 >> 16, arg3 >> 16, arg6, local86);
									arg5 += local36;
									arg3 += local48;
									arg6 += local98;
									arg0 += Static129.anInt3144;
								}
							}
							Pix3D.method1920(Static129.anIntArray297, arg0, arg4 >> 16, arg3 >> 16, arg6, local86);
							arg4 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += Static129.anInt3144;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									Pix3D.method1920(Static129.anIntArray297, arg0, arg3 >> 16, arg5 >> 16, arg6, local86);
									arg5 += local36;
									arg3 += local48;
									arg6 += local98;
									arg0 += Static129.anInt3144;
								}
							}
							Pix3D.method1920(Static129.anIntArray297, arg0, arg3 >> 16, arg4 >> 16, arg6, local86);
							arg4 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += Static129.anInt3144;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < Pix3D.anInt2470) {
				if (arg2 > Pix3D.anInt2470) {
					arg2 = Pix3D.anInt2470;
				}
				if (arg0 > Pix3D.anInt2470) {
					arg0 = Pix3D.anInt2470;
				}
				arg7 = (arg7 << 8) + local86 - local86 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local48 * arg1;
						arg4 -= local36 * arg1;
						arg7 -= local98 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local60 * arg2;
						arg2 = 0;
					}
					if ((arg1 == arg2 || local48 >= local36) && (arg1 != arg2 || local48 <= local60)) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									Pix3D.method1920(Static129.anIntArray297, arg1, arg5 >> 16, arg3 >> 16, arg7, local86);
									arg3 += local48;
									arg5 += local60;
									arg7 += local98;
									arg1 += Static129.anInt3144;
								}
							}
							Pix3D.method1920(Static129.anIntArray297, arg1, arg4 >> 16, arg3 >> 16, arg7, local86);
							arg3 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += Static129.anInt3144;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									Pix3D.method1920(Static129.anIntArray297, arg1, arg3 >> 16, arg5 >> 16, arg7, local86);
									arg3 += local48;
									arg5 += local60;
									arg7 += local98;
									arg1 += Static129.anInt3144;
								}
							}
							Pix3D.method1920(Static129.anIntArray297, arg1, arg3 >> 16, arg4 >> 16, arg7, local86);
							arg3 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += Static129.anInt3144;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local48 * arg1;
						arg4 -= local36 * arg1;
						arg7 -= local98 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local60 * arg0;
						arg0 = 0;
					}
					if (local48 < local36) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1920(Static129.anIntArray297, arg1, arg3 >> 16, arg4 >> 16, arg7, local86);
									arg3 += local60;
									arg4 += local36;
									arg7 += local98;
									arg1 += Static129.anInt3144;
								}
							}
							Pix3D.method1920(Static129.anIntArray297, arg1, arg5 >> 16, arg4 >> 16, arg7, local86);
							arg5 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += Static129.anInt3144;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1920(Static129.anIntArray297, arg1, arg4 >> 16, arg3 >> 16, arg7, local86);
									arg3 += local60;
									arg4 += local36;
									arg7 += local98;
									arg1 += Static129.anInt3144;
								}
							}
							Pix3D.method1920(Static129.anIntArray297, arg1, arg4 >> 16, arg5 >> 16, arg7, local86);
							arg5 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += Static129.anInt3144;
						}
					}
				}
			}
		} else if (arg2 < Pix3D.anInt2470) {
			if (arg0 > Pix3D.anInt2470) {
				arg0 = Pix3D.anInt2470;
			}
			if (arg1 > Pix3D.anInt2470) {
				arg1 = Pix3D.anInt2470;
			}
			arg8 = (arg8 << 8) + local86 - local86 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local36 * arg2;
					arg5 -= local60 * arg2;
					arg8 -= local98 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local48 * arg0;
					arg0 = 0;
				}
				if (local36 < local60) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Pix3D.method1920(Static129.anIntArray297, arg2, arg4 >> 16, arg3 >> 16, arg8, local86);
								arg4 += local36;
								arg3 += local48;
								arg8 += local98;
								arg2 += Static129.anInt3144;
							}
						}
						Pix3D.method1920(Static129.anIntArray297, arg2, arg4 >> 16, arg5 >> 16, arg8, local86);
						arg4 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += Static129.anInt3144;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Pix3D.method1920(Static129.anIntArray297, arg2, arg3 >> 16, arg4 >> 16, arg8, local86);
								arg4 += local36;
								arg3 += local48;
								arg8 += local98;
								arg2 += Static129.anInt3144;
							}
						}
						Pix3D.method1920(Static129.anIntArray297, arg2, arg5 >> 16, arg4 >> 16, arg8, local86);
						arg4 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += Static129.anInt3144;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local36 * arg2;
					arg5 -= local60 * arg2;
					arg8 -= local98 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local48 * arg1;
					arg1 = 0;
				}
				if (local36 < local60) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Pix3D.method1920(Static129.anIntArray297, arg2, arg4 >> 16, arg5 >> 16, arg8, local86);
								arg4 += local48;
								arg5 += local60;
								arg8 += local98;
								arg2 += Static129.anInt3144;
							}
						}
						Pix3D.method1920(Static129.anIntArray297, arg2, arg3 >> 16, arg5 >> 16, arg8, local86);
						arg3 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += Static129.anInt3144;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Pix3D.method1920(Static129.anIntArray297, arg2, arg5 >> 16, arg4 >> 16, arg8, local86);
								arg4 += local48;
								arg5 += local60;
								arg8 += local98;
								arg2 += Static129.anInt3144;
							}
						}
						Pix3D.method1920(Static129.anIntArray297, arg2, arg5 >> 16, arg3 >> 16, arg8, local86);
						arg3 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += Static129.anInt3144;
					}
				}
			}
		}
	}

}
