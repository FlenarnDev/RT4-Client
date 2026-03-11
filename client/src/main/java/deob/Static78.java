package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static78 {

	@OriginalMember(owner = "com.jagex3.client.client!gd", name = "l", descriptor = "I")
	public static int anInt2147;

	@OriginalMember(owner = "com.jagex3.client.client!gd", name = "m", descriptor = "Lclient!ve;")
	public static Js5 aClass153_32;

	@OriginalMember(owner = "com.jagex3.client.client!gd", name = "n", descriptor = "Lclient!qf;")
	public static AbstractPix32 aClass3_Sub2_Sub1_3;

	@OriginalMember(owner = "com.jagex3.client.client!gd", name = "b", descriptor = "Lclient!na;")
	public static final JagString aClass100_464 = Static28.parse("null");

	@OriginalMember(owner = "com.jagex3.client.client!gd", name = "c", descriptor = "Lclient!na;")
	public static final JagString aClass100_465 = Static28.parse(")0");

	@OriginalMember(owner = "com.jagex3.client.client!gd", name = "h", descriptor = "[I")
	public static final int[] anIntArray204 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "com.jagex3.client.client!gd", name = "i", descriptor = "Lclient!na;")
	public static JagString aClass100_466 = null;

    @OriginalMember(owner = "com.jagex3.client.client!gd", name = "a", descriptor = "(IIBI)I")
	public static int method1690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg2 > arg1 ? arg2 : arg1 > arg0 ? arg0 : arg1;
	}

    @OriginalMember(owner = "com.jagex3.client.client!gd", name = "a", descriptor = "(ILclient!ve;II)Lclient!mm;")
	public static Pix32 method1693(@OriginalArg(0) int arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(3) int arg2) {
		return Static234.method4016(arg1, arg0, arg2) ? Static196.method3537() : null;
	}

}
