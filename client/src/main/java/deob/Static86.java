package deob;

import com.jagex3.JagString;
import com.jagex3.Js5CacheQueue;
import org.openrs2.deob.annotation.OriginalMember;

import java.math.BigInteger;

public final class Static86 {

    // Jagex's RSA key:
    public static final BigInteger RSA_MODULUS = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
    public static final BigInteger RSA_EXPONENT = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
    @OriginalMember(owner = "com.jagex3.client.client!gm", name = "T", descriptor = "Lclient!k;")
	public static Js5CacheQueue js5CacheQueue;

    @OriginalMember(owner = "com.jagex3.client.client!gm", name = "R", descriptor = "I")
	public static int anInt2293 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "com.jagex3.client.client!gm", name = "W", descriptor = "Lclient!na;")
	public static final JagString aClass100_488 = Static28.parse("_");

    @OriginalMember(owner = "com.jagex3.client.client!gm", name = "db", descriptor = "Lclient!na;")
	public static final JagString aClass100_490 = Static28.parse("cross");

	@OriginalMember(owner = "com.jagex3.client.client!gm", name = "gb", descriptor = "[I")
	public static final int[] anIntArray211 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "com.jagex3.client.client!gm", name = "f", descriptor = "(B)V")
	public static void method1799() {
		Static222.aBoolean246 = true;
	}

}
