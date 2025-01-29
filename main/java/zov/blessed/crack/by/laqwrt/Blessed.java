package zov.blessed.crack.by.laqwrt;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.GameSettings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MouseHelper;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.client.gui.chat.NarratorChatListener;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.util.InputMappings;
import net.minecraft.client.util.InputMappings.Type;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.profiler.TimeTracker;
import net.minecraft.util.MovementInputFromOptions;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import zov.blessed.crack.by.laqwrt.animations.Class_56;
import zov.blessed.crack.by.laqwrt.clickgui.ClickGUIScreen;
import zov.blessed.crack.by.laqwrt.hooks.MovementInputFromOptionsHook;
import zov.blessed.crack.by.laqwrt.hooks.TimeTrackerHook;
import zov.blessed.crack.by.laqwrt.module.ModuleManager;
import zov.blessed.crack.by.laqwrt.utils.RenderUtil;
import zov.blessed.crack.by.laqwrt.hooks.GameRendererHook;
import zov.blessed.crack.by.laqwrt.module.Module;
import zov.blessed.crack.by.laqwrt.module.modules.ObsBypass;
import zov.blessed.crack.by.laqwrt.utils.ShaderUtil;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Blessed {
    private static Blessed instance;
    private ModuleManager moduleManager;
    public ClickGUIScreen clickGUIScreen;
    private Class_258 field_993;
    private ShaderUtil shaderUtil;
    private Class_59 field_995;
    private Class_59 field_996;
    private Class_161 field_997;
    private Class_161 field_998;
    private Class_96 field_999;
    private Class_247 field_1000;
    private KeyBinding field_1001;
    private TimeTracker timeTracker;
    private NarratorChatListener field_1003;
    private Class_186 field_1004;
    private Thread field_1005 = null;
    private Class_41 field_1006;
    private IItemPropertyGetter field_1007;
    private String hwid;
    private boolean field_1009 = false;
    Map<Item, Map<ResourceLocation, IItemPropertyGetter>> field_1010;
    public Class_89 field_1011;
    private final Minecraft mc = Minecraft.getInstance();
    private GameRenderer field_1013;
    private boolean field_1014 = false;
    private boolean field_1015 = false;
    public static Entity field_1016 = null;
    private double field_1017 = -1.0D;
    private double field_1018 = -1.0D;
    private double field_1019 = -1.0D;
    private double field_1020 = -1.0D;
    private double field_1021 = -1.0D;
    private double field_1022 = -1.0D;
    private long field_1023;
    private double field_1024;
    public static String isBeta = null;
    private MovementInputFromOptionsHook movementInputFromOptionsHook;

    public Blessed(String var1, int var2) {
        this.movementInputFromOptionsHook = new MovementInputFromOptionsHook(this, Minecraft.getInstance().options);
        boolean var3 = Class_214.method_954(Minecraft.class, "instance") != null;
        this.field_1011 = new Class_89(var3 ? -1 : var2);
        this.hwid = var1;
        instance = this;
        this.moduleManager = new ModuleManager();
        this.clickGUIScreen = new ClickGUIScreen();
        this.field_993 = new Class_258();
        this.field_1000 = new Class_247();
        this.field_1004 = new Class_186();
        this.field_1006 = new Class_41();
        (new Thread(() -> {
            while (true) {
                if (Minecraft.getInstance().player == null && this.field_1015) {
                    this.field_1015 = false;
                }

                try {
                    Thread.sleep(300L);
                } catch (InterruptedException var22) {
                    var22.hashCode();
                }
            }
        })).start();
        (new Thread(() -> {
            while (this.field_1009 || Minecraft.getInstance().player == null) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException var7) {
                    var7.hashCode();
                }
            }

            this.field_1009 = true;
            Class_48.method_118();
            Class_27.method_35();

            try {
                Field[] declaredFields = Minecraft.class.getDeclaredFields();
                for (Field field : declaredFields) {
                    if (field.getType().getName().contains(TimeTracker.class.getName())) {
                        field.setAccessible(true);
                        this.timeTracker = (TimeTracker) Class_101.method_358(field, Minecraft.getInstance());
                        Class_101.method_357(field, new TimeTrackerHook(System::nanoTime, () -> 0), Minecraft.getInstance());
                    }
                }

                Field var9 = GameSettings.class.getDeclaredFields()[73];
                var9.setAccessible(true);
                this.field_1001 = (KeyBinding) Class_101.method_358(var9, Minecraft.getInstance().options);
                Class_101.method_357(var9, new Class_191("key.use", Type.MOUSE, 1, "key.categories.gameplay"), Minecraft.getInstance().options);
            } catch (Exception var8) {
                var8.hashCode();
            }

            Field[] declaredFields = ItemModelsProperties.class.getDeclaredFields();
            for (Field field : declaredFields) {
                if (method_827(field)) {
                    field.setAccessible(true);

                    try {
                        this.field_1010 = (Map) field.get((Object) null);
                        this.field_1007 = (IItemPropertyGetter) ((Map) this.field_1010.get(Items.CLOCK)).get(new ResourceLocation("time"));
                    } catch (IllegalAccessException | IllegalArgumentException var6) {
                        var6.hashCode();
                    }
                }
            }

            ((Map) this.field_1010.get(Items.CLOCK)).put(new ResourceLocation("time"), new IItemPropertyGetter() {
                public float call(ItemStack var1, ClientWorld var2, LivingEntity var3) {
                    if (var1 == ClickGUIScreen.CLOCK_ITEM) {
                        double var4 = 300.0D;
                        double var6 = (double) (System.currentTimeMillis() - ClickGUIScreen.startTime) / var4;
                        var6 = MathHelper.clamp(var6, 0.0D, 1.0D);
                        return Blessed.this.getClickGUIScreen().selectedTheme == Blessed.this.getClickGUIScreen().themes.get(1) ? 0.5F + 0.5F * (float) var6 : 0.5F * (float) var6;
                    } else {
                        return 0.0F;
                    }
                }
            });
            Method var10 = Class_253.method_1148(MouseHelper.class, (var0) -> {
                return var0.getParameterCount() == 4 && var0.getParameterTypes()[0] == Long.TYPE && !var0.getName().contains("lambda");
            });
            Minecraft var11 = Minecraft.getInstance();
            long var12 = var11.getWindow().getWindow();
            GLFW.glfwSetMouseButtonCallback(var12, (var5, var7x, var8x, var9x) -> {
                if (var5 == var12) {
                    if (!this.field_999.flag) {
                        this.method_819(var7x, var8x, var9x);
                    }

                    Minecraft.getInstance().execute(() -> {
                        Class_253.method_1163(var10, var11.mouseHandler, var5, var7x, var8x, var9x);
                    });
                }
            });
          /*  Runtime.getRuntime().addShutdownHook(this.field_1005 = new Thread(() -> {
                getInstance().method_813("http://212.113.106.115/saveConfig.php?hwid=" + getInstance().method_826() + "&cfg=" + getInstance().method_812().method_792());
            }));*/
        })).start();
        this.method_795();
    }

    private void method_795() {
        Class_147 var1 = Class_214.method_956(PlayerEntity.class, this.field_1011.method_310("tick"));
        Class_37.method_62(var1, this::method_797);
        Class_37.method_64(var1, this::method_798);
        Class_147 var2 = Class_214.method_956(ClientPlayerEntity.class, this.field_1011.method_310("onUpdateWalkingPlayer"));
        Class_37.method_62(var2, this::method_799);
        Class_37.method_64(var2, this::method_800);
        Class_147 var3 = Class_214.method_958(Entity.class, (var0) -> {
            return var0.getParameterCount() == 2 && var0.getParameterTypes()[0] == Float.TYPE && var0.getParameterTypes()[1] == Vector3d.class && Modifier.isPublic(var0.getModifiers());
        });
        Class_37.method_62(var3, this::method_801);
        Class_37.method_64(var3, this::method_802);
        Class_147 var4 = Class_214.method_956(LivingEntity.class, this.field_1011.method_310("jump"));
        Class_37.method_62(var4, this::method_803);
        Class_37.method_64(var4, this::method_804);
    }

    private void method_796() {
    }

    public void method_797(PlayerEntity var1) {
        if (var1 == this.mc.player) {
            Iterator var2 = this.getModuleManager().getModules().iterator();

            while (var2.hasNext()) {
                Module var3 = (Module) var2.next();
                if (var3.isState()) {
                    var3.method_217(this.field_1006);
                }
            }

            this.field_1006.method_76();
        }
    }

    public void method_798(PlayerEntity var1) {
        if (var1 == this.mc.player) {
            this.field_1006.method_77();
        }
    }

    public void method_799(ClientPlayerEntity var1) {
        if (var1 == this.mc.player) {
            this.field_1006.method_78();
        }
    }

    public void method_800(ClientPlayerEntity var1) {
        if (var1 == this.mc.player) {
            this.field_1006.method_79();
        }
    }

    public void method_801(Entity var1) {
        if (var1 == this.mc.player) {
            this.field_1006.method_80();
        }
    }

    public void method_802(Entity var1) {
        if (var1 == this.mc.player) {
            this.field_1006.method_81();
        }
    }

    public void method_803(LivingEntity var1) {
        if (var1 == this.mc.player) {
            this.field_1006.method_82();
        }
    }

    public void method_804(LivingEntity var1) {
        if (var1 == this.mc.player) {
            this.field_1006.method_83();
        }
    }

    public ClickGUIScreen getClickGUIScreen() {
        return this.clickGUIScreen;
    }

    public Class_258 method_806() {
        return this.field_993;
    }

    public ModuleManager getModuleManager() {
        return this.moduleManager;
    }

    public static Blessed getInstance() {
        return instance;
    }

    public ShaderUtil method_809() {
        return this.shaderUtil;
    }

    public void method_810() {
        this.field_999.flag = true;

        Field[] var1;
        int var2;
        int var3;
        Field var4;
        try {
            var1 = Minecraft.class.getDeclaredFields();
            var2 = var1.length;

            for (var3 = 0; var3 < var2; ++var3) {
                var4 = var1[var3];
                if (var4.getType().getName().equals(GameRenderer.class.getName())) {
                    var4.setAccessible(true);
                    Class_101.method_357(var4, this.field_1013, Minecraft.getInstance());
                }

                if (var4.getType().getName().contains(TimeTracker.class.getName())) {
                    var4.setAccessible(true);
                    Class_101.method_357(var4, this.timeTracker, Minecraft.getInstance());
                }
            }

            Field var7 = GameSettings.class.getDeclaredFields()[73];
            var7.setAccessible(true);
            Class_101.method_357(var7, new KeyBinding("key.use", Type.MOUSE, 1, "key.categories.gameplay"), Minecraft.getInstance().options);
            ((Map) this.field_1010.get(Items.CLOCK)).put(new ResourceLocation("time"), this.field_1007);
        } catch (Exception var6) {
        }

        try {
            var1 = NarratorChatListener.class.getDeclaredFields();
            var2 = var1.length;

            for (var3 = 0; var3 < var2; ++var3) {
                var4 = var1[var3];
                if (var4.getType().getName().equals(NarratorChatListener.class.getName())) {
                }
            }
        } catch (Exception var5) {
            var5.hashCode();
        }

        Class_174.method_722();
        long var8 = this.mc.getWindow().getWindow();
        this.mc.keyboardHandler.setup(var8);
        this.mc.mouseHandler.setup(var8);
        Minecraft.getInstance().player.input = new MovementInputFromOptions(Minecraft.getInstance().options);
        Runtime.getRuntime().removeShutdownHook(this.field_1005);
        this.field_1005 = null;
        instance = null;
        this.field_999.destruct();
        this.field_1004 = null;
        this.clickGUIScreen = null;
        this.field_993 = null;
        this.field_999 = null;
        this.field_997 = null;
        this.field_1000 = null;
        this.moduleManager.getModules().clear();
        this.moduleManager = null;
        this.shaderUtil = null;
    }

    private void method_811() {
        try {
            Field[] var1 = Minecraft.class.getDeclaredFields();
            int var2 = var1.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                Field var4 = var1[var3];
                if (var4.getType().getName().equals(GameRenderer.class.getName())) {
                    var4.setAccessible(true);
                    this.field_1013 = (GameRenderer) Class_101.method_358(var4, Minecraft.getInstance());
                    Class_101.method_357(var4, new GameRendererHook(), Minecraft.getInstance());
                }
            }
        } catch (Exception var5) {
        }

    }

    public Class_186 method_812() {
        return this.field_1004;
    }

    public String method_813(String var1) {
        StringBuilder var2 = new StringBuilder();

        try {
            URL var3 = new URL(var1);
            URLConnection var4 = var3.openConnection();
            BufferedReader var5 = new BufferedReader(new InputStreamReader(var4.getInputStream()));

            String var6;
            while ((var6 = var5.readLine()) != null) {
                var2.append(var6 + "\n");
            }

            var5.close();
        } catch (Exception var7) {
            var7.hashCode();
        }

        return var2.toString();
    }

    public void method_814() {
        if (Minecraft.getInstance().player != null && Minecraft.getInstance().player.input != this.movementInputFromOptionsHook) {
            Minecraft.getInstance().player.input = this.movementInputFromOptionsHook;
        }

        if (!this.field_1014) {
            RenderSystem.recordRenderCall(() -> {
                this.shaderUtil = new ShaderUtil(Class_151.field_759);
                this.field_997 = new Class_161(new Font("Modern", 0, 40), true, 8);
                this.field_998 = new Class_161(new Font("Modern", 0, 34), true, 8);
                this.field_995 = new Class_59(this.field_997);
                this.field_996 = new Class_59(this.field_998);
            });
            this.field_995 = new Class_59(this.field_997);
            this.field_996 = new Class_59(this.field_998);

            try {
            //    this.method_812().method_793(this.method_813("http://212.113.106.115/getConfig.php?hwid=" + this.hwid));
            } catch (Exception var3) {
            //    this.method_813("http://212.113.106.115/saveConfig.php?hwid=" + this.hwid + "&cfg=" + this.method_812().method_792());
            }

            this.method_811();
            this.field_1014 = true;
        }

        if (Minecraft.getInstance().player != null && Minecraft.getInstance().level != null) {
            if (!this.field_1015) {
                this.field_999 = new Class_96();
                this.field_1015 = true;
            }

            Iterator var1 = this.getModuleManager().getModules().iterator();

            while (var1.hasNext()) {
                Module var2 = (Module) var1.next();
                if (var2.isState()) {
                    var2.method_207();
                }

                if (Minecraft.getInstance().screen == null && var2.getKey() > 0) {
                    if (!InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), var2.getKey())) {
                        var2.method_201(false);
                    }

                    if (InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), var2.getKey()) && !var2.method_200()) {
                        var2.toggle(!var2.isState());
                        var2.method_201(true);
                    }
                }
            }
        } else {
            this.field_1015 = false;
        }

    }

    public static Entity method_815() {
        if (field_1016 != null && !field_1016.isAlive()) {
            field_1016 = null;
        }

        return field_1016;
    }

    public void method_816() {
        this.method_806().method_1168();
        Iterator var1 = this.getModuleManager().getModules().iterator();

        while (var1.hasNext()) {
            Module var2 = (Module) var1.next();
            if (var2.isState()) {
                try {
                    var2.method_208();
                } catch (Exception var20) {
                }
            }
        }

        this.method_806().method_1169();
        if (!getInstance().getModuleManager().getModuleByClass(ObsBypass.class).isState() && RenderSystem.isOnRenderThread()) {
            Class_48.method_120(30);
            Class_27.method_37(10);
        }

        this.method_806().method_1168();
        if (Minecraft.getInstance().screen instanceof ClickGUIScreen) {
            this.getClickGUIScreen().drawScreen();
        }

        this.method_806().method_1169();
        if (isBeta != null && this.field_997 != null) {
            double var21 = 3000.0D;
            double var3 = (double) System.currentTimeMillis() % var21 / var21;
            var3 = Class_56.field_288.むナ12(var3);
            if (var3 > 0.5D) {
                var3 = 1.0D - var3;
            }

            float var5 = (float) var3 * 2.0F;
            float var6 = 3.0F;
            float var7 = (float) this.field_997.method_618(isBeta);
            float var8 = 9.0F;
            float var9 = (float) (Minecraft.getInstance().getWindow().getGuiScaledWidth() / 2) - var7 / 2.0F;
            float var10 = 3.0F;
            var9 += var7 / 2.0F * (1.0F - var5 * var6);
            var10 += var8 / 2.0F * (1.0F - var5) * 10.0F;
            var9 /= var5 * var6;
            var10 /= var5;
            GL11.glPushMatrix();
            GL11.glScalef(var5 * var6, var5, 1.0F);
            this.field_997.method_601(isBeta, var9, var10, -65536);
            GL11.glPopMatrix();
        }

        if (isBeta != null && this.field_997 != null) {
            isBeta = "THIS IS BETA ";
            char[] var22 = isBeta.toCharArray();
            double var23 = (double) var22.length * 1.0D;
            var23 += 9.0D;
            int var4 = (int) (this.field_1019 + (this.field_1017 - this.field_1019) * (double) Minecraft.getInstance().getFrameTime());
            int var24 = (int) (this.field_1020 + (this.field_1018 - this.field_1020) * (double) Minecraft.getInstance().getFrameTime());
            GL11.glPushMatrix();
            short var25 = 2000;
            long var26 = System.currentTimeMillis();
            double var27 = (double) (var26 % (long) var25) / (double) var25;
            if (var27 > 0.5D) {
                var27 = 1.0D - var27;
            }

            var27 *= 2.0D;
            var27 = Class_56.field_307.むナ12(var27);
            short var11 = 5000;
            double var12 = (double) (var26 % (long) var11) / (double) var11;
            if (var12 > 0.5D) {
                var12 = 1.0D - var12;
            }

            var12 *= 2.0D;
            var12 = Class_56.field_307.むナ12(var12);
            double var14 = 0.3D;
            double var16 = 1.0D + MathHelper.lerp(var27, -var14, var14);
            double var18 = 1.0D + MathHelper.lerp(1.0D - var27, -var14, var14);
            var16 *= 0.5D + var12;
            var18 *= 0.5D + var12;
            GL11.glScaled(var16, var18, 1.0D);
            GL11.glTranslated((double) var4 / var16, (double) var24 / var18, 0.0D);
            GL11.glPopMatrix();
        }

    }

    private void method_817() {
        if (isBeta != null) {
            char[] var1 = isBeta.toCharArray();
            double var2 = (double) var1.length * 1.0D;
            var2 += 9.0D;
            double var4 = (double) Minecraft.getInstance().getWindow().getGuiScaledWidth() - var2;
            double var6 = (double) Minecraft.getInstance().getWindow().getGuiScaledHeight() - var2;
            if (this.field_1023 < System.currentTimeMillis() - 6000L) {
                this.field_1023 = System.currentTimeMillis();
                this.field_1017 = -1.0D;
            }

            if (this.field_1017 == -1.0D) {
                Random var8 = new Random();
                this.field_1017 = var2 + (double) var8.nextInt((int) (var4 - 2.0D * var2));
                this.field_1018 = var2 + (double) var8.nextInt((int) (var6 - 2.0D * var2));
                this.field_1021 = (double) (1 + var8.nextInt(5));
                this.field_1022 = (double) (1 + var8.nextInt(5));
            }

            if (this.field_1017 <= var2 || this.field_1017 >= var4) {
                this.field_1021 = -this.field_1021;
            }

            if (this.field_1018 <= var2 || this.field_1018 >= var6) {
                this.field_1022 = -this.field_1022;
            }

            this.field_1019 = this.field_1017;
            this.field_1020 = this.field_1018;
            this.field_1017 += this.field_1021;
            this.field_1018 += this.field_1022;
            if (this.field_1017 <= var2 || this.field_1017 >= var4) {
                this.field_1021 = -this.field_1021;
            }

            if (this.field_1018 <= var2 || this.field_1018 >= var6) {
                this.field_1022 = -this.field_1022;
            }

            if (this.field_1017 <= var2 || this.field_1017 >= var4) {
                this.field_1021 = -this.field_1021;
                this.field_1017 = Math.min(Math.max(this.field_1017, var2), var4);
                this.field_1024 = 1.0D;
                this.field_1023 = System.currentTimeMillis();
            }

            if (this.field_1018 <= var2 || this.field_1018 >= var6) {
                this.field_1022 = -this.field_1022;
                this.field_1018 = Math.min(Math.max(this.field_1018, var2), var6);
                this.field_1024 = -1.0D;
                this.field_1023 = System.currentTimeMillis();
            }

        }
    }

    private void method_818(int var1, int var2, char[] var3, double var4) {
        double var6 = 360.0D / (double) var3.length;
        GL11.glPushMatrix();
        RenderUtil.method_1003((double) var1, (double) var2, var4, 3.0F, new Color(0, 255, 0, 255));
        RenderUtil.method_1003((double) var1, (double) var2, var4 + (double) this.field_997.method_611() - 2.0D, 3.0F, new Color(0, 255, 0, 255));
        GL11.glPopMatrix();
        double var8 = 3000.0D;
        double var10 = (double) System.currentTimeMillis() % var8 / var8;
        double var12 = var10 * 360.0D * this.field_1024;

        for (int var14 = 0; var14 < var3.length; ++var14) {
            char var15 = var3[var14];
            double var16 = var6 * (double) var14 - var12;
            double var18 = Math.toRadians(var16);
            double var20 = (double) var1 + Math.cos(var18) * var4;
            double var22 = (double) var2 + Math.sin(var18) * var4;
            GL11.glPushMatrix();
            GL11.glTranslated(var20, var22, 0.0D);
            GL11.glRotated(var16 + 90.0D + 10.0D, 0.0D, 0.0D, 1.0D);
            GL11.glTranslated(0.0D, (double) (-this.field_997.method_611()) - 0.5D, 0.0D);
            this.field_997.method_601(String.valueOf(var15), 0.0F, 0.0F, -65536);
            GL11.glPopMatrix();
        }

    }

    private void method_819(int var1, int var2, int var3) {
        Iterator var4 = this.getModuleManager().getModules().iterator();

        while (var4.hasNext()) {
            Module var5 = (Module) var4.next();
            if (var5.isState()) {
                var5.method_216(var1, var2, var3);
            }
        }

        this.method_796();
    }

    public void method_820() {
        Iterator var1 = this.getModuleManager().getModules().iterator();

        while (var1.hasNext()) {
            Module var2 = (Module) var1.next();
            if (var2.isState()) {
                var2.method_211();
            }
        }

    }

    public void method_821() {
        this.method_817();
        Iterator var1 = this.getModuleManager().getModules().iterator();

        while (var1.hasNext()) {
            Module var2 = (Module) var1.next();
            if (var2.isState()) {
                var2.method_212();
            }
        }

    }

    public void method_822() {
        Iterator var1 = this.getModuleManager().getModules().iterator();

        while (var1.hasNext()) {
            Module var2 = (Module) var1.next();
            if (var2.isState()) {
                var2.method_214();
            }
        }

    }

    public Class_59 method_823() {
        return this.field_995;
    }

    public Class_59 method_824() {
        return this.field_996;
    }

    public Class_247 method_825() {
        return this.field_1000;
    }

    public String method_826() {
        return this.hwid;
    }

    private static boolean method_827(Field var0) {
        if (Map.class.isAssignableFrom(var0.getType())) {
            java.lang.reflect.Type var1 = var0.getGenericType();
            if (var1 instanceof ParameterizedType) {
                ParameterizedType var2 = (ParameterizedType) var1;
                java.lang.reflect.Type[] var3 = var2.getActualTypeArguments();
                if (var3.length == 2) {
                    java.lang.reflect.Type var4 = var3[0];
                    java.lang.reflect.Type var5 = var3[1];
                    if (var4 == Item.class && var5 instanceof ParameterizedType) {
                        ParameterizedType var6 = (ParameterizedType) var5;
                        java.lang.reflect.Type[] var7 = var6.getActualTypeArguments();
                        if (var7.length == 2 && var6.getRawType() == Map.class && var7[0] == ResourceLocation.class && var7[1] == IItemPropertyGetter.class) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

    public Class_41 method_828() {
        return this.field_1006;
    }

    // $FF: synthetic method
    public static Class_41 method_838(Blessed var0) {
        return var0.field_1006;
    }
}
