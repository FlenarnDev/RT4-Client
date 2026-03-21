package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static60 {

	@OriginalMember(owner = "com.jagex3.client.client!em", name = "t", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6;

    @OriginalMember(owner = "com.jagex3.client.client!em", name = "x", descriptor = "Lclient!cj;")
	public static AudioThread aClass19_1;

	@OriginalMember(owner = "com.jagex3.client.client!em", name = "D", descriptor = "I")
	public static int anInt1895;

	@OriginalMember(owner = "com.jagex3.client.client!em", name = "u", descriptor = "Lclient!na;")
	public static final JagString aClass100_420 = Static28.parse(")1o");

    @OriginalMember(owner = "com.jagex3.client.client!em", name = "a", descriptor = "(II)I")
	public static int method1447(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
