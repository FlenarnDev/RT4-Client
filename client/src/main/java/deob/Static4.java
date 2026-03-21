package deob;

import com.jagex3.*;
import com.jagex3.client.Client;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "com.jagex3.client.client!ac", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

    @OriginalMember(owner = "com.jagex3.client.client!ac", name = "k", descriptor = "S")
	public static short aShort1 = 32767;

	@OriginalMember(owner = "com.jagex3.client.client!ac", name = "l", descriptor = "Lclient!ck;")
	public static final BasType aClass20_1 = new BasType();

	@OriginalMember(owner = "com.jagex3.client.client!ac", name = "m", descriptor = "Lclient!na;")
	public static final JagString aClass100_7 = Static28.parse("overlay");

    @OriginalMember(owner = "com.jagex3.client.client!ac", name = "a", descriptor = "(IIII)I")
	public static int method22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((ClientBuild.mapl[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (ClientBuild.mapl[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!ac", name = "a", descriptor = "([J[Ljava/lang/Object;I)V")
	public static void method23(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Static228.method3909(arg0.length - 1, arg0, 0, arg1);
	}

	@OriginalMember(owner = "com.jagex3.client.client!ac", name = "a", descriptor = "(BI)V")
	public static void method24(@OriginalArg(1) int arg0) {
		@Pc(16) DelayedStateChange local16 = Static238.method4143(1, arg0);
		local16.method1007();
	}

	@OriginalMember(owner = "com.jagex3.client.client!ac", name = "a", descriptor = "(Lclient!na;I)I")
	public static int method25(@OriginalArg(0) JagString arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < Static9.anInt178; local20++) {
			if (arg0.equalsIgnoreCase(Client.aClass100Array92[local20])) {
				return local20;
			}
		}
		return -1;
	}

}
