package deob;

import com.jagex3.*;
import com.jagex3.client.Client;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

    @OriginalMember(owner = "com.jagex3.client.client!tb", name = "Q", descriptor = "I")
	public static int anInt5276 = 0;

	@OriginalMember(owner = "com.jagex3.client.client!tb", name = "h", descriptor = "(I)I")
	public static int method4044() {
		return Client.shiftClick && ClientKeyboardListener.keyHeld[81] && Client.menuNumEntries > 2 ? Client.anIntArray382[Client.menuNumEntries - 2] : Client.anIntArray382[Client.menuNumEntries - 1];
	}

	@OriginalMember(owner = "com.jagex3.client.client!tb", name = "b", descriptor = "(IB)Lclient!bc;")
	public static QuickChatCatType method4045(@OriginalArg(0) int arg0) {
		@Pc(10) QuickChatCatType local10 = (QuickChatCatType) Static73.aClass54_7.method1806((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24;
		if (arg0 < 32768) {
			local24 = QuickChatCatType.archive1.method4495(0, arg0);
		} else {
			local24 = QuickChatCatType.archive2.method4495(0, arg0 & 0x7FFF);
		}
		local10 = new QuickChatCatType();
		if (local24 != null) {
			local10.method470(new Packet(local24));
		}
		if (arg0 >= 32768) {
			local10.method465();
		}
		Static73.aClass54_7.method1811(local10, (long) arg0);
		return local10;
	}
}
