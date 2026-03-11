package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static122 {

    @OriginalMember(owner = "com.jagex3.client.client!jh", name = "n", descriptor = "Lclient!bd;")
	public static QuickChatPhrase aClass12_1;

    @OriginalMember(owner = "com.jagex3.client.client!jh", name = "f", descriptor = "D")
	public static double aDouble1 = -1.0D;

    @OriginalMember(owner = "com.jagex3.client.client!jh", name = "a", descriptor = "(IILclient!ve;Lclient!ve;I)Lclient!dd;")
	public static PixFont method2412(@OriginalArg(0) int arg0, @OriginalArg(2) Js5 arg1, @OriginalArg(3) Js5 arg2) {
		return Static234.method4016(arg2, 0, arg0) ? Static114.method4635(arg1.method4495(arg0, 0)) : null;
	}
}
