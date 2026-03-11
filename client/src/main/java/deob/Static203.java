package deob;

import com.jagex.signlink.FileOnDisk;
import com.jagex.signlink.PrivilegedRequest;
import com.jagex.signlink.SignLink;
import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "com.jagex3.client.client!qh", name = "a", descriptor = "Lclient!se;")
	public static MapElementList aMapElementList_1;

	@OriginalMember(owner = "com.jagex3.client.client!qh", name = "d", descriptor = "Lclient!fd;")
	public static WorldMapFont aClass41_8;

	@OriginalMember(owner = "com.jagex3.client.client!qh", name = "e", descriptor = "[Lclient!ee;")
	public static WorldInfo[] aWorldInfoArray1;

    @OriginalMember(owner = "com.jagex3.client.client!qh", name = "c", descriptor = "Lclient!na;")
	public static final JagString aClass100_893 = Static28.parse("Memory before cleanup=");

	@OriginalMember(owner = "com.jagex3.client.client!qh", name = "i", descriptor = "Lclient!na;")
	public static final JagString aClass100_894 = Static28.parse("Mem:");

    @OriginalMember(owner = "com.jagex3.client.client!qh", name = "a", descriptor = "(Lsignlink!ll;B)V")
	public static void method3663(@OriginalArg(0) SignLink arg0) {
		@Pc(11) FileOnDisk local11 = null;
		try {
			@Pc(16) PrivilegedRequest local16 = arg0.method5112("runescape");
			while (local16.status == 0) {
				Static231.sleepPrecise(1L);
			}
			if (local16.status == 1) {
				local11 = (FileOnDisk) local16.result;
				@Pc(39) Packet local39 = Static48.method1196();
				local11.method5134(local39.data, local39.pos, 0);
			}
		} catch (@Pc(49) Exception local49) {
		}
		try {
			if (local11 != null) {
				local11.method5136();
			}
		} catch (@Pc(56) Exception local56) {
		}
	}
}
