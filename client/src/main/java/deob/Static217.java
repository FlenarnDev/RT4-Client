package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "com.jagex3.client.client!rj", name = "R", descriptor = "I")
	public static int anInt4903;

    @OriginalMember(owner = "com.jagex3.client.client!rj", name = "P", descriptor = "I")
	public static int anInt4901 = -1;

	@OriginalMember(owner = "com.jagex3.client.client!rj", name = "U", descriptor = "Lclient!ih;")
	public static final LinkList aClass69_116 = new LinkList();

	@OriginalMember(owner = "com.jagex3.client.client!rj", name = "Z", descriptor = "[I")
	public static final int[] anIntArray434 = new int[64];

	@OriginalMember(owner = "com.jagex3.client.client!rj", name = "ab", descriptor = "Lclient!na;")
	public static final JagString aClass100_916 = Static28.parse(":clanreq:");

    @OriginalMember(owner = "com.jagex3.client.client!rj", name = "a", descriptor = "([Lclient!mj;I[BIIIIZIIB)V")
	public static void method3771(@OriginalArg(0) CollisionMap[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = -1;
		@Pc(12) Packet local12 = new Packet(arg2);
		while (true) {
			@Pc(20) int local20 = local12.gVarSmart();
			if (local20 == 0) {
				return;
			}
			local7 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local12.gsmart();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(50) int local50 = local31 & 0x3F;
				@Pc(56) int local56 = local31 >> 6 & 0x3F;
				@Pc(60) int local60 = local31 >> 12;
				@Pc(64) int local64 = local12.g1();
				@Pc(68) int local68 = local64 >> 2;
				@Pc(72) int local72 = local64 & 0x3;
				if (arg3 == local60 && local56 >= arg8 && local56 < arg8 + 8 && arg9 <= local50 && arg9 + 8 > local50) {
					@Pc(103) LocType local103 = LocType.list(local7);
					@Pc(120) int local120 = Static52.method1286(local50 & 0x7, arg4, local72, local103.anInt4403, local103.anInt4397, local56 & 0x7) + arg5;
					@Pc(137) int local137 = Static241.method4541(local103.anInt4397, arg4, local103.anInt4403, local56 & 0x7, local72, local50 & 0x7) + arg6;
					if (local120 > 0 && local137 > 0 && local120 < 103 && local137 < 103) {
						@Pc(154) CollisionMap local154 = null;
						if (!arg7) {
							@Pc(159) int local159 = arg1;
							if ((ClientBuild.mapl[1][local120][local137] & 0x2) == 2) {
								local159 = arg1 - 1;
							}
							if (local159 >= 0) {
								local154 = arg0[local159];
							}
						}
						ClientBuild.method3397(arg1, !arg7, arg1, arg7, local154, local7, local68, local120, local137, local72 + arg4 & 0x3);
					}
				}
			}
		}
	}
}
