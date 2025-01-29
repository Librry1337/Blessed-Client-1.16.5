package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import java.util.function.Predicate;
import net.minecraft.item.EnderPearlItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.play.client.CPlayerTryUseItemPacket;
import net.minecraft.util.Hand;
import zov.blessed.crack.by.laqwrt.Class_100;
import zov.blessed.crack.by.laqwrt.clickgui.TimerUtil;
import zov.blessed.crack.by.laqwrt.module.Module;
import zov.blessed.crack.by.laqwrt.setting.settings.SliderSetting;
import zov.blessed.crack.by.laqwrt.module.Category;

public class MiddleClickPearl extends Module {
   private TimerUtil field_1179 = new TimerUtil();
   private Runnable field_1180;
   public Class_100 field_1181;
   public Integer field_1182;
   private SliderSetting field_1183;

   public MiddleClickPearl() {
      super(new String[]{"Middle", "Click", "Pearl"}, Category.combat);
      this.field_1181 = Class_100.たツうカをモれんノセスシ;
      this.field_1182 = null;
      this.field_1183 = new SliderSetting(new String[]{"Del", "ay"}, 100.0F, 50.0F, 1000.0F, 0);
      this.getSettings().add(this.field_1183);
   }

   public void method_216(int var1, int var2, int var3) {
      if (var1 == 2 && var2 == 1 && this.method_1091()) {
         this.field_1181 = Class_100.たツうカをモれんノセスシ;
         this.field_1180 = this::method_1090;
         this.field_1179.method_546();
      }

   }

   public void method_207() {
      if (this.field_1180 != null) {
         this.field_1180.run();
      }

      super.method_207();
   }

   private void method_1090() {
      Integer var1 = this.method_1095(Items.ENDER_PEARL);
      Hand var2 = this.mc.player.getOffhandItem().getItem() instanceof EnderPearlItem ? Hand.OFF_HAND : Hand.MAIN_HAND;
      if (var1 != null) {
         this.method_1092(var1, var2);
      } else {
         this.field_1180 = null;
      }

   }

   private boolean method_1091() {
      return this.field_1180 == null && !this.mc.player.getCooldowns().isOnCooldown(Items.ENDER_PEARL);
   }

   private void method_1092(Integer var1, Hand var2) {
      switch(this.field_1181) {
      case たツうカをモれんノセスシ:
         this.field_1182 = this.mc.player.inventory.selected;
         this.method_1093(var1, var2);
         this.field_1181 = Class_100.ちれチこまラかヌりりリコ;
         break;
      case ちれチこまラかヌりりリコ:
         if (this.field_1179.method_543((float)this.field_1183.method_1240().longValue())) {
            this.field_1181 = Class_100.つケシエミユきひフらうゆ;
         }
         break;
      case つケシエミユきひフらうゆ:
         this.method_1094(var2);
         this.method_1093(this.field_1182, var2);
         this.field_1180 = null;
      }

   }

   private void method_1093(Integer var1, Hand var2) {
      if (var2 != Hand.OFF_HAND) {
         this.mc.player.inventory.selected = var1;
      }

   }

   private void method_1094(Hand var1) {
      this.mc.getConnection().send(new CPlayerTryUseItemPacket(var1));
      this.mc.player.swing(var1);
   }

   public Integer method_1095(Item var1) {
      return this.method_1096((var1x) -> {
         return var1x.getItem().equals(var1);
      });
   }

   public Integer method_1096(Predicate<ItemStack> var1) {
      for(int var2 = 0; var2 < 9; ++var2) {
         if (var1.test(this.mc.player.inventory.getItem(var2))) {
            return var2;
         }
      }

      return null;
   }
}
