package com.jagex3.client;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex3.client.client!cc")
public abstract class MixerController extends Linkable {

	@OriginalMember(owner = "com.jagex3.client.client!cc", name = "p", descriptor = "I")
	public int anInt905;

	@OriginalMember(owner = "com.jagex3.client.client!cc", name = "a", descriptor = "(Lclient!ei;)I")
	public abstract int method779(@OriginalArg(0) Mixer arg0);

	@OriginalMember(owner = "com.jagex3.client.client!cc", name = "a", descriptor = "()V")
	public abstract void method780();
}
