package deob;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex3.client.client!hb")
public final class EnumStringNode extends Linkable {

	@OriginalMember(owner = "com.jagex3.client.client!hb", name = "y", descriptor = "Lclient!na;")
	public final JagString aClass100_503;

	@OriginalMember(owner = "com.jagex3.client.client!hb", name = "<init>", descriptor = "(Lclient!na;I)V")
	public EnumStringNode(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1) {
		this.aClass100_503 = arg0;
	}
}
