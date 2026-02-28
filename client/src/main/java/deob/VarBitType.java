package deob;

import com.jagex3.Js5;
import com.jagex3.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex3.client.client!kk")
public final class VarBitType {

    @OriginalMember(owner = "com.jagex3.client.client!nj", name = "c", descriptor = "Lclient!ve;")
    public static Js5 varbitConfig;
    @OriginalMember(owner = "com.jagex3.client.client!kk", name = "c", descriptor = "I")
	public int anInt3318;

	@OriginalMember(owner = "com.jagex3.client.client!kk", name = "h", descriptor = "I")
	public int anInt3323;

	@OriginalMember(owner = "com.jagex3.client.client!kk", name = "l", descriptor = "I")
	public int anInt3327;

    @OriginalMember(owner = "com.jagex3.client.client!og", name = "a", descriptor = "(Lclient!ve;I)V")
    public static void init(@OriginalArg(0) Js5 arg0) {
        varbitConfig = arg0;
    }

    @OriginalMember(owner = "com.jagex3.client.client!kk", name = "a", descriptor = "(Lclient!wa;I)V")
	public final void method2651(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.g1();
			if (local9 == 0) {
				return;
			}
			this.method2653(arg0, local9);
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!kk", name = "a", descriptor = "(Lclient!wa;II)V")
	private void method2653(@OriginalArg(0) Packet arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3327 = arg0.g2();
			this.anInt3318 = arg0.g1();
			this.anInt3323 = arg0.g1();
		}
	}
}
