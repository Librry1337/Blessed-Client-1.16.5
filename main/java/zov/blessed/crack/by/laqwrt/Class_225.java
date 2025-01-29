package zov.blessed.crack.by.laqwrt;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Class_225 {
   private static Field field_1124;
   private final Field field_1125;

   public Class_225(Field var1) {
      this.field_1125 = var1;
   }

   public <T> T method_991() {
      return this.method_992((Object)null);
   }

   public <T> T method_992(Object var1) {
      try {
         return (T) this.field_1125.get(var1);
      } catch (IllegalAccessException | IllegalArgumentException var3) {
         var3.hashCode();
         return null;
      }
   }

   public void method_993(Object var1) {
      this.method_994((Object)null, var1);
   }

   public void method_994(Object var1, Object var2) {
      try {
         this.field_1125.set(var1, var2);
      } catch (IllegalAccessException | IllegalArgumentException var4) {
         var4.hashCode();
      }

   }

   public Class_225 method_995() {
      this.field_1125.setAccessible(true);
      return this;
   }

   public Class_225 method_996() {
      int var1 = this.field_1125.getModifiers();
      if (Modifier.isFinal(var1)) {
         if (field_1124 == null) {
            try {
               field_1124 = Field.class.getDeclaredField("modifiers");
               field_1124.setAccessible(true);
            } catch (SecurityException | NoSuchFieldException var4) {
               var4.hashCode();
            }
         }

         try {
            field_1124.setInt(this.field_1125, var1 & -17);
         } catch (IllegalAccessException var3) {
            var3.hashCode();
         }
      }

      return this;
   }

   public Field method_997() {
      return this.field_1125;
   }

   public String toString() {
      return "RefField(" + this.field_1125 + ")";
   }
}
