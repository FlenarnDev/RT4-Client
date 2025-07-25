package com.jagex.runetek4;

import java.nio.ByteBuffer;


import static org.lwjgl.opengl.GL15.*;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public final class GlVertexBufferObject {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
	private int id;

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
	private final int contextId;

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
	private int size;

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "Z")
	private final boolean stream;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	public GlVertexBufferObject() {
		this(false);
	}

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Z)V")
	public GlVertexBufferObject(@OriginalArg(0) boolean stream) {
		this.id = -1;
		this.size = 0;

		this.id = glGenBuffers();
		this.stream = stream;
		this.contextId = GlCleaner.contextId;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public final void updateArrayBuffer(@OriginalArg(0) ByteBuffer buffer) {
		if (buffer.limit() <= this.size) {
			glBindBuffer(GL_ARRAY_BUFFER, this.id);
			glBufferSubData(GL_ARRAY_BUFFER, 0, buffer);
		} else {
			this.setArrayBuffer(buffer);
		}
	}

	@OriginalMember(owner = "client!vi", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.id != -1) {
			GlCleaner.deleteBuffer(this.id, this.size, this.contextId);
			this.id = -1;
			this.size = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "()V")
	public final void bindArray() {
		glBindBuffer(GL_ARRAY_BUFFER, this.id);
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public final void setElementArrayBuffer(@OriginalArg(0) ByteBuffer buffer) {
		glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, this.id);
		glBufferData(GL_ELEMENT_ARRAY_BUFFER, buffer, this.stream ? GL_STREAM_DRAW : GL_STATIC_DRAW);
		GlCleaner.oncard_geometry += buffer.limit() - this.size;
		this.size = buffer.limit();
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "()V")
	public final void bindElementArray() {
		glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, this.id);
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public final void setArrayBuffer(@OriginalArg(0) ByteBuffer buffer) {
		glBindBuffer(GL_ARRAY_BUFFER, this.id);
		glBufferData(GL_ARRAY_BUFFER, buffer, this.stream ? GL_STREAM_DRAW : GL_STATIC_DRAW);
		GlCleaner.oncard_geometry += buffer.limit() - this.size;
		this.size = buffer.limit();
	}
}