package com.jagex.runetek4;

import com.jagex.runetek4.core.io.Packet;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLCapabilities;

import static org.lwjgl.opengl.GL11.glGetFloatv;
import static org.lwjgl.opengl.GL14.*;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.nio.FloatBuffer;

@OriginalClass("client!ga")
public final class ParticleSystem extends ParticleNode {

	static {
		new SecondaryHashTable(8);
		new Packet(131056);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "()V")
	public static void load() {
		GLCapabilities caps = GL.getCapabilities();

		if (caps.GL_ARB_point_parameters) {
			@Pc(20) float[] coefficients = new float[] { 1.0F, 0.0F, 5.0E-4F };
			glPointParameterfv(GL_POINT_DISTANCE_ATTENUATION, coefficients);
			@Pc(28) FloatBuffer buffer = BufferUtils.createFloatBuffer(1);
			glGetFloatv(GL_POINT_SIZE_MAX, buffer);
			@Pc(36) float pointSizeMax = buffer.get(0);
			if (pointSizeMax > 1024.0F) {
				pointSizeMax = 1024.0F;
			}
			glPointParameterf(GL_POINT_SIZE_MIN, 1.0F);
			glPointParameterf(GL_POINT_SIZE_MAX, pointSizeMax);
		}
		if (caps.GL_ARB_point_sprite) {
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "()V")
	public static void quit() {
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "()V")
	public final void method1646() {
	}
}
