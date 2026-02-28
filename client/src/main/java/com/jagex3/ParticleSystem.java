package com.jagex3;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex3.client.client!ga")
public final class ParticleSystem extends ParticleNode {

	static {
		new SecondaryHashTable(8);
		new Packet(131056);
	}

	@OriginalMember(owner = "com.jagex3.client.client!ga", name = "d", descriptor = "()V")
	public final void method1646() {
	}
}
