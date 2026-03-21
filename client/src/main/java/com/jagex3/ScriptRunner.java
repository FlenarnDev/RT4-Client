package com.jagex3;

import deob.Static88;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class ScriptRunner {
    @OriginalMember(owner = "com.jagex3.client.client!gi", name = "a", descriptor = "(ILclient!jl;)V")
    public static void executeScript(@OriginalArg(1) HookRequest arg0) {
        Static88.method1818(200000, arg0);
    }

    @OriginalMember(owner = "com.jagex3.client.client!fn", name = "c", descriptor = "(II)V")
    public static void method1626(@OriginalArg(0) int arg0) {
        if (arg0 == -1 || !IfType.openInterface(arg0)) {
            return;
        }
        @Pc(31) IfType[] local31 = IfType.list[arg0];
        for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
            @Pc(41) IfType local41 = local31[local33];
            if (local41.anObjectArray3 != null) {
                @Pc(50) HookRequest local50 = new HookRequest();
                local50.onop = local41.anObjectArray3;
                local50.component = local41;
                Static88.method1818(2000000, local50);
            }
        }
    }
}
