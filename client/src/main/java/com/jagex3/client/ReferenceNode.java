package com.jagex3.client;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex3.client.client!gf")
public abstract class ReferenceNode extends DoubleLinkable {

	@OriginalMember(owner = "com.jagex3.client.client!gf", name = "<init>", descriptor = "()V")
	protected ReferenceNode() {
	}

	@OriginalMember(owner = "com.jagex3.client.client!gf", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object method3618();

	@OriginalMember(owner = "com.jagex3.client.client!gf", name = "e", descriptor = "(I)Z")
	public abstract boolean method3619();
}
