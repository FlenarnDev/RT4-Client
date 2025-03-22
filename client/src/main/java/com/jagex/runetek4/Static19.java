package com.jagex.runetek4;

import com.jagex.runetek4.dash3d.entity.Npc;
import com.jagex.runetek4.media.Rasterizer;
import com.jagex.runetek4.media.renderable.actor.Player;
import com.jagex.runetek4.util.ColorUtils;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
	public static int anInt636;

	@OriginalMember(owner = "client!bi", name = "fb", descriptor = "I")
	public static int anInt647;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "(B)V")
	public static void tickChatTimers() {
		@Pc(11) int i;
		for (i = -1; i < PlayerList.playerCount; i++) {
			@Pc(22) int pid;
			if (i == -1) {
				pid = 2047;
			} else {
				pid = PlayerList.playerIds[i];
			}
			@Pc(30) Player player = PlayerList.players[pid];
			if (player != null && player.chatLoops > 0) {
				player.chatLoops--;
				if (player.chatLoops == 0) {
					player.chatMessage = null;
				}
			}
		}
		for (i = 0; i < NpcList.npcCount; i++) {
			@Pc(68) int nid = NpcList.npcIds[i];
			@Pc(72) Npc npc = NpcList.npcs[nid];
			if (npc != null && npc.chatLoops > 0) {
				npc.chatLoops--;
				if (npc.chatLoops == 0) {
					npc.chatMessage = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIBI)I")
	public static int method588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19 = Rasterizer.palette[ColorUtils.multiplyLightness2(arg1, arg2)];
		if (arg0 > 0) {
			@Pc(31) int local31 = Rasterizer.textureProvider.method3238(arg0 & 0xFFFF);
			@Pc(49) int local49;
			@Pc(73) int local73;
			if (local31 != 0) {
				if (arg2 < 0) {
					local49 = 0;
				} else if (arg2 > 127) {
					local49 = 16777215;
				} else {
					local49 = arg2 * 131586;
				}
				if (local31 == 256) {
					local19 = local49;
				} else {
					local73 = 256 - local31;
					local19 = ((local49 & 0xFF00) * local31 + local73 * (local19 & 0xFF00) & 0xFF0000) + (local31 * (local49 & 0xFF00FF) + ((local19 & 0xFF00FF) * local73) & 0xFF00FF00) >> 8;
				}
			}
			local49 = Rasterizer.textureProvider.method3229(arg0 & 0xFFFF);
			if (local49 != 0) {
				local49 += 256;
				@Pc(125) int local125 = (local19 >> 16 & 0xFF) * local49;
				if (local125 > 65535) {
					local125 = 65535;
				}
				local73 = (local19 >> 8 & 0xFF) * local49;
				if (local73 > 65535) {
					local73 = 65535;
				}
				@Pc(150) int local150 = local49 * (local19 & 0xFF);
				if (local150 > 65535) {
					local150 = 65535;
				}
				local19 = (local150 >> 8) + (local73 & 0xFF00) + (local125 << 8 & 0xFF001F);
			}
		}
		return local19;
	}

}
