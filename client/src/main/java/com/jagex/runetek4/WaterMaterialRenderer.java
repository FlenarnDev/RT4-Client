package com.jagex.runetek4;

import java.nio.ByteBuffer;

import com.jagex.runetek4.util.ColorUtils;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL12.GL_CLAMP_TO_EDGE;
import static org.lwjgl.opengl.GL13.*;
import static org.lwjgl.opengl.GL15.*;

@OriginalClass("client!pd")
public final class WaterMaterialRenderer implements MaterialRenderer {

	@OriginalMember(owner = "client!v", name = "c", descriptor = "[F")
	public static final float[] aFloatArray2 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "[F")
	public static final float[] aFloatArray22 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
	private int anInt4440 = -1;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "[F")
	private final float[] aFloatArray23 = new float[4];

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
	private int anInt4441 = -1;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
	private int anInt4442 = -1;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public WaterMaterialRenderer() {
		this.method3435();
		this.method3437();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)[F")
	public static float[] method2422() {
		@Pc(3) float local3 = FogManager.getLightingModelAmbient() + FogManager.getLight0Diffuse();
		@Pc(9) int local9 = FogManager.getLightColor();
		@Pc(18) float local18 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		ColorUtils.aFloatArray28[3] = 1.0F;
		@Pc(37) float local37 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		@Pc(39) float local39 = 0.58823526F;
		@Pc(46) float local46 = (float) (local9 & 0xFF) / 255.0F;
		ColorUtils.aFloatArray28[2] = aFloatArray2[2] * local46 * local39 * local3;
		ColorUtils.aFloatArray28[0] = aFloatArray2[0] * local18 * local39 * local3;
		ColorUtils.aFloatArray28[1] = local3 * local39 * local37 * aFloatArray2[1];
		return ColorUtils.aFloatArray28;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)V")
	public static void method619(@OriginalArg(1) int arg0) {
		aFloatArray2[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		aFloatArray2[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		aFloatArray2[2] = (float) (arg0 & 0xFF) / 255.0F;
		MaterialManager.resetArgument(3);
		MaterialManager.resetArgument(4);
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "()V")
	private void method3435() {
		@Pc(2) byte[] local2 = new byte[] { 0, -1 };
		@Pc(15) int[] local15 = new int[1];

		glGenTextures(local15);
		glBindTexture(GL_TEXTURE_2D, local15[0]);
		ByteBuffer buffer = ByteBuffer.allocateDirect(local2.length);
		buffer.put(local2);
		buffer.flip();
		glTexImage2D(GL_TEXTURE_2D, 0, GL_RED, 2, 1, 0, GL_RED, GL_UNSIGNED_BYTE, buffer);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_EDGE);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP_TO_EDGE);
		this.anInt4441 = local15[0];
	}

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "()V")
	private void method3437() {
		this.anInt4440 = glGenLists(2);
		glNewList(this.anInt4440, GL_COMPILE);
		glTexEnvi(GL_TEXTURE_ENV, GL_OPERAND0_RGB, GL_SRC_COLOR);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC1_RGB, GL_CONSTANT);
		glTexEnvf(GL_TEXTURE_ENV, GL_RGB_SCALE, 2.0F);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC1_ALPHA, GL_CONSTANT);
		glTexGeni(GL_S, GL_TEXTURE_GEN_MODE, GL_OBJECT_LINEAR);
		glTexGeni(GL_T, GL_TEXTURE_GEN_MODE, GL_OBJECT_LINEAR);
		glTexGenfv(GL_S, GL_OBJECT_PLANE, new float[] { 9.765625E-4F, 0.0F, 0.0F, 0.0F });
		glTexGenfv(GL_T, GL_OBJECT_PLANE, new float[] { 0.0F, 0.0F, 9.765625E-4F, 0.0F });
		glEnable(GL_TEXTURE_GEN_S);
		glEnable(GL_TEXTURE_GEN_T);
		if (MaterialManager.allows3DTextureMapping) {
			glBindTexture(GL_TEXTURE_3D, MaterialManager.texture3D);
			glTexGeni(GL_R, GL_TEXTURE_GEN_MODE, GL_OBJECT_LINEAR);
			glTexGeni(GL_Q, GL_TEXTURE_GEN_MODE, GL_OBJECT_LINEAR);
			glTexGenfv(GL_Q, GL_OBJECT_PLANE, new float[] { 0.0F, 0.0F, 0.0F, 1.0F });
			glEnable(GL_TEXTURE_GEN_R);
			glEnable(GL_TEXTURE_GEN_Q);
			glEnable(GL_TEXTURE_3D);
		}
		glActiveTexture(GL_TEXTURE1);
		glEnable(GL_TEXTURE_1D);
		glBindTexture(GL_TEXTURE_1D, this.anInt4441);
		glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_INTERPOLATE);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC0_RGB, GL_CONSTANT);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC2_RGB, GL_TEXTURE);
		glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_ALPHA, GL_INTERPOLATE);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC0_ALPHA, GL_CONSTANT);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC2_ALPHA, GL_TEXTURE);
		glEnable(GL_TEXTURE_GEN_S);
		glTexGeni(GL_S, GL_TEXTURE_GEN_MODE, GL_EYE_LINEAR);
		glPushMatrix();
		glLoadIdentity();
		glEndList();
		glNewList(this.anInt4440 + 1, GL_COMPILE);
		glActiveTexture(GL_TEXTURE1);
		glDisable(GL_TEXTURE_1D);
		glDisable(GL_TEXTURE_GEN_S);
		glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_MODULATE);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC0_RGB, GL_TEXTURE);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC2_RGB, GL_CONSTANT);
		glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_ALPHA, GL_MODULATE);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC0_ALPHA, GL_TEXTURE);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC2_ALPHA, GL_CONSTANT);
		glActiveTexture(GL_TEXTURE0);
		glTexEnvi(GL_TEXTURE_ENV, GL_OPERAND0_RGB, GL_SRC_COLOR);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC1_RGB, GL_PREVIOUS);
		glTexEnvf(GL_TEXTURE_ENV, GL_RGB_SCALE, 1.0F);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC1_ALPHA, GL_PREVIOUS);
		glDisable(GL_TEXTURE_GEN_S);
		glDisable(GL_TEXTURE_GEN_T);
		if (MaterialManager.allows3DTextureMapping) {
			glDisable(GL_TEXTURE_GEN_R);
			glDisable(GL_TEXTURE_GEN_Q);
			glDisable(GL_TEXTURE_3D);
		}
		glEndList();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "()V")
	@Override
	public void unbind() {
		glCallList(this.anInt4440 + 1);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	@Override
	public void setArgument(@OriginalArg(0) int arg0) {
        glActiveTexture(GL_TEXTURE1);
		glTexEnvfv(GL_TEXTURE_ENV, GL_TEXTURE_ENV_COLOR, aFloatArray2);
		glActiveTexture(GL_TEXTURE0);
		if ((arg0 & 0x1) == 1) {
			if (!MaterialManager.allows3DTextureMapping) {
				GlRenderer.setTextureId(MaterialManager.anIntArray341[GlRenderer.anInt5323 * 64 / 100 % 64]);
			} else if (this.anInt4442 != GlRenderer.anInt5323) {
				this.aFloatArray23[0] = 0.0F;
				this.aFloatArray23[1] = 0.0F;
				this.aFloatArray23[2] = 0.0F;
				this.aFloatArray23[3] = (float) GlRenderer.anInt5323 * 0.005F;
				glTexGenfv(GL_R, GL_OBJECT_PLANE, this.aFloatArray23);
				this.anInt4442 = GlRenderer.anInt5323;
			}
		} else if (MaterialManager.allows3DTextureMapping) {
			this.aFloatArray23[0] = 0.0F;
			this.aFloatArray23[1] = 0.0F;
			this.aFloatArray23[2] = 0.0F;
			this.aFloatArray23[3] = 0.0F;
			glTexGenfv(GL_R, GL_OBJECT_PLANE, this.aFloatArray23);
		} else {
			GlRenderer.setTextureId(MaterialManager.anIntArray341[0]);
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "()V")
	@Override
	public void bind() {
		GlRenderer.setTextureCombineRgbMode(2);
		GlRenderer.setTextureCombineAlphaMode(2);
		GlRenderer.resetTextureMatrix();
		glCallList(this.anInt4440);
		@Pc(12) float local12 = 2662.4001F;
		local12 += (float) (MaterialManager.anInt5559 - 128) * 0.5F;
		if (local12 >= 3328.0F) {
			local12 = 3327.0F;
		}
		this.aFloatArray23[0] = 0.0F;
		this.aFloatArray23[1] = 0.0F;
		this.aFloatArray23[2] = 1.0F / (local12 - 3328.0F);
		this.aFloatArray23[3] = local12 / (local12 - 3328.0F);
		glTexGenfv(GL_S, GL_EYE_PLANE, this.aFloatArray23);
		glPopMatrix();
		glActiveTexture(GL_TEXTURE0);
		glTexEnvfv(GL_TEXTURE_ENV, GL_TEXTURE_ENV_COLOR, aFloatArray22);
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "()I")
	@Override
	public int getFlags() {
		return 15;
	}
}
