package zov.blessed.crack.by.laqwrt;

public class Class_212 {
   public static long method_916(Runnable var0) {
      long var1 = System.nanoTime();
      var0.run();
      long var3 = System.nanoTime() - var1;
      return var3;
   }

   public static void method_917(long... var0) {
      int var1 = method_918(var0);

      for(int var2 = 0; var2 < var0.length; ++var2) {
         long var10000 = var0[var2];
         if (var2 == var1) {
         }

         if (var2 < var0.length - 1) {
         }
      }

   }

   private static int method_918(long[] var0) {
      int var1 = 0;

      for(int var2 = 1; var2 < var0.length; ++var2) {
         if (var0[var2] < var0[var1]) {
            var1 = var2;
         }
      }

      return var1;
   }
}
