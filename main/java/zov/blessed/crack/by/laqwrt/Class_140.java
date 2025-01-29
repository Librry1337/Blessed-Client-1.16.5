package zov.blessed.crack.by.laqwrt;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Class_140 {
   public enum Class_84 {
      くんはきスラえキ(4, 1.5707963267948966D),
      けユキカてわネほ(4, 3.141592653589793D),
      ことヌほニトよオ(4, 4.71238898038469D),
      さメりタまテても(4, 0.0D),
      しきらううこモテ(2, 1.5707963267948966D),
      すヤホカスセカほ(2, 3.141592653589793D),
      せニひコはそスき(2, 4.71238898038469D),
      そヤトヨホクくか(2, 0.0D);

      private int たほトすトえエキ;
      private double ちシキうウあニき;

      private Class_84(int var3, double var4) {
         this.たほトすトえエキ = var3;
         this.ちシキうウあニき = var4;
      }

      // $FF: synthetic method
      static int access$000(Class_84 var0) {
         return var0.たほトすトえエキ;
      }

      // $FF: synthetic method
      static double access$100(Class_84 var0) {
         return var0.ちシキうウあニき;
      }
   }

   public static <T, R> void method_448(List<T> var0, Consumer<Object> var1) {
      Object[] var2 = var0.toArray();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Object var4 = var2[var3];
         var1.accept(var4);
      }

   }

   public static <T, R> void method_449(T[] var0, Consumer<? super T> var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         var1.accept(var0[var2]);
      }

   }

   public static <T, R> void method_450(List<T> var0, Consumer<Object> var1) {
      Object[] var2 = var0.toArray();

      for(int var3 = var2.length - 1; var3 >= 0; --var3) {
         Object var4 = var2[var3];
         var1.accept(var4);
      }

   }

   public static <T, R> void method_451(T[] var0, Consumer<? super T> var1) {
      for(int var2 = var0.length; var2 >= 0; --var2) {
         var1.accept(var0[var2]);
      }

   }

   public static <T, R> T method_452(List<T> var0, Object var1, Function<T, R> var2) {
      Object[] var3 = var0.toArray();

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Object var5 = var3[var4];
         if (var2.apply((T) var5).equals(var1)) {
            return (T) var5;
         }
      }

      return null;
   }

   public static <T> T method_453(List<T> var0, Predicate<T> var1) {
      Object[] var2 = var0.toArray();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Object var4 = var2[var3];
         if (var1.test((T) var4)) {
            return (T) var4;
         }
      }

      return null;
   }

   public static <T, T2, R> T method_454(List<T> var0, Object var1) {
      Object[] var2 = var0.toArray();

       for (Object var4 : var2) {
           if (var4.equals(var1)) {
               return (T) var4;
           }
       }

      return null;
   }

   public static <T> T method_455(T[] var0, Predicate<T> var1) {
       for (Object var3 : var0) {
           if (var1.test((T) var3)) {
               return (T) var3;
           }
       }

      return null;
   }

   public static <T, T2, R> T method_456(T[] var0, Object var1, Function<T, R> var2) {
       for (Object var4 : var0) {
           if (var2.apply((T) var4).equals(var1)) {
               return (T) var4;
           }
       }

      return null;
   }

   public static <T, T2, R> T method_457(T[] var0, Object var1) {
       for (Object var3 : var0) {
           if (var3.equals(var1)) {
               return (T) var3;
           }
       }

      return null;
   }

   public static <T, T2, R> int method_458(List<T> var0, Object var1, Function<T, R> var2) {
      Object[] var3 = var0.toArray();
      int var4 = 0;

       for (Object var6 : var3) {
           if (var2.apply((T) var6).equals(var1)) {
               ++var4;
           }
       }

      return var4;
   }

   public static <T, T2, R> int method_459(List<T> var0, Object var1) {
      Object[] var2 = var0.toArray();
      int var3 = 0;

       for (Object var5 : var2) {
           if (var5.equals(var1)) {
               ++var3;
           }
       }

      return var3;
   }

   public static <T, T2, R> int method_460(T[] var0, Object var1, Function<T, R> var2) {
      int var3 = 0;

       for (T t : var0) {
           if (var2.apply(t).equals(var1)) {
               ++var3;
           }
       }

      return var3;
   }

   public static <T, T2, R> int method_461(T[] var0, Object var1) {
      int var2 = 0;

       for (T t : var0) {
           if (t.equals(var1)) {
               ++var2;
           }
       }

      return var2;
   }

   public static <T, T2, R> boolean method_462(List<T> var0, Object var1, Function<T, R> var2) {
      Object[] var3 = var0.toArray();

       for (Object var5 : var3) {
           if (var2.apply((T) var5).equals(var1)) {
               return true;
           }
       }

      return false;
   }

   public static <T, T2, R> boolean method_463(List<T> var0, Object var1) {
      Object[] var2 = var0.toArray();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Object var4 = var2[var3];
         if (var4.equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public static <T, T2, R> boolean method_464(T[] var0, Object var1, Function<T, R> var2) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         if (var2.apply(var0[var3]).equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public static <T, T2, R> boolean method_465(T[] var0, Object var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         if (var0[var2].equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public static <T> T[] method_466(T[] var0, T var1) {
      var0 = Arrays.copyOf(var0, var0.length + 1);
      var0[var0.length - 1] = var1;
      return var0;
   }

   public static <T> T[] method_467(T[] var0, int var1, T var2) {
      if (var1 > var0.length) {
         return var0;
      } else {
         var0 = Arrays.copyOf(var0, var0.length + 1);
         System.arraycopy(var0, var1, var0, var1 + 1, var0.length - var1 - 1);
         var0[var1] = var2;
         return var0;
      }
   }

   public static <T> T[] method_468(T[] var0, T var1) {
      int var2 = method_470(var0, var1);
      var0 = method_469(var0, var2);
      return var0;
   }

   public static <T> T[] method_469(T[] var0, int var1) {
      int var2 = var0.length - var1 - 1;
      System.arraycopy(var0, var1 + 1, var0, var1, var2);
      var0 = Arrays.copyOf(var0, var0.length - 1);
      return var0;
   }

   public static <T> int method_470(T[] var0, T var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         if (var0[var2].equals(var1)) {
            return var2;
         }
      }

      return -1;
   }

   public static <T> int method_471(byte[] var0, byte var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         if (var0[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   public static <T> T[] method_472(T[] var0) {
      Random var1 = new Random();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         int var3 = var1.nextInt(var0.length);
         Object var4 = var0[var3];
         var0[var3] = var0[var2];
         var0[var2] = (T) var4;
      }

      return var0;
   }

   public static <T> void method_473(List<T> var0) {
      Random var1 = new Random();

      for(int var2 = 0; var2 < var0.size(); ++var2) {
         int var3 = var1.nextInt(var0.size());
         Object var4 = var0.get(var3);
         var0.set(var3, var0.get(var2));
         var0.set(var2, (T) var4);
      }

   }

   public static <T> void method_474(T[] var0) {
      int var1 = 0;

      for(int var2 = var0.length - 1; var2 > var1; ++var1) {
         Object var3 = var0[var2];
         var0[var2] = var0[var1];
         var0[var1] = (T) var3;
         --var2;
      }

   }

   public static <T> void method_475(List<T> var0) {
      int var1 = 0;

      for(int var2 = var0.size() - 1; var2 > var1; ++var1) {
         Object var3 = var0.get(var2);
         var0.set(var2, var0.get(var1));
         var0.set(var1, (T) var3);
         --var2;
      }

   }

   public static <T> T method_476(T[] var0, Function<T, Integer> var1) {
      if (var0.length == 0) {
         return null;
      } else {
         Object var2 = var0[0];
         int var3 = (Integer)var1.apply(var0[0]);

         for(int var4 = 1; var4 < var0.length; ++var4) {
            Object var5 = var0[var4];
            int var6 = (Integer)var1.apply((T) var5);
            if (var6 > var3) {
               var3 = var6;
               var2 = var5;
            }
         }

         return (T) var2;
      }
   }

   public static <T> T method_477(T[] var0, Function<T, Integer> var1) {
      if (var0.length == 0) {
         return null;
      } else {
         Object var2 = var0[0];
         int var3 = (Integer)var1.apply(var0[0]);

         for(int var4 = 1; var4 < var0.length; ++var4) {
            Object var5 = var0[var4];
            int var6 = (Integer)var1.apply((T) var5);
            if (var6 < var3) {
               var3 = var6;
               var2 = var5;
            }
         }

         return (T) var2;
      }
   }

   public static <T> T[] method_478(T[] var0, T[] var1) {
      Object[] var2 = Arrays.copyOf(var0, var0.length + var1.length);
      System.arraycopy(var1, 0, var2, var0.length, var1.length);
      return (T[]) var2;
   }

   public static <T> void method_479(List<T> var0, Comparator<? super T> var1) {
      var0.sort(var1);
   }

   public static <T> void method_480(T[] var0, Comparator<? super T> var1) {
      Arrays.sort(var0, var1);
   }

   /** @deprecated */
   @Deprecated
   public static void method_481(List<?> var0, int var1, int var2) {
      Collections.rotate(var0.subList(var1 < var2 ? var1 : var2, (var2 > var1 ? var2 : var1) + 1), var1 > var2 ? 1 : -1);
   }
}
