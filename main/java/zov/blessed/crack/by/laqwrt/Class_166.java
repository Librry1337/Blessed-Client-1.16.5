package zov.blessed.crack.by.laqwrt;

import java.util.ArrayList;
import java.util.List;

final class Class_166 {
   private Class_166() {
   }

   static <T> List<T> method_639(List<T> var0, T var1) {
      Object var2 = var0 == null ? new ArrayList<>(1) : var0;
      ((List)var2).add(var1);
      return (List)var2;
   }

   static <T> List<T> method_640(int var0) {
      ArrayList var1 = new ArrayList<>(var0);

      for(int var2 = 0; var2 < var0; ++var2) {
         var1.add((Object)null);
      }

      return var1;
   }

   static <T> List<T> method_641(T[] var0) {
      if (var0 == null) {
         return new ArrayList<>();
      } else {
         ArrayList var1 = new ArrayList<>(var0.length);
         Object[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            Object var5 = var2[var4];
            var1.add(var5);
         }

         return var1;
      }
   }

   static List<Byte> method_642(byte[] var0) {
      if (var0 == null) {
         return new ArrayList<>();
      } else {
         ArrayList var1 = new ArrayList<>(var0.length);
         byte[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            byte var5 = var2[var4];
            var1.add(var5);
         }

         return var1;
      }
   }

   static List<Boolean> method_643(boolean[] var0) {
      if (var0 == null) {
         return new ArrayList<>();
      } else {
         ArrayList var1 = new ArrayList<>(var0.length);
         boolean[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            boolean var5 = var2[var4];
            var1.add(var5);
         }

         return var1;
      }
   }

   static List<Short> method_644(short[] var0) {
      if (var0 == null) {
         return new ArrayList<>();
      } else {
         ArrayList var1 = new ArrayList<>(var0.length);
         short[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            short var5 = var2[var4];
            var1.add(var5);
         }

         return var1;
      }
   }

   static List<Character> method_645(char[] var0) {
      if (var0 == null) {
         return new ArrayList<>();
      } else {
         ArrayList var1 = new ArrayList<>(var0.length);
         char[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            char var5 = var2[var4];
            var1.add(var5);
         }

         return var1;
      }
   }

   static List<Integer> method_646(int[] var0) {
      if (var0 == null) {
         return new ArrayList<>();
      } else {
         ArrayList var1 = new ArrayList<>(var0.length);
         int[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            int var5 = var2[var4];
            var1.add(var5);
         }

         return var1;
      }
   }

   static List<Float> method_647(float[] var0) {
      if (var0 == null) {
         return new ArrayList<>();
      } else {
         ArrayList var1 = new ArrayList<>(var0.length);
         float[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            float var5 = var2[var4];
            var1.add(var5);
         }

         return var1;
      }
   }

   static List<Long> method_648(long[] var0) {
      if (var0 == null) {
         return new ArrayList<>();
      } else {
         ArrayList var1 = new ArrayList<>(var0.length);
         long[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            long var5 = var2[var4];
            var1.add(var5);
         }

         return var1;
      }
   }

   static List<Double> method_649(double[] var0) {
      if (var0 == null) {
         return new ArrayList<>();
      } else {
         ArrayList var1 = new ArrayList<>(var0.length);
         double[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            double var5 = var2[var4];
            var1.add(var5);
         }

         return var1;
      }
   }

   static <T> List<T> method_650(int var0, T[] var1) {
      ArrayList var2 = new ArrayList<>(var0);

      for(int var3 = 0; var3 < var0; ++var3) {
         var2.add(var1[var3]);
      }

      return var2;
   }
}
