package com.jagex.runetek4;

import com.jagex.runetek4.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Environment {

	@OriginalMember(owner = "client!li", name = "c", descriptor = "I")
	public final int anInt3526;

	@OriginalMember(owner = "client!li", name = "q", descriptor = "F")
	public final float aFloat17;

	@OriginalMember(owner = "client!li", name = "d", descriptor = "I")
	public final int anInt3527;

	@OriginalMember(owner = "client!li", name = "n", descriptor = "F")
	public final float aFloat16;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "I")
	public final int anInt3525;

	@OriginalMember(owner = "client!li", name = "g", descriptor = "I")
	public final int anInt3528;

	@OriginalMember(owner = "client!li", name = "s", descriptor = "F")
	public final float aFloat18;

	@OriginalMember(owner = "client!li", name = "j", descriptor = "I")
	public final int anInt3529;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "I")
	public final int anInt3530;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
	public Environment() {
		this.anInt3526 = 16777215;
		this.aFloat17 = 1.2F;
		this.anInt3527 = -50;
		this.aFloat16 = 1.1523438F;
		this.anInt3525 = FogManager.defaulFogColorRgb;
		this.anInt3528 = -60;
		this.aFloat18 = 0.69921875F;
		this.anInt3529 = 0;
		this.anInt3530 = -50;
	}

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!wa;)V")
	public Environment(@OriginalArg(0) Packet packet) {
		@Pc(7) int local7 = packet.g1();
		if ((local7 & 0x1) == 0) {
			this.anInt3526 = 16777215;
		} else {
			this.anInt3526 = packet.g4();
		}
		if ((local7 & 0x2) == 0) {
			this.aFloat16 = 1.1523438F;
		} else {
			this.aFloat16 = (float) packet.g2() / 256.0F;
		}
		if ((local7 & 0x4) == 0) {
			this.aFloat18 = 0.69921875F;
		} else {
			this.aFloat18 = (float) packet.g2() / 256.0F;
		}
		if ((local7 & 0x8) == 0) {
			this.aFloat17 = 1.2F;
		} else {
			this.aFloat17 = (float) packet.g2() / 256.0F;
		}
		if ((local7 & 0x10) == 0) {
			this.anInt3527 = -50;
			this.anInt3530 = -50;
			this.anInt3528 = -60;
		} else {
			this.anInt3530 = packet.g2s();
			this.anInt3528 = packet.g2s();
			this.anInt3527 = packet.g2s();
		}
		if ((local7 & 0x20) == 0) {
			this.anInt3525 = FogManager.defaulFogColorRgb;
		} else {
			this.anInt3525 = packet.g4();
		}
		if ((local7 & 0x40) == 0) {
			this.anInt3529 = 0;
		} else {
			this.anInt3529 = packet.g2();
		}
	}
}
