package zov.blessed.crack.by.laqwrt;

import zov.blessed.crack.by.laqwrt.govno.Class_213;
import zov.blessed.crack.by.laqwrt.govno.Class_262;

import java.util.List;
import java.util.Map;

public class Class_185 extends Class_228 {
   public Class_252 field_987;
   public List<Integer> field_988;
   public List<Class_252> field_989;

   public Class_185(Class_252 var1, int[] var2, Class_252[] var3) {
      super(171);
      this.field_987 = var1;
      this.field_988 = Class_166.method_646(var2);
      this.field_989 = Class_166.method_641(var3);
   }

   public int いい() {
      return 12;
   }

   public void よう(Class_213 var1) {
      int[] var2 = new int[this.field_988.size()];
      int var3 = 0;

      int var4;
      for(var4 = var2.length; var3 < var4; ++var3) {
         var2[var3] = (Integer)this.field_988.get(var3);
      }

      Class_262[] var6 = new Class_262[this.field_989.size()];
      var4 = 0;

      for(int var5 = var6.length; var4 < var5; ++var4) {
         var6[var4] = ((Class_252)this.field_989.get(var4)).method_1140();
      }

      var1.method_942(this.field_987.method_1140(), var2, var6);
      this.method_1035(var1);
   }

   public Class_228 ユえ(Map<Class_252, Class_252> var1) {
      Class_185 var2 = new Class_185(method_1036(this.field_987, var1), (int[])null, method_1037(this.field_989, var1));
      var2.field_988.addAll(this.field_988);
      return var2.method_1038(this);
   }
}
