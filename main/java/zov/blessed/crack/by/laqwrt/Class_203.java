package zov.blessed.crack.by.laqwrt;

import zov.blessed.crack.by.laqwrt.govno.*;

import java.util.List;

public class Class_203 extends Class_192 {
   public int field_1060;
   public String field_1061;
   public String field_1062;
   public String field_1063;
   public Object field_1064;
   public List<Class_136> field_1065;
   public List<Class_136> field_1066;
   public List<Class_273> field_1067;
   public List<Class_273> field_1068;
   public List<Class_98> field_1069;

   public Class_203(int var1, String var2, String var3, String var4, Object var5) {
      this(589824, var1, var2, var3, var4, var5);
      if (this.getClass() != Class_203.class) {
         throw new IllegalStateException();
      }
   }

   public Class_203(int var1, int var2, String var3, String var4, String var5, Object var6) {
      super(var1);
      this.field_1060 = var2;
      this.field_1061 = var3;
      this.field_1062 = var4;
      this.field_1063 = var5;
      this.field_1064 = var6;
   }

   public Class_194 method_842(String var1, boolean var2) {
      Class_136 var3 = new Class_136(var1);
      if (var2) {
         this.field_1065 = Class_166.method_639(this.field_1065, var3);
      } else {
         this.field_1066 = Class_166.method_639(this.field_1066, var3);
      }

      return var3;
   }

   public Class_194 method_843(int var1, Class_82 var2, String var3, boolean var4) {
      Class_273 var5 = new Class_273(var1, var2, var3);
      if (var4) {
         this.field_1067 = Class_166.method_639(this.field_1067, var5);
      } else {
         this.field_1068 = Class_166.method_639(this.field_1068, var5);
      }

      return var5;
   }

   public void method_844(Class_98 var1) {
      this.field_1069 = Class_166.method_639(this.field_1069, var1);
   }

   public void method_845() {
   }

   public void method_894(int var1) {
      if (var1 == 262144) {
         if (this.field_1067 != null && !this.field_1067.isEmpty()) {
            throw new Class_52();
         }

         if (this.field_1068 != null && !this.field_1068.isEmpty()) {
            throw new Class_52();
         }
      }

   }

   public void method_895(Class_181 var1) {
      Class_192 var2 = var1.method_759(this.field_1060, this.field_1061, this.field_1062, this.field_1063, this.field_1064);
      if (var2 != null) {
         int var3;
         int var4;
         Class_136 var5;
         if (this.field_1065 != null) {
            var3 = 0;

            for(var4 = this.field_1065.size(); var3 < var4; ++var3) {
               var5 = (Class_136)this.field_1065.get(var3);
               var5.method_440(var2.method_842(var5.field_712, true));
            }
         }

         if (this.field_1066 != null) {
            var3 = 0;

            for(var4 = this.field_1066.size(); var3 < var4; ++var3) {
               var5 = (Class_136)this.field_1066.get(var3);
               var5.method_440(var2.method_842(var5.field_712, false));
            }
         }

         Class_273 var6;
         if (this.field_1067 != null) {
            var3 = 0;

            for(var4 = this.field_1067.size(); var3 < var4; ++var3) {
               var6 = (Class_273)this.field_1067.get(var3);
               var6.method_440(var2.method_843(var6.field_1301, var6.field_1302, var6.field_712, true));
            }
         }

         if (this.field_1068 != null) {
            var3 = 0;

            for(var4 = this.field_1068.size(); var3 < var4; ++var3) {
               var6 = (Class_273)this.field_1068.get(var3);
               var6.method_440(var2.method_843(var6.field_1301, var6.field_1302, var6.field_712, false));
            }
         }

         if (this.field_1069 != null) {
            var3 = 0;

            for(var4 = this.field_1069.size(); var3 < var4; ++var3) {
               var2.method_844((Class_98)this.field_1069.get(var3));
            }
         }

         var2.method_845();
      }
   }
}
