package com.jagex3;

import deob.Static9;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex3.client.client!md")
public final class InvType extends DoubleLinkable {

	@OriginalMember(owner = "com.jagex3.client.client!md", name = "K", descriptor = "I")
	public int anInt3706 = 0;

    @OriginalMember(owner = "com.jagex3.client.client!je", name = "a", descriptor = "(ILclient!ve;)V")
    public static void init(@OriginalArg(1) Js5 arg0) {
        Static9.clientConfig = arg0;
    }

    @OriginalMember(owner = "com.jagex3.client.client!md", name = "a", descriptor = "(Lclient!wa;I)V")
	public final void method2927(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.g1();
			if (local10 == 0) {
				return;
			}
			this.method2931(arg0, local10);
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!md", name = "a", descriptor = "(Lclient!wa;IZ)V")
	private void method2931(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt3706 = arg0.g2();
		}
	}
}
