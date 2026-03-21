package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

    @OriginalMember(owner = "com.jagex3.client.client!v", name = "a", descriptor = "Lclient!na;")
	public static final JagString aClass100_98 = Static28.parse(")4a=");

	@OriginalMember(owner = "com.jagex3.client.client!v", name = "c", descriptor = "[F")
	public static final float[] aFloatArray2 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

	@OriginalMember(owner = "com.jagex3.client.client!v", name = "d", descriptor = "Lclient!na;")
	public static final JagString aClass100_99 = Static28.parse("::clientdrop");

	@OriginalMember(owner = "com.jagex3.client.client!v", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Square local7 = World.activeTiles[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.wall != null && local7.wall.aLong107 == arg3) {
			return true;
		} else if (local7.aClass24_1 != null && local7.aClass24_1.aLong52 == arg3) {
			return true;
		} else if (local7.aClass15_1 != null && local7.aClass15_1.aLong26 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.spriteCount; local46++) {
				if (local7.sprites[local46].typecode == arg3) {
					return true;
				}
			}
			return false;
		}
	}

}
