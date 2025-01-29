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
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector4f;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponent;
import org.lwjgl.opengl.GL11;
import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.Class_233;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.setting.Setting;
import zov.blessed.crack.by.laqwrt.setting.settings.SliderSetting;
import zov.blessed.crack.by.laqwrt.setting.settings.BooleanSetting;
import zov.blessed.crack.by.laqwrt.Class_101;
import zov.blessed.crack.by.laqwrt.module.Module;

public class NameTags extends Module {
   private SliderSetting field_1043 = new SliderSetting(new String[]{"Alpha"}, 255.0F, 1.0F, 255.0F, 0);
   private BooleanSetting field_1044 = new BooleanSetting(new String[]{"HP"}, true, (Item)null);
   private BooleanSetting field_1045 = new BooleanSetting(new String[]{"Ping"}, true, (Item)null);

   public NameTags() {
      super(new String[]{"NameT", "ags"}, Category.visual);
      this.addSettings(new Setting[]{this.field_1043, this.field_1044, this.field_1045});
   }

   public void method_208() {
      Iterator var1 = this.mc.level.players().iterator();

      while(true) {
         Entity var2;
         do {
            if (!var1.hasNext()) {
               super.method_208();
               return;
            }

            var2 = (Entity)var1.next();
         } while(var2 == this.mc.player);

         Vector3d var3 = var2.getEyePosition(this.mc.getFrameTime()).subtract(0.0D, (double)var2.getEyeHeight(), 0.0D);
         double var4 = (double)(var2.getBbWidth() / 2.0F);
         double var6 = (double)var2.getBbHeight();
         if (var2.isShiftKeyDown()) {
            var6 -= 0.3D;
         }

         AxisAlignedBB var8 = new AxisAlignedBB(var3.x - var4, var3.y, var3.z - var4, var3.x + var4, var3.y + var6, var3.z + var4);
         List var9 = Arrays.asList(new Vector3d(var8.minX, var8.minY, var8.minZ), new Vector3d(var8.minX, var8.maxY, var8.minZ), new Vector3d(var8.maxX, var8.minY, var8.minZ), new Vector3d(var8.maxX, var8.maxY, var8.minZ), new Vector3d(var8.minX, var8.minY, var8.maxZ), new Vector3d(var8.minX, var8.maxY, var8.maxZ), new Vector3d(var8.maxX, var8.minY, var8.maxZ), new Vector3d(var8.maxX, var8.maxY, var8.maxZ));
         Vector4f var10 = null;
         Iterator var11 = var9.iterator();

         while(var11.hasNext()) {
            Vector3d var12 = (Vector3d)var11.next();
            var12 = Class_101.method_356(var12.x, var12.y, var12.z);
            if (var12 != null && var12.z >= 0.0D && var12.z < 1.0D) {
               if (var10 == null) {
                  var10 = new Vector4f((float)var12.x, (float)var12.y, (float)var12.z, 0.0F);
               }

               var10.set((float)Math.min(var12.x(), (double)var10.x()), (float)Math.min(var12.y(), (double)var10.y()), (float)Math.max(var12.x(), (double)var10.z()), (float)Math.max(var12.y(), (double)var10.w()));
            }
         }

         if (var10 != null) {
            int var24 = (int)var10.x();
            int var25 = (int)var10.y();
            int var13 = (int)var10.z();
            int var14 = (int)var10.w();
            boolean var15 = true;
            if (var2 instanceof PlayerEntity) {
               PlayerEntity var16 = (PlayerEntity)var2;
               String var17 = (Boolean)this.field_1045.method_580() ? (this.mc.getConnection().getPlayerInfo(var2.getName().getString()) == null ? "BOT " : this.mc.getConnection().getPlayerInfo(var2.getName().getString()).getLatency() + " ") : "";
               String var18 = (Boolean)this.field_1044.method_580() ? " " + String.valueOf(Class_233.method_1065(AimAissist.method_775((PlayerEntity)var2), 1)) : "";
               String var19 = var17 + var2.getName().getString() + var18;
               StringTextComponent var20 = new StringTextComponent(var17 + " ");
               var20.append(var2.getName());
               var20.append(new StringTextComponent(" " + var18));
               GL11.glPushMatrix();
               double var21 = (double)this.method_865((PlayerEntity)var2);
               var21 = 0.8D;
               int var23 = var13 - var24;
               Screen.fill(new MatrixStack(), var24 + var23 / 2 - (int)((double)(Blessed.getInstance().method_823().method_193(new String[]{var19}) / 2) * var21) - 5, var25 - 13, var24 + var23 / 2 - (int)((double)(Blessed.getInstance().method_823().method_193(new String[]{var19}) / 2) * var21) - 5 + (int)((double) Blessed.getInstance().method_823().method_193(new String[]{var19}) * var21) + 10 + 6, var25, (new Color(0, 0, 0, this.field_1043.method_1240().intValue())).getRGB());
               this.method_866(var20, var24 + var23 / 2 - (int)((double)(this.mc.font.width(var20) / 2) * var21), var25 - 12, var21, -1);
               GL11.glPopMatrix();
            }
         }
      }
   }

   private float method_865(LivingEntity var1) {
      float var2 = this.mc.player.distanceTo(var1);
      float var3 = 0.1F;
      float var4 = 50.0F;
      var3 = var2 / var4 + 0.2F;
      return var3;
   }

   private void method_866(TextComponent var1, int var2, int var3, double var4, int var6) {
      GL11.glPushMatrix();
      GL11.glTranslated((double)var2, (double)var3, 0.0D);
      GL11.glScaled(var4, var4, var4);
      this.mc.font.drawShadow(new MatrixStack(), var1, 3.0F, 3.0F, var6);
      GL11.glPopMatrix();
   }
}
