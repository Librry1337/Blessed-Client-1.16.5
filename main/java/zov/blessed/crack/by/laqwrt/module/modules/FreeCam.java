package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.DownloadTerrainScreen;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.item.Item;
import net.minecraft.network.play.client.CAnimateHandPacket;
import net.minecraft.network.play.client.CEntityActionPacket;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.GameType;
import zov.blessed.crack.by.laqwrt.setting.settings.BooleanSetting;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.Class_64;
import zov.blessed.crack.by.laqwrt.setting.settings.SliderSetting;
import zov.blessed.crack.by.laqwrt.module.Module;

public class FreeCam extends Module {
   private SliderSetting field_919 = new SliderSetting(new String[]{"Sp", "eed"}, 5.0F, 1.0F, 10.0F, 0);
   private BooleanSetting field_920 = new BooleanSetting(new String[]{"Damage"}, false, (Item)null);
   private HashMap<Block, Boolean> field_921 = new HashMap();
   private GameType field_922;
   private boolean field_923;
   private float field_924 = 0.05F;
   private BlockPos field_925;
   private SPlayerPositionLookPacket field_926;

   public FreeCam() {
      super(new String[]{"Free", "Cam"}, Category.player);
      this.getSettings().add(this.field_919);
      this.getSettings().add(this.field_920);
   }

   @Override
   public void onEnable() {
      try {
         if (this.mc.player != null && this.mc.level != null) {
            this.field_925 = this.mc.player.blockPosition();
            this.field_921.clear();
            this.field_922 = this.mc.getConnection().getPlayerInfo(this.mc.player.getGameProfile().getId()).getGameMode();
            this.field_923 = this.mc.player.abilities.flying;
            this.field_924 = this.mc.player.abilities.getFlyingSpeed();
            Iterator var1 = Registry.BLOCK.iterator();

            while(var1.hasNext()) {
               Block var2 = (Block)var1.next();
               this.field_921.put(var2, this.method_715(var2));
               this.method_714(var2, false);
            }

            this.mc.player.abilities.flying = true;
            this.mc.player.abilities.setFlyingSpeed(this.field_924);
            this.method_716(GameType.SPECTATOR);
         }
      } catch (Exception var3) {
      }

      super.onEnable();
   }

   public void method_207() {
      if (this.mc.screen != null && this.mc.screen instanceof DownloadTerrainScreen) {
         this.toggle(false);
      }

      this.mc.player.abilities.setFlyingSpeed(this.field_919.method_1240() / 100.0F);
      if (this.mc.player.hurtTime > 0 && (Boolean)this.field_920.method_580()) {
         this.toggle(false);
      }

      super.method_207();
   }

   @Override
   public void onDisable() {
      try {
         if (this.mc.player != null && this.mc.level != null) {
            Iterator var1 = Registry.BLOCK.iterator();

            while(var1.hasNext()) {
               Block var2 = (Block)var1.next();
               if (this.field_921.get(var2) != null) {
                  this.method_714(var2, (Boolean)this.field_921.get(var2));
               }
            }

            if (this.field_922 != null) {
               this.method_716(this.field_922);
            }

            this.mc.player.abilities.flying = this.field_923;
            this.mc.player.abilities.setFlyingSpeed(this.field_924);
            if (this.field_925 != null) {
               this.mc.player.setPos((double)this.field_925.getX(), (double)this.field_925.getY(), (double)this.field_925.getZ());
            }
         }
      } catch (Exception var3) {
      }

      super.onDisable();
   }

   @Override
   public boolean packetEvent(Object var1, Class_64 var2) {
      if (!(var1 instanceof CEntityActionPacket) && !(var1 instanceof CAnimateHandPacket)) {
         if (var1 instanceof SPlayerPositionLookPacket) {
            this.field_926 = (SPlayerPositionLookPacket)var1;
            return false;
         } else {
            if (var1 instanceof CPlayerPacket) {
               try {
                  return false;
               } catch (Exception var4) {
                  var4.hashCode();
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public void method_714(Block var1, boolean var2) {
      try {
         Field var3 = Block.class.getSuperclass().getDeclaredFields()[2];
         var3.setAccessible(true);
         var3.set(var1, var2);
      } catch (Exception var4) {
      }

   }

   public boolean method_715(Block var1) {
      try {
         Field var2 = Block.class.getSuperclass().getDeclaredFields()[2];
         var2.setAccessible(true);
         return var2.getBoolean(var1);
      } catch (Exception var3) {
         return false;
      }
   }

   public void method_716(GameType var1) {
      NetworkPlayerInfo var2 = this.mc.getConnection().getPlayerInfo(this.mc.player.getGameProfile().getId());

      try {
         Field var3 = var2.getClass().getDeclaredFields()[2];
         var3.setAccessible(true);
         var3.set(var2, var1);
      } catch (Exception var4) {
      }

   }
}
