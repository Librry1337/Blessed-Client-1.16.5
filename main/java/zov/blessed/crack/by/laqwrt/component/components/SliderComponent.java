package zov.blessed.crack.by.laqwrt.component.components;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import com.mojang.blaze3d.matrix.MatrixStack;
import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import net.minecraft.client.gui.screen.Screen;
import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.component.Component;
import zov.blessed.crack.by.laqwrt.utils.RenderUtil;
import zov.blessed.crack.by.laqwrt.Class_234;
import zov.blessed.crack.by.laqwrt.setting.settings.SliderSetting;

public class SliderComponent extends Component {
   private SliderSetting field_1175;
   private boolean field_1176;
   private float field_1177 = 0.0F;

   public SliderComponent(int var1, int var2, int var3, int var4, SliderSetting var5) {
      super(var1, var2, var3, var4);
      this.field_1175 = var5;
   }

   public void method_1123(int var1, int var2) {
      Blessed.getInstance().method_824().method_191(this.field_1175.method_577(), (float)(this.method_1119() - Blessed.getInstance().method_824().method_193(this.field_1175.method_577()) - 2), (float)this.method_1120(), Blessed.getInstance().getClickGUIScreen().getSelectedTheme().method_377().getRGB());
      double var3 = (double)Math.min(this.method_1121(), Math.max(0, var1 - this.method_1119()));
      float var5 = (float)(this.method_1121() - 7) * (this.field_1175.method_1240() - this.field_1175.method_1238()) / (this.field_1175.method_1237() - this.field_1175.method_1238());
      if (this.field_1176) {
         if (var3 == 0.0D) {
            this.field_1175.method_1239(this.field_1175.method_1238());
         } else {
            float var6 = this.method_1062(var3 / (double)this.method_1121() * (double)(this.field_1175.method_1237() - this.field_1175.method_1238()) + (double)this.field_1175.method_1238(), 2);
            this.field_1175.method_1239(var6);
         }
      }

      if (var5 < 0.0F) {
         var5 = 0.0F;
      }

      this.field_1177 = var5;
      if (this.field_1177 <= 0.0F) {
         this.field_1177 = 0.0F;
      }

      if (Float.isNaN(this.field_1177) || Float.isInfinite(this.field_1177)) {
         this.field_1177 = 0.0F;
      }

      Class_234.method_1080(this.method_1119(), this.method_1120() + 5, this.method_1121() - 3, 4, 2, Blessed.getInstance().getClickGUIScreen().getSelectedTheme().method_375(), Blessed.getInstance().method_809());
      Class_234.method_1079((float)this.method_1119(), (float)(this.method_1120() + 5), this.field_1177 + 4.0F, 4.0F, 2.0F, new Color(139, 0, 255), Blessed.getInstance().method_809());
      RenderUtil.method_999((double)((float)this.method_1119() + this.field_1177 + 5.0F), (double)(this.method_1120() + 7), 3.0D, new Color(139, 0, 255));
      Class_234.method_1080(this.method_1119() + this.method_1121() + 5, this.method_1120() + 1, Blessed.getInstance().method_824().method_193(new String[]{this.field_1175.method_1240().toString()}) + 5, 12, 2, new Color(47, 47, 47), Blessed.getInstance().method_809());
      Blessed.getInstance().method_824().method_191(new String[]{this.field_1175.method_1240().toString()}, (float)(this.method_1119() + this.method_1121() + 8), (float)(this.method_1120() + 1), -1);
      super.method_1123(var1, var2);
   }

   public void method_1126(double var1, double var3, int var5) {
      if (this.method_1125((int)var1, (int)var3)) {
         this.field_1176 = true;
      }

      super.method_1126(var1, var3, var5);
   }

   public void method_1127(double var1, double var3, int var5) {
      this.field_1176 = false;
      super.method_1127(var1, var3, var5);
   }

   public static double method_1061(double var0, double var2, double var4) {
      if (var0 < var2) {
         return var2;
      } else {
         return var0 > var4 ? var4 : var0;
      }
   }

   float method_1062(double var1, int var3) {
      BigDecimal var4 = new BigDecimal(var1);
      var4 = var4.setScale(var3, RoundingMode.HALF_UP);
      return var4.floatValue();
   }

   private void method_1063(MatrixStack var1, double var2, double var4, double var6, double var8, int var10) {
      Screen.fill(var1, (int)var2, (int)var4, (int)var6, (int)var8, var10);
   }
}
