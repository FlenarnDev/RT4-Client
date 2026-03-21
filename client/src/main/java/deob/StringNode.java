package deob;

import com.jagex3.JagString;
import com.jagex3.Linkable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex3.client.client!sj")
public final class StringNode extends Linkable {

	@OriginalMember(owner = "com.jagex3.client.client!sj", name = "A", descriptor = "Lclient!na;")
	public JagString aClass100_980;

	@OriginalMember(owner = "com.jagex3.client.client!sj", name = "<init>", descriptor = "()V")
	public StringNode() {
	}

	@OriginalMember(owner = "com.jagex3.client.client!sj", name = "<init>", descriptor = "(Lclient!na;)V")
	public StringNode(@OriginalArg(0) JagString arg0) {
		this.aClass100_980 = arg0;
	}
}
