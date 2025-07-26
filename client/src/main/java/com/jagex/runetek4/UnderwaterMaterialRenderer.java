package com.jagex.runetek4;

import java.nio.ByteBuffer;

import com.jagex.runetek4.util.ColorUtils;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL13.*;
import static org.lwjgl.opengl.GL15.*;

@OriginalClass("client!wg")
public final class UnderwaterMaterialRenderer implements MaterialRenderer {

	@OriginalMember(owner = "client!nh", name = "Z", descriptor = "I")
	public static int anInt3241 = 128;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "Z")
	public static boolean aBoolean308 = false;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
	private int textureId = -1;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "[F")
	private final float[] tempVertex = new float[4];

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
	private int listId = -1;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
	public UnderwaterMaterialRenderer() {
		if (GlRenderer.maxTextureUnits >= 2) {
			@Pc(17) int[] temp = new int[1];
			@Pc(20) byte[] texture = new byte[8];
			@Pc(22) int i = 0;
			while (i < 8) {
				texture[i++] = (byte) (i * 159 / 8 + 96);
			}
			glGenTextures(temp);
			glBindTexture(GL_TEXTURE_1D, temp[0]);
			glTexImage1D(GL_TEXTURE_1D, 0, GL_ALPHA, 8, 0, GL_ALPHA, GL_UNSIGNED_BYTE, ByteBuffer.wrap(texture));
			glTexParameteri(GL_TEXTURE_1D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
			glTexParameteri(GL_TEXTURE_1D, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
			glTexParameteri(GL_TEXTURE_1D, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_EDGE);
			this.textureId = temp[0];
			aBoolean308 = GlRenderer.maxTextureUnits > 2 && GlRenderer.extTexture3dSupported;
			this.createLists();
		}
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "()I")
	public static int method4607() {
		return aBoolean308 ? 33986 : 33985;
	}

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "()V")
	public static void method4608() {
		glClientActiveTexture(method4607());
		glDisableClientState(GL_TEXTURE_COORD_ARRAY);
		glClientActiveTexture(GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "()V")
	public static void method4609() {
		glClientActiveTexture(method4607());
		glEnableClientState(GL_TEXTURE_COORD_ARRAY);
		glClientActiveTexture(GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "()V")
	public static void applyFogFade() {
		glDisableClientState(GL_COLOR_ARRAY);
		GlRenderer.setLightingEnabled(false);
		glDisable(GL_DEPTH_TEST);
		glPushAttrib(GL_FOG_BIT);
		glFogf(GL_FOG_START, 3072.0F);
		GlRenderer.disableDepthMask();
		for (@Pc(19) int i = 0; i < SceneGraph.surfaceHdTiles[0].length; i++) {
			@Pc(31) GlTile glTile = SceneGraph.surfaceHdTiles[0][i];
			if (glTile.texture >= 0 && Rasterizer.textureProvider.getMaterialType(glTile.texture) == 4) {
				glColor4fv(ColorUtils.getRgbFloat(glTile.underwaterColor));
				@Pc(57) float local57 = 201.5F - (glTile.blend ? 1.0F : 0.5F);
				glTile.method1944(SceneGraph.tiles, local57, true);
			}
		}
		glEnableClientState(GL_COLOR_ARRAY);
		GlRenderer.restoreLighting();
		glEnable(GL_DEPTH_TEST);
		glPopAttrib();
		GlRenderer.enableDepthMask();
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "()V")
	private void createLists() {
		this.listId = glGenLists(2);
		glNewList(this.listId, GL_COMPILE);
		glActiveTexture(GL_TEXTURE1);
		if (aBoolean308) {
			glBindTexture(GL_TEXTURE_3D, MaterialManager.texture3D);
			glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_ADD);
			glTexEnvi(GL_TEXTURE_ENV, GL_OPERAND0_RGB, GL_SRC_COLOR);
			glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_ALPHA, GL_REPLACE);
			glTexEnvi(GL_TEXTURE_ENV, GL_SRC0_ALPHA, GL_PREVIOUS);
			glTexGeni(GL_S, GL_TEXTURE_GEN_MODE, GL_EYE_LINEAR);
			glTexGeni(GL_R, GL_TEXTURE_GEN_MODE, GL_EYE_LINEAR);
			glTexGeni(GL_T, GL_TEXTURE_GEN_MODE, GL_EYE_LINEAR);
			glTexGeni(GL_Q, GL_TEXTURE_GEN_MODE, GL_OBJECT_LINEAR);
			glTexGenfv(GL_Q, GL_OBJECT_PLANE, new float[] { 0.0F, 0.0F, 0.0F, 1.0F });
			glEnable(GL_TEXTURE_GEN_S);
			glEnable(GL_TEXTURE_GEN_T);
			glEnable(GL_TEXTURE_GEN_R);
			glEnable(GL_TEXTURE_GEN_Q);
			glEnable(GL_TEXTURE_3D);
			glActiveTexture(GL_TEXTURE2);
			glTexEnvi(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_COMBINE);
		}
		glBindTexture(GL_TEXTURE_1D, this.textureId);
		glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_INTERPOLATE);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC0_RGB, GL_CONSTANT);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC2_RGB, GL_TEXTURE);
		glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_ALPHA, GL_REPLACE);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC0_ALPHA, GL_PREVIOUS);
		glTexGeni(GL_S, GL_TEXTURE_GEN_MODE, GL_EYE_LINEAR);
		glEnable(GL_TEXTURE_1D);
		glEnable(GL_TEXTURE_GEN_S);
		glActiveTexture(GL_TEXTURE0);
		glEndList();
		glNewList(this.listId + 1, GL_COMPILE);
		glActiveTexture(GL_TEXTURE1);
		if (aBoolean308) {
			glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_MODULATE);
			glTexEnvi(GL_TEXTURE_ENV, GL_OPERAND0_RGB, GL_SRC_COLOR);
			glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_ALPHA, GL_MODULATE);
			glTexEnvi(GL_TEXTURE_ENV, GL_SRC0_ALPHA, GL_TEXTURE);
			glDisable(GL_TEXTURE_GEN_S);
			glDisable(GL_TEXTURE_GEN_T);
			glDisable(GL_TEXTURE_GEN_R);
			glDisable(GL_TEXTURE_GEN_Q);
			glDisable(GL_TEXTURE_3D);
			glActiveTexture(GL_TEXTURE2);
			glTexEnvi(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_MODULATE);
		}
		glTexEnvfv(GL_TEXTURE_ENV, GL_TEXTURE_ENV_COLOR, new float[] { 0.0F, 1.0F, 0.0F, 1.0F });
		glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_MODULATE);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC0_RGB, GL_TEXTURE);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC2_RGB, GL_CONSTANT);
		glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_ALPHA, GL_MODULATE);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC0_ALPHA, GL_TEXTURE);
		glDisable(GL_TEXTURE_1D);
		glDisable(GL_TEXTURE_GEN_S);
		glActiveTexture(GL_TEXTURE0);
		glEndList();
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "()V")
	@Override
	public final void bind() {
		glCallList(this.listId);
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "()I")
	@Override
	public final int getFlags() {
		return 0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "()V")
	@Override
	public final void unbind() {
		glCallList(this.listId + 1);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	@Override
	public final void setArgument(@OriginalArg(0) int arg0) {
		glActiveTexture(GL_TEXTURE1);
		if (aBoolean308 || arg0 >= 0) {
			glPushMatrix();
			glLoadIdentity();
			glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
			glRotatef((float) MaterialManager.anInt5559 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
			glRotatef((float) MaterialManager.anInt1815 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
			glTranslatef((float) -MaterialManager.anInt406, (float) -MaterialManager.anInt4675, (float) -MaterialManager.anInt5158);
			if (aBoolean308) {
				this.tempVertex[0] = 0.001F;
				this.tempVertex[1] = 9.0E-4F;
				this.tempVertex[2] = 0.0F;
				this.tempVertex[3] = 0.0F;
				glTexGenfv(GL_S, GL_EYE_PLANE, this.tempVertex);
				this.tempVertex[0] = 0.0F;
				this.tempVertex[1] = 9.0E-4F;
				this.tempVertex[2] = 0.001F;
				this.tempVertex[3] = 0.0F;
				glTexGenfv(GL_T, GL_EYE_PLANE, this.tempVertex);
				this.tempVertex[0] = 0.0F;
				this.tempVertex[1] = 0.0F;
				this.tempVertex[2] = 0.0F;
				this.tempVertex[3] = (float) GlRenderer.anInt5323 * 0.005F;
				glTexGenfv(GL_R, GL_EYE_PLANE, this.tempVertex);
				glActiveTexture(GL_TEXTURE2);
			}
			glTexEnvfv(GL_TEXTURE_ENV, GL_TEXTURE_ENV_COLOR, WaterMaterialRenderer.method2422());
			if (arg0 >= 0) {
				this.tempVertex[0] = 0.0F;
				this.tempVertex[1] = 1.0F / (float) anInt3241;
				this.tempVertex[2] = 0.0F;
				this.tempVertex[3] = (float) arg0 * 1.0F / (float) anInt3241;
				glTexGenfv(GL_S, GL_EYE_PLANE, this.tempVertex);
				glEnable(GL_TEXTURE_GEN_S);
			} else {
				glDisable(GL_TEXTURE_GEN_S);
			}
			glPopMatrix();
		} else {
			glDisable(GL_TEXTURE_GEN_S);
		}
		glActiveTexture(GL_TEXTURE0);
	}
}