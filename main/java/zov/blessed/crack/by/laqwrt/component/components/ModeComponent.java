package zov.blessed.crack.by.laqwrt.component.components;

import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.Class_234;
import zov.blessed.crack.by.laqwrt.component.Component;
import zov.blessed.crack.by.laqwrt.setting.settings.ModeSetting;

import java.awt.Color;

public class ModeComponent extends Component {
   private ModeSetting field_1172;

   public ModeComponent(int var1, int var2, int var3, int var4, ModeSetting var5) {
      super(var1, var2, var3, var4);
      this.field_1172 = var5;
   }

   public void method_1123(int var1, int var2) {
      Blessed.getInstance().method_824().method_191(this.field_1172.method_577(), (float)(this.method_1119() + 20), (float)(this.method_1120() + 1), Blessed.getInstance().getClickGUIScreen().getSelectedTheme().method_377().getRGB());
      Class_234.method_1080(this.method_1119() + this.method_1121() - 65, this.method_1120(), 50, 14, 3, new Color(47, 47, 47), Blessed.getInstance().method_809());
      Blessed.getInstance().method_824().method_191(this.field_1172.method_433(), (float)(this.method_1119() + 90), (float)(this.method_1120() + 1), -1);
      super.method_1123(var1, var2);
   }

   public void method_1126(double var1, double var3, int var5) {
      if (this.method_1125((int)var1, (int)var3)) {
         if (this.field_1172.method_436() + 1 == this.field_1172.method_434().size()) {
            this.field_1172.method_437(0);
         } else {
            this.field_1172.method_437(this.field_1172.method_436() + 1);
         }
      }

      super.method_1126(var1, var3, var5);
   }
}
