package deob;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "com.jagex3.client.client!rb", name = "f", descriptor = "Lclient!ve;")
	public static Js5 aClass153_87;

    @OriginalMember(owner = "com.jagex3.client.client!rb", name = "a", descriptor = "(Lclient!wa;Z)Lclient!bn;")
	public static Map method3713(@OriginalArg(0) Packet arg0) {
		@Pc(35) Map local35 = new Map(arg0.gjstr(), arg0.gjstr(), arg0.g2(), arg0.g2(), arg0.g4(), arg0.g1() == 1, arg0.g1());
		@Pc(39) int local39 = arg0.g1();
		for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
			local35.aClass69_23.push(new MapChunk(arg0.g2(), arg0.g2(), arg0.g2(), arg0.g2()));
		}
		local35.method665();
		return local35;
	}
}
