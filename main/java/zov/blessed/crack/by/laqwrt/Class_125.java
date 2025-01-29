package zov.blessed.crack.by.laqwrt;

import zov.blessed.crack.by.laqwrt.govno.Class_213;

import java.util.Map;

public class Class_125 extends Class_228 {
   public Class_252 field_699;

   public Class_125(int var1, Class_252 var2) {
      super(var1);
      this.field_699 = var2;
   }

   public void method_402(int var1) {
      this.field_1166 = var1;
   }

   public int いい() {
      return 7;
   }

   public void よう(Class_213 var1) {
      var1.method_937(this.field_1166, this.field_699.method_1140());
      this.method_1035(var1);
   }

   public Class_228 ユえ(Map<Class_252, Class_252> var1) {
      return (new Class_125(this.field_1166, method_1036(this.field_699, var1))).method_1038(this);
   }
}
