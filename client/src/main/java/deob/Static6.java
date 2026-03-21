package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static6 {

    @OriginalMember(owner = "com.jagex3.client.client!ag", name = "ab", descriptor = "Lclient!na;")
	public static final JagString aClass100_17 = Static28.parse("0");

    @OriginalMember(owner = "com.jagex3.client.client!ag", name = "cb", descriptor = "[Lclient!cl;")
	public static final AnimFrameset[] aClass3_Sub2_Sub7Array1 = new AnimFrameset[14];

    @OriginalMember(owner = "com.jagex3.client.client!ag", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method85(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

}
