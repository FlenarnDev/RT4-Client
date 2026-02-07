package deob;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex3.client.client!pa")
public final class ObjStackNode extends SecondaryNode {

	@OriginalMember(owner = "com.jagex3.client.client!pa", name = "T", descriptor = "Lclient!uj;")
	public final ObjStack aClass8_Sub7_1;

	@OriginalMember(owner = "com.jagex3.client.client!pa", name = "<init>", descriptor = "(Lclient!uj;)V")
	public ObjStackNode(@OriginalArg(0) ObjStack arg0) {
		this.aClass8_Sub7_1 = arg0;
	}
}
