package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;

public class DurationInfo extends Module {
   private double field_1204 = 0.0D;

   public DurationInfo() {
      super(new String[]{"Dura", "tion", "Info"}, Category.beta);
   }

   public void method_207() {
      ItemStack var1 = this.mc.player.getItemInHand(Hand.MAIN_HAND);
      double var2 = this.method_1167(var1);
      if (var2 < this.field_1204) {
         this.field_1204 = var2;
         String var4 = "РћСЃС‚Р°Р»РѕСЃСЊ " + (int)(var2 * 100.0D) + "%";
      }

   }

   private double method_1167(ItemStack var1) {
      double var2 = (double)var1.getMaxDamage();
      double var4 = (double)var1.getDamageValue();
      return var2 == 0.0D ? 100.0D : (var2 - var4) / var2;
   }
}
