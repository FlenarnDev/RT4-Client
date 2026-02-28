package com.jagex3.client;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex3.client.client!ka")
public final class IntNode extends Linkable {

	@OriginalMember(owner = "com.jagex3.client.client!ka", name = "p", descriptor = "I")
	public int anInt3141;

	@OriginalMember(owner = "com.jagex3.client.client!ka", name = "<init>", descriptor = "()V")
	public IntNode() {
	}

	@OriginalMember(owner = "com.jagex3.client.client!ka", name = "<init>", descriptor = "(I)V")
	public IntNode(@OriginalArg(0) int arg0) {
		this.anInt3141 = arg0;
	}
}
