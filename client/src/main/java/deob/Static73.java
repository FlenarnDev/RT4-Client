package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "com.jagex3.client.client!fm", name = "V", descriptor = "I")
	public static int anInt2077;

	@OriginalMember(owner = "com.jagex3.client.client!fm", name = "S", descriptor = "Lclient!n;")
	public static final SoftLruCache aClass99_10 = new SoftLruCache(4);

	@OriginalMember(owner = "com.jagex3.client.client!fm", name = "W", descriptor = "Lclient!na;")
	public static final JagString aClass100_453 = Static28.parse(")2");

	@OriginalMember(owner = "com.jagex3.client.client!fm", name = "db", descriptor = "Lclient!gn;")
	public static final LruCache aClass54_7 = new LruCache(64);

	@OriginalMember(owner = "com.jagex3.client.client!fm", name = "eb", descriptor = "Lclient!na;")
	public static final JagString aClass100_454 = Static28.parse("b12_full");

	@OriginalMember(owner = "com.jagex3.client.client!fm", name = "fb", descriptor = "[I")
	public static final int[] anIntArray183 = new int[14];

	@OriginalMember(owner = "com.jagex3.client.client!fm", name = "gb", descriptor = "Lclient!na;")
	public static final JagString aClass100_455 = Static28.parse("overlay2");

    @OriginalMember(owner = "com.jagex3.client.client!fm", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static140.anIntArrayArrayArray12[arg0][local16][local20] == -Static13.anInt437) {
						return false;
					}
				}
			}
			local16 = (arg1 << 7) + 1;
			local20 = (arg3 << 7) + 2;
			@Pc(156) int local156 = World.groundh[arg0][arg1][arg3] + arg5;
			if (!Static256.method4394(local16, local156, local20)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static256.method4394(local169, local156, local20)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static256.method4394(local16, local156, local182)) {
				return false;
			} else if (Static256.method4394(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static9.method187(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static256.method4394(local16 + 1, World.groundh[arg0][arg1][arg3] + arg5, local20 + 1) && Static256.method4394(local16 + 128 - 1, World.groundh[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static256.method4394(local16 + 128 - 1, World.groundh[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static256.method4394(local16 + 1, World.groundh[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}
}
