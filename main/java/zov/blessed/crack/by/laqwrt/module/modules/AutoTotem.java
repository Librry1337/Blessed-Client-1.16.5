package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import java.util.Iterator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EnderCrystalEntity;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import zov.blessed.crack.by.laqwrt.clickgui.TimerUtil;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;
import zov.blessed.crack.by.laqwrt.setting.Setting;
import zov.blessed.crack.by.laqwrt.setting.settings.BooleanSetting;
import zov.blessed.crack.by.laqwrt.setting.settings.SliderSetting;

public class AutoTotem extends Module {
   private SliderSetting field_145 = new SliderSetting(new String[]{"Heal", "th"}, 10.0F, 1.0F, 20.0F, 0);
   private SliderSetting field_146 = new SliderSetting(new String[]{"De", "lay"}, 0.0F, 120.0F, 500.0F, 10);
   private BooleanSetting field_147 = new BooleanSetting(new String[]{"DonT", "otem"}, false, (Item)null);
   private TimerUtil field_148 = new TimerUtil();

   public AutoTotem() {
      super(new String[]{"AutoT", "otem"}, Category.combat);
      this.addSettings(new Setting[]{this.field_145, this.field_146, this.field_147});
   }

   public int method_48() {
      for(int var1 = 0; var1 < 45; ++var1) {
         ItemStack var2 = this.mc.player.inventoryMenu.getSlot(var1).getItem();
         if (var2.getItem().equals(Items.TOTEM_OF_UNDYING) && !this.method_50(var2)) {
            return var1;
         }
      }

      return -1;
   }

   public int method_49() {
      for(int var1 = 0; var1 < 45; ++var1) {
         ItemStack var2 = this.mc.player.inventoryMenu.getSlot(var1).getItem();
         if (var2.getItem().equals(Items.TOTEM_OF_UNDYING) && this.method_50(var2)) {
            return var1;
         }
      }

      return -1;
   }

   private boolean method_50(ItemStack var1) {
      CompoundNBT var2 = var1.getTag();
      if (var2 != null) {
         CompoundNBT var3 = var2.getCompound("display");
         if (var3 != null) {
            ListNBT var4 = var3.getList("Lore", 8);
            if (var4 != null) {
               return true;
            }
         }
      }

      return false;
   }

   public void method_207() {
      if (this.field_148.method_545(this.field_146.method_1240())) {
         int var1 = this.method_48();
         if ((Boolean)this.field_147.method_580() && var1 == -1) {
            var1 = this.method_49();
         }

         if (this.mc.player.getHealth() < this.field_145.method_1240() && var1 != -1 && !this.method_52()) {
            this.click(var1);
         }

         if (!this.method_52() && var1 != -1) {
            Iterator var2 = this.mc.level.entitiesForRendering().iterator();

            while(var2.hasNext()) {
               Entity var3 = (Entity)var2.next();
               if (var3 instanceof EnderCrystalEntity && this.mc.player.distanceTo(var3) < 6.0F) {
                  this.click(var1);
                  break;
               }
            }
         }
      }

   }

   private void click(int slot) {
      this.mc.gameMode.handleInventoryMouseClick(0, slot, 1, ClickType.PICKUP, this.mc.player);
      this.mc.gameMode.handleInventoryMouseClick(0, 45, 1, ClickType.PICKUP, this.mc.player);
      this.mc.gameMode.handleInventoryMouseClick(0, slot, 0, ClickType.PICKUP, this.mc.player);
   }

   private boolean method_52() {
      return this.mc.player.getMainHandItem().getItem() == Items.TOTEM_OF_UNDYING || this.mc.player.getOffhandItem().getItem() == Items.TOTEM_OF_UNDYING;
   }
}
