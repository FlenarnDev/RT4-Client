package com.jagex.runetek4;

import com.jagex.runetek4.cache.CacheArchive;
import com.jagex.runetek4.cache.media.component.Component;
import com.jagex.runetek4.game.config.iftype.componentproperties.ServerActiveProperties;
import com.jagex.runetek4.cache.def.ItemDefinition;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "runetek4.client!va", name = "G", descriptor = "[Z")
	public static boolean[] aBooleanArray130;

	@OriginalMember(owner = "runetek4.client!va", name = "b", descriptor = "(II)V")
	public static void method4415() {
		Static179.aClass99_25.clear(5);
		Static169.modelCacheStatic.clear(5);
		Static93.aClass99_14.clear(5);
		Static262.aClass99_36.clear(5);
	}

	@OriginalMember(owner = "runetek4.client!va", name = "a", descriptor = "(IZILclient!be;)V")
	public static void method4418(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		if (arg2.anInt530 == 1) {
			Static98.addActionRow(-1, 0L, JString.EMPTY, 0, (short) 8, arg2.aClass100_89, arg2.anInt507);
		}
		@Pc(47) JString local47;
		if (arg2.anInt530 == 2 && !MiniMenu.aBoolean302) {
			local47 = Static97.method1963(arg2);
			if (local47 != null) {
				Static98.addActionRow(-1, 0L, JString.concatenate(new JString[] { Static42.GREEN, arg2.aClass100_85 }), -1, (short) 32, local47, arg2.anInt507);
			}
		}
		if (arg2.anInt530 == 3) {
			Static98.addActionRow(-1, 0L, JString.EMPTY, 0, (short) 28, LocalizedText.CLOSE, arg2.anInt507);
		}
		if (arg2.anInt530 == 4) {
			Static98.addActionRow(-1, 0L, JString.EMPTY, 0, (short) 59, arg2.aClass100_89, arg2.anInt507);
		}
		if (arg2.anInt530 == 5) {
			Static98.addActionRow(-1, 0L, JString.EMPTY, 0, (short) 51, arg2.aClass100_89, arg2.anInt507);
		}
		if (arg2.anInt530 == 6 && ClientScriptRunner.aClass13_10 == null) {
			Static98.addActionRow(-1, 0L, JString.EMPTY, -1, (short) 41, arg2.aClass100_89, arg2.anInt507);
		}
		@Pc(173) int local173;
		@Pc(171) int local171;
		if (arg2.INVENTORY == 2) {
			local171 = 0;
			for (local173 = 0; local173 < arg2.anInt488; local173++) {
				for (@Pc(183) int local183 = 0; local183 < arg2.baseWidth; local183++) {
					@Pc(195) int local195 = (arg2.anInt512 + 32) * local183;
					@Pc(202) int local202 = (arg2.anInt516 + 32) * local173;
					if (local171 < 20) {
						local202 += arg2.anIntArray47[local171];
						local195 += arg2.anIntArray41[local171];
					}
					if (arg1 >= local195 && local202 <= arg0 && local195 + 32 > arg1 && local202 + 32 > arg0) {
						Static169.aClass13_18 = arg2;
						Static18.mouseInvInterfaceIndex = local171;
						if (arg2.invSlotObjId[local171] > 0) {
							@Pc(267) ServerActiveProperties local267 = Static36.method940(arg2);
							@Pc(276) ItemDefinition local276 = Static71.get(arg2.invSlotObjId[local171] - 1);
							if (MiniMenu.anInt5014 == 1 && local267.method510()) {
								if (FluTypeList.anInt5062 != arg2.anInt507 || Static185.anInt4370 != local171) {
									Static98.addActionRow(-1, (long) local276.anInt2354, JString.concatenate(new JString[] { Static34.aClass100_203, Static223.aClass100_947, local276.name}), local171, (short) 40, LocalizedText.USE, arg2.anInt507);
								}
							} else if (MiniMenu.aBoolean302 && local267.method510()) {
								@Pc(596) Class3_Sub2_Sub12 local596 = Static121.anInt3039 == -1 ? null : Static110.method2277(Static121.anInt3039);
								if ((Static274.anInt4999 & 0x10) != 0 && (local596 == null || local276.getParam(local596.anInt2667, Static121.anInt3039) != local596.anInt2667)) {
									Static98.addActionRow(Static246.anInt5393, (long) local276.anInt2354, JString.concatenate(new JString[] { Static78.aClass100_466, Static223.aClass100_947, local276.name}), local171, (short) 3, Static102.aClass100_545, arg2.anInt507);
								}
							} else {
								@Pc(296) JString[] local296 = local276.interfaceOptions;
								if (Static208.aBoolean237) {
									local296 = Static279.method4664(local296);
								}
								@Pc(309) int local309;
								@Pc(334) byte local334;
								if (local267.method510()) {
									for (local309 = 4; local309 >= 3; local309--) {
										if (local296 != null && local296[local309] != null) {
											if (local309 == 3) {
												local334 = 35;
											} else {
												local334 = 58;
											}
											Static98.addActionRow(-1, (long) local276.anInt2354, JString.concatenate(new JString[] { Static8.aClass100_32, local276.name}), local171, local334, local296[local309], arg2.anInt507);
										}
									}
								}
								if (local267.method507()) {
									Static98.addActionRow(Static169.anInt4075, (long) local276.anInt2354, JString.concatenate(new JString[] { Static8.aClass100_32, local276.name}), local171, (short) 22, LocalizedText.USE, arg2.anInt507);
								}
								if (local267.method510() && local296 != null) {
									for (local309 = 2; local309 >= 0; local309--) {
										if (local296[local309] != null) {
											local334 = 0;
											if (local309 == 0) {
												local334 = 47;
											}
											if (local309 == 1) {
												local334 = 5;
											}
											if (local309 == 2) {
												local334 = 43;
											}
											Static98.addActionRow(-1, (long) local276.anInt2354, JString.concatenate(new JString[] { Static8.aClass100_32, local276.name}), local171, local334, local296[local309], arg2.anInt507);
										}
									}
								}
								local296 = arg2.aClass100Array19;
								if (Static208.aBoolean237) {
									local296 = Static279.method4664(local296);
								}
								if (local296 != null) {
									for (local309 = 4; local309 >= 0; local309--) {
										if (local296[local309] != null) {
											local334 = 0;
											if (local309 == 0) {
												local334 = 25;
											}
											if (local309 == 1) {
												local334 = 23;
											}
											if (local309 == 2) {
												local334 = 48;
											}
											if (local309 == 3) {
												local334 = 7;
											}
											if (local309 == 4) {
												local334 = 13;
											}
											Static98.addActionRow(-1, (long) local276.anInt2354, JString.concatenate(new JString[] { Static8.aClass100_32, local276.name}), local171, local334, local296[local309], arg2.anInt507);
										}
									}
								}
								Static98.addActionRow(Static225.anInt5073, (long) local276.anInt2354, JString.concatenate(new JString[] { Static8.aClass100_32, local276.name}), local171, (short) 1006, LocalizedText.EXAMINE, arg2.anInt507);
							}
						}
					}
					local171++;
				}
			}
		}
		if (!arg2.aBoolean32) {
			return;
		}
		if (!MiniMenu.aBoolean302) {
			for (local171 = 9; local171 >= 5; local171--) {
				@Pc(765) JString local765 = Static205.method3677(arg2, local171);
				if (local765 != null) {
					Static98.addActionRow(Static8.method118(local171, arg2), (long) (local171 + 1), arg2.aClass100_88, arg2.createdComponentId, (short) 1003, local765, arg2.anInt507);
				}
			}
			local47 = Static97.method1963(arg2);
			if (local47 != null) {
				Static98.addActionRow(-1, 0L, arg2.aClass100_88, arg2.createdComponentId, (short) 32, local47, arg2.anInt507);
			}
			for (local173 = 4; local173 >= 0; local173--) {
				@Pc(828) JString local828 = Static205.method3677(arg2, local173);
				if (local828 != null) {
					Static98.addActionRow(Static8.method118(local173, arg2), (long) (local173 + 1), arg2.aClass100_88, arg2.createdComponentId, (short) 9, local828, arg2.anInt507);
				}
			}
			if (Static36.method940(arg2).method506()) {
				Static98.addActionRow(-1, 0L, JString.EMPTY, arg2.createdComponentId, (short) 41, LocalizedText.CONTINUE, arg2.anInt507);
			}
		} else if (Static36.method940(arg2).method508() && (Static274.anInt4999 & 0x20) != 0) {
			Static98.addActionRow(Static246.anInt5393, 0L, JString.concatenate(new JString[] { Static78.aClass100_466, Static201.aClass100_408, arg2.aClass100_88 }), arg2.createdComponentId, (short) 12, Static102.aClass100_545, arg2.anInt507);
		}
	}

	@OriginalMember(owner = "runetek4.client!va", name = "c", descriptor = "(BI)V")
	public static void method4444(@OriginalArg(1) int arg0) {
		CacheArchive.anInt172 = arg0;
		WorldMap.anInt2428 = 20;
		WorldMap.anInt1864 = 3;
	}
}
