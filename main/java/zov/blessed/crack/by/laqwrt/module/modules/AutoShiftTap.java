package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import net.minecraft.item.Item;
import zov.blessed.crack.by.laqwrt.setting.settings.BooleanSetting;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.setting.Setting;
import zov.blessed.crack.by.laqwrt.setting.settings.SliderSetting;
import zov.blessed.crack.by.laqwrt.module.Module;

public class AutoShiftTap extends Module {
   private BooleanSetting field_1199 = new BooleanSetting(new String[]{"Only Air"}, false, (Item)null);
   private SliderSetting field_1200 = new SliderSetting(new String[]{"Delay"}, 50.0F, 0.0F, 500.0F, 10);
   private boolean field_1201 = false;

   public AutoShiftTap() {
      super(new String[]{"Auto", "ShiftTap"}, Category.combat);
      this.addSettings(new Setting[]{this.field_1199, this.field_1200});
   }

   public void method_207() {
      if (!this.mc.options.keyAttack.isDown()) {
         this.field_1201 = false;
      }

      if (this.mc.options.keyAttack.isDown() && !this.field_1201) {
         if ((Boolean)this.field_1199.method_580() && !this.mc.player.isOnGround()) {
            this.method_1137();
         } else if (!(Boolean)this.field_1199.method_580()) {
            this.method_1137();
         }

         this.field_1201 = true;
      }

   }

   public void method_1137() {
      (new Thread(() -> {
         this.mc.options.keyShift.setDown(true);

         try {
            Thread.sleep(this.field_1200.method_1240().longValue());
         } catch (InterruptedException var2) {
            var2.hashCode();
         }

         this.mc.options.keyShift.setDown(false);
      })).start();
   }
}
