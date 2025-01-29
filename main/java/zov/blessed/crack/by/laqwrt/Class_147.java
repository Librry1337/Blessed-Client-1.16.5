package zov.blessed.crack.by.laqwrt;

import zov.blessed.crack.by.laqwrt.govno.Class_260;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class_147 {
   private final Method field_756;

   public Class_147(Method var1) {
      this.field_756 = var1;
   }

   public <T> T method_528(Object... var1) {
      return this.method_529((Object)null, var1);
   }

   public <T> T method_529(Object var1, Object... var2) {
      try {
         return (T) this.field_756.invoke(var1, var2);
      } catch (IllegalArgumentException | InvocationTargetException | IllegalAccessException var4) {
         var4.hashCode();
         return null;
      }
   }

   public String method_530() {
      return Class_260.method_1211(this.field_756);
   }

   public Class<?> method_531() {
      return this.field_756.getDeclaringClass();
   }

   public String method_532() {
      return this.field_756.getDeclaringClass().getName().replace(".", "/");
   }

   public String method_533() {
      return this.field_756.getName();
   }

   public Class_147 method_534() {
      this.field_756.setAccessible(true);
      return this;
   }

   public Method method_535() {
      return this.field_756;
   }

   public String toString() {
      return "RefMethod(" + this.field_756.toString() + ")";
   }
}
