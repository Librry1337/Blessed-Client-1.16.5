package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.IRenderCall;
import java.awt.Color;
import java.util.Iterator;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;
import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.Class_48;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;

public class Tracers extends Module {
   public Tracers() {
      super(new String[]{"Tra", "cers"}, Category.visual);
   }

   private void method_6(float var1, float var2, float var3, float var4, int var5) {
      float var6 = (float)(var5 >> 24 & 255) / 255.0F;
      float var7 = (float)(var5 >> 16 & 255) / 255.0F;
      float var8 = (float)(var5 >> 8 & 255) / 255.0F;
      float var9 = (float)(var5 & 255) / 255.0F;
      GL11.glPushMatrix();
      GL11.glColor4f(var7, var8, var9, var6);
      GL11.glDisable(3553);
      GL11.glRotated(90.0D, 0.0D, 0.0D, 1.0D);
      GL11.glBegin(4);
      GL11.glVertex2f(0.0F, -3.0F);
      GL11.glVertex2f(-3.0F, 3.0F);
      GL11.glVertex2f(3.0F, 3.0F);
      GL11.glEnd();
      GL11.glEnable(3553);
      GL11.glPopMatrix();
   }

   public Double method_7(double var1, double var3, double var5) {
      return var1 + (var3 - var1) * var5;
   }

   public int method_8(int var1, int var2, double var3) {
      return this.method_7((double)var1, (double)var2, (double)((float)var3)).intValue();
   }

   public int method_9(Color var1, Color var2, float var3) {
      var3 = Math.min(1.0F, Math.max(0.0F, var3));
      return this.method_11(var1, var2, var3).getRGB();
   }

   public int method_10(int var1, int var2, float var3) {
      var3 = Math.min(1.0F, Math.max(0.0F, var3));
      Color var4 = new Color(var1);
      Color var5 = new Color(var2);
      return this.method_11(var4, var5, var3).getRGB();
   }

   public Color method_11(Color var1, Color var2, float var3) {
      var3 = Math.min(1.0F, Math.max(0.0F, var3));
      return new Color(this.method_8(var1.getRed(), var2.getRed(), (double)var3), this.method_8(var1.getGreen(), var2.getGreen(), (double)var3), this.method_8(var1.getBlue(), var2.getBlue(), (double)var3), this.method_8(var1.getAlpha(), var2.getAlpha(), (double)var3));
   }

   public int method_12(int var1, float var2) {
      Color var3 = new Color(var1);
      return this.method_13(var3, var2).getRGB();
   }

   public Color method_13(Color var1, float var2) {
      var2 = Math.min(1.0F, Math.max(0.0F, var2));
      return new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), (int)((float)var1.getAlpha() * var2));
   }

   private int method_14() {
      Color var1 = new Color(255, 255, 255, 255);
      Color var2 = new Color(255, 0, 0, 0);
      int var3 = this.method_9(var1, var2, 150.0F);
      return this.method_12(var3, 10.0F);
   }

   private Color method_15(Color var1, Color var2, double var3) {
      double var5 = var3 / 4.0D % 1.0D;
      float var7 = MathHelper.clamp((float)Math.sin(18.84955592153876D * var5) / 2.0F + 0.5F, 0.0F, 1.0F);
      return new Color((float)MathHelper.clampedLerp((double)((float)var1.getRed() / 255.0F), (double)((float)var2.getRed() / 255.0F), (double)var7), (float)MathHelper.clampedLerp((double)((float)var1.getGreen() / 255.0F), (double)((float)var2.getGreen() / 255.0F), (double)var7), (float)MathHelper.clampedLerp((double)((float)var1.getBlue() / 255.0F), (double)((float)var2.getBlue() / 255.0F), (double)var7));
   }

   public void method_208() {
      int var1 = 0;
      Iterator var2 = this.mc.level.players().iterator();

      while(var2.hasNext()) {
         PlayerEntity var3 = (PlayerEntity)var2.next();
         if (var3 != this.mc.player) {
            double var4 = Math.cos((double)this.mc.player.yRot * 0.017453292519943295D);
            double var6 = Math.sin((double)this.mc.player.yRot * 0.017453292519943295D);
            double var8 = -((var3.getZ() - this.mc.player.getZ()) * var4 - (var3.getX() - this.mc.player.getX()) * var6);
            double var10 = -((var3.getX() - this.mc.player.getX()) * var4 + (var3.getZ() - this.mc.player.getZ()) * var6);
            float var12 = (float)(Math.atan2(var8 - 0.0D, var10 - 0.0D) * 180.0D / 3.141592653589793D);
            double var13 = 25.0D * Math.cos(Math.toRadians((double)var12)) + (double)this.mc.getWindow().getGuiScaledWidth() / Blessed.getInstance().method_806().method_1174() / 2.0D;
            double var15 = 25.0D * Math.sin(Math.toRadians((double)var12)) + (double)this.mc.getWindow().getGuiScaledHeight() / Blessed.getInstance().method_806().method_1174() / 2.0D;
            double var17 = (double)Math.abs(System.currentTimeMillis() / 10L) / 100.0D + 3.0D * (double)var1 * 2.55D / 150.0D;
            final Color var19 = this.method_15(new Color(0, 37, 183), new Color(255, 255, 255, 255), var17);
            GlStateManager._pushMatrix();
            float var20 = 0.5F;
            if (var20 <= 0.2F) {
               var20 = 0.2F;
            }

            float var21 = 1.0F / var20;
            GL11.glScaled((double)var21, (double)var21, (double)var21);
            GlStateManager._translated(var13 / (double)var21, var15 / (double)var21, 0.0D);
            GlStateManager._rotatef(var12, 0.0F, 0.0F, 1.0F);
            Class_48.method_119(new IRenderCall() {
               public void execute() {
                  Tracers.this.method_6(0.0F, 0.0F, 3.0F, 3.0F, var19.getRGB());
               }
            });
            this.method_6(0.0F, 0.0F, 3.0F, 3.0F, var19.getRGB());
            GL11.glScaled((double)var20, (double)var20, (double)var20);
            GlStateManager._clearCurrentColor();
            GlStateManager._popMatrix();
            ++var1;
         }
      }

   }
}
