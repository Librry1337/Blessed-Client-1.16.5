package zov.blessed.crack.by.laqwrt;

import java.util.function.Function;

public enum Class_78 {
   ケらト(0, Class_251::new),
   コヌこ(1, Class_177::new),
   サとひ(2, Class_266::new);

   private final int シきく;
   private final Class_216 スらエ;

   private Class_78(int var3, Function<Class_147, Class_216> var4) {
      this.シきく = var3;
      this.スらエ = (Class_216)var4.apply(Class_37.method_68());
   }

   public int getId() {
      return this.シきく;
   }

   public Class_216 getInjector() {
      return this.スらエ;
   }
}
