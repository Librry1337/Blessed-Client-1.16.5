package zov.blessed.crack.by.laqwrt;

import zov.blessed.crack.by.laqwrt.govno.*;

import java.util.List;

public class Class_50 extends Class_193 {
   public String field_257;
   public String field_258;
   public String field_259;
   public List<Class_136> field_260;
   public List<Class_136> field_261;
   public List<Class_273> field_262;
   public List<Class_273> field_263;
   public List<Class_98> field_264;

   public Class_50(String var1, String var2, String var3) {
      this(589824, var1, var2, var3);
      if (this.getClass() != Class_50.class) {
         throw new IllegalStateException();
      }
   }

   public Class_50(int var1, String var2, String var3, String var4) {
      super(var1);
      this.field_257 = var2;
      this.field_258 = var3;
      this.field_259 = var4;
   }

   public Class_194 method_847(String var1, boolean var2) {
      Class_136 var3 = new Class_136(var1);
      if (var2) {
         this.field_260 = Class_166.method_639(this.field_260, var3);
      } else {
         this.field_261 = Class_166.method_639(this.field_261, var3);
      }

      return var3;
   }

   public Class_194 method_848(int var1, Class_82 var2, String var3, boolean var4) {
      Class_273 var5 = new Class_273(var1, var2, var3);
      if (var4) {
         this.field_262 = Class_166.method_639(this.field_262, var5);
      } else {
         this.field_263 = Class_166.method_639(this.field_263, var5);
      }

      return var5;
   }

   public void method_849(Class_98 var1) {
      this.field_264 = Class_166.method_639(this.field_264, var1);
   }

   public void method_850() {
   }

   public void method_123(int var1) {
      if (var1 < 524288) {
         throw new Class_52();
      }
   }

   public void method_124(Class_181 var1) {
      Class_193 var2 = var1.method_758(this.field_257, this.field_258, this.field_259);
      if (var2 != null) {
         int var3;
         int var4;
         Class_136 var5;
         if (this.field_260 != null) {
            var3 = 0;

            for(var4 = this.field_260.size(); var3 < var4; ++var3) {
               var5 = (Class_136)this.field_260.get(var3);
               var5.method_440(var2.method_847(var5.field_712, true));
            }
         }

         if (this.field_261 != null) {
            var3 = 0;

            for(var4 = this.field_261.size(); var3 < var4; ++var3) {
               var5 = (Class_136)this.field_261.get(var3);
               var5.method_440(var2.method_847(var5.field_712, false));
            }
         }

         Class_273 var6;
         if (this.field_262 != null) {
            var3 = 0;

            for(var4 = this.field_262.size(); var3 < var4; ++var3) {
               var6 = (Class_273)this.field_262.get(var3);
               var6.method_440(var2.method_848(var6.field_1301, var6.field_1302, var6.field_712, true));
            }
         }

         if (this.field_263 != null) {
            var3 = 0;

            for(var4 = this.field_263.size(); var3 < var4; ++var3) {
               var6 = (Class_273)this.field_263.get(var3);
               var6.method_440(var2.method_848(var6.field_1301, var6.field_1302, var6.field_712, false));
            }
         }

         if (this.field_264 != null) {
            var3 = 0;

            for(var4 = this.field_264.size(); var3 < var4; ++var3) {
               var2.method_849((Class_98)this.field_264.get(var3));
            }
         }

         var2.method_850();
      }
   }
}
