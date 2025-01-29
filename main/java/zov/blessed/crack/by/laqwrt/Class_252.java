package zov.blessed.crack.by.laqwrt;

import zov.blessed.crack.by.laqwrt.govno.Class_213;
import zov.blessed.crack.by.laqwrt.govno.Class_262;

import java.util.Map;

public class Class_252 extends Class_228 {
   private Class_262 field_1202;

   public Class_252() {
      super(-1);
   }

   public Class_252(Class_262 var1) {
      super(-1);
      this.field_1202 = var1;
   }

   public int いい() {
      return 8;
   }

   public Class_262 method_1140() {
      if (this.field_1202 == null) {
         this.field_1202 = new Class_262();
      }

      return this.field_1202;
   }

   public void よう(Class_213 var1) {
      var1.method_938(this.method_1140());
   }

   public Class_228 ユえ(Map<Class_252, Class_252> var1) {
      return (Class_228)var1.get(this);
   }

   public void method_1141() {
      this.field_1202 = null;
   }
}
