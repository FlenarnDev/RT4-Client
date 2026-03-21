package com.jagex3;

import deob.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Rasteriser {

	@OriginalMember(owner = "com.jagex3.client.client!hf", name = "b", descriptor = "I")
	public static int anInt2469;

    @OriginalMember(owner = "com.jagex3.client.client!hf", name = "m", descriptor = "I")
	public static int anInt2471;

	@OriginalMember(owner = "com.jagex3.client.client!hf", name = "n", descriptor = "I")
	public static int anInt2472;

	@OriginalMember(owner = "com.jagex3.client.client!hf", name = "a", descriptor = "[I")
	public static final int[] anIntArray220 = new int[65536];

    @OriginalMember(owner = "com.jagex3.client.client!hf", name = "d", descriptor = "Z")
	public static boolean aBoolean134 = false;

    @OriginalMember(owner = "com.jagex3.client.client!hf", name = "j", descriptor = "Z")
	public static boolean aBoolean136 = true;

    @OriginalMember(owner = "com.jagex3.client.client!hf", name = "p", descriptor = "Z")
	public static boolean aBoolean138 = false;

	@OriginalMember(owner = "com.jagex3.client.client!hf", name = "q", descriptor = "I")
	public static int anInt2473 = 0;

    @OriginalMember(owner = "com.jagex3.client.client!hf", name = "b", descriptor = "()I")
	public static int method1913() {
		return Pix3D.anIntArray221[0] % Static129.anInt3144;
	}

    @OriginalMember(owner = "com.jagex3.client.client!hf", name = "a", descriptor = "(IIIIIII)V")
	public static void method1918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		if (arg1 != arg0) {
			local1 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(16) int local16 = 0;
		if (arg2 != arg1) {
			local16 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(31) int local31 = 0;
		if (arg2 != arg0) {
			local31 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < Pix3D.anInt2470) {
				if (arg1 > Pix3D.anInt2470) {
					arg1 = Pix3D.anInt2470;
				}
				if (arg2 > Pix3D.anInt2470) {
					arg2 = Pix3D.anInt2470;
				}
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local31 * arg0;
						arg3 -= local1 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local16 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && local31 < local1 || arg0 == arg1 && local31 > local16) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1923(Static129.anIntArray297, arg0, arg6, arg5 >> 16, arg4 >> 16);
									arg5 += local31;
									arg4 += local16;
									arg0 += Static129.anInt3144;
								}
							}
							Pix3D.method1923(Static129.anIntArray297, arg0, arg6, arg5 >> 16, arg3 >> 16);
							arg5 += local31;
							arg3 += local1;
							arg0 += Static129.anInt3144;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1923(Static129.anIntArray297, arg0, arg6, arg4 >> 16, arg5 >> 16);
									arg5 += local31;
									arg4 += local16;
									arg0 += Static129.anInt3144;
								}
							}
							Pix3D.method1923(Static129.anIntArray297, arg0, arg6, arg3 >> 16, arg5 >> 16);
							arg5 += local31;
							arg3 += local1;
							arg0 += Static129.anInt3144;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local31 * arg0;
						arg3 -= local1 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local16 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local31 < local1 || arg0 == arg2 && local16 > local1) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									Pix3D.method1923(Static129.anIntArray297, arg0, arg6, arg5 >> 16, arg3 >> 16);
									arg5 += local16;
									arg3 += local1;
									arg0 += Static129.anInt3144;
								}
							}
							Pix3D.method1923(Static129.anIntArray297, arg0, arg6, arg4 >> 16, arg3 >> 16);
							arg4 += local31;
							arg3 += local1;
							arg0 += Static129.anInt3144;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									Pix3D.method1923(Static129.anIntArray297, arg0, arg6, arg3 >> 16, arg5 >> 16);
									arg5 += local16;
									arg3 += local1;
									arg0 += Static129.anInt3144;
								}
							}
							Pix3D.method1923(Static129.anIntArray297, arg0, arg6, arg3 >> 16, arg4 >> 16);
							arg4 += local31;
							arg3 += local1;
							arg0 += Static129.anInt3144;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < Pix3D.anInt2470) {
				if (arg2 > Pix3D.anInt2470) {
					arg2 = Pix3D.anInt2470;
				}
				if (arg0 > Pix3D.anInt2470) {
					arg0 = Pix3D.anInt2470;
				}
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local1 * arg1;
						arg4 -= local16 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local31 * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && local1 < local16 || arg1 == arg2 && local1 > local31) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									Pix3D.method1923(Static129.anIntArray297, arg1, arg6, arg3 >> 16, arg5 >> 16);
									arg3 += local1;
									arg5 += local31;
									arg1 += Static129.anInt3144;
								}
							}
							Pix3D.method1923(Static129.anIntArray297, arg1, arg6, arg3 >> 16, arg4 >> 16);
							arg3 += local1;
							arg4 += local16;
							arg1 += Static129.anInt3144;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									Pix3D.method1923(Static129.anIntArray297, arg1, arg6, arg5 >> 16, arg3 >> 16);
									arg3 += local1;
									arg5 += local31;
									arg1 += Static129.anInt3144;
								}
							}
							Pix3D.method1923(Static129.anIntArray297, arg1, arg6, arg4 >> 16, arg3 >> 16);
							arg3 += local1;
							arg4 += local16;
							arg1 += Static129.anInt3144;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local1 * arg1;
						arg4 -= local16 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local31 * arg0;
						arg0 = 0;
					}
					if (local1 < local16) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1923(Static129.anIntArray297, arg1, arg6, arg3 >> 16, arg4 >> 16);
									arg3 += local31;
									arg4 += local16;
									arg1 += Static129.anInt3144;
								}
							}
							Pix3D.method1923(Static129.anIntArray297, arg1, arg6, arg5 >> 16, arg4 >> 16);
							arg5 += local1;
							arg4 += local16;
							arg1 += Static129.anInt3144;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1923(Static129.anIntArray297, arg1, arg6, arg4 >> 16, arg3 >> 16);
									arg3 += local31;
									arg4 += local16;
									arg1 += Static129.anInt3144;
								}
							}
							Pix3D.method1923(Static129.anIntArray297, arg1, arg6, arg4 >> 16, arg5 >> 16);
							arg5 += local1;
							arg4 += local16;
							arg1 += Static129.anInt3144;
						}
					}
				}
			}
		} else if (arg2 < Pix3D.anInt2470) {
			if (arg0 > Pix3D.anInt2470) {
				arg0 = Pix3D.anInt2470;
			}
			if (arg1 > Pix3D.anInt2470) {
				arg1 = Pix3D.anInt2470;
			}
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local16 * arg2;
					arg5 -= local31 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local1 * arg0;
					arg0 = 0;
				}
				if (local16 < local31) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Pix3D.method1923(Static129.anIntArray297, arg2, arg6, arg4 >> 16, arg3 >> 16);
								arg4 += local16;
								arg3 += local1;
								arg2 += Static129.anInt3144;
							}
						}
						Pix3D.method1923(Static129.anIntArray297, arg2, arg6, arg4 >> 16, arg5 >> 16);
						arg4 += local16;
						arg5 += local31;
						arg2 += Static129.anInt3144;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Pix3D.method1923(Static129.anIntArray297, arg2, arg6, arg3 >> 16, arg4 >> 16);
								arg4 += local16;
								arg3 += local1;
								arg2 += Static129.anInt3144;
							}
						}
						Pix3D.method1923(Static129.anIntArray297, arg2, arg6, arg5 >> 16, arg4 >> 16);
						arg4 += local16;
						arg5 += local31;
						arg2 += Static129.anInt3144;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local16 * arg2;
					arg5 -= local31 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local1 * arg1;
					arg1 = 0;
				}
				if (local16 < local31) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Pix3D.method1923(Static129.anIntArray297, arg2, arg6, arg4 >> 16, arg5 >> 16);
								arg4 += local1;
								arg5 += local31;
								arg2 += Static129.anInt3144;
							}
						}
						Pix3D.method1923(Static129.anIntArray297, arg2, arg6, arg3 >> 16, arg5 >> 16);
						arg3 += local16;
						arg5 += local31;
						arg2 += Static129.anInt3144;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Pix3D.method1923(Static129.anIntArray297, arg2, arg6, arg5 >> 16, arg4 >> 16);
								arg4 += local1;
								arg5 += local31;
								arg2 += Static129.anInt3144;
							}
						}
						Pix3D.method1923(Static129.anIntArray297, arg2, arg6, arg5 >> 16, arg3 >> 16);
						arg3 += local16;
						arg5 += local31;
						arg2 += Static129.anInt3144;
					}
				}
			}
		}
	}

    @OriginalMember(owner = "com.jagex3.client.client!hf", name = "a", descriptor = "([BIIIIIII)V")
	public static void method1921(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) int local1 = 0;
		if (arg2 != arg1) {
			local1 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(16) int local16 = 0;
		if (arg3 != arg2) {
			local16 = (arg6 - arg5 << 16) / (arg3 - arg2);
		}
		@Pc(31) int local31 = 0;
		if (arg3 != arg1) {
			local31 = (arg4 - arg6 << 16) / (arg1 - arg3);
		}
		if (arg1 <= arg2 && arg1 <= arg3) {
			if (arg2 < arg3) {
				arg6 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg6 -= local31 * arg1;
					arg4 -= local1 * arg1;
					arg1 = 0;
				}
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local16 * arg2;
					arg2 = 0;
				}
				if ((arg1 == arg2 || local31 >= local1) && (arg1 != arg2 || local31 <= local16)) {
					arg3 -= arg2;
					arg2 -= arg1;
					arg1 *= arg7;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Pix3D.method1930(arg0, arg1, arg5 >> 16, arg6 >> 16);
								arg6 += local31;
								arg5 += local16;
								arg1 += arg7;
							}
						}
						Pix3D.method1930(arg0, arg1, arg4 >> 16, arg6 >> 16);
						arg6 += local31;
						arg4 += local1;
						arg1 += arg7;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg1;
					arg1 *= arg7;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Pix3D.method1930(arg0, arg1, arg6 >> 16, arg5 >> 16);
								arg6 += local31;
								arg5 += local16;
								arg1 += arg7;
							}
						}
						Pix3D.method1930(arg0, arg1, arg6 >> 16, arg4 >> 16);
						arg6 += local31;
						arg4 += local1;
						arg1 += arg7;
					}
				}
			} else {
				arg5 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= local31 * arg1;
					arg4 -= local1 * arg1;
					arg1 = 0;
				}
				arg6 <<= 0x10;
				if (arg3 < 0) {
					arg6 -= local16 * arg3;
					arg3 = 0;
				}
				if ((arg1 == arg3 || local31 >= local1) && (arg1 != arg3 || local16 <= local1)) {
					arg2 -= arg3;
					arg3 -= arg1;
					arg1 *= arg7;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Pix3D.method1930(arg0, arg1, arg4 >> 16, arg6 >> 16);
								arg6 += local16;
								arg4 += local1;
								arg1 += arg7;
							}
						}
						Pix3D.method1930(arg0, arg1, arg4 >> 16, arg5 >> 16);
						arg5 += local31;
						arg4 += local1;
						arg1 += arg7;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg1;
					arg1 *= arg7;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Pix3D.method1930(arg0, arg1, arg6 >> 16, arg4 >> 16);
								arg6 += local16;
								arg4 += local1;
								arg1 += arg7;
							}
						}
						Pix3D.method1930(arg0, arg1, arg5 >> 16, arg4 >> 16);
						arg5 += local31;
						arg4 += local1;
						arg1 += arg7;
					}
				}
			}
		} else if (arg2 <= arg3) {
			if (arg3 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local1 * arg2;
					arg5 -= local16 * arg2;
					arg2 = 0;
				}
				arg6 <<= 0x10;
				if (arg3 < 0) {
					arg6 -= local31 * arg3;
					arg3 = 0;
				}
				if (arg2 != arg3 && local1 < local16 || arg2 == arg3 && local1 > local31) {
					arg1 -= arg3;
					arg3 -= arg2;
					arg2 *= arg7;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Pix3D.method1930(arg0, arg2, arg4 >> 16, arg6 >> 16);
								arg4 += local1;
								arg6 += local31;
								arg2 += arg7;
							}
						}
						Pix3D.method1930(arg0, arg2, arg4 >> 16, arg5 >> 16);
						arg4 += local1;
						arg5 += local16;
						arg2 += arg7;
					}
				} else {
					arg1 -= arg3;
					arg3 -= arg2;
					arg2 *= arg7;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Pix3D.method1930(arg0, arg2, arg6 >> 16, arg4 >> 16);
								arg4 += local1;
								arg6 += local31;
								arg2 += arg7;
							}
						}
						Pix3D.method1930(arg0, arg2, arg5 >> 16, arg4 >> 16);
						arg4 += local1;
						arg5 += local16;
						arg2 += arg7;
					}
				}
			} else {
				arg6 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg6 -= local1 * arg2;
					arg5 -= local16 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local31 * arg1;
					arg1 = 0;
				}
				if (local1 < local16) {
					arg3 -= arg1;
					arg1 -= arg2;
					arg2 *= arg7;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Pix3D.method1930(arg0, arg2, arg4 >> 16, arg5 >> 16);
								arg4 += local31;
								arg5 += local16;
								arg2 += arg7;
							}
						}
						Pix3D.method1930(arg0, arg2, arg6 >> 16, arg5 >> 16);
						arg6 += local1;
						arg5 += local16;
						arg2 += arg7;
					}
				} else {
					arg3 -= arg1;
					arg1 -= arg2;
					arg2 *= arg7;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Pix3D.method1930(arg0, arg2, arg5 >> 16, arg4 >> 16);
								arg4 += local31;
								arg5 += local16;
								arg2 += arg7;
							}
						}
						Pix3D.method1930(arg0, arg2, arg5 >> 16, arg6 >> 16);
						arg6 += local1;
						arg5 += local16;
						arg2 += arg7;
					}
				}
			}
		} else if (arg1 < arg2) {
			arg5 = arg6 <<= 0x10;
			if (arg3 < 0) {
				arg5 -= local16 * arg3;
				arg6 -= local31 * arg3;
				arg3 = 0;
			}
			arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= local1 * arg1;
				arg1 = 0;
			}
			if (local16 < local31) {
				arg2 -= arg1;
				arg1 -= arg3;
				arg3 *= arg7;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Pix3D.method1930(arg0, arg3, arg5 >> 16, arg4 >> 16);
							arg5 += local16;
							arg4 += local1;
							arg3 += arg7;
						}
					}
					Pix3D.method1930(arg0, arg3, arg5 >> 16, arg6 >> 16);
					arg5 += local16;
					arg6 += local31;
					arg3 += arg7;
				}
			} else {
				arg2 -= arg1;
				arg1 -= arg3;
				arg3 *= arg7;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Pix3D.method1930(arg0, arg3, arg4 >> 16, arg5 >> 16);
							arg5 += local16;
							arg4 += local1;
							arg3 += arg7;
						}
					}
					Pix3D.method1930(arg0, arg3, arg6 >> 16, arg5 >> 16);
					arg5 += local16;
					arg6 += local31;
					arg3 += arg7;
				}
			}
		} else {
			arg4 = arg6 <<= 0x10;
			if (arg3 < 0) {
				arg4 -= local16 * arg3;
				arg6 -= local31 * arg3;
				arg3 = 0;
			}
			arg5 <<= 0x10;
			if (arg2 < 0) {
				arg5 -= local1 * arg2;
				arg2 = 0;
			}
			if (local16 < local31) {
				arg1 -= arg2;
				arg2 -= arg3;
				arg3 *= arg7;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Pix3D.method1930(arg0, arg3, arg5 >> 16, arg6 >> 16);
							arg5 += local1;
							arg6 += local31;
							arg3 += arg7;
						}
					}
					Pix3D.method1930(arg0, arg3, arg4 >> 16, arg6 >> 16);
					arg4 += local16;
					arg6 += local31;
					arg3 += arg7;
				}
			} else {
				arg1 -= arg2;
				arg2 -= arg3;
				arg3 *= arg7;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Pix3D.method1930(arg0, arg3, arg6 >> 16, arg5 >> 16);
							arg5 += local1;
							arg6 += local31;
							arg3 += arg7;
						}
					}
					Pix3D.method1930(arg0, arg3, arg6 >> 16, arg4 >> 16);
					arg4 += local16;
					arg6 += local31;
					arg3 += arg7;
				}
			}
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!hf", name = "a", descriptor = "(III)V")
	public static void method1922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		aBoolean138 = arg0 < 0 || arg0 > anInt2472 || arg1 < 0 || arg1 > anInt2472 || arg2 < 0 || arg2 > anInt2472;
	}

    @OriginalMember(owner = "com.jagex3.client.client!hf", name = "d", descriptor = "()I")
	public static int method1927() {
		return Pix3D.anIntArray221[0] / Static129.anInt3144;
	}

	@OriginalMember(owner = "com.jagex3.client.client!hf", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg4 - arg3;
		@Pc(7) int local7 = arg1 - arg0;
		@Pc(11) int local11 = arg5 - arg3;
		@Pc(15) int local15 = arg2 - arg0;
		@Pc(19) int local19 = arg7 - arg6;
		@Pc(23) int local23 = arg8 - arg6;
		@Pc(36) int local36;
		if (arg2 == arg1) {
			local36 = 0;
		} else {
			local36 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(48) int local48;
		if (arg1 == arg0) {
			local48 = 0;
		} else {
			local48 = (local3 << 16) / local7;
		}
		@Pc(60) int local60;
		if (arg2 == arg0) {
			local60 = 0;
		} else {
			local60 = (local11 << 16) / local15;
		}
		@Pc(71) int local71 = local3 * local15 - local11 * local7;
		if (local71 == 0) {
			return;
		}
		@Pc(86) int local86 = (local19 * local15 - local23 * local7 << 8) / local71;
		@Pc(98) int local98 = (local23 * local3 - local19 * local11 << 8) / local71;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < Pix3D.anInt2470) {
				if (arg1 > Pix3D.anInt2470) {
					arg1 = Pix3D.anInt2470;
				}
				if (arg2 > Pix3D.anInt2470) {
					arg2 = Pix3D.anInt2470;
				}
				arg6 = (arg6 << 8) + local86 - local86 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local60 * arg0;
						arg3 -= local48 * arg0;
						arg6 -= local98 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local36 * arg1;
						arg1 = 0;
					}
					if ((arg0 == arg1 || local60 >= local48) && (arg0 != arg1 || local60 <= local36)) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1920(Static129.anIntArray297, arg0, arg4 >> 16, arg5 >> 16, arg6, local86);
									arg5 += local60;
									arg4 += local36;
									arg6 += local98;
									arg0 += Static129.anInt3144;
								}
							}
							Pix3D.method1920(Static129.anIntArray297, arg0, arg3 >> 16, arg5 >> 16, arg6, local86);
							arg5 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += Static129.anInt3144;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1920(Static129.anIntArray297, arg0, arg5 >> 16, arg4 >> 16, arg6, local86);
									arg5 += local60;
									arg4 += local36;
									arg6 += local98;
									arg0 += Static129.anInt3144;
								}
							}
							Pix3D.method1920(Static129.anIntArray297, arg0, arg5 >> 16, arg3 >> 16, arg6, local86);
							arg5 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += Static129.anInt3144;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local60 * arg0;
						arg3 -= local48 * arg0;
						arg6 -= local98 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local36 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local60 < local48 || arg0 == arg2 && local36 > local48) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									Pix3D.method1920(Static129.anIntArray297, arg0, arg5 >> 16, arg3 >> 16, arg6, local86);
									arg5 += local36;
									arg3 += local48;
									arg6 += local98;
									arg0 += Static129.anInt3144;
								}
							}
							Pix3D.method1920(Static129.anIntArray297, arg0, arg4 >> 16, arg3 >> 16, arg6, local86);
							arg4 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += Static129.anInt3144;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = Pix3D.anIntArray221[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									Pix3D.method1920(Static129.anIntArray297, arg0, arg3 >> 16, arg5 >> 16, arg6, local86);
									arg5 += local36;
									arg3 += local48;
									arg6 += local98;
									arg0 += Static129.anInt3144;
								}
							}
							Pix3D.method1920(Static129.anIntArray297, arg0, arg3 >> 16, arg4 >> 16, arg6, local86);
							arg4 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += Static129.anInt3144;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < Pix3D.anInt2470) {
				if (arg2 > Pix3D.anInt2470) {
					arg2 = Pix3D.anInt2470;
				}
				if (arg0 > Pix3D.anInt2470) {
					arg0 = Pix3D.anInt2470;
				}
				arg7 = (arg7 << 8) + local86 - local86 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local48 * arg1;
						arg4 -= local36 * arg1;
						arg7 -= local98 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local60 * arg2;
						arg2 = 0;
					}
					if ((arg1 == arg2 || local48 >= local36) && (arg1 != arg2 || local48 <= local60)) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									Pix3D.method1920(Static129.anIntArray297, arg1, arg5 >> 16, arg3 >> 16, arg7, local86);
									arg3 += local48;
									arg5 += local60;
									arg7 += local98;
									arg1 += Static129.anInt3144;
								}
							}
							Pix3D.method1920(Static129.anIntArray297, arg1, arg4 >> 16, arg3 >> 16, arg7, local86);
							arg3 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += Static129.anInt3144;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									Pix3D.method1920(Static129.anIntArray297, arg1, arg3 >> 16, arg5 >> 16, arg7, local86);
									arg3 += local48;
									arg5 += local60;
									arg7 += local98;
									arg1 += Static129.anInt3144;
								}
							}
							Pix3D.method1920(Static129.anIntArray297, arg1, arg3 >> 16, arg4 >> 16, arg7, local86);
							arg3 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += Static129.anInt3144;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local48 * arg1;
						arg4 -= local36 * arg1;
						arg7 -= local98 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local60 * arg0;
						arg0 = 0;
					}
					if (local48 < local36) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1920(Static129.anIntArray297, arg1, arg3 >> 16, arg4 >> 16, arg7, local86);
									arg3 += local60;
									arg4 += local36;
									arg7 += local98;
									arg1 += Static129.anInt3144;
								}
							}
							Pix3D.method1920(Static129.anIntArray297, arg1, arg5 >> 16, arg4 >> 16, arg7, local86);
							arg5 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += Static129.anInt3144;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = Pix3D.anIntArray221[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									Pix3D.method1920(Static129.anIntArray297, arg1, arg4 >> 16, arg3 >> 16, arg7, local86);
									arg3 += local60;
									arg4 += local36;
									arg7 += local98;
									arg1 += Static129.anInt3144;
								}
							}
							Pix3D.method1920(Static129.anIntArray297, arg1, arg4 >> 16, arg5 >> 16, arg7, local86);
							arg5 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += Static129.anInt3144;
						}
					}
				}
			}
		} else if (arg2 < Pix3D.anInt2470) {
			if (arg0 > Pix3D.anInt2470) {
				arg0 = Pix3D.anInt2470;
			}
			if (arg1 > Pix3D.anInt2470) {
				arg1 = Pix3D.anInt2470;
			}
			arg8 = (arg8 << 8) + local86 - local86 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local36 * arg2;
					arg5 -= local60 * arg2;
					arg8 -= local98 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local48 * arg0;
					arg0 = 0;
				}
				if (local36 < local60) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Pix3D.method1920(Static129.anIntArray297, arg2, arg4 >> 16, arg3 >> 16, arg8, local86);
								arg4 += local36;
								arg3 += local48;
								arg8 += local98;
								arg2 += Static129.anInt3144;
							}
						}
						Pix3D.method1920(Static129.anIntArray297, arg2, arg4 >> 16, arg5 >> 16, arg8, local86);
						arg4 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += Static129.anInt3144;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Pix3D.method1920(Static129.anIntArray297, arg2, arg3 >> 16, arg4 >> 16, arg8, local86);
								arg4 += local36;
								arg3 += local48;
								arg8 += local98;
								arg2 += Static129.anInt3144;
							}
						}
						Pix3D.method1920(Static129.anIntArray297, arg2, arg5 >> 16, arg4 >> 16, arg8, local86);
						arg4 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += Static129.anInt3144;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local36 * arg2;
					arg5 -= local60 * arg2;
					arg8 -= local98 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local48 * arg1;
					arg1 = 0;
				}
				if (local36 < local60) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Pix3D.method1920(Static129.anIntArray297, arg2, arg4 >> 16, arg5 >> 16, arg8, local86);
								arg4 += local48;
								arg5 += local60;
								arg8 += local98;
								arg2 += Static129.anInt3144;
							}
						}
						Pix3D.method1920(Static129.anIntArray297, arg2, arg3 >> 16, arg5 >> 16, arg8, local86);
						arg3 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += Static129.anInt3144;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = Pix3D.anIntArray221[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Pix3D.method1920(Static129.anIntArray297, arg2, arg5 >> 16, arg4 >> 16, arg8, local86);
								arg4 += local48;
								arg5 += local60;
								arg8 += local98;
								arg2 += Static129.anInt3144;
							}
						}
						Pix3D.method1920(Static129.anIntArray297, arg2, arg5 >> 16, arg3 >> 16, arg8, local86);
						arg3 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += Static129.anInt3144;
					}
				}
			}
		}
	}

}
