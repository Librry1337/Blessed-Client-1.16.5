package zov.blessed.crack.by.laqwrt;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.util.InputMappings.Type;
import net.minecraft.entity.item.ArmorStandEntity;
import net.minecraft.entity.item.minecart.MinecartEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import zov.blessed.crack.by.laqwrt.module.modules.NoInteract;

public class Class_191 extends KeyBinding {
   public Class_191(String var1, Type var2, int var3, String var4) {
      super(var1, var2, var3, var4);
   }

   public boolean consumeClick() {
      NoInteract var1 = (NoInteract) Blessed.getInstance().getModuleManager().getModuleByClass(NoInteract.class);
      Minecraft var2 = Minecraft.getInstance();
      if (var1.isState() && var2.hitResult != null) {
         if (var2.hitResult instanceof EntityRayTraceResult) {
            EntityRayTraceResult var3 = (EntityRayTraceResult)var2.hitResult;
            if (var3.getEntity() instanceof MinecartEntity && (Boolean)var1.field_249.method_580()) {
               var2.hitResult = BlockRayTraceResult.miss(var3.getLocation(), Direction.getNearest(var3.getLocation().x, var3.getLocation().y, var3.getLocation().z), new BlockPos(var3.getLocation()));
            }

            if (var3.getEntity() instanceof ArmorStandEntity && (Boolean)var1.field_253.method_580()) {
               var2.hitResult = BlockRayTraceResult.miss(var3.getLocation(), Direction.getNearest(var3.getLocation().x, var3.getLocation().y, var3.getLocation().z), new BlockPos(var3.getLocation()));
            }
         }

         if (var2.hitResult instanceof BlockRayTraceResult) {
            BlockRayTraceResult var4 = (BlockRayTraceResult)var2.hitResult;
            if (!var1.method_122(var2.level.getBlockState(var4.getBlockPos()).getBlock())) {
               var2.hitResult = BlockRayTraceResult.miss(var4.getLocation(), var4.getDirection(), var4.getBlockPos());
            }
         }
      }

      return super.consumeClick();
   }
}
