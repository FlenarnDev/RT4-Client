package com.jagex.runetek4;

import com.jagex.runetek4.core.io.Packet;

import com.jagex.runetek4.js5.Js5;

import com.jagex.runetek4.node.SoftLruHashTable;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class FloTypeList {
    @OriginalMember(owner = "client!t", name = "p", descriptor = "Lclient!n;")
    public static final SoftLruHashTable types = new SoftLruHashTable(64);

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int capacity;

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "Lclient!ve;")
    public static Js5 archive;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLclient!ve;)V")
    public static void init(@OriginalArg(1) Js5 js5) {
        archive = js5;
        capacity = archive.getGroupCapacity(4);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BI)Lclient!wl;")
    public static FloType method4395(@OriginalArg(1) int id) {
        @Pc(6) FloType type = (FloType) types.get(id);
        if (type != null) {
            return type;
        }
        @Pc(30) byte[] bytes = archive.getfile(4, id);
        type = new FloType();
        if (bytes != null) {
            type.decode(new Packet(bytes), id);
        }
        types.put(type, id);
        return type;
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)V")
    public static void removeSoft() {
        types.removeSoft();
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static void clear() {
        types.clean();
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(II)V")
    public static void clean() {
        types.clean(5);
    }
}
