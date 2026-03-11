package deob;

import com.jagex3.JagString;
import com.jagex3.Js5;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static119 {

	@OriginalMember(owner = "com.jagex3.client.client!je", name = "W", descriptor = "Lclient!ve;")
	public static Js5 aClass153_44;

	@OriginalMember(owner = "com.jagex3.client.client!je", name = "eb", descriptor = "[I")
	public static int[] anIntArray282;

	@OriginalMember(owner = "com.jagex3.client.client!je", name = "R", descriptor = "Z")
	public static boolean aBoolean153 = false;

    @OriginalMember(owner = "com.jagex3.client.client!je", name = "U", descriptor = "Lclient!na;")
	public static final JagString aClass100_588 = Static28.parse("showingVideoAd");

	@OriginalMember(owner = "com.jagex3.client.client!je", name = "db", descriptor = "Lclient!na;")
	public static final JagString aClass100_589 = Static28.parse(" <col=ffffff>");

    @OriginalMember(owner = "com.jagex3.client.client!je", name = "f", descriptor = "(B)V")
	public static void method2381() {
		if (Static18.aBoolean40) {
			Static243.aClass36_1 = null;
			Static18.aBoolean40 = false;
			Static78.aClass3_Sub2_Sub1_3 = null;
		}
	}

    @OriginalMember(owner = "com.jagex3.client.client!je", name = "j", descriptor = "(I)I")
	public static int method2385() {
		if (Static203.aMapElementList_1 == null) {
			return -1;
		}
		while (Static232.anInt5212 < Static203.aMapElementList_1.anInt5074) {
			if (Static203.aMapElementList_1.method3897(Static232.anInt5212)) {
				return Static232.anInt5212++;
			}
			Static232.anInt5212++;
		}
		return -1;
	}

}
