package zov.blessed.crack.by.laqwrt.govno;

public final class Class_82 {
   public static int field_629 = 0;
   public static int field_630 = 1;
   public static int field_631 = 2;
   public static int field_632 = 3;
   private final byte[] field_633;
   private final int field_634;

   Class_82(byte[] var1, int var2) {
      this.field_633 = var1;
      this.field_634 = var2;
   }

   public int method_287() {
      return this.field_633[this.field_634];
   }

   public int method_288(int var1) {
      return this.field_633[this.field_634 + 2 * var1 + 1];
   }

   public int method_289(int var1) {
      return this.field_633[this.field_634 + 2 * var1 + 2];
   }

   public static Class_82 method_290(String var0) {
      if (var0 != null && var0.length() != 0) {
         int var1 = var0.length();
         Class_25 var2 = new Class_25(var1);
         var2.method_22(0);
         int var3 = 0;

         while(true) {
            while(true) {
               while(true) {
                  while(var3 < var1) {
                     char var4 = var0.charAt(var3++);
                     if (var4 != '[') {
                        if (var4 != '.') {
                           if (var4 != '*') {
                              if (var4 < '0' || var4 > '9') {
                                 throw new IllegalArgumentException();
                              }

                              int var5;
                              for(var5 = var4 - 48; var3 < var1; var5 = var5 * 10 + var4 - 48) {
                                 var4 = var0.charAt(var3++);
                                 if (var4 < '0' || var4 > '9') {
                                    if (var4 != ';') {
                                       throw new IllegalArgumentException();
                                    }
                                    break;
                                 }
                              }

                              var2.method_23(3, var5);
                           } else {
                              var2.method_23(2, 0);
                           }
                        } else {
                           var2.method_23(1, 0);
                        }
                     } else {
                        var2.method_23(0, 0);
                     }
                  }

                  var2.field_130[0] = (byte)(var2.field_131 / 2);
                  return new Class_82(var2.field_130, 0);
               }
            }
         }
      } else {
         return null;
      }
   }

   public String toString() {
      int var1 = this.method_287();
      StringBuilder var2 = new StringBuilder(var1 * 2);

      for(int var3 = 0; var3 < var1; ++var3) {
         switch(this.method_288(var3)) {
         case 0:
            var2.append('[');
            break;
         case 1:
            var2.append('.');
            break;
         case 2:
            var2.append('*');
            break;
         case 3:
            var2.append(this.method_289(var3)).append(';');
            break;
         default:
            throw new AssertionError();
         }
      }

      return var2.toString();
   }

   static void method_291(Class_82 var0, Class_25 var1) {
      if (var0 == null) {
         var1.method_22(0);
      } else {
         int var2 = var0.field_633[var0.field_634] * 2 + 1;
         var1.method_32(var0.field_633, var0.field_634, var2);
      }

   }
}
