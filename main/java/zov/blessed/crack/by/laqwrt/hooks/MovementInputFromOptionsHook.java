package zov.blessed.crack.by.laqwrt.hooks;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import java.util.Iterator;
import net.minecraft.client.GameSettings;
import net.minecraft.util.MovementInputFromOptions;
import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.module.Module;

public class MovementInputFromOptionsHook extends MovementInputFromOptions {
   // $FF: synthetic field
   final Blessed りあウ;

   public MovementInputFromOptionsHook(Blessed var1, GameSettings var2) {
      super(var2);
      this.りあウ = var1;
   }

   public void tick(boolean var1) {
      super.tick(var1);
      Iterator var2 = this.りあウ.getModuleManager().getModules().iterator();

      while(var2.hasNext()) {
         Module var3 = (Module)var2.next();
         if (var3.isState()) {
            var3.method_215(this);
         }
      }

      Blessed.method_838(this.りあウ).method_84(this);
   }
}
