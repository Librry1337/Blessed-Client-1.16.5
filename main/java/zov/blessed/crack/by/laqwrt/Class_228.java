package zov.blessed.crack.by.laqwrt;

import zov.blessed.crack.by.laqwrt.govno.Class_213;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Class_228 {
   public static int field_1150 = 0;
   public static int field_1151 = 1;
   public static int field_1152 = 2;
   public static int field_1153 = 3;
   public static int field_1154 = 4;
   public static int field_1155 = 5;
   public static int field_1156 = 6;
   public static int field_1157 = 7;
   public static int field_1158 = 8;
   public static int field_1159 = 9;
   public static int field_1160 = 10;
   public static int field_1161 = 11;
   public static int field_1162 = 12;
   public static int field_1163 = 13;
   public static int field_1164 = 14;
   public static int field_1165 = 15;
   protected int field_1166;
   public List<Class_273> field_1167;
   public List<Class_273> field_1168;
   Class_228 field_1169;
   Class_228 field_1170;
   int field_1171;

   protected Class_228(int var1) {
      this.field_1166 = var1;
      this.field_1171 = -1;
   }

   public int method_1032() {
      return this.field_1166;
   }

   public abstract int いい();

   public Class_228 method_1033() {
      return this.field_1169;
   }

   public Class_228 method_1034() {
      return this.field_1170;
   }

   public abstract void よう(Class_213 var1);

   protected final void method_1035(Class_213 var1) {
      int var2;
      int var3;
      Class_273 var4;
      if (this.field_1167 != null) {
         var2 = 0;

         for(var3 = this.field_1167.size(); var2 < var3; ++var2) {
            var4 = (Class_273)this.field_1167.get(var2);
            var4.method_440(var1.method_944(var4.field_1301, var4.field_1302, var4.field_712, true));
         }
      }

      if (this.field_1168 != null) {
         var2 = 0;

         for(var3 = this.field_1168.size(); var2 < var3; ++var2) {
            var4 = (Class_273)this.field_1168.get(var2);
            var4.method_440(var1.method_944(var4.field_1301, var4.field_1302, var4.field_712, false));
         }
      }

   }

   public abstract Class_228 ユえ(Map<Class_252, Class_252> var1);

   static Class_252 method_1036(Class_252 var0, Map<Class_252, Class_252> var1) {
      return (Class_252)var1.get(var0);
   }

   static Class_252[] method_1037(List<Class_252> var0, Map<Class_252, Class_252> var1) {
      Class_252[] var2 = new Class_252[var0.size()];
      int var3 = 0;

      for(int var4 = var2.length; var3 < var4; ++var3) {
         var2[var3] = (Class_252)var1.get(var0.get(var3));
      }

      return var2;
   }

   protected final Class_228 method_1038(Class_228 var1) {
      int var2;
      int var3;
      Class_273 var4;
      Class_273 var5;
      if (var1.field_1167 != null) {
         this.field_1167 = new ArrayList<>();
         var2 = 0;

         for(var3 = var1.field_1167.size(); var2 < var3; ++var2) {
            var4 = (Class_273)var1.field_1167.get(var2);
            var5 = new Class_273(var4.field_1301, var4.field_1302, var4.field_712);
            var4.method_440(var5);
            this.field_1167.add(var5);
         }
      }

      if (var1.field_1168 != null) {
         this.field_1168 = new ArrayList<>();
         var2 = 0;

         for(var3 = var1.field_1168.size(); var2 < var3; ++var2) {
            var4 = (Class_273)var1.field_1168.get(var2);
            var5 = new Class_273(var4.field_1301, var4.field_1302, var4.field_712);
            var4.method_440(var5);
            this.field_1168.add(var5);
         }
      }

      return this;
   }
}
