package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "com.jagex3.client.client!da", name = "M", descriptor = "Z")
	public static boolean aBoolean78;

	@OriginalMember(owner = "com.jagex3.client.client!da", name = "ab", descriptor = "I")
	public static int anInt1275;

	@OriginalMember(owner = "com.jagex3.client.client!da", name = "O", descriptor = "Lclient!na;")
	public static final JagString aClass100_253 = Static28.parse("(U0a )2 via: ");

    @OriginalMember(owner = "com.jagex3.client.client!da", name = "a", descriptor = "(ILclient!ve;Z)Lclient!ok;")
	public static Pix8 method1010(@OriginalArg(0) int arg0, @OriginalArg(1) Js5 arg1) {
		return Static254.method4346(arg1, arg0) ? Static276.method4614() : null;
	}

	@OriginalMember(owner = "com.jagex3.client.client!da", name = "c", descriptor = "(II)Lclient!aa;")
	public static MsiType method1013(@OriginalArg(0) int arg0) {
		@Pc(10) MsiType local10 = (MsiType) Static231.aClass99_29.method3106((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = MsiType.archive.method4495(34, arg0);
		local10 = new MsiType();
		if (local20 != null) {
			local10.method6(new Packet(local20), arg0);
		}
		Static231.aClass99_29.method3095(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "com.jagex3.client.client!da", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method1014(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg2.indexOf(arg0); local5 != -1; local5 = arg2.indexOf(arg0, local5 + arg1.length())) {
			arg2 = arg2.substring(0, local5) + arg1 + arg2.substring(arg0.length() + local5);
		}
		return arg2;
	}

}
