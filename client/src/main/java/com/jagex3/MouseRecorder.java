package com.jagex3;

import deob.Static231;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex3.client.client!jd")
public final class MouseRecorder implements Runnable {

	@OriginalMember(owner = "com.jagex3.client.client!jd", name = "e", descriptor = "Z")
	public boolean active = true;

	@OriginalMember(owner = "com.jagex3.client.client!jd", name = "f", descriptor = "Ljava/lang/Object;")
	public final Object lock = new Object();

	@OriginalMember(owner = "com.jagex3.client.client!jd", name = "k", descriptor = "I")
	public int length = 0;

	@OriginalMember(owner = "com.jagex3.client.client!jd", name = "l", descriptor = "[I")
	public final int[] y = new int[500];

	@OriginalMember(owner = "com.jagex3.client.client!jd", name = "n", descriptor = "[I")
	public final int[] x = new int[500];

	@OriginalMember(owner = "com.jagex3.client.client!jd", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		while (this.active) {
			@Pc(12) Object local12 = this.lock;
			synchronized (this.lock) {
				if (this.length < 500) {
					this.x[this.length] = ClientMouseListener.mouseX;
					this.y[this.length] = ClientMouseListener.mouseY;
					this.length++;
				}
			}
			Static231.sleepPrecise(50L);
		}
	}
}
