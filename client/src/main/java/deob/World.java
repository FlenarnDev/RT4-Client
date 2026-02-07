package deob;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex3.client.client!ba")
public final class World extends AbstractWorld {

	@OriginalMember(owner = "com.jagex3.client.client!ba", name = "t", descriptor = "Lclient!na;")
	public JagString aClass100_69;

	@OriginalMember(owner = "com.jagex3.client.client!ba", name = "u", descriptor = "I")
	public int anInt382;

	@OriginalMember(owner = "com.jagex3.client.client!ba", name = "A", descriptor = "Lclient!na;")
	public JagString aClass100_71;

	@OriginalMember(owner = "com.jagex3.client.client!ba", name = "g", descriptor = "(I)Lclient!ee;")
	public final Class32 method445() {
		return Static203.aClass32Array1[this.anInt377];
	}
}
