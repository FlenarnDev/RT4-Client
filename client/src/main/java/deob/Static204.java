package deob;

import com.jagex3.AbstractPix32;
import com.jagex3.JagString;
import com.jagex3.LinkList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "com.jagex3.client.client!qi", name = "z", descriptor = "Lclient!qf;")
	public static AbstractPix32 aClass3_Sub2_Sub1_10;

    @OriginalMember(owner = "com.jagex3.client.client!qi", name = "r", descriptor = "I")
	public static int anInt4760 = 0;

	@OriginalMember(owner = "com.jagex3.client.client!qi", name = "t", descriptor = "I")
	public static int anInt4762 = 0;

	@OriginalMember(owner = "com.jagex3.client.client!qi", name = "u", descriptor = "Lclient!ih;")
	public static LinkList aClass69_113 = new LinkList();

	@OriginalMember(owner = "com.jagex3.client.client!qi", name = "v", descriptor = "Z")
	public static boolean aBoolean234 = false;

	@OriginalMember(owner = "com.jagex3.client.client!qi", name = "x", descriptor = "[I")
	public static final int[] anIntArray425 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "com.jagex3.client.client!qi", name = "A", descriptor = "I")
	public static int anInt4765 = -1;

	@OriginalMember(owner = "com.jagex3.client.client!qi", name = "B", descriptor = "Lclient!na;")
	public static final JagString aClass100_896 = Static28.parse("<col=ffffff>");

	@OriginalMember(owner = "com.jagex3.client.client!qi", name = "e", descriptor = "(B)V")
	public static void method3673() {
		Static93.aClass99_13.method3104();
		Static125.aClass99_18.method3104();
		Static262.aClass99_35.method3104();
	}

	@OriginalMember(owner = "com.jagex3.client.client!qi", name = "b", descriptor = "(II)I")
	public static int method3674(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "com.jagex3.client.client!qi", name = "a", descriptor = "(IIBI)I")
	public static int method3675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg2;
		}
	}
}
