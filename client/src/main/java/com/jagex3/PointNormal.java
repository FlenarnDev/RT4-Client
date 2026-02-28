package com.jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex3.client.client!hd")
public final class PointNormal {

	@OriginalMember(owner = "com.jagex3.client.client!hd", name = "b", descriptor = "I")
	public int anInt2431;

	@OriginalMember(owner = "com.jagex3.client.client!hd", name = "d", descriptor = "I")
	public int anInt2432;

	@OriginalMember(owner = "com.jagex3.client.client!hd", name = "m", descriptor = "I")
	public int anInt2436;

	@OriginalMember(owner = "com.jagex3.client.client!hd", name = "n", descriptor = "I")
	public int anInt2437;

	@OriginalMember(owner = "com.jagex3.client.client!hd", name = "<init>", descriptor = "()V")
	public PointNormal() {
	}

	@OriginalMember(owner = "com.jagex3.client.client!hd", name = "<init>", descriptor = "(Lclient!hd;)V")
	public PointNormal(@OriginalArg(0) PointNormal arg0) {
		this.anInt2432 = arg0.anInt2432;
		this.anInt2437 = arg0.anInt2437;
		this.anInt2431 = arg0.anInt2431;
		this.anInt2436 = arg0.anInt2436;
	}
}
