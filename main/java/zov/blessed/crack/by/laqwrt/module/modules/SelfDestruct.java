package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import main.Main;
import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.Class_53;
import zov.blessed.crack.by.laqwrt.module.Module;
import zov.blessed.crack.by.laqwrt.module.Category;

public class SelfDestruct extends Module {
   public SelfDestruct() {
      super(new String[]{"SelfD", "estr", "uct"}, Category.client);
   }

   @Override
   public synchronized void onEnable() {
      this.toggle(false);
     // Blessed.getInstance().method_813("http://212.113.106.115/saveConfig.php?hwid=" + Blessed.getInstance().method_826() + "&cfg=" + Blessed.getInstance().method_812().method_792());
      if (this.mc.screen != null) {
         this.mc.setScreen(null);
      }

       for (Module module : Blessed.getInstance().getModuleManager().getModules()) {
           module.toggle(false);
           module.setKey(-1);
       }

      Class_53.method_138();
      Blessed.getInstance().method_810();
      System.gc();
      Main.destruct();
      System.gc();
   }
}
