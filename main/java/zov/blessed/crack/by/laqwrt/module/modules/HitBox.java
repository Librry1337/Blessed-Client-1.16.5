package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import java.util.Iterator;
import java.util.Optional;
import java.util.function.Predicate;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.network.play.client.CUseEntityPacket;
import net.minecraft.network.play.client.CUseEntityPacket.Action;
import net.minecraft.util.MovementInput;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceContext.BlockMode;
import net.minecraft.util.math.RayTraceContext.FluidMode;
import net.minecraft.util.math.RayTraceResult.Type;
import net.minecraft.util.math.vector.Vector3d;
import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.Class_129;
import zov.blessed.crack.by.laqwrt.Class_41;
import zov.blessed.crack.by.laqwrt.Class_64;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;
import zov.blessed.crack.by.laqwrt.setting.Setting;
import zov.blessed.crack.by.laqwrt.setting.settings.BooleanSetting;
import zov.blessed.crack.by.laqwrt.setting.settings.SliderSetting;

public class HitBox extends Module {
   public SliderSetting field_656 = new SliderSetting(new String[]{"Exp", "and"}, 0.0F, 0.0F, 10.0F, 1);
   public SliderSetting field_657 = new SliderSetting(new String[]{"Elytra", "Exp"}, 0.0F, 0.0F, 10.0F, 1);
   public BooleanSetting field_658 = new BooleanSetting(new String[]{"Invis", "ible"}, false, (Item)null);
   public BooleanSetting field_659;
   private Vector3d field_660;

   public HitBox() {
      super(new String[]{"Hit", "Box"}, Category.combat);
      this.field_659 = new BooleanSetting(new String[]{"Byp", "ass", "F", "T"}, true, Items.DIAMOND);
      this.addSettings(new Setting[]{this.field_656, this.field_657, this.field_659, this.field_658});
   }

   public void method_217(Class_41 var1) {
      if ((Boolean)this.field_659.method_580()) {
         this.method_207();
         Entity var2 = method_338(this.mc.player, new Class_129(this.mc.player), 3.0D, (var1x) -> {
            return var1x instanceof PlayerEntity && var1x != this.mc.player;
         });
         if (var2 != null) {
            Vector3d var3 = var2.position();
            float var4 = var2.getBbWidth() / 2.0F;
            float var5 = var2.getBbHeight();
            AxisAlignedBB var6 = (new AxisAlignedBB((double)(-var4), 0.0D, (double)(-var4), (double)var4, (double)var5, (double)var4)).inflate(-0.1D).move(var3);
            Vector3d var7 = this.method_350(var6);
            if (var7 != null) {
               this.field_660 = var7;
               Class_129 var8 = this.method_349(var7, this.mc.getFrameTime());
               var8 = new Class_129(var8.method_421(), this.mc.player.xRot);
               if (Blessed.getInstance().getModuleManager().getModuleByClass(AimAissist.class).isState()) {
                  var8 = new Class_129((float)((double)var8.method_421() + (Math.random() - 0.5D) / 10.0D), (float)((double)var8.method_422() + (Math.random() - 0.5D) / 100.0D));
               }

               var1.method_69(var8);
            }
         } else {
            this.field_660 = null;
         }
      }

   }

   public Vector3d method_337() {
      return this.field_660;
   }

   @Override
   public boolean packetEvent(Object var1, Class_64 var2) {
      if ((Boolean)this.field_659.method_580() && this.field_660 != null && var1 instanceof CUseEntityPacket) {
         CUseEntityPacket var3 = (CUseEntityPacket)var1;
         if (var3.getAction() == Action.ATTACK && this.mc.player.getEyePosition(1.0F).distanceTo(this.field_660) > 3.0D) {
            return false;
         }
      }

      return super.packetEvent(var1, var2);
   }

   public void method_207() {
      if (!(Boolean)this.field_658.method_580()) {
         Iterator var1 = this.mc.level.players().iterator();

         while(var1.hasNext()) {
            Entity var2 = (Entity)var1.next();
            if (var2 != this.mc.player) {
               double var3 = ((LivingEntity)var2).isFallFlying() ? (double)((var2.getBbWidth() + this.field_657.method_1240() / 4.0F) / 2.0F) : (double)((var2.getBbWidth() + this.field_656.method_1240() / 4.0F) / 2.0F);
               var2.setBoundingBox(new AxisAlignedBB(var2.getX() - var3, var2.getY(), var2.getZ() - var3, var2.getX() + var3, var2.getY() + (double)var2.getBbHeight(), var2.getZ() + var3));
            }
         }
      }

   }

   public static Entity method_338(PlayerEntity var0, Class_129 var1, double var2, Predicate<? super Entity> var4) {
      double var5 = var2;
      Vector3d var7 = var1.method_424();
      Entity[] var8 = (Entity[])var0.level.getEntities(var0, var0.getBoundingBox().expandTowards(var7.x * var2, var7.y * var2, var7.z * var2).inflate(1.0D), (var1x) -> {
         return var1x != null && var1x.isPickable() && var4.test(var1x);
      }).toArray(new Entity[0]);
      Vector3d var9 = var0.getEyePosition(1.0F);
      Vector3d var10 = var9.add(var7.x * var2, var7.y * var2, var7.z * var2);

      for(int var11 = 0; var11 < var8.length; ++var11) {
         Entity var12 = var8[var11];
         AxisAlignedBB var13 = var12.getBoundingBox().inflate((double)var12.getPickRadius());
         Optional var14 = var13.clip(var9, var10);
         if (var13.contains(var9)) {
            return var12;
         }

         if (var14.isPresent()) {
            double var15 = var9.distanceTo((Vector3d)var14.get());
            if (var15 < var5) {
               return var12;
            }
         }
      }

      return null;
   }

   public static void method_339(MovementInput var0, float var1) {
      float var2 = var0.forwardImpulse;
      float var3 = var0.leftImpulse;
      if (var2 != 0.0F || var3 != 0.0F) {
         double var4 = MathHelper.wrapDegrees(Math.toDegrees(method_345(var1, (double)var2, (double)var3)));
         float var6 = 0.0F;
         float var7 = 0.0F;
         float var8 = Float.MAX_VALUE;

         for(float var9 = -1.0F; var9 <= 1.0F; ++var9) {
            for(float var10 = -1.0F; var10 <= 1.0F; ++var10) {
               if (var10 != 0.0F || var9 != 0.0F) {
                  double var11 = MathHelper.wrapDegrees(Math.toDegrees(method_345(var1, (double)var9, (double)var10)));
                  double var13 = Math.abs(var4 - var11);
                  if (var13 < (double)var8) {
                     var8 = (float)var13;
                     var6 = var9;
                     var7 = var10;
                  }
               }
            }
         }

         var0.forwardImpulse = var6;
         var0.leftImpulse = var7;
      }
   }

   public Vector3d method_340(AxisAlignedBB var1, float var2, Class_129 var3) {
      Vector3d var4 = null;
      Double var5 = null;
      Vector3d var6 = this.mc.player.getEyePosition(1.0F);
      double var7 = var1.maxX - var1.minX;
      double var9 = var1.maxY - var1.minY;
      double var11 = var1.maxZ - var1.minZ;
      float var13 = 0.3F;

      for(float var14 = 0.0F; var14 < 1.0F; var14 += 0.3F) {
         for(float var15 = 0.0F; var15 < 1.0F; var15 += 0.3F) {
            for(float var16 = 0.0F; var16 < 1.0F; var16 += 0.3F) {
               Vector3d var17 = new Vector3d(var1.minX + var7 * (double)var14, var1.minY + var9 * (double)var15, var1.minZ + var11 * (double)var16);
               Vector3d var18 = var17.subtract(var6).normalize();
               Vector3d var19 = this.method_344(var18, var17, (double)var2, var1);
               if (var19 != null) {
                  double var20 = 0.6D;
                  double var22 = 0.4D;
                  double var24 = var6.distanceTo(var19);
                  Vector3d var26 = var3.method_424();
                  double var27 = this.method_341(var26, var19.subtract(var6).normalize());
                  double var29 = var27 / 180.0D;
                  double var31 = var24 / (double)var2;
                  double var33 = this.method_342(var29, var31, var20, var22);
                  if ((var5 == null || var33 < var5) && this.method_343(var6, var19)) {
                     var4 = var19;
                     var5 = var33;
                  }
               }
            }
         }
      }

      return var4;
   }

   public double method_341(Vector3d var1, Vector3d var2) {
      return Math.toDegrees(MathHelper.atan2(var1.cross(var2).length(), var1.dot(var2)));
   }

   private double method_342(double var1, double var3, double var5, double var7) {
      double var9 = var5 + var7;
      double var11 = var5 / var9;
      double var13 = var7 / var9;
      return var1 * var11 + var3 * var13;
   }

   private boolean method_343(Vector3d var1, Vector3d var2) {
      BlockRayTraceResult var3 = this.mc.level.clip(new RayTraceContext(var1, var2, BlockMode.OUTLINE, FluidMode.NONE, this.mc.player));
      return var3.getType() == Type.MISS;
   }

   public Vector3d method_344(Vector3d var1, Vector3d var2, double var3, AxisAlignedBB var5) {
      Vector3d var6 = this.mc.player.getEyePosition(1.0F);
      Vector3d var7 = var6.add(var1.scale(var3));
      Optional var8 = var5.clip(var6, var7);
      return !var5.contains(var6) && (!var8.isPresent() || !(var6.distanceTo((Vector3d)var8.get()) < var3)) ? null : (Vector3d)var8.orElse(var2);
   }

   private static double method_345(float var0, double var1, double var3) {
      if (var1 < 0.0D) {
         var0 += 180.0F;
      }

      float var5 = 1.0F;
      if (var1 < 0.0D) {
         var5 = -0.5F;
      } else if (var1 > 0.0D) {
         var5 = 0.5F;
      }

      if (var3 > 0.0D) {
         var0 -= 90.0F * var5;
      }

      if (var3 < 0.0D) {
         var0 += 90.0F * var5;
      }

      return Math.toRadians((double)var0);
   }

   public Class_129 method_346(Class_129 var1, Class_129 var2, double var3) {
      float var5 = var2.method_421();
      float var6 = var2.method_422();
      float var7 = var1.method_421();
      float var8 = var1.method_422();
      if (var3 != 0.0D) {
         float var9 = (float)var3;
         double var10 = (double)MathHelper.wrapDegrees(var2.method_421() - var1.method_421());
         double var12 = (double)(var6 - var8);
         double var14 = Math.sqrt(var10 * var10 + var12 * var12);
         double var16 = Math.abs(var10 / var14);
         double var18 = Math.abs(var12 / var14);
         if (var14 != 0.0D) {
            double var20 = (double)var9 * var16;
            double var22 = (double)var9 * var18;
            float var24 = (float)Math.max(Math.min(var10, var20), -var20);
            float var25 = (float)Math.max(Math.min(var12, var22), -var22);
            var5 = var7 + var24;
            var6 = var8 + var25;
         }
      }

      Class_129 var26 = new Class_129(var5, var6);
      Class_129 var27 = this.method_347(var26, var1);
      var27 = this.method_348(var27);
      var5 = var27.method_421();
      var6 = Math.max(-90.0F, Math.min(90.0F, var27.method_422()));
      return new Class_129(var5, var6);
   }

   private Class_129 method_347(Class_129 var1, Class_129 var2) {
      float var3 = var2.method_421() + MathHelper.wrapDegrees(var1.method_421() - var2.method_421());
      float var4 = var2.method_422() + MathHelper.wrapDegrees(var1.method_422() - var2.method_422());
      return new Class_129(var3, var4);
   }

   private Class_129 method_348(Class_129 var1) {
      double var2 = this.mc.options.sensitivity * 0.6D + 0.2D;
      double var4 = var2 * var2 * var2 * 8.0D * 0.15D;
      float var6 = (float)((double)Math.round((double)var1.method_421() / var4) * var4);
      float var7 = (float)((double)Math.round((double)var1.method_422() / var4) * var4);
      return new Class_129(var6, MathHelper.clamp(var7, -90.0F, 90.0F));
   }

   public Class_129 method_349(Vector3d var1, float var2) {
      Vector3d var3 = var1.subtract(this.mc.player.getEyePosition(var2));
      double var4 = Math.hypot(var3.x(), var3.z());
      return new Class_129((float)Math.toDegrees(Math.atan2(var3.z(), var3.x())) - 90.0F, (float)Math.toDegrees(-Math.atan2(var3.y(), var4)));
   }

   public Vector3d method_350(AxisAlignedBB var1) {
      Vector3d var2 = this.mc.player.getEyePosition(1.0F);
      double var3 = method_351(var1.minX, var1.maxX - var1.minX, var2.x());
      double var5 = method_351(var1.minY, var1.maxY - var1.minY, var2.y());
      double var7 = method_351(var1.minZ, var1.maxZ - var1.minZ, var2.z());
      return new Vector3d(var1.minX + (var1.maxX - var1.minX) * var3, var1.minY + (var1.maxY - var1.minY) * var5, var1.minZ + (var1.maxZ - var1.minZ) * var7);
   }

   private static double method_351(double var0, double var2, double var4) {
      return Math.min(1.0D, Math.max(0.0D, (var4 - var0) / var2));
   }
}
