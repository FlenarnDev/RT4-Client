package deob;

import com.jagex.signlink.MonotonicClock;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex3.client.client!da")
public final class DelayedStateChange extends DoubleLinkable {

	@OriginalMember(owner = "com.jagex3.client.client!da", name = "T", descriptor = "I")
	public int intArg2;

	@OriginalMember(owner = "com.jagex3.client.client!da", name = "U", descriptor = "I")
	public int intArg3;

	@OriginalMember(owner = "com.jagex3.client.client!da", name = "V", descriptor = "I")
	public int intArg1;

	@OriginalMember(owner = "com.jagex3.client.client!da", name = "W", descriptor = "Lclient!na;")
	public JagString stringArg;

	@OriginalMember(owner = "com.jagex3.client.client!da", name = "<init>", descriptor = "(II)V")
	public DelayedStateChange(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aLong192 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "com.jagex3.client.client!da", name = "a", descriptor = "(Z)V")
	public final void method1007() {
		this.aLong185 = MonotonicClock.currentTime() + 500L | Long.MIN_VALUE & this.aLong185;
		Static140.aClass16_7.method798(this);
	}

	@OriginalMember(owner = "com.jagex3.client.client!da", name = "b", descriptor = "(Z)J")
	public final long method1009() {
		return this.aLong185 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "com.jagex3.client.client!da", name = "e", descriptor = "(I)I")
	public final int method1011() {
		return (int) (this.aLong192 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "com.jagex3.client.client!da", name = "f", descriptor = "(B)I")
	public final int method1012() {
		return (int) this.aLong192;
	}

	@OriginalMember(owner = "com.jagex3.client.client!da", name = "g", descriptor = "(B)V")
	public final void method1017() {
		this.aLong185 |= Long.MIN_VALUE;
		if (this.method1009() == 0L) {
			Static215.aClass16_9.method798(this);
		}
	}
}
