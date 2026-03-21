package com.jagex3;

import org.openrs2.deob.annotation.OriginalMember;

public class Skills {
    @OriginalMember(owner = "com.jagex3.client.client!h", name = "S", descriptor = "[I")
    public static final int[] skillxp = new int[99];
    @OriginalMember(owner = "com.jagex3.client.client!oj", name = "z", descriptor = "[Z")
	public static final boolean[] used = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };
}
