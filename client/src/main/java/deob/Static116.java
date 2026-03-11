package deob;

import com.jagex3.AbstractPix32;
import com.jagex3.JagString;
import com.jagex3.Js5;
import com.jagex3.Patch;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "com.jagex3.client.client!jb", name = "k", descriptor = "[Lclient!qf;")
	public static AbstractPix32[] aClass3_Sub2_Sub1Array3;

	@OriginalMember(owner = "com.jagex3.client.client!jb", name = "c", descriptor = "Lclient!na;")
	public static final JagString aClass100_583 = Static28.parse("(Y<)4col>");

    @OriginalMember(owner = "com.jagex3.client.client!jb", name = "y", descriptor = "I")
	public static int anInt2961 = 0;

	@OriginalMember(owner = "com.jagex3.client.client!jb", name = "a", descriptor = "(ILclient!ve;I)Lclient!jk;")
	public static Patch method2320(@OriginalArg(1) Js5 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte[] local9 = arg0.method4500(arg1);
		return local9 == null ? null : new Patch(local9);
	}

}
