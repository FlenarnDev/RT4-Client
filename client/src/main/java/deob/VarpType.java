package deob;

import com.jagex3.client.Js5;
import com.jagex3.client.Packet;
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
	public int anInt1765 = 0;

    @OriginalMember(owner = "com.jagex3.client.client!sj", name = "a", descriptor = "(Lclient!ve;B)V")
    public static void init(@OriginalArg(0) Js5 arg0) {
        clientConfig = arg0;
        numDefinitions = clientConfig.getFileIdLimit(16);
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
			this.anInt1765 = arg0.g2();
		}
	}
}
