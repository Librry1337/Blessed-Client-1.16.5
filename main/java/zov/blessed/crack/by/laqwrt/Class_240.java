package zov.blessed.crack.by.laqwrt;

import java.nio.charset.StandardCharsets;

public class Class_240 {
   private static final byte[] field_1186;

   public static String method_1105(byte[] var0) {
      byte[] var1 = new byte[var0.length * 2];

      for(int var2 = 0; var2 < var0.length; ++var2) {
         int var3 = var0[var2] & 255;
         var1[var2 * 2] = field_1186[var3 >>> 4];
         var1[var2 * 2 + 1] = field_1186[var3 & 15];
      }

      return new String(var1, StandardCharsets.UTF_8);
   }

   static {
      field_1186 = "0123456789abcdef".getBytes(StandardCharsets.US_ASCII);
   }
}
