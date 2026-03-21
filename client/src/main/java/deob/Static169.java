package deob;

import java.awt.Frame;

import com.jagex.signlink.PrivilegedRequest;
import com.jagex.signlink.SignLink;
import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "com.jagex3.client.client!nf", name = "c", descriptor = "[S")
	public static short[] aShortArray52;

	@OriginalMember(owner = "com.jagex3.client.client!nf", name = "d", descriptor = "Lclient!fd;")
	public static WorldMapFont aClass41_5;

	@OriginalMember(owner = "com.jagex3.client.client!nf", name = "e", descriptor = "I")
	public static int anInt4073;

    @OriginalMember(owner = "com.jagex3.client.client!nf", name = "f", descriptor = "Lclient!n;")
	public static final SoftLruCache aClass99_24 = new SoftLruCache(500);

	@OriginalMember(owner = "com.jagex3.client.client!nf", name = "i", descriptor = "I")
	public static int anInt4075 = -1;

    @OriginalMember(owner = "com.jagex3.client.client!nf", name = "a", descriptor = "(IIIIILsignlink!ll;)Ljava/awt/Frame;")
	public static Frame method3176(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) SignLink arg3) {
		if (!arg3.method5111()) {
			return null;
		}
		@Pc(20) DisplayMode[] local20 = Static197.method3558(arg3);
		if (local20 == null) {
			return null;
		}
		@Pc(27) boolean local27 = false;
		for (@Pc(29) int local29 = 0; local29 < local20.length; local29++) {
			if (arg2 == local20[local29].anInt4248 && arg1 == local20[local29].anInt4250 && (!local27 || local20[local29].anInt4251 > arg0)) {
				arg0 = local20[local29].anInt4251;
				local27 = true;
			}
		}
		if (!local27) {
			return null;
		}
		@Pc(90) PrivilegedRequest local90 = arg3.method5129(arg0, arg1, arg2);
		while (local90.status == 0) {
			Static231.sleepPrecise(10L);
		}
		@Pc(103) Frame local103 = (Frame) local90.result;
		if (local103 == null) {
			return null;
		} else if (local90.status == 2) {
			Static25.method714(local103, arg3);
			return null;
		} else {
			return local103;
		}
	}

}
