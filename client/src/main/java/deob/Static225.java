package deob;

import com.jagex3.*;
import com.jagex3.client.Client;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

    @OriginalMember(owner = "com.jagex3.client.client!se", name = "h", descriptor = "I")
	public static int anInt5073 = -1;

	@OriginalMember(owner = "com.jagex3.client.client!se", name = "m", descriptor = "Lclient!na;")
	public static final JagString aClass100_961 = Static28.parse(" )2>");

	@OriginalMember(owner = "com.jagex3.client.client!se", name = "t", descriptor = "[I")
	public static final int[] anIntArray445 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "com.jagex3.client.client!se", name = "a", descriptor = "(IIIIZ)I")
	public static int method3891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8 = arg3 & 0xF;
		@Pc(29) int local29 = local8 >= 4 ? (local8 == 12 || local8 == 14 ? arg0 : arg1) : arg2;
		@Pc(42) int local42 = local8 < 8 ? arg0 : arg2;
		return ((local8 & 0x1) == 0 ? local42 : -local42) + ((local8 & 0x2) == 0 ? local29 : -local29);
	}

	@OriginalMember(owner = "com.jagex3.client.client!se", name = "a", descriptor = "(III)V")
	public static void method3893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) DelayedStateChange local14 = Static238.method4143(5, arg0);
		local14.method1017();
		local14.intArg1 = arg1;
	}

	@OriginalMember(owner = "com.jagex3.client.client!se", name = "a", descriptor = "(Lclient!na;Lclient!na;IB)V")
	public static void method3896(@OriginalArg(0) JagString arg0, @OriginalArg(1) JagString arg1, @OriginalArg(2) int arg2) {
		TitleScreen.loginPass = arg1;
		Static5.anInt39 = arg2;
		TitleScreen.loginUser = arg0;
		if (TitleScreen.loginUser.equalsInner(TitleScreen.AUTO_EMPTY) || TitleScreen.loginPass.equalsInner(TitleScreen.AUTO_EMPTY)) {
			Client.worldHopError = 3;
		} else if (Static125.worldId == -1) {
			Client.worldListWaitingTime = 0;
			Client.worldHopFailCount = 0;
			Client.worldHopError = -3;
			Client.worldHopStep = 1;
			@Pc(43) Packet local43 = new Packet(128);
			local43.p1(10);
			local43.p2((int) (Math.random() * 99999.0D));
			local43.p2(530);
			local43.p8(TitleScreen.loginUser.encode37());
			local43.p4((int) (Math.random() * 9.9999999E7D));
			local43.pjstr(TitleScreen.loginPass);
			local43.p4((int) (Math.random() * 9.9999999E7D));
			local43.rsaenc(Static86.RSA_EXPONENT, Static86.RSA_MODULUS);
			Client.out.pos = 0;
			Client.out.p1(210);
			Client.out.p1(local43.pos);
			Client.out.pdata(local43.data, local43.pos);
		} else {
			Client.method1208();
		}
	}
}
