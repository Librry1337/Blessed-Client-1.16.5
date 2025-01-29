package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import java.util.Iterator;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EnderPearlEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.EggEntity;
import net.minecraft.entity.projectile.PotionEntity;
import net.minecraft.entity.projectile.SnowballEntity;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceContext.BlockMode;
import net.minecraft.util.math.RayTraceContext.FluidMode;
import net.minecraft.util.math.RayTraceResult.Type;
import net.minecraft.util.math.vector.Vector3d;
import org.lwjgl.opengl.GL11;
import zov.blessed.crack.by.laqwrt.setting.settings.BooleanSetting;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;

public class Trajectories extends Module {
   private BooleanSetting field_1274 = new BooleanSetting(new String[]{"Frie", "nds"}, false, (Item)null);
   private BooleanSetting field_1275 = new BooleanSetting(new String[]{"Last ", "Hit"}, false, (Item)null);

   public Trajectories() {
      super(new String[]{"Traj", "ectori", "es"}, Category.visual);
      this.getSettings().add(this.field_1274);
      this.getSettings().add(this.field_1275);
   }

   public void method_211() {
      double var1 = -(this.mc.player.xOld + (this.mc.player.getX() - this.mc.player.xOld) * (double)this.mc.getFrameTime());
      double var3 = -(this.mc.player.yOld + (this.mc.player.getY() - this.mc.player.yOld) * (double)this.mc.getFrameTime());
      double var5 = -(this.mc.player.zOld + (this.mc.player.getZ() - this.mc.player.zOld) * (double)this.mc.getFrameTime());
      GL11.glTranslated(var1, var3, var5);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glEnable(3042);
      GL11.glLineWidth(1.5F);
      GL11.glDisable(2929);
      Iterator var7 = this.mc.level.entitiesForRendering().iterator();

      while(var7.hasNext()) {
         Entity var8 = (Entity)var7.next();
         if (var8.isAlive()) {
            if (var8 instanceof EnderPearlEntity) {
               this.method_1231(var8, 0.029999999329447746D, 0.8F, false);
            } else if (var8 instanceof ArrowEntity) {
               this.method_1231(var8, 0.05D, 0.6F, true);
            } else if (var8 instanceof SnowballEntity) {
               this.method_1231(var8, 0.029999999329447746D, 0.8F, false);
            } else if (var8 instanceof EggEntity) {
               this.method_1231(var8, 0.029999999329447746D, 0.8F, false);
            } else if (var8 instanceof PotionEntity) {
               this.method_1231(var8, 0.05000000074505806D, 0.8F, false);
            }
         }
      }

      GL11.glDisable(2848);
      GL11.glEnable(2929);
      GL11.glEnable(3553);
   }

   private void method_1231(Entity var1, double var2, float var4, boolean var5) {
      Tessellator var6 = Tessellator.getInstance();
      BufferBuilder var7 = var6.getBuilder();
      double var8 = var1.getX();
      double var10 = var1.getY() - 1.4D;
      double var12 = var1.getZ();
      double var14 = var1.getDeltaMovement().x;
      double var16 = var1.getDeltaMovement().y;
      double var18 = var1.getDeltaMovement().z;
      boolean var20 = false;
      var7.begin(3, DefaultVertexFormats.POSITION_COLOR);

      for(int var21 = 0; var21 < 360; ++var21) {
         Vector3d var22 = new Vector3d(var8, var10, var12);
         var8 += var14;
         var10 += var16;
         var12 += var18;
         float var23 = 0.99F;
         BlockPos var24 = new BlockPos(var8, var10, var12);
         if (this.mc.level.getBlockState(var24).getBlock() == Blocks.WATER) {
            var23 = var4;
         }

         var14 *= (double)var23;
         var16 *= (double)var23;
         var18 *= (double)var23;
         if (!var1.isNoGravity()) {
            var16 -= var2;
         }

         RayTraceContext var25 = new RayTraceContext(var22, new Vector3d(var8, var10, var12), BlockMode.OUTLINE, FluidMode.ANY, var1);
         BlockRayTraceResult var26 = this.mc.level.clip(var25);
         if (var26 != null && var26.getType() == Type.BLOCK) {
            var8 = var26.getLocation().x;
            var10 = var26.getLocation().y;
            var12 = var26.getLocation().z;
            var20 = true;
         }

         var7.vertex(var22.x, var22.y, var22.z).color(255, 255, 255, 255).endVertex();
         var7.vertex(var8, var10, var12).color(255, 255, 255, 255).endVertex();
         if (var20) {
            break;
         }
      }

      var6.end();
   }
}
