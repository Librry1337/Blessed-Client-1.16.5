package zov.blessed.crack.by.laqwrt.hooks;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemFrameEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.module.modules.HitBox;
import zov.blessed.crack.by.laqwrt.module.modules.Reach;

import java.util.Iterator;
import java.util.Optional;
import java.util.function.Predicate;

public class GameRendererHook extends GameRenderer {
    private Minecraft mc = Minecraft.getInstance();

    public GameRendererHook() {
        super(Minecraft.getInstance(), Minecraft.getInstance().getResourceManager(), Minecraft.getInstance().renderBuffers());
    }

    public void pick(float var1) {
        Entity var2 = this.mc.getCameraEntity();
        if (var2 != null && this.mc.level != null) {
            this.mc.getProfiler().push("pick");
            this.mc.crosshairPickEntity = null;
            Reach reach = (Reach) Blessed.getInstance().getModuleManager().getModuleByClass(Reach.class);
            double var4 = (double) this.mc.gameMode.getPickRange();
            this.mc.hitResult = var2.pick(var4, var1, false);
            Vector3d var6 = var2.getEyePosition(var1);
            boolean var7 = false;
            boolean var8 = true;
            double var9 = var4;
            if (this.mc.gameMode.hasFarPickRange()) {
                var9 = 6.0D;
                var4 = var9;
            } else {
                if (reach.isState()) {
                    if (var4 > (double) reach.field_697.method_1240()) {
                        var7 = true;
                    }
                } else if (var4 > 3.0D) {
                    var7 = true;
                }

                var4 = var4;
            }

            var9 *= var9;
            if (this.mc.hitResult != null) {
                var9 = this.mc.hitResult.getLocation().distanceToSqr(var6);
            }

            Vector3d var11 = var2.getViewVector(1.0F);
            Vector3d var12 = var6.add(var11.x * var4, var11.y * var4, var11.z * var4);
            float var13 = 1.0F;
            AxisAlignedBB var14 = var2.getBoundingBox().expandTowards(var11.scale(var4)).inflate(1.0D, 1.0D, 1.0D);
            EntityRayTraceResult var15 = this.リみ12(var2, var6, var12, var14, (var0) -> {
                return !var0.isSpectator() && var0.isPickable();
            }, var9);
            if (var15 != null && reach.isState() && this.mc.player.distanceTo(var15.getEntity()) <= reach.field_697.method_1240() && this.mc.player.distanceTo(var15.getEntity()) >= 3.2F && !reach.method_401(var15.getEntity())) {
                var15 = null;
            }

            if (var15 != null) {
                Entity var16 = var15.getEntity();
                Vector3d var17 = var15.getLocation();
                double var18 = var6.distanceToSqr(var17);
                if (var7 && var18 > 9.0D) {
                    this.mc.hitResult = BlockRayTraceResult.miss(var17, Direction.getNearest(var11.x, var11.y, var11.z), new BlockPos(var17));
                } else if (var18 < var9 || this.mc.hitResult == null) {
                    this.mc.hitResult = var15;
                    if (var16 instanceof LivingEntity || var16 instanceof ItemFrameEntity) {
                        if (reach.isState() && this.mc.player.distanceTo(var16) <= reach.field_697.method_1240() && this.mc.player.distanceTo(var16) >= 3.2F && !reach.method_401(var16)) {
                            var16 = null;
                        }

                        this.mc.crosshairPickEntity = var16;
                    }
                }
            }

            this.mc.getProfiler().pop();
        }

    }

    private EntityRayTraceResult リみ12(Entity var1, Vector3d var2, Vector3d var3, AxisAlignedBB var4, Predicate<Entity> var5, double var6) {
        World var8 = var1.level;
        double var9 = var6;
        Entity var11 = null;
        Vector3d var12 = null;
        HitBox var13 = (HitBox) Blessed.getInstance().getModuleManager().getModuleByClass(HitBox.class);
        Iterator var14 = var8.getEntities(var1, var4, var5).iterator();

        while (true) {
            while (var14.hasNext()) {
                Entity var15 = (Entity) var14.next();
                AxisAlignedBB var16 = var15.getBoundingBox().inflate(var13.isState() && (Boolean) var13.field_658.method_580() && var15 instanceof LivingEntity ? (double) var13.field_656.method_1240() : (double) var15.getPickRadius());
                Optional var17 = var16.clip(var2, var3);
                if (var16.contains(var2)) {
                    if (var9 >= 0.0D) {
                        var11 = var15;
                        var12 = (Vector3d) var17.orElse(var2);
                        var9 = 0.0D;
                    }
                } else if (var17.isPresent()) {
                    Vector3d var18 = (Vector3d) var17.get();
                    double var19 = var2.distanceToSqr(var18);
                    if (var19 < var9 || var9 == 0.0D) {
                        if (var15.getRootVehicle() == var1.getRootVehicle()) {
                            if (var9 == 0.0D) {
                                var11 = var15;
                                var12 = var18;
                            }
                        } else {
                            var11 = var15;
                            var12 = var18;
                            var9 = var19;
                        }
                    }
                }
            }

            return var11 == null ? null : new EntityRayTraceResult(var11, var12);
        }
    }
}
