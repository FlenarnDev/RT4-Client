package com.jagex.runetek4;

import com.jagex.runetek4.cache.media.component.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "runetek4.client!lk", name = "J", descriptor = "Lclient!na;")
	public static final JString aClass100_687 = JString.parse(")4p=");

	@OriginalMember(owner = "runetek4.client!lk", name = "V", descriptor = "I")
	public static int anInt3582 = 0;

	@OriginalMember(owner = "runetek4.client!lk", name = "a", descriptor = "(IIILclient!be;Z)V")
	public static void method2801(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) boolean arg3) {
		@Pc(4) int local4 = arg2.width;
		@Pc(7) int local7 = arg2.height;
		if (arg2.dynamicWidthValue == 0) {
			arg2.width = arg2.baseWidth;
		} else if (arg2.dynamicWidthValue == 1) {
			arg2.width = arg1 - arg2.baseWidth;
		} else if (arg2.dynamicWidthValue == 2) {
			arg2.width = arg2.baseWidth * arg1 >> 14;
		} else if (arg2.dynamicWidthValue == 3) {
			if (arg2.type == 2) {
				arg2.width = arg2.baseWidth * 32 + (arg2.baseWidth - 1) * arg2.invMarginX;
			} else if (arg2.type == 7) {
				arg2.width = arg2.baseWidth * 115 + arg2.invMarginX * (arg2.baseWidth - 1);
			}
		}
		if (arg2.dynamicHeightValue == 0) {
			arg2.height = arg2.baseHeight;
		} else if (arg2.dynamicHeightValue == 1) {
			arg2.height = arg0 - arg2.baseHeight;
		} else if (arg2.dynamicHeightValue == 2) {
			arg2.height = arg0 * arg2.baseHeight >> 14;
		} else if (arg2.dynamicHeightValue == 3) {
			if (arg2.type == 2) {
				arg2.height = (arg2.baseHeight - 1) * arg2.invMarginY + arg2.baseHeight * 32;
			} else if (arg2.type == 7) {
				arg2.height = arg2.baseHeight * 12 + (arg2.baseHeight - 1) * arg2.invMarginY;
			}
		}
		if (arg2.dynamicWidthValue == 4) {
			arg2.width = arg2.aspectWidth * arg2.height / arg2.aspectHeight;
		}
		if (arg2.dynamicHeightValue == 4) {
			arg2.height = arg2.aspectHeight * arg2.width / arg2.aspectWidth;
		}
		if (Cheat.qaOpTest && (InterfaceList.getServerActiveProperties(arg2).anInt546 != 0 || arg2.type == 0)) {
			if (arg2.height < 5 && arg2.width < 5) {
				arg2.height = 5;
				arg2.width = 5;
			} else {
				if (arg2.width <= 0) {
					arg2.width = 5;
				}
				if (arg2.height <= 0) {
					arg2.height = 5;
				}
			}
		}
		if (arg2.contentType == 1337) {
			Static280.aClass13_26 = arg2;
		}
		if (arg3 && arg2.onResize != null && (local4 != arg2.width || arg2.height != local7)) {
			@Pc(305) HookRequest local305 = new HookRequest();
			local305.arguments = arg2.onResize;
			local305.source = arg2;
			Static185.aClass69_101.addTail(local305);
		}
	}

}
