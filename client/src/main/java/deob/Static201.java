package deob;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "com.jagex3.client.client!qf", name = "S", descriptor = "I")
	public static int anInt1864;

	@OriginalMember(owner = "com.jagex3.client.client!qf", name = "M", descriptor = "I")
	public static int anInt1862 = 0;

	@OriginalMember(owner = "com.jagex3.client.client!qf", name = "N", descriptor = "Lclient!na;")
	public static final JagString aClass100_406 = Static28.parse("::cardmem");

	@OriginalMember(owner = "com.jagex3.client.client!qf", name = "Q", descriptor = "Lclient!na;")
	public static final JagString aClass100_407 = Static28.parse(" )2> <col=ffff00>");

	@OriginalMember(owner = "com.jagex3.client.client!qf", name = "R", descriptor = "Lclient!na;")
	public static final JagString aClass100_408 = Static28.parse(" )2> ");

	@OriginalMember(owner = "com.jagex3.client.client!qf", name = "X", descriptor = "Lclient!be;")
	public static IfType aClass13_13 = null;

	@OriginalMember(owner = "com.jagex3.client.client!qf", name = "a", descriptor = "(BII)Lclient!be;")
	public static IfType method1418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) IfType local7 = Static5.getComponent(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.createdComponents == null || local7.createdComponents.length <= arg1) {
			return null;
		} else {
			return local7.createdComponents[arg1];
		}
	}
}
