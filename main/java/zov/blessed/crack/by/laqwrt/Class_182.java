package zov.blessed.crack.by.laqwrt;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Function;

/** @deprecated */
@Deprecated
public class Class_182 {
   private static final HashMap<Integer, Function<Object, Integer>> field_969 = new HashMap();
   private static final HashSet<Class<?>> field_970 = new HashSet();

   public static void method_763(Method var0, Function<Object, Integer> var1) {
   }

   public static void method_764(Method var0, Function<Object, Integer> var1) {
   }

   private static void method_765(Function<Object, Integer> var0, Method var1, Function<Object, Integer> var2) {
      Class var3 = var1.getDeclaringClass();
      if (field_970.add(var3)) {
      }

      int var4 = (Integer)var0.apply(var1);
      field_969.put(var4, var2);
   }

   public static void method_766(int var0, Object var1) {
      int var2 = (Integer)((Function)field_969.get(var0)).apply(var1);
   }
}
