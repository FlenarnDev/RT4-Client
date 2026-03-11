package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "com.jagex3.client.client!jd", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

    @OriginalMember(owner = "com.jagex3.client.client!jd", name = "c", descriptor = "Lclient!n;")
	public static final SoftLruCache aClass99_16 = new SoftLruCache(100);

	@OriginalMember(owner = "com.jagex3.client.client!jd", name = "a", descriptor = "(B)I")
	public static int method2352() {
		Static232.anInt5212 = 0;
		return Static119.method2385();
	}

	@OriginalMember(owner = "com.jagex3.client.client!jd", name = "a", descriptor = "(IB)V")
	public static void method2353(@OriginalArg(0) int arg0) {
		@Pc(12) DelayedStateChange local12 = Static238.method4143(12, arg0);
		local12.method1007();
	}

    @OriginalMember(owner = "com.jagex3.client.client!jd", name = "a", descriptor = "(II[Lclient!na;I)Lclient!na;")
	public static JagString method2355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) JagString[] arg2) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			if (arg2[arg0 + local7] == null) {
				arg2[local7 + arg0] = Static193.aClass100_853;
			}
			local5 += arg2[local7 + arg0].anInt4030;
		}
		@Pc(39) byte[] local39 = new byte[local5];
		@Pc(41) int local41 = 0;
		for (@Pc(43) int local43 = 0; local43 < arg1; local43++) {
			@Pc(52) JagString local52 = arg2[local43 + arg0];
			Static289.method2612(local52.aByteArray52, 0, local39, local41, local52.anInt4030);
			local41 += local52.anInt4030;
		}
		@Pc(71) JagString local71 = new JagString();
		local71.anInt4030 = local5;
		local71.aByteArray52 = local39;
		return local71;
	}

	@OriginalMember(owner = "com.jagex3.client.client!jd", name = "a", descriptor = "(II)I")
	public static int method2356(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
