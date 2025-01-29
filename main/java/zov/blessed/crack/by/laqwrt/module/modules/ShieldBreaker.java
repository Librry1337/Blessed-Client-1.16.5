package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;
import net.minecraft.item.SwordItem;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;

public class ShieldBreaker extends Module {
   private int field_647;

   public ShieldBreaker() {
      super(new String[]{"Shie", "ldBre", "aker"}, Category.combat);
   }

   private int method_307() {
      for(int var1 = 0; var1 < 9; ++var1) {
         ItemStack var2 = (ItemStack)this.mc.player.inventory.items.get(var1);
         if (var2.getItem() instanceof SwordItem) {
            return var1;
         }
      }

      return -1;
   }

   private int method_308() {
      for(int var1 = 0; var1 < 9; ++var1) {
         ItemStack var2 = (ItemStack)this.mc.player.inventory.items.get(var1);
         if (var2.getItem() instanceof AxeItem) {
            return var1;
         }
      }

      return -1;
   }

   public void method_207() {
      if (this.mc.player.getLastHurtMob() != null && this.mc.player.getLastHurtMob() instanceof PlayerEntity) {
         int var1 = this.method_308();
         int var2 = this.method_307();
         if (var1 != -1) {
            if (this.mc.player.inventory.selected != var1) {
               this.field_647 = this.mc.player.inventory.selected;
            }

            PlayerEntity var3 = (PlayerEntity)this.mc.player.getLastHurtMob();
            if (var3.getUseItem() != null && var3.getUseItem().getItem() instanceof ShieldItem) {
               this.mc.player.inventory.selected = var1;
            } else {
               this.mc.player.inventory.selected = this.field_647;
            }
         }
      }

   }
}
