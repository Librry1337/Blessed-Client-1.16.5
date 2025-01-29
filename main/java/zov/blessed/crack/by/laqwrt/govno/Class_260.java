package zov.blessed.crack.by.laqwrt.govno;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public final class Class_260 {
   public static int field_1219 = 0;
   public static int field_1220 = 1;
   public static int field_1221 = 2;
   public static int field_1222 = 3;
   public static int field_1223 = 4;
   public static int field_1224 = 5;
   public static int field_1225 = 6;
   public static int field_1226 = 7;
   public static int field_1227 = 8;
   public static int field_1228 = 9;
   public static int field_1229 = 10;
   public static int field_1230 = 11;
   private static int field_1231 = 12;
   private static String field_1232 = "VZCBSIFJD";
   public static final Class_260 field_1233 = new Class_260(0, "VZCBSIFJD", 0, 1);
   public static final Class_260 field_1234 = new Class_260(1, "VZCBSIFJD", 1, 2);
   public static final Class_260 field_1235 = new Class_260(2, "VZCBSIFJD", 2, 3);
   public static final Class_260 field_1236 = new Class_260(3, "VZCBSIFJD", 3, 4);
   public static final Class_260 field_1237 = new Class_260(4, "VZCBSIFJD", 4, 5);
   public static final Class_260 field_1238 = new Class_260(5, "VZCBSIFJD", 5, 6);
   public static final Class_260 field_1239 = new Class_260(6, "VZCBSIFJD", 6, 7);
   public static final Class_260 field_1240 = new Class_260(7, "VZCBSIFJD", 7, 8);
   public static final Class_260 field_1241 = new Class_260(8, "VZCBSIFJD", 8, 9);
   private final int field_1242;
   private final String field_1243;
   private final int field_1244;
   private final int field_1245;

   private Class_260(int var1, String var2, int var3, int var4) {
      this.field_1242 = var1;
      this.field_1243 = var2;
      this.field_1244 = var3;
      this.field_1245 = var4;
   }

   public static Class_260 method_1188(String var0) {
      return method_1203(var0, 0, var0.length());
   }

   public static Class_260 method_1189(Class<?> var0) {
      if (var0.isPrimitive()) {
         if (var0 == Integer.TYPE) {
            return field_1238;
         } else if (var0 == Void.TYPE) {
            return field_1233;
         } else if (var0 == Boolean.TYPE) {
            return field_1234;
         } else if (var0 == Byte.TYPE) {
            return field_1236;
         } else if (var0 == Character.TYPE) {
            return field_1235;
         } else if (var0 == Short.TYPE) {
            return field_1237;
         } else if (var0 == Double.TYPE) {
            return field_1241;
         } else if (var0 == Float.TYPE) {
            return field_1239;
         } else if (var0 == Long.TYPE) {
            return field_1240;
         } else {
            throw new AssertionError();
         }
      } else {
         return method_1188(method_1208(var0));
      }
   }

   public static Class_260 method_1190(Constructor<?> var0) {
      return method_1188(method_1209(var0));
   }

   public static Class_260 method_1191(Method var0) {
      return method_1188(method_1211(var0));
   }

   public Class_260 method_1192() {
      int var1 = this.method_1215();
      return method_1203(this.field_1243, this.field_1244 + var1, this.field_1245);
   }

   public static Class_260 method_1193(String var0) {
      return new Class_260(var0.charAt(0) == '[' ? 9 : 12, var0, 0, var0.length());
   }

   public static Class_260 method_1194(String var0) {
      return new Class_260(11, var0, 0, var0.length());
   }

   public static Class_260 method_1195(Class_260 var0, Class_260... var1) {
      return method_1188(method_1210(var0, var1));
   }

   public Class_260[] method_1196() {
      return method_1197(this.method_1207());
   }

   public static Class_260[] method_1197(String var0) {
      int var1 = 0;

      int var2;
      for(var2 = 1; var0.charAt(var2) != ')'; ++var1) {
         while(var0.charAt(var2) == '[') {
            ++var2;
         }

         if (var0.charAt(var2++) == 'L') {
            int var3 = var0.indexOf(59, var2);
            var2 = Math.max(var2, var3 + 1);
         }
      }

      Class_260[] var7 = new Class_260[var1];
      var2 = 1;

      int var5;
      for(int var4 = 0; var0.charAt(var2) != ')'; var7[var4++] = method_1203(var0, var5, var2)) {
         for(var5 = var2; var0.charAt(var2) == '['; ++var2) {
         }

         if (var0.charAt(var2++) == 'L') {
            int var6 = var0.indexOf(59, var2);
            var2 = Math.max(var2, var6 + 1);
         }
      }

      return var7;
   }

   public static Class_260[] method_1198(Method var0) {
      Class[] var1 = var0.getParameterTypes();
      Class_260[] var2 = new Class_260[var1.length];

      for(int var3 = var1.length - 1; var3 >= 0; --var3) {
         var2[var3] = method_1189(var1[var3]);
      }

      return var2;
   }

   public Class_260 method_1199() {
      return method_1200(this.method_1207());
   }

   public static Class_260 method_1200(String var0) {
      return method_1203(var0, method_1202(var0), var0.length());
   }

   public static Class_260 method_1201(Method var0) {
      return method_1189(var0.getReturnType());
   }

   static int method_1202(String var0) {
      int var1 = 1;

      while(var0.charAt(var1) != ')') {
         while(var0.charAt(var1) == '[') {
            ++var1;
         }

         if (var0.charAt(var1++) == 'L') {
            int var2 = var0.indexOf(59, var1);
            var1 = Math.max(var1, var2 + 1);
         }
      }

      return var1 + 1;
   }

   private static Class_260 method_1203(String var0, int var1, int var2) {
      switch(var0.charAt(var1)) {
      case '(':
         return new Class_260(11, var0, var1, var2);
      case 'B':
         return field_1236;
      case 'C':
         return field_1235;
      case 'D':
         return field_1241;
      case 'F':
         return field_1239;
      case 'I':
         return field_1238;
      case 'J':
         return field_1240;
      case 'L':
         return new Class_260(10, var0, var1 + 1, var2 - 1);
      case 'S':
         return field_1237;
      case 'V':
         return field_1233;
      case 'Z':
         return field_1234;
      case '[':
         return new Class_260(9, var0, var1, var2);
      default:
         throw new IllegalArgumentException();
      }
   }

   public String method_1204() {
      switch(this.field_1242) {
      case 0:
         return "void";
      case 1:
         return "boolean";
      case 2:
         return "char";
      case 3:
         return "byte";
      case 4:
         return "short";
      case 5:
         return "int";
      case 6:
         return "float";
      case 7:
         return "long";
      case 8:
         return "double";
      case 9:
         StringBuilder var1 = new StringBuilder(this.method_1192().method_1204());

         for(int var2 = this.method_1215(); var2 > 0; --var2) {
            var1.append("[]");
         }

         return var1.toString();
      case 10:
      case 12:
         return this.field_1243.substring(this.field_1244, this.field_1245).replace('/', '.');
      case 11:
      default:
         throw new AssertionError();
      }
   }

   public String method_1205() {
      return this.field_1243.substring(this.field_1244, this.field_1245);
   }

   public static String method_1206(Class<?> var0) {
      return var0.getName().replace('.', '/');
   }

   public String method_1207() {
      if (this.field_1242 == 10) {
         return this.field_1243.substring(this.field_1244 - 1, this.field_1245 + 1);
      } else {
         return this.field_1242 == 12 ? 'L' + this.field_1243.substring(this.field_1244, this.field_1245) + ';' : this.field_1243.substring(this.field_1244, this.field_1245);
      }
   }

   public static String method_1208(Class<?> var0) {
      StringBuilder var1 = new StringBuilder();
      method_1213(var0, var1);
      return var1.toString();
   }

   public static String method_1209(Constructor<?> var0) {
      StringBuilder var1 = new StringBuilder();
      var1.append('(');
      Class[] var2 = var0.getParameterTypes();
      Class[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         Class var6 = var3[var5];
         method_1213(var6, var1);
      }

      return var1.append(")V").toString();
   }

   public static String method_1210(Class_260 var0, Class_260... var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append('(');
      Class_260[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         Class_260 var6 = var3[var5];
         var6.method_1212(var2);
      }

      var2.append(')');
      var0.method_1212(var2);
      return var2.toString();
   }

   public static String method_1211(Method var0) {
      StringBuilder var1 = new StringBuilder();
      var1.append('(');
      Class[] var2 = var0.getParameterTypes();
      Class[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         Class var6 = var3[var5];
         method_1213(var6, var1);
      }

      var1.append(')');
      method_1213(var0.getReturnType(), var1);
      return var1.toString();
   }

   private void method_1212(StringBuilder var1) {
      if (this.field_1242 == 10) {
         var1.append(this.field_1243, this.field_1244 - 1, this.field_1245 + 1);
      } else if (this.field_1242 == 12) {
         var1.append('L').append(this.field_1243, this.field_1244, this.field_1245).append(';');
      } else {
         var1.append(this.field_1243, this.field_1244, this.field_1245);
      }

   }

   private static void method_1213(Class<?> var0, StringBuilder var1) {
      Class var2;
      for(var2 = var0; var2.isArray(); var2 = var2.getComponentType()) {
         var1.append('[');
      }

      if (var2.isPrimitive()) {
         char var3;
         if (var2 == Integer.TYPE) {
            var3 = 'I';
         } else if (var2 == Void.TYPE) {
            var3 = 'V';
         } else if (var2 == Boolean.TYPE) {
            var3 = 'Z';
         } else if (var2 == Byte.TYPE) {
            var3 = 'B';
         } else if (var2 == Character.TYPE) {
            var3 = 'C';
         } else if (var2 == Short.TYPE) {
            var3 = 'S';
         } else if (var2 == Double.TYPE) {
            var3 = 'D';
         } else if (var2 == Float.TYPE) {
            var3 = 'F';
         } else {
            if (var2 != Long.TYPE) {
               throw new AssertionError();
            }

            var3 = 'J';
         }

         var1.append(var3);
      } else {
         var1.append('L').append(method_1206(var2)).append(';');
      }

   }

   public int method_1214() {
      return this.field_1242 == 12 ? 10 : this.field_1242;
   }

   public int method_1215() {
      int var1;
      for(var1 = 1; this.field_1243.charAt(this.field_1244 + var1) == '['; ++var1) {
      }

      return var1;
   }

   public int method_1216() {
      switch(this.field_1242) {
      case 0:
         return 0;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 9:
      case 10:
      case 12:
         return 1;
      case 7:
      case 8:
         return 2;
      case 11:
      default:
         throw new AssertionError();
      }
   }

   public int method_1217() {
      return method_1218(this.method_1207());
   }

   public static int method_1218(String var0) {
      int var1 = 1;
      int var2 = 1;

      char var3;
      int var4;
      for(var3 = var0.charAt(var2); var3 != ')'; var3 = var0.charAt(var2)) {
         if (var3 != 'J' && var3 != 'D') {
            while(var0.charAt(var2) == '[') {
               ++var2;
            }

            if (var0.charAt(var2++) == 'L') {
               var4 = var0.indexOf(59, var2);
               var2 = Math.max(var2, var4 + 1);
            }

            ++var1;
         } else {
            ++var2;
            var1 += 2;
         }
      }

      var3 = var0.charAt(var2 + 1);
      if (var3 == 'V') {
         return var1 << 2;
      } else {
         var4 = var3 != 'J' && var3 != 'D' ? 1 : 2;
         return var1 << 2 | var4;
      }
   }

   public int method_1219(int var1) {
      if (var1 != 46 && var1 != 79) {
         switch(this.field_1242) {
         case 0:
            if (var1 != 172) {
               throw new UnsupportedOperationException();
            }

            return 177;
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            return var1;
         case 6:
            return var1 + 2;
         case 7:
            return var1 + 1;
         case 8:
            return var1 + 3;
         case 9:
         case 10:
         case 12:
            if (var1 != 21 && var1 != 54 && var1 != 172) {
               throw new UnsupportedOperationException();
            }

            return var1 + 4;
         case 11:
            throw new UnsupportedOperationException();
         default:
            throw new AssertionError();
         }
      } else {
         switch(this.field_1242) {
         case 0:
         case 11:
            throw new UnsupportedOperationException();
         case 1:
         case 3:
            return var1 + 5;
         case 2:
            return var1 + 6;
         case 4:
            return var1 + 7;
         case 5:
            return var1;
         case 6:
            return var1 + 2;
         case 7:
            return var1 + 1;
         case 8:
            return var1 + 3;
         case 9:
         case 10:
         case 12:
            return var1 + 4;
         default:
            throw new AssertionError();
         }
      }
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof Class_260)) {
         return false;
      } else {
         Class_260 var2 = (Class_260)var1;
         if ((this.field_1242 == 12 ? 10 : this.field_1242) != (var2.field_1242 == 12 ? 10 : var2.field_1242)) {
            return false;
         } else {
            int var3 = this.field_1244;
            int var4 = this.field_1245;
            int var5 = var2.field_1244;
            int var6 = var2.field_1245;
            if (var4 - var3 != var6 - var5) {
               return false;
            } else {
               int var7 = var3;

               for(int var8 = var5; var7 < var4; ++var8) {
                  if (this.field_1243.charAt(var7) != var2.field_1243.charAt(var8)) {
                     return false;
                  }

                  ++var7;
               }

               return true;
            }
         }
      }
   }

   public int hashCode() {
      int var1 = 13 * (this.field_1242 == 12 ? 10 : this.field_1242);
      if (this.field_1242 >= 9) {
         int var2 = this.field_1244;

         for(int var3 = this.field_1245; var2 < var3; ++var2) {
            var1 = 17 * (var1 + this.field_1243.charAt(var2));
         }
      }

      return var1;
   }

   public String toString() {
      return this.method_1207();
   }
}
