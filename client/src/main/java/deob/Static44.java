package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "com.jagex3.client.client!dh", name = "h", descriptor = "I")
	public static int anInt1404;

    @OriginalMember(owner = "com.jagex3.client.client!dh", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_335 = Static28.parse("Number of player models in cache:");

	@OriginalMember(owner = "com.jagex3.client.client!dh", name = "i", descriptor = "Lclient!na;")
	public static final JagString aClass100_336 = Static28.parse("<img=1>");

    @OriginalMember(owner = "com.jagex3.client.client!dh", name = "b", descriptor = "(I)Lclient!q;")
	public static ReferenceNodeFactory method1147() {
		try {
			return (ReferenceNodeFactory) Class.forName("com.jagex3.SoftReferenceNodeFactory").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

    @OriginalMember(owner = "com.jagex3.client.client!dh", name = "a", descriptor = "(Lclient!na;I)V")
	public static void method1149(@OriginalArg(0) JagString arg0) {
		@Pc(7) int local7 = Static91.method1879(arg0);
		if (local7 != -1) {
			Static80.method3616(Static203.aMapElementList_1.aShortArray73[local7], Static203.aMapElementList_1.aShortArray72[local7]);
		}
	}

}
