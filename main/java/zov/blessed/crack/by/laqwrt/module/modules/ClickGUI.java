package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.clickgui.ClickGUIScreen;
import zov.blessed.crack.by.laqwrt.module.Module;

public class ClickGUI extends Module {
   public ClickGUI() {
      super(new String[]{"Cli", "ckG", "UI"}, Category.visual);
      this.setKey(344);
   }

   @Override
   public void onEnable() {
      this.toggle(false);
      if (!(this.mc.screen instanceof ClickGUIScreen)) {
         this.mc.setScreen(Blessed.getInstance().clickGUIScreen == null ? (Blessed.getInstance().clickGUIScreen = new ClickGUIScreen()) : Blessed.getInstance().clickGUIScreen);
      }
   }
}
