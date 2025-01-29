package zov.blessed.crack.by.laqwrt.clickgui;

import com.mojang.blaze3d.systems.IRenderCall;
import java.util.ArrayList;
import java.util.Iterator;
import org.lwjgl.opengl.GL11;
import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.Class_218;
import zov.blessed.crack.by.laqwrt.Class_234;
import zov.blessed.crack.by.laqwrt.Class_48;
import zov.blessed.crack.by.laqwrt.component.components.BooleanComponent;
import zov.blessed.crack.by.laqwrt.component.Component;
import zov.blessed.crack.by.laqwrt.component.components.ModeComponent;
import zov.blessed.crack.by.laqwrt.component.components.SliderComponent;
import zov.blessed.crack.by.laqwrt.setting.Setting;
import zov.blessed.crack.by.laqwrt.setting.settings.ModeSetting;
import zov.blessed.crack.by.laqwrt.module.Module;
import zov.blessed.crack.by.laqwrt.setting.settings.BooleanSetting;
import zov.blessed.crack.by.laqwrt.setting.settings.SliderSetting;

public class Button extends Component {
   private Module module;
   private ArrayList<Component> components;
   public boolean field_1116 = false;

   public Button(int var1, int var2, int var3, int var4, Module module) {
      super(var1, var2, var3, var4);
      this.module = module;
      this.components = new ArrayList<>();
      byte var6 = 15;
      Class_218 var7 = new Class_218(this.method_1119(), this.method_1120() + this.method_1122(), this.method_1121(), var6, this.module);
      this.components.add(var7);
      this.method_1118(this.method_1122() + var7.method_1122() + 5);

       for (Setting setting : this.module.getSettings()) {
           if (setting instanceof BooleanSetting) {
               BooleanComponent booleanComponent = new BooleanComponent(this.method_1119(), this.method_1120() + this.method_1122(), this.method_1121(), var6, (BooleanSetting) setting);
               this.components.add(booleanComponent);
               this.method_1118(this.method_1122() + booleanComponent.method_1122() + 5);
           }

           if (setting instanceof ModeSetting) {
               ModeComponent modeComponent = new ModeComponent(this.method_1119(), this.method_1120() + this.method_1122(), this.method_1121(), var6, (ModeSetting) setting);
               this.components.add(modeComponent);
               this.method_1118(this.method_1122() + modeComponent.method_1122() + 5);
           }

           if (setting instanceof SliderSetting) {
               SliderComponent sliderComponent = new SliderComponent(this.method_1119() + this.method_1121() / 2 - 30, this.method_1120() + this.method_1122(), 60, var6, (SliderSetting) setting);
               this.components.add(sliderComponent);
               this.method_1118(this.method_1122() + sliderComponent.method_1122() + 5);
           }
       }

   }

   public Module method_982() {
      return this.module;
   }

   public void method_1123(int var1, int var2) {
      Class_234.method_1080(this.method_1119(), this.method_1120(), this.method_1121(), this.method_1122(), 5, Blessed.getInstance().getClickGUIScreen().getSelectedTheme().method_376(), Blessed.getInstance().method_809());
      if (this.method_1120() >= Blessed.getInstance().getClickGUIScreen().getY() + 20 && this.method_1120() <= Blessed.getInstance().getClickGUIScreen().getY() + Blessed.getInstance().getClickGUIScreen().getHeight() - 15) {
         GL11.glDisable(3089);
         Class_48.method_119(new IRenderCall() {
            public void execute() {
               Blessed.getInstance().method_823().method_191(Button.this.module.getName(), (float)(Button.this.method_1119() + (Button.this.method_1121() / 2 - Blessed.getInstance().method_823().method_193(Button.this.module.getName()) / 2)), (float)(Button.this.method_1120() + 5), Blessed.getInstance().getClickGUIScreen().getSelectedTheme().method_377().getRGB());
            }
         });
         GL11.glEnable(3089);
      }

      String[] var3 = this.module.getName();
      if (this.field_1116) {
         var3 = new String[]{"Pre", "ss key", "..."};
      }

      Blessed.getInstance().method_823().method_191(var3, (float)(this.method_1119() + (this.method_1121() / 2 - Blessed.getInstance().method_823().method_193(var3) / 2)), (float)(this.method_1120() + 5), Blessed.getInstance().getClickGUIScreen().getSelectedTheme().method_377().getRGB());
      Iterator var4 = this.components.iterator();

      while(var4.hasNext()) {
         Component var5 = (Component)var4.next();
         var5.method_1123(var1, var2);
      }

      super.method_1123(var1, var2);
   }

   public boolean method_983(int var1, int var2) {
      return var1 >= this.method_1119() && var1 <= this.method_1119() + this.method_1121() && var2 >= this.method_1120() && var2 <= this.method_1120() + 20;
   }

   public void method_1126(double var1, double var3, int var5) {
      if (this.method_983((int)var1, (int)var3) && var5 == 2) {
         this.field_1116 = true;
      }

      if (this.method_1125((int)var1, (int)var3)) {
         Iterator var6 = this.components.iterator();

         while(var6.hasNext()) {
            Component var7 = (Component)var6.next();
            var7.method_1126(var1, var3, var5);
         }
      }

      super.method_1126(var1, var3, var5);
   }

   public void method_1128(int var1, int var2, int var3) {
      if (this.field_1116) {
         this.module.setKey(var1);
         this.field_1116 = false;
         if (var1 == 259 || var1 == 32 || var1 == 256) {
            this.module.setKey(0);
         }
      }

      super.method_1128(var1, var2, var3);
   }

   public ArrayList<Component> method_984() {
      return this.components;
   }

   public void method_1127(double var1, double var3, int var5) {
      Iterator var6 = this.components.iterator();

      while(var6.hasNext()) {
         Component var7 = (Component)var6.next();
         var7.method_1127(var1, var3, var5);
      }

      super.method_1127(var1, var3, var5);
   }
}
