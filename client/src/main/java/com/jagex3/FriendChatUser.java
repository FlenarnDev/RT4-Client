package com.jagex3;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex3.client.client!kl")
public final class FriendChatUser extends Linkable {

	@OriginalMember(owner = "com.jagex3.client.client!kl", name = "p", descriptor = "B")
	public byte rank;

	@OriginalMember(owner = "com.jagex3.client.client!kl", name = "q", descriptor = "Lclient!na;")
	public JagString aClass100_635;

	@OriginalMember(owner = "com.jagex3.client.client!kl", name = "t", descriptor = "Lclient!na;")
	public JagString displayName;

	@OriginalMember(owner = "com.jagex3.client.client!kl", name = "x", descriptor = "I")
	public int world;
}
