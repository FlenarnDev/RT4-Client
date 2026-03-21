package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "com.jagex3.client.client!wh", name = "c", descriptor = "[[[Lclient!bj;")
	public static Square[][][] aClass3_Sub5ArrayArrayArray3;

	@OriginalMember(owner = "com.jagex3.client.client!wh", name = "l", descriptor = "[Lclient!qf;")
	public static AbstractPix32[] aClass3_Sub2_Sub1Array11;

    @OriginalMember(owner = "com.jagex3.client.client!wh", name = "j", descriptor = "[Lclient!cl;")
	public static final AnimFrameset[] aClass3_Sub2_Sub7Array8 = new AnimFrameset[14];

	@OriginalMember(owner = "com.jagex3.client.client!wh", name = "m", descriptor = "[I")
	public static final int[] anIntArray564 = new int[5];

	@OriginalMember(owner = "com.jagex3.client.client!wh", name = "n", descriptor = "Lclient!na;")
	public static final JagString aClass100_1095 = Static28.parse("; version=1; path=)4; domain=");

	@OriginalMember(owner = "com.jagex3.client.client!wh", name = "o", descriptor = "Lclient!na;")
	public static final JagString aClass100_1096 = Static28.parse("rect_debug=");

    @OriginalMember(owner = "com.jagex3.client.client!wh", name = "a", descriptor = "(IIII)Z")
	public static boolean method4611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static9.method187(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static256.method4394(local10 + 1, World.groundh[arg0][arg1][arg2] + arg3, local14 + 1) && Static256.method4394(local10 + 128 - 1, World.groundh[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static256.method4394(local10 + 128 - 1, World.groundh[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static256.method4394(local10 + 1, World.groundh[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

    @OriginalMember(owner = "com.jagex3.client.client!wh", name = "b", descriptor = "(B)Lclient!ok;")
	public static Pix8 method4614() {
		@Pc(27) Pix8 local27;
		if (GlRenderer.enabled) {
			local27 = new GlPix8(Static124.anInt3080, Static227.anInt5091, Static274.anIntArray440[0], Static269.anIntArray252[0], Static254.anIntArray488[0], Static26.anIntArray66[0], Static7.aByteArrayArray5[0], Static259.anIntArray513);
		} else {
			local27 = new SoftwarePix8(Static124.anInt3080, Static227.anInt5091, Static274.anIntArray440[0], Static269.anIntArray252[0], Static254.anIntArray488[0], Static26.anIntArray66[0], Static7.aByteArrayArray5[0], Static259.anIntArray513);
		}
		Static75.method1631();
		return local27;
	}

}
