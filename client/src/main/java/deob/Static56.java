package deob;

import com.jagex3.IfType;
import com.jagex3.JagString;
import com.jagex3.Pix32;
import com.jagex3.SoftLruCache;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static56 {

	@OriginalMember(owner = "com.jagex3.client.client!ef", name = "j", descriptor = "Lclient!mm;")
	public static Pix32 aClass3_Sub2_Sub1_Sub1_1;

    @OriginalMember(owner = "com.jagex3.client.client!ef", name = "a", descriptor = "[I")
	public static final int[] anIntArray141 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "com.jagex3.client.client!ef", name = "b", descriptor = "Lclient!n;")
	public static final SoftLruCache aClass99_9 = new SoftLruCache(30);

	@OriginalMember(owner = "com.jagex3.client.client!ef", name = "c", descriptor = "[I")
	public static final int[] anIntArray142 = new int[500];

	@OriginalMember(owner = "com.jagex3.client.client!ef", name = "f", descriptor = "Lclient!na;")
	public static final JagString aClass100_379 = Static28.parse(":duelstake:");

	@OriginalMember(owner = "com.jagex3.client.client!ef", name = "g", descriptor = "I")
	public static int anInt1742 = -1;

	@OriginalMember(owner = "com.jagex3.client.client!ef", name = "h", descriptor = "Lclient!na;")
	public static final JagString aClass100_380 = Static28.parse("unzap");

	@OriginalMember(owner = "com.jagex3.client.client!ef", name = "i", descriptor = "I")
	public static int anInt1743 = 0;

	@OriginalMember(owner = "com.jagex3.client.client!ef", name = "r", descriptor = "Lclient!be;")
	public static IfType aClass13_12 = null;

	@OriginalMember(owner = "com.jagex3.client.client!ef", name = "a", descriptor = "(I)I")
	public static int method1314() {
		return Static48.anInt1447 == 0 ? 0 : Static2.anInterface4Array1[Static48.anInt1447].method4605();
	}
}
