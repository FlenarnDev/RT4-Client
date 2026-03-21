package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

    @OriginalMember(owner = "com.jagex3.client.client!he", name = "V", descriptor = "Lclient!n;")
	public static final SoftLruCache aClass99_13 = new SoftLruCache(64);

	@OriginalMember(owner = "com.jagex3.client.client!he", name = "Y", descriptor = "I")
	public static volatile int anInt2467 = 0;

	@OriginalMember(owner = "com.jagex3.client.client!he", name = "ab", descriptor = "Lclient!sc;")
	public static final HashTable aClass133_7 = new HashTable(16);

	@OriginalMember(owner = "com.jagex3.client.client!he", name = "bb", descriptor = "Lclient!ug;")
	public static ClientMouseListener aClass150_1 = new ClientMouseListener();

	@OriginalMember(owner = "com.jagex3.client.client!he", name = "db", descriptor = "Lclient!na;")
	public static final JagString aClass100_517 = Static28.parse("");

	@OriginalMember(owner = "com.jagex3.client.client!he", name = "eb", descriptor = "[I")
	public static final int[] anIntArray219 = new int[1000];

	@OriginalMember(owner = "com.jagex3.client.client!he", name = "fb", descriptor = "Lclient!n;")
	public static final SoftLruCache aClass99_14 = new SoftLruCache(30);

	@OriginalMember(owner = "com.jagex3.client.client!he", name = "gb", descriptor = "Lclient!na;")
	public static final JagString aClass100_518 = Static28.parse("www");

	@OriginalMember(owner = "com.jagex3.client.client!he", name = "c", descriptor = "(II)V")
	public static void method1906(@OriginalArg(1) int arg0) {
		@Pc(12) DelayedStateChange local12 = Static238.method4143(7, arg0);
		local12.method1007();
	}
}
