package com.jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex3.client.client!q")
public abstract class ReferenceNodeFactory {

	@OriginalMember(owner = "com.jagex3.client.client!q", name = "a", descriptor = "(Lclient!gf;I)Lclient!gf;")
	public abstract ReferenceNode method1027(@OriginalArg(0) ReferenceNode arg0);
}
