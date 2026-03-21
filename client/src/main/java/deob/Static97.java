package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

import com.jagex3.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

    @OriginalMember(owner = "com.jagex3.client.client!hi", name = "f", descriptor = "J")
	public static long aLong89 = 0L;

	@OriginalMember(owner = "com.jagex3.client.client!hi", name = "a", descriptor = "(BI)I")
	public static int method1959(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

    @OriginalMember(owner = "com.jagex3.client.client!hi", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1961(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof JagException) {
			@Pc(11) JagException local11 = (JagException) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString3 + " | ";
		} else {
			local24 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			@Pc(59) String local59 = local53.readLine();
			if (local59 == null) {
				return local24 + "| " + local56;
			}
			@Pc(65) int local65 = local59.indexOf(40);
			@Pc(72) int local72 = local59.indexOf(41, local65 + 1);
			@Pc(79) String local79;
			if (local65 == -1) {
				local79 = local59;
			} else {
				local79 = local59.substring(0, local65);
			}
			local79 = local79.trim();
			local79 = local79.substring(local79.lastIndexOf(32) + 1);
			local79 = local79.substring(local79.lastIndexOf(9) + 1);
			local24 = local24 + local79;
			if (local65 != -1 && local72 != -1) {
				@Pc(126) int local126 = local59.indexOf(".java:", local65);
				if (local126 >= 0) {
					local24 = local24 + local59.substring(local126 + 5, local72);
				}
			}
			local24 = local24 + ' ';
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!hi", name = "a", descriptor = "(Lclient!wa;I)V")
	public static void method1962(@OriginalArg(0) Packet arg0) {
		@Pc(9) int local9 = arg0.gsmart();
		Static203.aWorldInfoArray1 = new WorldInfo[local9];
		@Pc(14) int local14;
		for (local14 = 0; local14 < local9; local14++) {
			Static203.aWorldInfoArray1[local14] = new WorldInfo();
			Static203.aWorldInfoArray1[local14].anInt1739 = arg0.gsmart();
			Static203.aWorldInfoArray1[local14].aClass100_378 = arg0.gjstr2();
		}
		Static19.anInt636 = arg0.gsmart();
		Static171.anInt4157 = arg0.gsmart();
		Static106.anInt2871 = arg0.gsmart();
		Static196.aClass10_Sub1Array2 = new GWCWorld[Static171.anInt4157 + 1 - Static19.anInt636];
		for (local14 = 0; local14 < Static106.anInt2871; local14++) {
			@Pc(77) int local77 = arg0.gsmart();
			@Pc(85) GWCWorld local85 = Static196.aClass10_Sub1Array2[local77] = new GWCWorld();
			local85.anInt377 = arg0.g1();
			local85.anInt381 = arg0.g4();
			local85.anInt382 = local77 + Static19.anInt636;
			local85.aClass100_69 = arg0.gjstr2();
			local85.aClass100_71 = arg0.gjstr2();
		}
		Static80.anInt4702 = arg0.g4();
		Static61.aBoolean109 = true;
	}

}
