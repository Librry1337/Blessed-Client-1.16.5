package zov.blessed.crack.by.laqwrt;

import java.nio.charset.StandardCharsets;

public class Class_195 {
   private static final byte[] field_1039;
   private static final int[] field_1040;
   private byte[] field_1041;

   public Class_195(byte[] var1) {
      this.field_1041 = var1;
   }

   public static Class_195 method_857(String var0) {
      return method_858(var0.getBytes(StandardCharsets.UTF_8));
   }

   public static Class_195 method_858(byte[] var0) {
      boolean var1 = false;
      int var2 = 0;
      int var3 = var0.length;
      int var4 = 0;
      int var5 = var3 % 3 == 0 ? var3 * 4 / 3 : 4 - var3 % 3 + var3 * 4 / 3;
      byte[] var6 = new byte[var5];
      var6[var5 - 1] = field_1039[field_1039.length - 1];

      int var7;
      for(var6[var5 - 2] = field_1039[field_1039.length - 1]; var3 >= 3; var3 -= 3) {
         var7 = (var0[var2++] & 255) << 16 | (var0[var2++] & 255) << 8 | var0[var2++] & 255;
         var6[var4++] = field_1039[var7 >> 18 & 63];
         var6[var4++] = field_1039[var7 >> 12 & 63];
         var6[var4++] = field_1039[var7 >> 6 & 63];
         var6[var4++] = field_1039[var7 & 63];
      }

      switch(var3) {
      case 1:
         var7 = (var0[var2] & 255) << 16;
         var6[var4++] = field_1039[var7 >> 18 & 63];
         var6[var4] = field_1039[var7 >> 12 & 63];
         break;
      case 2:
         var7 = (var0[var2++] & 255) << 16 | (var0[var2] & 255) << 8;
         var6[var4++] = field_1039[var7 >> 18 & 63];
         var6[var4++] = field_1039[var7 >> 12 & 63];
         var6[var4] = field_1039[var7 >> 6 & 63];
      }

      return new Class_195(var6);
   }

   public static Class_195 method_859(String var0) {
      return method_860(var0.getBytes(StandardCharsets.UTF_8));
   }

   public static Class_195 method_860(byte[] var0) {
      boolean var1 = false;
      int var2 = 0;
      int var3 = var0.length;
      int var4 = 0;
      int var5 = var3 * 3 / 4;
      if (var3 % 2 == 0) {
         if (method_861(var0, "==".getBytes())) {
            var5 -= 2;
            var3 -= 2;
         } else if (method_861(var0, "=".getBytes())) {
            --var5;
            --var3;
         }
      }

      byte[] var6;
      int var7;
      for(var6 = new byte[var5]; var3 >= 4; var3 -= 4) {
         var7 = field_1040[var0[var2++]] << 18 | field_1040[var0[var2++]] << 12 | field_1040[var0[var2++]] << 6 | field_1040[var0[var2++]];
         var6[var4++] = (byte)(var7 >> 16);
         var6[var4++] = (byte)(var7 >> 8);
         var6[var4++] = (byte)var7;
      }

      switch(var5 - var4) {
      case 1:
         var7 = field_1040[var0[var2++]] << 18 | field_1040[var0[var2]] << 12;
         var6[var4] = (byte)(var7 >> 16);
         break;
      case 2:
         var7 = field_1040[var0[var2++]] << 18 | field_1040[var0[var2++]] << 12 | field_1040[var0[var2]] << 6;
         var6[var4++] = (byte)(var7 >> 16);
         var6[var4] = (byte)(var7 >> 8);
      }

      return new Class_195(var6);
   }

   private static boolean method_861(byte[] var0, byte[] var1) {
      if (var1.length > var0.length) {
         return false;
      } else {
         int var2 = var0.length - var1.length;
         int var3 = 0;
         int var4 = var1.length;

         do {
            --var4;
            if (var4 < 0) {
               return true;
            }
         } while(var0[var2++] == var1[var3++]);

         return false;
      }
   }

   public byte[] method_862() {
      return this.field_1041;
   }

   public String toString() {
      return new String(this.field_1041, StandardCharsets.UTF_8);
   }

   public String method_863() {
      return Class_240.method_1105(this.field_1041);
   }

   static {
      field_1039 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".getBytes(StandardCharsets.US_ASCII);
      field_1040 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, 0, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
   }
}
