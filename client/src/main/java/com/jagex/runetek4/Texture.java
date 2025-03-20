package com.jagex.runetek4;

import com.jagex.runetek4.core.io.Packet;
import com.jagex.runetek4.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Texture {

	@OriginalMember(owner = "runetek4.client!i", name = "ac", descriptor = "[I")
	public static final int[] brightnessMap = new int[256];
	@OriginalMember(owner = "runetek4.client!ck", name = "X", descriptor = "I")
	public static int widthMask;
	@OriginalMember(owner = "runetek4.client!pe", name = "r", descriptor = "I")
	public static int width;
	@OriginalMember(owner = "runetek4.client!nk", name = "d", descriptor = "[I")
	public static int[] widthFractions;
	@OriginalMember(owner = "runetek4.client!nj", name = "k", descriptor = "I")
	public static int height;
	@OriginalMember(owner = "runetek4.client!fb", name = "h", descriptor = "[I")
	public static int[] heightFractions;
	@OriginalMember(owner = "runetek4.client!lb", name = "z", descriptor = "I")
	public static int heightMask;
	@OriginalMember(owner = "runetek4.client!jh", name = "f", descriptor = "D")
	public static double brightness = -1.0D;
	@OriginalMember(owner = "client!lc", name = "k", descriptor = "[I")
	private final int[] anIntArray328;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "[I")
	private final int[] anIntArray327;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Lclient!j;")
	private final TextureOp aClass3_Sub1_1;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Lclient!j;")
	private final TextureOp aClass3_Sub1_2;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[Lclient!j;")
	private final TextureOp[] aClass3_Sub1Array22;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!wa;)V")
	public Texture(@OriginalArg(0) Packet packet) {
		@Pc(7) int local7 = packet.g1();
		this.aClass3_Sub1Array22 = new TextureOp[local7];
		@Pc(14) int[][] local14 = new int[local7][];
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20;
		@Pc(27) TextureOp local27;
		@Pc(45) int local45;
		@Pc(52) int local52;
		for (local20 = 0; local20 < local7; local20++) {
			local27 = method3680(packet);
			if (local27.method4631() >= 0) {
				local18++;
			}
			if (local27.method4627() >= 0) {
				local16++;
			}
			local45 = local27.aClass3_Sub1Array42.length;
			local14[local20] = new int[local45];
			for (local52 = 0; local52 < local45; local52++) {
				local14[local20][local52] = packet.g1();
			}
			this.aClass3_Sub1Array22[local20] = local27;
		}
		this.anIntArray327 = new int[local18];
		this.anIntArray328 = new int[local16];
		local18 = 0;
		local16 = 0;
		for (local20 = 0; local20 < local7; local20++) {
			local27 = this.aClass3_Sub1Array22[local20];
			local45 = local27.aClass3_Sub1Array42.length;
			for (local52 = 0; local52 < local45; local52++) {
				local27.aClass3_Sub1Array42[local52] = this.aClass3_Sub1Array22[local14[local20][local52]];
			}
			local52 = local27.method4631();
			@Pc(136) int local136 = local27.method4627();
			if (local52 > 0) {
				this.anIntArray327[local18++] = local52;
			}
			if (local136 > 0) {
				this.anIntArray328[local16++] = local136;
			}
			local14[local20] = null;
		}
		this.aClass3_Sub1_1 = this.aClass3_Sub1Array22[packet.g1()];
		local14 = null;
		this.aClass3_Sub1_2 = this.aClass3_Sub1Array22[packet.g1()];
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLclient!wa;)Lclient!j;")
	public static TextureOp method3680(@OriginalArg(1) Packet packet) {
		packet.g1();
		@Pc(13) int type = packet.g1();
		@Pc(17) TextureOp textureOp = create(type);
		textureOp.anInt5840 = packet.g1();
		@Pc(26) int local26 = packet.g1();
		for (@Pc(34) int local34 = 0; local34 < local26; local34++) {
			@Pc(41) int code = packet.g1();
			textureOp.decode(packet, code);
		}
		textureOp.postDecode();
		return textureOp;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)Lclient!j;")
	public static TextureOp create(@OriginalArg(0) int type) {
		if (type == 0) {
			return new TextureOp20();
		} else if (type == 1) {
			return new TextureOpColorFill();
		} else if (type == 2) {
			return new TextureOp27();
		} else if (type == 3) {
			return new TextureOp25();
		} else if (type == 4) {
			return new TextureOp17();
		} else if (type == 5) {
			return new TextureOp21();
		} else if (type == 6) {
			return new TextureOp2();
		} else if (type == 7) {
			return new TextureOpCombine();
		} else if (type == 8) {
			return new TextureOpCurve();
		} else if (type == 9) {
			return new TextureOp7();
		} else if (type == 10) {
			return new TextureOpColorGradient();
		} else if (type == 11) {
			return new TextureOp18();
		} else if (type == 12) {
			return new TextureOp1();
		} else if (type == 13) {
			return new TextureOp26();
		} else if (type == 14) {
			return new TextureOp28();
		} else if (type == 15) {
			return new TextureOp14();
		} else if (type == 16) {
			return new TextureOp8();
		} else if (type == 17) {
			return new TextureOp13();
		} else if (type == 18) {
			return new TextureOpTiledSprite();
		} else if (type == 19) {
			return new TextureOp16();
		} else if (type == 20) {
			return new TextureOp11();
		} else if (type == 21) {
			return new TextureOp5();
		} else if (type == 22) {
			return new TextureOp31();
		} else if (type == 23) {
			return new TextureOp15();
		} else if (type == 24) {
			return new TextureOp10();
		} else if (type == 25) {
			return new TextureOp30();
		} else if (type == 26) {
			return new TextureOpBinary();
		} else if (type == 27) {
			return new TextureOp6();
		} else if (type == 28) {
			return new TextureOp22();
		} else if (type == 29) {
			return new TextureOp29();
		} else if (type == 30) {
			return new TextureOp9();
		} else if (type == 31) {
			return new TextureOp12();
		} else if (type == 32) {
			return new TextureOp24();
		} else if (type == 33) {
			return new TextureOp3();
		} else if (type == 34) {
			return new TextureOp4();
		} else if (type == 35) {
			return new TextureOp23();
		} else if (type == 36) {
			return new TextureOp32();
		} else if (type == 37) {
			return new TextureOp19();
		} else if (type == 38) {
			return new TextureOp33();
		} else if (type == 39) {
			return new TextureOpSprite();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(III)V")
	public static void setSize(@OriginalArg(1) int newHeight, @OriginalArg(2) int newWidth) {
		if (width != newWidth) {
			widthFractions = new int[newWidth];
			for (@Pc(10) int widthIndex = 0; widthIndex < newWidth; widthIndex++) {
				widthFractions[widthIndex] = (widthIndex << 12) / newWidth;
			}
			Static165.anInt4042 = newWidth == 64 ? 2048 : 4096;
			widthMask = newWidth - 1;
			width = newWidth;
		}
		if (Texture.height == newHeight) {
			return;
		}
		if (width == newHeight) {
			heightFractions = widthFractions;
		} else {
			heightFractions = new int[newHeight];
			for (@Pc(61) int heightIndex = 0; heightIndex < newHeight; heightIndex++) {
				heightFractions[heightIndex] = (heightIndex << 12) / newHeight;
			}
		}
		Texture.height = newHeight;
		heightMask = newHeight - 1;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(DI)V")
	public static void setBrightness(@OriginalArg(0) double brightnessValue) {
		if (brightness == brightnessValue) {
			return;
		}
		for (@Pc(12) int index = 0; index < 256; index++) {
			@Pc(25) int computedBrightness = (int) (Math.pow((double) index / 255.0D, brightnessValue) * 255.0D);
			brightnessMap[index] = computedBrightness > 255 ? 255 : computedBrightness;
		}
		brightness = brightnessValue;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZIDILclient!ve;Lclient!m;Z)[I")
	public int[] method2725(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(5) Js5 arg4, @OriginalArg(6) GlTextureProvider arg5, @OriginalArg(7) boolean arg6) {
		setBrightness(arg3);
		Static37.anInterface1_1 = arg5;
		Static176.aClass153_76 = arg4;
		setSize(arg0, arg2);
		@Pc(20) int local20;
		for (local20 = 0; local20 < this.aClass3_Sub1Array22.length; local20++) {
			this.aClass3_Sub1Array22[local20].method4632(arg0, arg2);
		}
		@Pc(56) int[] local56 = new int[arg0 * arg2];
		@Pc(64) int local64;
		@Pc(60) byte local60;
		if (arg6) {
			local60 = -1;
			local64 = -1;
			local20 = arg2 - 1;
		} else {
			local60 = 1;
			local20 = 0;
			local64 = arg2;
		}
		@Pc(76) int local76 = 0;
		@Pc(78) int local78;
		for (local78 = 0; local78 < arg0; local78++) {
			if (arg1) {
				local76 = local78;
			}
			@Pc(101) int[] local101;
			@Pc(103) int[] local103;
			@Pc(105) int[] local105;
			if (this.aClass3_Sub1_1.aBoolean309) {
				@Pc(99) int[] local99 = this.aClass3_Sub1_1.method4626(local78);
				local101 = local99;
				local103 = local99;
				local105 = local99;
			} else {
				@Pc(113) int[][] local113 = this.aClass3_Sub1_1.method4638(local78);
				local101 = local113[0];
				local105 = local113[2];
				local103 = local113[1];
			}
			for (@Pc(127) int local127 = local20; local127 != local64; local127 += local60) {
				@Pc(136) int local136 = local101[local127] >> 4;
				if (local136 > 255) {
					local136 = 255;
				}
				if (local136 < 0) {
					local136 = 0;
				}
				local136 = brightnessMap[local136];
				@Pc(159) int local159 = local105[local127] >> 4;
				@Pc(165) int local165 = local103[local127] >> 4;
				if (local165 > 255) {
					local165 = 255;
				}
				if (local165 < 0) {
					local165 = 0;
				}
				if (local159 > 255) {
					local159 = 255;
				}
				local165 = brightnessMap[local165];
				if (local159 < 0) {
					local159 = 0;
				}
				local159 = brightnessMap[local159];
				local56[local76++] = (local136 << 16) + (local165 << 8) + local159;
				if (arg1) {
					local76 += arg2 - 1;
				}
			}
		}
		for (local78 = 0; local78 < this.aClass3_Sub1Array22.length; local78++) {
			this.aClass3_Sub1Array22[local78].method4633();
		}
		return local56;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIZLclient!m;DILclient!ve;)[B")
	public final byte[] method2728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) GlTextureProvider arg3, @OriginalArg(4) double arg4, @OriginalArg(6) Js5 arg5) {
		@Pc(8) byte[] local8 = new byte[arg1 * 4 * arg0];
		setBrightness(arg4);
		Static176.aClass153_76 = arg5;
		Static37.anInterface1_1 = arg3;
		setSize(arg0, arg1);
		@Pc(31) int local31;
		for (local31 = 0; local31 < this.aClass3_Sub1Array22.length; local31++) {
			this.aClass3_Sub1Array22[local31].method4632(arg0, arg1);
		}
		local31 = 0;
		@Pc(53) int local53;
		for (local53 = 0; local53 < arg0; local53++) {
			if (arg2) {
				local31 = local53 << 2;
			}
			@Pc(79) int[] local79;
			@Pc(81) int[] local81;
			@Pc(83) int[] local83;
			@Pc(77) int[] local77;
			if (this.aClass3_Sub1_1.aBoolean309) {
				local77 = this.aClass3_Sub1_1.method4626(local53);
				local79 = local77;
				local81 = local77;
				local83 = local77;
			} else {
				@Pc(91) int[][] local91 = this.aClass3_Sub1_1.method4638(local53);
				local79 = local91[0];
				local81 = local91[1];
				local83 = local91[2];
			}
			if (this.aClass3_Sub1_2.aBoolean309) {
				local77 = this.aClass3_Sub1_2.method4626(local53);
			} else {
				local77 = this.aClass3_Sub1_2.method4638(local53)[0];
			}
			for (@Pc(127) int local127 = arg1 - 1; local127 >= 0; local127--) {
				@Pc(138) int local138 = local79[local127] >> 4;
				if (local138 > 255) {
					local138 = 255;
				}
				if (local138 < 0) {
					local138 = 0;
				}
				@Pc(154) int local154 = local81[local127] >> 4;
				if (local154 > 255) {
					local154 = 255;
				}
				@Pc(167) int local167 = local83[local127] >> 4;
				if (local167 > 255) {
					local167 = 255;
				}
				local138 = brightnessMap[local138];
				if (local167 < 0) {
					local167 = 0;
				}
				if (local154 < 0) {
					local154 = 0;
				}
				local154 = brightnessMap[local154];
				local167 = brightnessMap[local167];
				@Pc(220) int local220;
				if (local138 == 0 && local154 == 0 && local167 == 0) {
					local220 = 0;
				} else {
					local220 = local77[local127] >> 4;
					if (local220 > 255) {
						local220 = 255;
					}
					if (local220 < 0) {
						local220 = 0;
					}
				}
				local8[local31++] = (byte) local138;
				local8[local31++] = (byte) local154;
				local8[local31++] = (byte) local167;
				local8[local31++] = (byte) local220;
				if (arg2) {
					local31 += (arg1 << 2) - 4;
				}
			}
		}
		for (local53 = 0; local53 < this.aClass3_Sub1Array22.length; local53++) {
			this.aClass3_Sub1Array22[local53].method4633();
		}
		return local8;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLclient!m;Lclient!ve;)Z")
	public boolean method2729(@OriginalArg(1) GlTextureProvider arg0, @OriginalArg(2) Js5 arg1) {
		@Pc(10) int local10;
		if (Static215.anInt4868 > 0) {
			for (local10 = 0; local10 < this.anIntArray327.length; local10++) {
				if (!arg1.isFileReady(Static215.anInt4868, this.anIntArray327[local10])) {
					return false;
				}
			}
		} else {
			for (local10 = 0; local10 < this.anIntArray327.length; local10++) {
				if (!arg1.isFileReady(this.anIntArray327[local10])) {
					return false;
				}
			}
		}
		for (local10 = 0; local10 < this.anIntArray328.length; local10++) {
			if (!arg0.method3230(this.anIntArray328[local10])) {
				return false;
			}
		}
		return true;
	}
}