package runetek4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import runetek4.game.client.ClientInvCache;

public final class Static178 {

	@OriginalMember(owner = "runetek4.client!od", name = "f", descriptor = "Lclient!jd;")
	public static MouseRecorder instance;

	@OriginalMember(owner = "runetek4.client!od", name = "c", descriptor = "Z")
	public static boolean highDetailLighting = true;

	@OriginalMember(owner = "runetek4.client!od", name = "e", descriptor = "I")
	public static int anInt4246 = 0;

	@OriginalMember(owner = "runetek4.client!od", name = "g", descriptor = "S")
	public static short aShort25 = 256;

	@OriginalMember(owner = "runetek4.client!od", name = "i", descriptor = "I")
	public static int anInt4247 = 0;

	@OriginalMember(owner = "runetek4.client!od", name = "n", descriptor = "Z")
	public static boolean aBoolean203 = false;

	@OriginalMember(owner = "runetek4.client!od", name = "a", descriptor = "(ILclient!na;)V")
	public static void method3318(@OriginalArg(1) JagString arg0) {
		if (Static199.aClass3_Sub22Array1 == null) {
			return;
		}
		@Pc(22) long local22 = arg0.encode37();
		@Pc(24) int local24 = 0;
		if (local22 == 0L) {
			return;
		}
		while (Static199.aClass3_Sub22Array1.length > local24 && Static199.aClass3_Sub22Array1[local24].nodeId != local22) {
			local24++;
		}
		if (local24 < Static199.aClass3_Sub22Array1.length && Static199.aClass3_Sub22Array1[local24] != null) {
			Static6.outboundBuffer.p1isaac(162);
			Static6.outboundBuffer.p8(Static199.aClass3_Sub22Array1[local24].nodeId);
		}
	}

	@OriginalMember(owner = "runetek4.client!od", name = "a", descriptor = "(IZII)I")
	public static int method3319(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) ClientInvCache local19 = (ClientInvCache) Static20.aClass133_2.getNode((long) arg1);
		if (local19 == null) {
			return 0;
		}
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local19.invSlotObjId.length; local29++) {
			if (local19.invSlotObjId[local29] >= 0 && Static170.anInt3245 > local19.invSlotObjId[local29]) {
				@Pc(56) ObjType local56 = Static71.method1439(local19.invSlotObjId[local29]);
				if (local56.aClass133_6 != null) {
					@Pc(68) IntNode local68 = (IntNode) local56.aClass133_6.getNode((long) arg2);
					if (local68 != null) {
						if (arg0) {
							local27 += local19.invSlotObjCount[local29] * local68.anInt3141;
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
