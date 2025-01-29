package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import net.minecraft.inventory.container.ClickType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;

public class ElytraSwap extends Module {
   private static int field_265 = 2;
   private static int field_266 = 0;
   private static int field_267 = 6;

   public ElytraSwap() {
      super(new String[]{"Ely", "traSw", "ap"}, Category.combat);
   }

   @Override
   public void onEnable() {
      ItemStack var1 = (ItemStack)this.mc.player.inventory.armor.get(2);
      int var2;
      if (var1.getItem() == Items.ELYTRA) {
         var2 = this.method_128();
         if (var2 != -1) {
            this.method_126(var2, Items.ELYTRA);
         }
      } else {
         var2 = this.method_127();
         if (var2 != -1) {
            this.method_126(var2, Items.NETHERITE_CHESTPLATE, Items.DIAMOND_CHESTPLATE, Items.IRON_CHESTPLATE, Items.GOLDEN_CHESTPLATE, Items.CHAINMAIL_CHESTPLATE, Items.LEATHER_CHESTPLATE);
         }
      }

      this.toggle(false);
      super.onEnable();
   }

   private void method_126(int var1, Item... var2) {
      ItemStack var3 = (ItemStack)this.mc.player.inventory.armor.get(2);
      this.mc.gameMode.handleInventoryMouseClick(0, 6, var1, ClickType.SWAP, this.mc.player);
      boolean var4 = false;
      Item[] var5 = var2;
      int var6 = var2.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         Item var8 = var5[var7];
         if (var3.getItem() == var8) {
            var4 = true;
            break;
         }
      }

      if (!var4) {
         this.mc.player.drop(var3, true);
      }

   }

   private int method_127() {
      return this.method_129(Items.ELYTRA);
   }

   private int method_128() {
      Item[] var1 = new Item[]{Items.NETHERITE_CHESTPLATE, Items.DIAMOND_CHESTPLATE, Items.IRON_CHESTPLATE, Items.GOLDEN_CHESTPLATE, Items.CHAINMAIL_CHESTPLATE, Items.LEATHER_CHESTPLATE};
      return this.method_129(var1);
   }

   private int method_129(Item... var1) {
      for(int var2 = 0; var2 < this.mc.player.inventory.items.size(); ++var2) {
         Item var3 = ((ItemStack)this.mc.player.inventory.items.get(var2)).getItem();
         Item[] var4 = var1;
         int var5 = var1.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            Item var7 = var4[var6];
            if (var3 == var7) {
               return var2;
            }
         }
      }

      return -1;
   }
}
