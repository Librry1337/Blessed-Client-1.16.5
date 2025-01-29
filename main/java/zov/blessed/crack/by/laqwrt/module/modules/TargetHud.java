package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;
import zov.blessed.crack.by.laqwrt.Class_107;
import zov.blessed.crack.by.laqwrt.clickgui.Theme;
import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.Class_234;
import zov.blessed.crack.by.laqwrt.Class_238;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;
import zov.blessed.crack.by.laqwrt.setting.Setting;
import zov.blessed.crack.by.laqwrt.setting.settings.SliderSetting;
import zov.blessed.crack.by.laqwrt.utils.RenderUtil;

public class TargetHud extends Module {
   private SliderSetting field_1121 = new SliderSetting(new String[]{"X"}, -80.0F, -200.0F, 200.0F, 1);
   private SliderSetting field_1122 = new SliderSetting(new String[]{"Y"}, 200.0F, -200.0F, 200.0F, 1);
   private static final Color field_1123 = new Color(139, 0, 255);

   public TargetHud() {
      super(new String[]{"Ta", "rge", "tH", "ud"}, Category.visual);
      this.addSettings(new Setting[]{this.field_1121, this.field_1122});
   }

   public void method_208() {
      Entity var1 = Blessed.method_815();
      if (var1 instanceof PlayerEntity) {
         PlayerEntity var2 = (PlayerEntity)var1;
         Theme var3 = Blessed.getInstance().getClickGUIScreen().getSelectedTheme();
         double var4 = Blessed.getInstance().method_806().method_1174();
         MainWindow var6 = this.mc.getWindow();
         double var7 = (double)(var6.getGuiScaledWidth() / 2) / var4 + (double)this.field_1121.method_1240();
         double var9 = (double)(var6.getGuiScaledHeight() / 2) / var4 + (double)this.field_1122.method_1240();
         double var11 = 140.0D;
         double var13 = 35.0D;
         RenderUtil.drawBlurredRounded(var7, var9 + var13, var11, var13, 15.0D, 10.0F, var3.method_375());
         Class_234.method_1079((float)var7, (float)var9, (float)var11, (float)var13, 15.0F, var3.method_375(), Blessed.getInstance().method_809());
         GL11.glEnable(3008);
         this.method_989(var7 + 5.0D, var9 + 5.0D, var13 - 10.0D, var13 - 10.0D, var2);
         double var15 = (double)var2.getHealth() / (double)var2.getMaxHealth();
         var15 = MathHelper.clamp(var15, 0.0D, 1.0D);
         this.method_988(var7 + var13, var9 + var13 - 15.0D, var11 - (5.0D + var13 + 5.0D), 10.0D, var15);
         Blessed.getInstance().method_823().method_191(new String[]{var2.getName().getString()}, (float)((int)var7 + (int)var13), (float)((int)var9 + 5), var3.method_377().getRGB());
      }

   }

   private void method_988(double var1, double var3, double var5, double var7, double var9) {
      Theme var11 = Blessed.getInstance().getClickGUIScreen().getSelectedTheme();
      Class_234.method_1079((float)var1, (float)var3, (float)var5, (float)var7, 5.0F, var11.method_376(), Blessed.getInstance().method_809());
      RenderUtil.drawBlurredRounded(var1, var3 + var7, var5 * (double)((float)var9), var7, 5.0D, 7.0F, field_1123);
      Class_234.method_1079((float)var1, (float)var3, (float)var5 * (float)var9, (float)var7, 5.0F, field_1123, Blessed.getInstance().method_809());
   }

   private void method_989(double var1, double var3, double var5, double var7, PlayerEntity var9) {
      Class_238.method_1100();
      Class_234.method_1079((float)var1, (float)var3, (float)var5, (float)var7, 10.0F, new Color(-1), Blessed.getInstance().method_809());
      Class_238.method_1102(Class_107.はサのオつせねんいゆ);
      RenderSystem.enableTexture();
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      ResourceLocation var10 = method_990(var9);
      this.mc.getTextureManager().bind(var10);
      Class_234.method_1087(var1, var3, 8.0F, 8.0F, 8.0F, 8.0F, var5, var7, 64.0F, 64.0F);
      Class_234.method_1087(var1, var3, 40.0F, 8.0F, 8.0F, 8.0F, var5, var7, 64.0F, 64.0F);
      RenderSystem.disableTexture();
      Class_238.method_1103();
   }

   public static ResourceLocation method_990(PlayerEntity var0) {
      NetworkPlayerInfo var1 = Minecraft.getInstance().getConnection().getPlayerInfo(var0.getUUID());
      if (var1 != null) {
         return var1.getSkinLocation();
      } else if (var0 instanceof AbstractClientPlayerEntity) {
         AbstractClientPlayerEntity var2 = (AbstractClientPlayerEntity)var0;
         return var2.getSkinTextureLocation();
      } else {
         return DefaultPlayerSkin.getDefaultSkin(var0.getUUID());
      }
   }
}
