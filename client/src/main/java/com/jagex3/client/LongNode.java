package com.jagex3.client;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex3.client.client!eb")
public final class LongNode extends Linkable {

	@OriginalMember(owner = "com.jagex3.client.client!eb", name = "v", descriptor = "J")
	public long aLong55;

	@OriginalMember(owner = "com.jagex3.client.client!eb", name = "<init>", descriptor = "(J)V")
	public LongNode(@OriginalArg(0) long arg0) {
		this.aLong55 = arg0;
	}
}
