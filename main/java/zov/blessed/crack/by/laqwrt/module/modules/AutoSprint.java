package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;

public class AutoSprint extends Module {
   public AutoSprint() {
      super(new String[]{"Aut", "oSpri", "nt"}, Category.player);
   }

   public void method_207() {
      if (this.mc.player.getFoodData().getFoodLevel() > 4 && !this.mc.player.horizontalCollision && this.mc.player.input.forwardImpulse > 0.0F) {
         this.mc.player.setSprinting(true);
      }

      super.method_207();
   }
}
