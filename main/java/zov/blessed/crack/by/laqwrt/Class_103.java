package zov.blessed.crack.by.laqwrt;

import java.util.Arrays;

public class Class_103 {
   public static int method_360(int var0, int var1, int var2, int var3) {
      return var3 << 24 | var0 << 16 | var1 << 8 | var2;
   }

   public static int method_361(int var0, int var1, int var2) {
      return -16777216 | var0 << 16 | var1 << 8 | var2;
   }

   public static int[] method_362(int var0) {
      return new int[]{method_366(var0), method_367(var0), method_368(var0), method_365(var0)};
   }

   public static float[] method_363(int var0) {
      return new float[]{(float)method_366(var0) / 255.0F, (float)method_367(var0) / 255.0F, (float)method_368(var0) / 255.0F, (float)method_365(var0) / 255.0F};
   }

   public static int method_364(int var0, int var1) {
      return var1 << 24 | var0 & 16777215;
   }

   public static int method_365(int var0) {
      return var0 >>> 24;
   }

   public static int method_366(int var0) {
      return var0 >> 16 & 255;
   }

   public static int method_367(int var0) {
      return var0 >> 8 & 255;
   }

   public static int method_368(int var0) {
      return var0 & 255;
   }

   public static String method_369(int var0) {
      return String.format("%08x", var0);
   }

   public static int method_370(String var0) {
      return Integer.parseInt(var0, 16);
   }

   public static String method_371(int var0) {
      int[] var1 = method_362(var0);
      return Arrays.toString(var1);
   }

   public static String method_372(int var0) {
      StringBuilder var1 = new StringBuilder();
      var1.append("0x");
      var1.append(method_369(var0));
      var1.append(" | ");
      var1.append(method_371(var0));
      var1.append(" | ");
      var1.append(var0);
      return var1.toString();
   }
}
