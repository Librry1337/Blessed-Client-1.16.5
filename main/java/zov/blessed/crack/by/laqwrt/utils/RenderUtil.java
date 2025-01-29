package zov.blessed.crack.by.laqwrt.utils;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import com.mojang.blaze3d.platform.GlStateManager;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector4f;
import org.lwjgl.opengl.GL11;
import zov.blessed.crack.by.laqwrt.*;

public class RenderUtil implements Class_169 {
   static Minecraft field_1126 = Minecraft.getInstance();
   static MainWindow field_1127;
   public static final HashMap<Integer, Integer> field_1128;
   private static String field_1129;
   private static String field_1130;
   private static String field_1131;
   private static String field_1132;
   private static String field_1133;
   private static String field_1134;
   private static String field_1135;
   private static final Class_53 field_1136;
   private static final Class_53 field_1137;
   private static final Class_53 roundedGradientShader;
   private static final Class_53 field_1139;
   private static final Class_53 field_1140;
   private static final Class_53 field_1141;
   private static final Class_53 field_1142;
   public static int field_1143 = 60;
   public static double field_1144 = 0.10471975511965977D;
   public static int field_1145 = 120;
   public static double field_1146 = 0.05235987755982988D;

   public static void method_999(double var0, double var2, double var4, Color var6) {
      method_1028();
      method_1024(var6);
      GL11.glBegin(6);

      int var7;
      for(var7 = 0; var7 <= 60; ++var7) {
         GL11.glVertex2d(var0 + var4 * Math.sin(0.10471975511965977D * (double)var7), var2 + var4 * Math.cos(0.10471975511965977D * (double)var7));
      }

      GL11.glEnd();
      GL11.glLineWidth(1.5F);
      GL11.glEnable(2848);
      GL11.glBegin(2);

      for(var7 = 0; var7 <= 60; ++var7) {
         GL11.glVertex2d(var0 + var4 * Math.sin(0.10471975511965977D * (double)var7), var2 + var4 * Math.cos(0.10471975511965977D * (double)var7));
      }

      GL11.glEnd();
      GL11.glDisable(2848);
      method_1029();
   }

   public static void method_1000(double var0, double var2, double var4, int var6, int var7, Color var8) {
      double var9 = var7 == 0 ? 0.10471975511965977D : -0.10471975511965977D;
      float var11 = 0.6F * (float)var6;
      method_1028();
      GlStateManager._disableCull();
      method_1024(var8);
      GL11.glBegin(6);
      GL11.glVertex2d(var0, var2);

      int var12;
      for(var12 = 0; (float)var12 <= var11; ++var12) {
         GL11.glVertex2d(var0 + var4 * Math.sin(var9 * (double)var12), var2 + var4 * Math.cos(0.10471975511965977D * (double)var12));
      }

      GL11.glEnd();
      GL11.glLineWidth(1.5F);
      GL11.glEnable(2848);
      GL11.glBegin(2);
      GL11.glVertex2d(var0, var2);

      for(var12 = 0; (float)var12 <= var11; ++var12) {
         GL11.glVertex2d(var0 + var4 * Math.sin(var9 * (double)var12), var2 + var4 * Math.cos(0.10471975511965977D * (double)var12));
      }

      GL11.glEnd();
      GL11.glDisable(2848);
      GlStateManager._enableCull();
      method_1029();
   }

   /*public static void method_1001(double var0, double var2, double var4, Class_140.Class_84 var6, Color var7) {
      double var8 = 0.10471975511965977D / (double)Class_140.Class_84.access$000(var6);
      method_1028();
      method_1024(var7);
      GL11.glBegin(6);
      GL11.glVertex2d(var0, var2);

      int var10;
      for(var10 = 0; var10 <= 60; ++var10) {
         GL11.glVertex2d(var0 + var4 * Math.sin(Class_140.Class_84.access$100(var6) + var8 * (double)var10), var2 + var4 * Math.cos(Class_140.Class_84.access$100(var6) + var8 * (double)var10));
      }

      GL11.glEnd();
      GL11.glLineWidth(1.5F);
      GL11.glEnable(2848);
      GL11.glBegin(2);
      GL11.glVertex2d(var0, var2);

      for(var10 = 0; var10 <= 60; ++var10) {
         GL11.glVertex2d(var0 + var4 * Math.sin(Class_140.Class_84.access$100(var6) + var8 * (double)var10), var2 + var4 * Math.cos(Class_140.Class_84.access$100(var6) + var8 * (double)var10));
      }

      GL11.glEnd();
      GL11.glDisable(2848);
      method_1029();
   }*/

   public static void method_1002(double var0, double var2, double var4, double var6, Color var8) {
      Color var9 = Class_215.method_969(var8, 0);
      method_1028();
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 1.0E-4F);
      GL11.glShadeModel(7425);
      method_1024(var8);
      GL11.glBegin(6);

      int var10;
      for(var10 = 0; var10 <= 120; ++var10) {
         GL11.glVertex2d(var0 + var4 * Math.sin(0.05235987755982988D * (double)var10), var2 + var4 * Math.cos(0.05235987755982988D * (double)var10));
      }

      GL11.glEnd();
      GL11.glBegin(5);

      for(var10 = 0; var10 <= 121; ++var10) {
         if (var10 % 2 == 1) {
            method_1024(var9);
            GL11.glVertex2d(var0 + (var4 + var6) * Math.sin(0.05235987755982988D * (double)var10), var2 + (var4 + var6) * Math.cos(0.05235987755982988D * (double)var10));
         } else {
            method_1024(var8);
            GL11.glVertex2d(var0 + var4 * Math.sin(0.05235987755982988D * (double)var10), var2 + var4 * Math.cos(0.05235987755982988D * (double)var10));
         }
      }

      GL11.glEnd();
      GL11.glShadeModel(7424);
      GL11.glDisable(3008);
      method_1029();
   }

   public static void method_1003(double var0, double var2, double var4, float var6, Color var7) {
      method_1028();
      GL11.glEnable(2848);
      GL11.glLineWidth(var6);
      method_1024(var7);
      GL11.glBegin(2);

      for(int var8 = 0; var8 <= 60; ++var8) {
         GL11.glVertex2d(var0 + var4 * Math.sin(0.10471975511965977D * (double)var8), var2 + var4 * Math.cos(0.10471975511965977D * (double)var8));
      }

      GL11.glEnd();
      GL11.glDisable(2848);
      method_1029();
   }

   public static void method_1004(double var0, double var2, double var4, float var6, int var7, int var8, Color var9) {
      double var10 = var8 == 0 ? 0.10471975511965977D : -0.10471975511965977D;
      float var12 = 0.6F * (float)var7;
      method_1028();
      GL11.glEnable(2848);
      GL11.glLineWidth(var6);
      method_1024(var9);
      GL11.glBegin(3);

      for(int var13 = 0; (float)var13 <= var12; ++var13) {
         GL11.glVertex2d(var0 + var4 * Math.sin(var10 * (double)var13), var2 + var4 * Math.cos(0.10471975511965977D * (double)var13));
      }

      GL11.glEnd();
      GL11.glDisable(2848);
      method_1029();
   }

   public static void method_1005(double var0, double var2, double var4, double var6) {
      method_1028();
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 1.0E-4F);
      GL11.glShadeModel(7425);
      method_1024(Color.WHITE);
      GL11.glBegin(6);
      GL11.glVertex2d(var0, var2);

      int var8;
      for(var8 = 0; var8 <= 120; ++var8) {
         method_1024(Color.getHSBColor((float)var8 / 120.0F, 1.0F, 1.0F));
         GL11.glVertex2d(var0 + var4 * Math.sin(0.05235987755982988D * (double)var8), var2 + var4 * Math.cos(0.05235987755982988D * (double)var8));
      }

      GL11.glEnd();
      GL11.glBegin(5);

      for(var8 = 0; var8 <= 121; ++var8) {
         if (var8 % 2 == 1) {
            method_1024(Class_215.method_969(Color.getHSBColor((float)var8 / 120.0F, 1.0F, 1.0F), 0));
            GL11.glVertex2d(var0 + (var4 + var6) * Math.sin(0.05235987755982988D * (double)var8), var2 + (var4 + var6) * Math.cos(0.05235987755982988D * (double)var8));
         } else {
            method_1024(Color.getHSBColor((float)var8 / 120.0F, 1.0F, 1.0F));
            GL11.glVertex2d(var0 + var4 * Math.sin(0.05235987755982988D * (double)var8), var2 + var4 * Math.cos(0.05235987755982988D * (double)var8));
         }
      }

      GL11.glEnd();
      GL11.glShadeModel(7424);
      GL11.glDisable(3008);
      method_1029();
   }

   public static void method_1006(double var0, double var2, double var4, double var6, Color var8) {
      method_1028();
      method_1024(var8);
      GL11.glBegin(7);
      GL11.glVertex2d(var0, var2);
      GL11.glVertex2d(var0 + var4, var2);
      GL11.glVertex2d(var0 + var4, var2 - var6);
      GL11.glVertex2d(var0, var2 - var6);
      GL11.glEnd();
      method_1029();
   }

   public static void method_1007(double var0, double var2, double var4, double var6, Color... var8) {
      method_1028();
      GL11.glShadeModel(7425);
      GL11.glBegin(7);
      method_1024(var8[1]);
      GL11.glVertex2d(var0, var2);
      method_1024(var8[2]);
      GL11.glVertex2d(var0 + var4, var2);
      method_1024(var8[3]);
      GL11.glVertex2d(var0 + var4, var2 - var6);
      method_1024(var8[0]);
      GL11.glVertex2d(var0, var2 - var6);
      GL11.glEnd();
      GL11.glShadeModel(7424);
      method_1029();
   }

   public static void drawRounded(double var0, double var2, double var4, double var6, double var8, Color var10) {
      float[] var11 = Class_215.method_972(var10);
      if (field_1136.method_130()) {
         method_1028();
         field_1136.method_131();
         field_1136.method_133("size", (float)var4 * 2.0F, (float)var6 * 2.0F);
         field_1136.method_133("round", (float)var8 * 2.0F);
         field_1136.method_133("color", var11[0], var11[1], var11[2], var11[3]);
         Class_53.method_137(var0, var2 - var6, var4, var6);
         field_1136.method_132();
         method_1029();
      }
   }

   public static void method_1009(double var0, double var2, double var4, double var6, Vector4f var8, Color var9) {
      float[] var10 = Class_215.method_972(var9);
      if (field_1137.method_130()) {
         method_1028();
         field_1137.method_131();
         field_1137.method_133("size", (float)var4 * 2.0F, (float)var6 * 2.0F);
         field_1137.method_133("round", var8.x() * 2.0F, var8.y() * 2.0F, var8.z() * 2.0F, var8.w() * 2.0F);
         field_1137.method_133("smoothness", 0.0F, 1.5F);
         field_1137.method_133("value", 0.0F);
         field_1137.method_133("color", var10[0], var10[1], var10[2], var10[3]);
         Class_53.method_137(var0, var2, var4, var6);
         field_1137.method_132();
         method_1029();
      }
   }

   public static void drawGradient(double var0, double var2, double var4, double var6, double var8, Color... var10) {
      float[] var11 = Class_215.method_972(var10[0]);
      float[] var12 = Class_215.method_972(var10[1]);
      float[] var13 = Class_215.method_972(var10[2]);
      float[] var14 = Class_215.method_972(var10[3]);
      if (roundedGradientShader.method_130()) {
         method_1028();
         roundedGradientShader.method_131();
         roundedGradientShader.method_133("size", (float)var4 * 2.0F, (float)var6 * 2.0F);
         roundedGradientShader.method_133("round", (float)var8 * 2.0F);
         roundedGradientShader.method_133("color1", var11[0], var11[1], var11[2], var11[3]);
         roundedGradientShader.method_133("color2", var12[0], var12[1], var12[2], var12[3]);
         roundedGradientShader.method_133("color3", var13[0], var13[1], var13[2], var13[3]);
         roundedGradientShader.method_133("color4", var14[0], var14[1], var14[2], var14[3]);
         Class_53.method_137(var0, var2 - var6, var4, var6);
         roundedGradientShader.method_132();
         method_1029();
      }
   }

   public static void drawBlurredRounded(double var0, double var2, double var4, double var6, double var8, float var10, Color var11) {
      float[] var12 = Class_215.method_972(var11);
      if (field_1139.method_130()) {
         method_1028();
         GL11.glEnable(3008);
         GL11.glAlphaFunc(516, 1.0E-4F);
         field_1139.method_131();
         field_1139.method_133("size", (float)(var4 + (double)(2.0F * var10)), (float)(var6 + (double)(2.0F * var10)));
         field_1139.method_133("softness", var10);
         field_1139.method_133("radius", (float)var8);
         field_1139.method_133("color", var12[0], var12[1], var12[2], var12[3]);
         Class_53.method_137(var0 - (double)var10, var2 - var6 - (double)var10, var4 + (double)(var10 * 2.0F), var6 + (double)(var10 * 2.0F));
         field_1139.method_132();
         GL11.glDisable(3008);
         method_1029();
      }
   }

   public static void method_1012(double var0, double var2, double var4, double var6, double var8, float var10, Color... var11) {
      float[] var12 = Class_215.method_972(var11[0]);
      float[] var13 = Class_215.method_972(var11[1]);
      float[] var14 = Class_215.method_972(var11[2]);
      float[] var15 = Class_215.method_972(var11[3]);
      if (field_1140.method_130()) {
         method_1028();
         GL11.glEnable(3008);
         GL11.glAlphaFunc(516, 1.0E-4F);
         field_1140.method_131();
         field_1140.method_133("size", (float)(var4 + (double)(2.0F * var10)), (float)(var6 + (double)(2.0F * var10)));
         field_1140.method_133("softness", var10);
         field_1140.method_133("radius", (float)var8);
         field_1140.method_133("color1", var12[0], var12[1], var12[2], var12[3]);
         field_1140.method_133("color2", var13[0], var13[1], var13[2], var13[3]);
         field_1140.method_133("color3", var14[0], var14[1], var14[2], var14[3]);
         field_1140.method_133("color4", var15[0], var15[1], var15[2], var15[3]);
         Class_53.method_137(var0 - (double)var10, var2 - var6 - (double)var10, var4 + (double)(var10 * 2.0F), var6 + (double)(var10 * 2.0F));
         field_1140.method_132();
         GL11.glDisable(3008);
         method_1029();
      }
   }

   public static void method_1013(double var0, double var2, double var4, double var6, Color var8) {
      drawRounded(var0, var2, var4, var6, 1.5D, var8);
   }

   public static void method_1014(double var0, double var2, double var4, double var6, double var8, float var10, Color var11) {
      float[] var12 = Class_215.method_972(var11);
      if (field_1141.method_130()) {
         method_1028();
         field_1141.method_131();
         field_1141.method_133("size", (float)var4 * 2.0F, (float)var6 * 2.0F);
         field_1141.method_133("round", (float)var8 * 2.0F);
         field_1141.method_133("thickness", var10);
         field_1141.method_133("color", var12[0], var12[1], var12[2], var12[3]);
         Class_53.method_137(var0, var2 - var6, var4, var6);
         field_1141.method_132();
         method_1029();
      }
   }

   public static void method_1015(ResourceLocation var0, double var1, double var3, double var5, double var7, double var9, double var11, double var13, double var15) {
      method_1016(Class_146.method_524(var0), var1, var3, var5, var7, var9, var11, var13, var15);
   }

   public static void method_1016(int var0, double var1, double var3, double var5, double var7, double var9, double var11, double var13, double var15) {
      GlStateManager._enableBlend();
      GlStateManager._blendFunc(770, 771);
      method_1025();
      GlStateManager._bindTexture(var0);
      int var17 = GL11.glGetTexLevelParameteri(3553, 0, 4096);
      int var18 = GL11.glGetTexLevelParameteri(3553, 0, 4097);
      var3 -= var7;
      var9 /= (double)var17;
      var11 /= (double)var18;
      var13 /= (double)var17;
      var15 /= (double)var18;
      GL11.glBegin(7);
      GL11.glTexCoord2d(var9, var11);
      GL11.glVertex2d(var1, var3);
      GL11.glTexCoord2d(var9, var11 + var15);
      GL11.glVertex2d(var1, var3 + var7);
      GL11.glTexCoord2d(var9 + var13, var11 + var15);
      GL11.glVertex2d(var1 + var5, var3 + var7);
      GL11.glTexCoord2d(var9 + var13, var11);
      GL11.glVertex2d(var1 + var5, var3);
      GL11.glEnd();
      GlStateManager._bindTexture(0);
      GlStateManager._disableBlend();
   }

   public static void method_1017(ResourceLocation var0, double var1, double var3, double var5, double var7, double var9, double var11, double var13, double var15, double var17) {
      method_1018(Class_146.method_524(var0), var1, var3, var5, var7, var9, var11, var13, var15, var17);
   }

   public static void method_1018(int var0, double var1, double var3, double var5, double var7, double var9, double var11, double var13, double var15, double var17) {
      GlStateManager._enableBlend();
      GlStateManager._blendFunc(770, 771);
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 0.3F);
      field_1126.getMainRenderTarget().bindWrite(false);
      Class_146.method_525();
      drawRounded(var1, var3, var5, var7, var17, Color.WHITE);
      Class_146.method_526();
      GlStateManager._bindTexture(var0);
      int var19 = GL11.glGetTexLevelParameteri(3553, 0, 4096);
      int var20 = GL11.glGetTexLevelParameteri(3553, 0, 4097);
      var3 -= var7;
      var9 /= (double)var19;
      var11 /= (double)var20;
      var13 /= (double)var19;
      var15 /= (double)var20;
      GL11.glBegin(7);
      GL11.glTexCoord2d(var9, var11);
      GL11.glVertex2d(var1, var3);
      GL11.glTexCoord2d(var9, var11 + var15);
      GL11.glVertex2d(var1, var3 + var7);
      GL11.glTexCoord2d(var9 + var13, var11 + var15);
      GL11.glVertex2d(var1 + var5, var3 + var7);
      GL11.glTexCoord2d(var9 + var13, var11);
      GL11.glVertex2d(var1 + var5, var3);
      GL11.glEnd();
      GlStateManager._bindTexture(0);
      GL11.glDisable(2960);
      GL11.glDisable(3008);
      GlStateManager._disableBlend();
   }

   public static void method_1019(ResourceLocation var0, double var1, double var3, double var5, double var7, double var9) {
      method_1020(Class_146.method_524(var0), var1, var3, var5, var7, var9);
   }

   public static void method_1020(int var0, double var1, double var3, double var5, double var7, double var9) {
      if (field_1142.method_130()) {
         GlStateManager._enableBlend();
         GlStateManager._blendFunc(770, 771);
         method_1025();
         field_1142.method_131();
         field_1142.method_133("size", (float)var5 * 2.0F, (float)var7 * 2.0F);
         field_1142.method_133("round", (float)var9 * 2.0F);
         GlStateManager._bindTexture(var0);
         Class_53.method_137(var1, var3 - var7, var5, var7);
         GlStateManager._bindTexture(0);
         field_1142.method_132();
         GlStateManager._disableBlend();
      }
   }

   public static void method_1021(double var0, double var2, int var4, int var5, int var6, Color var7) {
      GlStateManager._enableBlend();
      GlStateManager._blendFunc(770, 771);
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 1.0E-4F);
      GlStateManager._bindTexture(method_1022(var4, var5, var6));
      var4 += var6 * 2;
      var5 += var6 * 2;
      var0 -= (double)var6;
      var2 -= (double)(var5 - var6);
      method_1024(var7);
      GL11.glBegin(7);
      GL11.glTexCoord2d(0.0D, 1.0D);
      GL11.glVertex2d(var0, var2);
      GL11.glTexCoord2d(0.0D, 0.0D);
      GL11.glVertex2d(var0, var2 + (double)var5);
      GL11.glTexCoord2d(1.0D, 0.0D);
      GL11.glVertex2d(var0 + (double)var4, var2 + (double)var5);
      GL11.glTexCoord2d(1.0D, 1.0D);
      GL11.glVertex2d(var0 + (double)var4, var2);
      GL11.glEnd();
      GlStateManager._bindTexture(0);
      GL11.glDisable(3008);
      GlStateManager._disableBlend();
   }

   public static int method_1022(int var0, int var1, int var2) {
      int var3 = (var0 * 401 + var1) * 407 + var2;
      int var4 = (Integer)field_1128.getOrDefault(var3, -1);
      if (var4 == -1) {
         BufferedImage var5 = new BufferedImage(var0 + var2 * 2, var1 + var2 * 2, 3);
         Graphics var6 = var5.getGraphics();
         var6.setColor(Color.WHITE);
         var6.fillRect(var2, var2, var0, var1);
         var6.dispose();
         Class_83 var7 = new Class_83(var2);
         BufferedImage var8 = var7.method_295(var5, (BufferedImage)null);

         try {
            var4 = Class_146.method_523(var8);
            field_1128.put(var3, var4);
         } catch (Exception var10) {
            var10.hashCode();
         }
      }

      return var4;
   }

   public static void method_1023(double var0, double var2, double var4, double var6, double var8, double var10) {
      GL11.glScissor((int)(var0 * var8), (int)((var10 - var2) * var8), (int)(var4 * var8), (int)(var6 * var8));
   }

   public static void method_1024(Color var0) {
      GL11.glColor4f((float)var0.getRed() / 255.0F, (float)var0.getGreen() / 255.0F, (float)var0.getBlue() / 255.0F, (float)var0.getAlpha() / 255.0F);
   }

   public static void method_1025() {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static void method_1026() {
      GL11.glEnable(3089);
   }

   public static void method_1027() {
      GL11.glDisable(3089);
   }

   public static void method_1028() {
      GlStateManager._disableTexture();
      GlStateManager._enableBlend();
      GlStateManager._blendFunc(770, 771);
   }

   public static void method_1029() {
      GlStateManager._enableTexture();
      GlStateManager._disableBlend();
      method_1025();
   }

   static {
      field_1127 = field_1126.getWindow();
      field_1128 = new HashMap();
      field_1129 = "#version 120\n\nuniform float round;\nuniform vec2 size;\nuniform vec4 color;\n\nfloat alpha(vec2 d, vec2 d1) {\n    vec2 v = abs(d) - d1 + round;\n    return min(max(v.x, v.y), 0.0) + length(max(v, .0f)) - round;\n}\n\nvoid main() {\n    vec2 centre = .5f * size;\n    gl_FragColor = vec4(color.rgb, color.a * (1.f - smoothstep(0.f, 1.5f, alpha(centre - (gl_TexCoord[0].st * size), centre - 1.f))));\n}\n";
      field_1130 = "#version 120\n\nuniform vec2 size;\nuniform vec4 round;\nuniform vec2 smoothness;\nuniform float value;\nuniform vec4 color;\n\nfloat test(vec2 vec_1, vec2 vec_2, vec4 vec_4) {\n    vec_4.xy = (vec_1.x > 0.0) ? vec_4.xy : vec_4.zw;\n    vec_4.x = (vec_1.y > 0.0) ? vec_4.x : vec_4.y;\n    vec2 coords = abs(vec_1) - vec_2 + vec_4.x;\n    return min(max(coords.x, coords.y), 0.0) + length(max(coords, vec2(0.0f))) - vec_4.x;\n}\n\nvoid main() {\n    vec2 st = gl_TexCoord[0].st * size;\n    vec2 halfSize = 0.5 * size;\n    float sa = 1.0 - smoothstep(smoothness.x, smoothness.y, test(halfSize - st, halfSize - value, round));\n    gl_FragColor = mix(vec4(color.rgb, 0.0), vec4(color.rgb, color.a), sa);\n}";
      field_1131 = "#version 120\n\nuniform float round;\nuniform vec2 size;\nuniform vec4 color1;\nuniform vec4 color2;\nuniform vec4 color3;\nuniform vec4 color4;\n\nfloat alpha(vec2 d, vec2 d1) {\n    vec2 v = abs(d) - d1 + round;\n    return min(max(v.x, v.y), 0.0) + length(max(v, .0f)) - round;\n}\n\nvoid main() {\n\t vec2 coords = gl_TexCoord[0].st;\n    vec2 centre = .5f * size;\n    vec4 color = mix(mix(color1, color2, coords.y), mix(color3, color4, coords.y), coords.x);\n    gl_FragColor = vec4(color.rgb, color.a * (1.f- smoothstep(0.f, 1.5f, alpha(centre - (gl_TexCoord[0].st * size), centre - 1.f))));\n}\n";
      field_1132 = "#version 120\n\nuniform float softness;\nuniform float radius;\nuniform vec2 size;\nuniform vec4 color;\n\nfloat alpha(vec2 p, vec2 b) {\n    return length(max(abs(p) - b, .0f)) - radius;\n}\n\nvoid main() {\n    vec2 centre = .5f * size;\n    gl_FragColor = vec4(color.rgb, color.a * (1.f - smoothstep(-softness, softness, alpha(centre - (gl_TexCoord[0].st * size), centre - radius - softness))));\n}\n";
      field_1133 = "#version 120\n\nuniform float softness;\nuniform float radius;\nuniform vec2 size;\nuniform vec4 color1;\nuniform vec4 color2;\nuniform vec4 color3;\nuniform vec4 color4;\n\nfloat alpha(vec2 p, vec2 b) {\n    return length(max(abs(p) - b, .0f)) - radius;\n}\n\nvoid main() {\n    vec2 coords = gl_TexCoord[0].st;\n    vec2 centre = .5f * size;\n    vec4 color = mix(mix(color1, color2, coords.y), mix(color3, color4, coords.y), coords.x);\n    gl_FragColor = vec4(color.rgb, color.a * (1.f - smoothstep(-softness, softness, alpha(centre - (gl_TexCoord[0].st * size), centre - radius - softness))));\n}\n";
      field_1134 = "#version 120\n\nuniform float round;\nuniform float thickness;\nuniform vec2 size;\nuniform vec4 color;\n\nfloat alpha(vec2 d, vec2 d1) {\n\tvec2 v = abs(d) - d1 + round;\n\treturn min(max(v.x, v.y), 0.0) + length(max(v, .0f)) - round;\n}\n\nvoid main() {\n    vec2 centre = .5f * size;\n    vec2 smoothness = vec2(thickness - 1.5f, thickness);\n    gl_FragColor = vec4(color.rgb, color.a * (1.f - smoothstep(smoothness.x, smoothness.y, abs(alpha(centre - (gl_TexCoord[0].st * size), centre - thickness)))));\n}\n";
      field_1135 = "#version 120\n\nuniform float round;\nuniform sampler2D texture;\nuniform vec2 size;\n\nfloat dstfn(vec2 p, vec2 b) {\n    return length(max(abs(p) - b, 0.0)) - round;\n}\n\nvoid main() {\n    vec2 tex = gl_TexCoord[0].st;\n    vec4 smpl = texture2D(texture, tex);\n    vec2 pixel = gl_TexCoord[0].st * size;\n    vec2 centre = 0.5 * size;\n    float sa = 1.f - smoothstep(0.0, 1, dstfn(centre - pixel, centre - round - 1));\n    gl_FragColor = vec4(smpl.rgb, smpl.a * sa);\n}\n";
      field_1136 = new Class_53(field_1129);
      field_1137 = new Class_53(field_1130);
      roundedGradientShader = new Class_53(field_1131);
      field_1139 = new Class_53(field_1132);
      field_1140 = new Class_53(field_1133);
      field_1141 = new Class_53(field_1134);
      field_1142 = new Class_53(field_1135);
   }
}
