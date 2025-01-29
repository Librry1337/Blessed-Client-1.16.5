package zov.blessed.crack.by.laqwrt;

import java.awt.Color;

public class Class_215 {
   public static Color method_969(Color var0, int var1) {
      return new Color(var0.getRed(), var0.getGreen(), var0.getBlue(), var1);
   }

   public static Color method_970(Color var0, float var1) {
      return new Color(var0.getRed(), var0.getGreen(), var0.getBlue(), (int)(var1 * 255.0F));
   }

   public static Color method_971(int var0) {
      int var1 = var0 >> 16 & 255;
      int var2 = var0 >> 8 & 255;
      int var3 = var0 & 255;
      int var4 = var0 >> 24 & 255;
      return new Color(var1, var2, var3, var4);
   }

   public static float[] method_972(Color var0) {
      return new float[]{(float)var0.getRed() / 255.0F, (float)var0.getGreen() / 255.0F, (float)var0.getBlue() / 255.0F, (float)var0.getAlpha() / 255.0F};
   }
}
