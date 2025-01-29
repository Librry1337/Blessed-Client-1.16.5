package zov.blessed.crack.by.laqwrt;

public class Class_200 {
   public static double method_889(int[] var0) {
      double var1 = 0.0D;
      int[] var3 = var0;
      int var4 = var0.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = var3[var5];
         var1 += (double)var6;
      }

      return var1 / (double)var0.length;
   }

   public static int method_890(int var0, int var1, double var2) {
      if (var2 > 1.0D) {
         var2 = 1.0D;
      } else if (var2 < 0.0D) {
         var2 = 0.0D;
      }

      double var4 = 1.0D - var2;
      if (var2 == 0.0D) {
         return var0;
      } else if (var2 == 1.0D) {
         return var1;
      } else {
         int var6 = var0 >> 24 & 255;
         int var7 = (var0 & 16711680) >> 16;
         int var8 = (var0 & '\uff00') >> 8;
         int var9 = var0 & 255;
         int var10 = var1 >> 24 & 255;
         int var11 = (var1 & 16711680) >> 16;
         int var12 = (var1 & '\uff00') >> 8;
         int var13 = var1 & 255;
         int var14 = (int)((double)var6 * var4 + (double)var10 * var2);
         int var15 = (int)((double)var7 * var4 + (double)var11 * var2);
         int var16 = (int)((double)var8 * var4 + (double)var12 * var2);
         int var17 = (int)((double)var9 * var4 + (double)var13 * var2);
         return Class_103.method_360(var15, var16, var17, var14);
      }
   }
}
