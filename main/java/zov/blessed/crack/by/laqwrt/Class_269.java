package zov.blessed.crack.by.laqwrt;

import zov.blessed.crack.by.laqwrt.govno.Class_65;
import zov.blessed.crack.by.laqwrt.govno.Class_181;

import java.util.ArrayList;
import java.util.List;

public class Class_269 extends Class_65 {
   public String field_1281;
   public int field_1282;
   public String field_1283;
   public String field_1284;
   public List<String> field_1285;
   public List<Class_85> field_1286;
   public List<Class_111> field_1287;
   public List<Class_188> field_1288;
   public List<String> field_1289;
   public List<Class_162> field_1290;

   public Class_269(String var1, int var2, String var3) {
      super(589824);
      if (this.getClass() != Class_269.class) {
         throw new IllegalStateException();
      } else {
         this.field_1281 = var1;
         this.field_1282 = var2;
         this.field_1283 = var3;
      }
   }

   public Class_269(int var1, String var2, int var3, String var4, List<Class_85> var5, List<Class_111> var6, List<Class_188> var7, List<String> var8, List<Class_162> var9) {
      super(var1);
      this.field_1281 = var2;
      this.field_1282 = var3;
      this.field_1283 = var4;
      this.field_1286 = var5;
      this.field_1287 = var6;
      this.field_1288 = var7;
      this.field_1289 = var8;
      this.field_1290 = var9;
   }

   public void method_218(String var1) {
      this.field_1284 = var1;
   }

   public void method_219(String var1) {
      if (this.field_1285 == null) {
         this.field_1285 = new ArrayList<>(5);
      }

      this.field_1285.add(var1);
   }

   public void method_220(String var1, int var2, String var3) {
      if (this.field_1286 == null) {
         this.field_1286 = new ArrayList<>(5);
      }

      this.field_1286.add(new Class_85(var1, var2, var3));
   }

   public void method_221(String var1, int var2, String... var3) {
      if (this.field_1287 == null) {
         this.field_1287 = new ArrayList<>(5);
      }

      this.field_1287.add(new Class_111(var1, var2, Class_166.method_641(var3)));
   }

   public void method_222(String var1, int var2, String... var3) {
      if (this.field_1288 == null) {
         this.field_1288 = new ArrayList<>(5);
      }

      this.field_1288.add(new Class_188(var1, var2, Class_166.method_641(var3)));
   }

   public void method_223(String var1) {
      if (this.field_1289 == null) {
         this.field_1289 = new ArrayList<>(5);
      }

      this.field_1289.add(var1);
   }

   public void method_224(String var1, String... var2) {
      if (this.field_1290 == null) {
         this.field_1290 = new ArrayList<>(5);
      }

      this.field_1290.add(new Class_162(var1, Class_166.method_641(var2)));
   }

   public void method_225() {
   }

   public void method_1244(Class_181 var1) {
      Class_65 var2 = var1.method_749(this.field_1281, this.field_1282, this.field_1283);
      if (var2 != null) {
         if (this.field_1284 != null) {
            var2.method_218(this.field_1284);
         }

         int var3;
         int var4;
         if (this.field_1285 != null) {
            var3 = 0;

            for(var4 = this.field_1285.size(); var3 < var4; ++var3) {
               var2.method_219((String)this.field_1285.get(var3));
            }
         }

         if (this.field_1286 != null) {
            var3 = 0;

            for(var4 = this.field_1286.size(); var3 < var4; ++var3) {
               ((Class_85)this.field_1286.get(var3)).method_300(var2);
            }
         }

         if (this.field_1287 != null) {
            var3 = 0;

            for(var4 = this.field_1287.size(); var3 < var4; ++var3) {
               ((Class_111)this.field_1287.get(var3)).method_399(var2);
            }
         }

         if (this.field_1288 != null) {
            var3 = 0;

            for(var4 = this.field_1288.size(); var3 < var4; ++var3) {
               ((Class_188)this.field_1288.get(var3)).method_839(var2);
            }
         }

         if (this.field_1289 != null) {
            var3 = 0;

            for(var4 = this.field_1289.size(); var3 < var4; ++var3) {
               var2.method_223((String)this.field_1289.get(var3));
            }
         }

         if (this.field_1290 != null) {
            var3 = 0;

            for(var4 = this.field_1290.size(); var3 < var4; ++var3) {
               ((Class_162)this.field_1290.get(var3)).method_634(var2);
            }
         }

      }
   }
}
