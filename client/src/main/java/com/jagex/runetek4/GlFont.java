package com.jagex.runetek4;

import java.nio.ByteBuffer;

import com.jagex.runetek4.cache.media.Font;

import com.jagex.runetek4.util.IntUtils;

import com.jogamp.opengl.*;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL13.*;
import static org.lwjgl.opengl.GL15.GL_SRC0_RGB;

@OriginalClass("client!mb")
public final class GlFont extends Font {

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "Lclient!cf;")
	public static GlSprite masked = null;

	@OriginalMember(owner = "client!mb", name = "Gb", descriptor = "[I")
	private int[] listIds;

	@OriginalMember(owner = "client!mb", name = "Hb", descriptor = "I")
	private int contextId;

	@OriginalMember(owner = "client!mb", name = "Ib", descriptor = "I")
	private int powerOfTwoSize;

	@OriginalMember(owner = "client!mb", name = "Fb", descriptor = "I")
	private int textureId = -1;

	@OriginalMember(owner = "client!mb", name = "Eb", descriptor = "I")
	private int size = 0;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public GlFont(@OriginalArg(0) byte[] bytes, @OriginalArg(1) int[] xOffsets, @OriginalArg(2) int[] yOffsets, @OriginalArg(3) int[] innerWidths, @OriginalArg(4) int[] innerHeights, @OriginalArg(5) byte[][] pixels) {
		super(bytes, xOffsets, yOffsets, innerWidths, innerHeights);
		this.createTexture(pixels);
		this.createLists();
	}

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!cf;)V")
    public static void method1188(@OriginalArg(0) GlSprite glSprite) {
        if (glSprite.height != GlRaster.clipBottom - GlRaster.clipTop) {
            throw new IllegalArgumentException();
        }
        masked = glSprite;
    }

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "()V")
	public static void method1173() {
		masked = null;
	}

	@OriginalMember(owner = "client!mb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.textureId != -1) {
			GlCleaner.deleteTexture2d(this.textureId, this.size, this.contextId);
			this.textureId = -1;
			this.size = 0;
		}
		if (this.listIds != null) {
			for (@Pc(21) int i = 0; i < this.listIds.length; i++) {
				GlCleaner.deleteList(this.listIds[i], this.contextId);
			}
			this.listIds = null;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void renderGlyph(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) GL2 gl;
		if (masked == null) {
			GlRenderer.setupRgbAlphaMode0Rendering();
			GlRenderer.setTextureId(this.textureId);
			glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
			glTranslatef((float) arg1, (float) (GlRenderer.canvasHeight - arg2), 0.0F);
			glCallList(this.listIds[arg0]);
			glLoadIdentity();
			return;
		}
		GlRenderer.setupRgbAlphaMode0Rendering();
		gl = GlRenderer.gl;
		glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
		glTranslatef((float) arg1, (float) (GlRenderer.canvasHeight - arg2), 0.0F);
		@Pc(32) float local32 = (float) (arg0 % 16) / 16.0F;
		@Pc(39) float local39 = (float) (arg0 / 16) / 16.0F;
		@Pc(51) float local51 = local32 + (float) this.spriteInnerWidths[arg0] / (float) this.powerOfTwoSize;
		@Pc(63) float local63 = local39 + (float) this.spriteInnerHeights[arg0] / (float) this.powerOfTwoSize;
		GlRenderer.setTextureId(this.textureId);
		@Pc(68) GlSprite local68 = masked;
		glActiveTexture(GL_TEXTURE1);
		glEnable(GL_TEXTURE_2D);
		glBindTexture(GL_TEXTURE_2D, local68.textureId);
		glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_REPLACE);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC0_RGB, GL_PREVIOUS);
		@Pc(98) float local98 = (float) (arg1 - GlRaster.clipLeft) / (float) local68.powerOfTwoWidth;
		@Pc(107) float local107 = (float) (arg2 - GlRaster.clipTop) / (float) local68.powerOfTwoHeight;
		@Pc(118) float local118 = (float) (arg1 + arg3 - GlRaster.clipLeft) / (float) local68.powerOfTwoWidth;
		@Pc(129) float local129 = (float) (arg2 + arg4 - GlRaster.clipTop) / (float) local68.powerOfTwoHeight;
		glBegin(GL_TRIANGLE_FAN);
		glMultiTexCoord2f(GL_TEXTURE1, local118, local107);
		glTexCoord2f(local51, local39);
		glVertex2f((float) this.spriteInnerWidths[arg0], 0.0F);
		glMultiTexCoord2f(GL_TEXTURE1, local98, local107);
		glTexCoord2f(local32, local39);
		glVertex2f(0.0F, 0.0F);
		glMultiTexCoord2f(GL_TEXTURE1, local98, local129);
		glTexCoord2f(local32, local63);
		glVertex2f(0.0F, (float) -this.spriteInnerHeights[arg0]);
		glMultiTexCoord2f(GL_TEXTURE1, local118, local129);
		glTexCoord2f(local51, local63);
		glVertex2f((float) this.spriteInnerWidths[arg0], (float) -this.spriteInnerHeights[arg0]);
		glEnd();
		glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_MODULATE);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC0_RGB, GL_TEXTURE);
		glDisable(GL_TEXTURE_2D);
		glActiveTexture(GL_TEXTURE0);
		glLoadIdentity();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void renderGlyphTransparent(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		GlRenderer.setupRgbAlphaMode0Rendering();
		GlRenderer.setTextureId(this.textureId);
		glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
		glTranslatef((float) arg1, (float) (GlRenderer.canvasHeight - arg2), 0.0F);
		glCallList(this.listIds[arg0]);
		glLoadIdentity();
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "()V")
	private void createLists() {
		if (this.listIds != null) {
			return;
		}
		this.listIds = new int[256];

		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(21) float local21 = (float) (local11 % 16) / 16.0F;
			@Pc(28) float local28 = (float) (local11 / 16) / 16.0F;
			@Pc(40) float local40 = local21 + (float) this.spriteInnerWidths[local11] / (float) this.powerOfTwoSize;
			@Pc(52) float local52 = local28 + (float) this.spriteInnerHeights[local11] / (float) this.powerOfTwoSize;
			this.listIds[local11] = glGenLists(1);
			glNewList(this.listIds[local11], GL_COMPILE);
			glBegin(GL_TRIANGLE_FAN);
			glTexCoord2f(local40, local28);
			glVertex2f((float) this.spriteInnerWidths[local11], 0.0F);
			glTexCoord2f(local21, local28);
			glVertex2f(0.0F, 0.0F);
			glTexCoord2f(local21, local52);
			glVertex2f(0.0F, (float) -this.spriteInnerHeights[local11]);
			glTexCoord2f(local40, local52);
			glVertex2f((float) this.spriteInnerWidths[local11], (float) -this.spriteInnerHeights[local11]);
			glEnd();
			glEndList();
		}
		this.contextId = GlCleaner.contextId;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([[B)V")
	private void createTexture(@OriginalArg(0) byte[][] arg0) {
		if (this.textureId != -1) {
			return;
		}
		this.powerOfTwoSize = 0;
		@Pc(9) int i;
		for (i = 0; i < 256; i++) {
			if (this.spriteInnerHeights[i] > this.powerOfTwoSize) {
				this.powerOfTwoSize = this.spriteInnerHeights[i];
			}
			if (this.spriteInnerWidths[i] > this.powerOfTwoSize) {
				this.powerOfTwoSize = this.spriteInnerWidths[i];
			}
		}
		this.powerOfTwoSize *= 16;
		this.powerOfTwoSize = IntUtils.bitceil(this.powerOfTwoSize);
		i = this.powerOfTwoSize / 16;
		@Pc(66) byte[] local66 = new byte[this.powerOfTwoSize * this.powerOfTwoSize * 2];
		for (@Pc(68) int local68 = 0; local68 < 256; local68++) {
			@Pc(77) int local77 = local68 % 16 * i;
			@Pc(83) int local83 = local68 / 16 * i;
			@Pc(92) int local92 = (local83 * this.powerOfTwoSize + local77) * 2;
			@Pc(94) int local94 = 0;
			@Pc(99) int local99 = this.spriteInnerHeights[local68];
			@Pc(104) int local104 = this.spriteInnerWidths[local68];
			@Pc(108) byte[] local108 = arg0[local68];
			for (@Pc(110) int local110 = 0; local110 < local99; local110++) {
				for (@Pc(115) int local115 = 0; local115 < local104; local115++) {
					if (local108[local94++] == 0) {
						local92 += 2;
					} else {
						local66[local92++] = -1;
						local66[local92++] = -1;
					}
				}
				local92 += (this.powerOfTwoSize - local104) * 2;
			}
		}
		@Pc(153) ByteBuffer local153 = ByteBuffer.wrap(local66);
		@Pc(155) GL2 local155 = GlRenderer.gl;
		if (this.textureId == -1) {
			@Pc(162) int[] temp = new int[1];
			local155.glGenTextures(1, temp, 0);
			this.textureId = temp[0];
			this.contextId = GlCleaner.contextId;
		}
		GlRenderer.setTextureId(this.textureId);
		local155.glTexImage2D(GL2.GL_TEXTURE_2D, 0, GL2.GL_LUMINANCE_ALPHA, this.powerOfTwoSize, this.powerOfTwoSize, 0, GL2.GL_LUMINANCE_ALPHA, GL2.GL_UNSIGNED_BYTE, local153);
		GlCleaner.oncard_2d += local153.limit() - this.size;
		this.size = local153.limit();
		local155.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_MIN_FILTER, GL2.GL_NEAREST);
		local155.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_MAG_FILTER, GL2.GL_NEAREST);
	}
}
