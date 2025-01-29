package zov.blessed.crack.by.laqwrt;

import zov.blessed.crack.by.laqwrt.govno.Class_194;

import java.util.ArrayList;
import java.util.List;

public class Class_136 extends Class_194 {
   public String field_712;
   public List<Object> field_713;

   public Class_136(String var1) {
      this(589824, var1);
      if (this.getClass() != Class_136.class) {
         throw new IllegalStateException();
      }
   }

   public Class_136(int var1, String var2) {
      super(var1);
      this.field_712 = var2;
   }

   Class_136(List<Object> var1) {
      super(589824);
      this.field_713 = var1;
   }

   public void method_851(String var1, Object var2) {
      if (this.field_713 == null) {
         this.field_713 = new ArrayList<>(this.field_712 != null ? 2 : 1);
      }

      if (this.field_712 != null) {
         this.field_713.add(var1);
      }

      if (var2 instanceof byte[]) {
         this.field_713.add(Class_166.method_642((byte[])var2));
      } else if (var2 instanceof boolean[]) {
         this.field_713.add(Class_166.method_643((boolean[])var2));
      } else if (var2 instanceof short[]) {
         this.field_713.add(Class_166.method_644((short[])var2));
      } else if (var2 instanceof char[]) {
         this.field_713.add(Class_166.method_645((char[])var2));
      } else if (var2 instanceof int[]) {
         this.field_713.add(Class_166.method_646((int[])var2));
      } else if (var2 instanceof long[]) {
         this.field_713.add(Class_166.method_648((long[])var2));
      } else if (var2 instanceof float[]) {
         this.field_713.add(Class_166.method_647((float[])var2));
      } else if (var2 instanceof double[]) {
         this.field_713.add(Class_166.method_649((double[])var2));
      } else {
         this.field_713.add(var2);
      }

   }

   public void method_852(String var1, String var2, String var3) {
      if (this.field_713 == null) {
         this.field_713 = new ArrayList<>(this.field_712 != null ? 2 : 1);
      }

      if (this.field_712 != null) {
         this.field_713.add(var1);
      }

      this.field_713.add(new String[]{var2, var3});
   }

   public Class_194 method_853(String var1, String var2) {
      if (this.field_713 == null) {
         this.field_713 = new ArrayList<>(this.field_712 != null ? 2 : 1);
      }

      if (this.field_712 != null) {
         this.field_713.add(var1);
      }

      Class_136 var3 = new Class_136(var2);
      this.field_713.add(var3);
      return var3;
   }

   public Class_194 method_854(String var1) {
      if (this.field_713 == null) {
         this.field_713 = new ArrayList<>(this.field_712 != null ? 2 : 1);
      }

      if (this.field_712 != null) {
         this.field_713.add(var1);
      }

      ArrayList var2 = new ArrayList<>();
      this.field_713.add(var2);
      return new Class_136(var2);
   }

   public void method_855() {
   }

   public void method_439(int var1) {
   }

   public void method_440(Class_194 var1) {
      if (var1 != null) {
         if (this.field_713 != null) {
            int var2 = 0;

            for(int var3 = this.field_713.size(); var2 < var3; var2 += 2) {
               String var4 = (String)this.field_713.get(var2);
               Object var5 = this.field_713.get(var2 + 1);
               method_441(var1, var4, var5);
            }
         }

         var1.method_855();
      }

   }

   static void method_441(Class_194 var0, String var1, Object var2) {
      if (var0 != null) {
         if (var2 instanceof String[]) {
            String[] var3 = (String[])var2;
            var0.method_852(var1, var3[0], var3[1]);
         } else if (var2 instanceof Class_136) {
            Class_136 var7 = (Class_136)var2;
            var7.method_440(var0.method_853(var1, var7.field_712));
         } else if (var2 instanceof List) {
            Class_194 var8 = var0.method_854(var1);
            if (var8 != null) {
               List var4 = (List)var2;
               int var5 = 0;

               for(int var6 = var4.size(); var5 < var6; ++var5) {
                  method_441(var8, (String)null, var4.get(var5));
               }

               var8.method_855();
            }
         } else {
            var0.method_851(var1, var2);
         }
      }

   }
}
