package zov.blessed.crack.by.laqwrt;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.GameSettings;
import net.minecraft.client.Minecraft;

public class Class_258 {
   private final Minecraft mc = Minecraft.getInstance();
   private final GameSettings gameSettings;
   private int field_1207 = 2;
   private int field_1208;

   public Class_258() {
      this.gameSettings = this.mc.options;
   }

   public void method_1168() {
      this.field_1208 = this.gameSettings.guiScale;
      if (this.field_1208 == 0) {
         this.field_1208 = this.mc.getWindow().calculateScale(this.mc.options.guiScale, this.mc.isEnforceUnicode());
      }

      double var1 = (double)this.field_1208 / Math.pow((double)this.field_1208, 2.0D);
      GlStateManager._pushMatrix();
      GlStateManager._scaled(var1 * (double)this.field_1207, var1 * (double)this.field_1207, var1 * (double)this.field_1207);
   }

   public void method_1169() {
      GlStateManager._scaled((double)this.field_1207, (double)this.field_1207, (double)this.field_1207);
      GlStateManager._popMatrix();
   }

   public void method_1170(int var1) {
      this.field_1207 = var1;
   }

   public int method_1171() {
      return this.field_1207;
   }

   public int[] method_1172(int var1, int var2) {
      var1 = var1 * this.field_1208 / this.field_1207;
      var2 = var2 * this.field_1208 / this.field_1207;
      return new int[]{var1, var2};
   }

   public double[] method_1173(double var1, double var3) {
      var1 = var1 * (double)this.field_1208 / (double)this.field_1207;
      var3 = var3 * (double)this.field_1208 / (double)this.field_1207;
      return new double[]{var1, var3};
   }

   public double method_1174() {
      double var1 = (double)this.field_1208 / Math.pow((double)this.field_1208, 2.0D);
      return var1 * (double)this.field_1207;
   }
}
