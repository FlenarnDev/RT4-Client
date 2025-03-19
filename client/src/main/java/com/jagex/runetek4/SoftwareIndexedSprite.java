package com.jagex.runetek4;

import com.jagex.runetek4.cache.media.SoftwareSprite;
import com.jagex.runetek4.media.Rasterizer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("runetek4.client!ek")
public final class SoftwareIndexedSprite extends IndexedSprite {

	@OriginalMember(owner = "runetek4.client!ek", name = "o", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "runetek4.client!ek", name = "n", descriptor = "[I")
	private final int[] anIntArray144;

	@OriginalMember(owner = "runetek4.client!ek", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public SoftwareIndexedSprite(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.innerWidth = arg0;
		this.innerHeight = arg1;
		this.xOffset = arg2;
		this.yOffset = arg3;
		this.width = arg4;
		this.height = arg5;
		this.aByteArray18 = arg6;
		this.anIntArray144 = arg7;
	}

	@OriginalMember(owner = "runetek4.client!ek", name = "<init>", descriptor = "(III)V")
	public SoftwareIndexedSprite(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.innerWidth = this.width = arg0;
		this.innerHeight = this.height = arg1;
		this.xOffset = this.yOffset = 0;
		this.aByteArray18 = new byte[arg0 * arg1];
		this.anIntArray144 = new int[arg2];
	}

	@OriginalMember(owner = "runetek4.client!ek", name = "b", descriptor = "(III)V")
	public final void method1389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray144.length; local1++) {
			@Pc(15) int local15 = this.anIntArray144[local1] >> 16 & 0xFF;
			local15 += arg0;
			if (local15 < 0) {
				local15 = 0;
			} else if (local15 > 255) {
				local15 = 255;
			}
			@Pc(38) int local38 = this.anIntArray144[local1] >> 8 & 0xFF;
			local38 += arg1;
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			@Pc(59) int local59 = this.anIntArray144[local1] & 0xFF;
			local59 += arg2;
			if (local59 < 0) {
				local59 = 0;
			} else if (local59 > 255) {
				local59 = 255;
			}
			this.anIntArray144[local1] = (local15 << 16) + (local38 << 8) + local59;
		}
	}

	@OriginalMember(owner = "runetek4.client!ek", name = "a", descriptor = "(IIIII)V")
	public final void method1390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = this.width;
		@Pc(5) int local5 = this.height;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.innerWidth;
		@Pc(15) int local15 = this.innerHeight;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (this.xOffset > 0) {
			local41 = ((this.xOffset << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (this.xOffset << 16);
		}
		if (this.yOffset > 0) {
			local41 = ((this.yOffset << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (this.yOffset << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * SoftwareRaster.destinationWidth;
		@Pc(125) int local125 = SoftwareRaster.destinationWidth - arg2;
		if (arg1 + arg3 > Rasterizer.viewportBottom) {
			arg3 -= arg1 + arg3 - Rasterizer.viewportBottom;
		}
		@Pc(145) int local145;
		if (arg1 < Rasterizer.viewportTop) {
			local145 = Rasterizer.viewportTop - arg1;
			arg3 -= local145;
			local41 += local145 * SoftwareRaster.destinationWidth;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Rasterizer.viewportRight) {
			local145 = arg0 + arg2 - Rasterizer.viewportRight;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Rasterizer.viewportLeft) {
			local145 = Rasterizer.viewportLeft - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static286.method1394(SoftwareRaster.destinationPixels, this.aByteArray18, this.anIntArray144, local7, local9, local41, local125, arg2, arg3, local21, local27, local2, arg4);
	}

	@OriginalMember(owner = "runetek4.client!ek", name = "a", descriptor = "()V")
	public final void method1392() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = this.aByteArray18.length - 7;
		while (local1 < local7) {
			this.aByteArray18[local1++] = 0;
			this.aByteArray18[local1++] = 0;
			this.aByteArray18[local1++] = 0;
			this.aByteArray18[local1++] = 0;
			this.aByteArray18[local1++] = 0;
			this.aByteArray18[local1++] = 0;
			this.aByteArray18[local1++] = 0;
			this.aByteArray18[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			this.aByteArray18[local1++] = 0;
		}
	}

	@OriginalMember(owner = "runetek4.client!ek", name = "b", descriptor = "()V")
	public final void method1395() {
		@Pc(6) byte[] local6 = new byte[this.width * this.height];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.width; local10++) {
			for (@Pc(19) int local19 = this.height - 1; local19 >= 0; local19--) {
				local6[local8++] = this.aByteArray18[local10 + local19 * this.width];
			}
		}
		this.aByteArray18 = local6;
		local10 = this.yOffset;
		this.yOffset = this.xOffset;
		this.xOffset = this.innerHeight - this.height - local10;
		local10 = this.height;
		this.height = this.width;
		this.width = local10;
		local10 = this.innerHeight;
		this.innerHeight = this.innerWidth;
		this.innerWidth = local10;
	}

	@OriginalMember(owner = "runetek4.client!ek", name = "a", descriptor = "(III)V")
	@Override
	public final void drawImageAlpha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.xOffset;
		arg1 += this.yOffset;
		@Pc(15) int local15 = arg0 + arg1 * SoftwareRaster.destinationWidth;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.height;
		@Pc(23) int local23 = this.width;
		@Pc(27) int local27 = SoftwareRaster.destinationWidth - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Rasterizer.viewportTop) {
			local36 = Rasterizer.viewportTop - arg1;
			local20 -= local36;
			arg1 = Rasterizer.viewportTop;
			local17 = local36 * local23;
			local15 += local36 * SoftwareRaster.destinationWidth;
		}
		if (arg1 + local20 > Rasterizer.viewportBottom) {
			local20 -= arg1 + local20 - Rasterizer.viewportBottom;
		}
		if (arg0 < Rasterizer.viewportLeft) {
			local36 = Rasterizer.viewportLeft - arg0;
			local23 -= local36;
			arg0 = Rasterizer.viewportLeft;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Rasterizer.viewportRight) {
			local36 = arg0 + local23 - Rasterizer.viewportRight;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static286.method1397(SoftwareRaster.destinationPixels, this.aByteArray18, this.anIntArray144, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "runetek4.client!ek", name = "c", descriptor = "()V")
	public final void method1396() {
		if (this.width == this.innerWidth && this.height == this.innerHeight) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.innerWidth * this.innerHeight];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.height; local21++) {
			for (@Pc(27) int local27 = 0; local27 < this.width; local27++) {
				local17[local27 + this.xOffset + (local21 + this.yOffset) * this.innerWidth] = this.aByteArray18[local19++];
			}
		}
		this.aByteArray18 = local17;
		this.width = this.innerWidth;
		this.height = this.innerHeight;
		this.xOffset = 0;
		this.yOffset = 0;
	}

	@OriginalMember(owner = "runetek4.client!ek", name = "a", descriptor = "(IIII)V")
	public final void method1398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = this.width;
		@Pc(5) int local5 = this.height;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.innerWidth;
		@Pc(15) int local15 = this.innerHeight;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (this.xOffset > 0) {
			local41 = ((this.xOffset << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (this.xOffset << 16);
		}
		if (this.yOffset > 0) {
			local41 = ((this.yOffset << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (this.yOffset << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * SoftwareRaster.destinationWidth;
		@Pc(125) int local125 = SoftwareRaster.destinationWidth - arg2;
		if (arg1 + arg3 > Rasterizer.viewportBottom) {
			arg3 -= arg1 + arg3 - Rasterizer.viewportBottom;
		}
		@Pc(145) int local145;
		if (arg1 < Rasterizer.viewportTop) {
			local145 = Rasterizer.viewportTop - arg1;
			arg3 -= local145;
			local41 += local145 * SoftwareRaster.destinationWidth;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Rasterizer.viewportRight) {
			local145 = arg0 + arg2 - Rasterizer.viewportRight;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Rasterizer.viewportLeft) {
			local145 = Rasterizer.viewportLeft - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static286.method1391(SoftwareRaster.destinationPixels, this.aByteArray18, this.anIntArray144, local7, local9, local41, local125, arg2, arg3, local21, local27, local2);
	}

	@OriginalMember(owner = "runetek4.client!ek", name = "a", descriptor = "(II)V")
	@Override
	public final void drawImage(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.xOffset;
		arg1 += this.yOffset;
		@Pc(15) int local15 = arg0 + arg1 * SoftwareRaster.destinationWidth;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.height;
		@Pc(23) int local23 = this.width;
		@Pc(27) int local27 = SoftwareRaster.destinationWidth - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Rasterizer.viewportTop) {
			local36 = Rasterizer.viewportTop - arg1;
			local20 -= local36;
			arg1 = Rasterizer.viewportTop;
			local17 = local36 * local23;
			local15 += local36 * SoftwareRaster.destinationWidth;
		}
		if (arg1 + local20 > Rasterizer.viewportBottom) {
			local20 -= arg1 + local20 - Rasterizer.viewportBottom;
		}
		if (arg0 < Rasterizer.viewportLeft) {
			local36 = Rasterizer.viewportLeft - arg0;
			local23 -= local36;
			arg0 = Rasterizer.viewportLeft;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Rasterizer.viewportRight) {
			local36 = arg0 + local23 - Rasterizer.viewportRight;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			SoftwareSprite.blockCopyTrans(SoftwareRaster.destinationPixels, this.aByteArray18, this.anIntArray144, local17, local15, local23, local20, local27, local29);
		}
	}
}
