package deob;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex3.client.client!aa")
public final class MsiType {

    @OriginalMember(owner = "com.jagex3.client.client!uf", name = "r", descriptor = "Lclient!ve;")
    public static Js5 aClass153_101;
    @OriginalMember(owner = "com.jagex3.client.client!hj", name = "m", descriptor = "Lclient!ve;")
    public static Js5 aClass153_42;
    @OriginalMember(owner = "com.jagex3.client.client!vk", name = "o", descriptor = "I")
    public static int anInt5344;
    @OriginalMember(owner = "com.jagex3.client.client!gl", name = "e", descriptor = "I")
    public static int anInt2262;
    @OriginalMember(owner = "com.jagex3.client.client!nk", name = "E", descriptor = "I")
    public static int anInt4183;
    @OriginalMember(owner = "com.jagex3.client.client!aa", name = "f", descriptor = "I")
	public int anInt11;

	@OriginalMember(owner = "com.jagex3.client.client!aa", name = "i", descriptor = "I")
	public int anInt12;

	@OriginalMember(owner = "com.jagex3.client.client!aa", name = "s", descriptor = "Z")
	public boolean aBoolean2 = false;

    @OriginalMember(owner = "com.jagex3.client.client!og", name = "a", descriptor = "(Lclient!ve;Lclient!ve;B)V")
    public static void init(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1) {
        aClass153_101 = arg1;
        @Pc(12) int local12 = (int) (Math.random() * 21.0D) - 10;
        aClass153_42 = arg0;
        @Pc(21) int local21 = (int) (Math.random() * 21.0D) - 10;
        aClass153_42.getFileIdLimit(34);
        @Pc(33) int local33 = (int) (Math.random() * 21.0D) - 10;
        @Pc(40) int local40 = (int) (Math.random() * 41.0D) - 20;
        anInt5344 = local40 + local21;
        anInt2262 = local12 + local40;
        anInt4183 = local40 + local33;
    }

    @OriginalMember(owner = "com.jagex3.client.client!aa", name = "a", descriptor = "(BLclient!wa;I)V")
	public final void method6(@OriginalArg(1) Packet arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.g1();
			if (local5 == 0) {
				return;
			}
			this.method11(local5, arg0, arg1);
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!aa", name = "a", descriptor = "(IB)Lclient!ek;")
	public final SoftwarePix8 method9(@OriginalArg(0) int arg0) {
		@Pc(17) SoftwarePix8 local17 = (SoftwarePix8) Static219.aClass99_27.method3106((long) (arg0 << 16 | this.anInt12));
		if (local17 != null) {
			return local17;
		}
		aClass153_101.method4506(this.anInt12);
		local17 = Static164.method3119(this.anInt12, aClass153_101);
		if (local17 != null) {
			local17.method1389(anInt4183, anInt2262, anInt5344);
			local17.anInt4279 = local17.anInt4270;
			local17.anInt4276 = local17.anInt4278;
			for (@Pc(59) int local59 = 0; local59 < arg0; local59++) {
				local17.method1395();
			}
			Static219.aClass99_27.method3095(local17, (long) (arg0 << 16 | this.anInt12));
		}
		return local17;
	}

	@OriginalMember(owner = "com.jagex3.client.client!aa", name = "a", descriptor = "(ILclient!wa;II)V")
	private void method11(@OriginalArg(0) int arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			this.anInt12 = arg1.g2();
		} else if (arg0 == 2) {
			this.anInt11 = arg1.g3();
		} else if (arg0 == 3) {
			this.aBoolean2 = true;
		} else if (arg0 == 4) {
			this.anInt12 = -1;
		}
	}
}
