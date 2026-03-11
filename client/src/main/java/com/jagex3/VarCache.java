package com.jagex3;

import com.jagex.signlink.MonotonicClock;
import deob.Static125;
import deob.Static199;
import deob.VarBitType;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class VarCache {
    @OriginalMember(owner = "com.jagex3.client.client!ah", name = "j", descriptor = "[I")
    public static final int[] var = new int[2500];
    @OriginalMember(owner = "com.jagex3.client.client!ic", name = "e", descriptor = "[I")
    public static final int[] varServ = new int[2500];

    @OriginalMember(owner = "com.jagex3.client.client!nh", name = "a", descriptor = "(BII)V")
    public static void method2575(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
        varServ[arg1] = arg0;
        @Pc(20) LongNode local20 = (LongNode) Static199.aClass133_20.find((long) arg1);
        if (local20 == null) {
            local20 = new LongNode(4611686018427387905L);
            Static199.aClass133_20.put(local20, (long) arg1);
        } else if (local20.aLong55 != 4611686018427387905L) {
            local20.aLong55 = MonotonicClock.currentTime() + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!wd", name = "a", descriptor = "(BII)V")
    public static void method3995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
        @Pc(14) VarBitType local14 = Static125.method2449(arg1);
        @Pc(17) int local17 = local14.anInt3327;
        @Pc(20) int local20 = local14.anInt3323;
        @Pc(23) int local23 = local14.anInt3318;
        @Pc(29) int local29 = ByteArrayNode.anIntArray135[local20 - local23];
        if (arg0 < 0 || local29 < arg0) {
            arg0 = 0;
        }
        local29 <<= local23;
        method2575(arg0 << local23 & local29 | ~local29 & varServ[local17], local17);
    }

    @OriginalMember(owner = "com.jagex3.client.client!me", name = "a", descriptor = "(II)I")
    public static int getVarbit(@OriginalArg(1) int arg0) {
        @Pc(13) VarBitType local13 = Static125.method2449(arg0);
        @Pc(16) int local16 = local13.anInt3327;
        @Pc(19) int local19 = local13.anInt3323;
        @Pc(22) int local22 = local13.anInt3318;
        @Pc(29) int local29 = ByteArrayNode.anIntArray135[local19 - local22];
        return var[local16] >> local22 & local29;
    }
}
