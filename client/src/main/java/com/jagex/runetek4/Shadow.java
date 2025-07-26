package com.jagex.runetek4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import com.jagex.runetek4.core.io.Packet;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL12.GL_CLAMP_TO_EDGE;
import static org.lwjgl.opengl.GL15.*;

@OriginalClass("client!wm")
public final class Shadow {

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "[B")
	public static final byte[] pixels = new byte[16384];

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "Lclient!vi;")
	private GlVertexBufferObject aClass155_6;

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer11;

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer12;

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "Lclient!vi;")
	private GlVertexBufferObject aClass155_7;

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "Z")
	public boolean outputToSprite = true;

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
	private int anInt5902 = -1;

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
	private final int anInt5901;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V")
	public Shadow() {
		@Pc(12) int[] local12 = new int[1];
		glGenTextures(local12);
		this.anInt5901 = local12[0];
		GlCleaner.oncard_texture += 16384;
		GlRenderer.setTextureId(this.anInt5901);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_EDGE);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP_TO_EDGE);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([[III)V")
	public final void method4676(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Packet packet = new Packet(1620);
		@Pc(11) int local11;
		for (@Pc(6) int local6 = 0; local6 <= 8; local6++) {
			for (local11 = 0; local11 <= 8; local11++) {
				if (GlRenderer.bigEndian) {
					packet.pFloat((float) local11 / 8.0F);
					packet.pFloat((float) local6 / 8.0F);
					packet.pFloat((float) (local11 * 128));
					packet.pFloat((float) arg0[local11 + arg1][local6 + arg2]);
					packet.pFloat((float) (local6 * 128));
				} else {
					packet.gFloat((float) local11 / 8.0F);
					packet.gFloat((float) local6 / 8.0F);
					packet.gFloat((float) (local11 * 128));
					packet.gFloat((float) arg0[local11 + arg1][local6 + arg2]);
					packet.gFloat((float) (local6 * 128));
				}
			}
		}
		if (GlRenderer.arbVboSupported) {
			@Pc(112) ByteBuffer local112 = ByteBuffer.wrap(packet.data, 0, packet.offset);
			this.aClass155_7 = new GlVertexBufferObject();
			this.aClass155_7.setArrayBuffer(local112);
		} else {
			this.aByteBuffer12 = ByteBuffer.allocateDirect(packet.offset).order(ByteOrder.nativeOrder());
			this.aByteBuffer12.put(packet.data, 0, packet.offset);
			this.aByteBuffer12.flip();
		}
		@Pc(147) Packet packet1 = new Packet(1536);
		for (local11 = 0; local11 < 8; local11++) {
			for (@Pc(154) int local154 = 0; local154 < 8; local154++) {
				if (GlRenderer.bigEndian) {
					packet1.p4(local154 + (local11 + 1) * 9);
					packet1.p4(local154 + local11 * 9);
					packet1.p4(local154 + local11 * 9 + 1);
					packet1.p4(local154 + (local11 + 1) * 9);
					packet1.p4(local154 + local11 * 9 + 1);
					packet1.p4(local154 + (local11 + 1) * 9 + 1);
				} else {
					packet1.p4le(local154 + (local11 + 1) * 9);
					packet1.p4le(local154 + local11 * 9);
					packet1.p4le(local154 + local11 * 9 + 1);
					packet1.p4le(local154 + (local11 + 1) * 9);
					packet1.p4le(local154 + local11 * 9 + 1);
					packet1.p4le(local154 + (local11 + 1) * 9 + 1);
				}
			}
		}
		if (GlRenderer.arbVboSupported) {
			@Pc(293) ByteBuffer local293 = ByteBuffer.wrap(packet1.data, 0, packet1.offset);
			this.aClass155_6 = new GlVertexBufferObject();
			this.aClass155_6.setElementArrayBuffer(local293);
		} else {
			this.aByteBuffer11 = ByteBuffer.allocateDirect(packet1.offset).order(ByteOrder.nativeOrder());
			this.aByteBuffer11.put(packet1.data, 0, packet1.offset);
			this.aByteBuffer11.flip();
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!ek;II)Z")
	public final boolean method4677(@OriginalArg(0) SoftwareIndexedSprite arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) byte[] local2 = arg0.pixels;
		@Pc(5) int local5 = arg0.width;
		@Pc(19) int local19 = arg1 * 128 + (arg2 * 128 + 1) * local5 + 1;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23;
		@Pc(33) int local33;
		for (local23 = -128; local23 < 0; local23++) {
			local21 = (local21 << 8) - local21;
			for (local33 = -128; local33 < 0; local33++) {
				if (local2[local19++] != 0) {
					local21++;
				}
			}
			local19 += local5 - 128;
		}
		if (local21 == this.anInt5902) {
			return false;
		}
		this.anInt5902 = local21;
		local19 = arg1 * 128 + (arg2 * 128 + 1) * local5 + 1;
		local23 = 0;
		for (local33 = -128; local33 < 0; local33++) {
			for (@Pc(82) int local82 = -128; local82 < 0; local82++) {
				if (local2[local19] == 0) {
					@Pc(96) int local96 = 0;
					if (local2[local19 - 1] != 0) {
						local96++;
					}
					if (local2[local19 + 1] != 0) {
						local96++;
					}
					if (local2[local19 - local5] != 0) {
						local96++;
					}
					if (local2[local19 + local5] != 0) {
						local96++;
					}
					pixels[local23++] = (byte) (local96 * 17);
				} else {
					pixels[local23++] = 68;
				}
				local19++;
			}
			local19 += local5 - 128;
		}
		@Pc(148) ByteBuffer local148 = ByteBuffer.allocateDirect(128 * 128);
		local148.put(pixels);
		local148.flip();

		GlRenderer.setTextureId(this.anInt5901);
		glTexImage2D(GL_TEXTURE_2D, 0, GL_ALPHA, 128, 128, 0, GL_ALPHA, GL_UNSIGNED_BYTE, local148);
		return true;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "()V")
	public final void method4679() {
		GlRenderer.setTextureId(this.anInt5901);
		if (this.aClass155_7 == null) {
			if (GlRenderer.arbVboSupported) {
				glBindBuffer(GL_ARRAY_BUFFER, 0);
			}
			glInterleavedArrays(GL_T2F_V3F, 20, this.aByteBuffer12);
			GlRenderer.normalArrayEnabled = false;
		} else {
			this.aClass155_7.bindArray();
			glInterleavedArrays(GL_T2F_V3F, 20, 0L);
			GlRenderer.normalArrayEnabled = false;
		}
		if (this.aClass155_6 == null) {
			if (GlRenderer.arbVboSupported) {
				glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, 0);
			}
			GlRenderer.glDrawElementsWrapper(GL_TRIANGLES, 384, GL_UNSIGNED_INT, this.aByteBuffer11);
		} else {
			this.aClass155_6.bindElementArray();
			glDrawElements(GL_TRIANGLES, 384, GL_UNSIGNED_INT, 0L);
		}
	}
}
