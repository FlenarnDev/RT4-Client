package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "com.jagex3.client.client!kf", name = "f", descriptor = "I")
	public static int anInt5230;

	@OriginalMember(owner = "com.jagex3.client.client!kf", name = "c", descriptor = "J")
	public static long clickTime = 0L;

	@OriginalMember(owner = "com.jagex3.client.client!kf", name = "d", descriptor = "[Lclient!cl;")
	public static final AnimFrameset[] aClass3_Sub2_Sub7Array7 = new AnimFrameset[14];

	@OriginalMember(owner = "com.jagex3.client.client!kf", name = "h", descriptor = "[I")
	public static final int[] anIntArray453 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "com.jagex3.client.client!kf", name = "j", descriptor = "I")
	public static final int anInt5233 = 0;

    @OriginalMember(owner = "com.jagex3.client.client!kf", name = "a", descriptor = "(II)I")
	public static int method4010(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "com.jagex3.client.client!kf", name = "a", descriptor = "(Lclient!na;I)V")
	public static void method4011(@OriginalArg(0) JagString arg0) {
		for (@Pc(15) Map local15 = (Map) Static228.aClass69_120.head(); local15 != null; local15 = (Map) Static228.aClass69_120.next()) {
			if (local15.aClass100_138.equalsInner(arg0)) {
				Static269.aClass3_Sub2_Sub4_2 = local15;
				return;
			}
		}
	}

}
