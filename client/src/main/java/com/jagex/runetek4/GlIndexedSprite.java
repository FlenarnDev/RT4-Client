package com.jagex.runetek4;

import java.nio.ByteBuffer;

import com.jagex.runetek4.util.IntUtils;

import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.BufferUtils;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class GlIndexedSprite extends IndexedSprite {

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
	private int contextId;

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
	private int powerOfTwoHeight;

	@OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
	private int powerOfTwoWidth;

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
	private int textureId = -1;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
	private int filterMode = 0;

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
	private int listId = -1;

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
	private int size = 0;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public GlIndexedSprite(@OriginalArg(0) int innerWidth, @OriginalArg(1) int innerHeight, @OriginalArg(2) int xOffset, @OriginalArg(3) int yOffset, @OriginalArg(4) int width, @OriginalArg(5) int height, @OriginalArg(6) byte[] pixels, @OriginalArg(7) int[] palette) {
		this.innerWidth = innerWidth;
		this.innerHeight = innerHeight;
		this.xOffset = xOffset;
		this.yOffset = yOffset;
		this.width = width;
		this.height = height;
		this.setPixels(pixels, palette);
		this.createList();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "([B[I)V")
	private void setPixels(@OriginalArg(0) byte[] src, @OriginalArg(1) int[] palette) {
		this.powerOfTwoWidth = IntUtils.bitceil(this.width);
		this.powerOfTwoHeight = IntUtils.bitceil(this.height);

		@Pc(20) byte[] tex = new byte[this.powerOfTwoWidth * this.powerOfTwoHeight * 4];

		@Pc(22) int dstOff = 0;
		@Pc(24) int srcOff = 0;
		for (@Pc(26) int y = 0; y < this.height; y++) {
			for (@Pc(32) int x = 0; x < this.width; x++) {
				@Pc(41) byte index = src[srcOff++];
				if (index == 0) {
					dstOff += 4;
				} else {
					@Pc(47) int color = palette[index & 0xFF]; // Avoid signed byte issue.
					tex[dstOff++] = (byte) (color >> 16);	// R
					tex[dstOff++] = (byte) (color >> 8);	// G
					tex[dstOff++] = (byte) color;			// B
					tex[dstOff++] = (byte) 0xFF;			// A
				}
			}
			dstOff += (this.powerOfTwoWidth - this.width) * 4;
		}
		@Pc(93) ByteBuffer buffer = BufferUtils.createByteBuffer(tex.length);
		buffer.put(tex).flip();

		if (this.textureId == -1) {
			this.textureId = glGenTextures();
			this.contextId = GlCleaner.contextId;
		}
		GlRenderer.setTextureId(this.textureId);
		glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, this.powerOfTwoWidth, this.powerOfTwoHeight, 0, GL_RGBA, GL_UNSIGNED_BYTE, buffer);

		int size = buffer.limit();
		GlCleaner.oncard_2d += size - this.size;
		this.size = size;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)V")
	@Override
	public void drawImageAlpha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int alpha) {
		GlRenderer.method4155();
		@Pc(5) int x = arg0 + this.xOffset;
		@Pc(10) int y = arg1 + this.yOffset;
		GlRenderer.setTextureId(this.textureId);
		this.setFilterMode();
		glColor4f(1.0F, 1.0F, 1.0F, (float) alpha / 256.0F);
		glTranslatef((float) x, (float) (GlRenderer.canvasHeight - y), 0.0F);
		glCallList(this.listId);
		glLoadIdentity();
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
	private void setFilterMode() {
		if (this.filterMode != 1) {
			this.filterMode = 1;
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V")
	@Override
	public void renderTransparent(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		GlRenderer.setupRgbAlphaMode1Rendering();
		@Pc(5) int local5 = arg0 + this.xOffset;
		@Pc(10) int local10 = arg1 + this.yOffset;
		GlRenderer.setTextureId(this.textureId);
		this.setFilterMode();
		glTranslatef((float) local5, (float) (GlRenderer.canvasHeight - local10), 0.0F);
		glCallList(this.listId);
		glLoadIdentity();
	}

	@OriginalMember(owner = "client!oh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.textureId != -1) {
			GlCleaner.deleteTexture2d(this.textureId, this.size, this.contextId);
			this.textureId = -1;
			this.size = 0;
		}
		if (this.listId != -1) {
			GlCleaner.deleteList(this.listId, this.contextId);
			this.listId = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "()V")
	private void createList() {
		@Pc(7) float local7 = (float) this.width / (float) this.powerOfTwoWidth;
		@Pc(15) float local15 = (float) this.height / (float) this.powerOfTwoHeight;
		if (this.listId == -1) {
			this.listId = glGenLists(1);
			this.contextId = GlCleaner.contextId;
		}
		glNewList(this.listId, GL_COMPILE);
		glBegin(GL_TRIANGLE_FAN);
		glTexCoord2f(local7, 0.0F);
		glVertex2f((float) this.width, 0.0F);
		glTexCoord2f(0.0F, 0.0F);
		glVertex2f(0.0F, 0.0F);
		glTexCoord2f(0.0F, local15);
		glVertex2f(0.0F, (float) -this.height);
		glTexCoord2f(local7, local15);
		glVertex2f((float) this.width, (float) -this.height);
		glEnd();
		glEndList();
	}
}
