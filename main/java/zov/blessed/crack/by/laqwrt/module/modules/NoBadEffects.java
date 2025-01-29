package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import net.minecraft.network.play.server.SPlayEntityEffectPacket;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Effects;
import zov.blessed.crack.by.laqwrt.Class_64;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;

public class NoBadEffects extends Module {
   public NoBadEffects() {
      super(new String[]{"NoBa", "dEffec", "ts"}, Category.player);
   }

   @Override
   public boolean packetEvent(Object var1, Class_64 var2) {
      if (var1 instanceof SPlayEntityEffectPacket) {
         SPlayEntityEffectPacket var3 = (SPlayEntityEffectPacket)var1;
         if (var3.getEntityId() == this.mc.player.getId()) {
            byte var4 = var3.getEffectId();
            if (var4 == Effect.getId(Effects.POISON) || var4 == Effect.getId(Effects.BLINDNESS) || var4 == Effect.getId(Effects.WITHER)) {
               return false;
            }
         }
      }

      return super.packetEvent(var1, var2);
   }
}
