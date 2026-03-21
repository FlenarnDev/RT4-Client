package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "com.jagex3.client.client!ui", name = "Q", descriptor = "I")
	public static int anInt5526;

	@OriginalMember(owner = "com.jagex3.client.client!ui", name = "R", descriptor = "I")
	public static int anInt5527;

	@OriginalMember(owner = "com.jagex3.client.client!ui", name = "T", descriptor = "F")
	public static float aFloat36;

    @OriginalMember(owner = "com.jagex3.client.client!ui", name = "eb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "com.jagex3.client.client!ui", name = "mb", descriptor = "F")
	public static float aFloat37;

    @OriginalMember(owner = "com.jagex3.client.client!ui", name = "c", descriptor = "(II)I")
	public static int method4328(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "com.jagex3.client.client!ui", name = "a", descriptor = "(IZ)Lclient!ml;")
	public static EnumType method4330(@OriginalArg(0) int arg0) {
		@Pc(10) EnumType local10 = (EnumType) Static149.aClass54_10.method1806((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = EnumType.clientConfig.method4495(Static97.method1959(arg0), Static103.method2236(arg0));
		local10 = new EnumType();
		if (local24 != null) {
			local10.method3094(new Packet(local24));
		}
		Static149.aClass54_10.method1811(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "com.jagex3.client.client!ui", name = "h", descriptor = "(I)[Lclient!ok;")
	public static Pix8[] method4331() {
		@Pc(8) Pix8[] local8 = new Pix8[Static165.anInt4038];
		for (@Pc(10) int local10 = 0; local10 < Static165.anInt4038; local10++) {
			if (GlRenderer.enabled) {
				local8[local10] = new GlPix8(Static124.anInt3080, Static227.anInt5091, Static274.anIntArray440[local10], Static269.anIntArray252[local10], Static254.anIntArray488[local10], Static26.anIntArray66[local10], Static7.aByteArrayArray5[local10], Static259.anIntArray513);
			} else {
				local8[local10] = new SoftwarePix8(Static124.anInt3080, Static227.anInt5091, Static274.anIntArray440[local10], Static269.anIntArray252[local10], Static254.anIntArray488[local10], Static26.anIntArray66[local10], Static7.aByteArrayArray5[local10], Static259.anIntArray513);
			}
		}
		Static75.method1631();
		return local8;
	}

	@OriginalMember(owner = "com.jagex3.client.client!ui", name = "d", descriptor = "(II)V")
	public static void method4332(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && Static258.aBooleanArray130.length > arg0) {
			Static258.aBooleanArray130[arg0] = !Static258.aBooleanArray130[arg0];
		}
	}
}
