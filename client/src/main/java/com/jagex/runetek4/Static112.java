package com.jagex.runetek4;

import com.jagex.runetek4.cache.media.ImageRGB;
import com.jagex.runetek4.media.Rasterizer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "runetek4.client!ij", name = "a", descriptor = "Lclient!na;")
	public static final JString DUELFRIEND = JString.parse(":duelfriend:");

	@OriginalMember(owner = "runetek4.client!ij", name = "a", descriptor = "(B)V")
	public static void method2297() {
		@Pc(3) int local3 = Static183.anInt4271;
		@Pc(9) int local9 = Static229.anInt5138;
		@Pc(11) int local11 = Static13.anInt436;
		@Pc(13) int local13 = Static24.anInt761;
		if (LoginManager.aClass3_Sub2_Sub1_1 == null || LoginManager.aClass3_Sub2_Sub1_9 == null) {
			if (client.js5Archive8.method4506(Static55.anInt1736) && client.js5Archive8.method4506(Static169.anInt4073)) {
				LoginManager.aClass3_Sub2_Sub1_1 = Static80.method3613(client.js5Archive8, Static55.anInt1736);
				LoginManager.aClass3_Sub2_Sub1_9 = Static80.method3613(client.js5Archive8, Static169.anInt4073);
				if (GlRenderer.enabled) {
					if (LoginManager.aClass3_Sub2_Sub1_1 instanceof SoftwareAlphaSprite) {
						LoginManager.aClass3_Sub2_Sub1_1 = new GlAlphaSprite((ImageRGB) LoginManager.aClass3_Sub2_Sub1_1);
					} else {
						LoginManager.aClass3_Sub2_Sub1_1 = new GlSprite((ImageRGB) LoginManager.aClass3_Sub2_Sub1_1);
					}
					if (LoginManager.aClass3_Sub2_Sub1_9 instanceof SoftwareAlphaSprite) {
						LoginManager.aClass3_Sub2_Sub1_9 = new GlAlphaSprite((ImageRGB) LoginManager.aClass3_Sub2_Sub1_9);
					} else {
						LoginManager.aClass3_Sub2_Sub1_9 = new GlSprite((ImageRGB) LoginManager.aClass3_Sub2_Sub1_9);
					}
				}
			} else if (GlRenderer.enabled) {
				Static46.drawFilledRectangleAlpha(local3, local9, local13, 20, Static40.anInt1275, 256 - Static111.anInt2910);
			} else {
				Rasterizer.drawFilledRectangleAlpha(local3, local9, local13, 20, Static40.anInt1275, 256 - Static111.anInt2910);
			}
		}
		@Pc(112) int local112;
		@Pc(114) int local114;
		if (LoginManager.aClass3_Sub2_Sub1_1 != null && LoginManager.aClass3_Sub2_Sub1_9 != null) {
			local112 = local13 / LoginManager.aClass3_Sub2_Sub1_1.width;
			for (local114 = 0; local114 < local112; local114++) {
				LoginManager.aClass3_Sub2_Sub1_1.drawSprite(local114 * LoginManager.aClass3_Sub2_Sub1_1.width + local3, local9);
			}
			LoginManager.aClass3_Sub2_Sub1_9.drawSprite(local3, local9);
			LoginManager.aClass3_Sub2_Sub1_9.method1421(local3 + local13 - LoginManager.aClass3_Sub2_Sub1_9.width, local9);
		}
		Fonts.b12Full.drawString(LocalizedText.CHOOSE_OPTION, local3 + 3, local9 + 14, Static195.anInt4581, -1);
		if (GlRenderer.enabled) {
			Static46.drawFilledRectangleAlpha(local3, local9 + 20, local13, local11 - 20, Static40.anInt1275, 256 - Static111.anInt2910);
		} else {
			Rasterizer.drawFilledRectangleAlpha(local3, local9 + 20, local13, local11 - 20, Static40.anInt1275, 256 - Static111.anInt2910);
		}
		local114 = Static223.anInt5032;
		local112 = Static215.anInt4873;
		@Pc(203) int local203;
		@Pc(219) int local219;
		for (local203 = 0; local203 < MiniMenu.menuActionRow; local203++) {
			local219 = (MiniMenu.menuActionRow - local203 - 1) * 15 + local9 + 35;
			if (local3 < local112 && local112 < local3 + local13 && local114 > local219 - 13 && local114 < local219 + 3) {
				if (GlRenderer.enabled) {
					Static46.drawFilledRectangleAlpha(local3, local219 - 13, local13, 16, Static251.anInt5457, 256 - Static232.anInt5208);
				} else {
					Rasterizer.drawFilledRectangleAlpha(local3, local219 - 13, local13, 16, Static251.anInt5457, 256 - Static232.anInt5208);
				}
			}
		}
		if ((LoginManager.aClass3_Sub2_Sub1_8 == null || LoginManager.aClass3_Sub2_Sub1_6 == null || LoginManager.aClass3_Sub2_Sub1_10 == null) && client.js5Archive8.method4506(Static85.anInt2261) && client.js5Archive8.method4506(Static136.anInt3324) && client.js5Archive8.method4506(Static254.anInt5556)) {
			LoginManager.aClass3_Sub2_Sub1_8 = Static80.method3613(client.js5Archive8, Static85.anInt2261);
			LoginManager.aClass3_Sub2_Sub1_6 = Static80.method3613(client.js5Archive8, Static136.anInt3324);
			LoginManager.aClass3_Sub2_Sub1_10 = Static80.method3613(client.js5Archive8, Static254.anInt5556);
			if (GlRenderer.enabled) {
				if (LoginManager.aClass3_Sub2_Sub1_8 instanceof SoftwareAlphaSprite) {
					LoginManager.aClass3_Sub2_Sub1_8 = new GlAlphaSprite((ImageRGB) LoginManager.aClass3_Sub2_Sub1_8);
				} else {
					LoginManager.aClass3_Sub2_Sub1_8 = new GlSprite((ImageRGB) LoginManager.aClass3_Sub2_Sub1_8);
				}
				if (LoginManager.aClass3_Sub2_Sub1_6 instanceof SoftwareAlphaSprite) {
					LoginManager.aClass3_Sub2_Sub1_6 = new GlAlphaSprite((ImageRGB) LoginManager.aClass3_Sub2_Sub1_6);
				} else {
					LoginManager.aClass3_Sub2_Sub1_6 = new GlSprite((ImageRGB) LoginManager.aClass3_Sub2_Sub1_6);
				}
				if (LoginManager.aClass3_Sub2_Sub1_10 instanceof SoftwareAlphaSprite) {
					LoginManager.aClass3_Sub2_Sub1_10 = new GlAlphaSprite((ImageRGB) LoginManager.aClass3_Sub2_Sub1_10);
				} else {
					LoginManager.aClass3_Sub2_Sub1_10 = new GlSprite((ImageRGB) LoginManager.aClass3_Sub2_Sub1_10);
				}
			}
		}
		@Pc(418) int local418;
		if (LoginManager.aClass3_Sub2_Sub1_8 != null && LoginManager.aClass3_Sub2_Sub1_6 != null && LoginManager.aClass3_Sub2_Sub1_10 != null) {
			local203 = local13 / LoginManager.aClass3_Sub2_Sub1_8.width;
			for (local219 = 0; local219 < local203; local219++) {
				LoginManager.aClass3_Sub2_Sub1_8.drawSprite(local3 + LoginManager.aClass3_Sub2_Sub1_8.width * local219, local11 + local9 + -LoginManager.aClass3_Sub2_Sub1_8.height);
			}
			local219 = (local11 - 20) / LoginManager.aClass3_Sub2_Sub1_6.height;
			for (local418 = 0; local418 < local219; local418++) {
				LoginManager.aClass3_Sub2_Sub1_6.drawSprite(local3, local9 + local418 * LoginManager.aClass3_Sub2_Sub1_6.height + 20);
				LoginManager.aClass3_Sub2_Sub1_6.method1421(local3 + local13 - LoginManager.aClass3_Sub2_Sub1_6.width, local9 + 20 + local418 * LoginManager.aClass3_Sub2_Sub1_6.height);
			}
			LoginManager.aClass3_Sub2_Sub1_10.drawSprite(local3, local11 + local9 - LoginManager.aClass3_Sub2_Sub1_10.height);
			LoginManager.aClass3_Sub2_Sub1_10.method1421(local3 + local13 - LoginManager.aClass3_Sub2_Sub1_10.width, local9 - -local11 + -LoginManager.aClass3_Sub2_Sub1_10.height);
		}
		for (local203 = 0; local203 < MiniMenu.menuActionRow; local203++) {
			local219 = (MiniMenu.menuActionRow - local203 - 1) * 15 + local9 + 35;
			local418 = Static195.anInt4581;
			if (local3 < local112 && local13 + local3 > local112 && local219 - 13 < local114 && local114 < local219 + 3) {
				local418 = Static262.anInt5752;
			}
			Fonts.b12Full.drawString(Static269.method2228(local203), local3 + 3, local219, local418, 0);
		}
		Static121.method2407(Static183.anInt4271, Static229.anInt5138, Static13.anInt436, Static24.anInt761);
	}

}
