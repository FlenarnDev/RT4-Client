package deob;

import com.jagex3.client.Client;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static236 {

	@OriginalMember(owner = "com.jagex3.client.client!tc", name = "f", descriptor = "Z")
	public static boolean aBoolean256 = false;

	@OriginalMember(owner = "com.jagex3.client.client!tc", name = "a", descriptor = "(B)I")
	public static int method4047() {
		if (Static127.aBoolean160) {
			return 0;
		} else if (Client.highDetail()) {
			return Static80.aBoolean231 ? 2 : 1;
		} else {
			return 1;
		}
	}

}
