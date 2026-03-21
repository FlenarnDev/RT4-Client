package deob;

import com.jagex3.JagString;
import com.jagex3.WorldMap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static98 {

    @OriginalMember(owner = "com.jagex3.client.client!hj", name = "e", descriptor = "I")
	public static int anInt2512;

    @OriginalMember(owner = "com.jagex3.client.client!hj", name = "d", descriptor = "Lclient!na;")
	public static final JagString aClass100_524 = Static28.parse("hint_headicons");

	@OriginalMember(owner = "com.jagex3.client.client!hj", name = "a", descriptor = "(II)V")
	public static void method1964(@OriginalArg(0) int arg0) {
		Static217.anInt4901 = -1;
		Static142.anInt3482 = -1;
		WorldMap.anInt435 = arg0;
		Static38.method965();
	}

}
