package zov.blessed.crack.by.laqwrt;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Class_138 {
   public static <T> T method_442(Supplier<T> var0) {
      return var0.get();
   }

   public static <T> T method_443(T var0, Consumer<T> var1) {
      var1.accept(var0);
      return var0;
   }
}
