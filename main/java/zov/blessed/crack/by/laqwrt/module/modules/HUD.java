package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import java.awt.Color;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector4f;
import org.lwjgl.opengl.GL11;
import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.utils.RenderUtil;
import zov.blessed.crack.by.laqwrt.Class_253;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;

public class HUD extends Module {
   private final Field field_280 = Class_253.method_1143(Minecraft.class, 91);

   public HUD() {
      super(new String[]{"HU", "D"}, Category.visual);
      this.toggle(true);
   }

   public int method_143() {
      return (Integer)Class_253.method_1159(this.field_280, this.mc);
   }

   public int method_144(PlayerEntity var1) {
      if (var1 == null) {
         return -1;
      } else {
         NetworkPlayerInfo var2 = Minecraft.getInstance().getConnection().getPlayerInfo(var1.getName().getString());
         return var2 != null ? var2.getLatency() : -1;
      }
   }

   public static Color method_145(Color var0, Color var1, double var2) {
      double var4 = var2 / 4.0D % 1.0D;
      float var6 = MathHelper.clamp((float)Math.sin(18.84955592153876D * var4) / 2.0F + 0.5F, 0.0F, 1.0F);
      return new Color((float)MathHelper.clampedLerp((double)((float)var0.getRed() / 255.0F), (double)((float)var1.getRed() / 255.0F), (double)var6), (float)MathHelper.clampedLerp((double)((float)var0.getGreen() / 255.0F), (double)((float)var1.getGreen() / 255.0F), (double)var6), (float)MathHelper.clampedLerp((double)((float)var0.getBlue() / 255.0F), (double)((float)var1.getBlue() / 255.0F), (double)var6));
   }

   private double method_146() {
      if (this.mc.player.getActiveEffects().isEmpty()) {
         return 0.0D;
      } else {
         boolean var1 = false;
         Iterator var2 = this.mc.player.getActiveEffects().iterator();

         while(var2.hasNext()) {
            EffectInstance var3 = (EffectInstance)var2.next();
            if (var3.showIcon()) {
               if (!var3.getEffect().isBeneficial()) {
                  return 52.0D;
               }

               var1 = true;
            }
         }

         return var1 ? 26.0D : 0.0D;
      }
   }

   public void method_208() {
      float var1 = (float) Blessed.getInstance().method_806().method_1174();
      float var2 = 4.0F;
      double var3 = this.mc.player.getActiveEffectsMap().size() != 0 ? this.method_146() : 0.0D;
      List var5 = this.method_150();
      float[] var6 = new float[]{5.0F, 5.0F};
      float[] var7 = new float[]{(float)this.mc.getWindow().getGuiScaledWidth() / var1 - 5.0F, 5.0F + (float)var3};
      int var8 = Blessed.getInstance().method_824().method_194();
      Color var9 = new Color(255, 255, 255);
      this.method_149(var6, var8, var9);
      GL11.glPushMatrix();
      this.method_148(var8, var5, var7, var2, var9);
      GL11.glPopMatrix();
      super.method_208();
   }

   private void method_147() {
      Method var1 = Class_253.method_1153(PlayerEntity.class, Blessed.getInstance().field_1011.method_310("tick"));
      Method var2 = Class_253.method_1153(ClientPlayerEntity.class, Blessed.getInstance().field_1011.method_310("onUpdateWalkingPlayer"));
      Method var3 = Class_253.method_1155(Entity.class, (var0) -> {
         return var0.getParameterCount() == 2 && var0.getParameterTypes()[0] == Float.TYPE && var0.getParameterTypes()[1] == Vector3d.class && Modifier.isPublic(var0.getModifiers());
      });
      Method var4 = Class_253.method_1153(LivingEntity.class, Blessed.getInstance().field_1011.method_310("jump"));
      String[] var5 = new String[]{"tick -> ", var1.toString()};
      String[] var6 = new String[]{"onUpdateWalkingPlayer  -> ", var2.toString()};
      String[] var7 = new String[]{"moveRelative  -> ", var3.toString()};
      String[] var8 = new String[]{"jump  -> ", var4.toString()};
      Blessed.getInstance().method_824().method_191(var5, 10.0F, 10.0F, -1);
      Blessed.getInstance().method_824().method_191(var6, 10.0F, 30.0F, -1);
      Blessed.getInstance().method_824().method_191(var7, 10.0F, 50.0F, -1);
      Blessed.getInstance().method_824().method_191(var8, 10.0F, 70.0F, -1);
   }

   private void method_148(int var1, List<Module> var2, float[] var3, float var4, Color var5) {
      int var6 = 0;
      boolean var7 = true;
      double var8 = (double)(var1 + 4);
      Iterator var10 = var2.iterator();

      while(var10.hasNext()) {
         Module var11 = (Module)var10.next();
         Double var12 = (Double)var11.field_347.method_483(var11.isState() ? 1.0D : 0.0D, 0.3D).method_494();
         if (var12 > 0.0D) {
            double var13 = (double)(Blessed.getInstance().method_824().method_193(var11.getName()) + 4);
            float var15 = (float)((double)var3[0] - (var13 + 2.0D) * var12);
            float var16 = this.method_151(var6, var11, var2, var4, var13);
            Vector4f var17 = new Vector4f(var6 == 0 ? var4 : 0.0F, var16, 0.0F, 0.0F);
            Vector4f var18 = new Vector4f(0.0F, 0.0F, 0.0F, 0.0F);
            Color var19 = this.method_152(var6, var5);
            this.method_153(var15, var3[1], var13, var8, var17);
            this.method_154((float)((double)var15 + var13), var3[1], 2.0D, var18, var19);
            this.method_155(var11.getName(), var15 + 2.0F, var3[1] + 0.5F, var19);
            var3[1] += (float)(var8 * var12);
            ++var6;
         }
      }

   }

   private void method_149(float[] var1, int var2, Color var3) {
      String[] var4 = new String[]{"Bl", "es", "sed", " ", "C","r","a","c","k","e","d"," ","b","y"," ","l","a","q","w","r","t"," ", " | ", String.valueOf(this.method_143()), "fps", " | ", String.valueOf(this.method_144(this.mc.player)), "ms"};
      int var5 = Blessed.getInstance().method_824().method_193(var4);
      RenderUtil.method_1009((double)var1[0], (double)var1[1], (double)var5 + 2.5D + 10.0D, (double)(var2 + 4), new Vector4f((float)var2 + 0.5F, 0.0F, 0.0F, (float)var2 + 0.5F), new Color(139, 0, 255));
      RenderUtil.method_1009((double)var1[0] + 0.5D, (double)var1[1] + 0.5D, (double)var5 + 2.5D + 10.0D - 1.0D, (double)(var2 - 1 + 4), new Vector4f((float)var2, 0.0F, 0.0F, (float)var2), new Color(20, 20, 20));
      Blessed.getInstance().method_824().method_191(var4, var1[0] + 2.0F + 5.0F, var1[1], this.method_152(0, var3).getRGB());
   }

   private List<Module> method_150() {
      return (List) Blessed.getInstance().getModuleManager().getModules().stream().sorted(Comparator.comparingDouble((var0) -> {
         return (double)(-Blessed.getInstance().method_824().method_193(var0.getName()));
      })).collect(Collectors.toList());
   }

   private float method_151(int var1, Module var2, List<Module> var3, float var4, double var5) {
      Iterator var7 = var3.subList(var3.indexOf(var2) + 1, var3.size()).iterator();

      Module var8;
      do {
         if (!var7.hasNext()) {
            return var4;
         }

         var8 = (Module)var7.next();
      } while((Double)var8.field_347.method_494() == 0.0D);

      double var9 = (double)(Blessed.getInstance().method_824().method_193(var8.getName()) + 4);
      return (float)Math.min(var5 - var9, (double)var4);
   }

   private Color method_152(int var1, Color var2) {
      double var3 = (double)Math.abs(System.currentTimeMillis() / 20L) / 100.0D + 3.0D * (double)var1 * 2.55D / 150.0D;
      return method_145(new Color(139, 0, 255), var2, var3);
   }

   private void method_153(float var1, float var2, double var3, double var5, Vector4f var7) {
      RenderUtil.method_1009((double)var1, (double)var2, var3, var5, var7, new Color(20, 20, 20, 255));
   }

   private void method_154(float var1, float var2, double var3, Vector4f var5, Color var6) {
      RenderUtil.method_1009((double)var1, (double)var2, var3, (double)(Blessed.getInstance().method_824().method_194() + 4), var5, var6);
   }

   private void method_155(String[] var1, float var2, float var3, Color var4) {
      Blessed.getInstance().method_824().method_191(var1, var2, var3, var4.getRGB());
   }
}
