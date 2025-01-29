package zov.blessed.crack.by.laqwrt;

import zov.blessed.crack.by.laqwrt.govno.Class_213;
import zov.blessed.crack.by.laqwrt.govno.Class_262;

import java.util.List;
import java.util.Map;

public class Class_121 extends Class_228 {
   public int field_690;
   public int field_691;
   public Class_252 field_692;
   public List<Class_252> field_693;

   public Class_121(int var1, int var2, Class_252 var3, Class_252... var4) {
      super(170);
      this.field_690 = var1;
      this.field_691 = var2;
      this.field_692 = var3;
      this.field_693 = Class_166.method_641(var4);
   }

   public int いい() {
      return 11;
   }

   public void よう(Class_213 var1) {
      Class_262[] var2 = new Class_262[this.field_693.size()];
      int var3 = 0;

      for(int var4 = var2.length; var3 < var4; ++var3) {
         var2[var3] = ((Class_252)this.field_693.get(var3)).method_1140();
      }

      var1.method_941(this.field_690, this.field_691, this.field_692.method_1140(), var2);
      this.method_1035(var1);
   }

   public Class_228 ユえ(Map<Class_252, Class_252> var1) {
      return (new Class_121(this.field_690, this.field_691, method_1036(this.field_692, var1), method_1037(this.field_693, var1))).method_1038(this);
   }
}
