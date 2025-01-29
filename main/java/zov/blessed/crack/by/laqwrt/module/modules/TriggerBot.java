package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.function.Consumer;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.network.play.client.CEntityActionPacket;
import net.minecraft.network.play.client.CEntityActionPacket.Action;
import net.minecraft.util.Hand;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult.Type;
import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.Class_253;
import zov.blessed.crack.by.laqwrt.clickgui.TimerUtil;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;
import zov.blessed.crack.by.laqwrt.setting.settings.BooleanSetting;
import zov.blessed.crack.by.laqwrt.setting.settings.ModeSetting;

public class TriggerBot extends Module {
   private static final Field field_668 = Class_253.method_1143(ClientPlayerEntity.class, 13);
   private ModeSetting field_669 = new ModeSetting(new String[]{"Mode"}, (ArrayList)method_382(new ArrayList<>(), (var0) -> {
      var0.add(new String[]{"Defau", "lt"});
      var0.add(new String[]{"Onl", "y Cr", "its"});
      var0.add(new String[]{"Sm", "art"});
   }), 0);
   private final BooleanSetting field_670;
   private final BooleanSetting field_671;
   private final BooleanSetting field_672;
   private final BooleanSetting field_673;
   private final BooleanSetting field_674;
   private TimerUtil field_675;
   private AutoShiftTap field_676;

   public TriggerBot() {
      super(new String[]{"Trigg", "erBot"}, Category.combat);
      this.field_670 = new BooleanSetting(new String[]{"Players"}, true, Items.PLAYER_HEAD);
      this.field_671 = new BooleanSetting(new String[]{"Animals"}, false, Items.CHICKEN);
      this.field_672 = new BooleanSetting(new String[]{"Mobs"}, false, Items.ZOMBIE_HEAD);
      this.field_673 = new BooleanSetting(new String[]{"Last ", "Hit"}, false, (Item)null);
      this.field_674 = new BooleanSetting(new String[]{"Weap", "on On", "ly"}, false, Items.NETHERITE_SWORD);
      this.field_675 = new TimerUtil();
      this.addSettings(this.field_669, this.field_670, this.field_671, this.field_672, this.field_673, this.field_674);
   }

   public static <T> T method_382(T var0, Consumer<T> var1) {
      var1.accept(var0);
      return var0;
   }

   public void method_212() {
      if (!(Boolean)this.field_674.method_580() || this.method_384()) {
         switch(this.field_669.method_436()) {
         case 0:
         default:
            break;
         case 1:
            if (!method_386(this.mc.player)) {
               return;
            }
            break;
         case 2:
            if (!this.mc.player.isOnGround() && !method_386(this.mc.player)) {
               return;
            }
         }

         if (this.mc.hitResult.getType() == Type.ENTITY) {
            EntityRayTraceResult var1 = (EntityRayTraceResult)this.mc.hitResult;
            Entity var2 = var1.getEntity();
            if ((Boolean)this.field_673.method_580() && var2 != Blessed.method_815()) {
               return;
            }

            if (this.method_388(var2)) {
               long var3 = method_387(this.mc.player);
               if (this.field_675.method_545((float)(var3 - 15L))) {
                  this.method_383(var2);
               }
            }
         }

      }
   }

   private void method_383(Entity var1) {
      boolean var2 = (Boolean)Class_253.method_1159(field_668, this.mc.player);
      if (var2) {
         this.method_385(false);
      }

      this.mc.gameMode.attack(this.mc.player, var1);
      this.mc.player.resetAttackStrengthTicker();
      this.mc.player.swing(Hand.MAIN_HAND);
      this.field_676 = (AutoShiftTap) Blessed.getInstance().getModuleManager().getModuleByClass(AutoShiftTap.class);
      if (this.field_676.isState()) {
         this.field_676.method_1137();
      }

      if (var2) {
         this.method_385(true);
      }

   }

   private boolean method_384() {
      Item var1 = this.mc.player.getMainHandItem().getItem();
      return var1 instanceof SwordItem || var1 instanceof AxeItem;
   }

   private void method_385(boolean var1) {
      this.mc.player.setSprinting(var1);
      this.mc.player.connection.send(new CEntityActionPacket(this.mc.player, var1 ? Action.START_SPRINTING : Action.STOP_SPRINTING));
   }

   public static boolean method_386(PlayerEntity var0) {
      return var0.fallDistance > 0.0F;
   }

   public static long method_387(PlayerEntity var0) {
      return (long)(1.0D / var0.getAttributeValue(Attributes.ATTACK_SPEED) * 18.0D * 50.0D);
   }

   public boolean method_388(Entity var1) {
      if (!(var1 instanceof LivingEntity)) {
         return false;
      } else if (var1 != this.mc.player && !(((LivingEntity)var1).getHealth() <= 0.0F) && ((LivingEntity)var1).isAlive() && !Blessed.getInstance().method_825().method_1134(var1.getName().getString())) {
         if (var1 instanceof PlayerEntity && (Boolean)this.field_670.method_580()) {
            return true;
         } else if (var1 instanceof MonsterEntity && (Boolean)this.field_672.method_580()) {
            return true;
         } else {
            return var1 instanceof AnimalEntity && (Boolean)this.field_671.method_580();
         }
      } else {
         return false;
      }
   }
}
