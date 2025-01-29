package zov.blessed.crack.by.laqwrt;

import java.lang.reflect.Modifier;
import java.util.function.Consumer;

public abstract class Class_216 {
   private final Class_147 field_1112;

   public Class_216(Class_147 var1) {
      this.field_1112 = var1;
   }

   public void method_973(Class_147 var1, int var2, Class<?>... var3) {
     // Class_23 var4 = Class_174.method_723(var1.method_531());
 //     Class_211 var5 = Class_174.method_724(var4, var1.method_535());
    //  this.むユ1(var5, var2, var3);
   //   Class_174.method_720(var1.method_531(), var4);
   }

   public abstract void むユ1(Class_211 var1, int var2, Class<?>... var3);

   public Class_135 method_974(Class_211 var1, int var2) {
      return this.method_975(var1, var2, (Consumer)null);
   }

   public Class_135 method_975(Class_211 var1, int var2, Consumer<Class_135> var3) {
      return (Class_135)Class_138.method_443(new Class_135(), (var4) -> {
         var4.add((Class_228)(new Class_180(var2)));
         boolean var5 = Modifier.isStatic(var1.field_1083);
         if (!var5) {
            var4.add((Class_228)(new Class_157(25, 0)));
         } else {
            var4.add((Class_228)(new Class_159(1)));
         }

         if (var3 != null) {
            var3.accept(var4);
         } else {
            var4.add((Class_228)(new Class_159(3)));
            var4.add((Class_228)(new Class_204(189, "java/lang/Object")));
         }

         var4.add((Class_228)(new Class_207(184, this.field_1112.method_532(), this.field_1112.method_533(), this.field_1112.method_530(), false)));
      });
   }

   public Class_147 method_976() {
      return this.field_1112;
   }
}
