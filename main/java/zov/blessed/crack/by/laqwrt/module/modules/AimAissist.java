package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.network.play.client.CPlayerTryUseItemOnBlockPacket;
import net.minecraft.network.play.client.CPlayerTryUseItemPacket;
import net.minecraft.network.play.client.CUseEntityPacket;
import net.minecraft.network.play.client.CUseEntityPacket.Action;
import net.minecraft.scoreboard.Score;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import zov.blessed.crack.by.laqwrt.*;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;
import zov.blessed.crack.by.laqwrt.setting.Setting;
import zov.blessed.crack.by.laqwrt.setting.settings.BooleanSetting;
import zov.blessed.crack.by.laqwrt.setting.settings.ModeSetting;
import zov.blessed.crack.by.laqwrt.setting.settings.SliderSetting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public class AimAissist extends Module {
    private SliderSetting field_971 = new SliderSetting(new String[]{"Ran", "ge"}, 3.5F, 3.0F, 6.0F, 1);
    private SliderSetting field_972 = new SliderSetting(new String[]{"FOV"}, 90.0F, 40.0F, 360.0F, 0);
    private SliderSetting field_973 = new SliderSetting(new String[]{"Spe", "ed"}, 60.0F, 10.0F, 100.0F, 0);
    private ModeSetting field_974 = new ModeSetting(new String[]{"Tar", "get", "Mode"}, TriggerBot.method_382(new ArrayList<>(), (var0) -> {
        var0.add(new String[]{"Dyn", "amic"});
        var0.add(new String[]{"La", "st", "Hit"});
    }), 0);
    private ModeSetting field_975 = new ModeSetting(new String[]{"So", "rt"}, TriggerBot.method_382(new ArrayList<>(), (var0) -> {
        var0.add(new String[]{"Dist", "ance"});
        var0.add(new String[]{"Ang", "le"});
        var0.add(new String[]{"Ang", "le", "&", "Dist", "ance"});
        var0.add(new String[]{"Hea", "lth"});
    }), 0);
    private BooleanSetting field_976;
    private BooleanSetting field_977;
    private BooleanSetting field_978;
    private BooleanSetting field_979;
    private BooleanSetting field_980;
    private BooleanSetting field_981;
    private BooleanSetting field_982;
    private final HashMap<Integer, Comparator<Entity>> field_983;
    private Entity field_984;
    private Entity field_985;
    private Vector3d field_986;

    public AimAissist() {
        super(new String[]{"Ai", "mAssi", "st"}, Category.combat);
        this.field_976 = new BooleanSetting(new String[]{"Players"}, true, Items.PLAYER_HEAD);
        this.field_977 = new BooleanSetting(new String[]{"Mobs"}, false, Items.ZOMBIE_HEAD);
        this.field_978 = new BooleanSetting(new String[]{"Animals"}, false, Items.CHICKEN);
        this.field_979 = new BooleanSetting(new String[]{"Invi", "sible"}, false, Items.POTION);
        this.field_980 = new BooleanSetting(new String[]{"Vert", "ical"}, false, (Item) null);
        this.field_981 = new BooleanSetting(new String[]{"Weap", "onOn", "ly"}, false, Items.NETHERITE_SWORD);
        this.field_982 = new BooleanSetting(new String[]{"On", "Cli", "ck"}, false, (Item) null);
        this.field_983 = Class_198.method_868(new HashMap(), (var1) -> {
            var1.put(0, Comparator.comparingDouble((var1x) -> {
                return this.method_782(this.mc.player, (Entity) var1x);
            }));
            var1.put(1, Comparator.comparingDouble(this::method_774));
            var1.put(2, Comparator.comparingDouble(this::method_774).thenComparingDouble((var1x) -> {
                return this.method_782(this.mc.player, var1x);
            }));
            var1.put(3, Comparator.comparingDouble((var0) -> {
                return method_775((LivingEntity) var0);
            }));
        });
        this.addSettings(new Setting[]{this.field_971, this.field_972, this.field_973, this.field_974, this.field_976, this.field_977, this.field_978, this.field_979, this.field_981, this.field_980, this.field_982});
    }

    @Override
    public boolean packetEvent(Object var1, Class_64 var2) {
        if (var2 == Class_64.ラもをスろりウやメきヤ && var1 instanceof CUseEntityPacket) {
            CUseEntityPacket var3 = (CUseEntityPacket) var1;
            Entity var4 = var3.getTarget(this.mc.level);
            if (this.method_767(var4)) {
                this.field_984 = var4;
            }
        }

        return var2 == Class_64.ラもをスろりウやメきヤ && this.method_771(this.field_985, this.mc.getFrameTime()) && this.method_768() && (!this.mc.player.isUsingItem() || !this.mc.player.getUseItem().isEdible()) && (var1 instanceof CPlayerTryUseItemOnBlockPacket || var1 instanceof CPlayerTryUseItemPacket || var1 instanceof CUseEntityPacket) && (!(var1 instanceof CUseEntityPacket) || ((CUseEntityPacket) var1).getAction() != Action.ATTACK) ? false : super.packetEvent(var1, var2);
    }

    public void method_211() {
        if (this.mc.screen == null) {
            if ((Boolean) this.field_981.method_580()) {
                Item var1 = this.mc.player.getMainHandItem().getItem();
                if (var1 != Items.WOODEN_AXE && var1 != Items.WOODEN_SWORD && var1 != Items.STONE_AXE && var1 != Items.STONE_SWORD && var1 != Items.IRON_AXE && var1 != Items.IRON_SWORD && var1 != Items.GOLDEN_AXE && var1 != Items.GOLDEN_SWORD && var1 != Items.DIAMOND_AXE && var1 != Items.DIAMOND_SWORD && var1 != Items.NETHERITE_AXE && var1 != Items.NETHERITE_SWORD) {
                    return;
                }
            }

            this.field_985 = this.field_974.method_436() == 0 ? this.method_772() : this.field_984;
            if (this.field_985 != null) {
                if (!this.field_985.isAlive()) {
                    this.field_985 = null;
                    this.field_986 = null;
                } else {
                    if (this.method_771(this.field_985, this.mc.getFrameTime())) {
                        Vector3d var6 = this.field_986 = this.method_784(this.field_985, this.mc.getFrameTime()).add(0.0D, (double) this.field_985.getBbHeight() / 1.5D, 0.0D);
                        Class_129 var2 = this.method_770(var6, this.mc.getFrameTime());
                        Class_129 var3 = new Class_129(this.mc.player.yRot, this.mc.player.xRot);
                        double var4 = (double) (180.0F * this.field_973.method_1240() * 0.01F);
                        var4 *= (double) this.mc.getDeltaFrameTime();
                        var4 /= 5.0D;
                        var2 = this.method_776(var3, var2, var4);
                        if ((Boolean) this.field_982.method_580()) {
                            if (this.method_768()) {
                                this.mc.player.yRot = var2.method_421();
                                if ((Boolean) this.field_980.method_580()) {
                                    this.mc.player.xRot = var2.method_422();
                                }
                            }
                        } else {
                            this.mc.player.yRot = var2.method_421();
                            if ((Boolean) this.field_980.method_580()) {
                                this.mc.player.xRot = var2.method_422();
                            }
                        }
                    } else {
                        this.field_986 = null;
                    }

                    super.method_211();
                }
            }
        }
    }

    public void method_217(Class_41 var1) {
        if (this.field_986 != null) {
            HitBox var2 = (HitBox) Blessed.getInstance().getModuleManager().getModuleByClass(HitBox.class);
            if (!var2.isState() || !(Boolean) var2.field_659.method_580() || var2.method_337() == null) {
                Class_129 var3 = this.method_769(this.field_986, this.mc.getFrameTime());
                Class_129 var4 = new Class_129(this.mc.player);
                double var5 = (double) (180.0F * this.field_973.method_1240() * 0.01F);
                var5 *= (double) this.mc.getDeltaFrameTime();
                var5 /= 5.0D;
                var3 = this.method_776(var4, var3, var5);
                float var7 = this.mc.player.yRot;
                float var8 = this.mc.player.xRot;
                if ((Boolean) this.field_982.method_580()) {
                    if (this.method_768()) {
                        var7 = var3.method_421();
                        if ((Boolean) this.field_980.method_580()) {
                            var8 = var3.method_422();
                        }
                    }
                } else {
                    var7 = var3.method_421();
                    if ((Boolean) this.field_980.method_580()) {
                        var8 = var3.method_422();
                    }
                }

                Class_129 var9 = new Class_129(var7, var8);
                var1.method_69(var9);
            }
        }
    }

    public boolean method_767(Entity var1) {
        if (!(var1 instanceof LivingEntity)) {
            return false;
        } else if (Blessed.getInstance().method_825().method_1134(var1.getName().getString())) {
            return false;
        } else if (var1.isInvisible() && !(Boolean) this.field_979.method_580()) {
            return false;
        } else if (var1 != this.mc.player && !(((LivingEntity) var1).getHealth() <= 0.0F) && var1.isAlive()) {
            if (var1 instanceof PlayerEntity && (Boolean) this.field_976.method_580()) {
                return true;
            } else if (var1 instanceof MonsterEntity && (Boolean) this.field_977.method_580()) {
                return true;
            } else {
                return var1 instanceof AnimalEntity && (Boolean) this.field_978.method_580();
            }
        } else {
            return false;
        }
    }

    private boolean method_768() {
        return (Boolean) this.field_982.method_580() && this.mc.options.keyUse.isDown();
    }

    public Class_129 method_769(Vector3d var1, float var2) {
        Vector3d var3 = var1.subtract(this.mc.player.getEyePosition(var2));
        double var4 = Math.hypot(var3.x(), var3.z());
        return new Class_129((float) Math.toDegrees(Math.atan2(var3.z(), var3.x()) + (Math.random() - 0.5D) / 10.0D) - 90.0F, (float) Math.toDegrees(-Math.atan2(var3.y(), var4) + (Math.random() - 0.5D) / 100.0D));
    }

    public Class_129 method_770(Vector3d var1, float var2) {
        Vector3d var3 = var1.subtract(this.mc.player.getEyePosition(var2));
        double var4 = Math.hypot(var3.x(), var3.z());
        return new Class_129((float) Math.toDegrees(Math.atan2(var3.z(), var3.x())) - 90.0F, (float) Math.toDegrees(-Math.atan2(var3.y(), var4)));
    }

    private boolean method_771(Entity var1, float var2) {
        if (!(var1 instanceof LivingEntity)) {
            return false;
        } else if (!this.method_778(var1, this.field_972.method_1240() / 2.0F)) {
            return false;
        } else {
            double var3 = this.method_781(this.mc.player, var1, var2);
            if (var3 > (double) this.field_971.method_1240()) {
                return false;
            } else {
                return var3 < 0.5D ? false : this.mc.player.canSee(var1);
            }
        }
    }

    public Entity method_772() {
        Entity var1 = null;
        Iterator var2 = this.mc.level.entitiesForRendering().iterator();

        while (true) {
            Entity var3;
            do {
                do {
                    if (!var2.hasNext()) {
                        return var1;
                    }

                    var3 = (Entity) var2.next();
                } while (!this.method_767(var3));
            } while (var1 != null && ((Comparator) this.field_983.get(this.field_975.method_436())).compare(var3, var1) >= 0);

            var1 = var3;
        }
    }

    public double method_773(double var1, double var3) {
        double var5 = Math.abs(var1 - var3) % 360.0D;
        if (var5 > 180.0D) {
            var5 = 360.0D - var5;
        }

        return var5;
    }

    public double method_774(Entity var1) {
        double var2 = Math.atan2(var1.getZ() - this.mc.player.getZ(), var1.getX() - this.mc.player.getX()) * 180.0D / 3.141592653589793D - 90.0D;
        return Math.abs(MathHelper.wrapDegrees(var2 - (double) this.mc.player.yRot));
    }

    public static double method_775(LivingEntity var0) {
        Minecraft var1 = Minecraft.getInstance();
        boolean var2 = var1.getCurrentServer() != null && var1.getCurrentServer().ip.toLowerCase().contains("funtime");
        if (var2 && var0.getHealth() > 20.0F) {
            Score var5 = var1.level.getScoreboard().getOrCreatePlayerScore(var0.getScoreboardName(), var1.level.getScoreboard().getDisplayObjective(2));
            return (double) var5.getScore();
        } else {
            double var3 = (double) var0.getHealth();
            if (Double.isNaN(var3)) {
                return -1.0D;
            } else if (Double.isInfinite(var3)) {
                return -2.0D;
            } else if (var3 == Double.MAX_VALUE) {
                return -3.0D;
            } else {
                return var3 == Double.MIN_VALUE ? -4.0D : var3;
            }
        }
    }

    public Class_129 method_776(Class_129 var1, Class_129 var2, double var3) {
        float var5 = var2.method_421();
        float var6 = var2.method_422();
        float var7 = var1.method_421();
        float var8 = var1.method_422();
        if (var3 != 0.0D) {
            float var9 = (float) var3;
            double var10 = (double) MathHelper.wrapDegrees(var2.method_421() - var1.method_421());
            double var12 = (double) (var6 - var8);
            double var14 = Math.sqrt(var10 * var10 + var12 * var12);
            double var16 = Math.abs(var10 / var14);
            double var18 = Math.abs(var12 / var14);
            if (var14 != 0.0D) {
                double var20 = (double) var9 * var16;
                double var22 = (double) var9 * var18;
                float var24 = (float) Math.max(Math.min(var10, var20), -var20);
                float var25 = (float) Math.max(Math.min(var12, var22), -var22);
                var5 = var7 + var24;
                var6 = var8 + var25;
            }
        }

        Class_129 var26 = new Class_129(var5, var6);
        Class_129 var27 = method_777(var26, var1);
        var27 = this.method_779(var27);
        var5 = var27.method_421();
        var6 = Math.max(-90.0F, Math.min(90.0F, var27.method_422()));
        return new Class_129(var5, var6);
    }

    private static Class_129 method_777(Class_129 var0, Class_129 var1) {
        float var2 = var1.method_421() + MathHelper.wrapDegrees(var0.method_421() - var1.method_421());
        float var3 = var1.method_422() + MathHelper.wrapDegrees(var0.method_422() - var1.method_422());
        return new Class_129(var2, var3);
    }

    public boolean method_778(Entity var1, float var2) {
        return this.method_780(this.mc.player, var1, var2);
    }

    private Class_129 method_779(Class_129 var1) {
        double var2 = this.mc.options.sensitivity * 0.6D + 0.2D;
        double var4 = var2 * var2 * var2 * 8.0D * 0.15D;
        float var6 = (float) ((double) Math.round((double) var1.method_421() / var4) * var4);
        float var7 = (float) ((double) Math.round((double) var1.method_422() / var4) * var4);
        return new Class_129(var6, MathHelper.clamp(var7, -90.0F, 90.0F));
    }

    public boolean method_780(Entity var1, Entity var2, float var3) {
        double var4 = var2.getX() - var1.getX();
        double var6 = var2.getZ() - var1.getZ();
        double var8 = Math.toDegrees(Math.atan2(var6, var4)) - 90.0D;
        double var10 = this.method_773(var8, (double) var1.yRot);
        return var10 <= (double) var3;
    }

    public double method_781(Entity var1, Entity var2, float var3) {
        Vector3d var4 = this.method_784(var1, var3);
        Vector3d var5 = this.method_784(var2, var3);
        return this.method_783(var4.x(), var4.y(), var4.z(), var5.x(), var5.y(), var5.z());
    }

    public double method_782(Entity var1, Entity var2) {
        return this.method_783(var1.getX(), var1.getY(), var1.getZ(), var2.getX(), var2.getY(), var2.getZ());
    }

    public double method_783(double var1, double var3, double var5, double var7, double var9, double var11) {
        double var13 = var1 - var7;
        double var15 = var3 - var9;
        double var17 = var5 - var11;
        return Math.sqrt(var13 * var13 + var15 * var15 + var17 * var17);
    }

    public Vector3d method_784(Entity var1, float var2) {
        double var3 = Class_233.method_1076(var1.xOld, var1.getX(), (double) var2);
        double var5 = Class_233.method_1076(var1.yOld, var1.getY(), (double) var2);
        double var7 = Class_233.method_1076(var1.zOld, var1.getZ(), (double) var2);
        return new Vector3d(var3, var5, var7);
    }
}
