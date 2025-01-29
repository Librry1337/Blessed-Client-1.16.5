package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import zov.blessed.crack.by.laqwrt.module.Module;
import zov.blessed.crack.by.laqwrt.module.Category;

public class NoHurtCam extends Module {
   public static NoHurtCam instance;

   public NoHurtCam() {
      super(new String[]{"No", "Hurt", "Cam"}, Category.visual);
      instance = this;
   }

   public void method_394() {
      if (this.isState()) {
         this.mc.player.hurtTime = 0;
         this.mc.player.hurtDuration = 0;
      }
   }
}
