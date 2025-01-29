package zov.blessed.crack.by.laqwrt;

public class Class_57 {
   private final String field_317;

   public Class_57(String var1) {
      this.field_317 = var1;
   }

   public void method_186(Class_127 var1) {
      String var2 = this.field_317;
      int var3 = var2.length();
      int var4;
      if (var2.charAt(0) == '<') {
         var4 = 2;

         char var5;
         do {
            int var6 = var2.indexOf(58, var4);
            var1.method_404(var2.substring(var4 - 1, var6));
            var4 = var6 + 1;
            var5 = var2.charAt(var4);
            if (var5 == 'L' || var5 == '[' || var5 == 'T') {
               var4 = method_188(var2, var4, var1.method_405());
            }

            while((var5 = var2.charAt(var4++)) == ':') {
               var4 = method_188(var2, var4, var1.method_406());
            }
         } while(var5 != '>');
      } else {
         var4 = 0;
      }

      if (var2.charAt(var4) == '(') {
         ++var4;

         while(var2.charAt(var4) != ')') {
            var4 = method_188(var2, var4, var1.method_409());
         }

         for(var4 = method_188(var2, var4 + 1, var1.method_410()); var4 < var3; var4 = method_188(var2, var4 + 1, var1.method_411())) {
         }
      } else {
         for(var4 = method_188(var2, var4, var1.method_407()); var4 < var3; var4 = method_188(var2, var4, var1.method_408())) {
         }
      }

   }

   public void method_187(Class_127 var1) {
      method_188(this.field_317, 0, var1);
   }

   private static int method_188(String var0, int var1, Class_127 var2) {
      int var3 = var1 + 1;
      char var4 = var0.charAt(var1);
      switch(var4) {
      case 'B':
      case 'C':
      case 'D':
      case 'F':
      case 'I':
      case 'J':
      case 'S':
      case 'V':
      case 'Z':
         var2.method_412(var4);
         return var3;
      case 'E':
      case 'G':
      case 'H':
      case 'K':
      case 'M':
      case 'N':
      case 'O':
      case 'P':
      case 'Q':
      case 'R':
      case 'U':
      case 'W':
      case 'X':
      case 'Y':
      default:
         throw new IllegalArgumentException();
      case 'L':
         int var6 = var3;
         boolean var7 = false;
         boolean var8 = false;

         while(true) {
            String var9;
            do {
               while(true) {
                  var4 = var0.charAt(var3++);
                  if (var4 != '.' && var4 != ';') {
                     break;
                  }

                  if (!var7) {
                     var9 = var0.substring(var6, var3 - 1);
                     if (var8) {
                        var2.method_416(var9);
                     } else {
                        var2.method_415(var9);
                     }
                  }

                  if (var4 == ';') {
                     var2.method_419();
                     return var3;
                  }

                  var6 = var3;
                  var7 = false;
                  var8 = true;
               }
            } while(var4 != '<');

            var9 = var0.substring(var6, var3 - 1);
            if (var8) {
               var2.method_416(var9);
            } else {
               var2.method_415(var9);
            }

            var7 = true;

            while((var4 = var0.charAt(var3)) != '>') {
               switch(var4) {
               case '*':
                  ++var3;
                  var2.method_417();
                  break;
               case '+':
               case '-':
                  var3 = method_188(var0, var3 + 1, var2.method_418(var4));
                  break;
               case ',':
               default:
                  var3 = method_188(var0, var3, var2.method_418('='));
               }
            }
         }
      case 'T':
         int var5 = var0.indexOf(59, var3);
         var2.method_413(var0.substring(var3, var5));
         return var5 + 1;
      case '[':
         return method_188(var0, var3, var2.method_414());
      }
   }
}
