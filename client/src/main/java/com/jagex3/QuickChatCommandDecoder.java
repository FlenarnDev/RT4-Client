package com.jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex3.client.client!of")
public interface QuickChatCommandDecoder {

	@OriginalMember(owner = "com.jagex3.client.client!of", name = "a", descriptor = "(I[IIJ)Lclient!na;")
    JagString method30(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long arg2);
}
