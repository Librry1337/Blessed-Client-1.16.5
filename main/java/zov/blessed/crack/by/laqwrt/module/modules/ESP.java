package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import com.mojang.blaze3d.matrix.MatrixStack;
import java.awt.Color;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector4f;
import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.Class_101;
import zov.blessed.crack.by.laqwrt.Class_234;
import zov.blessed.crack.by.laqwrt.clickgui.Theme;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;
import zov.blessed.crack.by.laqwrt.setting.settings.BooleanSetting;
import zov.blessed.crack.by.laqwrt.utils.RenderUtil;

public class ESP extends Module {
   private BooleanSetting field_706 = new BooleanSetting(new String[]{"Glow"}, true, (Item)null);
   private BooleanSetting field_707 = new BooleanSetting(new String[]{"Box"}, true, (Item)null);
   private BooleanSetting field_708 = new BooleanSetting(new String[]{"Heal", "th"}, true, (Item)null);

   public ESP() {
      super(new String[]{"ESP"}, Category.visual);
      this.getSettings().add(this.field_706);
      this.getSettings().add(this.field_707);
      this.getSettings().add(this.field_708);
   }

   public static Color method_428(Color var0, Color var1, double var2) {
      double var4 = var2 / 4.0D % 1.0D;
      float var6 = MathHelper.clamp((float)Math.sin(18.84955592153876D * var4) / 2.0F + 0.5F, 0.0F, 1.0F);
      return new Color((float)MathHelper.clampedLerp((double)((float)var0.getRed() / 255.0F), (double)((float)var1.getRed() / 255.0F), (double)var6), (float)MathHelper.clampedLerp((double)((float)var0.getGreen() / 255.0F), (double)((float)var1.getGreen() / 255.0F), (double)var6), (float)MathHelper.clampedLerp((double)((float)var0.getBlue() / 255.0F), (double)((float)var1.getBlue() / 255.0F), (double)var6));
   }

   public void method_208() {
      int var1 = 0;
      Iterator var2 = this.mc.level.players().iterator();

      while(true) {
         Entity var3;
         Vector4f var11;
         do {
            do {
               if (!var2.hasNext()) {
                  return;
               }

               var3 = (Entity)var2.next();
            } while(var3 == this.mc.player);

            var3.setGlowing(false);
            Vector3d var4 = var3.getEyePosition(this.mc.getFrameTime()).subtract(0.0D, (double)var3.getEyeHeight(), 0.0D);
            double var5 = (double)(var3.getBbWidth() / 2.0F);
            double var7 = (double)var3.getBbHeight();
            if (var3.isShiftKeyDown()) {
               var7 -= 0.3D;
            }

            AxisAlignedBB var9 = new AxisAlignedBB(var4.x - var5, var4.y, var4.z - var5, var4.x + var5, var4.y + var7, var4.z + var5);
            List var10 = Arrays.asList(new Vector3d(var9.minX, var9.minY, var9.minZ), new Vector3d(var9.minX, var9.maxY, var9.minZ), new Vector3d(var9.maxX, var9.minY, var9.minZ), new Vector3d(var9.maxX, var9.maxY, var9.minZ), new Vector3d(var9.minX, var9.minY, var9.maxZ), new Vector3d(var9.minX, var9.maxY, var9.maxZ), new Vector3d(var9.maxX, var9.minY, var9.maxZ), new Vector3d(var9.maxX, var9.maxY, var9.maxZ));
            var11 = null;
            Iterator var12 = var10.iterator();

            while(var12.hasNext()) {
               Vector3d var13 = (Vector3d)var12.next();
               var13 = Class_101.method_356(var13.x, var13.y, var13.z);
               if (var13 != null && var13.z >= 0.0D && var13.z < 1.0D) {
                  if (var11 == null) {
                     var11 = new Vector4f((float)var13.x, (float)var13.y, (float)var13.z, 0.0F);
                  }

                  var11.set((float)Math.min(var13.x(), (double)var11.x()), (float)Math.min(var13.y(), (double)var11.y()), (float)Math.max(var13.x(), (double)var11.z()), (float)Math.max(var13.y(), (double)var11.w()));
               }
            }
         } while(var11 == null);

         Theme var34 = Blessed.getInstance().getClickGUIScreen().getSelectedTheme();
         int var35 = (int)var11.x();
         int var14 = (int)var11.y();
         int var15 = (int)var11.z();
         int var16 = (int)var11.w();
         byte var17 = 1;
         double var18 = (double)Math.abs(System.currentTimeMillis() / 20L) / 100.0D + 3.0D * (double)var1 * 2.55D / 150.0D;
         Color var20 = method_428(new Color(139, 0, 255), var34.method_375(), var18);
         Color var21 = Blessed.getInstance().method_825().method_1134(var3.getName().getString()) ? new Color(0, 255, 0) : var20;
         if ((Boolean)this.field_707.method_580()) {
            RenderUtil.drawBlurredRounded((double)var35, (double)var16, (double)var17, (double)(var16 - var14), 0.0D, 3.0F, var21);
            Screen.fill(new MatrixStack(), var35, var14, var35 + var17, var16, var21.getRGB());
            RenderUtil.drawBlurredRounded((double)var35, (double)(var16 - var17), (double)(var15 - var35), (double)var17, 0.0D, 3.0F, var21);
            Screen.fill(new MatrixStack(), var35, var16 - var17, var15, var16, var21.getRGB());
            RenderUtil.drawBlurredRounded((double)var35, (double)var14, (double)(var15 - var35), (double)var17, 0.0D, 3.0F, var21);
            Screen.fill(new MatrixStack(), var35, var14, var15, var14 + var17, var21.getRGB());
            RenderUtil.drawBlurredRounded((double)(var15 - var17), (double)var16, (double)var17, (double)(var16 - var14), 0.0D, 3.0F, var21);
            Screen.fill(new MatrixStack(), var15 - var17, var14, var15, var16, var21.getRGB());
         }

         double var22 = (double)var35;
         double var24 = (double)var14;
         double var26 = (double)(var15 - var35);
         double var28 = (double)(var16 - var14);
         if (Blessed.getInstance().clickGUIScreen.bgpng != null && Blessed.getInstance().getModuleManager().getModuleByClass(ROFLAN.class).isState()) {
            Class_234.method_1083(var22, var24 - var28, var26, var28, Blessed.getInstance().clickGUIScreen.bgpng, 1.0F, Color.WHITE);
         }

         if (var3 instanceof LivingEntity && (Boolean)this.field_708.method_580()) {
            LivingEntity var30 = (LivingEntity)var3;
            int var31 = (int)((float)(var16 - var14) * var30.getHealth() / var30.getMaxHealth());
            int var32 = (int)var30.getHealth() / (int)var30.getMaxHealth();
            Color var33 = null;
            if (var30.getHealth() <= 20.0F && var30.getHealth() >= 15.0F) {
               var33 = new Color(255, 255, 255);
            } else if (var30.getHealth() < 15.0F && var30.getHealth() >= 7.0F) {
               var33 = new Color(0, 255, 0);
            } else if (var30.getHealth() < 7.0F) {
               var33 = new Color(255, 0, 0);
            }

            if (var33 != null) {
               RenderUtil.drawBlurredRounded((double)(var35 - 4), (double)var14 + var28, 2.0D, (double)var31, 0.0D, 3.0F, var33);
               Screen.fill(new MatrixStack(), var35 - 4, var16 - var31, var35 - 2, var16, var33.getRGB());
            }
         }

         ++var1;
      }
   }

   public void method_207() {
      Iterator var1 = this.mc.level.players().iterator();

      while(var1.hasNext()) {
         PlayerEntity var2 = (PlayerEntity)var1.next();
         if (var2 != this.mc.player) {
            if ((Boolean)this.field_706.method_580()) {
               var2.setGlowing(true);
            } else {
               var2.setGlowing(false);
            }
         }
      }

   }

   @Override
   public void onDisable() {
      if (this.mc.player != null && this.mc.level != null) {
         Iterator var1 = this.mc.level.players().iterator();

         while(var1.hasNext()) {
            PlayerEntity var2 = (PlayerEntity)var1.next();
            if (var2 != this.mc.player) {
               var2.setGlowing(false);
            }
         }
      }

   }
}
