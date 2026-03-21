package com.jagex3;

import java.io.InputStream;

import deob.Static231;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex3.client.client!qk")
public final class BrokenInputStream extends InputStream {

	@OriginalMember(owner = "com.jagex3.client.client!qk", name = "read", descriptor = "()I")
	@Override
	public final int read() {
		Static231.sleepPrecise(30000L);
		return -1;
	}
}
