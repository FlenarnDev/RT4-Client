package com.jagex.runetek4;

import com.jagex.runetek4.core.io.Packet;
import com.jagex.runetek4.cache.media.AnimationSequence;
import com.jagex.runetek4.js5.CacheArchive;
import com.jagex.runetek4.scene.tile.SceneTile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "runetek4.client!lg", name = "d", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "runetek4.client!lg", name = "g", descriptor = "Lclient!ve;")
	public static CacheArchive aClass153_54;

	@OriginalMember(owner = "runetek4.client!lg", name = "b", descriptor = "Z")
	public static boolean aBoolean174 = false;

	@OriginalMember(owner = "runetek4.client!lg", name = "c", descriptor = "[Lclient!tk;")
	public static final AnimationSequence[] aClass144Array1 = new AnimationSequence[14];

	@OriginalMember(owner = "runetek4.client!lg", name = "k", descriptor = "I")
	public static int firstvisibleLevel = 99;

	@OriginalMember(owner = "runetek4.client!lg", name = "a", descriptor = "(ZLclient!wa;Lclient!na;)I")
	public static int method2748(@OriginalArg(1) Packet arg0, @OriginalArg(2) JString arg1) {
		@Pc(6) int local6 = arg0.position;
		@Pc(14) byte[] local14 = arg1.method3148();
		arg0.pSmart1or2(local14.length);
		arg0.position += Static62.aClass44_1.method1550(local14.length, arg0.data, local14, 0, arg0.position);
		return arg0.position - local6;
	}

	@OriginalMember(owner = "runetek4.client!lg", name = "a", descriptor = "(Lclient!ve;BII)[Lclient!ok;")
	public static IndexedSprite[] method2749(@OriginalArg(0) CacheArchive arg0, @OriginalArg(3) int arg1) {
		return Static234.method4016(arg0, 0, arg1) ? Static253.method4331() : null;
	}

	@OriginalMember(owner = "runetek4.client!lg", name = "a", descriptor = "(I)V")
	public static void method2750(@OriginalArg(0) int arg0) {
		Static235.anInt5276 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static152.anInt3594; local3++) {
			for (@Pc(8) int local8 = 0; local8 < Static99.anInt2550; local8++) {
				if (Static130.levelTiles[arg0][local3][local8] == null) {
					Static130.levelTiles[arg0][local3][local8] = new SceneTile(arg0, local3, local8);
				}
			}
		}
	}
}
