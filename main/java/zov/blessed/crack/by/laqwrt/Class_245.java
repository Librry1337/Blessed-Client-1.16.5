package zov.blessed.crack.by.laqwrt;

import io.netty.util.ResourceLeakDetector;
import io.netty.util.ResourceLeakDetector.Level;

public class Class_245 {
   public static final Level field_1195;
   public static final char[] field_1196;
   public static final char[] field_1197;

   public static boolean method_1131(char var0) {
      return var0 != 167 && var0 >= ' ' && var0 != 127;
   }

   public static String method_1132(String var0) {
      StringBuilder var1 = new StringBuilder();
      char[] var2 = var0.toCharArray();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         char var5 = var2[var4];
         if (method_1131(var5)) {
            var1.append(var5);
         }
      }

      return var1.toString();
   }

   static {
      field_1195 = Level.DISABLED;
      field_1196 = new char[]{'.', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '"'};
      field_1197 = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '"', ':'};
      if (System.getProperty("io.netty.leakDetection.level") == null) {
         ResourceLeakDetector.setLevel(field_1195);
      }

   }
}
