package deob;

import com.jagex3.Js5;
import com.jagex3.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex3.client.client!eh")
public final class VarpType {

    @OriginalMember(owner = "com.jagex3.client.client!gg", name = "ab", descriptor = "Lclient!ve;")
    public static Js5 clientConfig;
    @OriginalMember(owner = "com.jagex3.client.client!nb", name = "p", descriptor = "I")
    public static int numDefinitions;
    @OriginalMember(owner = "com.jagex3.client.client!eh", name = "e", descriptor = "I")
	public int clientcode = 0;

    @OriginalMember(owner = "com.jagex3.client.client!sj", name = "a", descriptor = "(Lclient!ve;B)V")
    public static void init(@OriginalArg(0) Js5 arg0) {
        clientConfig = arg0;
        numDefinitions = clientConfig.getFileIdLimit(16);
    }

    @OriginalMember(owner = "com.jagex3.client.client!ab", name = "b", descriptor = "(B)V")
    public static void method4657() {
        Static232.aClass99_30.clear();
    }

    @OriginalMember(owner = "com.jagex3.client.client!bn", name = "c", descriptor = "(II)V")
    public static void method666() {
        Static232.aClass99_30.method3102(5);
    }

    @OriginalMember(owner = "com.jagex3.client.client!ud", name = "d", descriptor = "(I)V")
	public static void method4266() {
		Static232.aClass99_30.method3104();
	}

    @OriginalMember(owner = "com.jagex3.client.client!ub", name = "a", descriptor = "(II)Lclient!eh;")
    public static VarpType list(@OriginalArg(1) int arg0) {
        @Pc(10) VarpType local10 = (VarpType) Static232.aClass99_30.method3106((long) arg0);
        if (local10 != null) {
            return local10;
        }
        @Pc(20) byte[] local20 = clientConfig.method4495(16, arg0);
        local10 = new VarpType();
        if (local20 != null) {
            local10.method1323(new Packet(local20));
        }
        Static232.aClass99_30.method3095(local10, (long) arg0);
        return local10;
    }

    @OriginalMember(owner = "com.jagex3.client.client!eh", name = "a", descriptor = "(ILclient!wa;)V")
	public final void method1323(@OriginalArg(1) Packet arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.g1();
			if (local5 == 0) {
				return;
			}
			this.method1325(arg0, local5);
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!eh", name = "a", descriptor = "(Lclient!wa;BI)V")
	private void method1325(@OriginalArg(0) Packet arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.clientcode = arg0.g2();
		}
	}
}
