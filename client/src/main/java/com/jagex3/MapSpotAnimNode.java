package com.jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex3.client.client!bk")
public final class MapSpotAnimNode extends DoubleLinkable {

	@OriginalMember(owner = "com.jagex3.client.client!bk", name = "M", descriptor = "Lclient!bh;")
	public final MapSpotAnim aClass8_Sub2_1;

	@OriginalMember(owner = "com.jagex3.client.client!bk", name = "<init>", descriptor = "(Lclient!bh;)V")
	public MapSpotAnimNode(@OriginalArg(0) MapSpotAnim arg0) {
		this.aClass8_Sub2_1 = arg0;
	}
}
