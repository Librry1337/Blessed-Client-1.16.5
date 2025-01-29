package zov.blessed.crack.by.laqwrt;

import java.awt.Color;
import org.lwjgl.opengl.GL11;
import zov.blessed.crack.by.laqwrt.component.Component;
import zov.blessed.crack.by.laqwrt.module.Module;
import zov.blessed.crack.by.laqwrt.utils.RenderUtil;

public class Class_218 extends Component {
   private Module field_1113;

   public Class_218(int var1, int var2, int var3, int var4, Module var5) {
      super(var1, var2, var3, var4);
      this.field_1113 = var5;
   }

   public void method_1123(int var1, int var2) {
      Blessed.getInstance().method_824().method_191(new String[]{"Ena", "bled"}, (float)(this.method_1119() + 12), (float)(this.method_1120() + 1), Blessed.getInstance().getClickGUIScreen().getSelectedTheme().method_377().getRGB());
      if (this.field_1113.isState()) {
         if (this.method_1120() >= Blessed.getInstance().getClickGUIScreen().getY() + 20 && this.method_1120() <= Blessed.getInstance().getClickGUIScreen().getY() + Blessed.getInstance().getClickGUIScreen().getHeight() - 15) {
            GL11.glDisable(3089);
            Class_48.method_119(() -> RenderUtil.drawRounded(Class_218.this.method_1119() + Class_218.this.method_1121() - 31, (double)(Class_218.this.method_1120() + Class_218.this.method_1122() - 2), 16.0D, 16.0D, 2.0D, Blessed.getInstance().getClickGUIScreen().getSelectedTheme().method_375()));
            GL11.glEnable(3089);
         }

         RenderUtil.drawBlurredRounded((double)(this.method_1119() + this.method_1121() - 30), (double)(this.method_1120() + this.method_1122() - 4), 13.0D, 13.0D, 5.0D, 10.0F, Blessed.getInstance().getClickGUIScreen().getSelectedTheme().method_375());
         RenderUtil.drawRounded((double)(this.method_1119() + this.method_1121() - 30), (double)(this.method_1120() + this.method_1122() - 4), 13.0D, 13.0D, 2.0D, Blessed.getInstance().getClickGUIScreen().getSelectedTheme().method_375());
      } else {
         RenderUtil.drawRounded((double)(this.method_1119() + this.method_1121() - 30), (double)(this.method_1120() + this.method_1122() - 4), 13.0D, 13.0D, 2.0D, new Color(139, 0, 255));
      }

      super.method_1123(var1, var2);
   }

   public void method_1126(double var1, double var3, int var5) {
      if (this.method_1125((int)var1, (int)var3)) {
         this.field_1113.toggle(!this.field_1113.isState());
      }

      super.method_1126(var1, var3, var5);
   }
}
