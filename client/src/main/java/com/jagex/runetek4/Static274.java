package com.jagex.runetek4;

import com.jagex.runetek4.cache.media.component.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static274 {

	@OriginalMember(owner = "runetek4.client!wf", name = "d", descriptor = "I")
	public static int anInt4997;

	@OriginalMember(owner = "runetek4.client!wf", name = "f", descriptor = "I")
	public static int anInt4999;

	@OriginalMember(owner = "runetek4.client!wf", name = "j", descriptor = "Lclient!be;")
	public static Component aClass13_24;

	@OriginalMember(owner = "runetek4.client!wf", name = "a", descriptor = "(II)I")
	public static int method3845(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}
