package com.jagex3.client;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;

import com.jagex.signlink.MonotonicClock;
import com.jagex.signlink.PrivilegedRequest;
import com.jagex.signlink.SignLink;
import deob.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex3.client.client!com.jagex3.client.client")
public final class Client extends GameShell {

    @OriginalMember(owner = "com.jagex3.client.client!li", name = "h", descriptor = "[Lclient!mj;")
    public static final CollisionMap[] levelCollisionMap = new CollisionMap[4];
    @OriginalMember(owner = "com.jagex3.client.client!ag", name = "P", descriptor = "Lclient!i;")
    public static final PacketBit out = new PacketBit(5000);
    @OriginalMember(owner = "com.jagex3.client.client!bg", name = "g", descriptor = "Lclient!i;")
    public static final PacketBit login = new PacketBit(5000);
    @OriginalMember(owner = "com.jagex3.client.client!eg", name = "e", descriptor = "Lclient!i;")
    public static final PacketBit in = new PacketBit(65536);
    @OriginalMember(owner = "com.jagex3.client.client!wa", name = "Eb", descriptor = "[Lclient!bg;")
    public static final Js5CachedResourceProvider[] js5Providers = new Js5CachedResourceProvider[28];
    @OriginalMember(owner = "com.jagex3.client.client!dm", name = "n", descriptor = "Lclient!na;")
    public static final JagString AUTO_PERCENT = Static28.parse("(U");
    // TODO remove once not needed for dev purposes anymore
    public static boolean useRsa = true;
    public static boolean useIsaac = true;
    public static int defaultWorld = -1;
    @OriginalMember(owner = "com.jagex3.client.client!pb", name = "Q", descriptor = "I")
    public static int worldid = 1;
    @OriginalMember(owner = "com.jagex3.client.client!lb", name = "v", descriptor = "I")
    public static int lang = 0;
    @OriginalMember(owner = "com.jagex3.client.client!gg", name = "U", descriptor = "I")
    public static int modeWhat = 0;
    @OriginalMember(owner = "com.jagex3.client.client!gj", name = "b", descriptor = "I")
    public static int modeWhere = 0;
    @OriginalMember(owner = "com.jagex3.client.client!ud", name = "S", descriptor = "Z")
    public static boolean advertSuppressed = false;
    @OriginalMember(owner = "com.jagex3.client.client!lk", name = "U", descriptor = "Z")
    public static boolean js = false;
    @OriginalMember(owner = "com.jagex3.client.client!vk", name = "n", descriptor = "I")
    public static int modegame = 0;
    @OriginalMember(owner = "com.jagex3.client.client!qk", name = "g", descriptor = "Lclient!ma;")
    public static ClientStream js5Stream;
    @OriginalMember(owner = "com.jagex3.client.client!ac", name = "c", descriptor = "I")
    public static int js5ConnectState = 0;
    @OriginalMember(owner = "com.jagex3.client.client!rj", name = "Y", descriptor = "J")
    public static long js5ConnectTime;
    @OriginalMember(owner = "com.jagex3.client.client!cm", name = "f", descriptor = "Lsignlink!im;")
    public static PrivilegedRequest js5SocketReq;
    @OriginalMember(owner = "com.jagex3.client.client!em", name = "v", descriptor = "Ljava/lang/String;")
    public static String loginHost;
    @OriginalMember(owner = "com.jagex3.client.client!ra", name = "s", descriptor = "I")
    public static int loginPort;
    @OriginalMember(owner = "com.jagex3.client.client!bl", name = "P", descriptor = "I")
    public static int js5ConnectCooldown = 0;
    @OriginalMember(owner = "com.jagex3.client.client!tl", name = "d", descriptor = "I")
    public static int state = 0;
    @OriginalMember(owner = "com.jagex3.client.client!nc", name = "j", descriptor = "I")
    public static int loadingStep = 0;
    @OriginalMember(owner = "com.jagex3.client.client!od", name = "f", descriptor = "Lclient!jd;")
    public static MouseRecorder mouseTracking;
    @OriginalMember(owner = "com.jagex3.client.client!ol", name = "V", descriptor = "I")
    public static int loginStep = 0;
    @OriginalMember(owner = "com.jagex3.client.client!jk", name = "B", descriptor = "Lclient!ma;")
    public static ClientStream loginStream;
    @OriginalMember(owner = "com.jagex3.client.client!re", name = "B", descriptor = "Lclient!ve;")
    public static Js5 anims;
    @OriginalMember(owner = "com.jagex3.client.client!ud", name = "J", descriptor = "Lclient!ve;")
    public static Js5 bases;
    @OriginalMember(owner = "com.jagex3.client.client!wf", name = "g", descriptor = "Lclient!ve;")
    public static Js5 config;
    @OriginalMember(owner = "com.jagex3.client.client!dc", name = "z", descriptor = "Lclient!ve;")
    public static Js5 interfaces;
    @OriginalMember(owner = "com.jagex3.client.client!uc", name = "c", descriptor = "Lclient!ve;")
    public static Js5 jagFX;
    @OriginalMember(owner = "com.jagex3.client.client!ca", name = "Z", descriptor = "Lclient!ve;")
    public static Js5 maps;
    @OriginalMember(owner = "com.jagex3.client.client!kc", name = "w", descriptor = "Lclient!ve;")
    public static Js5 songs;
    @OriginalMember(owner = "com.jagex3.client.client!vl", name = "g", descriptor = "Lclient!ve;")
    public static Js5 models;
    @OriginalMember(owner = "com.jagex3.client.client!ra", name = "K", descriptor = "Lclient!ve;")
	public static Js5 sprites;
    @OriginalMember(owner = "com.jagex3.client.client!pk", name = "Z", descriptor = "Lclient!ve;")
    public static Js5 textures;
    @OriginalMember(owner = "com.jagex3.client.client!ol", name = "U", descriptor = "Lclient!ve;")
    public static Js5 binary;
    @OriginalMember(owner = "com.jagex3.client.client!rg", name = "z", descriptor = "Lclient!ve;")
    public static Js5 jingles;
    @OriginalMember(owner = "com.jagex3.client.client!bf", name = "s", descriptor = "Lclient!ve;")
    public static Js5 scripts;
    @OriginalMember(owner = "com.jagex3.client.client!ve", name = "l", descriptor = "Lclient!ve;")
    public static Js5 fontMetrics;
    @OriginalMember(owner = "com.jagex3.client.client!kl", name = "r", descriptor = "Lclient!ve;")
    public static Js5 vorbis;
    @OriginalMember(owner = "com.jagex3.client.client!km", name = "Oc", descriptor = "Lclient!ve;")
    public static Js5 patches;
    @OriginalMember(owner = "com.jagex3.client.client!wl", name = "s", descriptor = "Lclient!ve;")
    public static Js5 locConfig;
    @OriginalMember(owner = "com.jagex3.client.client!km", name = "Nc", descriptor = "Lclient!ve;")
    public static Js5 enumConfig;
    @OriginalMember(owner = "com.jagex3.client.client!nj", name = "l", descriptor = "Lclient!ve;")
    public static Js5 npcConfig;
    @OriginalMember(owner = "com.jagex3.client.client!ni", name = "k", descriptor = "Lclient!ve;")
    public static Js5 objConfig;
    @OriginalMember(owner = "com.jagex3.client.client!ui", name = "cb", descriptor = "Lclient!ve;")
    public static Js5 seqConfig;
    @OriginalMember(owner = "com.jagex3.client.client!jh", name = "p", descriptor = "Lclient!ve;")
    public static Js5 spotConfig;
    @OriginalMember(owner = "com.jagex3.client.client!mf", name = "W", descriptor = "Lclient!ve;")
    public static Js5 varbitConfig;
    @OriginalMember(owner = "com.jagex3.client.client!sg", name = "k", descriptor = "Lclient!ve;")
    public static Js5 worldmap;
    @OriginalMember(owner = "com.jagex3.client.client!uj", name = "J", descriptor = "Lclient!ve;")
    public static Js5 quickchat;
    @OriginalMember(owner = "com.jagex3.client.client!cd", name = "B", descriptor = "Lclient!ve;")
    public static Js5 quickchatGlobal;
    @OriginalMember(owner = "com.jagex3.client.client!nd", name = "t", descriptor = "Lclient!ve;")
    public static Js5 materials;
    @OriginalMember(owner = "com.jagex3.client.client!sf", name = "b", descriptor = "Lclient!ve;")
    public static Js5 particleConfig;
    @OriginalMember(owner = "com.jagex3.client.client!hk", name = "eb", descriptor = "Z")
    public static boolean lowMem = true;
    @OriginalMember(owner = "com.jagex3.client.client!li", name = "v", descriptor = "Lclient!va;")
    public static MidiPlayer midiPlayer;
    @OriginalMember(owner = "com.jagex3.client.client!ba", name = "D", descriptor = "Lclient!vh;")
    public static PcmPlayer midiPcmPlayer;
    @OriginalMember(owner = "com.jagex3.client.client!lh", name = "s", descriptor = "Lclient!vh;")
    public static PcmPlayer soundPcmPlayer;
    @OriginalMember(owner = "com.jagex3.client.client!qi", name = "C", descriptor = "Lclient!ei;")
    public static Mixer soundMixer;
    @OriginalMember(owner = "com.jagex3.client.client!ef", name = "p", descriptor = "Lclient!vj;")
    public static Decimator soundDecimator;

    @OriginalMember(owner = "com.jagex3.client.client!com.jagex3.client.client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] args) {
		try {
			if (args.length == 0) {
				args = new String[4];
				args[0] = "1";
				args[1] = "live";
				args[2] = "english";
				args[3] = "game0";
				// deob.Static131.method2577("argument count");
			}
			@Pc(15) int local15 = -1;
			worldid = Integer.parseInt(args[0]);
			modeWhere = 2;
			if (args[1].equals("live")) {
				modeWhat = 0;
			} else if (args[1].equals("rc")) {
				modeWhat = 1;
			} else if (args[1].equals("wip")) {
				modeWhat = 2;
			} else {
				Static131.method2577("modewhat");
			}
			advertSuppressed = false;
			try {
				@Pc(63) byte[] local63 = args[2].getBytes("ISO-8859-1");
				local15 = Static101.method2053(Static10.decodeString(local63, local63.length, 0));
			} catch (@Pc(74) Exception local74) {
			}
			if (local15 != -1) {
				lang = local15;
			} else if (args[2].equals("english")) {
				lang = 0;
			} else if (args[2].equals("german")) {
				lang = 1;
			} else {
				Static131.method2577("language");
			}
			Static3.method4659(lang);
			Static233.aBoolean254 = false;
			js = false;
			if (args[3].equals("game0")) {
				modegame = 0;
			} else if (args[3].equals("game1")) {
				modegame = 1;
			} else {
				Static131.method2577("game");
			}

            // TODO remove once not needed for dev purposes anymore
            for (int i = 4; i < args.length; i++) {
                String arg = args[i];
                if (arg.equals("no-rsa")) {
                    useRsa = false;
                } else if (arg.equals("rsa")) {
                    useRsa = true;
                } else if (arg.equals("no-isaac")) {
                    useIsaac = false;
                } else if (arg.equals("isaac")) {
                    useIsaac = true;
                } else if (arg.startsWith("world=")) {
                    defaultWorld = Integer.parseInt(arg.substring(6));
                }
            }

			Static279.anInt5880 = 0;
			Static178.aBoolean203 = false;
			Static204.anInt4760 = 0;
			Static47.aClass100_991 = Static186.aClass100_827;
			@Pc(146) Client local146 = new Client();
			Static215.aClient1 = local146;
			local146.method936(modeWhat + 32, "runescape");
			Static39.aFrame1.setLocation(40, 40);
		} catch (@Pc(167) Exception local167) {
			Static89.report(null, local167);
		}
	}

    @OriginalMember(owner = "com.jagex3.client.client!pl", name = "a", descriptor = "(II)V")
    public static void setMainState(@OriginalArg(0) int arg0) {
        if (state == arg0) {
            return;
        }
        if (state == 0) {
            Static163.method3097();
        }
        if (arg0 == 40) {
            Static49.method1208();
        }
        @Pc(37) boolean local37 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 != 40 && Static233.aClass95_4 != null) {
            Static233.aClass95_4.close();
            Static233.aClass95_4 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            Static271.anInt5804 = 0;
            Static230.anInt5150 = 1;
            Static233.anInt5223 = 0;
            Static38.anInt1196 = 1;
            Static175.anInt4220 = 0;
            Static116.method2325(true);
        }
        if (arg0 == 25 || arg0 == 10) {
            Static123.method2418();
        }
        if (arg0 == 5) {
            Static181.method3344(sprites);
        } else {
            Static119.method2381();
        }
        @Pc(106) boolean local106 = state == 5 || state == 10 || state == 28;
        if (local106 != local37) {
            if (local37) {
                Static221.anInt4363 = Static250.anInt5441;
                if (Static12.anInt391 == 0) {
                    Static29.method801();
                } else {
                    Static257.method526(Static250.anInt5441, songs, 255);
                }
                Static107.js5Net.method2322(false);
            } else {
                Static29.method801();
                Static107.js5Net.method2322(true);
            }
        }
        if (GlRenderer.enabled && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
            GlRenderer.method4160();
        }
        state = arg0;
    }

    @OriginalMember(owner = "com.jagex3.client.client!com.jagex3.client.client", name = "init", descriptor = "()V")
    @Override
    public final void init() {
        if (!this.checkhost()) {
            return;
        }
        worldid = Integer.parseInt(this.getParameter("worldid"));
        modeWhere = Integer.parseInt(this.getParameter("modewhere"));
        if (modeWhere < 0 || modeWhere > 1) {
            modeWhere = 0;
        }
        modeWhat = Integer.parseInt(this.getParameter("modewhat"));
        if (modeWhat < 0 || modeWhat > 2) {
            modeWhat = 0;
        }
        @Pc(50) String local50 = this.getParameter("advertsuppressed");
        if (local50 != null && local50.equals("1")) {
            advertSuppressed = true;
        } else {
            advertSuppressed = false;
        }
        try {
            lang = Integer.parseInt(this.getParameter("lang"));
        } catch (@Pc(69) Exception local69) {
            lang = 0;
        }
        Static3.method4659(lang);
        @Pc(78) String local78 = this.getParameter("objecttag");
        if (local78 != null && local78.equals("1")) {
            Static233.aBoolean254 = true;
        } else {
            Static233.aBoolean254 = false;
        }
        @Pc(94) String local94 = this.getParameter("js");
        if (local94 != null && local94.equals("1")) {
            js = true;
        } else {
            js = false;
        }
        @Pc(111) String local111 = this.getParameter("game");
        if (local111 != null && local111.equals("1")) {
            modegame = 1;
        } else {
            modegame = 0;
        }
        try {
            Static204.anInt4760 = Integer.parseInt(this.getParameter("affid"));
        } catch (@Pc(130) Exception local130) {
            Static204.anInt4760 = 0;
        }
        Static47.aClass100_991 = Static227.aClass100_966.method3153(this);
        if (Static47.aClass100_991 == null) {
            Static47.aClass100_991 = Static186.aClass100_827;
        }
        @Pc(146) String local146 = this.getParameter("country");
        if (local146 != null) {
            try {
                Static279.anInt5880 = Integer.parseInt(local146);
            } catch (@Pc(153) Exception local153) {
                Static279.anInt5880 = 0;
            }
        }
        @Pc(159) String local159 = this.getParameter("haveie6");
        if (local159 != null && local159.equals("1")) {
            Static178.aBoolean203 = true;
        } else {
            Static178.aBoolean203 = false;
        }
        Static215.aClient1 = this;
        this.method937(modeWhat + 32);
    }

    @OriginalMember(owner = "com.jagex3.client.client!com.jagex3.client.client", name = "h", descriptor = "(I)V")
    private void js5Connect() {
        if (Static233.js5PrevErrors < Static107.js5Net.errors) {
            js5ConnectCooldown = 5 * 50 * (Static107.js5Net.errors - 1);
            if (Static271.defaultPort == loginPort) {
                loginPort = Static55.alternatePort;
            } else {
                loginPort = Static271.defaultPort;
            }
            if (js5ConnectCooldown > 3000) {
                js5ConnectCooldown = 3000;
            }
            if (Static107.js5Net.errors >= 2 && Static107.js5Net.response == 6) {
                this.error("js5connect_outofdate");
                state = 1000;
                return;
            }
            if (Static107.js5Net.errors >= 4 && Static107.js5Net.response == -1) {
                this.error("js5crc");
                state = 1000;
                return;
            }
            if (Static107.js5Net.errors >= 4 && (state == 0 || state == 5)) {
                if (Static107.js5Net.response == 7 || Static107.js5Net.response == 9) {
                    this.error("js5connect_full");
                } else if (Static107.js5Net.response > 0) {
                    this.error("js5connect");
                } else {
                    this.error("js5io");
                }
                state = 1000;
                return;
            }
        }
        Static233.js5PrevErrors = Static107.js5Net.errors;
        if (js5ConnectCooldown > 0) {
            js5ConnectCooldown--;
            return;
        }
        try {
            if (js5ConnectState == 0) {
                js5SocketReq = GameShell.signLink.socketreq(loginHost, loginPort);
                js5ConnectState++;
            }
            if (js5ConnectState == 1) {
                if (js5SocketReq.status == 2) {
                    this.setJs5Response(1000);
                    return;
                }
                if (js5SocketReq.status == 1) {
                    js5ConnectState++;
                }
            }
            if (js5ConnectState == 2) {
                js5Stream = new ClientStream((Socket) js5SocketReq.result, GameShell.signLink);
                @Pc(194) Packet packet = new Packet(5);
                packet.p1(15); // INIT_JS5REMOTE_CONNECTION
                packet.p4(530); // revision
                js5Stream.write(packet.data, 5);
                js5ConnectState++;
                js5ConnectTime = MonotonicClock.currentTime();
            }
            if (js5ConnectState == 3) {
                if (state == 0 || state == 5 || js5Stream.available() > 0) {
                    @Pc(258) int response = js5Stream.read();
                    if (response != 0) {
                        this.setJs5Response(response);
                        return;
                    }
                    js5ConnectState++;
                } else if (MonotonicClock.currentTime() - js5ConnectTime > 30000L) {
                    this.setJs5Response(1001);
                    return;
                }
            }
            if (js5ConnectState == 4) {
                @Pc(296) boolean loggedOut = state == 5 || state == 10 || state == 28;
                Static107.js5Net.loggedOut(!loggedOut, js5Stream);
                js5Stream = null;
                js5SocketReq = null;
                js5ConnectState = 0;
            }
        } catch (@Pc(315) IOException ex) {
            this.setJs5Response(1002);
        }
    }

    // jag::oldscape::Client::MainLoad
    @OriginalMember(owner = "com.jagex3.client.client!com.jagex3.client.client", name = "i", descriptor = "(I)V")
    private void mainLoad() {
        if (!Static164.aBoolean191) {
            label252: while (true) {
                do {
                    if (!Static25.nextKey()) {
                        break label252;
                    }
                } while (Static193.keyChar != 115 && Static193.keyChar != 83);
                Static164.aBoolean191 = true;
            }
        }
        //@Pc(43) int local43;
        if (loadingStep == 0) {
            @Pc(34) Runtime local34 = Runtime.getRuntime();
            int local43 = (int) (0L / 1024L);
            @Pc(46) long local46 = MonotonicClock.currentTime();
            if (Static175.aLong138 == 0L) {
                Static175.aLong138 = local46;
            }
            if (local43 > 16384 && local46 - Static175.aLong138 < 5000L) {
                if (local46 - Static160.aLong134 > 1000L) {
                    System.gc();
                    Static160.aLong134 = local46;
                }
                TitleScreen.loadPos = 5;
                TitleScreen.loadString = LocalizedText.MAINLOAD0;
            } else {
                TitleScreen.loadString = LocalizedText.MAINLOAD0B;
                loadingStep = 10;
                TitleScreen.loadPos = 5;
            }
            return;
        }
        //@Pc(98) int i;
        if (loadingStep == 10) {
            Static120.method2392();
            for (int level = 0; level < 4; level++) {
                levelCollisionMap[level] = new CollisionMap(104, 104);
            }
            TitleScreen.loadPos = 10;
            loadingStep = 30;
            TitleScreen.loadString = LocalizedText.MAINLOAD10B;
        } else if (loadingStep == 30) {
            if (Static257.aClass9_2 == null) {
                Static257.aClass9_2 = new Js5Loader(Static107.js5Net, Static86.js5CacheQueue);
            }
            if (Static257.aClass9_2.method178()) {
                anims = openJs5(false, true, true, 0);
                bases = openJs5(false, true, true, 1);
                config = openJs5(true, true, false, 2);
                interfaces = openJs5(false, true, true, 3);
                jagFX = openJs5(false, true, true, 4);
                maps = openJs5(true, true, true, 5);
                songs = openJs5(true, false, true, 6);
                models = openJs5(false, true, true, 7);
                sprites = openJs5(false, true, true, 8);
                textures = openJs5(false, true, true, 9);
                binary = openJs5(false, true, true, 10);
                jingles = openJs5(false, true, true, 11);
                scripts = openJs5(false, true, true, 12);
                fontMetrics = openJs5(false, true, true, 13);
                vorbis = openJs5(false, false, true, 14);
                patches = openJs5(false, true, true, 15);
                locConfig = openJs5(false, true, true, 16);
                enumConfig = openJs5(false, true, true, 17);
                npcConfig = openJs5(false, true, true, 18);
                objConfig = openJs5(false, true, true, 19);
                seqConfig = openJs5(false, true, true, 20);
                spotConfig = openJs5(false, true, true, 21);
                varbitConfig = openJs5(false, true, true, 22);
                worldmap = openJs5(true, true, true, 23);
                quickchat = openJs5(false, true, true, 24);
                quickchatGlobal = openJs5(false, true, true, 25);
                materials = openJs5(true, true, true, 26);
                particleConfig = openJs5(false, true, true, 27);
                TitleScreen.loadPos = 15;
                TitleScreen.loadString = LocalizedText.MAINLOAD30B;
                loadingStep = 40;
            } else {
                TitleScreen.loadString = LocalizedText.MAINLOAD30;
                TitleScreen.loadPos = 12;
            }
        } else if (loadingStep == 40) {
            int total = 0;
            for (int i = 0; i < 28; i++) {
                total += js5Providers[i].method538() * Static170.anIntArray306[i] / 100;
            }
            if (total == 100) {
                TitleScreen.loadPos = 20;
                TitleScreen.loadString = LocalizedText.MAINLOAD40B;
                Static75.method1635(sprites);
                Static167.method3172(sprites);
                Static81.method1754(sprites);
                loadingStep = 45;
            } else {
                if (total != 0) {
                    TitleScreen.loadString = JagString.join(new JagString[] { LocalizedText.CHECKING_FOR_UPDATES, JagString.parseInt(total), AUTO_PERCENT});
                }
                TitleScreen.loadPos = 20;
            }
        } else if (loadingStep == 45) {
            Static41.method1045(lowMem);

            midiPlayer = new MidiPlayer();
            midiPlayer.method4420();

            midiPcmPlayer = Static107.method2262(22050, GameShell.signLink, GameCanvas.canvas, 0);
            midiPcmPlayer.method3566(midiPlayer);

            Static34.method876(midiPlayer, patches, vorbis, jagFX);

            soundPcmPlayer = Static107.method2262(2048, GameShell.signLink, GameCanvas.canvas, 1);
            soundMixer = new Mixer();
            soundPcmPlayer.method3566(soundMixer);
            soundDecimator = new Decimator(22050, Static44.anInt1404);

            Static250.anInt5441 = songs.method4482(TitleScreen.TITLESONG);

            TitleScreen.loadPos = 30;
            loadingStep = 50;
            TitleScreen.loadString = LocalizedText.MAINLOAD45B;
        } else if (loadingStep == 50) {
            int i = Static74.ready(sprites, fontMetrics);
            int j = Static143.readyMax();
            if (i >= j) {
                TitleScreen.loadString = LocalizedText.MAINLOAD50B;
                TitleScreen.loadPos = 35;
                loadingStep = 60;
            } else {
                TitleScreen.loadString = JagString.join(new JagString[] { LocalizedText.MAINLOAD50, JagString.parseInt(i * 100 / j), AUTO_PERCENT});
                TitleScreen.loadPos = 35;
            }
        } else if (loadingStep == 60) {
            int i = Static150.ready(sprites);
            int j = Static104.readyMax();
            if (j <= i) {
                TitleScreen.loadString = LocalizedText.MAINLOAD60B;
                loadingStep = 65;
                TitleScreen.loadPos = 40;
            } else {
                TitleScreen.loadString = JagString.join(new JagString[] { LocalizedText.MAINLOAD60, JagString.parseInt(i * 100 / j), AUTO_PERCENT});
                TitleScreen.loadPos = 40;
            }
        } else if (loadingStep == 65) {
            Static102.method2074(fontMetrics, sprites);
            TitleScreen.loadPos = 45;
            TitleScreen.loadString = LocalizedText.MAINLOAD65B;
            setMainState(5);
            loadingStep = 70;
        } else if (loadingStep == 70) {
            int i;
            config.requestFullDownload();
            i = config.method4498();
            locConfig.requestFullDownload();
            i += locConfig.method4498();
            enumConfig.requestFullDownload();
            i += enumConfig.method4498();
            npcConfig.requestFullDownload();
            i += npcConfig.method4498();
            objConfig.requestFullDownload();
            i += objConfig.method4498();
            seqConfig.requestFullDownload();
            i += seqConfig.method4498();
            spotConfig.requestFullDownload();
            i += spotConfig.method4498();
            varbitConfig.requestFullDownload();
            i += varbitConfig.method4498();
            quickchat.requestFullDownload();
            i += quickchat.method4498();
            quickchatGlobal.requestFullDownload();
            i += quickchatGlobal.method4498();
            particleConfig.requestFullDownload();
            i += particleConfig.method4498();
            if (i >= 1100) {
                ParamType.init(config);
                FloType.init(config);
                FluType.init(config);
                FluType.init(models, config);
                LocType.init(locConfig, models);
                NpcType.init(models, npcConfig);
                ObjType.init(objConfig, Static265.aClass3_Sub2_Sub9_Sub1_2, models);
                StructType.init(config);
                SeqType.init(bases, seqConfig, anims);
                BasType.init(config);
                SpotType.init(models, spotConfig);
                VarBitType.init(varbitConfig);
                VarpType.init(config);
                IfType.init(fontMetrics, sprites, interfaces, models);
                InvType.init(config);
                EnumType.init(enumConfig);
                QuickChatPhraseType.init(quickchatGlobal, quickchat, new Js5QuickChatCommandDecoder());
                QuickChatCatType.init(quickchatGlobal, quickchat);
                LightType.init(config);
                CursorType.init(config, sprites);
                MsiType.init(config, sprites);

                TitleScreen.loadPos = 50;
                TitleScreen.loadString = LocalizedText.MAINLOAD70B;
                Static58.method1321();
                loadingStep = 80;
            } else {
                TitleScreen.loadString = JagString.join(new JagString[] { LocalizedText.MAINLOAD70, JagString.parseInt(i / 11), AUTO_PERCENT});
                TitleScreen.loadPos = 50;
            }
        } else if (loadingStep == 80) {
            int i = Static28.method789(sprites);
            int local43 = Static62.method1483();
            if (local43 > i) {
                TitleScreen.loadString = JagString.join(new JagString[] { LocalizedText.MAINLOAD80, JagString.parseInt(i * 100 / local43), AUTO_PERCENT});
                TitleScreen.loadPos = 60;
            } else {
                Static30.method839(sprites);
                loadingStep = 90;
                TitleScreen.loadPos = 60;
                TitleScreen.loadString = LocalizedText.MAINLOAD80B;
            }
        } else if (loadingStep == 90) {
            if (materials.requestFullDownload()) {
                @Pc(951) WorldTextureProvider local951 = new WorldTextureProvider(textures, materials, sprites, 20, !Static53.aBoolean99);
                Rasteriser.method1914(local951);
                if (Static113.anInt4609 == 1) {
                    Rasteriser.method1911(0.9F);
                }
                if (Static113.anInt4609 == 2) {
                    Rasteriser.method1911(0.8F);
                }
                if (Static113.anInt4609 == 3) {
                    Rasteriser.method1911(0.7F);
                }
                if (Static113.anInt4609 == 4) {
                    Rasteriser.method1911(0.6F);
                }
                TitleScreen.loadString = LocalizedText.MAINLOAD90B;
                loadingStep = 100;
                TitleScreen.loadPos = 70;
            } else {
                TitleScreen.loadString = JagString.join(new JagString[] { LocalizedText.MAINLOAD90, JagString.parseInt(materials.method4498()), AUTO_PERCENT});
                TitleScreen.loadPos = 70;
            }
        } else if (loadingStep == 100) {
            if (Static231.method3986(sprites)) {
                loadingStep = 110;
            }
        } else if (loadingStep == 110) {
            mouseTracking = new MouseRecorder();
            GameShell.signLink.threadreq(10, mouseTracking);
            TitleScreen.loadString = LocalizedText.MAINLOAD110B;
            TitleScreen.loadPos = 75;
            loadingStep = 120;
        } else if (loadingStep == 120) {
            if (binary.requestDownload(Static186.aClass100_827, Static252.aClass100_1049)) {
                @Pc(1060) HuffmanCodec huffman = new HuffmanCodec(binary.method4485(Static186.aClass100_827, Static252.aClass100_1049));
                Static1.setHuffman(huffman);
                TitleScreen.loadString = LocalizedText.MAINLOAD120B;
                loadingStep = 130;
                TitleScreen.loadPos = 80;
            } else {
                TitleScreen.loadString = JagString.join(new JagString[] { LocalizedText.MAINLOAD120, Static206.aClass100_899 });
                TitleScreen.loadPos = 80;
            }
        } else if (loadingStep == 130) {
            if (!interfaces.requestFullDownload()) {
                TitleScreen.loadString = JagString.join(new JagString[] { LocalizedText.MAINLOAD130, JagString.parseInt(interfaces.method4498() * 3 / 4), AUTO_PERCENT});
                TitleScreen.loadPos = 85;
            } else if (!scripts.requestFullDownload()) {
                TitleScreen.loadString = JagString.join(new JagString[] { LocalizedText.MAINLOAD130, JagString.parseInt(scripts.method4498() / 10 + 75), AUTO_PERCENT});
                TitleScreen.loadPos = 85;
            } else if (!fontMetrics.requestFullDownload()) {
                TitleScreen.loadString = JagString.join(new JagString[] { LocalizedText.MAINLOAD130, JagString.parseInt(fontMetrics.method4498() / 20 + 85), AUTO_PERCENT});
                TitleScreen.loadPos = 85;
            } else if (worldmap.method4489(Static165.aClass100_777)) {
                Static234.method4018(Static173.aClass3_Sub2_Sub1_Sub1Array9, worldmap);
                TitleScreen.loadPos = 95;
                TitleScreen.loadString = LocalizedText.MAINLOAD130B;
                loadingStep = 135;
            } else {
                TitleScreen.loadString = JagString.join(new JagString[] { LocalizedText.MAINLOAD130, JagString.parseInt(worldmap.method4478(Static165.aClass100_777) / 10 + 90), AUTO_PERCENT});
                TitleScreen.loadPos = 85;
            }
        } else if (loadingStep == 135) {
            int i = Static207.method3684();
            if (i == -1) {
                TitleScreen.loadPos = 95;
                TitleScreen.loadString = LocalizedText.MAINLOAD135;
            } else if (i == 7 || i == 9) {
                this.error("worldlistfull");
                setMainState(1000);
            } else if (Static61.aBoolean109) {
                TitleScreen.loadString = LocalizedText.MAINLOAD135B;
                loadingStep = 140;
                TitleScreen.loadPos = 96;
            } else {
                this.error("worldlistio_" + i);
                setMainState(1000);
            }
        } else if (loadingStep == 140) {
            Static156.anInt3783 = interfaces.method4482(Static138.aClass100_652);
            maps.method4477(false);
            songs.method4477(true);
            sprites.method4477(true);
            fontMetrics.method4477(true);
            binary.method4477(true);
            interfaces.method4477(true);
            TitleScreen.loadPos = 97;
            TitleScreen.loadString = LocalizedText.MAINLOAD140;
            loadingStep = 150;
            Static107.aBoolean147 = true;
        } else if (loadingStep == 150) {
            Static151.method2807();
            if (Static164.aBoolean191) {
                Static102.anInt2679 = 0;
                Static186.anInt4392 = 0;
                Static214.anInt5581 = 0;
                Static141.anInt3474 = 0;
            }
            Static164.aBoolean191 = true;
            Static203.method3663(GameShell.signLink);
            Static241.method4540(false, Static214.anInt5581, -1, -1);
            TitleScreen.loadPos = 100;
            loadingStep = 160;
            TitleScreen.loadString = LocalizedText.MAINLOAD150B;
        } else if (loadingStep == 160) {
            Static73.method1596(true);
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!al", name = "a", descriptor = "(ZZZIZ)Lclient!ve;")
    public static Js5 openJs5(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
        @Pc(7) DataFile local7 = null;
        if (Static172.cacheData != null) {
            local7 = new DataFile(arg3, Static172.cacheData, Static47.cacheIndexes[arg3], 1000000);
        }
        js5Providers[arg3] = Static257.aClass9_2.method180(arg3, Static148.masterCache, local7);
        if (arg1) {
            js5Providers[arg3].method528();
        }
        return new Js5(js5Providers[arg3], arg0, arg2);
    }

    // jag::oldscape::Client::LoginPoll
    @OriginalMember(owner = "com.jagex3.client.client!ri", name = "a", descriptor = "(B)V")
    public static void loginPoll() {
        if (loginStep == 0 || loginStep == 5) {
            return;
        }
        try {
            if (++Static92.anInt2430 > 2000) {
                if (loginStream != null) {
                    loginStream.close();
                    loginStream = null;
                }
                if (Static276.anInt5816 >= 1) {
                    Static266.anInt5336 = -5;
                    loginStep = 0;
                    return;
                }
                Static92.anInt2430 = 0;
                if (loginPort == Static271.defaultPort) {
                    loginPort = Static55.alternatePort;
                } else {
                    loginPort = Static271.defaultPort;
                }
                loginStep = 1;
                Static276.anInt5816++;
            }
            if (loginStep == 1) {
                Static72.aClass212_3 = signLink.socketreq(loginHost, loginPort);
                loginStep = 2;
            }
            if (loginStep == 2) {
                if (Static72.aClass212_3.status == 2) {
                    throw new IOException();
                }
                if (Static72.aClass212_3.status != 1) {
                    return;
                }
                loginStream = new ClientStream((Socket) Static72.aClass212_3.result, signLink);
                Static72.aClass212_3 = null;
                @Pc(106) long local106 = Static101.aLong98 = Static186.username.encode37();
                out.pos = 0;
                out.p1(14); // INIT_GAME_CONNECTION
                @Pc(120) int local120 = (int) (local106 >> 16 & 0x1FL);
                out.p1(local120);
                loginStream.write(out.data, 2);
                if (midiPcmPlayer != null) {
                    midiPcmPlayer.method3571();
                }
                if (soundPcmPlayer != null) {
                    soundPcmPlayer.method3571();
                }
                @Pc(150) int local150 = loginStream.read();
                if (midiPcmPlayer != null) {
                    midiPcmPlayer.method3571();
                }
                if (soundPcmPlayer != null) {
                    soundPcmPlayer.method3571();
                }
                if (local150 != 0) {
                    Static266.anInt5336 = local150;
                    loginStep = 0;
                    loginStream.close();
                    loginStream = null;
                    return;
                }
                loginStep = 3;
            }
            if (loginStep == 3) {
                if (loginStream.available() < 8) {
                    return;
                }
                loginStream.read(0, 8, in.data);
                in.pos = 0;
                Static193.aLong147 = in.g8();
                @Pc(210) int[] seed = new int[4];
                out.pos = 0;
                seed[2] = (int) (Static193.aLong147 >> 32);
                seed[3] = (int) Static193.aLong147;
                seed[1] = (int) (Math.random() * 9.9999999E7D);
                seed[0] = (int) (Math.random() * 9.9999999E7D);
                out.p1(10);
                out.p4(seed[0]);
                out.p4(seed[1]);
                out.p4(seed[2]);
                out.p4(seed[3]);
                out.p8(Static186.username.encode37());
                out.pjstr(Static186.password);
                out.rsaenc(Static86.RSA_EXPONENT, Static86.RSA_MODULUS);
                login.pos = 0;
                if (state == 40) {
                    login.p1(18);
                } else {
                    login.p1(16); // GAMELOGIN
                }

                login.p2(out.pos + Static229.method3937(Static47.aClass100_991) + 159);
                login.p4(530);
                login.p1(Static5.anInt39);
                login.p1(advertSuppressed ? 1 : 0);
                login.p1(1);  // revision
                login.p1(Static144.method2736());
                login.p2(Static48.anInt1448);
                login.p2(Static254.anInt5554);
                login.p1(Static186.anInt4392);
                Static140.method2705(login);
                login.pjstr(Static47.aClass100_991);
                login.p4(Static204.anInt4760);
                login.p4(Static145.method2746());
                Static18.sentToServer = true;
                login.p2(Static189.anInt4443);
                login.p4(anims.getCrc());
                login.p4(bases.getCrc());
                login.p4(config.getCrc());
                login.p4(interfaces.getCrc());
                login.p4(jagFX.getCrc());
                login.p4(maps.getCrc());
                login.p4(songs.getCrc());
                login.p4(models.getCrc());
                login.p4(sprites.getCrc());
                login.p4(textures.getCrc());
                login.p4(binary.getCrc());
                login.p4(jingles.getCrc());
                login.p4(scripts.getCrc());
                login.p4(fontMetrics.getCrc());
                login.p4(vorbis.getCrc());
                login.p4(patches.getCrc());
                login.p4(locConfig.getCrc());
                login.p4(enumConfig.getCrc());
                login.p4(npcConfig.getCrc());
                login.p4(objConfig.getCrc());
                login.p4(seqConfig.getCrc());
                login.p4(spotConfig.getCrc());
                login.p4(varbitConfig.getCrc());
                login.p4(worldmap.getCrc());
                login.p4(quickchat.getCrc());
                login.p4(quickchatGlobal.getCrc());
                login.p4(materials.getCrc());
                login.p4(particleConfig.getCrc());
                login.pdata(out.data, out.pos);
                loginStream.write(login.data, login.pos);
                out.seed(seed);
                for (@Pc(583) int i = 0; i < 4; i++) {
                    seed[i] += 50;
                }
                in.seed(seed);
                loginStep = 4;
            }
            if (loginStep == 4) {
                if (loginStream.available() < 1) {
                    return;
                }
                @Pc(623) int local623 = loginStream.read();
                if (local623 == 21) {
                    loginStep = 7;
                } else if (local623 == 29) {
                    loginStep = 10;
                } else if (local623 == 1) {
                    loginStep = 5;
                    Static266.anInt5336 = local623;
                    return;
                } else if (local623 == 2) {
                    loginStep = 8;
                } else if (local623 == 15) {
                    loginStep = 0;
                    Static266.anInt5336 = local623;
                    return;
                } else if (local623 == 23 && Static276.anInt5816 < 1) {
                    loginStep = 1;
                    Static276.anInt5816++;
                    Static92.anInt2430 = 0;
                    loginStream.close();
                    loginStream = null;
                    return;
                } else {
                    Static266.anInt5336 = local623;
                    loginStep = 0;
                    loginStream.close();
                    loginStream = null;
                    return;
                }
            }
            if (loginStep == 6) {
                out.pos = 0;
                out.p1isaac(17);
                loginStream.write(out.data, out.pos);
                loginStep = 4;
                return;
            }
            if (loginStep == 7) {
                if (loginStream.available() >= 1) {
                    Static231.anInt5202 = (loginStream.read() + 3) * 60;
                    loginStep = 0;
                    Static266.anInt5336 = 21;
                    loginStream.close();
                    loginStream = null;
                    return;
                }
                return;
            }
            if (loginStep == 10) {
                if (loginStream.available() >= 1) {
                    Static204.anInt4765 = loginStream.read();
                    loginStep = 0;
                    Static266.anInt5336 = 29;
                    loginStream.close();
                    loginStream = null;
                    return;
                }
                return;
            }
            if (loginStep == 8) {
                if (loginStream.available() < 14) {
                    return;
                }
                loginStream.read(0, 14, in.data);
                in.pos = 0;
                Static191.staffModLevel = in.g1();
                Static249.anInt5431 = in.g1();
                Static124.aBoolean157 = in.g1() == 1;
                Static207.aBoolean236 = in.g1() == 1;
                Static25.aBoolean57 = in.g1() == 1;
                Static86.aBoolean129 = in.g1() == 1;
                Static245.enabled = in.g1() == 1;
                Static16.anInt549 = in.g2();
                Static202.aBoolean233 = in.g1() == 1;
                Static2.aBoolean1 = in.g1() == 1;
                Static189.method3438(Static2.aBoolean1);
                Static9.method186(Static2.aBoolean1);
                if (!advertSuppressed) {
                    if (Static124.aBoolean157 && !Static25.aBoolean57 || Static202.aBoolean233) {
                        try {
                            Static167.aClass100_781.method3157(signLink.anApplet2);
                        } catch (@Pc(910) Throwable local910) {
                        }
                    } else {
                        try {
                            Static56.aClass100_380.method3157(signLink.anApplet2);
                        } catch (@Pc(920) Throwable local920) {
                        }
                    }
                }
                Static164.anInt3985 = in.method2243();
                Static223.anInt5028 = in.g2();
                loginStep = 9;
            }
            if (loginStep == 9) {
                if (loginStream.available() < Static223.anInt5028) {
                    return;
                }
                in.pos = 0;
                loginStream.read(0, Static223.anInt5028, in.data);
                Static266.anInt5336 = 2;
                loginStep = 0;
                Static243.method4221();
                Static80.anInt4701 = -1;
                Static75.method1629(false);
                Static164.anInt3985 = -1;
                return;
            }
        } catch (@Pc(977) IOException local977) {
            if (loginStream != null) {
                loginStream.close();
                loginStream = null;
            }
            if (Static276.anInt5816 >= 1) {
                loginStep = 0;
                Static266.anInt5336 = -4;
            } else {
                loginStep = 1;
                Static92.anInt2430 = 0;
                Static276.anInt5816++;
                if (Static271.defaultPort == loginPort) {
                    loginPort = Static55.alternatePort;
                } else {
                    loginPort = Static271.defaultPort;
                }
            }
        }
    }

    @OriginalMember(owner = "com.jagex3.client.client!com.jagex3.client.client", name = "f", descriptor = "(I)V")
	@Override
	protected final void method934() {
		if (state == 1000) {
			return;
		}
		@Pc(15) boolean local15 = Static138.method2699();
		if (local15 && Static144.aBoolean173 && midiPcmPlayer != null) {
			midiPcmPlayer.method3570();
		}
		if ((state == 30 || state == 10) && (Static35.aBoolean66 || Static97.aLong89 != 0L && Static97.aLong89 < MonotonicClock.currentTime())) {
			Static241.method4540(Static35.aBoolean66, Static144.method2736(), Static114.anInt5831, Static22.anInt729);
		}
		@Pc(80) int local80;
		@Pc(84) int local84;
		if (Static69.aFrame2 == null) {
			@Pc(65) Container local65;
			if (Static69.aFrame2 != null) {
				local65 = Static69.aFrame2;
			} else if (Static39.aFrame1 == null) {
				local65 = GameShell.signLink.anApplet2;
			} else {
				local65 = Static39.aFrame1;
			}
			local80 = local65.getSize().width;
			local84 = local65.getSize().height;
			if (local65 == Static39.aFrame1) {
				@Pc(90) Insets local90 = Static39.aFrame1.getInsets();
				local80 -= local90.right + local90.left;
				local84 -= local90.top + local90.bottom;
			}
			if (local80 != Static72.anInt2046 || local84 != Static122.anInt3045) {
				Static203.method3662();
				Static97.aLong89 = MonotonicClock.currentTime() + 500L;
			}
		}
		if (Static69.aFrame2 != null && !Static26.focus && (state == 30 || state == 10)) {
			Static241.method4540(false, Static214.anInt5581, -1, -1);
		}
		@Pc(158) boolean local158 = false;
		if (Static69.aBoolean115) {
			local158 = true;
			Static69.aBoolean115 = false;
		}
		if (local158) {
			Static139.method2704();
		}
		if (GlRenderer.enabled) {
			for (local80 = 0; local80 < 100; local80++) {
				Static186.aBooleanArray100[local80] = true;
			}
		}
		if (state == 0) {
			Static13.method473(null, local158, TitleScreen.loadString, TitleScreen.loadPos);
		} else if (state == 5) {
			Static182.method3359(false, Static280.aClass3_Sub2_Sub9_43);
		} else if (state == 10) {
			Static126.method2460();
		} else if (state == 25 || state == 28) {
			if (Static233.anInt5223 == 1) {
				if (Static230.anInt5150 < Static175.anInt4220) {
					Static230.anInt5150 = Static175.anInt4220;
				}
				local80 = (Static230.anInt5150 - Static175.anInt4220) * 50 / Static230.anInt5150;
				Static114.method4636(false, JagString.join(new JagString[] { LocalizedText.LOADING, Static229.aClass100_974, JagString.parseInt(local80), Static14.aClass100_80 }));
			} else if (Static233.anInt5223 == 2) {
				if (Static38.anInt1196 < Static271.anInt5804) {
					Static38.anInt1196 = Static271.anInt5804;
				}
				local80 = (Static38.anInt1196 - Static271.anInt5804) * 50 / Static38.anInt1196 + 50;
				Static114.method4636(false, JagString.join(new JagString[] { LocalizedText.LOADING, Static229.aClass100_974, JagString.parseInt(local80), Static14.aClass100_80 }));
			} else {
				Static114.method4636(false, LocalizedText.LOADING);
			}
		} else if (state == 30) {
			Static89.method1841();
		} else if (state == 40) {
			Static114.method4636(false, JagString.join(new JagString[] { LocalizedText.CONLOST, Static269.aClass100_556, LocalizedText.ATTEMPT_TO_REESTABLISH}));
		}
		if (GlRenderer.enabled && state != 0) {
			GlRenderer.method4153();
			for (local80 = 0; local80 < Static24.anInt766; local80++) {
				Static31.aBooleanArray29[local80] = false;
			}
		} else {
			@Pc(388) Graphics local388;
			if ((state == 30 || state == 10) && Static199.anInt4672 == 0 && !local158) {
				try {
					local388 = GameCanvas.canvas.getGraphics();
					for (local84 = 0; local84 < Static24.anInt766; local84++) {
						if (Static31.aBooleanArray29[local84]) {
							Static260.aClass27_2.method4191(Static224.anIntArray443[local84], Static264.anIntArray410[local84], Static67.anIntArray320[local84], local388, Static50.anIntArray133[local84]);
							Static31.aBooleanArray29[local84] = false;
						}
					}
				} catch (@Pc(423) Exception local423) {
					GameCanvas.canvas.repaint();
				}
			} else if (state != 0) {
				try {
					local388 = GameCanvas.canvas.getGraphics();
					Static260.aClass27_2.method4186(local388);
					for (local84 = 0; local84 < Static24.anInt766; local84++) {
						Static31.aBooleanArray29[local84] = false;
					}
				} catch (@Pc(453) Exception local453) {
					GameCanvas.canvas.repaint();
				}
			}
		}
		if (Static107.aBoolean147) {
			Static213.method3729();
		}
		if (Static164.aBoolean191 && state == 10 && Static154.topLevelInterace != -1) {
			Static164.aBoolean191 = false;
			Static203.method3663(GameShell.signLink);
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!com.jagex3.client.client", name = "c", descriptor = "(B)V")
	@Override
	protected final void method928() {
		if (GlRenderer.enabled) {
			GlRenderer.quit();
		}
		if (Static69.aFrame2 != null) {
			Static25.method714(Static69.aFrame2, GameShell.signLink);
			Static69.aFrame2 = null;
		}
		if (GameShell.signLink != null) {
			GameShell.signLink.method5121(this.getClass());
		}
		if (mouseTracking != null) {
			mouseTracking.aBoolean151 = false;
		}
		mouseTracking = null;
		if (loginStream != null) {
			loginStream.close();
			loginStream = null;
		}
		Static31.method847(GameCanvas.canvas);
		Static223.method3866(GameCanvas.canvas);
		if (Static71.mouseWheelInterface != null) {
			Static71.mouseWheelInterface.method3291(GameCanvas.canvas);
		}
		Static6.method82();
		Static251.method4277();
		Static71.mouseWheelInterface = null;
		if (midiPcmPlayer != null) {
			midiPcmPlayer.method3575();
		}
		if (soundPcmPlayer != null) {
			soundPcmPlayer.method3575();
		}
		Static107.js5Net.method2329();
		Static86.js5CacheQueue.method2466();
		try {
			if (Static172.cacheData != null) {
				Static172.cacheData.method1455();
			}
			if (Static47.cacheIndexes != null) {
				for (@Pc(95) int local95 = 0; local95 < Static47.cacheIndexes.length; local95++) {
					if (Static47.cacheIndexes[local95] != null) {
						Static47.cacheIndexes[local95].method1455();
					}
				}
			}
			if (Static190.cacheMasterIndex != null) {
				Static190.cacheMasterIndex.method1455();
			}
			if (Static121.uid != null) {
				Static121.uid.method1455();
			}
		} catch (@Pc(129) IOException local129) {
		}
	}



	@OriginalMember(owner = "com.jagex3.client.client!com.jagex3.client.client", name = "g", descriptor = "(I)V")
	@Override
	protected final void method935() {
		Static203.method3662();
		Static86.js5CacheQueue = new Js5CacheQueue();
		Static107.js5Net = new Js5Net();
		if (modeWhat != 0) {
			Static51.aByteArrayArray8 = new byte[50][];
		}
		Static80.read(GameShell.signLink); // preferences
		if (modeWhere == 0) {
			Static143.worldListHostname = this.getCodeBase().getHost();
			Static97.worldListAlternatePort = 443;
			Static249.worldListDefaultPort = 43594;
		} else if (modeWhere == 1) {
			Static143.worldListHostname = this.getCodeBase().getHost();
			Static97.worldListAlternatePort = worldid + 50000;
			Static249.worldListDefaultPort = worldid + 40000;
		} else if (modeWhere == 2) {
			Static143.worldListHostname = "127.0.0.1";
			Static97.worldListAlternatePort = worldid + 50000;
			Static249.worldListDefaultPort = worldid + 40000;
        }
		if (modegame == 1) {
			Static172.shiftClick = true;
			Static161.anInt3923 = 16777215;
			Static161.anInt3922 = 0;
			Static33.aShortArrayArray2 = Static198.aShortArrayArray4;
			Static172.aShortArrayArray7 = Static32.aShortArrayArray1;
			Static200.aShortArray65 = Static2.aShortArray1;
			Static160.aShortArray41 = Static20.aShortArray5;
		} else {
			Static33.aShortArrayArray2 = Static154.aShortArrayArray6;
			Static160.aShortArray41 = Static195.aShortArray64;
			Static172.aShortArrayArray7 = Static43.aShortArrayArray5;
			Static200.aShortArray65 = Static260.aShortArray71;
		}
		Static55.alternatePort = Static97.worldListAlternatePort;
		Static271.defaultPort = Static249.worldListDefaultPort;
		loginHost = Static143.worldListHostname;
		Static208.worldListPort = Static249.worldListDefaultPort;
		Static259.aShortArray88 = Static62.aShortArray19 = Static232.aShortArray74 = Static259.aShortArray87 = new short[256];
		loginPort = Static208.worldListPort;
		if ((SignLink.anInt5928 == 3 && modeWhere != 2)) {
			Static125.worldId = worldid;
		}

        // TODO remove once not needed for dev purposes anymore
        if (defaultWorld != -1) {
            Static125.worldId = defaultWorld;
        } else if (!useRsa) {
            Static125.worldId = worldid;
        }

		Static156.init(); // keyboard
		Static19.start(GameCanvas.canvas); // keyboard
		Static88.start(GameCanvas.canvas); // mouse
		Static71.mouseWheelInterface = Static44.create();
		if (Static71.mouseWheelInterface != null) {
			Static71.mouseWheelInterface.start(GameCanvas.canvas);
		}
		Static7.anInt986 = SignLink.anInt5928;
		try {
			if (GameShell.signLink.cacheData != null) {
				Static172.cacheData = new BufferedRandomAccessFile(GameShell.signLink.cacheData, 5200, 0);
				for (@Pc(162) int i = 0; i < 28; i++) {
					Static47.cacheIndexes[i] = new BufferedRandomAccessFile(GameShell.signLink.cacheIndexes[i], 6000, 0);
				}
				Static190.cacheMasterIndex = new BufferedRandomAccessFile(GameShell.signLink.cacheMasterIndex, 6000, 0);
				Static148.masterCache = new DataFile(255, Static172.cacheData, Static190.cacheMasterIndex, 500000);
				Static121.uid = new BufferedRandomAccessFile(GameShell.signLink.uid, 24, 0);
				GameShell.signLink.cacheIndexes = null;
				GameShell.signLink.cacheMasterIndex = null;
				GameShell.signLink.uid = null;
				GameShell.signLink.cacheData = null;
			}
		} catch (@Pc(220) IOException ex) {
			Static121.uid = null;
			Static172.cacheData = null;
			Static190.cacheMasterIndex = null;
			Static148.masterCache = null;
		}
		Static278.mainLoadPrimaryText = LocalizedText.GAME0_LOADING;
		if (modeWhere != 0) {
			Static43.displayFps = true;
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!com.jagex3.client.client", name = "c", descriptor = "(I)V")
	@Override
	protected final void method929() {
	}

	@OriginalMember(owner = "com.jagex3.client.client!com.jagex3.client.client", name = "a", descriptor = "(ZI)V")
	private void setJs5Response(@OriginalArg(1) int arg0) {
		Static107.js5Net.errors++;
		js5SocketReq = null;
		Static107.js5Net.response = arg0;
		js5Stream = null;
		js5ConnectState = 0;
	}

	@OriginalMember(owner = "com.jagex3.client.client!com.jagex3.client.client", name = "d", descriptor = "(B)V")
	private void method943() {
		for (Static182.keyQueueSize = 0; Static25.nextKey() && Static182.keyQueueSize < 128; Static182.keyQueueSize++) {
			Static227.keyCodes[Static182.keyQueueSize] = Static102.keyCode;
			Static205.keyChars[Static182.keyQueueSize] = Static193.keyChar;
		}
		Static178.anInt4247++;
		if (Static154.topLevelInterace != -1) {
			Static57.method1320(0, 0, 0, Static48.anInt1448, Static154.topLevelInterace, 0, Static254.anInt5554);
		}
		Static119.transmitTimer++;
		if (GlRenderer.enabled) {
			label191: for (@Pc(57) int local57 = 0; local57 < 32768; local57++) {
				@Pc(66) ClientNPC local66 = Static175.aClass8_Sub4_Sub2Array1[local57];
				if (local66 != null) {
					@Pc(73) byte local73 = local66.aClass96_1.aByte10;
					if ((local73 & 0x2) > 0 && local66.anInt3409 == 0 && Math.random() * 1000.0D < 10.0D) {
						@Pc(98) int local98 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						@Pc(106) int local106 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						if (local98 != 0 || local106 != 0) {
							local66.aByteArray48[0] = 1;
							local66.movementQueueX[0] = local98 + (local66.anInt3412 >> 7);
							local66.movementQueueZ[0] = local106 + (local66.anInt3421 >> 7);
							levelCollisionMap[Static55.level].method3056(local66.anInt3412 >> 7, local66.method2693(), false, 0, local66.method2693(), local66.anInt3421 >> 7);
							if (local66.movementQueueX[0] >= 0 && local66.movementQueueX[0] <= 104 - local66.method2693() && local66.movementQueueZ[0] >= 0 && local66.movementQueueZ[0] <= 104 - local66.method2693() && levelCollisionMap[Static55.level].method3054(local66.anInt3421 >> 7, local66.movementQueueZ[0], local66.movementQueueX[0], local66.anInt3412 >> 7)) {
								if (local66.method2693() > 1) {
									for (@Pc(226) int local226 = local66.movementQueueX[0]; local66.movementQueueX[0] + local66.method2693() > local226; local226++) {
										for (@Pc(246) int local246 = local66.movementQueueZ[0]; local66.movementQueueZ[0] + local66.method2693() > local246; local246++) {
											if ((levelCollisionMap[Static55.level].anIntArrayArray30[local226][local246] & 0x12401FF) != 0) {
												continue label191;
											}
										}
									}
								}
								local66.anInt3409 = 1;
							}
						}
					}
					Static104.method2247(local66);
					Static37.method949(local66);
					Static34.method879(local66);
					levelCollisionMap[Static55.level].method3043(local66.anInt3412 >> 7, false, local66.anInt3421 >> 7, local66.method2693(), local66.method2693());
				}
			}
		}
		if (!GlRenderer.enabled) {
			Static269.method2170();
		} else if (loginStep == 0 && Static179.anInt4261 == 0) {
			if (Static227.anInt5096 == 2) {
				Static125.method2450();
			} else {
				Static40.method1008();
			}
			if (Static138.anInt3439 >> 7 < 14 || Static138.anInt3439 >> 7 >= 90 || Static134.anInt3302 >> 7 < 14 || Static134.anInt3302 >> 7 >= 90) {
				Static26.method740();
			}
		}
		while (true) {
			@Pc(374) HookRequest local374;
			@Pc(379) IfType local379;
			@Pc(387) IfType local387;
			do {
				local374 = (HookRequest) Static4.aClass69_2.method2287();
				if (local374 == null) {
					while (true) {
						do {
							local374 = (HookRequest) Static115.aClass69_70.method2287();
							if (local374 == null) {
								while (true) {
									do {
										local374 = (HookRequest) Static185.aClass69_101.method2287();
										if (local374 == null) {
											if (Static105.aClass13_14 != null) {
												Static4.method28();
											}
											if (Static33.openUrlRequest != null && Static33.openUrlRequest.status == 1) {
												if (Static33.openUrlRequest.result != null) {
													Static169.openUrl(Static175.url, Static164.newTab);
												}
												Static164.newTab = false;
												Static175.url = null;
												Static33.openUrlRequest = null;
											}
											if (Static83.anInt372 % 1500 == 0) {
												Static123.method2418();
											}
											return;
										}
										local379 = local374.source;
										if (local379.componentId < 0) {
											break;
										}
										local387 = Static5.getComponent(local379.layer);
									} while (local387 == null || local387.createdComponents == null || local387.createdComponents.length <= local379.componentId || local379 != local387.createdComponents[local379.componentId]);
									Static82.method1767(local374);
								}
							}
							local379 = local374.source;
							if (local379.componentId < 0) {
								break;
							}
							local387 = Static5.getComponent(local379.layer);
						} while (local387 == null || local387.createdComponents == null || local379.componentId >= local387.createdComponents.length || local379 != local387.createdComponents[local379.componentId]);
						Static82.method1767(local374);
					}
				}
				local379 = local374.source;
				if (local379.componentId < 0) {
					break;
				}
				local387 = Static5.getComponent(local379.layer);
			} while (local387 == null || local387.createdComponents == null || local387.createdComponents.length <= local379.componentId || local379 != local387.createdComponents[local379.componentId]);
			Static82.method1767(local374);
		}
	}

	@OriginalMember(owner = "com.jagex3.client.client!com.jagex3.client.client", name = "d", descriptor = "(Z)V")
	private void js5NetworkLoop() {
		@Pc(3) boolean idle = Static107.js5Net.loop();
		if (!idle) {
			this.js5Connect();
		}
	}



	@OriginalMember(owner = "com.jagex3.client.client!com.jagex3.client.client", name = "a", descriptor = "(B)V")
	@Override
	protected final void method921() {
		if (state == 1000) {
			return;
		}
		Static83.anInt372++;
		if (Static83.anInt372 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static60.anInt1895 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static39.aRandom1.setSeed((long) Static60.anInt1895);
		}
		this.js5NetworkLoop();
		if (Static257.aClass9_2 != null) {
			Static257.aClass9_2.method179();
		}
		Static230.method3948();
		Static107.method2261();
		Static65.method1501();
		Static111.method2292();
		if (GlRenderer.enabled) {
			Static63.method1490();
		}
		if (Static71.mouseWheelInterface != null) {
			@Pc(75) int local75 = Static71.mouseWheelInterface.method3287();
			Static58.wheelRotation = local75;
		}
		if (state == 0) {
			this.mainLoad();
			Static234.method4020();
		} else if (state == 5) {
			this.mainLoad();
			Static234.method4020();
		} else if (state == 25 || state == 28) {
			Static78.method1696();
		}
		if (state == 10) {
			this.method943();
			Static158.method3008();
			Static31.method848();
			loginPoll();
		} else if (state == 30) {
			Static81.method1756();
		} else if (state == 40) {
			loginPoll();
			if (Static266.anInt5336 != -3) {
				if (Static266.anInt5336 == 15) {
					Static44.method1146();
				} else if (Static266.anInt5336 != 2) {
					Static278.method4653();
				}
			}
		}
	}
}
