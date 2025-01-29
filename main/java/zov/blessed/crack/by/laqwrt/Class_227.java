package zov.blessed.crack.by.laqwrt;

import zov.blessed.crack.by.laqwrt.govno.Class_213;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Class_227 extends Class_228 {
   public int field_1147;
   public List<Object> field_1148;
   public List<Object> field_1149;

   private Class_227() {
      super(-1);
   }

   public Class_227(int var1, int var2, Object[] var3, int var4, Object[] var5) {
      super(-1);
      this.field_1147 = var1;
      switch(var1) {
      case -1:
      case 0:
         this.field_1148 = Class_166.method_650(var2, var3);
         this.field_1149 = Class_166.method_650(var4, var5);
         break;
      case 1:
         this.field_1148 = Class_166.method_650(var2, var3);
         break;
      case 2:
         this.field_1148 = Class_166.method_640(var2);
      case 3:
         break;
      case 4:
         this.field_1149 = Class_166.method_650(1, var5);
         break;
      default:
         throw new IllegalArgumentException();
      }

   }

   public int いい() {
      return 14;
   }

   public void よう(Class_213 var1) {
      switch(this.field_1147) {
      case -1:
      case 0:
         var1.method_928(this.field_1147, this.field_1148.size(), method_1031(this.field_1148), this.field_1149.size(), method_1031(this.field_1149));
         break;
      case 1:
         var1.method_928(this.field_1147, this.field_1148.size(), method_1031(this.field_1148), 0, (Object[])null);
         break;
      case 2:
         var1.method_928(this.field_1147, this.field_1148.size(), (Object[])null, 0, (Object[])null);
         break;
      case 3:
         var1.method_928(this.field_1147, 0, (Object[])null, 0, (Object[])null);
         break;
      case 4:
         var1.method_928(this.field_1147, 0, (Object[])null, 1, method_1031(this.field_1149));
         break;
      default:
         throw new IllegalArgumentException();
      }

   }

   public Class_228 ユえ(Map<Class_252, Class_252> var1) {
      Class_227 var2 = new Class_227();
      var2.field_1147 = this.field_1147;
      int var3;
      int var4;
      Object var5;
      if (this.field_1148 != null) {
         var2.field_1148 = new ArrayList<>();
         var3 = 0;

         for(var4 = this.field_1148.size(); var3 < var4; ++var3) {
            var5 = this.field_1148.get(var3);
            if (var5 instanceof Class_252) {
               var5 = var1.get(var5);
            }

            var2.field_1148.add(var5);
         }
      }

      if (this.field_1149 != null) {
         var2.field_1149 = new ArrayList<>();
         var3 = 0;

         for(var4 = this.field_1149.size(); var3 < var4; ++var3) {
            var5 = this.field_1149.get(var3);
            if (var5 instanceof Class_252) {
               var5 = var1.get(var5);
            }

            var2.field_1149.add(var5);
         }
      }

      return var2;
   }

   private static Object[] method_1031(List<Object> var0) {
      Object[] var1 = new Object[var0.size()];
      int var2 = 0;

      for(int var3 = var1.length; var2 < var3; ++var2) {
         Object var4 = var0.get(var2);
         if (var4 instanceof Class_252) {
            var4 = ((Class_252)var4).method_1140();
         }

         var1[var2] = var4;
      }

      return var1;
   }
}
