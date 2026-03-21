package deob;

import com.jagex3.Pix2D;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "com.jagex3.client.client!kb", name = "a", descriptor = "I")
	public static int anInt3144;

	@OriginalMember(owner = "com.jagex3.client.client!kb", name = "c", descriptor = "I")
	public static int anInt3146;

	@OriginalMember(owner = "com.jagex3.client.client!kb", name = "f", descriptor = "[I")
	public static int[] anIntArray295;

	@OriginalMember(owner = "com.jagex3.client.client!kb", name = "g", descriptor = "[I")
	public static int[] anIntArray296;

	@OriginalMember(owner = "com.jagex3.client.client!kb", name = "i", descriptor = "[I")
	public static int[] anIntArray297;

	@OriginalMember(owner = "com.jagex3.client.client!kb", name = "b", descriptor = "I")
	public static int anInt3145 = 0;

    @OriginalMember(owner = "com.jagex3.client.client!kb", name = "e", descriptor = "I")
	public static int anInt3148 = 0;

    @OriginalMember(owner = "com.jagex3.client.client!kb", name = "a", descriptor = "(III)V")
	private static void method2485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= anInt3145 && arg1 >= Pix2D.anInt3147 && arg0 < anInt3148 && arg1 < Pix2D.anInt3149) {
			anIntArray297[arg0 + arg1 * anInt3144] = 16776960;
		}
	}

    @OriginalMember(owner = "com.jagex3.client.client!kb", name = "a", descriptor = "([I)V")
	public static void method2488(@OriginalArg(0) int[] arg0) {
		anInt3145 = arg0[0];
		Pix2D.anInt3147 = arg0[1];
		anInt3148 = arg0[2];
		Pix2D.anInt3149 = arg0[3];
		Pix2D.method2482();
	}

	@OriginalMember(owner = "com.jagex3.client.client!kb", name = "a", descriptor = "(IIII)V")
	public static void method2489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < Pix2D.anInt3147 || arg1 >= Pix2D.anInt3149) {
			return;
		}
		if (arg0 < anInt3145) {
			arg2 -= anInt3145 - arg0;
			arg0 = anInt3145;
		}
		if (arg0 + arg2 > anInt3148) {
			arg2 = anInt3148 - arg0;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt3144;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray297[local32 + local34] = arg3;
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!kb", name = "b", descriptor = "(IIII)V")
	public static void method2490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < anInt3145 || arg0 >= anInt3148) {
			return;
		}
		if (arg1 < Pix2D.anInt3147) {
			arg2 -= Pix2D.anInt3147 - arg1;
			arg1 = Pix2D.anInt3147;
		}
		if (arg1 + arg2 > Pix2D.anInt3149) {
			arg2 = Pix2D.anInt3149 - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt3144;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray297[local32 + local34 * anInt3144] = arg3;
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!kb", name = "a", descriptor = "([III)V")
	public static void method2491(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anIntArray297 = arg0;
		anInt3144 = arg1;
		anInt3146 = arg2;
		Pix2D.method2496(0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "com.jagex3.client.client!kb", name = "b", descriptor = "()V")
	public static void method2492() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = anInt3144 * anInt3146 - 7;
		while (local1 < local7) {
			anIntArray297[local1++] = 0;
			anIntArray297[local1++] = 0;
			anIntArray297[local1++] = 0;
			anIntArray297[local1++] = 0;
			anIntArray297[local1++] = 0;
			anIntArray297[local1++] = 0;
			anIntArray297[local1++] = 0;
			anIntArray297[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			anIntArray297[local1++] = 0;
		}
	}

    @OriginalMember(owner = "com.jagex3.client.client!kb", name = "b", descriptor = "([I)V")
	public static void method2497(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt3145;
		arg0[1] = Pix2D.anInt3147;
		arg0[2] = anInt3148;
		arg0[3] = Pix2D.anInt3149;
	}

    @OriginalMember(owner = "com.jagex3.client.client!kb", name = "e", descriptor = "(IIII)V")
	private static void method2501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			method2485(arg0, arg1);
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(15) int local15 = arg1 - arg2;
		if (local15 < Pix2D.anInt3147) {
			local15 = Pix2D.anInt3147;
		}
		@Pc(26) int local26 = arg1 + arg2 + 1;
		if (local26 > Pix2D.anInt3149) {
			local26 = Pix2D.anInt3149;
		}
		@Pc(33) int local33 = local15;
		@Pc(37) int local37 = arg2 * arg2;
		@Pc(39) int local39 = 0;
		@Pc(43) int local43 = arg1 - local15;
		@Pc(47) int local47 = local43 * local43;
		@Pc(51) int local51 = local47 - local43;
		if (arg1 > local26) {
			arg1 = local26;
		}
		@Pc(85) int local85;
		@Pc(94) int local94;
		@Pc(105) int local105;
		@Pc(107) int local107;
		while (local33 < arg1) {
			while (local51 <= local37 || local47 <= local37) {
				local47 += local39 + local39;
				local51 += local39++ + local39;
			}
			local85 = arg0 + 1 - local39;
			if (local85 < anInt3145) {
				local85 = anInt3145;
			}
			local94 = arg0 + local39;
			if (local94 > anInt3148) {
				local94 = anInt3148;
			}
			local105 = local85 + local33 * anInt3144;
			for (local107 = local85; local107 < local94; local107++) {
				anIntArray297[local105++] = 16776960;
			}
			local33++;
			local47 -= local43-- + local43;
			local51 -= local43 + local43;
		}
		local39 = arg2;
		local43 = local33 - arg1;
		local51 = local43 * local43 + local37;
		local47 = local51 - arg2;
		local51 -= local43;
		while (local33 < local26) {
			while (local51 > local37 && local47 > local37) {
				local51 -= local39-- + local39;
				local47 -= local39 + local39;
			}
			local85 = arg0 - local39;
			if (local85 < anInt3145) {
				local85 = anInt3145;
			}
			local94 = arg0 + local39;
			if (local94 > anInt3148 - 1) {
				local94 = anInt3148 - 1;
			}
			local105 = local85 + local33 * anInt3144;
			for (local107 = local85; local107 <= local94; local107++) {
				anIntArray297[local105++] = 16776960;
			}
			local33++;
			local51 += local43 + local43;
			local47 += local43++ + local43;
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!kb", name = "f", descriptor = "(IIIII)V")
	public static void method2502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 == 0) {
			return;
		}
		if (arg3 == 256) {
			method2501(arg0, arg1, arg2);
			return;
		}
		@Pc(20) int local20 = 256 - arg3;
		@Pc(28) int local28 = arg3 * 255;
		@Pc(36) int local36 = arg3 * 255;
		@Pc(42) int local42 = arg3 * 0;
		@Pc(46) int local46 = arg1 - arg2;
		if (local46 < Pix2D.anInt3147) {
			local46 = Pix2D.anInt3147;
		}
		@Pc(57) int local57 = arg1 + arg2 + 1;
		if (local57 > Pix2D.anInt3149) {
			local57 = Pix2D.anInt3149;
		}
		@Pc(64) int local64 = local46;
		@Pc(68) int local68 = arg2 * arg2;
		@Pc(70) int local70 = 0;
		@Pc(74) int local74 = arg1 - local46;
		@Pc(78) int local78 = local74 * local74;
		@Pc(82) int local82 = local78 - local74;
		if (arg1 > local57) {
			arg1 = local57;
		}
		@Pc(151) int local151;
		@Pc(161) int local161;
		@Pc(169) int local169;
		@Pc(116) int local116;
		@Pc(125) int local125;
		@Pc(136) int local136;
		@Pc(138) int local138;
		@Pc(191) int local191;
		while (local64 < arg1) {
			while (local82 <= local68 || local78 <= local68) {
				local78 += local70 + local70;
				local82 += local70++ + local70;
			}
			local116 = arg0 + 1 - local70;
			if (local116 < anInt3145) {
				local116 = anInt3145;
			}
			local125 = arg0 + local70;
			if (local125 > anInt3148) {
				local125 = anInt3148;
			}
			local136 = local116 + local64 * anInt3144;
			for (local138 = local116; local138 < local125; local138++) {
				local151 = (anIntArray297[local136] >> 16 & 0xFF) * local20;
				local161 = (anIntArray297[local136] >> 8 & 0xFF) * local20;
				local169 = (anIntArray297[local136] & 0xFF) * local20;
				local191 = (local28 + local151 >> 8 << 16) + (local36 + local161 >> 8 << 8) + (local42 + local169 >> 8);
				anIntArray297[local136++] = local191;
			}
			local64++;
			local78 -= local74-- + local74;
			local82 -= local74 + local74;
		}
		local70 = arg2;
		local74 = -local74;
		local82 = local74 * local74 + local68;
		local78 = local82 - arg2;
		local82 -= local74;
		while (local64 < local57) {
			while (local82 > local68 && local78 > local68) {
				local82 -= local70-- + local70;
				local78 -= local70 + local70;
			}
			local116 = arg0 - local70;
			if (local116 < anInt3145) {
				local116 = anInt3145;
			}
			local125 = arg0 + local70;
			if (local125 > anInt3148 - 1) {
				local125 = anInt3148 - 1;
			}
			local136 = local116 + local64 * anInt3144;
			for (local138 = local116; local138 <= local125; local138++) {
				local151 = (anIntArray297[local136] >> 16 & 0xFF) * local20;
				local161 = (anIntArray297[local136] >> 8 & 0xFF) * local20;
				local169 = (anIntArray297[local136] & 0xFF) * local20;
				local191 = (local28 + local151 >> 8 << 16) + (local36 + local161 >> 8 << 8) + (local42 + local169 >> 8);
				anIntArray297[local136++] = local191;
			}
			local64++;
			local82 += local74 + local74;
			local78 += local74++ + local74;
		}
	}

}
