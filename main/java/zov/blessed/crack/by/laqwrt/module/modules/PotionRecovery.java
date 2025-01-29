package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SplashPotionItem;
import net.minecraft.network.play.client.CPlayerTryUseItemPacket;
import net.minecraft.network.play.server.SSetSlotPacket;
import zov.blessed.crack.by.laqwrt.Class_64;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;

public class PotionRecovery extends Module {
   private int field_1054 = -1;
   private Item field_1055;

   public PotionRecovery() {
      super(new String[]{"Pot", "ion", "Rec", "overy"}, Category.beta);
   }

   public void method_212() {
   }

   @Override
   public boolean packetEvent(Object var1, Class_64 var2) {
      if (var1 instanceof CPlayerTryUseItemPacket) {
         CPlayerTryUseItemPacket var3 = (CPlayerTryUseItemPacket)var1;
         ItemStack var4 = this.mc.player.getItemInHand(var3.getHand());
         if (var4.getItem() instanceof SplashPotionItem) {
            this.field_1054 = this.mc.player.inventory.selected + 36;
            this.field_1055 = var4.getItem();
         }
      }

      if (var1 instanceof SSetSlotPacket) {
         SSetSlotPacket var5 = (SSetSlotPacket)var1;
         if (this.field_1054 != -1 && this.field_1055 != null && var5.getContainerId() == 0 && var5.getSlot() == this.field_1054 && var5.getItem().isEmpty()) {
            int var6 = this.method_891(this.field_1055);
            if (var6 != -1) {
               this.mc.gameMode.handlePickItem(var6);
            }

            this.field_1054 = -1;
            this.field_1055 = null;
         }
      }

      return super.packetEvent(var1, var2);
   }

   private int method_891(Item... var1) {
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
