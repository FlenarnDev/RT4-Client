package deob;

import com.jagex3.Packet;
import com.jagex3.SoftLruCache;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "com.jagex3.client.client!jl", name = "I", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

    @OriginalMember(owner = "com.jagex3.client.client!jl", name = "x", descriptor = "Lclient!n;")
	public static final SoftLruCache aClass99_18 = new SoftLruCache(50);

	@OriginalMember(owner = "com.jagex3.client.client!jl", name = "G", descriptor = "Lclient!n;")
	public static final SoftLruCache aClass99_19 = new SoftLruCache(64);

	@OriginalMember(owner = "com.jagex3.client.client!jl", name = "H", descriptor = "I")
	public static int worldId = -1;

    @OriginalMember(owner = "com.jagex3.client.client!jl", name = "a", descriptor = "(IB)Lclient!kk;")
	public static VarBitType method2449(@OriginalArg(0) int arg0) {
		@Pc(10) VarBitType local10 = (VarBitType) aClass99_19.method3106((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(31) byte[] local31 = VarBitType.varbitConfig.method4495(Static254.method4349(arg0), Static274.method3845(arg0));
		local10 = new VarBitType();
		if (local31 != null) {
			local10.method2651(new Packet(local31));
		}
		aClass99_19.method3095(local10, (long) arg0);
		return local10;
	}

}
