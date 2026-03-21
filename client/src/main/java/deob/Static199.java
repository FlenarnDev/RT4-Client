package deob;

import com.jagex3.FluType;
import com.jagex3.FriendChatUser;
import com.jagex3.HashTable;
import com.jagex3.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "com.jagex3.client.client!qc", name = "bb", descriptor = "[Lclient!kl;")
	public static FriendChatUser[] aFriendChatUserArray1;

	@OriginalMember(owner = "com.jagex3.client.client!qc", name = "cb", descriptor = "I")
	public static int anInt4675;

	@OriginalMember(owner = "com.jagex3.client.client!qc", name = "K", descriptor = "Lclient!sc;")
	public static HashTable aClass133_20 = new HashTable(16);

    @OriginalMember(owner = "com.jagex3.client.client!qc", name = "U", descriptor = "I")
	public static int anInt4672 = 0;

	@OriginalMember(owner = "com.jagex3.client.client!qc", name = "ab", descriptor = "[I")
	public static final int[] anIntArray417 = new int[1000];

	@OriginalMember(owner = "com.jagex3.client.client!qc", name = "a", descriptor = "(ZI)Lclient!ni;")
	public static FluType method3593(@OriginalArg(1) int arg0) {
		@Pc(10) FluType local10 = (FluType) Static83.aClass99_3.method3106((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = FluType.configClient.method4495(1, arg0);
		local10 = new FluType();
		if (local27 != null) {
			local10.method3217(arg0, new Packet(local27));
		}
		Static83.aClass99_3.method3095(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "com.jagex3.client.client!qc", name = "a", descriptor = "(BI)I")
	public static int method3594(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

}
