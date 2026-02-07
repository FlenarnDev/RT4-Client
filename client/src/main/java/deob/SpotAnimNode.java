package deob;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex3.client.client!bk")
public final class SpotAnimNode extends SecondaryNode {

	@OriginalMember(owner = "com.jagex3.client.client!bk", name = "M", descriptor = "Lclient!bh;")
	public final SpotAnim aClass8_Sub2_1;

	@OriginalMember(owner = "com.jagex3.client.client!bk", name = "<init>", descriptor = "(Lclient!bh;)V")
	public SpotAnimNode(@OriginalArg(0) SpotAnim arg0) {
		this.aClass8_Sub2_1 = arg0;
	}
}
