package zov.blessed.crack.by.laqwrt;

import zov.blessed.crack.by.laqwrt.govno.Class_213;

import java.util.Map;

public class Class_210 extends Class_228 {
   public int field_1081;
   public Class_252 field_1082;

   public Class_210(int var1, Class_252 var2) {
      super(-1);
      this.field_1081 = var1;
      this.field_1082 = var2;
   }

   public int いい() {
      return 15;
   }

   public void よう(Class_213 var1) {
      var1.method_949(this.field_1081, this.field_1082.method_1140());
   }

   public Class_228 ユえ(Map<Class_252, Class_252> var1) {
      return new Class_210(this.field_1081, method_1036(this.field_1082, var1));
   }
}
