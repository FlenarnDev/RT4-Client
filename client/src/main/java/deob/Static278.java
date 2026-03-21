package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "com.jagex3.client.client!wj", name = "b", descriptor = "Lclient!na;")
	public static final JagString aClass100_1101 = Static28.parse(" <col=ffff00>");

	@OriginalMember(owner = "com.jagex3.client.client!wj", name = "e", descriptor = "Lclient!na;")
	public static JagString mainLoadPrimaryText = null;

    @OriginalMember(owner = "com.jagex3.client.client!wj", name = "a", descriptor = "(IIIIIII)V")
	public static void method4647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Occlude local3 = new Occlude();
		local3.anInt4452 = arg1 / 128;
		local3.anInt4446 = arg2 / 128;
		local3.anInt4461 = arg3 / 128;
		local3.anInt4464 = arg4 / 128;
		local3.anInt4453 = arg0;
		local3.anInt4460 = arg1;
		local3.anInt4445 = arg2;
		local3.anInt4458 = arg3;
		local3.anInt4449 = arg4;
		local3.anInt4444 = arg5;
		local3.anInt4447 = arg6;
		Static91.aOccludeArray1[Static28.anInt917++] = local3;
	}

    @OriginalMember(owner = "com.jagex3.client.client!wj", name = "b", descriptor = "(I)V")
	public static void method4649() {
		Static125.aClass99_18.method3104();
	}

    @OriginalMember(owner = "com.jagex3.client.client!wj", name = "a", descriptor = "(IIZLclient!wa;IIBII)V")
	public static void method4651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Packet arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(32) int local32;
		if (arg5 < 0 || arg5 >= 104 || arg4 < 0 || arg4 >= 104) {
			while (true) {
				local32 = arg3.g1();
				if (local32 == 0) {
					break;
				}
				if (local32 == 1) {
					arg3.g1();
					break;
				}
				if (local32 <= 49) {
					arg3.g1();
				}
			}
			return;
		}
		if (!arg2) {
			ClientBuild.mapl[arg7][arg5][arg4] = 0;
		}
		while (true) {
			local32 = arg3.g1();
			if (local32 == 0) {
				if (arg2) {
					World.groundh[0][arg5][arg4] = Static107.anIntArrayArrayArray10[0][arg5][arg4];
				} else if (arg7 == 0) {
					World.groundh[0][arg5][arg4] = -Static65.method1498(arg4 + arg1 + 556238, arg0 + arg5 + 932731) * 8;
				} else {
					World.groundh[arg7][arg5][arg4] = World.groundh[arg7 - 1][arg5][arg4] - 240;
				}
				break;
			}
			if (local32 == 1) {
				@Pc(111) int local111 = arg3.g1();
				if (arg2) {
					World.groundh[0][arg5][arg4] = Static107.anIntArrayArrayArray10[0][arg5][arg4] + local111 * 8;
				} else {
					if (local111 == 1) {
						local111 = 0;
					}
					if (arg7 == 0) {
						World.groundh[0][arg5][arg4] = -local111 * 8;
					} else {
						World.groundh[arg7][arg5][arg4] = World.groundh[arg7 - 1][arg5][arg4] - local111 * 8;
					}
				}
				break;
			}
			if (local32 <= 49) {
				Static240.aByteArrayArrayArray14[arg7][arg5][arg4] = arg3.g1b();
				Static163.aByteArrayArrayArray11[arg7][arg5][arg4] = (byte) ((local32 - 2) / 4);
				Static4.aByteArrayArrayArray1[arg7][arg5][arg4] = (byte) (local32 + arg6 - 2 & 0x3);
			} else if (local32 > 81) {
				Static253.aByteArrayArrayArray16[arg7][arg5][arg4] = (byte) (local32 - 81);
			} else if (!arg2) {
				ClientBuild.mapl[arg7][arg5][arg4] = (byte) (local32 - 49);
			}
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!wj", name = "a", descriptor = "(BII)I")
	public static int method4652(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) ClientInvCache local8 = (ClientInvCache) Static20.aClass133_2.find((long) arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = 0; local27 < local8.anIntArray422.length; local27++) {
				if (arg1 == local8.anIntArray420[local27]) {
					local25 += local8.anIntArray422[local27];
				}
			}
			return local25;
		}
	}

}
