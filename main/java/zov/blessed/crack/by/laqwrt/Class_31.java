package zov.blessed.crack.by.laqwrt;

import zov.blessed.crack.by.laqwrt.govno.Class_213;
import zov.blessed.crack.by.laqwrt.govno.Class_262;
import zov.blessed.crack.by.laqwrt.govno.Class_82;

import java.util.List;

public class Class_31 extends Class_273 {
   public List<Class_252> field_142;
   public List<Class_252> field_143;
   public List<Integer> field_144;

   public Class_31(int var1, Class_82 var2, Class_252[] var3, Class_252[] var4, int[] var5, String var6) {
      this(589824, var1, var2, var3, var4, var5, var6);
   }

   public Class_31(int var1, int var2, Class_82 var3, Class_252[] var4, Class_252[] var5, int[] var6, String var7) {
      super(var1, var2, var3, var7);
      this.field_142 = Class_166.method_641(var4);
      this.field_143 = Class_166.method_641(var5);
      this.field_144 = Class_166.method_646(var6);
   }

   public void method_46(Class_213 var1, boolean var2) {
      Class_262[] var3 = new Class_262[this.field_142.size()];
      Class_262[] var4 = new Class_262[this.field_143.size()];
      int[] var5 = new int[this.field_144.size()];
      int var6 = 0;

      for(int var7 = var3.length; var6 < var7; ++var6) {
         var3[var6] = ((Class_252)this.field_142.get(var6)).method_1140();
         var4[var6] = ((Class_252)this.field_143.get(var6)).method_1140();
         var5[var6] = (Integer)this.field_144.get(var6);
      }

      this.method_440(var1.method_948(this.field_1301, this.field_1302, var3, var4, var5, this.field_712, var2));
   }
}
