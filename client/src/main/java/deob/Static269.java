package deob;

import com.jagex3.*;
import com.jagex3.client.Client;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "com.jagex3.client.client!wa", name = "z", descriptor = "[I")
	public static int[] anIntArray252;

	@OriginalMember(owner = "com.jagex3.client.client!wa", name = "ub", descriptor = "Lclient!bn;")
	public static Map aClass3_Sub2_Sub4_2;

    @OriginalMember(owner = "com.jagex3.client.client!wa", name = "pb", descriptor = "Lclient!na;")
	public static final JagString aClass100_556 = Static28.parse("<br>");

    @OriginalMember(owner = "com.jagex3.client.client!wa", name = "e", descriptor = "(B)V")
	public static void method2172() {
		Static118.aClass99_16.method3104();
	}

    @OriginalMember(owner = "com.jagex3.client.client!wa", name = "o", descriptor = "(I)V")
	public static void method2218() {
		@Pc(8) int local8 = Static236.method4047();
		if (local8 == 0) {
			Static266.aByteArrayArrayArray15 = null;
			Static232.method3993(0);
		} else if (local8 == 1) {
			Static38.method960((byte) 0);
			Static232.method3993(512);
			Static132.method2608();
		} else {
			Static38.method960((byte) (Static136.anInt3325 - 4 & 0xFF));
			Static232.method3993(2);
		}
	}

    @OriginalMember(owner = "com.jagex3.client.client!wa", name = "a", descriptor = "(IZ)Lclient!na;")
	public static JagString method2228(@OriginalArg(0) int arg0) {
		return Client.aClass100Array160[arg0].length() > 0 ? JagString.join(new JagString[] { Client.aClass100Array168[arg0], LocalizedText.MINISEPARATOR, Client.aClass100Array160[arg0] }) : Client.aClass100Array168[arg0];
	}
}
