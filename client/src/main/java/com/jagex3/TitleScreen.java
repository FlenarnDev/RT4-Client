package com.jagex3;

import deob.Static28;
import org.openrs2.deob.annotation.OriginalMember;

public class TitleScreen {
    @OriginalMember(owner = "com.jagex3.client.client!a", name = "e", descriptor = "Lclient!na;")
    public static final JagString TITLESONG = Static28.parse("scape main");
    @OriginalMember(owner = "com.jagex3.client.client!pa", name = "O", descriptor = "Lclient!na;")
    public static final JagString AUTO_EMPTY = Static28.parse("");
    @OriginalMember(owner = "com.jagex3.client.client!pa", name = "P", descriptor = "Lclient!na;")
	public static JagString loginPass = AUTO_EMPTY;
    @OriginalMember(owner = "com.jagex3.client.client!pa", name = "S", descriptor = "Lclient!na;")
	public static JagString loginUser = AUTO_EMPTY;
    @OriginalMember(owner = "com.jagex3.client.client!jm", name = "A", descriptor = "Lclient!na;")
    private static final JagString aClass100_603 = Static28.parse("");
    @OriginalMember(owner = "com.jagex3.client.client!jm", name = "z", descriptor = "Lclient!na;")
    public static JagString loadString = aClass100_603;
    @OriginalMember(owner = "com.jagex3.client.client!qc", name = "P", descriptor = "I")
    public static int loadPos = 10;
}
