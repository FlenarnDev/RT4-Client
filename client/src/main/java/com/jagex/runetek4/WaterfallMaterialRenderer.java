package com.jagex.runetek4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL13.*;

@OriginalClass("client!ob")
public final class WaterfallMaterialRenderer implements MaterialRenderer {

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
	private int anInt4236;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "[F")
	private final float[] aFloatArray21 = new float[4];

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	public WaterfallMaterialRenderer() {
		this.method3307();
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "()I")
	@Override
	public int getFlags() {
		return 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	@Override
	public void setArgument(@OriginalArg(0) int arg0) {
		@Pc(18) float local18 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
		@Pc(27) float local27 = -0.01F * (float) ((arg0 & 0x3) + 1);
		@Pc(36) float local36 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(47) boolean local47 = (arg0 & 0x80) != 0;
		if (local47) {
			this.aFloatArray21[0] = local36;
			this.aFloatArray21[1] = 0.0F;
			this.aFloatArray21[2] = 0.0F;
			this.aFloatArray21[3] = 0.0F;
		} else {
			this.aFloatArray21[2] = local36;
			this.aFloatArray21[1] = 0.0F;
			this.aFloatArray21[3] = 0.0F;
			this.aFloatArray21[0] = 0.0F;
		}
		glActiveTexture(GL_TEXTURE1);
		glMatrixMode(GL_MODELVIEW);
		glPushMatrix();
		glLoadIdentity();
		glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		glRotatef((float) MaterialManager.anInt5559 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
		glRotatef((float) MaterialManager.anInt1815 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
		glTranslatef((float) -MaterialManager.anInt406, (float) -MaterialManager.anInt4675, (float) -MaterialManager.anInt5158);
		glTexGenfv(GL_S, GL_EYE_PLANE, this.aFloatArray21);
		this.aFloatArray21[3] = local27 * (float) GlRenderer.anInt5323;
		this.aFloatArray21[0] = 0.0F;
		this.aFloatArray21[2] = 0.0F;
		this.aFloatArray21[1] = local36;
		glTexGenfv(GL_T, GL_EYE_PLANE, this.aFloatArray21);
		glPopMatrix();
		if (MaterialManager.allows3DTextureMapping) {
			this.aFloatArray21[3] = (float) GlRenderer.anInt5323 * local18;
			this.aFloatArray21[1] = 0.0F;
			this.aFloatArray21[0] = 0.0F;
			this.aFloatArray21[2] = 0.0F;
			glTexGenfv(GL_R, GL_OBJECT_PLANE, this.aFloatArray21);
		} else {
			@Pc(189) int local189 = (int) ((float) GlRenderer.anInt5323 * local18 * 64.0F);
			glBindTexture(GL_TEXTURE_2D, MaterialManager.waterfallTextures[local189 % 64]);
		}
		glActiveTexture(GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "()V")
	@Override
	public void unbind() {
        glCallList(this.anInt4236 + 1);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "()V")
	@Override
	public void bind() {
        glCallList(this.anInt4236);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	private void method3307() {
        this.anInt4236 = glGenLists(2);
		glNewList(this.anInt4236, GL_COMPILE);
		glActiveTexture(GL_TEXTURE1);
		if (MaterialManager.allows3DTextureMapping) {
			glBindTexture(GL_TEXTURE_3D, MaterialManager.waterfallTextureId);
			glTexGeni(GL_R, GL_TEXTURE_GEN_MODE, GL_OBJECT_LINEAR);
			glEnable(GL_TEXTURE_GEN_R);
			glEnable(GL_TEXTURE_3D);
		} else {
			glEnable(GL_TEXTURE_2D);
		}
		glTexGeni(GL_S, GL_TEXTURE_GEN_MODE, GL_EYE_LINEAR);
		glTexGeni(GL_T, GL_TEXTURE_GEN_MODE, GL_EYE_LINEAR);
		glEnable(GL_TEXTURE_GEN_S);
		glEnable(GL_TEXTURE_GEN_T);
		glActiveTexture(GL_TEXTURE0);
		glEndList();
		glNewList(this.anInt4236 + 1, GL_COMPILE);
		glActiveTexture(GL_TEXTURE1);
		if (MaterialManager.allows3DTextureMapping) {
			glDisable(GL_TEXTURE_3D);
			glDisable(GL_TEXTURE_GEN_R);
		} else {
			glDisable(GL_TEXTURE_2D);
		}
		glDisable(GL_TEXTURE_GEN_S);
		glDisable(GL_TEXTURE_GEN_T);
		glActiveTexture(GL_TEXTURE0);
		glEndList();
	}
}