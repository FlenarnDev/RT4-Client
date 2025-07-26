package com.jagex.runetek4;

import java.awt.Canvas;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

import com.jagex.runetek4.client.GameShell;
import com.jagex.runetek4.client.Preferences;
import com.jagex.runetek4.util.ThreadUtils;
import com.jogamp.nativewindow.awt.AWTGraphicsConfiguration;
import com.jogamp.nativewindow.awt.JAWTWindow;
import com.jogamp.opengl.*;
import jogamp.newt.awt.NewtFactoryAWT;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import org.lwjgl.opengl.GL;
import org.lwjgl.glfw.GLFWErrorCallback;

import static org.lwjgl.opengl.GL20.GL_MAX_TEXTURE_COORDS;
import static org.lwjgl.opengl.GL20.GL_MAX_TEXTURE_IMAGE_UNITS;
import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.system.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL13.*;
import static org.lwjgl.opengl.GL13C.glActiveTexture;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public final class GlRenderer {

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "Ljava/lang/String;")
	private static String vendor;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "Ljava/lang/String;")
	private static String renderer;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "F")
	private static float depthScaleFactor;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
	public static int maxTextureUnits;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Z")
	public static boolean bigEndian;

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "F")
	private static float scaledFarClipDistance;

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "Lgl!javax/media/opengl/GLContext;")
	private static GLContext context;

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "Z")
	public static boolean extTexture3dSupported;

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "Lgl!javax/media/opengl/GL;")
	public static GL2 gl;

	@OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
	private static int maxTextureImageUnits;

	@OriginalMember(owner = "client!tf", name = "y", descriptor = "Z")
	public static boolean arbMultisampleSupported;

	@OriginalMember(owner = "client!tf", name = "z", descriptor = "I")
	public static int anInt5328;

	@OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
	public static int canvasHeight;

	@OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
	private static int version;

	@OriginalMember(owner = "client!tf", name = "C", descriptor = "Z")
	public static boolean arbVboSupported;

	@OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
	private static int maxTextureCoords;

	@OriginalMember(owner = "client!tf", name = "E", descriptor = "Lgl!javax/media/opengl/GLDrawable;")
	private static GLDrawable drawable;

	@OriginalMember(owner = "client!tf", name = "H", descriptor = "Z")
	public static boolean arbVertexProgramSupported;

	@OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
	public static int canvasWidth;

	@OriginalMember(owner = "client!tf", name = "K", descriptor = "Z")
	public static boolean arbTextureCubeMapSupported;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "Z")
	private static boolean textureMatrixModified = false;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
	public static int anInt5323 = 0;

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
	private static int textureCombineAlphaMode = 0;

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
	private static int textureCombineRgbMode = 0;

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "F")
	private static float depthAdjustmentFactor = 0.0F;

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "Z")
	private static boolean lightingEnabled = true;

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "F")
	private static float depthAdjustmentParameter = 0.0F;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "Z")
	public static boolean normalArrayEnabled = true;

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "Z")
	private static boolean isOrthoViewConfigured = false;

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "F")
	private static final float aFloat34 = 0.09765625F;

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
	private static int textureId = -1;

	@OriginalMember(owner = "client!tf", name = "u", descriptor = "Z")
	private static boolean depthTestEnabled = true;

	@OriginalMember(owner = "client!tf", name = "w", descriptor = "Z")
	public static boolean enabled = false;

	@OriginalMember(owner = "client!tf", name = "x", descriptor = "[F")
	private static final float[] matrix = new float[16];

	@OriginalMember(owner = "client!tf", name = "F", descriptor = "Z")
	private static boolean fogEnabled = true;

	@OriginalMember(owner = "client!tf", name = "I", descriptor = "Lclient!na;")
	private static final JString RADEON = JString.parse("radeon");

	private static JAWTWindow window;

	private static long LWJGLWindow;

	public static int leftMargin;

	public static int topMargin;

	public static int viewportWidth;

	public static int viewportHeight;

	public static void glDrawElementsWrapper(int mode, int count, int type, java.nio.Buffer buffer) {
		long pointer = MemoryUtil.memAddress(buffer);
		glDrawElements(mode, count, type, pointer);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIII)V")
	public static void method4148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		setupViewTransformations(0, 0, canvasWidth, canvasHeight, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "()V")
	public static void setupRgbAlphaMode1Rendering() {
		MaterialManager.setMaterial(0, 0);
		configureOrthographicView();
		setTextureCombineRgbMode(1);
		setTextureCombineAlphaMode(1);
		setLightingEnabled(false);
		setDepthTestEnabled(false);
		setFogEnabled(false);
		resetTextureMatrix();
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "()V")
	public static void resetTextureMatrix() {
		if (textureMatrixModified) {
			glMatrixMode(GL_TEXTURE);
			glLoadIdentity();
			glMatrixMode(GL_MODELVIEW);
			textureMatrixModified = false;
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "()V")
	public static void setupRgbAlphaMode0Rendering() {
		MaterialManager.setMaterial(0, 0);
		configureOrthographicView();
		setTextureCombineRgbMode(0);
		setTextureCombineAlphaMode(0);
		setLightingEnabled(false);
		setDepthTestEnabled(false);
		setFogEnabled(false);
		resetTextureMatrix();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(FF)V")
	public static void configureDepthAdjustment(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (isOrthoViewConfigured || arg0 == depthAdjustmentParameter && arg1 == depthAdjustmentFactor) {
			return;
		}
		depthAdjustmentParameter = arg0;
		depthAdjustmentFactor = arg1;
		if (arg1 == 0.0F) {
			matrix[10] = depthScaleFactor;
			matrix[14] = scaledFarClipDistance;
		} else {
			@Pc(25) float depthRatio = arg0 / (arg1 + arg0);
			@Pc(29) float depthRatioSquared = depthRatio * depthRatio;
			@Pc(42) float depthAdjustment = -scaledFarClipDistance * (1.0F - depthRatio) * (1.0F - depthRatio) / arg1;
			matrix[10] = depthScaleFactor + depthAdjustment;
			matrix[14] = scaledFarClipDistance * depthRatioSquared;
		}
		glMatrixMode(GL_PROJECTION);
		glLoadMatrixf(matrix);
		glMatrixMode(GL_MODELVIEW);
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "()V")
	public static void swapBuffers() {
		try {
			//drawable.swapBuffers();

			if (!glfwWindowShouldClose(LWJGLWindow)) {
				glfwSwapBuffers(LWJGLWindow);

				glfwPollEvents();
			}

		} catch (@Pc(3) Exception local3) {
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
	public static void setFogEnabled(@OriginalArg(0) boolean enabled) {
		if (enabled == fogEnabled) {
			return;
		}
		if (enabled) {
			glEnable(GL_FOG);
		} else {
			glDisable(GL_FOG);
		}
		fogEnabled = enabled;
	}

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "()V")
	public static void method4155() {
		MaterialManager.setMaterial(0, 0);
		configureOrthographicView();
		setTextureCombineRgbMode(0);
		setTextureCombineAlphaMode(0);
		setLightingEnabled(false);
		setDepthTestEnabled(false);
		setFogEnabled(false);
		resetTextureMatrix();
	}

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "()V")
	private static void resetOpenGLState() {
		isOrthoViewConfigured = false;

		glDisable(GL_TEXTURE_2D);
		textureId = -1;

		glTexEnvi(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_COMBINE);
		glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_MODULATE);
		textureCombineRgbMode = 0;
		glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_ALPHA, GL_MODULATE);
		textureCombineAlphaMode = 0;
		glEnable(GL_LIGHTING);
		glEnable(GL_FOG);
		glEnable(GL_DEPTH_TEST);
		lightingEnabled = true;
		depthTestEnabled = true;
		fogEnabled = true;
		resetMaterial();
		glActiveTexture(GL_TEXTURE1);
		glTexEnvi(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_COMBINE);
		glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_MODULATE);
		glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_ALPHA, GL_MODULATE);
		glActiveTexture(GL_TEXTURE0);
		gl.setSwapInterval(0);
		glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		glShadeModel(GL_SMOOTH);
		glClearDepth(1.0D);
		glDepthFunc(GL_LEQUAL);
		enableDepthMask();
		glMatrixMode(GL_TEXTURE);
		glLoadIdentity();
		glPolygonMode(GL_FRONT, GL_FILL);
		glEnable(GL_CULL_FACE);
		glCullFace(GL_BACK);
		glEnable(GL_BLEND);
		glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
		glEnable(GL_ALPHA_TEST);
		glAlphaFunc(GL_GREATER, 0.0F);
		glEnableClientState(GL_VERTEX_ARRAY);
		glEnableClientState(GL_NORMAL_ARRAY);
		normalArrayEnabled = true;
		glEnableClientState(GL_COLOR_ARRAY);
		glEnableClientState(GL_TEXTURE_COORD_ARRAY);
		glMatrixMode(GL_MODELVIEW);
		glLoadIdentity();
		FogManager.setup();
		LightingManager.resetLightningState();
	}

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "()V")
	public static void enableDepthMask() {
		glDepthMask(true);
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(Z)V")
	public static void setDepthTestEnabled(@OriginalArg(0) boolean enabled) {
		if (enabled == depthTestEnabled) {
			return;
		}
		if (enabled) {
			glEnable(GL_DEPTH_TEST);
		} else {
			glDisable(GL_DEPTH_TEST);
		}
		depthTestEnabled = enabled;
	}

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "()V")
	public static void draw() {

		IntBuffer drawBuffer = BufferUtils.createIntBuffer(1);
		IntBuffer readBuffer = BufferUtils.createIntBuffer(1);

		glGetIntegerv(GL_DRAW_BUFFER, drawBuffer);
		glGetIntegerv(GL_READ_BUFFER, readBuffer);

		@Pc(2) int[] ints = new int[2];
		ints[0] = drawBuffer.get(0);
		ints[1] = readBuffer.get(0);

		glDrawBuffer(GL_BACK_LEFT);
		glReadBuffer(GL_FRONT_LEFT);
		setTextureId(-1);
		glPushAttrib(GL_ENABLE_BIT);
		glDisable(GL_FOG);
		glDisable(GL_BLEND);
		glDisable(GL_DEPTH_TEST);
		glDisable(GL_ALPHA_TEST);
		glRasterPos2i(0, 0);
		glCopyPixels(0, 0, canvasWidth, canvasHeight, GL_COLOR);
		glPopAttrib();
		glDrawBuffer(ints[0]);
		glReadBuffer(ints[1]);
	}

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "()V")
	public static void method4162() {
		MaterialManager.setMaterial(0, 0);
		configureOrthographicView();
		setTextureId(-1);
		setLightingEnabled(false);
		setDepthTestEnabled(false);
		setFogEnabled(false);
		resetTextureMatrix();
	}

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "()V")
	private static void configureOrthographicView() {
		if (isOrthoViewConfigured) {
			return;
		}
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0.0D, canvasWidth, 0.0D, canvasHeight, -1.0D, 1.0D);
		setViewportBounds(0, 0, canvasWidth, canvasHeight);
		glMatrixMode(GL_MODELVIEW);
		glLoadIdentity();
		isOrthoViewConfigured = true;
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(Z)V")
	public static void setLightingEnabled(@OriginalArg(0) boolean enabled) {
		if (enabled == lightingEnabled) {
			return;
		}
		if (enabled) {
			glEnable(GL_LIGHTING);
		} else {
			glDisable(GL_LIGHTING);
		}
		lightingEnabled = enabled;
	}

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "()F")
	public static float method4166() {
		return depthAdjustmentFactor;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public static void createAndDestroyContext(@OriginalArg(0) Canvas canvas) {
		try {
			if (!canvas.isDisplayable()) {
				return;
			}
			GLProfile profile = GLProfile.getDefault();

			GLCapabilities glCaps = new GLCapabilities(profile);
			AWTGraphicsConfiguration config = AWTGraphicsConfiguration.create(canvas.getGraphicsConfiguration(), glCaps, glCaps);
			JAWTWindow jawtWindow = NewtFactoryAWT.getNativeWindow(canvas, config);
			@Pc(5) GLDrawableFactory glDrawableFactory = GLDrawableFactory.getFactory(profile);
			@Pc(11) GLDrawable glDrawable = glDrawableFactory.createGLDrawable(jawtWindow);

			glDrawable.setRealized(true);
			@Pc(18) GLContext glContext = glDrawable.createContext(null);
			glContext.makeCurrent();
			glContext.release();
			glContext.destroy();
			glDrawable.setRealized(false);
		} catch (@Pc(30) Throwable ex) {
		}
	}

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "()I")
	private static int checkContext() {
		@Pc(1) int result = 0;
		vendor = glGetString(GL_VENDOR);
		renderer = glGetString(GL_RENDERER);
		@Pc(12) String vendor = GlRenderer.vendor.toLowerCase();
		if (vendor.contains("microsoft")) {
			result = 1;
		}
		if (vendor.contains("brian paul") || vendor.contains("mesa")) {
			result |= 0x1;
		}
		@Pc(39) String version = glGetString(GL_VERSION);
		@Pc(43) String[] versionParts = version.split("[. ]");
		if (versionParts.length >= 2) {
			try {
				@Pc(52) int major = Integer.parseInt(versionParts[0]);
				@Pc(57) int minor = Integer.parseInt(versionParts[1]);
				GlRenderer.version = major * 10 + minor;
			} catch (@Pc(65) NumberFormatException ex) {
				result |= 0x4;
			}
		} else {
			result |= 0x4;
		}
		if (GlRenderer.version < 12) {
			result |= 0x2;
		}

		org.lwjgl.opengl.GLCapabilities capabilities = GL.getCapabilities();

		if (!capabilities.GL_ARB_multitexture) {
			result |= 0x8;
		}

		if (!capabilities.GL_ARB_texture_env_combine) {
			result |= 0x20;
		}

		@Pc(100) int[] data = new int[1];
		glGetIntegerv(GL_MAX_TEXTURE_UNITS, data);
		maxTextureUnits = data[0];
		glGetIntegerv(GL_MAX_TEXTURE_COORDS, data);
		maxTextureCoords = data[0];
		glGetIntegerv(GL_MAX_TEXTURE_IMAGE_UNITS, data);
		maxTextureImageUnits = data[0];
		if (maxTextureUnits < 2 || maxTextureCoords < 2 || maxTextureImageUnits < 2) {
			result |= 0x10;
		}
		if (result != 0) {
			return result;
		}
		bigEndian = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		arbVboSupported = capabilities.GL_ARB_vertex_buffer_object;
		arbMultisampleSupported = capabilities.GL_ARB_multisample;
		arbTextureCubeMapSupported = capabilities.GL_ARB_texture_cube_map;
		arbVertexProgramSupported = capabilities.GL_ARB_vertex_program;
		extTexture3dSupported = gl.isExtensionAvailable("GL_EXT_texture3D");
		@Pc(176) JString renderer = JString.convertStringToJString(GlRenderer.renderer).toLowerCase();
		if (renderer.indexOf(RADEON) != -1) {
			@Pc(184) int v = 0;
			@Pc(193) JString[] rendererParts = renderer.replaceSlashWithSpace().split(32);
			for (@Pc(195) int i = 0; i < rendererParts.length; i++) {
				@Pc(203) JString part = rendererParts[i];
				if (part.length() >= 4 && part.substring(4, 0).isInt()) {
					v = part.substring(4, 0).parseInt();
					break;
				}
			}
			if (v >= 7000 && v <= 7999) {
				arbVboSupported = false;
			}
			if (v >= 7000 && v <= 9250) {
				extTexture3dSupported = false;
			}
			GlModel.arbVboSupported = arbVboSupported;
		}
		if (arbVboSupported) {
			try {
				@Pc(250) int[] temp = new int[1];
				gl.glGenBuffers(1, temp, 0);
			} catch (@Pc(257) Throwable ex) {
				return -4;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "()V")
	public static void clearDepthBuffer() {
		glClear(GL_DEPTH_BUFFER_BIT);
	}

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "()V")
	public static void quit() {
		if (gl != null) {
			try {
				MaterialManager.quit();
			} catch (@Pc(5) Throwable local5) {
			}

			glfwFreeCallbacks(LWJGLWindow);
			glfwDestroyWindow(LWJGLWindow);

			glfwTerminate();
			glfwSetErrorCallback(null).free();
		}

		if (window != null) {
			if (!window.getLock().isLocked()) {
				window.lockSurface();
			}

			if (context != null) {
				GlCleaner.clear();
				try {
					if (GLContext.getCurrent() == context) {
						context.release();
					}
				} catch (@Pc(17) Throwable ex) {
				}
				try {
					context.destroy();
				} catch (@Pc(21) Throwable ex) {
				}
			}
		}

		if (drawable != null) {
			try {
				drawable.setRealized(false);
			} catch (@Pc(30) Throwable ex) {
			}
		}
		window = null;
		gl = null;
		context = null;
		drawable = null;
		LightingManager.releaseLighting();
		enabled = false;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(FFF)V")
	public static void translateTextureMatrix(@OriginalArg(0) float x, @OriginalArg(1) float y, @OriginalArg(2) float z) {
		glMatrixMode(GL_TEXTURE);
		if (textureMatrixModified) {
			glLoadIdentity();
		}
		glTranslatef(x, y, z);
		glMatrixMode(GL_MODELVIEW);
		textureMatrixModified = true;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIFFII)V")
	public static void setupViewTransformations(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float rotationX, @OriginalArg(7) float rotationY, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int scaledBoxStartX = (arg0 - arg4 << 8) / arg8;
		@Pc(17) int scaledBoxEndX = (arg0 + arg2 - arg4 << 8) / arg8;
		@Pc(25) int scaledBoxStartY = (arg1 - arg5 << 8) / arg9;
		@Pc(35) int scaledBoxEndY = (arg1 + arg3 - arg5 << 8) / arg9;
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		configureProjectionMatrix((float) scaledBoxStartX * aFloat34, (float) scaledBoxEndX * aFloat34, (float) -scaledBoxEndY * aFloat34, (float) -scaledBoxStartY * aFloat34, 50.0F, 3584.0F);
		setViewportBounds(arg0, canvasHeight - arg1 - arg3, arg2, arg3);
		glMatrixMode(GL_MODELVIEW);
		glLoadIdentity();
		glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		if (rotationX != 0.0F) {
			glRotatef(rotationX, 1.0F, 0.0F, 0.0F);
		}
		if (rotationY != 0.0F) {
			glRotatef(rotationY, 0.0F, 1.0F, 0.0F);
		}
		isOrthoViewConfigured = false;
		Rasterizer.screenLowerX = scaledBoxStartX;
		Rasterizer.screenUpperX = scaledBoxEndX;
		Rasterizer.screenLowerY = scaledBoxStartY;
		Rasterizer.screenUpperY = scaledBoxEndY;
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(Z)V")
	private static void setNormalArrayEnabled(@OriginalArg(0) boolean enabled) {
		if (enabled == normalArrayEnabled) {
			return;
		}
		if (enabled) {
			glEnableClientState(GL_NORMAL_ARRAY);
		} else {
			glDisableClientState(GL_NORMAL_ARRAY);
		}
		normalArrayEnabled = enabled;
	}

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "()V")
	public static void restoreLighting() {
		if (Preferences.highDetailLighting) {
			setLightingEnabled(true);
			setNormalArrayEnabled(true);
		} else {
			setLightingEnabled(false);
			setNormalArrayEnabled(false);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	public static void setTextureCombineAlphaMode(@OriginalArg(0) int mode) {
		if (mode == textureCombineAlphaMode) {
			return;
		}
		if (mode == 0) {
			glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_ALPHA, GL_MODULATE);
		}
		if (mode == 1) {
			glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_ALPHA, GL_REPLACE);
		}
		if (mode == 2) {
			glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_ALPHA, GL_ADD);
		}
		textureCombineAlphaMode = mode;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(FFFFFF)V")
	private static void configureProjectionMatrix(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		matrix[0] = local3 / (arg1 - arg0);
		matrix[1] = 0.0F;
		matrix[2] = 0.0F;
		matrix[3] = 0.0F;
		matrix[4] = 0.0F;
		matrix[5] = local3 / (arg3 - arg2);
		matrix[6] = 0.0F;
		matrix[7] = 0.0F;
		matrix[8] = (arg1 + arg0) / (arg1 - arg0);
		matrix[9] = (arg3 + arg2) / (arg3 - arg2);
		matrix[10] = depthScaleFactor = -(arg5 + arg4) / (arg5 - arg4);
		matrix[11] = -1.0F;
		matrix[12] = 0.0F;
		matrix[13] = 0.0F;
		matrix[14] = scaledFarClipDistance = -(local3 * arg5) / (arg5 - arg4);
		matrix[15] = 0.0F;
		glLoadMatrixf(matrix);
		depthAdjustmentParameter = 0.0F;
		depthAdjustmentFactor = 0.0F;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public static void clearColorAndDepthBuffers(@OriginalArg(0) int rgb) {
		glClearColor((float) (rgb >> 16 & 0xFF) / 255.0F, (float) (rgb >> 8 & 0xFF) / 255.0F, (float) (rgb & 0xFF) / 255.0F, 0.0F);
		glClear(GL_DEPTH_BUFFER_BIT | GL_COLOR_BUFFER_BIT);
		glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
	public static void setTextureId(@OriginalArg(0) int id) {
		if (id == textureId) {
			return;
		}
		if (id == -1) {
			glDisable(GL_TEXTURE_2D);
		} else {
			if (textureId == -1) {
				glEnable(GL_TEXTURE_2D);
			}
			glBindTexture(GL_TEXTURE_2D, id);
		}
		textureId = id;
	}

	private static void initLWJGL() {
		// Until Wayland gets its shit together, we have to do this.
		if (glfwPlatformSupported(GLFW_PLATFORM_WAYLAND)) {
			glfwInitHint(GLFW_PLATFORM, GLFW_PLATFORM_X11);
		}

		// Setup an error callback. The default implementation will print the error message in System.err.
		GLFWErrorCallback.createPrint(System.err).set();

		// Initialize GLFW.
		if (!glfwInit()) {
			throw new IllegalStateException("Unable to initialize GLFW");
		}

		// Configure GLFW
		glfwDefaultWindowHints();
		glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE); // Window will stay hidden after creation.
		glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE); // Window will be resizable.

		// Create the window
		LWJGLWindow = glfwCreateWindow(300, 300, "Runescape", NULL, NULL);
		if (LWJGLWindow == NULL) {
			throw new IllegalStateException("Unable to create the GLFW window");
		}

		// Setup a key callback. It will be called every time a key is pressed, repeated or released.
		glfwSetKeyCallback(LWJGLWindow, (window, key, scancode, action, mods) -> {
			if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) {
				glfwSetWindowShouldClose(window, true);
			}
		});

		try (MemoryStack stack = stackPush()) {
			IntBuffer width = stack.mallocInt(1); // int*
			IntBuffer height = stack.mallocInt(1); // int*

			// Get the window size passed to glfwCreateWindow
			glfwGetWindowSize(LWJGLWindow, width, height);

			// Get the resolution of the primary monitor.
			GLFWVidMode vidMode = glfwGetVideoMode(glfwGetPrimaryMonitor());

			// Center the window properly
			glfwSetWindowPos(LWJGLWindow, (vidMode.width() - width.get(0)) / 2, vidMode.height() - height.get(0) / 2);

			// Make the OpenGL context current.
			glfwMakeContextCurrent(LWJGLWindow);

			// Enable V-Sync
			glfwSwapInterval(1);

			// Make the window visible
			glfwShowWindow(LWJGLWindow);

			GL.createCapabilities();
		}
	}

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "()V")
	public static void disableDepthMask() {
		glDepthMask(false);
	}

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "()F")
	public static float method4179() {
		return depthAdjustmentParameter;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/awt/Canvas;I)I")
	public static int init(@OriginalArg(0) Canvas canvas, @OriginalArg(1) int numSamples) {
		try {
			if (!canvas.isDisplayable()) {
				return -1;
			}

			// Create JOGL
			GLProfile profile = GLProfile.get(GLProfile.GL3bc);

			@Pc(8) GLCapabilities capabilities = new GLCapabilities(profile);
			if (numSamples > 0) {
				capabilities.setSampleBuffers(true);
				capabilities.setNumSamples(numSamples);
			}

			@Pc(18) GLDrawableFactory factory = GLDrawableFactory.getFactory(profile);
			AWTGraphicsConfiguration config = AWTGraphicsConfiguration.create(canvas.getGraphicsConfiguration(), capabilities, capabilities);
			window = NewtFactoryAWT.getNativeWindow(canvas, config);

			if (!window.getLock().isLocked()) {
				window.lockSurface();
			}

			try {
				drawable = factory.createGLDrawable(window);
				drawable.setRealized(true);
			} finally {
				window.unlockSurface();
			}

			@Pc(29) int swapBuffersAttempts = 0;
			@Pc(36) int result;
			while (true) {
				context = drawable.createContext(null);
				try {
					result = context.makeCurrent();
					if (result != 0) {
						break;
					}
				} catch (@Pc(41) Exception local41) {
				}
				if (swapBuffersAttempts++ > 5) {
					return -2;
				}
				ThreadUtils.sleep(100L);
			}

			if (window.getLock().isLocked()) {
				window.unlockSurface();
			}

			// Create LWJGL
			System.out.println("Hello from LWJGL version: " + Version.getVersion() + "!");
			initLWJGL();

            gl = GLContext.getCurrentGL().getGL2();

			glLineWidth((float) GameShell.canvasScale);
			enabled = true;
			canvasWidth = canvas.getSize().width;
			canvasHeight = canvas.getSize().height;

			//result = checkContext(); // Should not be needed?

			if (LWJGLWindow == 0) {
				quit();
				return result;
			}

			genTextures();
			resetOpenGLState();
			glClear(GL_COLOR_BUFFER_BIT);
			swapBuffersAttempts = 0;
			while (true) {
				try {
					drawable.swapBuffers();
					break;
				} catch (@Pc(86) Exception ex) {
					if (swapBuffersAttempts++ > 5) {
						quit();
						return -3;
					}
					ThreadUtils.sleep(100L);
				}
			}
			glClear(GL_COLOR_BUFFER_BIT);
			return 0;
		} catch (@Pc(103) Throwable ex) {
			quit();
			return -5;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V")
	public static void setCanvasSize(@OriginalArg(0) int width, @OriginalArg(1) int height) {
		canvasWidth = width;
		canvasHeight = height;
		isOrthoViewConfigured = false;
	}

	public static void setViewportBounds(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height) {
		leftMargin = x;
		topMargin = y;
		viewportWidth = width;
		viewportHeight = height;
		resizeViewport();
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "()V")
	private static void resizeViewport() {
		glViewport((int) (leftMargin * GameShell.canvasScale + GameShell.subpixelX), (int) (topMargin * GameShell.canvasScale + GameShell.subpixelY),
				(int) (viewportWidth * GameShell.canvasScale + GameShell.subpixelX), (int) (viewportHeight * GameShell.canvasScale + GameShell.subpixelY));
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIII)V")
	public static void setupOrthographicProjector(@OriginalArg(0) int xOffset, @OriginalArg(1) int yOffset, @OriginalArg(2) int resolution, @OriginalArg(3) int arg3, @OriginalArg(4) int color, @OriginalArg(5) int cardMemory) {
		@Pc(2) int negXOffset = -xOffset;
		@Pc(6) int adjustedCanvasWidth = canvasWidth - xOffset;
		@Pc(9) int negYOffset = -yOffset;
		@Pc(13) int adjustedCanvasHeight = canvasHeight - yOffset;
		@Pc(23) float resolutionFactor = (float) resolution / 512.0F;
		@Pc(30) float colorDepthFactor = resolutionFactor * (256.0F / (float) color);
		@Pc(37) float memoryFactor = resolutionFactor * (256.0F / (float) cardMemory);
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho((float) negXOffset * colorDepthFactor, (float) adjustedCanvasWidth * colorDepthFactor, (float) -adjustedCanvasHeight * memoryFactor, (float) -negYOffset * memoryFactor, 50 - arg3, 3584 - arg3);
		setViewportBounds(0, 0, canvasWidth, canvasHeight);
		glMatrixMode(GL_MODELVIEW);
		glLoadIdentity();
		glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		isOrthoViewConfigured = false;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(F)V")
	public static void configureFixedDepthAdjustment(@OriginalArg(0) float multiplier) {
		configureDepthAdjustment(3000.0F, multiplier * 1.5F);
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)V")
	public static void setTextureCombineRgbMode(@OriginalArg(0) int mode) {
		if (mode == textureCombineRgbMode) {
			return;
		}
		if (mode == 0) {
			glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_MODULATE);
		}
		if (mode == 1) {
			glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_REPLACE);
		}
		if (mode == 2) {
			glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_ADD);
		}
		if (mode == 3) {
			glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_SUBTRACT);
		}
		if (mode == 4) {
			glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_ADD_SIGNED);
		}
		if (mode == 5) {
			glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_INTERPOLATE);
		}
		textureCombineRgbMode = mode;
	}

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "()V")
	private static void genTextures() {
		IntBuffer textureIdBuffer = BufferUtils.createIntBuffer(1);
		glGenTextures(textureIdBuffer);
		anInt5328 = textureIdBuffer.get(0);

		// Bind texture
		glBindTexture(GL_TEXTURE_2D, anInt5328);

		IntBuffer texData = BufferUtils.createIntBuffer(1);
		texData.put(0xFFFFFFFF).flip();

		glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA8, 1, 1, 0, GL_RGBA, GL_UNSIGNED_BYTE, texData);

		glFinish();

		LightingManager.init();
		MaterialManager.init();
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
	public static void resetMaterial() {
		MaterialManager.setMaterial(0, 0);
	}
}
