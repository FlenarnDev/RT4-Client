package com.jagex3;

import deob.Static20;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex3.client.client!qe")
public final class ClientInvCache extends Linkable {

	@OriginalMember(owner = "com.jagex3.client.client!qe", name = "p", descriptor = "[I")
	public int[] anIntArray420 = new int[] { -1 };

	@OriginalMember(owner = "com.jagex3.client.client!qe", name = "u", descriptor = "[I")
	public int[] anIntArray422 = new int[] { 0 };

    @OriginalMember(owner = "com.jagex3.client.client!bc", name = "d", descriptor = "(II)V")
    public static void delete(@OriginalArg(0) int arg0) {
        @Pc(14) ClientInvCache local14 = (ClientInvCache) Static20.aClass133_2.find((long) arg0);
        if (local14 != null) {
            local14.unlink();
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!wl", name = "a", descriptor = "(IIIIB)V")
    public static void set(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        @Pc(12) ClientInvCache local12 = (ClientInvCache) Static20.aClass133_2.find((long) arg3);
        if (local12 == null) {
            local12 = new ClientInvCache();
            Static20.aClass133_2.put(local12, (long) arg3);
        }
        if (arg1 >= local12.anIntArray420.length) {
            @Pc(39) int[] local39 = new int[arg1 + 1];
            @Pc(44) int[] local44 = new int[arg1 + 1];
            @Pc(46) int local46;
            for (local46 = 0; local46 < local12.anIntArray420.length; local46++) {
                local39[local46] = local12.anIntArray420[local46];
                local44[local46] = local12.anIntArray422[local46];
            }
            for (local46 = local12.anIntArray420.length; local46 < arg1; local46++) {
                local39[local46] = -1;
                local44[local46] = 0;
            }
            local12.anIntArray420 = local39;
            local12.anIntArray422 = local44;
        }
        local12.anIntArray420[arg1] = arg0;
        local12.anIntArray422[arg1] = arg2;
    }

    @OriginalMember(owner = "com.jagex3.client.client!hn", name = "f", descriptor = "(B)V")
    public static void deleteAll() {
        Static20.aClass133_2 = new HashTable(32);
    }
}
