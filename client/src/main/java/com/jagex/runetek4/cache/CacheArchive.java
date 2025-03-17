package com.jagex.runetek4.cache;

import com.jagex.runetek4.*;
import com.jagex.runetek4.core.io.Packet;
import com.jagex.runetek4.dash3d.entity.LocEntity;
import com.jagex.runetek4.dash3d.entity.LocType;
import com.jagex.runetek4.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.zip.CRC32;

public final class CacheArchive {

	@OriginalMember(owner = "runetek4.client!fn", name = "X", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 crc32 = new CRC32();
	@OriginalMember(owner = "client!al", name = "e", descriptor = "I")
	public static int anInt172;

	@OriginalMember(owner = "client!al", name = "q", descriptor = "Lclient!ve;")
	public static Js5 aClass153_2;

	@OriginalMember(owner = "runetek4.client!qg", name = "ab", descriptor = "Lclient!ve;")
	public static Js5 gameInterfaceJs5;
	@OriginalMember(owner = "runetek4.client!nd", name = "v", descriptor = "Lclient!ve;")
	public static Js5 aClass153_64;
	@OriginalMember(owner = "runetek4.client!nd", name = "n", descriptor = "Lclient!ve;")
	public static Js5 aClass153_61;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!pb;BIIIIIII)V")
	public static void method181(@OriginalArg(0) LocType arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(5) int local5 = arg2 & 0x3;
		@Pc(28) int local28;
		@Pc(31) int local31;
		if (local5 == 1 || local5 == 3) {
			local28 = arg0.length;
			local31 = arg0.width;
		} else {
			local31 = arg0.length;
			local28 = arg0.width;
		}
		@Pc(53) int local53;
		@Pc(51) int local51;
		if (arg6 + local31 > 104) {
			local51 = arg6 + 1;
			local53 = arg6;
		} else {
			local53 = arg6 + (local31 >> 1);
			local51 = arg6 + (local31 + 1 >> 1);
		}
		@Pc(80) int local80 = (arg5 << 7) + (local28 << 6);
		@Pc(88) int local88 = (arg6 << 7) + (local31 << 6);
		@Pc(96) int local96;
		@Pc(100) int local100;
		if (arg5 + local28 > 104) {
			local96 = arg5;
			local100 = arg5 + 1;
		} else {
			local96 = arg5 + (local28 >> 1);
			local100 = (local28 + 1 >> 1) + arg5;
		}
		@Pc(120) int[][] local120 = SceneGraph.tileHeights[arg7];
		@Pc(122) int local122 = 0;
		@Pc(148) int local148 = local120[local96][local51] + local120[local96][local53] + local120[local100][local53] + local120[local100][local51] >> 2;
		@Pc(158) int[][] local158;
		if (arg7 != 0) {
			local158 = SceneGraph.tileHeights[0];
			local122 = local148 - (local158[local96][local51] + local158[local100][local53] + local158[local96][local53] + local158[local100][local51] >> 2);
		}
		local158 = null;
		if (arg7 < 3) {
			local158 = SceneGraph.tileHeights[arg7 + 1];
		}
		@Pc(215) LocEntity local215 = arg0.method3428(arg2, local80, local120, arg4, local148, local158, false, null, true, local88);
		Static242.method4207(local215.sprite, local80 - arg3, local122, local88 - arg1);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V")
	public static void method182() {
		Static241.aClass13Array13 = null;
		Static6.method86(InterfaceList.topLevelInterace, 0, GameShell.canvasWidth, 0, -1, GameShell.canvasHeigth, 0, 0);
		if (Static241.aClass13Array13 != null) {
			Static87.drawGame(0, Static127.anInt3126, Static80.anInt4696, Static241.aClass13Array13, GameShell.canvasWidth, -1412584499, 0, GameShell.canvasHeigth, Static4.aClass13_1.rectangle);
			Static241.aClass13Array13 = null;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILclient!wa;)Lclient!ci;")
	public static TextureOp29SubOp1 method184(@OriginalArg(1) Packet arg0) {
		return new TextureOp29SubOp1(arg0.g2s(), arg0.g2s(), arg0.g2s(), arg0.g2s(), arg0.g3(), arg0.g1());
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V")
	public static void method185() {
		if (Static119.anIntArray282 != null && Static130.anIntArray299 != null) {
			return;
		}
		Static119.anIntArray282 = new int[256];
		Static130.anIntArray299 = new int[256];
		for (@Pc(26) int local26 = 0; local26 < 256; local26++) {
			@Pc(36) double local36 = (double) local26 / 255.0D * 6.283185307179586D;
			Static119.anIntArray282[local26] = (int) (Math.sin(local36) * 4096.0D);
			Static130.anIntArray299[local26] = (int) (Math.cos(local36) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZI)V")
	public static void method186(@OriginalArg(0) boolean arg0) {
		if (arg0 != Static240.aBoolean276) {
			Static240.aBoolean276 = arg0;
			Static176.clear();
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III)Z")
	public static boolean method187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static140.anIntArrayArrayArray12[arg0][arg1][arg2];
		if (local7 == -Static13.anInt437) {
			return false;
		} else if (local7 == Static13.anInt437) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static256.method4394(local22 + 1, SceneGraph.tileHeights[arg0][arg1][arg2], local26 + 1) && Static256.method4394(local22 + 128 - 1, SceneGraph.tileHeights[arg0][arg1 + 1][arg2], local26 + 1) && Static256.method4394(local22 + 128 - 1, SceneGraph.tileHeights[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static256.method4394(local22 + 1, SceneGraph.tileHeights[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static140.anIntArrayArrayArray12[arg0][arg1][arg2] = Static13.anInt437;
				return true;
			} else {
				Static140.anIntArrayArrayArray12[arg0][arg1][arg2] = -Static13.anInt437;
				return false;
			}
		}
	}
}