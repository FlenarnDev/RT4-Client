package deob;

import com.jagex3.GlRenderer;
import com.jagex3.Light;
import com.jagex3.Square;
import com.jagex3.World;
import com.jogamp.opengl.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "com.jagex3.client.client!jf", name = "a", descriptor = "[Lclient!gi;")
	public static Light[] aClass51Array1;

	@OriginalMember(owner = "com.jagex3.client.client!jf", name = "c", descriptor = "[I")
	private static int[] anIntArray283;

    @OriginalMember(owner = "com.jagex3.client.client!jf", name = "m", descriptor = "[Z")
	private static boolean[] aBooleanArray66;

    @OriginalMember(owner = "com.jagex3.client.client!jf", name = "b", descriptor = "[F")
	private static final float[] aFloatArray17 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "com.jagex3.client.client!jf", name = "l", descriptor = "I")
	public static int anInt3034 = 0;

	@OriginalMember(owner = "com.jagex3.client.client!jf", name = "a", descriptor = "(IIIIIII)V")
	public static void method2388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!Static178.highDetailLighting) {
			return;
		}
		if (arg0 == 1 && arg5 > 0) {
			method2393(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
		} else if (arg0 == 4 && arg5 < World.anInt3037 - 1) {
			method2393(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
		} else if (arg0 == 8 && arg6 > 0) {
			method2393(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
		} else if (arg0 == 2 && arg6 < World.anInt3036 - 1) {
			method2393(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
		} else if (arg0 == 16 && arg5 > 0 && arg6 < World.anInt3036 - 1) {
			method2393(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
		} else if (arg0 == 32 && arg5 < World.anInt3037 - 1 && arg6 < World.anInt3036 - 1) {
			method2393(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
		} else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
			method2393(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
		} else if (arg0 == 64 && arg5 < World.anInt3037 - 1 && arg6 > 0) {
			method2393(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!jf", name = "a", descriptor = "(Lclient!gi;)V")
	public static void method2389(@OriginalArg(0) Light arg0) {
		if (anInt3034 >= 255) {
			System.out.println("Number of lights added exceeds maximum!");
		} else {
			aClass51Array1[anInt3034++] = arg0;
		}
	}

    @OriginalMember(owner = "com.jagex3.client.client!jf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!Static178.highDetailLighting || World.anInt3031 == arg3 && World.anInt3033 == arg4 && World.anInt3029 == arg5 && World.anInt3035 == arg6 && World.anInt3030 == arg7) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray66[local20] = false;
		}
		local20 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35;
		@Pc(40) int local40;
		label112: for (local35 = arg4; local35 <= arg6; local35++) {
			label110: for (local40 = arg5; local40 <= arg7; local40++) {
				@Pc(51) int local51 = World.anIntArrayArrayArray11[arg3][local35][local40];
				while (true) {
					while (true) {
						label96: while (true) {
							if (local51 == 0) {
								continue label110;
							}
							@Pc(59) int local59 = (local51 & 0xFF) - 1;
							local51 >>>= 0x8;
							@Pc(65) int local65;
							for (local65 = 0; local65 < local33; local65++) {
								if (local59 == anIntArray283[local65]) {
									continue label96;
								}
							}
							for (local65 = 0; local65 < 4; local65++) {
								if (local59 == World.anIntArray284[local65]) {
									if (!aBooleanArray66[local65]) {
										aBooleanArray66[local65] = true;
										local20++;
										if (local20 == 4) {
											break label112;
										}
									}
									continue label96;
								}
							}
							anIntArray283[local33++] = local59;
							local20++;
							if (local20 == 4) {
								break label112;
							}
						}
					}
				}
			}
		}
		for (local35 = 0; local35 < local33; local35++) {
			for (local40 = 0; local40 < 4; local40++) {
				if (!aBooleanArray66[local40]) {
					World.anIntArray284[local40] = anIntArray283[local35];
					aBooleanArray66[local40] = true;
					method2403(local40, aClass51Array1[anIntArray283[local35]], arg0, arg1, arg2);
					break;
				}
			}
		}
		for (local35 = 0; local35 < 4; local35++) {
			if (!aBooleanArray66[local35]) {
				World.anIntArray284[local35] = -1;
				World.method2396(local35);
			}
		}
		World.anInt3031 = arg3;
		World.anInt3033 = arg4;
		World.anInt3029 = arg5;
		World.anInt3035 = arg6;
		World.anInt3030 = arg7;
	}

	@OriginalMember(owner = "com.jagex3.client.client!jf", name = "a", descriptor = "(III)V")
	public static void method2392() {
		World.anInt3032 = 4;
		World.anInt3037 = 104;
		World.anInt3036 = 104;
		World.anIntArrayArrayArray11 = new int[World.anInt3032][World.anInt3037][World.anInt3036];
	}

	@OriginalMember(owner = "com.jagex3.client.client!jf", name = "a", descriptor = "(IIIIII)V")
	public static void method2393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!Static178.highDetailLighting || World.anInt3031 == arg3 && World.anInt3033 == arg4 && World.anInt3029 == arg5 && World.anInt3035 == arg4 && World.anInt3030 == arg5) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray66[local20] = false;
		}
		local20 = 0;
		@Pc(39) int local39 = World.anIntArrayArrayArray11[arg3][arg4][arg5];
		while (true) {
			@Pc(47) int local47;
			@Pc(53) int local53;
			label72: while (local39 != 0) {
				local47 = (local39 & 0xFF) - 1;
				local39 >>>= 0x8;
				for (local53 = 0; local53 < 4; local53++) {
					if (local47 == World.anIntArray284[local53]) {
						aBooleanArray66[local53] = true;
						continue label72;
					}
				}
				anIntArray283[local20++] = local47;
			}
			for (local47 = 0; local47 < local20; local47++) {
				for (local53 = 0; local53 < 4; local53++) {
					if (!aBooleanArray66[local53]) {
						World.anIntArray284[local53] = anIntArray283[local47];
						aBooleanArray66[local53] = true;
						method2403(local53, aClass51Array1[anIntArray283[local47]], arg0, arg1, arg2);
						break;
					}
				}
			}
			for (local47 = 0; local47 < 4; local47++) {
				if (!aBooleanArray66[local47]) {
					World.anIntArray284[local47] = -1;
					World.method2396(local47);
				}
			}
			World.anInt3031 = arg3;
			World.anInt3033 = arg4;
			World.anInt3029 = arg5;
			World.anInt3035 = arg4;
			World.anInt3030 = arg5;
			return;
		}
	}

    @OriginalMember(owner = "com.jagex3.client.client!jf", name = "a", descriptor = "(IIIII)V")
	public static void method2397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!Static178.highDetailLighting) {
			return;
		}
		label43: for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (World.anIntArray284[local4] != -1) {
				@Pc(20) int local20 = World.anIntArrayArrayArray11[arg0][arg1][arg2];
				@Pc(28) int local28;
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == World.anIntArray284[local4]) {
						continue label43;
					}
				}
				local20 = World.anIntArrayArrayArray11[arg0][arg3][arg4];
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == World.anIntArray284[local4]) {
						continue label43;
					}
				}
			}
			World.anIntArray284[local4] = -1;
			World.method2396(local4);
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!jf", name = "c", descriptor = "()V")
	public static void method2398() {
		aClass51Array1 = null;
		World.anIntArray284 = null;
		World.aBooleanArray65 = null;
		anIntArray283 = null;
		aBooleanArray66 = null;
		World.anIntArrayArrayArray11 = null;
	}

	@OriginalMember(owner = "com.jagex3.client.client!jf", name = "e", descriptor = "()V")
	public static void method2400() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 4; local3++) {
			@Pc(10) int local10 = local3 + 16388;
			local1.glLightfv(local10, GL2.GL_AMBIENT, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local1.glLightf(local10, GL2.GL_LINEAR_ATTENUATION, 0.0F);
			local1.glLightf(local10, GL2.GL_CONSTANT_ATTENUATION, 0.0F);
		}
		for (local3 = 0; local3 < 4; local3++) {
			World.anIntArray284[local3] = -1;
			World.method2396(local3);
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!jf", name = "f", descriptor = "()V")
	public static void method2401() {
		aClass51Array1 = new Light[255];
		World.anIntArray284 = new int[4];
		World.aBooleanArray65 = new boolean[4];
		anIntArray283 = new int[4];
		aBooleanArray66 = new boolean[4];
		World.anIntArrayArrayArray11 = new int[World.anInt3032][World.anInt3037][World.anInt3036];
	}

	@OriginalMember(owner = "com.jagex3.client.client!jf", name = "a", descriptor = "(II[[[Lclient!bj;)V")
	public static void method2402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Square[][][] arg2) {
		if (!Static178.highDetailLighting) {
			return;
		}
		@Pc(4) GL2 local4 = GlRenderer.gl;
		Static27.setMaterial(0, 0);
		GlRenderer.setTextureCombineRgbMode(0);
		GlRenderer.resetTextureMatrix();
		GlRenderer.setTextureId(GlRenderer.anInt5328);
		local4.glDepthMask(false);
		GlRenderer.setLightingEnabled(false);
		local4.glBlendFunc(GL2.GL_DST_COLOR, GL2.GL_ONE);
		local4.glFogfv(GL2.GL_FOG_COLOR, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
		local4.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_RGB, GL2.GL_CONSTANT);
		local4.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_OPERAND0_RGB, GL2.GL_SRC_ALPHA);
		label71: for (@Pc(56) int local56 = 0; local56 < anInt3034; local56++) {
			@Pc(63) Light local63 = aClass51Array1[local56];
			@Pc(66) int local66 = local63.anInt2241;
			if (local63.aBoolean125) {
				local66--;
			}
			if (local63.aClass45_1 != null) {
				@Pc(76) int local76 = 0;
				@Pc(84) int local84 = (local63.anInt2245 >> 7) - local63.anInt2236;
				@Pc(92) int local92 = (local63.anInt2245 >> 7) + local63.anInt2236;
				if (local92 >= Static215.anInt4866) {
					local92 = Static215.anInt4866 - 1;
				}
				if (local84 < Static80.anInt4698) {
					local76 = Static80.anInt4698 - local84;
					local84 = Static80.anInt4698;
				}
				for (@Pc(112) int local112 = local84; local112 <= local92; local112++) {
					@Pc(121) short local121 = local63.aShortArray30[local76++];
					@Pc(133) int local133 = (local63.anInt2240 >> 7) + (local121 >> 8) - local63.anInt2236;
					@Pc(141) int local141 = local133 + (local121 & 0xFF) - 1;
					if (local133 < Static31.anInt987) {
						local133 = Static31.anInt987;
					}
					if (local141 >= Static2.anInt15) {
						local141 = Static2.anInt15 - 1;
					}
					for (@Pc(155) int local155 = local133; local155 <= local141; local155++) {
						@Pc(160) Square local160 = null;
						if (local66 >= 0) {
							local160 = arg2[local66][local155][local112];
						}
						if (local66 < 0 || local160 != null && local160.aBoolean45) {
							GlRenderer.method4159(201.5F - (float) local63.anInt2241 * 50.0F - 1.5F);
							local4.glTexEnvfv(GL2.GL_TEXTURE_ENV, GL2.GL_TEXTURE_ENV_COLOR, new float[] { 0.0F, 0.0F, 0.0F, local63.aFloat8 }, 0);
							local63.aClass45_1.method1556();
							continue label71;
						}
					}
				}
			}
		}
		local4.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_RGB, GL2.GL_TEXTURE);
		local4.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_OPERAND0_RGB, GL2.GL_SRC_COLOR);
		local4.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
		local4.glDepthMask(true);
		local4.glFogfv(GL2.GL_FOG_COLOR, Static161.aFloatArray19, 0);
		local4.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
		GlRenderer.method4173();
	}

	@OriginalMember(owner = "com.jagex3.client.client!jf", name = "a", descriptor = "(ILclient!gi;III)V")
	private static void method2403(@OriginalArg(0) int arg0, @OriginalArg(1) Light arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 + 16384 + 4;
		@Pc(7) GL2 local7 = GlRenderer.gl;
		if (!World.aBooleanArray65[arg0]) {
			local7.glEnable(local5);
			World.aBooleanArray65[arg0] = true;
		}
		local7.glLightf(local5, GL2.GL_QUADRATIC_ATTENUATION, arg1.aFloat9);
		local7.glLightfv(local5, GL2.GL_DIFFUSE, arg1.aFloatArray3, 0);
		aFloatArray17[0] = arg1.anInt2240 - arg2;
		aFloatArray17[1] = arg1.anInt2235 - arg3;
		aFloatArray17[2] = arg1.anInt2245 - arg4;
		local7.glLightfv(local5, GL2.GL_POSITION, aFloatArray17, 0);
	}

}
