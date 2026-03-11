package deob;

import com.jagex.signlink.MonotonicClock;
import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

    @OriginalMember(owner = "com.jagex3.client.client!k", name = "l", descriptor = "[I")
	public static int[] anIntArray292;

	@OriginalMember(owner = "com.jagex3.client.client!k", name = "c", descriptor = "Z")
	public static boolean aBoolean159 = false;

	@OriginalMember(owner = "com.jagex3.client.client!k", name = "i", descriptor = "I")
	public static int anInt3125 = 0;

	@OriginalMember(owner = "com.jagex3.client.client!k", name = "m", descriptor = "Z")
	public static boolean aBoolean160 = false;

	@OriginalMember(owner = "com.jagex3.client.client!k", name = "t", descriptor = "I")
	public static int anInt3132 = 0;

	@OriginalMember(owner = "com.jagex3.client.client!k", name = "a", descriptor = "(IIBLclient!ve;Lclient!ve;)Lclient!rk;")
	public static PixFontGeneric method2462(@OriginalArg(1) int arg0, @OriginalArg(3) Js5 arg1, @OriginalArg(4) Js5 arg2) {
		return Static234.method4016(arg1, 0, arg0) ? Static29.method799(arg2.method4495(arg0, 0)) : null;
	}

    @OriginalMember(owner = "com.jagex3.client.client!k", name = "a", descriptor = "(B)Lclient!da;")
	public static DelayedStateChange poll() {
		@Pc(10) DelayedStateChange local10 = (DelayedStateChange) Static215.aClass16_9.method795();
		if (local10 != null) {
			local10.unlink();
			local10.method4365();
			return local10;
		}
		do {
			local10 = (DelayedStateChange) Static140.aClass16_7.method795();
			if (local10 == null) {
				return null;
			}
			if (local10.method1009() > MonotonicClock.currentTime()) {
				return null;
			}
			local10.unlink();
			local10.method4365();
		} while ((Long.MIN_VALUE & local10.aLong185) == 0L);
		return local10;
	}

}
