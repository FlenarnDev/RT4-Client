package deob;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex3.client.client!ab")
public class Linkable {

	@OriginalMember(owner = "com.jagex3.client.client!ab", name = "a", descriptor = "J")
	public long aLong192;

	@OriginalMember(owner = "com.jagex3.client.client!ab", name = "d", descriptor = "Lclient!ab;")
	public Linkable aClass3_222;

	@OriginalMember(owner = "com.jagex3.client.client!ab", name = "l", descriptor = "Lclient!ab;")
	public Linkable aClass3_223;

	@OriginalMember(owner = "com.jagex3.client.client!ab", name = "a", descriptor = "(I)Z")
	public final boolean method4654() {
		return this.aClass3_223 != null;
	}

	@OriginalMember(owner = "com.jagex3.client.client!ab", name = "b", descriptor = "(I)V")
	public final void method4658() {
		if (this.aClass3_223 != null) {
			this.aClass3_223.aClass3_222 = this.aClass3_222;
			this.aClass3_222.aClass3_223 = this.aClass3_223;
			this.aClass3_223 = null;
			this.aClass3_222 = null;
		}
	}
}
