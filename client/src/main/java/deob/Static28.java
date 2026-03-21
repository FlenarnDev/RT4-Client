package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "com.jagex3.client.client!cd", name = "s", descriptor = "I")
	public static int anInt917;

	@OriginalMember(owner = "com.jagex3.client.client!cd", name = "u", descriptor = "I")
	public static int anInt919;

    @OriginalMember(owner = "com.jagex3.client.client!cd", name = "a", descriptor = "(Lclient!ve;B)I")
	public static int method789(@OriginalArg(0) Js5 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4506(Static280.anInt5900)) {
			local5++;
		}
		if (arg0.method4506(Static131.anInt3261)) {
			local5++;
		}
		if (arg0.method4506(Static36.anInt1165)) {
			local5++;
		}
		if (arg0.method4506(Static214.anInt5579)) {
			local5++;
		}
		if (arg0.method4506(Static34.anInt1049)) {
			local5++;
		}
		if (arg0.method4506(Static202.anInt4741)) {
			local5++;
		}
		if (arg0.method4506(Static149.anInt3551)) {
			local5++;
		}
		if (arg0.method4506(Static19.anInt647)) {
			local5++;
		}
		if (arg0.method4506(Static32.anInt1016)) {
			local5++;
		}
		if (arg0.method4506(Static78.anInt2147)) {
			local5++;
		}
		if (arg0.method4506(Static124.anInt3083)) {
			local5++;
		}
		if (arg0.method4506(Static224.anInt5057)) {
			local5++;
		}
		if (arg0.method4506(Static84.anInt2257)) {
			local5++;
		}
		if (arg0.method4506(Static163.anInt3962)) {
			local5++;
		}
		if (arg0.method4506(Static128.anInt3143)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "com.jagex3.client.client!cd", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!na;")
	public static JagString parse(@OriginalArg(0) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(13) JagString local13 = new JagString();
		@Pc(15) int local15 = 0;
		local13.aByteArray52 = new byte[local9];
		while (local9 > local15) {
			@Pc(29) int local29 = local6[local15++] & 0xFF;
			if (local29 <= 45 && local29 >= 40) {
				if (local15 >= local9) {
					break;
				}
				@Pc(51) int local51 = local6[local15++] & 0xFF;
				local13.aByteArray52[local13.anInt4030++] = (byte) (local51 + (local29 + -40) * 43 - 48);
			} else if (local29 != 0) {
				local13.aByteArray52[local13.anInt4030++] = (byte) local29;
			}
		}
		local13.method3156();
		return local13.method3151();
	}

}
