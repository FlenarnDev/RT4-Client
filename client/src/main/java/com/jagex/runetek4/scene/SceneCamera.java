package com.jagex.runetek4.scene;

import com.jagex.runetek4.*;
import com.jagex.runetek4.cache.def.ItemDefinition;
import com.jagex.runetek4.media.renderable.actor.Player;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class SceneCamera {
    @OriginalMember(owner = "runetek4.client!gn", name = "b", descriptor = "(B)V")
    public static void setMaxSurroundingTerrainHeight() {
        if (Static72.orbitCameraPitch < 128) {
            Static72.orbitCameraPitch = 128;
        }
        if (Static72.orbitCameraPitch > 383) {
            Static72.orbitCameraPitch = 383;
        }
        Static57.orbitCameraYaw &= 0x7FF;
        @Pc(33) int local33 = com.jagex.runetek4.cache.def.ItemDefinition.anInt2223 >> 7;
        @Pc(37) int local37 = Static111.anInt2900 >> 7;
        @Pc(43) int local43 = Static207.getHeightmapY(Player.plane, ItemDefinition.anInt2223, Static111.anInt2900);
        @Pc(45) int local45 = 0;
        @Pc(64) int local64;
        if (local33 > 3 && local37 > 3 && local33 < 100 && local37 < 100) {
            for (local64 = local33 - 4; local64 <= local33 + 4; local64++) {
                for (@Pc(73) int local73 = local37 - 4; local73 <= local37 + 4; local73++) {
                    @Pc(80) int local80 = Player.plane;
                    if (local80 < 3 && (Static12.aByteArrayArrayArray2[1][local64][local73] & 0x2) == 2) {
                        local80++;
                    }
                    @Pc(117) int local117 = (Static232.aByteArrayArrayArray13[local80][local64][local73] & 0xFF) * 8 + local43 - SceneGraph.tileHeights[local80][local64][local73];
                    if (local117 > local45) {
                        local45 = local117;
                    }
                }
            }
        }
        local64 = local45 * 192;
        if (local64 > 98048) {
            local64 = 98048;
        }
        if (local64 < 32768) {
            local64 = 32768;
        }
        if (Static234.cameraPitchClamp < local64) {
            Static234.cameraPitchClamp += (local64 - Static234.cameraPitchClamp) / 24;
        } else if (local64 < Static234.cameraPitchClamp) {
            Static234.cameraPitchClamp += (local64 - Static234.cameraPitchClamp) / 80;
        }
    }
}
