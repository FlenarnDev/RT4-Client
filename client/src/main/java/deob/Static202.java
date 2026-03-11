package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "com.jagex3.client.client!qg", name = "R", descriptor = "I")
	public static int anInt4741;

    @OriginalMember(owner = "com.jagex3.client.client!qg", name = "U", descriptor = "Lclient!na;")
	public static final JagString aClass100_891 = Static28.parse("");

    @OriginalMember(owner = "com.jagex3.client.client!qg", name = "Y", descriptor = "[I")
	public static final int[] anIntArray424 = new int[5];

	@OriginalMember(owner = "com.jagex3.client.client!qg", name = "Z", descriptor = "Lclient!na;")
	public static final JagString aClass100_892 = Static28.parse("mem=");

    @OriginalMember(owner = "com.jagex3.client.client!qg", name = "a", descriptor = "(IZI)V")
	public static void method3655(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) VarBitType local7 = Static125.method2449(arg0);
		@Pc(10) int local10 = local7.anInt3323;
		@Pc(16) int local16 = local7.anInt3318;
		@Pc(19) int local19 = local7.anInt3327;
		@Pc(25) int local25 = ByteArrayNode.anIntArray135[local10 - local16];
		if (arg1 < 0 || arg1 > local25) {
			arg1 = 0;
		}
		local25 <<= local16;
		Static148.method2766(local19, local25 & arg1 << local16 | VarCache.var[local19] & ~local25);
	}

	@OriginalMember(owner = "com.jagex3.client.client!qg", name = "a", descriptor = "([Lclient!na;[SI)V")
	public static void method3656(@OriginalArg(0) JagString[] arg0, @OriginalArg(1) short[] arg1) {
		Static54.method1307(arg1, arg0.length - 1, arg0, 0);
	}

	@OriginalMember(owner = "com.jagex3.client.client!qg", name = "a", descriptor = "(IBII)I")
	public static int method3659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!qg", name = "d", descriptor = "(II)Lclient!ia;")
	public static CursorType method3660(@OriginalArg(0) int arg0) {
		@Pc(10) CursorType local10 = (CursorType) Static79.aClass99_11.method3106((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = CursorType.archive.method4495(33, arg0);
		local10 = new CursorType();
		if (local20 != null) {
			local10.method2249(new Packet(local20), arg0);
		}
		Static79.aClass99_11.method3095(local10, (long) arg0);
		return local10;
	}
}
