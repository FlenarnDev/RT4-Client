package deob;

import com.jagex3.client.AbstractPix32;
import com.jagex3.client.ClientGosubFrame;
import com.jagex3.client.JagString;
import com.jagex3.client.SoftLruCache;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static67 {

	@OriginalMember(owner = "com.jagex3.client.client!fe", name = "x", descriptor = "I")
	public static int anInt3356;

	@OriginalMember(owner = "com.jagex3.client.client!fe", name = "lc", descriptor = "[Lclient!qf;")
	public static AbstractPix32[] aClass3_Sub2_Sub1Array4;

	@OriginalMember(owner = "com.jagex3.client.client!fe", name = "I", descriptor = "Lclient!na;")
	public static final JagString aClass100_639 = Static28.parse(" ");

	@OriginalMember(owner = "com.jagex3.client.client!fe", name = "R", descriptor = "Z")
	public static boolean prevFocus = true;

	@OriginalMember(owner = "com.jagex3.client.client!fe", name = "jb", descriptor = "Lclient!n;")
	public static final SoftLruCache aClass99_20 = new SoftLruCache(64);

	@OriginalMember(owner = "com.jagex3.client.client!fe", name = "lb", descriptor = "[I")
	public static final int[] anIntArray320 = new int[100];

	@OriginalMember(owner = "com.jagex3.client.client!fe", name = "nc", descriptor = "[Lclient!hj;")
	public static final ClientGosubFrame[] aClass61Array3 = new ClientGosubFrame[50];
}
