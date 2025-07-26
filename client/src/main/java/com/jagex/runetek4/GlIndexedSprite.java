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
	private int anInt4285;

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
	private int anInt4286;

	@OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
	private int anInt4287;

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
	private int anInt4281 = -1;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
	private int anInt4283 = 0;

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
	private int anInt4282 = -1;

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
	private int anInt4284 = 0;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public GlIndexedSprite(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.innerWidth = arg0;
		this.innerHeight = arg1;
		this.xOffset = arg2;
		this.yOffset = arg3;
		this.width = arg4;
		this.height = arg5;
		this.method3337(arg6, arg7);
		this.method3339();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "([B[I)V")
	private void method3337(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1) {
		this.anInt4287 = IntUtils.bitceil(this.width);
		this.anInt4286 = IntUtils.bitceil(this.height);

		@Pc(20) byte[] tex = new byte[this.anInt4287 * this.anInt4286 * 4];

		@Pc(22) int dst = 0;
		@Pc(24) int src = 0;
		for (@Pc(26) int y = 0; y < this.height; y++) {
			for (@Pc(32) int x = 0; x < this.width; x++) {
				@Pc(41) byte index = arg0[src++];
				if (index == 0) {
					dst += 4;
				} else {
					@Pc(47) int color = arg1[index & 0xFF]; // Avoid signed byte issue.
					tex[dst++] = (byte) (color >> 16);	// R
					tex[dst++] = (byte) (color >> 8);	// G
					tex[dst++] = (byte) color;			// B
					tex[dst++] = (byte) 0xFF;			// A
				}
			}
			dst += (this.anInt4287 - this.width) * 4;
		}
		@Pc(93) ByteBuffer buffer = BufferUtils.createByteBuffer(tex.length);
		buffer.put(tex).flip();

		if (this.anInt4281 == -1) {
			this.anInt4281 = glGenTextures();
			this.anInt4285 = GlCleaner.contextId;
		}
		GlRenderer.setTextureId(this.anInt4281);
		glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, this.anInt4287, this.anInt4286, 0, GL_RGBA, GL_UNSIGNED_BYTE, buffer);

		int size = buffer.limit();
		GlCleaner.oncard_2d += size - this.anInt4284;
		this.anInt4284 = size;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)V")
	@Override
	public void drawImageAlpha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		GlRenderer.method4155();
		@Pc(5) int local5 = arg0 + this.xOffset;
		@Pc(10) int local10 = arg1 + this.yOffset;
		GlRenderer.setTextureId(this.anInt4281);
		this.method3338();
		glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
		glTranslatef((float) local5, (float) (GlRenderer.canvasHeight - local10), 0.0F);
		glCallList(this.anInt4282);
		glLoadIdentity();
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
	private void method3338() {
		if (this.anInt4283 != 1) {
			this.anInt4283 = 1;
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
		GlRenderer.setTextureId(this.anInt4281);
		this.method3338();
		glTranslatef((float) local5, (float) (GlRenderer.canvasHeight - local10), 0.0F);
		glCallList(this.anInt4282);
		glLoadIdentity();
	}

	@OriginalMember(owner = "client!oh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt4281 != -1) {
			GlCleaner.deleteTexture2d(this.anInt4281, this.anInt4284, this.anInt4285);
			this.anInt4281 = -1;
			this.anInt4284 = 0;
		}
		if (this.anInt4282 != -1) {
			GlCleaner.deleteList(this.anInt4282, this.anInt4285);
			this.anInt4282 = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "()V")
	private void method3339() {
		@Pc(7) float local7 = (float) this.width / (float) this.anInt4287;
		@Pc(15) float local15 = (float) this.height / (float) this.anInt4286;
		if (this.anInt4282 == -1) {
			this.anInt4282 = glGenLists(1);
			this.anInt4285 = GlCleaner.contextId;
		}
		glNewList(this.anInt4282, GL_COMPILE);
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
