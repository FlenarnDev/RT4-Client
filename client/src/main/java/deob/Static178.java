package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

    @OriginalMember(owner = "com.jagex3.client.client!od", name = "c", descriptor = "Z")
	public static boolean highDetailLighting = true;

    @OriginalMember(owner = "com.jagex3.client.client!od", name = "g", descriptor = "S")
	public static short aShort25 = 256;

    @OriginalMember(owner = "com.jagex3.client.client!od", name = "a", descriptor = "(IZII)I")
	public static int method3319(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) ClientInvCache local19 = (ClientInvCache) Static20.aClass133_2.find((long) arg1);
		if (local19 == null) {
			return 0;
		}
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local19.anIntArray420.length; local29++) {
			if (local19.anIntArray420[local29] >= 0 && ObjType.anInt3245 > local19.anIntArray420[local29]) {
				@Pc(56) ObjType local56 = ObjType.list(local19.anIntArray420[local29]);
				if (local56.aClass133_6 != null) {
					@Pc(68) IntNode local68 = (IntNode) local56.aClass133_6.find((long) arg2);
					if (local68 != null) {
						if (arg0) {
							local27 += local19.anIntArray422[local29] * local68.anInt3141;
						} else {
							local27 += local68.anInt3141;
						}
					}
				}
			}
		}
		return local27;
	}
}
