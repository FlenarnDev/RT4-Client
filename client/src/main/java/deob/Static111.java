package deob;

import com.jagex3.IfType;
import com.jagex3.JagString;
import com.jagex3.client.Client;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static111 {

	@OriginalMember(owner = "com.jagex3.client.client!ii", name = "a", descriptor = "I")
	public static int anInt2900;

	@OriginalMember(owner = "com.jagex3.client.client!ii", name = "i", descriptor = "I")
	public static int anInt2903;

	@OriginalMember(owner = "com.jagex3.client.client!ii", name = "l", descriptor = "I")
	public static int anInt2905;

	@OriginalMember(owner = "com.jagex3.client.client!ii", name = "y", descriptor = "I")
	public static int anInt2910;

    @OriginalMember(owner = "com.jagex3.client.client!ii", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_570 = Static28.parse(")2");

	@OriginalMember(owner = "com.jagex3.client.client!ii", name = "a", descriptor = "(Lclient!be;III)V")
	public static void method2291(@OriginalArg(0) IfType arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.xMode == 0) {
			arg0.y = arg0.dataY;
		} else if (arg0.xMode == 1) {
			arg0.y = (arg1 - arg0.anInt459) / 2 + arg0.dataY;
		} else if (arg0.xMode == 2) {
			arg0.y = arg1 - arg0.anInt459 - arg0.dataY;
		} else if (arg0.xMode == 3) {
			arg0.y = arg0.dataY * arg1 >> 14;
		} else if (arg0.xMode == 4) {
			arg0.y = (arg1 * arg0.dataY >> 14) + (arg1 - arg0.anInt459) / 2;
		} else {
			arg0.y = arg1 - (arg1 * arg0.dataY >> 14) - arg0.anInt459;
		}
		if (arg0.yMode == 0) {
			arg0.x = arg0.dataX;
		} else if (arg0.yMode == 1) {
			arg0.x = arg0.dataX + (arg2 - arg0.anInt445) / 2;
		} else if (arg0.yMode == 2) {
			arg0.x = arg2 - arg0.dataX - arg0.anInt445;
		} else if (arg0.yMode == 3) {
			arg0.x = arg0.dataX * arg2 >> 14;
		} else if (arg0.yMode == 4) {
			arg0.x = (arg0.dataX * arg2 >> 14) + (arg2 - arg0.anInt445) / 2;
		} else {
			arg0.x = arg2 - (arg2 * arg0.dataX >> 14) - arg0.anInt445;
		}
		if (!Client.aBoolean154 || Client.getActive(arg0).eventCode == 0 && arg0.type != 0) {
			return;
		}
		if (arg0.y < 0) {
			arg0.y = 0;
		} else if (arg0.anInt459 + arg0.y > arg1) {
			arg0.y = arg1 - arg0.anInt459;
		}
		if (arg0.x < 0) {
			arg0.x = 0;
		} else if (arg2 < arg0.x + arg0.anInt445) {
			arg0.x = arg2 - arg0.anInt445;
		}
	}

}
