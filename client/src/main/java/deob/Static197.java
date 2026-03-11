package deob;

import com.jagex.signlink.PrivilegedRequest;
import com.jagex.signlink.SignLink;
import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "com.jagex3.client.client!pm", name = "cb", descriptor = "[[[Lclient!bj;")
	public static Square[][][] aClass3_Sub5ArrayArrayArray2;

	@OriginalMember(owner = "com.jagex3.client.client!pm", name = "hb", descriptor = "I")
	public static int anInt4620;

	@OriginalMember(owner = "com.jagex3.client.client!pm", name = "Y", descriptor = "Lclient!na;")
	public static final JagString aClass100_872 = Static28.parse("<br>");

    @OriginalMember(owner = "com.jagex3.client.client!pm", name = "a", descriptor = "(ILsignlink!ll;)[Lclient!od;")
	public static DisplayMode[] method3558(@OriginalArg(1) SignLink arg0) {
		if (!arg0.method5111()) {
			return new DisplayMode[0];
		}
		@Pc(17) PrivilegedRequest local17 = arg0.method5132();
		while (local17.status == 0) {
			Static231.sleepPrecise(10L);
		}
		if (local17.status == 2) {
			return new DisplayMode[0];
		}
		@Pc(39) int[] local39 = (int[]) local17.result;
		@Pc(45) DisplayMode[] local45 = new DisplayMode[local39.length >> 2];
		for (@Pc(47) int local47 = 0; local47 < local45.length; local47++) {
			@Pc(59) DisplayMode local59 = new DisplayMode();
			local45[local47] = local59;
			local59.anInt4248 = local39[local47 << 2];
			local59.anInt4250 = local39[(local47 << 2) + 1];
			local59.anInt4251 = local39[(local47 << 2) + 2];
			local59.anInt4249 = local39[(local47 << 2) + 3];
		}
		return local45;
	}

}
