package com.jagex.runetek4;

import com.jagex.runetek4.core.io.Packet;

import com.jagex.runetek4.textureops.TextureOpPerlinNoise;

import com.jagex.runetek4.util.MathUtils;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Light {

	@OriginalMember(owner = "client!f", name = "P", descriptor = "[I")
	public static int[] NOISE;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "Z")
	public final boolean aBoolean124;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
	private int alphaMax;

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
	private int function;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
	public int y;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
	public final int radius;

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
	private int alphaMin;

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
	public int x;

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
	public int level;

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
	public final int functionPreset;

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "[S")
	public final short[] aShortArray30;

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "F")
	public float alpha;

	@OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
	public int z;

	@OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
	private int frequency;

	@OriginalMember(owner = "client!gi", name = "z", descriptor = "F")
	public float attenuation;

	@OriginalMember(owner = "client!gi", name = "A", descriptor = "Z")
	public final boolean aBoolean126;

	@OriginalMember(owner = "client!gi", name = "B", descriptor = "Lclient!fj;")
	public Class45 aClass45_1;

	@OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
	public final int color;

	@OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
	private final int phase;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "Z")
	public boolean doesNotInteractWithLight = false;

	@OriginalMember(owner = "client!gi", name = "I", descriptor = "[F")
	public final float[] diffuse = new float[4];

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!wa;)V")
	public Light(@OriginalArg(0) Packet packet) {
		if (NOISE == null) {
			init();
		}
		this.level = packet.g1();
		this.aBoolean124 = (this.level & 0x10) != 0;
		this.aBoolean126 = (this.level & 0x8) != 0;
		this.level &= 0x7;
		this.x = packet.g2();
		this.z = packet.g2();
		this.y = packet.g2();
		this.radius = packet.g1();
		this.method1763();
		this.aShortArray30 = new short[this.radius * 2 + 1];
		@Pc(87) int i;
		for (i = 0; i < this.aShortArray30.length; i++) {
			this.aShortArray30[i] = (short) packet.g2();
		}
		this.color = Rasterizer.palette[packet.g2()];
		int functionPresetAndPhase = packet.g1();
		this.phase = (functionPresetAndPhase & 0xE0) << 3;
		this.functionPreset = functionPresetAndPhase & 0x1F;
		if (this.functionPreset != 31) {
			this.setFunctionPreset();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZIIIIFII)[I")
	public static int[] createNoise(@OriginalArg(5) float arg0) {
		@Pc(11) int[] noise = new int[2048];
		@Pc(15) TextureOpPerlinNoise op = new TextureOpPerlinNoise();
		op.anInt646 = 8;
		op.anInt642 = 4;
		op.seed = 35;
		op.anInt641 = 8;
		op.anInt648 = (int) (arg0 * 4096.0F);
		op.aBoolean44 = true;
		op.postDecode();
		Texture.setSize(1, 2048);
		op.method584(0, noise);
		return noise;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V")
	public static void init() {
		NOISE = createNoise(0.4F);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BIIII)V")
	public final void method1762(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.function = arg0;
		this.alphaMin = arg2;
		this.alphaMax = arg3;
		this.frequency = arg1;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
	private void method1763() {
		@Pc(10) int local10 = (this.radius << 7) + 64;
		this.attenuation = 1.0F / (float) (local10 * local10);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZII)V")
	public final void method1765(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(26) int local26 = this.phase + arg1 * this.frequency / 50 & 0x7FF;
		@Pc(29) int local29 = this.function;
		@Pc(62) int local62;
		if (local29 == 1) {
			local62 = (MathUtils.sin[local26] >> 6) + 1024;
		} else if (local29 == 3) {
			local62 = NOISE[local26] >> 1;
		} else if (local29 == 4) {
			local62 = local26 >> 10 << 11;
		} else if (local29 == 2) {
			local62 = local26;
		} else if (local29 == 5) {
			local62 = (local26 < 1024 ? local26 : 2048 - local26) << 1;
		} else {
			local62 = 2048;
		}
		if (arg0) {
			local62 = 2048;
		}
		this.alpha = (float) (this.alphaMax + (local62 * this.alphaMin >> 11)) / 2048.0F;
		@Pc(123) float local123 = this.alpha / 255.0F;
		this.diffuse[0] = (float) (this.color >> 16 & 0xFF) * local123;
		this.diffuse[2] = local123 * (float) (this.color & 0xFF);
		this.diffuse[1] = (float) (this.color >> 8 & 0xFF) * local123;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
	private void setFunctionPreset() {
		@Pc(4) int preset = this.functionPreset;
		if (preset == 2) {
			this.alphaMin = 2048;
			this.alphaMax = 0;
			this.function = 1;
			this.frequency = 2048;
		} else if (preset == 3) {
			this.alphaMax = 0;
			this.frequency = 4096;
			this.function = 1;
			this.alphaMin = 2048;
		} else if (preset == 4) {
			this.alphaMax = 0;
			this.alphaMin = 2048;
			this.function = 4;
			this.frequency = 2048;
		} else if (preset == 5) {
			this.function = 4;
			this.alphaMin = 2048;
			this.frequency = 8192;
			this.alphaMax = 0;
		} else if (preset == 12) {
			this.alphaMin = 2048;
			this.function = 2;
			this.frequency = 2048;
			this.alphaMax = 0;
		} else if (preset == 13) {
			this.frequency = 8192;
			this.alphaMin = 2048;
			this.function = 2;
			this.alphaMax = 0;
		} else if (preset == 10) {
			this.alphaMin = 512;
			this.function = 3;
			this.alphaMax = 1536;
			this.frequency = 2048;
		} else if (preset == 11) {
			this.function = 3;
			this.frequency = 4096;
			this.alphaMin = 512;
			this.alphaMax = 1536;
		} else if (preset == 6) {
			this.alphaMin = 768;
			this.alphaMax = 1280;
			this.function = 3;
			this.frequency = 2048;
		} else if (preset == 7) {
			this.alphaMin = 768;
			this.alphaMax = 1280;
			this.frequency = 4096;
			this.function = 3;
		} else if (preset == 8) {
			this.frequency = 2048;
			this.function = 3;
			this.alphaMin = 1024;
			this.alphaMax = 1024;
		} else if (preset == 9) {
			this.frequency = 4096;
			this.alphaMax = 1024;
			this.alphaMin = 1024;
			this.function = 3;
		} else if (preset == 14) {
			this.frequency = 2048;
			this.alphaMax = 1280;
			this.function = 1;
			this.alphaMin = 768;
		} else if (preset == 15) {
			this.alphaMin = 512;
			this.frequency = 4096;
			this.alphaMax = 1536;
			this.function = 1;
		} else if (preset == 16) {
			this.frequency = 8192;
			this.alphaMax = 1792;
			this.function = 1;
			this.alphaMin = 256;
		} else {
			this.frequency = 2048;
			this.alphaMax = 0;
			this.alphaMin = 2048;
			this.function = 0;
		}
	}
}