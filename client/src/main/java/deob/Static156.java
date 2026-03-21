package deob;

import com.jagex3.*;
import com.jogamp.opengl.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

    @OriginalMember(owner = "com.jagex3.client.client!mf", name = "X", descriptor = "I")
	public static int anInt3783;

	@OriginalMember(owner = "com.jagex3.client.client!mf", name = "x", descriptor = "Lclient!ha;")
	public static final GzipDecompressor aClass56_1 = new GzipDecompressor();

    @OriginalMember(owner = "com.jagex3.client.client!mf", name = "a", descriptor = "()V")
	public static void method2959() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		local1.glDisableClientState(GL2.GL_COLOR_ARRAY);
		GlRenderer.setLightingEnabled(false);
		local1.glDisable(GL2.GL_DEPTH_TEST);
		local1.glPushAttrib(GL2.GL_FOG_BIT);
		local1.glFogf(GL2.GL_FOG_START, 3072.0F);
		GlRenderer.disableDepthMask();
		for (@Pc(19) int local19 = 0; local19 < Static36.aGlSquareArrayArray1[0].length; local19++) {
			@Pc(31) GlSquare local31 = Static36.aGlSquareArrayArray1[0][local19];
			if (local31.anInt2485 >= 0 && Pix3D.anInterface1_2.method3237(local31.anInt2485) == 4) {
				local1.glColor4fv(Static190.method3441(local31.anInt2486), 0);
				@Pc(57) float local57 = 201.5F - (local31.aBoolean140 ? 1.0F : 0.5F);
				local31.method1944(World.activeTiles, local57, true);
			}
		}
		local1.glEnableClientState(GL2.GL_COLOR_ARRAY);
		GlRenderer.method4173();
		local1.glEnable(GL2.GL_DEPTH_TEST);
		local1.glPopAttrib();
		GlRenderer.enableDepthMask();
	}

	@OriginalMember(owner = "com.jagex3.client.client!mf", name = "a", descriptor = "(BLclient!wa;)Lclient!ta;")
	public static TextureOp29SubOp4 method2960(@OriginalArg(1) Packet arg0) {
		return new TextureOp29SubOp4(arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g3(), arg0.g3(), arg0.g1());
	}
}
