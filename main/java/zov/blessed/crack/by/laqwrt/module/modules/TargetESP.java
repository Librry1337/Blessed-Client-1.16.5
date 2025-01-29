package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import net.minecraft.item.Item;
import net.minecraft.util.math.vector.Vector3d;
import org.lwjgl.opengl.GL11;
import zov.blessed.crack.by.laqwrt.clickgui.Theme;
import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.Class_101;
import zov.blessed.crack.by.laqwrt.Class_234;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;
import zov.blessed.crack.by.laqwrt.setting.Setting;
import zov.blessed.crack.by.laqwrt.setting.settings.BooleanSetting;
import zov.blessed.crack.by.laqwrt.setting.settings.SliderSetting;

public class TargetESP extends Module {
   private static int field_890 = -1;
   private static int field_891 = -1;
   private BooleanSetting field_892 = new BooleanSetting(new String[]{"Nur", "ik"}, true, (Item)null);
   private BooleanSetting field_893 = new BooleanSetting(new String[]{"Gh", "ost"}, true, (Item)null);
   public SliderSetting field_894 = new SliderSetting(new String[]{"Speed"}, 3.0F, 0.7F, 9.0F, 1);
   public SliderSetting field_895 = new SliderSetting(new String[]{"Size"}, 30.0F, 5.0F, 140.0F, 1);
   public SliderSetting field_896 = new SliderSetting(new String[]{"Bright"}, 255.0F, 1.0F, 255.0F, 1);

   public TargetESP() {
      super(new String[]{"Tar", "get", "E", "SP"}, Category.visual);
      this.addSettings(new Setting[]{this.field_892, this.field_893, this.field_894, this.field_895, this.field_896});
   }

   public void method_208() {
      try {
         if (field_890 == -1) {
            try {
               field_890 = Class_234.method_1085("target.png");
               field_891 = Class_234.method_1085("glow.png");
            } catch (Exception var37) {
               var37.hashCode();
            }
         }

         GL11.glEnable(3008);
         RenderSystem.enableBlend();
         Theme var1 = Blessed.getInstance().getClickGUIScreen().getSelectedTheme();
         double var7;
         if ((Boolean)this.field_892.method_580() && Blessed.method_815() != null) {
            double var2 = Math.sin((double)System.currentTimeMillis() / 1000.0D);
            float var4 = 70.0F;
            Vector3d var5 = Blessed.method_815().getEyePosition(this.mc.getFrameTime());
            Vector3d var6 = Class_101.method_356(var5.x, var5.y - (double) Blessed.method_815().getEyeHeight() + (double)(Blessed.method_815().getBbHeight() / 2.0F), var5.z);
            if (var6 != null) {
               GlStateManager._pushMatrix();
               GlStateManager._translated(var6.x, var6.y, 0.0D);
               GlStateManager._rotatef((float)var2 * 360.0F, 0.0F, 0.0F, 1.0F);
               GlStateManager._translated(-var6.x, -var6.y, 0.0D);
               var7 = (double)Math.abs(System.currentTimeMillis() / 20L) / 100.0D + 0.051D;
               Color var9 = ESP.method_428(new Color(139, 0, 255), var1.method_375(), var7);
               RenderSystem.color4f((float)var9.getRed() / 255.0F, (float)var9.getGreen() / 255.0F, (float)var9.getBlue() / 255.0F, 0.8627451F);
               RenderSystem.enableTexture();
               RenderSystem.bindTexture(field_890);
               Class_234.method_1088(var6.x - (double)(var4 / 2.0F), var6.y - (double)(var4 / 2.0F), (double)var4, (double)var4);
               RenderSystem.disableTexture();
               GlStateManager._popMatrix();
            }
         }

         if ((Boolean)this.field_893.method_580() && Blessed.method_815() != null) {
            float var39 = this.field_894.method_1240();
            float var3 = this.field_895.method_1240();
            int var40 = this.field_896.method_1240().intValue();
            double var41 = (double)var39;
            var7 = (double)System.currentTimeMillis() / (500.0D / var41);
            double var42 = Math.sin(var7);
            double var11 = Math.cos(var7);
            float var13 = var3;
            int var14 = var40;
            Vector3d var15 = Blessed.method_815().getEyePosition(this.mc.getFrameTime()).add(0.0D, (double)(-Blessed.method_815().getEyeHeight()), 0.0D);
            Vector3d var16 = var15.add(0.0D, (double) Blessed.method_815().getBbHeight(), 0.0D);
            Vector3d var17 = var15.add(0.0D, (double)(Blessed.method_815().getBbHeight() / 2.0F), 0.0D);
            Vector3d[] var19 = new Vector3d[]{var17.add(0.0D, 0.5D, 0.0D)};
            Vector3d[] var20 = new Vector3d[]{var15.add(0.0D, 0.5D, 0.0D)};

            for(int var21 = 0; var21 < 40; ++var21) {
               float var22 = (float)(var14 - var21 * 5);
               if (var22 < 0.0F) {
                  var22 = 0.0F;
               }

               float var23 = var13 * (1.0F - (float)var21 * 0.02F);
               double var24 = var7 - (double)var21 * 0.1D;
               double var26 = Math.sin(var24);
               double var28 = Math.cos(var24);
               float var30 = (float)var21 * 7.2F;
               double var31 = (double)Math.abs(System.currentTimeMillis() / 20L) / 100.0D + 0.051D;
               Color var33 = ESP.method_428(new Color(139, 0, 255), var1.method_375(), var31);
               RenderSystem.color4f((float)var33.getRed() / 255.0F, (float)var33.getGreen() / 255.0F, (float)var33.getBlue() / 255.0F, var22);

               int var34;
               Vector3d var35;
               Vector3d var36;
               for(var34 = 0; var34 < var19.length; ++var34) {
                  var35 = var19[var34].add(0.0D, Math.sin(var24) * 0.26D, 0.0D);
                  var36 = Class_101.method_356(var35.x + var28 * 0.5D, var35.y, var35.z + var26 * 0.5D);
                  if (var36 != null) {
                     GlStateManager._pushMatrix();
                     GlStateManager._translated(var36.x, var36.y, 0.0D);
                     GlStateManager._rotatef((float)(var26 * 360.0D + (double)(var34 * 180) + (double)var30), 0.0F, 0.0F, 1.0F);
                     GlStateManager._translated(-var36.x, -var36.y, 0.0D);
                     RenderSystem.enableTexture();
                     RenderSystem.bindTexture(field_891);
                     Class_234.method_1088(var36.x - (double)(var23 / 2.0F), var36.y - (double)(var23 / 2.0F), (double)var23, (double)var23);
                     RenderSystem.disableTexture();
                     GlStateManager._popMatrix();
                  }
               }

               for(var34 = 0; var34 < var20.length; ++var34) {
                  var35 = var20[var34].add(0.0D, Math.sin(var24) * 0.26D, 0.0D);
                  var36 = Class_101.method_356(var35.x - var28 * 0.5D, var35.y, var35.z - var26 * 0.5D);
                  if (var36 != null) {
                     GlStateManager._pushMatrix();
                     GlStateManager._translated(var36.x, var36.y, 0.0D);
                     GlStateManager._rotatef((float)(-var26 * 360.0D + (double)(var34 * 180) + (double)var30), 0.0F, 0.0F, 1.0F);
                     GlStateManager._translated(-var36.x, -var36.y, 0.0D);
                     RenderSystem.enableTexture();
                     RenderSystem.bindTexture(field_891);
                     Class_234.method_1088(var36.x - (double)(var23 / 2.0F), var36.y - (double)(var23 / 2.0F), (double)var23, (double)var23);
                     RenderSystem.disableTexture();
                     GlStateManager._popMatrix();
                  }
               }
            }
         }

         RenderSystem.enableTexture();
      } catch (Exception var38) {
      }

   }

   public void method_211() {
   }
}
