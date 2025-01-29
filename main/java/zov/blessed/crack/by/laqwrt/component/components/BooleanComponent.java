package zov.blessed.crack.by.laqwrt.component.components;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import java.awt.Color;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.component.Component;
import zov.blessed.crack.by.laqwrt.utils.RenderUtil;
import zov.blessed.crack.by.laqwrt.setting.settings.BooleanSetting;

public class BooleanComponent extends Component {
   private BooleanSetting booleanSetting;

   public BooleanComponent(int var1, int var2, int var3, int var4, BooleanSetting booleanSetting) {
      super(var1, var2, var3, var4);
      this.booleanSetting = booleanSetting;
   }

   public void method_1123(int var1, int var2) {
      byte var3 = 0;
      if (this.booleanSetting.method_898() != null) {
         var3 = 10;
         GL11.glPushMatrix();
         float var4 = 1.5F;
         GL11.glScaled((double)(1.0F / var4), (double)(1.0F / var4), (double)(1.0F / var4));
         Minecraft.getInstance().getItemRenderer().renderGuiItem(this.booleanSetting.method_898().getDefaultInstance(), (int)((float)this.method_1119() * var4) + 20, (int)((float)this.method_1120() * var4));
         GL11.glPopMatrix();
      }

      Blessed.getInstance().method_824().method_191(this.booleanSetting.method_577(), (float)(this.method_1119() + 20 + var3), (float)(this.method_1120() - 1), Blessed.getInstance().getClickGUIScreen().getSelectedTheme().method_377().getRGB());
      if (this.booleanSetting.method_580()) {
         RenderUtil.drawBlurredRounded(this.method_1119() + this.method_1121() - 30, this.method_1120() + this.method_1122() - 4, 13.0D, 13.0D, 5.0D, 10.0F, Blessed.getInstance().getClickGUIScreen().getSelectedTheme().method_375());
         RenderUtil.drawRounded(this.method_1119() + this.method_1121() - 30, this.method_1120() + this.method_1122() - 4, 13.0D, 13.0D, 2.0D, Blessed.getInstance().getClickGUIScreen().getSelectedTheme().method_375());
      } else {
         RenderUtil.drawRounded(this.method_1119() + this.method_1121() - 30, this.method_1120() + this.method_1122() - 4, 13.0D, 13.0D, 2.0D, new Color(139, 0, 255));
      }

      super.method_1123(var1, var2);
   }

   public void method_1126(double var1, double var3, int var5) {
      if (this.method_1125((int)var1, (int)var3)) {
         this.booleanSetting.method_578(!(Boolean)this.booleanSetting.method_580());
      }

      super.method_1126(var1, var3, var5);
   }
}
