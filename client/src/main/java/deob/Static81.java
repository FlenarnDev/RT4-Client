package deob;

import java.awt.Point;

import com.jagex3.*;
import com.jagex3.client.applet.GameCanvas;
import com.jagex3.client.applet.GameShell;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "com.jagex3.client.client!gg", name = "Z", descriptor = "I")
	public static int anInt2222;

    @OriginalMember(owner = "com.jagex3.client.client!gg", name = "bb", descriptor = "I")
	public static int anInt2223;

    @OriginalMember(owner = "com.jagex3.client.client!gg", name = "W", descriptor = "Lclient!na;")
	public static final JagString aClass100_475 = Static28.parse("null");

	@OriginalMember(owner = "com.jagex3.client.client!gg", name = "Y", descriptor = "Lclient!na;")
	public static final JagString aClass100_476 = Static28.parse("::gc");

    @OriginalMember(owner = "com.jagex3.client.client!gg", name = "c", descriptor = "(II)V")
	public static void method1750(@OriginalArg(0) int arg0) {
		if (!Static64.aBoolean111) {
			arg0 = -1;
		}
		if (arg0 == Static115.anInt2941) {
			return;
		}
		if (arg0 != -1) {
			@Pc(24) CursorType local24 = Static202.method3660(arg0);
			@Pc(28) Pix32 local28 = local24.method2246();
			if (local28 == null) {
				arg0 = -1;
			} else {
				GameShell.signLink.method5113(local28.method301(), local28.anInt1860, GameCanvas.canvas, new Point(local24.anInt2852, local24.anInt2850), local28.anInt1866);
				Static115.anInt2941 = arg0;
			}
		}
		if (arg0 == -1 && Static115.anInt2941 != -1) {
			GameShell.signLink.method5113(null, -1, GameCanvas.canvas, new Point(), -1);
			Static115.anInt2941 = -1;
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!gg", name = "a", descriptor = "([[IZ)V")
	public static void method1751(@OriginalArg(0) int[][] arg0) {
		Static71.anIntArrayArray10 = arg0;
	}

	@OriginalMember(owner = "com.jagex3.client.client!gg", name = "d", descriptor = "(II)Lclient!dm;")
	public static IdkType method1752(@OriginalArg(0) int arg0) {
		@Pc(10) IdkType local10 = (IdkType) Static67.aClass99_20.method3106((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = FluType.clientConfig.method4495(3, arg0);
		local10 = new IdkType();
		if (local21 != null) {
			local10.method1209(new Packet(local21));
		}
		Static67.aClass99_20.method3095(local10, (long) arg0);
		return local10;
	}

    @OriginalMember(owner = "com.jagex3.client.client!gg", name = "a", descriptor = "(ILclient!ve;)V")
	public static void method1754(@OriginalArg(1) Js5 arg0) {
		Static138.anInt3443 = arg0.method4482(Static12.aClass100_73);
	}

}
