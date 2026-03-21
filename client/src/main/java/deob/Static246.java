package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "com.jagex3.client.client!u", name = "i", descriptor = "I")
	public static int anInt5393;

	@OriginalMember(owner = "com.jagex3.client.client!u", name = "a", descriptor = "I")
	public static int anInt5388 = 0;

	@OriginalMember(owner = "com.jagex3.client.client!u", name = "g", descriptor = "Lclient!na;")
	public static final JagString aClass100_1029 = Static28.parse("cookiehost");

    @OriginalMember(owner = "com.jagex3.client.client!u", name = "a", descriptor = "(II)Lclient!md;")
	public static InvType method4241(@OriginalArg(0) int arg0) {
		@Pc(16) InvType local16 = (InvType) Static89.aClass54_8.method1806((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(27) byte[] local27 = Static9.clientConfig.method4495(5, arg0);
		local16 = new InvType();
		if (local27 != null) {
			local16.method2927(new Packet(local27));
		}
		Static89.aClass54_8.method1811(local16, (long) arg0);
		return local16;
	}
}
