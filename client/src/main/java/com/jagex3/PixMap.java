package com.jagex3;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

import deob.Static129;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex3.client.client!vk")
public abstract class PixMap {

	@OriginalMember(owner = "com.jagex3.client.client!vk", name = "e", descriptor = "[I")
	protected int[] anIntArray472;

	@OriginalMember(owner = "com.jagex3.client.client!vk", name = "g", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "com.jagex3.client.client!vk", name = "i", descriptor = "I")
	protected int anInt5339;

	@OriginalMember(owner = "com.jagex3.client.client!vk", name = "k", descriptor = "I")
	protected int anInt5341;

	@OriginalMember(owner = "com.jagex3.client.client!vk", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public abstract void method4186(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "com.jagex3.client.client!vk", name = "a", descriptor = "(I)V")
	public final void method4189() {
		Static129.method2491(this.anIntArray472, this.anInt5341, this.anInt5339);
	}

	@OriginalMember(owner = "com.jagex3.client.client!vk", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	public abstract void draw(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "com.jagex3.client.client!vk", name = "a", descriptor = "(IZILjava/awt/deob.Component;)V")
	public abstract void method4192(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2);
}
