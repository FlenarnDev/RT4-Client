package com.jagex.runetek4;

import com.jagex.runetek4.core.datastruct.IntWrapper;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import static org.lwjgl.opengl.GL11.glDeleteLists;
import static org.lwjgl.opengl.GL11.glDeleteTextures;
import static org.lwjgl.opengl.GL15.glDeleteBuffers;

public class GlCleaner {
    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Lclient!ih;")
    static final LinkedList buffers = new LinkedList();

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "Lclient!ih;")
    static final LinkedList textures2d = new LinkedList();

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Lclient!ih;")
    static final LinkedList textures = new LinkedList();

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "Lclient!ih;")
    static final LinkedList lists = new LinkedList();

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "[I")
    private static final int[] ids = new int[1000];

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int oncard_2d = 0;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int contextId = 0;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int oncard_geometry = 0;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int oncard_texture = 0;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "J")
    private static long lastGcTime = 0L;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "()V")
    public static synchronized void process() {
        @Pc(3) int n = 0;
        while (true) {
            @Pc(8) IntWrapper buffer = (IntWrapper) buffers.removeHead();
            if (buffer == null) {
                if (n > 0) {
                    glDeleteBuffers(ids);
                    n = 0;
                }
                while (true) {
                    buffer = (IntWrapper) textures2d.removeHead();
                    if (buffer == null) {
                        while (true) {
                            buffer = (IntWrapper) textures.removeHead();
                            if (buffer == null) {
                                if (n > 0) {
                                    glDeleteTextures(ids);
                                }
                                while (true) {
                                    buffer = (IntWrapper) lists.removeHead();
                                    if (buffer == null) {
                                        if (oncard_geometry + oncard_2d + oncard_texture > 0x6000000 && MonotonicTime.currentTimeMillis() > lastGcTime + 60000L) {
                                            System.gc();
                                            lastGcTime = MonotonicTime.currentTimeMillis();
                                        }
                                        return;
                                    }
                                    @Pc(126) int id = (int) buffer.nodeId;
                                    glDeleteLists(id, 1);
                                }
                            }
                            ids[n++] = (int) buffer.nodeId;
                            oncard_texture -= buffer.value;
                            if (n == 1000) {
                                glDeleteTextures(ids);
                                n = 0;
                            }
                        }
                    }
                    ids[n++] = (int) buffer.nodeId;
                    oncard_2d -= buffer.value;
                    if (n == 1000) {
                        glDeleteTextures(ids);
                        n = 0;
                    }
                }
            }
            ids[n++] = (int) buffer.nodeId;
            oncard_geometry -= buffer.value;
            if (n == 1000) {
                glDeleteBuffers(ids);
                n = 0;
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V")
    public static synchronized void deleteTexture(@OriginalArg(0) int id, @OriginalArg(1) int size, @OriginalArg(2) int contextId) {
        if (contextId == GlCleaner.contextId) {
            @Pc(8) IntWrapper intWrapper = new IntWrapper(size);
            intWrapper.nodeId = id;
            textures.addTail(intWrapper);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
    public static synchronized void deleteList(@OriginalArg(0) int id, @OriginalArg(1) int contextId) {
        if (contextId == GlCleaner.contextId) {
            @Pc(7) IntWrapper intWrapper = new IntWrapper();
            intWrapper.nodeId = id;
            lists.addTail(intWrapper);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "()V")
    public static synchronized void clear() {
        contextId++;
        buffers.clear();
        textures2d.clear();
        textures.clear();
        lists.clear();
        oncard_geometry = 0;
        oncard_2d = 0;
        oncard_texture = 0;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(III)V")
    public static synchronized void deleteBuffer(@OriginalArg(0) int id, @OriginalArg(1) int size, @OriginalArg(2) int contextId) {
        if (contextId == GlCleaner.contextId) {
            @Pc(8) IntWrapper intWrapper = new IntWrapper(size);
            intWrapper.nodeId = id;
            buffers.addTail(intWrapper);
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(III)V")
    public static synchronized void deleteTexture2d(@OriginalArg(0) int id, @OriginalArg(1) int size, @OriginalArg(2) int contextId) {
        if (contextId == GlCleaner.contextId) {
            @Pc(8) IntWrapper intWrapper = new IntWrapper(size);
            intWrapper.nodeId = id;
            textures2d.addTail(intWrapper);
        }
    }
}
