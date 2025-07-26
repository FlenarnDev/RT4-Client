package com.jagex.runetek4;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import com.jagex.runetek4.cache.media.SoftwareSprite;
import com.jagex.runetek4.util.IntUtils;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL13.*;
import static org.lwjgl.opengl.GL13C.GL_TEXTURE1;
import static org.lwjgl.opengl.GL15.GL_SRC0_RGB;

import org.lwjgl.BufferUtils;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public class GlSprite extends Sprite {

	@OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
	public int powerOfTwoWidth;

	@OriginalMember(owner = "client!cf", name = "cb", descriptor = "I")
	public int powerOfTwoHeight;

	@OriginalMember(owner = "client!cf", name = "db", descriptor = "I")
	private int contextId;

	@OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
	protected int anInt1869 = 0;

	@OriginalMember(owner = "client!cf", name = "ab", descriptor = "I")
	public int textureId = -1;

	@OriginalMember(owner = "client!cf", name = "Z", descriptor = "I")
	private int anInt1871 = -1;

	@OriginalMember(owner = "client!cf", name = "bb", descriptor = "I")
	private int anInt1873 = 0;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(IIIIII[I)V")
	public GlSprite(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		this.innerWidth = arg0;
		this.innerHeight = arg1;
		this.xOffset = arg2;
		this.yOffset = arg3;
		this.width = arg4;
		this.height = arg5;
		this.method1430(arg6);
		this.method1431();
	}

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!mm;)V")
	public GlSprite(@OriginalArg(0) SoftwareSprite softwareSprite) {
		this.innerWidth = softwareSprite.innerWidth;
		this.innerHeight = softwareSprite.innerHeight;
		this.xOffset = softwareSprite.xOffset;
		this.yOffset = softwareSprite.yOffset;
		this.width = softwareSprite.width;
		this.height = softwareSprite.height;
		this.method1430(softwareSprite.pixels);
		this.method1431();
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
	private void method1424(@OriginalArg(0) int arg0) {
		if (this.anInt1873 == arg0) {
			return;
		}
		this.anInt1873 = arg0;

		if (arg0 == 2) {
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
		} else {
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILclient!cf;)V")
	public final void method1425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) GlSprite arg2) {
		if (arg2 == null) {
			return;
		}
		GlRenderer.setupRgbAlphaMode1Rendering();
		GlRenderer.setTextureId(arg2.textureId);
		arg2.method1424(1);
		GlRenderer.setTextureId(this.textureId);
		this.method1424(1);
		glActiveTexture(GL_TEXTURE1);
		glEnable(GL_TEXTURE_2D);
		glBindTexture(GL_TEXTURE_2D, arg2.textureId);
		glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_REPLACE);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC0_RGB, GL_PREVIOUS);
		@Pc(47) float local47 = (float) (arg0 - GlRaster.clipLeft) / (float) arg2.powerOfTwoWidth;
		@Pc(56) float local56 = (float) (arg1 - GlRaster.clipTop) / (float) arg2.powerOfTwoHeight;
		@Pc(68) float local68 = (float) (arg0 + this.width - GlRaster.clipLeft) / (float) arg2.powerOfTwoWidth;
		@Pc(80) float local80 = (float) (arg1 + this.height - GlRaster.clipTop) / (float) arg2.powerOfTwoHeight;
		@Pc(85) int local85 = arg0 + this.xOffset;
		@Pc(90) int local90 = arg1 + this.yOffset;
		glBegin(GL_TRIANGLE_FAN);
		glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		@Pc(107) float local107 = (float) this.width / (float) this.powerOfTwoWidth;
		@Pc(115) float local115 = (float) this.height / (float) this.powerOfTwoHeight;
		glMultiTexCoord2f(GL_TEXTURE1, local68, local56);
		glTexCoord2f(local107, 0.0F);
		glVertex2f((float) (local85 + this.width), (float) (GlRenderer.canvasHeight - local90));
		glMultiTexCoord2f(GL_TEXTURE1, local47, local56);
		glTexCoord2f(0.0F, 0.0F);
		glVertex2f((float) local85, (float) (GlRenderer.canvasHeight - local90));
		glMultiTexCoord2f(GL_TEXTURE1, local47, local80);
		glTexCoord2f(0.0F, local115);
		glVertex2f((float) local85, (float) (GlRenderer.canvasHeight - local90 - this.height));
		glMultiTexCoord2f(GL_TEXTURE1, local68, local80);
		glTexCoord2f(local107, local115);
		glVertex2f((float) (local85 + this.width), (float) (GlRenderer.canvasHeight - local90 - this.height));
		glEnd();
		glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_MODULATE);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC0_RGB, GL_TEXTURE);
		glDisable(GL_TEXTURE_2D);
		glActiveTexture(GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(IIIII)V")
	public final void method1426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		GlRenderer.method4155();
		GlRenderer.setTextureId(this.textureId);
		this.method1424(1);
		@Pc(16) float local16 = (float) this.width / (float) this.powerOfTwoWidth;
		@Pc(24) float local24 = (float) this.height / (float) this.powerOfTwoHeight;
		@Pc(29) float local29 = local16 * (float) arg3;
		@Pc(34) float local34 = local24 * (float) arg4;
		@Pc(39) int local39 = arg0 + this.xOffset;
		@Pc(46) int local46 = local39 + this.width * arg3;
		@Pc(53) int local53 = GlRenderer.canvasHeight - arg1 - this.yOffset;
		@Pc(60) int local60 = local53 - this.height * arg4;
		@Pc(65) float local65 = (float) arg2 / 256.0F;
		glBegin(GL_TRIANGLE_FAN);
		glColor4f(1.0F, 1.0F, 1.0F, local65);
		glTexCoord2f(local29, 0.0F);
		glVertex2f((float) local46, (float) local53);
		glTexCoord2f(0.0F, 0.0F);
		glVertex2f((float) local39, (float) local53);
		glTexCoord2f(0.0F, local34);
		glVertex2f((float) local39, (float) local60);
		glTexCoord2f(local29, local34);
		glVertex2f((float) local46, (float) local60);
		glEnd();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIIILclient!cf;)V")
	public final void renderRotatedTransparent(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) GlSprite arg8) {
		if (arg8 == null) {
			return;
		}
		GlRenderer.setupRgbAlphaMode1Rendering();
		GlRenderer.setTextureId(arg8.textureId);
		arg8.method1424(1);
		GlRenderer.setTextureId(this.textureId);
		this.method1424(1);
		glActiveTexture(GL_TEXTURE1);
		glEnable(GL_TEXTURE_2D);
		glBindTexture(GL_TEXTURE_2D, arg8.textureId);
		glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_REPLACE);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC0_RGB, GL_PREVIOUS);
		@Pc(43) int local43 = -arg2 / 2;
		@Pc(48) int local48 = -arg3 / 2;
		@Pc(51) int local51 = -local43;
		@Pc(54) int local54 = -local48;
		@Pc(63) int local63 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
		@Pc(72) int local72 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
		@Pc(78) int local78 = local63 * arg7 >> 8;
		@Pc(84) int local84 = local72 * arg7 >> 8;
		@Pc(96) int local96 = (arg4 << 16) + local48 * local78 + local43 * local84;
		@Pc(108) int local108 = (arg5 << 16) + (local48 * local84 - local43 * local78);
		@Pc(120) int local120 = (arg4 << 16) + local48 * local78 + local51 * local84;
		@Pc(132) int local132 = (arg5 << 16) + (local48 * local84 - local51 * local78);
		@Pc(144) int local144 = (arg4 << 16) + local54 * local78 + local43 * local84;
		@Pc(156) int local156 = (arg5 << 16) + (local54 * local84 - local43 * local78);
		@Pc(168) int local168 = (arg4 << 16) + local54 * local78 + local51 * local84;
		@Pc(180) int local180 = (arg5 << 16) + (local54 * local84 - local51 * local78);
		@Pc(188) float local188 = (float) arg8.width / (float) arg8.powerOfTwoWidth;
		@Pc(196) float local196 = (float) arg8.height / (float) arg8.powerOfTwoHeight;
		glBegin(GL_TRIANGLE_FAN);
		glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		@Pc(211) float local211 = (float) this.powerOfTwoWidth * 65536.0F;
		@Pc(217) float local217 = (float) (this.powerOfTwoHeight * 65536);
		glMultiTexCoord2f(GL_TEXTURE1, local188, 0.0F);
		glTexCoord2f((float) local120 / local211, (float) local132 / local217);
		glVertex2f((float) (arg0 + arg2), (float) (GlRenderer.canvasHeight - arg1));
		glMultiTexCoord2f(GL_TEXTURE1, 0.0F, 0.0F);
		glTexCoord2f((float) local96 / local211, (float) local108 / local217);
		glVertex2f((float) arg0, (float) (GlRenderer.canvasHeight - arg1));
		glMultiTexCoord2f(GL_TEXTURE1, 0.0F, local196);
		glTexCoord2f((float) local144 / local211, (float) local156 / local217);
		glVertex2f((float) arg0, (float) (GlRenderer.canvasHeight - arg1 - arg3));
		glMultiTexCoord2f(GL_TEXTURE1, local188, local196);
		glTexCoord2f((float) local168 / local211, (float) local180 / local217);
		glVertex2f((float) (arg0 + arg2), (float) (GlRenderer.canvasHeight - arg1 - arg3));
		glEnd();
		glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_MODULATE);
		glTexEnvi(GL_TEXTURE_ENV, GL_SRC0_RGB, GL_TEXTURE);
		glDisable(GL_TEXTURE_2D);
		glActiveTexture(GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(II)V")
	@Override
	public final void renderHorizontalFlip(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		GlRenderer.setupRgbAlphaMode1Rendering();
		@Pc(5) int local5 = arg0 + this.xOffset;
		@Pc(10) int local10 = arg1 + this.yOffset;
		GlRenderer.setTextureId(this.textureId);
		this.method1424(1);
		glTranslatef((float) local5, (float) (GlRenderer.canvasHeight - local10), 0.0F);
		@Pc(35) float local35 = (float) this.width / (float) this.powerOfTwoWidth;
		@Pc(43) float local43 = (float) this.height / (float) this.powerOfTwoHeight;
		glBegin(GL_TRIANGLE_FAN);
		glTexCoord2f(0.0F, 0.0F);
		glVertex2f((float) this.width, 0.0F);
		glTexCoord2f(local35, 0.0F);
		glVertex2f(0.0F, 0.0F);
		glTexCoord2f(local35, local43);
		glVertex2f(0.0F, (float) -this.height);
		glTexCoord2f(0.0F, local43);
		glVertex2f((float) this.width, (float) -this.height);
		glEnd();
		glLoadIdentity();
	}

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(II)V")
	@Override
	public final void render(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		GlRenderer.setupRgbAlphaMode1Rendering();
		@Pc(5) int local5 = arg0 + this.xOffset;
		@Pc(10) int local10 = arg1 + this.yOffset;
		GlRenderer.setTextureId(this.textureId);
		this.method1424(1);
		glTranslatef((float) local5, (float) (GlRenderer.canvasHeight - local10), 0.0F);
		glCallList(this.anInt1871);
		glLoadIdentity();
		GlCleaner.clear();
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(IIIIII)V")
	public final void method1428(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		GlRenderer.setupRgbAlphaMode1Rendering();
		GlRenderer.setTextureId(this.textureId);
		this.method1424(2);
		@Pc(15) int local15 = 240 - (this.xOffset << 4);
		@Pc(22) int local22 = 240 - (this.yOffset << 4);
		glTranslatef((float) arg0 / 16.0F, (float) GlRenderer.canvasHeight - (float) arg1 / 16.0F, 0.0F);
		glRotatef((float) -arg2 * 0.005493164F, 0.0F, 0.0F, 1.0F);
		glTranslatef((float) -local15 / 16.0F, (float) local22 / 16.0F, 0.0F);
		glCallList(this.anInt1871);
		glLoadIdentity();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIII)V")
	@Override
	public final void renderResized(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		GlRenderer.setupRgbAlphaMode1Rendering();
		@Pc(8) int local8 = this.width;
		@Pc(11) int local11 = this.height;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = this.innerWidth;
		@Pc(21) int local21 = this.innerHeight;
		@Pc(27) int local27 = (local18 << 16) / arg2;
		@Pc(33) int local33 = (local21 << 16) / arg3;
		@Pc(47) int local47;
		if (this.xOffset > 0) {
			local47 = ((this.xOffset << 16) + local27 - 1) / local27;
			arg0 += local47;
			local13 = local47 * local27 - (this.xOffset << 16);
		}
		if (this.yOffset > 0) {
			local47 = ((this.yOffset << 16) + local33 - 1) / local33;
			arg1 += local47;
			local15 = local47 * local33 - (this.yOffset << 16);
		}
		if (local8 < local18) {
			arg2 = ((local8 << 16) + local27 - local13 - 1) / local27;
		}
		if (local11 < local21) {
			arg3 = ((local11 << 16) + local33 - local15 - 1) / local33;
		}
		GlRenderer.setTextureId(this.textureId);
		this.method1424(2);
		@Pc(132) float local132 = (float) arg0;
		@Pc(137) float local137 = local132 + (float) arg2;
		@Pc(142) float local142 = (float) (GlRenderer.canvasHeight - arg1);
		@Pc(147) float local147 = local142 - (float) arg3;
		@Pc(155) float local155 = (float) this.width / (float) this.powerOfTwoWidth;
		@Pc(163) float local163 = (float) this.height / (float) this.powerOfTwoHeight;
		glBegin(GL_TRIANGLE_FAN);
		glTexCoord2f(local155, 0.0F);
		glVertex2f(local137, local142);
		glTexCoord2f(0.0F, 0.0F);
		glVertex2f(local132, local142);
		glTexCoord2f(0.0F, local163);
		glVertex2f(local132, local147);
		glTexCoord2f(local155, local163);
		glVertex2f(local137, local147);
		glEnd();
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(II)V")
	@Override
	public final void drawPixels(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		GlRenderer.setupRgbAlphaMode1Rendering();
		@Pc(5) int local5 = arg0 + this.xOffset;
		@Pc(10) int local10 = arg1 + this.yOffset;
		GlRenderer.setTextureId(this.textureId);
		this.method1424(1);
		glTranslatef((float) local5, (float) (GlRenderer.canvasHeight - local10), 0.0F);
		glCallList(this.anInt1871);
		glLoadIdentity();
	}

	@OriginalMember(owner = "client!cf", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.textureId != -1) {
			GlCleaner.deleteTexture2d(this.textureId, this.anInt1869, this.contextId);
			this.textureId = -1;
			this.anInt1869 = 0;
		}
		if (this.anInt1871 != -1) {
			GlCleaner.deleteList(this.anInt1871, this.contextId);
			this.anInt1871 = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIII)V")
	@Override
	protected final void method1416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		GlRenderer.setupRgbAlphaMode1Rendering();
		GlRenderer.setTextureId(this.textureId);
		this.method1424(1);
		@Pc(15) int local15 = arg0 - (this.xOffset << 4);
		@Pc(22) int local22 = arg1 - (this.yOffset << 4);
		glTranslatef((float) arg2 / 16.0F, (float) GlRenderer.canvasHeight - (float) arg3 / 16.0F, 0.0F);
		glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
		if (arg5 != 4096) {
			glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
		}
		glTranslatef((float) -local15 / 16.0F, (float) local22 / 16.0F, 0.0F);
		glCallList(this.anInt1871);
		glLoadIdentity();
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(IIIII)V")
	@Override
	public final void renderAlpha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		GlRenderer.method4155();
		@Pc(8) int local8 = this.width;
		@Pc(11) int local11 = this.height;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = this.innerWidth;
		@Pc(21) int local21 = this.innerHeight;
		@Pc(27) int local27 = (local18 << 16) / arg2;
		@Pc(33) int local33 = (local21 << 16) / arg3;
		@Pc(47) int local47;
		if (this.xOffset > 0) {
			local47 = ((this.xOffset << 16) + local27 - 1) / local27;
			arg0 += local47;
			local13 = local47 * local27 - (this.xOffset << 16);
		}
		if (this.yOffset > 0) {
			local47 = ((this.yOffset << 16) + local33 - 1) / local33;
			arg1 += local47;
			local15 = local47 * local33 - (this.yOffset << 16);
		}
		if (local8 < local18) {
			arg2 = ((local8 << 16) + local27 - local13 - 1) / local27;
		}
		if (local11 < local21) {
			arg3 = ((local11 << 16) + local33 - local15 - 1) / local33;
		}
		GlRenderer.setTextureId(this.textureId);
		this.method1424(1);
		@Pc(132) float local132 = (float) arg0;
		@Pc(137) float local137 = local132 + (float) arg2;
		@Pc(142) float local142 = (float) (GlRenderer.canvasHeight - arg1);
		@Pc(147) float local147 = local142 - (float) arg3;
		@Pc(155) float local155 = (float) this.width / (float) this.powerOfTwoWidth;
		@Pc(163) float local163 = (float) this.height / (float) this.powerOfTwoHeight;
		@Pc(168) float local168 = (float) arg4 / 256.0F;
		glBegin(GL_TRIANGLE_FAN);
		glColor4f(1.0F, 1.0F, 1.0F, local168);
		glTexCoord2f(local155, 0.0F);
		glVertex2f(local137, local142);
		glTexCoord2f(0.0F, 0.0F);
		glVertex2f(local132, local142);
		glTexCoord2f(0.0F, local163);
		glVertex2f(local132, local147);
		glTexCoord2f(local155, local163);
		glVertex2f(local137, local147);
		glEnd();
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(IIII)V")
	public final void method1429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		GlRenderer.setupRgbAlphaMode1Rendering();
		GlRenderer.setTextureId(this.textureId);
		this.method1424(1);
		@Pc(16) float local16 = (float) this.width / (float) this.powerOfTwoWidth;
		@Pc(24) float local24 = (float) this.height / (float) this.powerOfTwoHeight;
		@Pc(29) float local29 = local16 * (float) arg2;
		@Pc(34) float local34 = local24 * (float) arg3;
		@Pc(39) int local39 = arg0 + this.xOffset;
		@Pc(46) int local46 = local39 + this.width * arg2;
		@Pc(53) int local53 = GlRenderer.canvasHeight - arg1 - this.yOffset;
		@Pc(60) int local60 = local53 - this.height * arg3;
		glBegin(GL_TRIANGLE_FAN);
		glTexCoord2f(local29, 0.0F);
		glVertex2f((float) local46, (float) local53);
		glTexCoord2f(0.0F, 0.0F);
		glVertex2f((float) local39, (float) local53);
		glTexCoord2f(0.0F, local34);
		glVertex2f((float) local39, (float) local60);
		glTexCoord2f(local29, local34);
		glVertex2f((float) local46, (float) local60);
		glEnd();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "([I)V")
	protected void method1430(int[] arg0) {
		this.powerOfTwoWidth = IntUtils.bitceil(this.width);
		this.powerOfTwoHeight = IntUtils.bitceil(this.height);

		byte[] rgba = new byte[this.powerOfTwoWidth * this.powerOfTwoHeight * 4];
		int dstIndex = 0;
		int srcIndex = 0;
		int rowPadding = (this.powerOfTwoWidth - this.width) * 4;

		for (int y = 0; y < this.height; y++) {
			for (int x = 0; x < this.width; x++) {
				int pixel = arg0[srcIndex++];
				if (pixel == 0) {
					dstIndex += 4;
				} else {
					rgba[dstIndex++] = (byte) (pixel >> 16); // R
					rgba[dstIndex++] = (byte) (pixel >> 8);  // G
					rgba[dstIndex++] = (byte) (pixel);       // B
					rgba[dstIndex++] = (byte) 0xFF;          // A
				}
			}
			dstIndex += rowPadding;
		}

		ByteBuffer buffer = BufferUtils.createByteBuffer(rgba.length);
		buffer.put(rgba).flip();

		if (this.textureId == -1) {
			IntBuffer texIdBuffer = BufferUtils.createIntBuffer(1);
			glGenTextures(texIdBuffer);
			this.textureId = texIdBuffer.get(0);
			this.contextId = GlCleaner.contextId;
		}

		GlRenderer.setTextureId(this.textureId);
		glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, this.powerOfTwoWidth, this.powerOfTwoHeight, 0, GL_RGBA, GL_UNSIGNED_BYTE, buffer);

		int size = buffer.limit();
		GlCleaner.oncard_2d += size - this.anInt1869;
		this.anInt1869 = size;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
	@Override
	public final void renderAlpha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		GlRenderer.method4155();
		@Pc(5) int local5 = arg0 + this.xOffset;
		@Pc(10) int local10 = arg1 + this.yOffset;
		GlRenderer.setTextureId(this.textureId);
		this.method1424(1);
		glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
		glTranslatef((float) local5, (float) (GlRenderer.canvasHeight - local10), 0.0F);
		glCallList(this.anInt1871);
		glLoadIdentity();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "()V")
	private void method1431() {
		@Pc(7) float local7 = (float) this.width / (float) this.powerOfTwoWidth;
		@Pc(15) float local15 = (float) this.height / (float) this.powerOfTwoHeight;
		if (this.anInt1871 == -1) {
			this.anInt1871 = glGenLists(1);
			this.contextId = GlCleaner.contextId;
		}
		glNewList(this.anInt1871, GL_COMPILE);
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