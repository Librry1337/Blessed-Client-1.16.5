package zov.blessed.crack.by.laqwrt;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public final class Class_95<A, B> {
   private final A field_651;
   private final B field_652;

   private Class_95(A var1, B var2) {
      this.field_651 = var1;
      this.field_652 = var2;
   }

   public static <A, B> Class_95<A, B> method_318(A var0, B var1) {
      return new Class_95(var0, var1);
   }

   public A method_319() {
      return this.field_651;
   }

   public B method_320() {
      return this.field_652;
   }

   public boolean method_321() {
      return this.field_651 != null;
   }

   public boolean method_322() {
      return this.field_652 != null;
   }

   public <R> R method_323(BiFunction<? super A, ? super B, ? extends R> var1) {
      return var1.apply(this.field_651, this.field_652);
   }

   public void method_324(BiConsumer<? super A, ? super B> var1) {
      var1.accept(this.field_651, this.field_652);
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.field_651, this.field_652});
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         Class_95 var2 = (Class_95)var1;
         return Objects.equals(this.field_651, var2.field_651) && Objects.equals(this.field_652, var2.field_652);
      }
   }

   public String toString() {
      return "Pair [a=" + this.field_651 + ", b=" + this.field_652 + "]";
   }
}
