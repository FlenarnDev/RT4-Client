package com.jagex.runetek4;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	public static void method447() {
		if (WorldMap.zoom < WorldMap.targetZoom) {
			WorldMap.zoom = (float) ((double) WorldMap.zoom + (double) WorldMap.zoom / 30.0D);
			if (WorldMap.targetZoom < WorldMap.zoom) {
				WorldMap.zoom = WorldMap.targetZoom;
			}
			WorldMap.method965();
		} else if (WorldMap.targetZoom < WorldMap.zoom) {
			WorldMap.zoom = (float) ((double) WorldMap.zoom - (double) WorldMap.zoom / 30.0D);
			if (WorldMap.targetZoom > WorldMap.zoom) {
				WorldMap.zoom = WorldMap.targetZoom;
			}
			WorldMap.method965();
		}
		if (WorldMap.anInt3482 == -1 || WorldMap.anInt4901 == -1) {
			return;
		}
		@Pc(60) int local60 = WorldMap.anInt3482 - WorldMap.anInt435;
		if (local60 < 2 || local60 > 2) {
			local60 >>= 0x4;
		}
		@Pc(78) int local78 = WorldMap.anInt4901 - WorldMap.anInt919;
		if (local78 < 2 || local78 > 2) {
			local78 >>= 0x4;
		}
		WorldMap.anInt919 -= -local78;
		WorldMap.anInt435 += local60;
		if (local60 == 0 && local78 == 0) {
			WorldMap.anInt3482 = -1;
			WorldMap.anInt4901 = -1;
		}
		WorldMap.method965();
	}
}