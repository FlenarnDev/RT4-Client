package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "com.jagex3.client.client!vf", name = "c", descriptor = "I")
	public static int anInt5752;

    @OriginalMember(owner = "com.jagex3.client.client!vf", name = "a", descriptor = "Lclient!n;")
	public static final SoftLruCache aClass99_34 = new SoftLruCache(64);

	@OriginalMember(owner = "com.jagex3.client.client!vf", name = "g", descriptor = "[I")
	public static final int[] anIntArray515 = new int[14];

	@OriginalMember(owner = "com.jagex3.client.client!vf", name = "k", descriptor = "Lclient!n;")
	public static final SoftLruCache aClass99_35 = new SoftLruCache(5);

	@OriginalMember(owner = "com.jagex3.client.client!vf", name = "l", descriptor = "Lclient!n;")
	public static final SoftLruCache aClass99_36 = new SoftLruCache(50);

	@OriginalMember(owner = "com.jagex3.client.client!vf", name = "m", descriptor = "I")
	public static int anInt5754 = -1;

	@OriginalMember(owner = "com.jagex3.client.client!vf", name = "a", descriptor = "(IIIILclient!th;Lclient!th;IIJ)V")
	public static void method4508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) ModelSource arg4, @OriginalArg(5) ModelSource arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Wall local8 = new Wall();
		local8.aLong107 = arg8;
		local8.anInt3048 = arg1 * 128 + 64;
		local8.anInt3044 = arg2 * 128 + 64;
		local8.anInt3051 = arg3;
		local8.aClass8_5 = arg4;
		local8.aClass8_6 = arg5;
		local8.anInt3049 = arg6;
		local8.anInt3052 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (World.activeTiles[local42][arg1][arg2] == null) {
				World.activeTiles[local42][arg1][arg2] = new Square(local42, arg1, arg2);
			}
		}
		World.activeTiles[arg0][arg1][arg2].wall = local8;
	}

}
