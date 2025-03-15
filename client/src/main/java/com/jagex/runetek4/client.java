package com.jagex.runetek4;

import java.awt.*;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;

import com.jagex.runetek4.cache.CacheArchive;
import com.jagex.runetek4.cache.def.ItemDefinition;
import com.jagex.runetek4.cache.def.VarPlayerDefinition;
import com.jagex.runetek4.cache.CacheFileChannel;
import com.jagex.runetek4.cache.media.ImageRGB;
import com.jagex.runetek4.core.io.Packet;
import com.jagex.runetek4.dash3d.CollisionMap;
import com.jagex.runetek4.cache.CacheIndex;
import com.jagex.runetek4.game.config.cursortype.CursorType;
import com.jagex.runetek4.cache.media.component.Component;
import com.jagex.runetek4.dash3d.entity.NPCEntity;
import com.jagex.runetek4.js5.index.Js5MasterIndex;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends GameShell {

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "[I")
	public static final int[] locShapeToLayer = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
	@OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
	public static int currentCursor = -1;
	@OriginalMember(owner = "client!gm", name = "T", descriptor = "Lclient!k;")
	public static Js5CacheQueue js5CacheQueue;
	@OriginalMember(owner = "client!id", name = "l", descriptor = "Lclient!jb;")
	public static Js5NetQueue js5NetQueue;
	@OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
	public static int modeWhere = 0;
	@OriginalMember(owner = "client!ld", name = "k", descriptor = "Ljava/lang/String;")
	public static String worldListHostname;
	@OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
	public static int worldListAlternatePort;
	@OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
	public static int worldListDefaultPort;
	@OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
	public static int worldListId = 1;
	@OriginalMember(owner = "client!jg", name = "c", descriptor = "Lclient!en;")
	public static CacheFileChannel uid;
	@OriginalMember(owner = "client!nj", name = "f", descriptor = "Lclient!en;")
	public static CacheFileChannel cacheData;
	@OriginalMember(owner = "client!pf", name = "f", descriptor = "Lclient!en;")
	public static CacheFileChannel cacheMasterIndex;
	@OriginalMember(owner = "client!li", name = "l", descriptor = "Lclient!ge;")
	public static CacheIndex masterCacheIndex;

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 4) {
				arg0 = new String[4];
				arg0[0] = "0";
				arg0[1] = "live";
				arg0[2] = "english";
				arg0[3] = "game0";
				// Static131.method2577("argument count");
			}
			@Pc(15) int local15 = -1;
			worldListId = Integer.parseInt(arg0[0]);
			modeWhere = 2;
			if (arg0[1].equals("live")) {
				com.jagex.runetek4.cache.def.ItemDefinition.modeWhat = 0;
			} else if (arg0[1].equals("rc")) {
				com.jagex.runetek4.cache.def.ItemDefinition.modeWhat = 1;
			} else if (arg0[1].equals("wip")) {
				com.jagex.runetek4.cache.def.ItemDefinition.modeWhat = 2;
			} else {
				Game.printHelp("modewhat");
			}
			Static249.aBoolean282 = false;
			try {
				@Pc(63) byte[] local63 = arg0[2].getBytes("ISO-8859-1");
				local15 = Static101.method2053(Static10.decodeString(local63, local63.length, 0));
			} catch (@Pc(74) Exception local74) {
			}
			if (local15 != -1) {
				Static141.anInt3470 = local15;
			} else if (arg0[2].equals("english")) {
				Static141.anInt3470 = 0;
			} else if (arg0[2].equals("german")) {
				Static141.anInt3470 = 1;
			} else {
				Game.printHelp("language");
			}
			Static3.method4659(Static141.anInt3470);
			ClientScriptRunner.aBoolean254 = false;
			Static150.aBoolean175 = false;
			if (arg0[3].equals("game0")) {
				Static266.game = 0;
			} else if (arg0[3].equals("game1")) {
				Static266.game = 1;
			} else {
				Game.printHelp("game");
			}
			Static279.anInt5880 = 0;
			Static178.aBoolean203 = false;
			Static204.anInt4760 = 0;
			Static47.aClass100_991 = Static186.aClass100_827;
			@Pc(146) client local146 = new client();
			Static215.aClient1 = local146;
			local146.method936(com.jagex.runetek4.cache.def.ItemDefinition.modeWhat + 32, "runescape");
			Static39.frame.setLocation(40, 40);
		} catch (@Pc(167) Exception local167) {
			Static89.report(null, local167);
		}
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(II)V")
	public static void method1750(@OriginalArg(0) int arg0) {
		if (!Static64.aBoolean111) {
			arg0 = -1;
		}

		if (arg0 == currentCursor) {
			return;
		}

		if (arg0 != -1) {
			@Pc(24) CursorType cursorType = CacheArchive.method3660(arg0);
			@Pc(28) ImageRGB local28 = cursorType.getSprite();
			if (local28 == null) {
				arg0 = -1;
			} else {
				GameShell.signLink.method5113(local28.method301(), local28.anInt1860, Static154.canvas, new Point(cursorType.hotspotx, cursorType.hotspoty), local28.anInt1866);
				currentCursor = arg0;
			}
		}
		if (arg0 == -1 && currentCursor != -1) {
			GameShell.signLink.method5113(null, -1, Static154.canvas, new Point(), -1);
			currentCursor = -1;
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected final void mainredraw() {
		if (Static244.gamestate == 1000) {
			return;
		}
		@Pc(15) boolean local15 = Static138.method2699();
		if (local15 && Static144.aBoolean173 && Static11.aClass62_1 != null) {
			Static11.aClass62_1.method3570();
		}
		if ((Static244.gamestate == 30 || Static244.gamestate == 10) && (Static35.canvasReplaceRecommended || Static97.aLong89 != 0L && Static97.aLong89 < MonotonicTime.get())) {
			Static241.method4540(Static35.canvasReplaceRecommended, Static144.method2736(), Static114.anInt5831, Static22.anInt729);
		}
		@Pc(80) int local80;
		@Pc(84) int local84;
		if (Static69.aFrame2 == null) {
			@Pc(65) Container local65;
			if (Static69.aFrame2 != null) {
				local65 = Static69.aFrame2;
			} else if (Static39.frame == null) {
				local65 = GameShell.signLink.anApplet2;
			} else {
				local65 = Static39.frame;
			}
			local80 = local65.getSize().width;
			local84 = local65.getSize().height;
			if (local65 == Static39.frame) {
				@Pc(90) Insets local90 = Static39.frame.getInsets();
				local80 -= local90.right + local90.left;
				local84 -= local90.top + local90.bottom;
			}
			if (local80 != Static72.frameWid || local84 != Static122.frameHei) {
				Static203.method3662();
				Static97.aLong89 = MonotonicTime.get() + 500L;
			}
		}
		if (Static69.aFrame2 != null && !Static26.focus && (Static244.gamestate == 30 || Static244.gamestate == 10)) {
			Static241.method4540(false, Static214.anInt5581, -1, -1);
		}
		@Pc(158) boolean local158 = false;
		if (Static69.fullredraw) {
			local158 = true;
			Static69.fullredraw = false;
		}
		if (local158) {
			Static139.method2704();
		}
		if (GlRenderer.enabled) {
			for (local80 = 0; local80 < 100; local80++) {
				Static186.aBooleanArray100[local80] = true;
			}
		}
		if (Static244.gamestate == 0) {
			Static13.method473(null, local158, Static126.mainLoadSecondaryText, Static199.mainLoadPercentage);
		} else if (Static244.gamestate == 5) {
			Static182.method3359(false, Static280.aClass3_Sub2_Sub9_43);
		} else if (Static244.gamestate == 10) {
			Static126.method2460();
		} else if (Static244.gamestate == 25 || Static244.gamestate == 28) {
			if (ClientScriptRunner.anInt5223 == 1) {
				if (Static230.anInt5150 < Static175.anInt4220) {
					Static230.anInt5150 = Static175.anInt4220;
				}
				local80 = (Static230.anInt5150 - Static175.anInt4220) * 50 / Static230.anInt5150;
				Static114.method4636(false, Static34.method882(new JString[] { LocalizedText.LOADING, Static229.aClass100_974, Static123.method2423(local80), Static14.aClass100_80 }));
			} else if (ClientScriptRunner.anInt5223 == 2) {
				if (Static38.anInt1196 < Static271.anInt5804) {
					Static38.anInt1196 = Static271.anInt5804;
				}
				local80 = (Static38.anInt1196 - Static271.anInt5804) * 50 / Static38.anInt1196 + 50;
				Static114.method4636(false, Static34.method882(new JString[] { LocalizedText.LOADING, Static229.aClass100_974, Static123.method2423(local80), Static14.aClass100_80 }));
			} else {
				Static114.method4636(false, LocalizedText.LOADING);
			}
		} else if (Static244.gamestate == 30) {
			Static89.method1841();
		} else if (Static244.gamestate == 40) {
			Static114.method4636(false, Static34.method882(new JString[] { LocalizedText.CONLOST, Static269.aClass100_556, LocalizedText.ATTEMPT_TO_REESTABLISH}));
		}
		if (GlRenderer.enabled && Static244.gamestate != 0) {
			GlRenderer.method4153();
			for (local80 = 0; local80 < Static24.anInt766; local80++) {
				Static31.aBooleanArray29[local80] = false;
			}
		} else {
			@Pc(388) Graphics local388;
			if ((Static244.gamestate == 30 || Static244.gamestate == 10) && Static199.anInt4672 == 0 && !local158) {
				try {
					local388 = Static154.canvas.getGraphics();
					for (local84 = 0; local84 < Static24.anInt766; local84++) {
						if (Static31.aBooleanArray29[local84]) {
							Static260.aClass27_2.method4191(Static224.anIntArray443[local84], Static264.anIntArray410[local84], Static67.anIntArray320[local84], local388, Static50.anIntArray133[local84]);
							Static31.aBooleanArray29[local84] = false;
						}
					}
				} catch (@Pc(423) Exception local423) {
					Static154.canvas.repaint();
				}
			} else if (Static244.gamestate != 0) {
				try {
					local388 = Static154.canvas.getGraphics();
					Static260.aClass27_2.method4186(local388);
					for (local84 = 0; local84 < Static24.anInt766; local84++) {
						Static31.aBooleanArray29[local84] = false;
					}
				} catch (@Pc(453) Exception local453) {
					Static154.canvas.repaint();
				}
			}
		}
		if (Static107.aBoolean147) {
			Game.clearCaches();
		}
		if (Static164.aBoolean191 && Static244.gamestate == 10 && Static154.topLevelInterace != -1) {
			Static164.aBoolean191 = false;
			Static203.method3663(GameShell.signLink);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected final void mainquit() {
		if (GlRenderer.enabled) {
			GlRenderer.quit();
		}
		if (Static69.aFrame2 != null) {
			Static25.method714(Static69.aFrame2, GameShell.signLink);
			Static69.aFrame2 = null;
		}
		if (GameShell.signLink != null) {
			GameShell.signLink.method5121(this.getClass());
		}
		if (Static178.mouseCapturer != null) {
			Static178.mouseCapturer.aBoolean151 = false;
		}
		Static178.mouseCapturer = null;
		if (Static124.gameServerSocket != null) {
			Static124.gameServerSocket.closeGracefully();
			Static124.gameServerSocket = null;
		}
		Static31.method847(Static154.canvas);
		Static223.method3866(Static154.canvas);
		if (Static71.mouseWheel != null) {
			Static71.mouseWheel.method3291(Static154.canvas);
		}
		Static6.method82();
		Static251.method4277();
		Static71.mouseWheel = null;
		if (Static11.aClass62_1 != null) {
			Static11.aClass62_1.method3575();
		}
		if (Static147.aClass62_2 != null) {
			Static147.aClass62_2.method3575();
		}
		js5NetQueue.clientDrop();
		js5CacheQueue.method2466();
		try {
			if (cacheData != null) {
				cacheData.method1455();
			}
			if (Static47.cacheIndexes != null) {
				for (@Pc(95) int local95 = 0; local95 < Static47.cacheIndexes.length; local95++) {
					if (Static47.cacheIndexes[local95] != null) {
						Static47.cacheIndexes[local95].method1455();
					}
				}
			}
			if (cacheMasterIndex != null) {
				cacheMasterIndex.method1455();
			}
			if (uid != null) {
				uid.method1455();
			}
		} catch (@Pc(129) IOException local129) {
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public final void init() {
		if (!this.method925()) {
			return;
		}
		worldListId = Integer.parseInt(this.getParameter("worldid"));
		modeWhere = Integer.parseInt(this.getParameter("modewhere"));
		if (modeWhere < 0 || modeWhere > 1) {
			modeWhere = 0;
		}
		com.jagex.runetek4.cache.def.ItemDefinition.modeWhat = Integer.parseInt(this.getParameter("modewhat"));
		if (com.jagex.runetek4.cache.def.ItemDefinition.modeWhat < 0 || com.jagex.runetek4.cache.def.ItemDefinition.modeWhat > 2) {
			com.jagex.runetek4.cache.def.ItemDefinition.modeWhat = 0;
		}
		@Pc(50) String local50 = this.getParameter("advertsuppressed");
		if (local50 != null && local50.equals("1")) {
			Static249.aBoolean282 = true;
		} else {
			Static249.aBoolean282 = false;
		}
		try {
			Static141.anInt3470 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(69) Exception local69) {
			Static141.anInt3470 = 0;
		}
		Static3.method4659(Static141.anInt3470);
		@Pc(78) String local78 = this.getParameter("objecttag");
		if (local78 != null && local78.equals("1")) {
			ClientScriptRunner.aBoolean254 = true;
		} else {
			ClientScriptRunner.aBoolean254 = false;
		}
		@Pc(94) String local94 = this.getParameter("js");
		if (local94 != null && local94.equals("1")) {
			Static150.aBoolean175 = true;
		} else {
			Static150.aBoolean175 = false;
		}
		@Pc(111) String local111 = this.getParameter("game");
		if (local111 != null && local111.equals("1")) {
			Static266.game = 1;
		} else {
			Static266.game = 0;
		}
		try {
			Static204.anInt4760 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(130) Exception local130) {
			Static204.anInt4760 = 0;
		}
		Static47.aClass100_991 = Static227.aClass100_966.method3153(this);
		if (Static47.aClass100_991 == null) {
			Static47.aClass100_991 = Static186.aClass100_827;
		}
		@Pc(146) String local146 = this.getParameter("country");
		if (local146 != null) {
			try {
				Static279.anInt5880 = Integer.parseInt(local146);
			} catch (@Pc(153) Exception local153) {
				Static279.anInt5880 = 0;
			}
		}
		@Pc(159) String local159 = this.getParameter("haveie6");
		if (local159 != null && local159.equals("1")) {
			Static178.aBoolean203 = true;
		} else {
			Static178.aBoolean203 = false;
		}
		Static215.aClient1 = this;
		this.method937(com.jagex.runetek4.cache.def.ItemDefinition.modeWhat + 32);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method935() {
		Static203.method3662();
		js5CacheQueue = new Js5CacheQueue();
		js5NetQueue = new Js5NetQueue();

		if (com.jagex.runetek4.cache.def.ItemDefinition.modeWhat != 0) {
			Static51.aByteArrayArray8 = new byte[50][];
		}

		Static80.read(GameShell.signLink); // preferences

		if (modeWhere == 0) {
			worldListHostname = this.getCodeBase().getHost();
			worldListAlternatePort = 443;
			worldListDefaultPort = 43594;
		} else if (modeWhere == 1) {
			worldListHostname = this.getCodeBase().getHost();
			worldListAlternatePort = worldListId + 50000;
			worldListDefaultPort = worldListId + 40000;
		} else if (modeWhere == 2) {
			worldListHostname = "127.0.0.1";
			worldListAlternatePort = worldListId + 50000;
			worldListDefaultPort = worldListId + 40000;
		}
		if (Static266.game == 1) {
			Static172.shiftClick = true;
			Static161.anInt3922 = 0;
			Static33.aShortArrayArray2 = Static198.aShortArrayArray4;
			Static172.aShortArrayArray7 = Static32.aShortArrayArray1;
			Static200.aShortArray65 = Static2.aShortArray1;
			Static160.aShortArray41 = Static20.aShortArray5;
		} else {
			Static33.aShortArrayArray2 = Static154.aShortArrayArray6;
			Static160.aShortArray41 = Static195.aShortArray64;
			Static172.aShortArrayArray7 = Static43.aShortArrayArray5;
			Static200.aShortArray65 = Static260.aShortArray71;
		}
		Static55.alternatePort = worldListAlternatePort;
		Static271.defaultPort = worldListDefaultPort;
		Static60.hostname = worldListHostname;
		Static208.worldListPort = worldListDefaultPort;
		Static259.aShortArray88 = Static62.aShortArray19 = Static232.aShortArray74 = Static259.aShortArray87 = new short[256];
		Static209.port = Static208.worldListPort;

		if ((SignLink.anInt5928 == 3 && modeWhere != 2)) {
			Static125.worldId = worldListId;
		}

		Static156.init(); // keyboard
		Static19.start(Static154.canvas); // keyboard
		Static88.start(Static154.canvas); // mouse
		Static71.mouseWheel = Static44.create();
		if (Static71.mouseWheel != null) {
			Static71.mouseWheel.start(Static154.canvas);
		}
		aClass6.anInt986 = SignLink.anInt5928;
		try {
			if (GameShell.signLink.cacheData != null) {
				cacheData = new CacheFileChannel(GameShell.signLink.cacheData, 5200, 0);
				for (@Pc(162) int i = 0; i < 28; i++) {
					Static47.cacheIndexes[i] = new CacheFileChannel(GameShell.signLink.cacheIndexes[i], 6000, 0);
				}
				cacheMasterIndex = new CacheFileChannel(GameShell.signLink.cacheMasterIndex, 6000, 0);
				masterCacheIndex = new CacheIndex(255, cacheData, cacheMasterIndex, 500000);
				uid = new CacheFileChannel(GameShell.signLink.uid, 24, 0);
				GameShell.signLink.cacheIndexes = null;
				GameShell.signLink.cacheMasterIndex = null;
				GameShell.signLink.uid = null;
				GameShell.signLink.cacheData = null;
			}
		} catch (@Pc(220) IOException ex) {
			uid = null;
			cacheData = null;
			cacheMasterIndex = null;
			masterCacheIndex = null;
		}
		Static278.mainLoadPrimaryText = LocalizedText.GAME0_LOADING;
		if (modeWhere != 0) {
			Static43.displayFps = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method929() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void setJs5Response(@OriginalArg(1) int arg0) {
		js5NetQueue.errors++;
		Static37.js5SocketRequest = null;
		js5NetQueue.response = arg0;
		Static206.js5Socket = null;
		Static4.js5ConnectState = 0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method943() {
		for (Static182.keyQueueSize = 0; Static25.nextKey() && Static182.keyQueueSize < 128; Static182.keyQueueSize++) {
			Static227.keyCodes[Static182.keyQueueSize] = Static102.keyCode;
			Static205.keyChars[Static182.keyQueueSize] = Static193.keyChar;
		}
		Static178.sceneDelta++;
		if (Static154.topLevelInterace != -1) {
			Static57.method1320(0, 0, 0, Static48.canvasWidth, Static154.topLevelInterace, 0, Static254.canvasHeigth);
		}
		Static119.transmitTimer++;
		if (GlRenderer.enabled) {
			label191: for (@Pc(57) int local57 = 0; local57 < 32768; local57++) {
				@Pc(66) NPCEntity npcEntity = Static175.npcs[local57];
				if (npcEntity != null) {
					@Pc(73) byte walkflags = npcEntity.type.walkflags;
					if ((walkflags & 0x2) > 0 && npcEntity.pathLength == 0 && Math.random() * 1000.0D < 10.0D) {
						@Pc(98) int local98 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						@Pc(106) int local106 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						if (local98 != 0 || local106 != 0) {
							npcEntity.pathRunning[0] = 1;
							npcEntity.pathTileX[0] = local98 + (npcEntity.x >> 7);
							npcEntity.pathTileZ[0] = local106 + (npcEntity.z >> 7);
							Static148.levelCollisionMap[Static55.currentLevel].method3056(npcEntity.x >> 7, npcEntity.size(), false, 0, npcEntity.size(), npcEntity.z >> 7);
							if (npcEntity.pathTileX[0] >= 0 && npcEntity.pathTileX[0] <= 104 - npcEntity.size() && npcEntity.pathTileZ[0] >= 0 && npcEntity.pathTileZ[0] <= 104 - npcEntity.size() && Static148.levelCollisionMap[Static55.currentLevel].method3054(npcEntity.z >> 7, npcEntity.pathTileZ[0], npcEntity.pathTileX[0], npcEntity.x >> 7)) {
								if (npcEntity.size() > 1) {
									for (@Pc(226) int local226 = npcEntity.pathTileX[0]; npcEntity.pathTileX[0] + npcEntity.size() > local226; local226++) {
										for (@Pc(246) int local246 = npcEntity.pathTileZ[0]; npcEntity.pathTileZ[0] + npcEntity.size() > local246; local246++) {
											if ((Static148.levelCollisionMap[Static55.currentLevel].flags[local226][local246] & 0x12401FF) != 0) {
												continue label191;
											}
										}
									}
								}
								npcEntity.pathLength = 1;
							}
						}
					}
					Static104.method2247(npcEntity);
					Static37.method949(npcEntity);
					Static34.method879(npcEntity);
					Static148.levelCollisionMap[Static55.currentLevel].method3043(npcEntity.x >> 7, false, npcEntity.z >> 7, npcEntity.size(), npcEntity.size());
				}
			}
		}
		if (!GlRenderer.enabled) {
			Static269.method2170();
		} else if (Static184.anInt4348 == 0 && Static179.step == 0) {
			if (Static227.anInt5096 == 2) {
				Static125.method2450();
			} else {
				Static40.method1008();
			}
			if (Static138.cameraX >> 7 < 14 || Static138.cameraX >> 7 >= 90 || Static134.cameraZ >> 7 < 14 || Static134.cameraZ >> 7 >= 90) {
				Static26.method740();
			}
		}
		while (true) {
			@Pc(374) HookRequest local374;
			@Pc(379) Component local379;
			@Pc(387) Component local387;
			do {
				local374 = (HookRequest) Static4.aClass69_2.method2287();
				if (local374 == null) {
					while (true) {
						do {
							local374 = (HookRequest) Static115.aClass69_70.method2287();
							if (local374 == null) {
								while (true) {
									do {
										local374 = (HookRequest) Static185.aClass69_101.method2287();
										if (local374 == null) {
											if (Static105.aClass13_14 != null) {
												Static4.method28();
											}
											if (Static33.openUrlRequest != null && Static33.openUrlRequest.status == 1) {
												if (Static33.openUrlRequest.result != null) {
													Static169.openUrl(Static175.url, Static164.newTab);
												}
												Static164.newTab = false;
												Static175.url = null;
												Static33.openUrlRequest = null;
											}
											if (Static83.loopCycle % 1500 == 0) {
												Static123.method2418();
											}
											return;
										}
										local379 = local374.source;
										if (local379.componentId < 0) {
											break;
										}
										local387 = Component.getComponent(local379.layer);
									} while (local387 == null || local387.createdComponents == null || local387.createdComponents.length <= local379.componentId || local379 != local387.createdComponents[local379.componentId]);
									Static82.method1767(local374);
								}
							}
							local379 = local374.source;
							if (local379.componentId < 0) {
								break;
							}
							local387 = Component.getComponent(local379.layer);
						} while (local387 == null || local387.createdComponents == null || local379.componentId >= local387.createdComponents.length || local379 != local387.createdComponents[local379.componentId]);
						Static82.method1767(local374);
					}
				}
				local379 = local374.source;
				if (local379.componentId < 0) {
					break;
				}
				local387 = Component.getComponent(local379.layer);
			} while (local387 == null || local387.createdComponents == null || local387.createdComponents.length <= local379.componentId || local379 != local387.createdComponents[local379.componentId]);
			Static82.method1767(local374);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void js5NetworkLoop() {
		@Pc(3) boolean idle = js5NetQueue.loop();
		if (!idle) {
			this.js5Connect();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void js5Connect() {
		if (ClientScriptRunner.js5PrevErrors < js5NetQueue.errors) {
			Static22.js5ConnectDelay = 5 * 50 * (js5NetQueue.errors - 1);
			if (Static271.defaultPort == Static209.port) {
				Static209.port = Static55.alternatePort;
			} else {
				Static209.port = Static271.defaultPort;
			}
			if (Static22.js5ConnectDelay > 3000) {
				Static22.js5ConnectDelay = 3000;
			}
			if (js5NetQueue.errors >= 2 && js5NetQueue.response == 6) {
				this.error("js5connect_outofdate");
				Static244.gamestate = 1000;
				return;
			}
			if (js5NetQueue.errors >= 4 && js5NetQueue.response == -1) {
				this.error("js5crc");
				Static244.gamestate = 1000;
				return;
			}
			if (js5NetQueue.errors >= 4 && (Static244.gamestate == 0 || Static244.gamestate == 5)) {
				if (js5NetQueue.response == 7 || js5NetQueue.response == 9) {
					this.error("js5connect_full");
				} else if (js5NetQueue.response > 0) {
					this.error("js5connect");
				} else {
					this.error("js5io");
				}
				Static244.gamestate = 1000;
				return;
			}
		}
		ClientScriptRunner.js5PrevErrors = js5NetQueue.errors;
		if (Static22.js5ConnectDelay > 0) {
			Static22.js5ConnectDelay--;
			return;
		}
		try {
			if (Static4.js5ConnectState == 0) {
				Static37.js5SocketRequest = GameShell.signLink.openSocket(Static60.hostname, Static209.port);
				Static4.js5ConnectState++;
			}
			if (Static4.js5ConnectState == 1) {
				if (Static37.js5SocketRequest.status == 2) {
					this.setJs5Response(1000);
					return;
				}
				if (Static37.js5SocketRequest.status == 1) {
					Static4.js5ConnectState++;
				}
			}
			if (Static4.js5ConnectState == 2) {
				Static206.js5Socket = new BufferedSocket((Socket) Static37.js5SocketRequest.result, GameShell.signLink);
				@Pc(194) Packet packet = new Packet(5);
				packet.p1(15);
				packet.p4(530);
				Static206.js5Socket.write(5, packet.data);
				Static4.js5ConnectState++;
				Static217.js5ConnectTime = MonotonicTime.get();
			}
			if (Static4.js5ConnectState == 3) {
				if (Static244.gamestate == 0 || Static244.gamestate == 5 || Static206.js5Socket.available() > 0) {
					@Pc(258) int response = Static206.js5Socket.read();
					if (response != 0) {
						this.setJs5Response(response);
						return;
					}
					Static4.js5ConnectState++;
				} else if (MonotonicTime.get() - Static217.js5ConnectTime > 30000L) {
					this.setJs5Response(1001);
					return;
				}
			}
			if (Static4.js5ConnectState == 4) {
				@Pc(296) boolean loggedOut = Static244.gamestate == 5 || Static244.gamestate == 10 || Static244.gamestate == 28;
				js5NetQueue.loggedOut(!loggedOut, Static206.js5Socket);
				Static206.js5Socket = null;
				Static37.js5SocketRequest = null;
				Static4.js5ConnectState = 0;
			}
		} catch (@Pc(315) IOException ex) {
			this.setJs5Response(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method948() {
		if (!Static164.aBoolean191) {
			label252: while (true) {
				do {
					if (!Static25.nextKey()) {
						break label252;
					}
				} while (Static193.keyChar != 115 && Static193.keyChar != 83);
				Static164.aBoolean191 = true;
			}
		}
		@Pc(43) int local43;
		if (Static166.anInt4051 == 0) {
			@Pc(34) Runtime local34 = Runtime.getRuntime();
			local43 = (int) (0L / 1024L);
			@Pc(46) long local46 = MonotonicTime.get();
			if (Static175.aLong138 == 0L) {
				Static175.aLong138 = local46;
			}
			if (local43 > 16384 && local46 - Static175.aLong138 < 5000L) {
				if (local46 - Static160.aLong134 > 1000L) {
					System.gc();
					Static160.aLong134 = local46;
				}
				Static199.mainLoadPercentage = 5;
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD0;
			} else {
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD0B;
				Static166.anInt4051 = 10;
				Static199.mainLoadPercentage = 5;
			}
			return;
		}
		@Pc(98) int local98;
		if (Static166.anInt4051 == 10) {
			Static120.method2392();
			for (local98 = 0; local98 < 4; local98++) {
				Static148.levelCollisionMap[local98] = new CollisionMap(104, 104);
			}
			Static199.mainLoadPercentage = 10;
			Static166.anInt4051 = 30;
			Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD10B;
		} else if (Static166.anInt4051 == 30) {
			if (Static257.aClass9_2 == null) {
				Static257.aClass9_2 = new Js5MasterIndex(js5NetQueue, js5CacheQueue);
			}
			if (Static257.aClass9_2.method178()) {
				Static213.aClass153_88 = Static9.method183(false, true, true, 0);
				Static249.aClass153_100 = Static9.method183(false, true, true, 1);
				Static274.aClass153_90 = Static9.method183(true, true, false, 2);
				Static41.aClass153_25 = Static9.method183(false, true, true, 3);
				Static248.aClass153_75 = Static9.method183(false, true, true, 4);
				Static26.aClass153_16 = Static9.method183(true, true, true, 5);
				Static130.aClass153_47 = Static9.method183(true, false, true, 6);
				Static267.aClass153_109 = Static9.method183(false, true, true, 7);
				Static209.aClass153_86 = Static9.method183(false, true, true, 8);
				Static195.aClass153_80 = Static9.method183(false, true, true, 9);
				Static184.aClass153_78 = Static9.method183(false, true, true, 10);
				Static214.aClass153_106 = Static9.method183(false, true, true, 11);
				Static16.aClass153_9 = Static9.method183(false, true, true, 12);
				Static261.aClass153_107 = Static9.method183(false, true, true, 13);
				Static137.aClass153_49 = Static9.method183(false, false, true, 14);
				Static138.aClass153_51 = Static9.method183(false, true, true, 15);
				Static280.aClass153_110 = Static9.method183(false, true, true, 16);
				Static138.aClass153_50 = Static9.method183(false, true, true, 17);
				Static172.aClass153_71 = Static9.method183(false, true, true, 18);
				Static171.aClass153_68 = Static9.method183(false, true, true, 19);
				Static253.aClass153_104 = Static9.method183(false, true, true, 20);
				Static122.aClass153_46 = Static9.method183(false, true, true, 21);
				Static156.aClass153_59 = Static9.method183(false, true, true, 22);
				Static227.aClass153_94 = Static9.method183(true, true, true, 23);
				Static254.aClass153_105 = Static9.method183(false, true, true, 24);
				Static28.aClass153_18 = Static9.method183(false, true, true, 25);
				Static167.aClass153_63 = Static9.method183(true, true, true, 26);
				Static226.aClass153_93 = Static9.method183(false, true, true, 27);
				Static199.mainLoadPercentage = 15;
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD30B;
				Static166.anInt4051 = 40;
			} else {
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD30;
				Static199.mainLoadPercentage = 12;
			}
		} else if (Static166.anInt4051 == 40) {
			local98 = 0;
			for (local43 = 0; local43 < 28; local43++) {
				local98 += Static269.aClass14_Sub1Array3[local43].method538() * Static170.anIntArray306[local43] / 100;
			}
			if (local98 == 100) {
				Static199.mainLoadPercentage = 20;
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD40B;
				Static75.method1635(Static209.aClass153_86);
				Static167.method3172(Static209.aClass153_86);
				ItemDefinition.method1754(Static209.aClass153_86);
				Static166.anInt4051 = 45;
			} else {
				if (local98 != 0) {
					Static126.mainLoadSecondaryText = Static34.method882(new JString[] { LocalizedText.CHECKING_FOR_UPDATES, Static123.method2423(local98), Static49.aClass100_352 });
				}
				Static199.mainLoadPercentage = 20;
			}
		} else if (Static166.anInt4051 == 45) {
			Static41.method1045(Static99.aBoolean143);
			Static148.aClass3_Sub3_Sub4_1 = new MidiPcmStream();
			Static148.aClass3_Sub3_Sub4_1.method4420();
			Static11.aClass62_1 = Static107.method2262(22050, GameShell.signLink, Static154.canvas, 0);
			Static11.aClass62_1.method3566(Static148.aClass3_Sub3_Sub4_1);
			Static34.method876(Static148.aClass3_Sub3_Sub4_1, Static138.aClass153_51, Static137.aClass153_49, Static248.aClass153_75);
			Static147.aClass62_2 = Static107.method2262(2048, GameShell.signLink, Static154.canvas, 1);
			Static204.soundStream = new MixerPcmStream();
			Static147.aClass62_2.method3566(Static204.soundStream);
			Static56.aClass156_1 = new Resampler(22050, Static44.anInt1404);
			Static250.anInt5441 = Static130.aClass153_47.method4482(Static1.aClass100_1);
			Static199.mainLoadPercentage = 30;
			Static166.anInt4051 = 50;
			Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD45B;
		} else if (Static166.anInt4051 == 50) {
			local98 = Static74.method1628(Static209.aClass153_86, Static261.aClass153_107);
			local43 = Static143.method2732();
			if (local98 >= local43) {
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD50B;
				Static199.mainLoadPercentage = 35;
				Static166.anInt4051 = 60;
			} else {
				Static126.mainLoadSecondaryText = Static34.method882(new JString[] { LocalizedText.MAINLOAD50, Static123.method2423(local98 * 100 / local43), Static49.aClass100_352 });
				Static199.mainLoadPercentage = 35;
			}
		} else if (Static166.anInt4051 == 60) {
			local98 = Static150.method2797(Static209.aClass153_86);
			local43 = Static104.method2252();
			if (local43 <= local98) {
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD60B;
				Static166.anInt4051 = 65;
				Static199.mainLoadPercentage = 40;
			} else {
				Static126.mainLoadSecondaryText = Static34.method882(new JString[] { LocalizedText.MAINLOAD60, Static123.method2423(local98 * 100 / local43), Static49.aClass100_352 });
				Static199.mainLoadPercentage = 40;
			}
		} else if (Static166.anInt4051 == 65) {
			Static102.method2074(Static261.aClass153_107, Static209.aClass153_86);
			Static199.mainLoadPercentage = 45;
			Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD65B;
			Game.processGameStatus(5);
			Static166.anInt4051 = 70;
		} else if (Static166.anInt4051 == 70) {
			Static274.aClass153_90.fetchAll();
			local98 = Static274.aClass153_90.getPercentageComplete();
			Static280.aClass153_110.fetchAll();
			local98 += Static280.aClass153_110.getPercentageComplete();
			Static138.aClass153_50.fetchAll();
			local98 += Static138.aClass153_50.getPercentageComplete();
			Static172.aClass153_71.fetchAll();
			local98 += Static172.aClass153_71.getPercentageComplete();
			Static171.aClass153_68.fetchAll();
			local98 += Static171.aClass153_68.getPercentageComplete();
			Static253.aClass153_104.fetchAll();
			local98 += Static253.aClass153_104.getPercentageComplete();
			Static122.aClass153_46.fetchAll();
			local98 += Static122.aClass153_46.getPercentageComplete();
			Static156.aClass153_59.fetchAll();
			local98 += Static156.aClass153_59.getPercentageComplete();
			Static254.aClass153_105.fetchAll();
			local98 += Static254.aClass153_105.getPercentageComplete();
			Static28.aClass153_18.fetchAll();
			local98 += Static28.aClass153_18.getPercentageComplete();
			Static226.aClass153_93.fetchAll();
			local98 += Static226.aClass153_93.getPercentageComplete();
			if (local98 >= 1100) {
				Static226.method3899(Static274.aClass153_90);
				Static199.method3595(Static274.aClass153_90);
				Static91.method1878(Static274.aClass153_90);
				Static125.method2446(Static267.aClass153_109, Static274.aClass153_90);
				Static181.method3349(Static280.aClass153_110, Static267.aClass153_109);
				Static88.method1817(Static267.aClass153_109, Static172.aClass153_71);
				Static241.method4542(Static171.aClass153_68, Static265.aClass3_Sub2_Sub9_Sub1_2, Static267.aClass153_109);
				Static58.method1322(Static274.aClass153_90);
				Static141.method2724(Static249.aClass153_100, Static253.aClass153_104, Static213.aClass153_88);
				Static79.method1703(Static274.aClass153_90);
				Static266.method4187(Static267.aClass153_109, Static122.aClass153_46);
				Static180.method3327(Static156.aClass153_59);
				VarPlayerDefinition.initializeVarPlayerDefinitionCache(Static274.aClass153_90);
				Static3.method4661(Static261.aClass153_107, Static209.aClass153_86, Static41.aClass153_25, Static267.aClass153_109);
				Static119.method2384(Static274.aClass153_90);
				Static85.method1774(Static138.aClass153_50);
				Static59.method1374(Static28.aClass153_18, Static254.aClass153_105, new Js5QuickChatCommandDecoder());
				Static115.method2311(Static28.aClass153_18, Static254.aClass153_105);
				Static107.method2264(Static274.aClass153_90);
				Static246.method4237(Static274.aClass153_90, Static209.aClass153_86);
				Static180.method3324(Static274.aClass153_90, Static209.aClass153_86);
				Static199.mainLoadPercentage = 50;
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD70B;
				Static58.init();
				Static166.anInt4051 = 80;
			} else {
				Static126.mainLoadSecondaryText = Static34.method882(new JString[] { LocalizedText.MAINLOAD70, Static123.method2423(local98 / 11), Static49.aClass100_352 });
				Static199.mainLoadPercentage = 50;
			}
		} else if (Static166.anInt4051 == 80) {
			local98 = Static28.method789(Static209.aClass153_86);
			local43 = Static62.method1483();
			if (local43 > local98) {
				Static126.mainLoadSecondaryText = Static34.method882(new JString[] { LocalizedText.MAINLOAD80, Static123.method2423(local98 * 100 / local43), Static49.aClass100_352 });
				Static199.mainLoadPercentage = 60;
			} else {
				Static30.method839(Static209.aClass153_86);
				Static166.anInt4051 = 90;
				Static199.mainLoadPercentage = 60;
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD80B;
			}
		} else if (Static166.anInt4051 == 90) {
			if (Static167.aClass153_63.fetchAll()) {
				@Pc(951) Js5GlTextureProvider local951 = new Js5GlTextureProvider(Static195.aClass153_80, Static167.aClass153_63, Static209.aClass153_86, 20, !Static53.aBoolean99);
				Pix3D.method1914(local951);
				if (Static113.anInt4609 == 1) {
					Pix3D.method1911(0.9F);
				}
				if (Static113.anInt4609 == 2) {
					Pix3D.method1911(0.8F);
				}
				if (Static113.anInt4609 == 3) {
					Pix3D.method1911(0.7F);
				}
				if (Static113.anInt4609 == 4) {
					Pix3D.method1911(0.6F);
				}
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD90B;
				Static166.anInt4051 = 100;
				Static199.mainLoadPercentage = 70;
			} else {
				Static126.mainLoadSecondaryText = Static34.method882(new JString[] { LocalizedText.MAINLOAD90, Static123.method2423(Static167.aClass153_63.getPercentageComplete()), Static49.aClass100_352 });
				Static199.mainLoadPercentage = 70;
			}
		} else if (Static166.anInt4051 == 100) {
			if (PreciseSleep.method3986(Static209.aClass153_86)) {
				Static166.anInt4051 = 110;
			}
		} else if (Static166.anInt4051 == 110) {
			Static178.mouseCapturer = new MouseRecorder();
			GameShell.signLink.method5130(10, Static178.mouseCapturer);
			Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD110B;
			Static199.mainLoadPercentage = 75;
			Static166.anInt4051 = 120;
		} else if (Static166.anInt4051 == 120) {
			if (Static184.aClass153_78.method4487(Static186.aClass100_827, Static252.aClass100_1049)) {
				@Pc(1060) HuffmanCodec local1060 = new HuffmanCodec(Static184.aClass153_78.method4485(Static186.aClass100_827, Static252.aClass100_1049));
				Static1.method1(local1060);
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD120B;
				Static166.anInt4051 = 130;
				Static199.mainLoadPercentage = 80;
			} else {
				Static126.mainLoadSecondaryText = Static34.method882(new JString[] { LocalizedText.MAINLOAD120, Static206.aClass100_899 });
				Static199.mainLoadPercentage = 80;
			}
		} else if (Static166.anInt4051 == 130) {
			if (!Static41.aClass153_25.fetchAll()) {
				Static126.mainLoadSecondaryText = Static34.method882(new JString[] { LocalizedText.MAINLOAD130, Static123.method2423(Static41.aClass153_25.getPercentageComplete() * 3 / 4), Static49.aClass100_352 });
				Static199.mainLoadPercentage = 85;
			} else if (!Static16.aClass153_9.fetchAll()) {
				Static126.mainLoadSecondaryText = Static34.method882(new JString[] { LocalizedText.MAINLOAD130, Static123.method2423(Static16.aClass153_9.getPercentageComplete() / 10 + 75), Static49.aClass100_352 });
				Static199.mainLoadPercentage = 85;
			} else if (!Static261.aClass153_107.fetchAll()) {
				Static126.mainLoadSecondaryText = Static34.method882(new JString[] { LocalizedText.MAINLOAD130, Static123.method2423(Static261.aClass153_107.getPercentageComplete() / 20 + 85), Static49.aClass100_352 });
				Static199.mainLoadPercentage = 85;
			} else if (Static227.aClass153_94.method4489(Static165.DETAILS)) {
				Static234.method4018(Static173.aClass3_Sub2_Sub1_Sub1Array9, Static227.aClass153_94);
				Static199.mainLoadPercentage = 95;
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD130B;
				Static166.anInt4051 = 135;
			} else {
				Static126.mainLoadSecondaryText = Static34.method882(new JString[] { LocalizedText.MAINLOAD130, Static123.method2423(Static227.aClass153_94.method4478(Static165.DETAILS) / 10 + 90), Static49.aClass100_352 });
				Static199.mainLoadPercentage = 85;
			}
		} else if (Static166.anInt4051 == 135) {
			local98 = Static207.method3684();
			if (local98 == -1) {
				Static199.mainLoadPercentage = 95;
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD135;
			} else if (local98 == 7 || local98 == 9) {
				this.error("worldlistfull");
				Game.processGameStatus(1000);
			} else if (Static61.aBoolean109) {
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD135B;
				Static166.anInt4051 = 140;
				Static199.mainLoadPercentage = 96;
			} else {
				this.error("worldlistio_" + local98);
				Game.processGameStatus(1000);
			}
		} else if (Static166.anInt4051 == 140) {
			Static156.anInt3783 = Static41.aClass153_25.method4482(Static138.LOGINSCREEN);
			Static26.aClass153_16.method4477(false);
			Static130.aClass153_47.method4477(true);
			Static209.aClass153_86.method4477(true);
			Static261.aClass153_107.method4477(true);
			Static184.aClass153_78.method4477(true);
			Static41.aClass153_25.method4477(true);
			Static199.mainLoadPercentage = 97;
			Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD140;
			Static166.anInt4051 = 150;
			Static107.aBoolean147 = true;
		} else if (Static166.anInt4051 == 150) {
			Static151.method2807();
			if (Static164.aBoolean191) {
				Static102.anInt2679 = 0;
				Static186.antialiasingMode = 0;
				Static214.anInt5581 = 0;
				Static141.anInt3474 = 0;
			}
			Static164.aBoolean191 = true;
			Static203.method3663(GameShell.signLink);
			Static241.method4540(false, Static214.anInt5581, -1, -1);
			Static199.mainLoadPercentage = 100;
			Static166.anInt4051 = 160;
			Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD150B;
		} else if (Static166.anInt4051 == 160) {
			Static73.method1596(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected final void mainloop() {
		if (Static244.gamestate == 1000) {
			return;
		}
		Static83.loopCycle++;
		if (Static83.loopCycle % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static60.anInt1895 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static39.aRandom1.setSeed((long) Static60.anInt1895);
		}
		this.js5NetworkLoop();
		if (Static257.aClass9_2 != null) {
			Static257.aClass9_2.method179();
		}
		Static230.method3948();
		Static107.method2261();
		Static65.method1501();
		Static111.method2292();
		if (GlRenderer.enabled) {
			Static63.method1490();
		}
		if (Static71.mouseWheel != null) {
			@Pc(75) int local75 = Static71.mouseWheel.method3287();
			Static58.wheelRotation = local75;
		}
		if (Static244.gamestate == 0) {
			this.method948();
			Static234.method4020();
		} else if (Static244.gamestate == 5) {
			this.method948();
			Static234.method4020();
		} else if (Static244.gamestate == 25 || Static244.gamestate == 28) {
			Static78.method1696();
		}
		if (Static244.gamestate == 10) {
			this.method943();
			Game.handleLoginScreenActions();
			Static31.method848();
			Static216.method1639();
		} else if (Static244.gamestate == 30) {
			Game.updateGame();
		} else if (Static244.gamestate == 40) {
			Static216.method1639();
			if (Static266.anInt5336 != -3) {
				if (Static266.anInt5336 == 15) {
					Static44.method1146();
				} else if (Static266.anInt5336 != 2) {
					Game.processLogout();
				}
			}
		}
	}
}
