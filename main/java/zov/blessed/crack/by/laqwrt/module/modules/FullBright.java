package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;

public class FullBright extends Module {
   private double field_1042 = 100.0D;

   public FullBright() {
      super(new String[]{"Fu", "llBr", "ight"}, Category.visual);
   }

   @Override
   public void onEnable() {
      this.field_1042 = this.mc.options.gamma;
      this.mc.options.gamma = 1000.0D;
   }

   @Override
   public void onDisable() {
      this.mc.options.gamma = this.field_1042;
   }
}
