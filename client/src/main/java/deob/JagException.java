package deob;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex3.client.client!ld")
public final class JagException extends RuntimeException {

	@OriginalMember(owner = "com.jagex3.client.client!ld", name = "e", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "com.jagex3.client.client!ld", name = "f", descriptor = "Ljava/lang/Throwable;")
	public Throwable aThrowable1;
}
