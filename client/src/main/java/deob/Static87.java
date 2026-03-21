package deob;

import com.jagex3.*;
import com.jagex3.client.Client;
import com.jagex3.client.applet.GameShell;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

    @OriginalMember(owner = "com.jagex3.client.client!gn", name = "d", descriptor = "Z")
	public static boolean aBoolean130 = false;

	@OriginalMember(owner = "com.jagex3.client.client!gn", name = "i", descriptor = "Lclient!n;")
	public static final SoftLruCache aClass99_12 = new SoftLruCache(20);

	@OriginalMember(owner = "com.jagex3.client.client!gn", name = "v", descriptor = "Lclient!na;")
	public static final JagString aClass100_494 = Static28.parse("null");

	@OriginalMember(owner = "com.jagex3.client.client!gn", name = "a", descriptor = "(Z)Z")
	public static boolean method1802() {
		if (Client.js) {
			try {
				Static9.aClass100_35.method3157(GameShell.signLink.applet);
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "com.jagex3.client.client!gn", name = "a", descriptor = "(Lclient!ve;ZLclient!ve;BI)Lclient!cl;")
	public static AnimFrameset method1803(@OriginalArg(0) Js5 arg0, @OriginalArg(2) Js5 arg1, @OriginalArg(4) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(16) int[] local16 = arg0.method4503(arg2);
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(30) byte[] local30 = arg0.method4502(local16[local18], arg2);
			if (local30 == null) {
				local5 = false;
			} else {
				@Pc(49) int local49 = (local30[0] & 0xFF) << 8 | local30[1] & 0xFF;
				@Pc(57) byte[] local57 = arg1.method4502(0, local49);
				if (local57 == null) {
					local5 = false;
				}
			}
		}
		if (!local5) {
			return null;
		}
		try {
			return new AnimFrameset(arg0, arg1, arg2, false);
		} catch (@Pc(84) Exception local84) {
			return null;
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!gn", name = "a", descriptor = "(BI)Lclient!na;")
	public static JagString method1804(@OriginalArg(1) int arg0) {
		@Pc(13) JagString local13 = new JagString();
		local13.anInt4030 = 0;
		local13.aByteArray52 = new byte[arg0];
		return local13;
	}

    @OriginalMember(owner = "com.jagex3.client.client!gn", name = "a", descriptor = "(IZI)I")
	public static int method1814(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
