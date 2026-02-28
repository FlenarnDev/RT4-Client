package com.jagex3.client;

import com.jagex.signlink.SignLink;
import deob.Static140;
import deob.Static231;
import deob.Static89;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex3.client.client!cj")
public final class AudioThread implements Runnable {

	@OriginalMember(owner = "com.jagex3.client.client!cj", name = "m", descriptor = "Lsignlink!ll;")
	public SignLink aClass213_1;

	@OriginalMember(owner = "com.jagex3.client.client!cj", name = "p", descriptor = "[Lclient!vh;")
	public final PcmPlayer[] aClass62Array1 = new PcmPlayer[2];

	@OriginalMember(owner = "com.jagex3.client.client!cj", name = "g", descriptor = "Z")
	public volatile boolean aBoolean62 = false;

	@OriginalMember(owner = "com.jagex3.client.client!cj", name = "t", descriptor = "Z")
	public volatile boolean aBoolean64 = false;

	@OriginalMember(owner = "com.jagex3.client.client!cj", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		this.aBoolean64 = true;
		try {
			while (!this.aBoolean62) {
				for (@Pc(9) int local9 = 0; local9 < 2; local9++) {
					@Pc(19) PcmPlayer local19 = this.aClass62Array1[local9];
					if (local19 != null) {
						local19.method3565();
					}
				}
				Static231.sleepPrecise(10L);
				Static140.method2708(this.aClass213_1, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static89.report(null, local43);
		} finally {
			this.aBoolean64 = false;
		}
	}
}
