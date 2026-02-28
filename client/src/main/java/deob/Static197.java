package deob;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

import com.jagex.signlink.PrivilegedRequest;
import com.jagex.signlink.SignLink;
import com.jagex3.client.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "com.jagex3.client.client!pm", name = "cb", descriptor = "[[[Lclient!bj;")
	public static Square[][][] aClass3_Sub5ArrayArrayArray2;

	@OriginalMember(owner = "com.jagex3.client.client!pm", name = "hb", descriptor = "I")
	public static int anInt4620;

	@OriginalMember(owner = "com.jagex3.client.client!pm", name = "Y", descriptor = "Lclient!na;")
	public static final JagString aClass100_872 = Static28.parse("<br>");

	@OriginalMember(owner = "com.jagex3.client.client!pm", name = "ab", descriptor = "Z")
	public static boolean aBoolean228 = true;

	@OriginalMember(owner = "com.jagex3.client.client!pm", name = "a", descriptor = "(ILsignlink!ll;)[Lclient!od;")
	public static DisplayMode[] method3558(@OriginalArg(1) SignLink arg0) {
		if (!arg0.method5111()) {
			return new DisplayMode[0];
		}
		@Pc(17) PrivilegedRequest local17 = arg0.method5132();
		while (local17.status == 0) {
			Static231.sleepPrecise(10L);
		}
		if (local17.status == 2) {
			return new DisplayMode[0];
		}
		@Pc(39) int[] local39 = (int[]) local17.result;
		@Pc(45) DisplayMode[] local45 = new DisplayMode[local39.length >> 2];
		for (@Pc(47) int local47 = 0; local47 < local45.length; local47++) {
			@Pc(59) DisplayMode local59 = new DisplayMode();
			local45[local47] = local59;
			local59.anInt4248 = local39[local47 << 2];
			local59.anInt4250 = local39[(local47 << 2) + 1];
			local59.anInt4251 = local39[(local47 << 2) + 2];
			local59.anInt4249 = local39[(local47 << 2) + 3];
		}
		return local45;
	}

	@OriginalMember(owner = "com.jagex3.client.client!pm", name = "a", descriptor = "(ZIZIZII)V")
	public static void method3560(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2) {
			GlRenderer.quit();
		}
		if (Static69.aFrame2 != null && (arg1 != 3 || arg4 != Static114.anInt5831 || arg5 != Static22.anInt729)) {
			Static25.method714(Static69.aFrame2, GameShell.signLink);
			Static69.aFrame2 = null;
		}
		if (arg1 == 3 && Static69.aFrame2 == null) {
			Static69.aFrame2 = Static169.method3176(0, arg5, arg4, GameShell.signLink);
			if (Static69.aFrame2 != null) {
				Static22.anInt729 = arg5;
				Static114.anInt5831 = arg4;
				Static203.method3663(GameShell.signLink);
			}
		}
		if (arg1 == 3 && Static69.aFrame2 == null) {
			method3560(true, Static214.anInt5581, true, arg3, -1, -1);
			return;
		}
		@Pc(85) Container local85;
		if (Static69.aFrame2 != null) {
			local85 = Static69.aFrame2;
		} else if (Static39.aFrame1 == null) {
			local85 = GameShell.signLink.anApplet2;
		} else {
			local85 = Static39.aFrame1;
		}
		Static72.anInt2046 = local85.getSize().width;
		Static122.anInt3045 = local85.getSize().height;
		@Pc(109) Insets local109;
		if (Static39.aFrame1 == local85) {
			local109 = Static39.aFrame1.getInsets();
			Static72.anInt2046 -= local109.right + local109.left;
			Static122.anInt3045 -= local109.bottom + local109.top;
		}
		if (arg1 >= 2) {
			Static48.anInt1448 = Static72.anInt2046;
			Static254.anInt5554 = Static122.anInt3045;
			Static145.anInt3497 = 0;
			Static178.anInt4246 = 0;
		} else {
			Static178.anInt4246 = 0;
			Static145.anInt3497 = (Static72.anInt2046 - 765) / 2;
			Static48.anInt1448 = 765;
			Static254.anInt5554 = 503;
		}
		if (arg0) {
			Static31.method847(GameCanvas.canvas);
			Static223.method3866(GameCanvas.canvas);
			if (Static71.mouseWheelInterface != null) {
				Static71.mouseWheelInterface.method3291(GameCanvas.canvas);
			}
			Static215.aClient1.method926();
			Static19.start(GameCanvas.canvas);
			Static88.start(GameCanvas.canvas);
			if (Static71.mouseWheelInterface != null) {
				Static71.mouseWheelInterface.start(GameCanvas.canvas);
			}
		} else {
			if (GlRenderer.enabled) {
				GlRenderer.setCanvasSize(Static48.anInt1448, Static254.anInt5554);
			}
			GameCanvas.canvas.setSize(Static48.anInt1448, Static254.anInt5554);
			if (Static39.aFrame1 == local85) {
				local109 = Static39.aFrame1.getInsets();
				GameCanvas.canvas.setLocation(local109.left + Static145.anInt3497, local109.top + Static178.anInt4246);
			} else {
				GameCanvas.canvas.setLocation(Static145.anInt3497, Static178.anInt4246);
			}
		}
		if (arg1 == 0 && arg3 > 0) {
			GlRenderer.createAndDestroyContext(GameCanvas.canvas);
		}
		if (arg2 && arg1 > 0) {
			GameCanvas.canvas.setIgnoreRepaint(true);
			if (!Static211.aBoolean73) {
				Static65.method1500();
				Static260.aClass27_2 = null;
				Static260.aClass27_2 = Static131.method2579(Static254.anInt5554, Static48.anInt1448, GameCanvas.canvas);
				Static129.method2492();
				if (Client.state == 5) {
					Static182.method3359(true, Static280.aClass3_Sub2_Sub9_43);
				} else {
					Static114.method4636(false, LocalizedText.LOADING);
				}
				try {
					@Pc(269) Graphics local269 = GameCanvas.canvas.getGraphics();
					Static260.aClass27_2.method4186(local269);
				} catch (@Pc(277) Exception local277) {
				}
				Static139.method2704();
				if (arg3 == 0) {
					Static260.aClass27_2 = Static131.method2579(503, 765, GameCanvas.canvas);
				} else {
					Static260.aClass27_2 = null;
				}
				@Pc(300) PrivilegedRequest local300 = GameShell.signLink.method5123(Static215.aClient1.getClass());
				while (local300.status == 0) {
					Static231.sleepPrecise(100L);
				}
				if (local300.status == 1) {
					Static211.aBoolean73 = true;
				}
			}
			if (Static211.aBoolean73) {
				GlRenderer.init(GameCanvas.canvas, Static186.anInt4392 * 2);
			}
		}
		if (!GlRenderer.enabled && arg1 > 0) {
			method3560(true, 0, true, arg3, -1, -1);
			return;
		}
		if (arg1 > 0 && arg3 == 0) {
			Static37.aThread1.setPriority(5);
			Static260.aClass27_2 = null;
			Static268.method4580();
			((WorldTextureProvider) Rasteriser.anInterface1_2).method3248(200);
			if (Static178.highDetailLighting) {
				Pix3D.method1911(0.7F);
			}
			Static114.method4637();
		} else if (arg1 == 0 && arg3 > 0) {
			Static37.aThread1.setPriority(1);
			Static260.aClass27_2 = Static131.method2579(503, 765, GameCanvas.canvas);
			Static268.method4583();
			Static76.method1643();
			((WorldTextureProvider) Rasteriser.anInterface1_2).method3248(20);
			if (Static178.highDetailLighting) {
				if (Static113.anInt4609 == 1) {
					Pix3D.method1911(0.9F);
				}
				if (Static113.anInt4609 == 2) {
					Pix3D.method1911(0.8F);
				}
				if (Static113.anInt4609 == 3) {
					Pix3D.method1911(0.7F);
				}
				if (Static113.anInt4609 == 4) {
					Pix3D.method1911(0.6F);
				}
			}
			Static95.method1939();
			Static114.method4637();
		}
		Static87.aBoolean130 = !Static138.method2697();
		if (arg2) {
			Static141.method2721();
		}
		if (arg1 >= 2) {
			Static124.aBoolean156 = true;
		} else {
			Static124.aBoolean156 = false;
		}
		if (Static154.topLevelInterace != -1) {
			Static210.method3712(true);
		}
		if (Client.loginStream != null && (Client.state == 30 || Client.state == 25)) {
			Static59.method1373();
		}
		for (@Pc(466) int local466 = 0; local466 < 100; local466++) {
			Static186.aBooleanArray100[local466] = true;
		}
		Static69.aBoolean115 = true;
	}
}
