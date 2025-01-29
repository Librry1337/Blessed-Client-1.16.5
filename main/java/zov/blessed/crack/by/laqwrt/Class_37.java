package zov.blessed.crack.by.laqwrt;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Class_37 {
   private static final AtomicInteger field_156 = new AtomicInteger();
   private static final HashMap<Integer, Object> field_157 = new HashMap();
   private static final Class_147 field_158;

   public static <T> void method_62(Class_147 var0, Consumer<T> var1) {
      method_65(Class_78.ケらト, var0, var1);
   }

   public static <T, T2> void method_63(Class_147 var0, BiConsumer<T, T2> var1, Class<?>... var2) {
      method_65(Class_78.サとひ, var0, var1, var2);
   }

   public static <T> void method_64(Class_147 var0, Consumer<T> var1) {
      method_65(Class_78.コヌこ, var0, var1);
   }

   private static <T> void method_65(Class_78 var0, Class_147 var1, Object var2, Class<?>... var3) {
      int var4 = method_67();
      field_157.put(var4, var2);
      var0.getInjector().method_973(var1, var4, var3);
   }

   public static void method_66(int var0, Object var1, Object... var2) {
      Object var3 = field_157.get(var0);
      if (var3 instanceof Consumer) {
         ((Consumer)var3).accept(var1);
      } else if (var3 instanceof BiConsumer) {
         ((BiConsumer)var3).accept(var1, var2[0]);
      }

   }

   private static int method_67() {
      return field_156.getAndIncrement();
   }

   // $FF: synthetic method
   static Class_147 method_68() {
      return field_158;
   }

   static {
      field_158 = Class_214.method_957(Class_37.class, Integer.TYPE, Object.class, Object[].class);
   }
}
