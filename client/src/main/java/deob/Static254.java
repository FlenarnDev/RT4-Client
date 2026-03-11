package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "com.jagex3.client.client!uj", name = "x", descriptor = "[I")
	public static int[] anIntArray488;

    @OriginalMember(owner = "com.jagex3.client.client!uj", name = "E", descriptor = "I")
	public static int anInt5556;

	@OriginalMember(owner = "com.jagex3.client.client!uj", name = "H", descriptor = "I")
	public static int anInt5559;

    @OriginalMember(owner = "com.jagex3.client.client!uj", name = "s", descriptor = "Lclient!na;")
	public static final JagString aClass100_1061 = Static28.parse("null");

	@OriginalMember(owner = "com.jagex3.client.client!uj", name = "t", descriptor = "[I")
	public static final int[] anIntArray487 = new int[1000];

	@OriginalMember(owner = "com.jagex3.client.client!uj", name = "A", descriptor = "[I")
	public static final int[] anIntArray489 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "com.jagex3.client.client!uj", name = "a", descriptor = "(BLclient!ve;I)Z")
	public static boolean method4346(@OriginalArg(1) Js5 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method4500(arg1);
		if (local13 == null) {
			return false;
		} else {
			Static84.method1770(local13);
			return true;
		}
	}

    @OriginalMember(owner = "com.jagex3.client.client!uj", name = "a", descriptor = "(II)I")
	public static int method4349(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "com.jagex3.client.client!uj", name = "a", descriptor = "(Lclient!wa;II)Lclient!na;")
	public static JagString method4350(@OriginalArg(0) Packet arg0) {
		try {
			@Pc(7) int local7 = arg0.gsmart();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.pos += Static62.aClass44_1.method1552(0, local7, local15, arg0.data, arg0.pos);
			return Static10.decodeString(local15, local7, 0);
		} catch (@Pc(47) Exception local47) {
			return Static267.aClass100_1087;
		}
	}
}
