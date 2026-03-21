package com.jagex3;

import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex3.client.client!uc")
public abstract class MouseWheelInterface {

    @OriginalMember(owner = "com.jagex3.client.client!dh", name = "a", descriptor = "(B)Lclient!uc;")
    public static MouseWheelInterface create() {
        try {
            return (MouseWheelInterface) Class.forName("com.jagex3.ClientMouseWheelListener").getDeclaredConstructor().newInstance();
        } catch (@Pc(15) Throwable local15) {
            return null;
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!uc", name = "a", descriptor = "(I)I")
	public abstract int getRotation();

	@OriginalMember(owner = "com.jagex3.client.client!uc", name = "a", descriptor = "(ZLjava/awt/deob.Component;)V")
	public abstract void removeListeners(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "com.jagex3.client.client!uc", name = "a", descriptor = "(Ljava/awt/deob.Component;I)V")
	public abstract void addListeners(@OriginalArg(0) Component arg0);
}
