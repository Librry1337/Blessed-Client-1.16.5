package zov.blessed.crack.by.laqwrt;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Vector;
import java.util.function.Predicate;

public class Class_253 {
   private static Field field_1203;

   public static Field method_1143(Class<?> var0, int var1) {
      try {
         return (Field)method_1164(method_1152(var0, var1));
      } catch (SecurityException var3) {
         var3.hashCode();
         return null;
      }
   }

   public static Field method_1144(Class<?> var0, String var1) {
      try {
         return (Field)method_1164(method_1151(var0, var1));
      } catch (SecurityException var3) {
         var3.hashCode();
         return null;
      }
   }

   public static Field method_1145(Class<?> var0, Predicate<Field> var1) {
      Field var2 = method_1154(var0, var1);
      return var2 == null ? null : (Field)method_1164(var2);
   }

   public static Method method_1146(Class<?> var0, String var1, Class<?>... var2) {
      try {
         return (Method)method_1164(method_1153(var0, var1, var2));
      } catch (SecurityException var4) {
         var4.hashCode();
         return null;
      }
   }

   public static Method method_1147(Class<?> var0, Class<?>... var1) {
      Method var2 = method_1155(var0, (var1x) -> {
         if (var1x.getParameterCount() != var1.length) {
            return false;
         } else {
            for(int index = 0; index < var1.length; ++index) {
               Class var3 = var1[index];
               if (var1x.getParameterTypes()[index] != var3) {
                  return false;
               }
            }

            return true;
         }
      });
      return var2 == null ? null : (Method)method_1164(var2);
   }

   public static Method method_1148(Class<?> var0, Predicate<Method> var1) {
      Method var2 = method_1155(var0, var1);
      return var2 == null ? null : (Method)method_1164(var2);
   }

   public static Field[] method_1149(Class<?> var0, Predicate<Field> var1) {
      Vector var2 = new Vector();
      Field[] var3 = method_1156(var0);

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Field var5 = var3[var4];
         if (var1.test(var5)) {
            var2.add(var5);
         }
      }

      return (Field[])var2.toArray(new Field[0]);
   }

   public static Method[] method_1150(Class<?> var0, Predicate<Method> var1) {
      Vector var2 = new Vector();
      Method[] var3 = method_1157(var0);

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Method var5 = var3[var4];
         if (var1.test(var5)) {
            var2.add(var5);
         }
      }

      return (Method[])var2.toArray(new Method[0]);
   }

   public static Field method_1151(Class<?> var0, String var1) {
      try {
         return var0.getDeclaredField(var1);
      } catch (SecurityException | NoSuchFieldException var3) {
         var3.hashCode();
         return null;
      }
   }

   public static Field method_1152(Class<?> var0, int var1) {
      try {
         return var0.getDeclaredFields()[var1];
      } catch (SecurityException var3) {
         var3.hashCode();
         return null;
      }
   }

   public static Method method_1153(Class<?> var0, String var1, Class<?>... var2) {
      try {
         return var0.getDeclaredMethod(var1, var2);
      } catch (SecurityException | NoSuchMethodException var4) {
         var4.hashCode();
         return null;
      }
   }

   public static Field method_1154(Class<?> var0, Predicate<Field> var1) {
      Field[] var2 = method_1156(var0);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Field var4 = var2[var3];
         if (var1.test(var4)) {
            return var4;
         }
      }

      return null;
   }

   public static Method method_1155(Class<?> var0, Predicate<Method> var1) {
      Method[] var2 = method_1157(var0);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Method var4 = var2[var3];
         if (var1.test(var4)) {
            return var4;
         }
      }

      return null;
   }

   public static Field[] method_1156(Class<?> var0) {
      return var0.getDeclaredFields();
   }

   public static Method[] method_1157(Class<?> var0) {
      return var0.getDeclaredMethods();
   }

   public static <T> T method_1158(Field var0) {
      return method_1159(var0, (Object)null);
   }

   public static <T> T method_1159(Field var0, Object var1) {
      try {
         return (T) var0.get(var1);
      } catch (IllegalAccessException | IllegalArgumentException var3) {
         var3.hashCode();
         return null;
      }
   }

   public static void method_1160(Field var0, Object var1) {
      method_1161(var0, (Object)null, var1);
   }

   public static void method_1161(Field var0, Object var1, Object var2) {
      try {
         var0.set(var1, var2);
      } catch (IllegalAccessException | IllegalArgumentException var4) {
         var4.hashCode();
      }

   }

   public static <T> T method_1162(Method var0, Object... var1) {
      return method_1163(var0, (Object)null, var1);
   }

   public static <T> T method_1163(Method var0, Object var1, Object... var2) {
      try {
         return (T) var0.invoke(var1, var2);
      } catch (IllegalArgumentException | InvocationTargetException | IllegalAccessException var4) {
         var4.hashCode();
         return null;
      }
   }

   public static <T extends AccessibleObject> T method_1164(AccessibleObject var0) {
      if (var0 == null) {
         return null;
      } else {
         var0.setAccessible(true);
         if (var0 instanceof Field && Modifier.isFinal(((Field)var0).getModifiers())) {
            method_1165((Field)var0);
         }

         return (T) var0;
      }
   }

   private static void method_1165(Field var0) {
      if (field_1203 == null) {
         field_1203 = method_1151(Field.class, "modifiers");
      }

      if (field_1203 == null) {
         method_1161(field_1203, var0, var0.getModifiers() & -17);
      }
   }
}
