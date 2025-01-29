package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.RailBlock;
import net.minecraft.entity.item.minecart.MinecartEntity;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;
import zov.blessed.crack.by.laqwrt.setting.Setting;
import zov.blessed.crack.by.laqwrt.setting.settings.BooleanSetting;

public class NoInteract extends Module {
   public BooleanSetting field_249;
   public BooleanSetting field_250;
   public BooleanSetting field_251;
   public BooleanSetting field_252;
   public BooleanSetting field_253;
   public BooleanSetting field_254;
   public BooleanSetting field_255;
   public BooleanSetting field_256;

   public NoInteract() {
      super(new String[]{"NoInte", "ract"}, Category.player);
      this.field_249 = new BooleanSetting(new String[]{"Min", "eCart"}, false, Items.MINECART);
      this.field_250 = new BooleanSetting(new String[]{"Rai", "ls"}, false, Items.RAIL);
      this.field_251 = new BooleanSetting(new String[]{"Furnan", "ce"}, false, Items.FURNACE);
      this.field_252 = new BooleanSetting(new String[]{"Work", "bench"}, false, Items.CRAFTING_TABLE);
      this.field_253 = new BooleanSetting(new String[]{"St", "and"}, false, Items.ARMOR_STAND);
      this.field_254 = new BooleanSetting(new String[]{"Bed", "rock"}, false, Items.BEDROCK);
      this.field_255 = new BooleanSetting(new String[]{"Ga", "te"}, false, Items.OAK_FENCE_GATE);
      this.field_256 = new BooleanSetting(new String[]{"Lev", "er"}, false, Items.LEVER);
      this.addSettings(new Setting[]{this.field_249, this.field_250, this.field_251, this.field_252, this.field_253, this.field_254, this.field_255, this.field_256});
   }

   public boolean method_122(Block var1) {
      if (var1 instanceof RailBlock && (Boolean)this.field_249.method_580()) {
         return false;
      } else if (var1 == Blocks.FURNACE && (Boolean)this.field_251.method_580()) {
         return false;
      } else if (var1 == Blocks.CRAFTING_TABLE && (Boolean)this.field_252.method_580()) {
         return false;
      } else if (var1 == Blocks.BEDROCK && (Boolean)this.field_254.method_580()) {
         return false;
      } else if (var1 instanceof FenceGateBlock && (Boolean)this.field_255.method_580()) {
         return false;
      } else {
         return var1 != Blocks.LEVER || !(Boolean)this.field_256.method_580();
      }
   }

   public void method_207() {
      if (this.mc.hitResult != null && this.mc.hitResult instanceof BlockRayTraceResult) {
         BlockRayTraceResult var1 = (BlockRayTraceResult)this.mc.hitResult;
      }

      if (this.mc.hitResult != null && this.mc.hitResult instanceof EntityRayTraceResult) {
         EntityRayTraceResult var2 = (EntityRayTraceResult)this.mc.hitResult;
         if (var2.getEntity() instanceof MinecartEntity && (Boolean)this.field_249.method_580()) {
         }
      }

      super.method_207();
   }
}
