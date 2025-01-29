package zov.blessed.crack.by.laqwrt.govno;

final class Class_67 {
   final Class_262 field_590;
   final Class_262 field_591;
   final Class_262 field_592;
   final int field_593;
   final String field_594;
   Class_67 field_595;

   Class_67(Class_262 var1, Class_262 var2, Class_262 var3, int var4, String var5) {
      this.field_590 = var1;
      this.field_591 = var2;
      this.field_592 = var3;
      this.field_593 = var4;
      this.field_594 = var5;
   }

   Class_67(Class_67 var1, Class_262 var2, Class_262 var3) {
      this(var2, var3, var1.field_592, var1.field_593, var1.field_594);
      this.field_595 = var1.field_595;
   }

   static Class_67 method_226(Class_67 var0, Class_262 var1, Class_262 var2) {
      if (var0 == null) {
         return null;
      } else {
         var0.field_595 = method_226(var0.field_595, var1, var2);
         int var3 = var0.field_590.field_1264;
         int var4 = var0.field_591.field_1264;
         int var5 = var1.field_1264;
         int var6 = var2 == null ? Integer.MAX_VALUE : var2.field_1264;
         if (var5 < var4 && var6 > var3) {
            if (var5 <= var3) {
               return var6 >= var4 ? var0.field_595 : new Class_67(var0, var2, var0.field_591);
            } else if (var6 >= var4) {
               return new Class_67(var0, var0.field_590, var1);
            } else {
               var0.field_595 = new Class_67(var0, var2, var0.field_591);
               return new Class_67(var0, var0.field_590, var1);
            }
         } else {
            return var0;
         }
      }
   }

   static int method_227(Class_67 var0) {
      int var1 = 0;

      for(Class_67 var2 = var0; var2 != null; var2 = var2.field_595) {
         ++var1;
      }

      return var1;
   }

   static int method_228(Class_67 var0) {
      return 2 + 8 * method_227(var0);
   }

   static void method_229(Class_67 var0, Class_25 var1) {
      var1.method_24(method_227(var0));

      for(Class_67 var2 = var0; var2 != null; var2 = var2.field_595) {
         var1.method_24(var2.field_590.field_1264).method_24(var2.field_591.field_1264).method_24(var2.field_592.field_1264).method_24(var2.field_593);
      }

   }
}
