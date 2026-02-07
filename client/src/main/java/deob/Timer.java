package deob;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex3.client.client!s")
public abstract class Timer {

	@OriginalMember(owner = "com.jagex3.client.client!s", name = "a", descriptor = "(III)I")
	public abstract int method3391(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "com.jagex3.client.client!s", name = "b", descriptor = "(I)V")
	public abstract void method3394();
}
