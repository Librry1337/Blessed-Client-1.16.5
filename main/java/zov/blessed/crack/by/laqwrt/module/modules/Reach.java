package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import zov.blessed.crack.by.laqwrt.module.Module;
import zov.blessed.crack.by.laqwrt.setting.settings.BooleanSetting;
import zov.blessed.crack.by.laqwrt.setting.settings.SliderSetting;
import zov.blessed.crack.by.laqwrt.module.Category;

public class Reach extends Module {
   private BooleanSetting field_694;
   private BooleanSetting field_695;
   private BooleanSetting field_696;
   public SliderSetting field_697;

   public Reach() {
      super(new String[]{"Rea", "ch"}, Category.combat);
      this.field_694 = new BooleanSetting(new String[]{"Players"}, true, Items.PLAYER_HEAD);
      this.field_695 = new BooleanSetting(new String[]{"Mobs"}, false, Items.ZOMBIE_HEAD);
      this.field_696 = new BooleanSetting(new String[]{"Animals"}, false, Items.CHICKEN);
      this.field_697 = new SliderSetting(new String[]{"Dist", "ance"}, 3.0F, 3.0F, 6.0F, 1);
      this.addSettings(this.field_694, this.field_695, this.field_696, this.field_697);
   }

   public boolean method_401(Entity var1) {
      if (!(var1 instanceof LivingEntity)) {
         return false;
      } else if (var1 != this.mc.player && !(((LivingEntity)var1).getHealth() <= 0.0F) && ((LivingEntity)var1).isAlive()) {
         if (var1 instanceof PlayerEntity && (Boolean)this.field_694.method_580()) {
            return true;
         } else if (var1 instanceof MonsterEntity && (Boolean)this.field_695.method_580()) {
            return true;
         } else {
            return var1 instanceof AnimalEntity && (Boolean)this.field_696.method_580();
         }
      } else {
         return false;
      }
   }
}
