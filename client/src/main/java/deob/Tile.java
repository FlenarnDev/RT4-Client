package deob;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex3.client.client!bj")
public final class Tile extends Node {

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "x", descriptor = "Z")
	public boolean aBoolean45;

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "y", descriptor = "I")
	public int anInt662;

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "A", descriptor = "Z")
	public boolean aBoolean46;

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "B", descriptor = "Lclient!fg;")
	public ShapedTile aClass43_1;

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "C", descriptor = "I")
	public int anInt663;

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "E", descriptor = "I")
	public int anInt665;

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "G", descriptor = "Lclient!bm;")
	public GroundDecor aClass15_1;

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "I", descriptor = "I")
	public int anInt667;

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "J", descriptor = "Lclient!df;")
	public WallDecor aClass24_1;

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "K", descriptor = "Lclient!jh;")
	public Wall aClass77_1;

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "M", descriptor = "Lclient!bj;")
	public Tile aClass3_Sub5_1;

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "N", descriptor = "Z")
	public boolean aBoolean47;

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "S", descriptor = "Lclient!rh;")
	public PlainTile aClass131_1;

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "T", descriptor = "I")
	public int anInt670;

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "X", descriptor = "Lclient!jj;")
	public ObjStackEntity aClass79_1;

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "D", descriptor = "I")
	public int anInt664 = 0;

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "w", descriptor = "[Lclient!ec;")
	public final Scenery[] aClass31Array1 = new Scenery[5];

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "P", descriptor = "[I")
	public final int[] anIntArray59 = new int[5];

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "H", descriptor = "I")
	public final int anInt666;

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "W", descriptor = "I")
	public int anInt672;

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "Q", descriptor = "I")
	public final int anInt668;

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "R", descriptor = "I")
	public final int anInt669;

	@OriginalMember(owner = "com.jagex3.client.client!bj", name = "<init>", descriptor = "(III)V")
	public Tile(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt666 = arg2;
		this.anInt668 = this.anInt672 = arg0;
		this.anInt669 = arg1;
	}
}
