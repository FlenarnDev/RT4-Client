package com.jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex3.client.client!ih")
public final class LinkList {

	@OriginalMember(owner = "com.jagex3.client.client!ih", name = "p", descriptor = "Lclient!ab;")
	private Linkable aClass3_110;

	@OriginalMember(owner = "com.jagex3.client.client!ih", name = "m", descriptor = "Lclient!ab;")
	public final Linkable aClass3_109 = new Linkable();

	@OriginalMember(owner = "com.jagex3.client.client!ih", name = "<init>", descriptor = "()V")
	public LinkList() {
		this.aClass3_109.aClass3_223 = this.aClass3_109;
		this.aClass3_109.aClass3_222 = this.aClass3_109;
	}

	@OriginalMember(owner = "com.jagex3.client.client!ih", name = "a", descriptor = "(I)V")
	public final void method2278() {
		while (true) {
			@Pc(5) Linkable local5 = this.aClass3_109.aClass3_222;
			if (local5 == this.aClass3_109) {
				this.aClass3_110 = null;
				return;
			}
			local5.unlink();
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!ih", name = "b", descriptor = "(I)Lclient!ab;")
	public final Linkable method2279() {
		@Pc(7) Linkable local7 = this.aClass3_109.aClass3_223;
		if (this.aClass3_109 == local7) {
			this.aClass3_110 = null;
			return null;
		} else {
			this.aClass3_110 = local7.aClass3_223;
			return local7;
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!ih", name = "a", descriptor = "(ZLclient!ab;)V")
	public final void push(@OriginalArg(1) Linkable arg0) {
		if (arg0.aClass3_223 != null) {
			arg0.unlink();
		}
		arg0.aClass3_222 = this.aClass3_109;
		arg0.aClass3_223 = this.aClass3_109.aClass3_223;
		arg0.aClass3_223.aClass3_222 = arg0;
		arg0.aClass3_222.aClass3_223 = arg0;
	}

	@OriginalMember(owner = "com.jagex3.client.client!ih", name = "a", descriptor = "(ILclient!ab;)V")
	public final void pushFront(@OriginalArg(1) Linkable arg0) {
		if (arg0.aClass3_223 != null) {
			arg0.unlink();
		}
		arg0.aClass3_222 = this.aClass3_109.aClass3_222;
		arg0.aClass3_223 = this.aClass3_109;
		arg0.aClass3_223.aClass3_222 = arg0;
		arg0.aClass3_222.aClass3_223 = arg0;
	}

	@OriginalMember(owner = "com.jagex3.client.client!ih", name = "d", descriptor = "(I)Lclient!ab;")
	public final Linkable method2286() {
		@Pc(13) Linkable local13 = this.aClass3_110;
		if (this.aClass3_109 == local13) {
			this.aClass3_110 = null;
			return null;
		} else {
			this.aClass3_110 = local13.aClass3_223;
			return local13;
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!ih", name = "a", descriptor = "(B)Lclient!ab;")
	public final Linkable popFront() {
		@Pc(3) Linkable local3 = this.aClass3_109.aClass3_222;
		if (this.aClass3_109 == local3) {
			return null;
		} else {
			local3.unlink();
			return local3;
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!ih", name = "e", descriptor = "(I)Lclient!ab;")
	public final Linkable next() {
		@Pc(12) Linkable local12 = this.aClass3_110;
		if (local12 == this.aClass3_109) {
			this.aClass3_110 = null;
			return null;
		} else {
			this.aClass3_110 = local12.aClass3_222;
			return local12;
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!ih", name = "f", descriptor = "(I)Lclient!ab;")
	public final Linkable head() {
		@Pc(3) Linkable local3 = this.aClass3_109.aClass3_222;
		if (this.aClass3_109 == local3) {
			this.aClass3_110 = null;
			return null;
		} else {
			this.aClass3_110 = local3.aClass3_222;
			return local3;
		}
	}
}
