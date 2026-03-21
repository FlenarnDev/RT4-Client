package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

    @OriginalMember(owner = "com.jagex3.client.client!rm", name = "d", descriptor = "Lclient!n;")
	public static final SoftLruCache aClass99_28 = new SoftLruCache(64);

	@OriginalMember(owner = "com.jagex3.client.client!rm", name = "g", descriptor = "Z")
	public static boolean aBoolean244 = true;

	@OriginalMember(owner = "com.jagex3.client.client!rm", name = "i", descriptor = "Lclient!na;")
	public static final JagString aClass100_930 = Static28.parse("(Z");

    @OriginalMember(owner = "com.jagex3.client.client!rm", name = "a", descriptor = "(JB)V")
	public static void method3799(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}

    @OriginalMember(owner = "com.jagex3.client.client!rm", name = "a", descriptor = "(III)V")
	public static void method3801() {
		for (@Pc(1) int local1 = 0; local1 < Static126.anInt3114; local1++) {
			for (@Pc(6) int local6 = 0; local6 < Static152.anInt3594; local6++) {
				for (@Pc(11) int local11 = 0; local11 < Static99.anInt2550; local11++) {
					@Pc(22) Square local22 = World.activeTiles[local1][local6][local11];
					if (local22 != null) {
						@Pc(27) Wall local27 = local22.wall;
						if (local27 != null && local27.aClass8_5.method4543()) {
							Static69.method1544(local27.aClass8_5, local1, local6, local11, 1, 1);
							if (local27.aClass8_6 != null && local27.aClass8_6.method4543()) {
								Static69.method1544(local27.aClass8_6, local1, local6, local11, 1, 1);
								local27.aClass8_5.method4544(local27.aClass8_6, 0, 0, 0, false);
								local27.aClass8_6 = local27.aClass8_6.method4539();
							}
							local27.aClass8_5 = local27.aClass8_5.method4539();
						}
						for (@Pc(83) int local83 = 0; local83 < local22.spriteCount; local83++) {
							@Pc(92) Sprite local92 = local22.sprites[local83];
							if (local92 != null && local92.aClass8_4.method4543()) {
								Static69.method1544(local92.aClass8_4, local1, local6, local11, local92.anInt1713 + 1 - local92.anInt1701, local92.anInt1698 - local92.anInt1696 + 1);
								local92.aClass8_4 = local92.aClass8_4.method4539();
							}
						}
						@Pc(131) GroundDecor local131 = local22.aClass15_1;
						if (local131 != null && local131.aClass8_1.method4543()) {
							Static264.method3574(local131.aClass8_1, local1, local6, local11);
							local131.aClass8_1 = local131.aClass8_1.method4539();
						}
					}
				}
			}
		}
	}
}
