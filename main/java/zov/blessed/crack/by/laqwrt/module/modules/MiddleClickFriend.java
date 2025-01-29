package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import net.minecraft.entity.player.PlayerEntity;
import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;

public class MiddleClickFriend extends Module {
   private boolean field_698;

   public MiddleClickFriend() {
      super(new String[]{"Middle", "Click", "Friend"}, Category.client);
   }

   public void method_207() {
      if (!this.mc.options.keyPickItem.isDown()) {
         this.field_698 = false;
      }

      if (this.mc.options.keyPickItem.isDown() && !this.field_698) {
         if (this.mc.crosshairPickEntity != null && this.mc.crosshairPickEntity instanceof PlayerEntity && this.mc.screen == null) {
            if (Blessed.getInstance().method_825().method_1134(this.mc.crosshairPickEntity.getName().getString())) {
               Blessed.getInstance().method_825().method_1135(this.mc.crosshairPickEntity.getName().getString());
            } else {
               Blessed.getInstance().method_825().method_1136(this.mc.crosshairPickEntity.getName().getString());
            }
         }

         this.field_698 = true;
      }

   }
}
