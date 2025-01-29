package zov.blessed.crack.by.laqwrt;

import zov.blessed.crack.by.laqwrt.govno.Class_213;

import java.util.List;

public class Class_271 {
   public Class_252 field_1291;
   public Class_252 field_1292;
   public Class_252 field_1293;
   public String field_1294;
   public List<Class_273> field_1295;
   public List<Class_273> field_1296;

   public Class_271(Class_252 var1, Class_252 var2, Class_252 var3, String var4) {
      this.field_1291 = var1;
      this.field_1292 = var2;
      this.field_1293 = var3;
      this.field_1294 = var4;
   }

   public void method_1247(int var1) {
      int var2 = 1107296256 | var1 << 8;
      int var3;
      int var4;
      if (this.field_1295 != null) {
         var3 = 0;

         for(var4 = this.field_1295.size(); var3 < var4; ++var3) {
            ((Class_273)this.field_1295.get(var3)).field_1301 = var2;
         }
      }

      if (this.field_1296 != null) {
         var3 = 0;

         for(var4 = this.field_1296.size(); var3 < var4; ++var3) {
            ((Class_273)this.field_1296.get(var3)).field_1301 = var2;
         }
      }

   }

   public void method_1248(Class_213 var1) {
      var1.method_945(this.field_1291.method_1140(), this.field_1292.method_1140(), this.field_1293 == null ? null : this.field_1293.method_1140(), this.field_1294);
      int var2;
      int var3;
      Class_273 var4;
      if (this.field_1295 != null) {
         var2 = 0;

         for(var3 = this.field_1295.size(); var2 < var3; ++var2) {
            var4 = (Class_273)this.field_1295.get(var2);
            var4.method_440(var1.method_946(var4.field_1301, var4.field_1302, var4.field_712, true));
         }
      }

      if (this.field_1296 != null) {
         var2 = 0;

         for(var3 = this.field_1296.size(); var2 < var3; ++var2) {
            var4 = (Class_273)this.field_1296.get(var2);
            var4.method_440(var1.method_946(var4.field_1301, var4.field_1302, var4.field_712, false));
         }
      }

   }
}
