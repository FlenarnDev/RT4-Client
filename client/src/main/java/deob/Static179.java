package deob;

import com.jagex3.SoftLruCache;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static179 {

    @OriginalMember(owner = "com.jagex3.client.client!oe", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray33 = new int[5][5000];

	@OriginalMember(owner = "com.jagex3.client.client!oe", name = "j", descriptor = "Lclient!n;")
	public static final SoftLruCache aClass99_25 = new SoftLruCache(64);

    @OriginalMember(owner = "com.jagex3.client.client!oe", name = "a", descriptor = "(IZ)I")
	public static int method3322(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

}
