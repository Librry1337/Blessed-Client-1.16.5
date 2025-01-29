package zov.blessed.crack.by.laqwrt;

import zov.blessed.crack.by.laqwrt.govno.Class_260;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class_154 {
   public static final Map<String, Class_260> field_761 = new HashMap(9);
   public static final Map<Class<?>, String> field_762 = new HashMap(9);
   public static final Map<Class<?>, String> field_763 = new HashMap(9);

   public static Class_260 method_550(String var0) {
      return method_552(var0, 0);
   }

   public static Class_260 method_551(String var0) {
      return method_552(var0, 1);
   }

   public static Class_260 method_552(String var0, int var1) {
      StringBuilder var2 = new StringBuilder();

      for(int var3 = 0; var3 < var1; ++var3) {
         var2.append("[");
      }

      Class_260 var4 = (Class_260)field_761.get(var0);
      if (var4 == null) {
         if (!var0.startsWith("L")) {
            var2.append("L");
         }

         var2.append(var0.replace(".", "/"));
         if (!var0.endsWith(";")) {
            var2.append(";");
         }
      } else {
         var2.append(var4.method_1207());
      }

      return Class_260.method_1188(var2.toString());
   }

   static Object method_553(Class_260 var0) {
      if (var0 != Class_260.field_1234 && var0 != Class_260.field_1236 && var0 != Class_260.field_1237 && var0 != Class_260.field_1235 && var0 != Class_260.field_1238) {
         if (var0 == Class_260.field_1239) {
            return Class_63.field_426;
         } else if (var0 == Class_260.field_1241) {
            return Class_63.field_427;
         } else {
            return var0 == Class_260.field_1240 ? Class_63.field_428 : var0.method_1205();
         }
      } else {
         return Class_63.field_425;
      }
   }

   public static List<String> method_554(String var0) {
      ArrayList var1 = new ArrayList<>();
      Pattern var2 = Pattern.compile("\\[?([ZBCSIJFDV]|L[^;]+;)");
      Matcher var3 = var2.matcher(var0);

      while(var3.find()) {
         var1.add(var3.group(1));
      }

      if (var1.size() == 1) {
         var1.add(0, "");
      }

      return var1;
   }

   public static Class<?> method_555(Class_260 var0) {
      switch(var0.method_1214()) {
      case 1:
         return Boolean.class;
      case 2:
         return Character.class;
      case 3:
         return Byte.class;
      case 4:
         return Short.class;
      case 5:
         return Integer.class;
      case 6:
         return Float.class;
      case 7:
         return Long.class;
      case 8:
         return Double.class;
      default:
         return null;
      }
   }

   public static int method_556(Class_260 var0) {
      switch(var0.method_1214()) {
      case 0:
         return 177;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
         return 172;
      case 6:
         return 174;
      case 7:
         return 173;
      case 8:
         return 175;
      default:
         return 176;
      }
   }

   static {
      field_761.put("V", Class_260.field_1233);
      field_761.put("Z", Class_260.field_1234);
      field_761.put("B", Class_260.field_1236);
      field_761.put("S", Class_260.field_1237);
      field_761.put("C", Class_260.field_1235);
      field_761.put("I", Class_260.field_1238);
      field_761.put("F", Class_260.field_1239);
      field_761.put("J", Class_260.field_1240);
      field_761.put("D", Class_260.field_1241);
      field_762.put(Void.class, "V");
      field_762.put(Boolean.class, "Z");
      field_762.put(Byte.class, "B");
      field_762.put(Short.class, "S");
      field_762.put(Character.class, "C");
      field_762.put(Integer.class, "I");
      field_762.put(Float.class, "F");
      field_762.put(Long.class, "J");
      field_762.put(Double.class, "D");
      field_763.put(Boolean.class, "booleanValue");
      field_763.put(Byte.class, "byteValue");
      field_763.put(Short.class, "shortValue");
      field_763.put(Character.class, "charValue");
      field_763.put(Integer.class, "intValue");
      field_763.put(Float.class, "floatValue");
      field_763.put(Long.class, "longValue");
      field_763.put(Double.class, "doubleValue");
   }
}
