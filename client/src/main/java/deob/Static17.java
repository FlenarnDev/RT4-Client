package deob;

import com.jagex3.JagString;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static17 {

    @OriginalMember(owner = "com.jagex3.client.client!bg", name = "z", descriptor = "Lclient!na;")
	public static final JagString aClass100_101 = Static28.parse("k");

	@OriginalMember(owner = "com.jagex3.client.client!bg", name = "A", descriptor = "[I")
	public static final int[] anIntArray53 = new int[128];

    @OriginalMember(owner = "com.jagex3.client.client!bg", name = "N", descriptor = "Lclient!na;")
	public static final JagString aClass100_102 = Static28.parse("mapfunction");

    @OriginalMember(owner = "com.jagex3.client.client!bg", name = "d", descriptor = "(II)Z")
	public static boolean method530(@OriginalArg(0) int arg0) {
		return arg0 == 198 || arg0 == 230 || arg0 == 156 || arg0 == 140 || arg0 == 223;
	}

}
