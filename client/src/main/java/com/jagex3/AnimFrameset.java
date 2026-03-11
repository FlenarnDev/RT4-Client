package com.jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex3.client.client!cl")
public final class AnimFrameset extends DoubleLinkable {

	@OriginalMember(owner = "com.jagex3.client.client!cl", name = "W", descriptor = "[Lclient!ne;")
	public final AnimFrame[] aClass104Array1;

	@OriginalMember(owner = "com.jagex3.client.client!cl", name = "<init>", descriptor = "(Lclient!ve;Lclient!ve;IZ)V")
	public AnimFrameset(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) LinkList local5 = new LinkList();
		@Pc(10) int local10 = arg0.getFileIdLimit(arg2);
		this.aClass104Array1 = new AnimFrame[local10];
		@Pc(19) int[] local19 = arg0.method4503(arg2);
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(37) byte[] local37 = arg0.method4495(arg2, local19[local21]);
			@Pc(51) int local51 = local37[1] & 0xFF | (local37[0] & 0xFF) << 8;
			@Pc(56) AnimBase local56 = (AnimBase) local5.head();
			@Pc(58) AnimBase local58 = null;
			while (local56 != null) {
				if (local56.anInt3113 == local51) {
					local58 = local56;
					break;
				}
				local56 = (AnimBase) local5.next();
			}
			if (local58 == null) {
				@Pc(85) byte[] local85 = arg1.method4502(0, local51);
				local58 = new AnimBase(local51, local85);
				local5.push(local58);
			}
			this.aClass104Array1[local19[local21]] = new AnimFrame(local37, local58);
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!cl", name = "c", descriptor = "(II)Z")
	public final boolean method901(@OriginalArg(1) int arg0) {
		return this.aClass104Array1[arg0].aBoolean197;
	}

	@OriginalMember(owner = "com.jagex3.client.client!cl", name = "a", descriptor = "(IB)Z")
	public final boolean method903(@OriginalArg(0) int arg0) {
		return this.aClass104Array1[arg0].aBoolean196;
	}
}
