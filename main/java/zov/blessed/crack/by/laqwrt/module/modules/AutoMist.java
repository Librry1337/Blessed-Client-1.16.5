package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.ChestContainer;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import zov.blessed.crack.by.laqwrt.clickgui.TimerUtil;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;
import zov.blessed.crack.by.laqwrt.setting.Setting;
import zov.blessed.crack.by.laqwrt.setting.settings.BooleanSetting;
import zov.blessed.crack.by.laqwrt.setting.settings.SliderSetting;

public class AutoMist extends Module {
   private BooleanSetting field_596 = new BooleanSetting(new String[]{"NoP", "laye", "rTrace"}, true, (Item)null);
   private BooleanSetting field_597 = new BooleanSetting(new String[]{"ChestClose"}, true, (Item)null);
   private SliderSetting field_598 = new SliderSetting(new String[]{"StealDelay"}, 100.0F, 0.0F, 1000.0F, 1);
   private SliderSetting field_599 = new SliderSetting(new String[]{"MissPercent"}, 12.0F, 1.0F, 64.0F, 1);
   TimerUtil field_600 = new TimerUtil();

   public AutoMist() {
      super(new String[]{"AutoMist"}, Category.player);
      this.addSettings(new Setting[]{this.field_596, this.field_597, this.field_598, this.field_599});
   }

   public void method_207() {
      if ((Boolean)this.field_596.method_580()) {
         this.method_230();
      }

      if (this.mc.player.containerMenu instanceof ChestContainer) {
         ChestContainer var1 = (ChestContainer)this.mc.player.containerMenu;
         IInventory var2 = var1.getContainer();
         ArrayList var3 = new ArrayList<>();

         int var4;
         for(var4 = 0; var4 < var2.getContainerSize(); ++var4) {
            if (var2.getItem(var4).getItem() != Item.byId(0)) {
               var3.add(var4);
            }
         }

         if (!var3.isEmpty() && this.field_600.method_543((float)Math.round(this.field_598.method_1240()))) {
            var4 = (new Random()).nextInt(var3.size());
            int var5 = (Integer)var3.get(var4);
            if ((float)(new Random()).nextInt(100) >= this.field_599.method_1240()) {
               this.mc.gameMode.handleInventoryMouseClick(var1.containerId, var5, 0, ClickType.QUICK_MOVE, this.mc.player);
            }

            this.field_600.method_546();
         }

         if (var2.isEmpty() && (Boolean)this.field_597.method_580()) {
            this.mc.player.closeContainer();
         }
      }

   }

   private void method_230() {
      Iterator var1 = this.mc.level.players().iterator();

      while(var1.hasNext()) {
         PlayerEntity var2 = (PlayerEntity)var1.next();
         if (!this.method_231(var2)) {
            float var3 = 0.0F;
            this.method_232(var2, var3);
         }
      }

   }

   private boolean method_231(PlayerEntity var1) {
      return var1 == this.mc.player || !var1.isAlive();
   }

   private void method_232(Entity var1, float var2) {
      AxisAlignedBB var3 = this.method_233(var1, var2);
      var1.setBoundingBox(var3);
   }

   private AxisAlignedBB method_233(Entity var1, float var2) {
      double var3 = var1.getX() - (double)var2;
      double var5 = var1.getBoundingBox().minY;
      double var7 = var1.getZ() - (double)var2;
      double var9 = var1.getX() + (double)var2;
      double var11 = var1.getBoundingBox().maxY;
      double var13 = var1.getZ() + (double)var2;
      return new AxisAlignedBB(var3, var5, var7, var9, var11, var13);
   }
}
