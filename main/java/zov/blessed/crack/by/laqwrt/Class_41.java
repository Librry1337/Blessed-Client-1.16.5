package zov.blessed.crack.by.laqwrt;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import net.minecraft.client.Minecraft;
import net.minecraft.util.MovementInput;
import net.minecraft.util.MovementInputFromOptions;
import net.minecraft.util.math.MathHelper;

public class Class_41 {
   private static final Minecraft field_159 = Minecraft.getInstance();
   private Class_129 field_160 = new Class_129(0.0F, 0.0F);
   private Class_129 field_161;
   private Class_129 field_162;
   private float field_163 = 180.0F;
   private boolean field_164;
   private Class_129 field_165;

   public void method_69(Class_129 var1) {
      this.field_162 = var1;
      this.field_164 = true;
      this.field_163 = 180.0F;
   }

   public void method_70(Class_129 var1, float var2) {
      this.field_162 = var1;
      this.field_164 = true;
      this.field_163 = var2;
   }

   public Class_129 method_71() {
      return this.field_160;
   }

   public boolean method_72() {
      return this.field_164;
   }

   public void method_73() {
      this.field_160 = null;
      this.field_164 = false;
   }

   public void method_74() {
      if (this.field_160 != null) {
         this.field_165 = new Class_129(field_159.player.yRot, field_159.player.xRot);
         field_159.player.yRot = this.field_160.method_421();
         field_159.player.xRot = this.field_160.method_422();
      }

   }

   public void method_75() {
      if (this.field_165 != null) {
         field_159.player.yRot = this.field_165.method_421();
         field_159.player.xRot = this.field_165.method_422();
      }

   }

   public void method_76() {
      if (!this.field_164 || this.field_160 == null || this.field_161 == null || this.field_162 == null) {
         this.field_160 = this.field_161 = this.field_162 = new Class_129(field_159.player.yRot, field_159.player.xRot);
      }

      if (this.field_164) {
         this.field_160 = method_87(this.field_161, this.field_162, (double)this.field_163 + Math.random());
      }

   }

   public void method_77() {
      if (this.field_160 != null) {
         if ((double)Math.abs((this.field_160.method_421() - field_159.player.yRot) % 360.0F) < 0.5D && (double)Math.abs(this.field_160.method_422() - field_159.player.xRot) < 0.5D) {
            this.field_164 = false;
         }

      }
   }

   public void method_78() {
      if (this.field_164 && this.field_160 != null) {
         float var1 = this.field_160.method_421();
         float var2 = this.field_160.method_422();
         this.field_165 = new Class_129(field_159.player.yRot, field_159.player.xRot);
         field_159.player.yRot = var1;
         field_159.player.xRot = var2;
         this.field_161 = this.field_160.method_426();
      } else {
         this.field_161 = new Class_129(field_159.player.yRot, field_159.player.xRot);
         this.field_165 = null;
      }

   }

   public void method_79() {
      if (this.field_164 && this.field_165 != null) {
         field_159.player.yRot = this.field_165.method_421();
         field_159.player.xRot = this.field_165.method_422();
      }

      this.field_162 = new Class_129(field_159.player.yRot, field_159.player.xRot);
   }

   public void method_80() {
      if (this.field_164 && this.field_160 != null) {
         this.field_165 = new Class_129(field_159.player.yRot, field_159.player.xRot);
         field_159.player.yRot = this.field_160.method_421();
      }

   }

   public void method_81() {
      if (this.field_164 && this.field_165 != null) {
         field_159.player.yRot = this.field_165.method_421();
      }

   }

   public void method_82() {
      if (this.field_164 && this.field_160 != null) {
         this.field_165 = new Class_129(field_159.player.yRot, field_159.player.xRot);
         field_159.player.yRot = this.field_160.method_421();
      }

   }

   public void method_83() {
      if (this.field_164 && this.field_165 != null) {
         field_159.player.yRot = this.field_165.method_421();
      }

   }

   public void method_84(MovementInputFromOptions var1) {
      if (this.field_164 && this.field_160 != null) {
         method_85(var1, field_159.player.yRot, this.field_160.method_421());
         if (var1.shiftKeyDown) {
            var1.forwardImpulse = (float)((double)var1.forwardImpulse * 0.3D);
            var1.leftImpulse = (float)((double)var1.leftImpulse * 0.3D);
         }
      }

   }

   public static void method_85(MovementInput var0, float var1, float var2) {
      float var3 = var0.forwardImpulse;
      float var4 = var0.leftImpulse;
      if (var3 != 0.0F || var4 != 0.0F) {
         double var5 = MathHelper.wrapDegrees(Math.toDegrees(method_86(var1, (double)var3, (double)var4)));
         float var7 = 0.0F;
         float var8 = 0.0F;
         float var9 = Float.MAX_VALUE;

         for(float var10 = -1.0F; var10 <= 1.0F; ++var10) {
            for(float var11 = -1.0F; var11 <= 1.0F; ++var11) {
               if (var11 != 0.0F || var10 != 0.0F) {
                  double var12 = MathHelper.wrapDegrees(Math.toDegrees(method_86(var1, (double)var10, (double)var11)));
                  double var14 = Math.abs(var5 - var12);
                  if (var14 < (double)var9) {
                     var9 = (float)var14;
                     var7 = var10;
                     var8 = var11;
                  }
               }
            }
         }

         var0.forwardImpulse = var7;
         var0.leftImpulse = var8;
      }
   }

   private static double method_86(float var0, double var1, double var3) {
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

   public static Class_129 method_87(Class_129 var0, Class_129 var1, double var2) {
      float var4 = var1.method_421();
      float var5 = var1.method_422();
      float var6 = var0.method_421();
      float var7 = var0.method_422();
      if (var2 != 0.0D) {
         float var8 = (float)var2;
         double var9 = (double)MathHelper.wrapDegrees(var1.method_421() - var0.method_421());
         double var11 = (double)(var5 - var7);
         double var13 = Math.sqrt(var9 * var9 + var11 * var11);
         double var15 = Math.abs(var9 / var13);
         double var17 = Math.abs(var11 / var13);
         if (var13 != 0.0D) {
            double var19 = (double)var8 * var15;
            double var21 = (double)var8 * var17;
            float var23 = (float)Math.max(Math.min(var9, var19), -var19);
            float var24 = (float)Math.max(Math.min(var11, var21), -var21);
            var4 = var6 + var23;
            var5 = var7 + var24;
         }
      }

      Class_129 var25 = new Class_129(var4, var5);
      Class_129 var26 = method_88(var25, var0);
      var26 = method_89(var26);
      var4 = var26.method_421();
      var5 = Math.max(-90.0F, Math.min(90.0F, var26.method_422()));
      return new Class_129(var4, var5);
   }

   private static Class_129 method_88(Class_129 var0, Class_129 var1) {
      float var2 = var1.method_421() + MathHelper.wrapDegrees(var0.method_421() - var1.method_421());
      float var3 = var1.method_422() + MathHelper.wrapDegrees(var0.method_422() - var1.method_422());
      return new Class_129(var2, var3);
   }

   private static Class_129 method_89(Class_129 var0) {
      double var1 = field_159.options.sensitivity * 0.6D + 0.2D;
      double var3 = var1 * var1 * var1 * 8.0D * 0.15D;
      float var5 = (float)((double)Math.round((double)var0.method_421() / var3) * var3);
      float var6 = (float)((double)Math.round((double)var0.method_422() / var3) * var3);
      return new Class_129(var5, MathHelper.clamp(var6, -90.0F, 90.0F));
   }
}
