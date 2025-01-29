package zov.blessed.crack.by.laqwrt;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.function.Predicate;

public class Class_214 {
    private static final HashMap<Integer, Class_225> field_1110 = new HashMap();
    private static final HashMap<Integer, Class_147> field_1111 = new HashMap();

    public static Class_225 method_953(Class<?> var0, int var1) {
        int var2 = Objects.hash(var0, var1);
        Class_225 var3 = field_1110.computeIfAbsent(var2, (var2x) -> {
            Field[] declaredFields = var0.getDeclaredFields();
            Field var4 = declaredFields[var1];
            return new Class_225(var4);
        });
        return var3;
    }

    public static Class_225 method_954(Class<?> var0, String var1) {
        int var2 = Objects.hash(new Object[]{var0, var1});
        Class_225 var3 = (Class_225) field_1110.computeIfAbsent(var2, (var2x) -> {
            try {
                return new Class_225(var0.getDeclaredField(var1));
            } catch (SecurityException | NoSuchFieldException var4) {
                var4.hashCode();
                return null;
            }
        });
        return var3;
    }

    public static Class_225 method_955(Class<?> var0, Predicate<Field> var1) {
        int var2 = Objects.hash(new Object[]{var0, var1});
        Class_225 var3 = field_1110.computeIfAbsent(var2, (var2x) -> {
            Field[] declaredFields = var0.getDeclaredFields();
            Field[] var4 = declaredFields;
            int var5 = declaredFields.length;

            for (int var6 = 0; var6 < var5; ++var6) {
                Field var7 = var4[var6];
                if (var1.test(var7)) {
                    return new Class_225(var7);
                }
            }

            return null;
        });
        return var3;
    }

    public static Class_147 method_956(Class<?> var0, String var1, Class<?>... var2) {
        int var3 = Objects.hash(var0, var1, var2);
        return field_1111.computeIfAbsent(var3, (var3x) -> {
            try {
                return new Class_147(var0.getDeclaredMethod(var1, var2));
            } catch (SecurityException | NoSuchMethodException var6) {
                var6.hashCode();
                return new Class_147(null);
            }
        });
    }

    public static Class_147 method_957(Class<?> var0, Class<?>... var1) {
        int var2 = Objects.hash(var0, var1);
        return field_1111.computeIfAbsent(var2, (var2x) -> {
            Method[] declaredMethods = var0.getDeclaredMethods();
            int var5 = declaredMethods.length;

            for (Method var7 : declaredMethods) {
                if (var7.getParameterCount() == var1.length) {
                    boolean var8 = true;
                    Class[] var9 = var7.getParameterTypes();

                    for (int var10 = 0; var10 < var1.length; ++var10) {
                        if (!var9[var10].isAssignableFrom(var1[var10])) {
                            var8 = false;
                            break;
                        }
                    }

                    if (var8) {
                        return new Class_147(var7);
                    }
                }
            }

            return null;
        });
    }

    public static Class_147 method_958(Class<?> var0, Predicate<Method> var1) {
        int var2 = Objects.hash(var0, var1);
        return field_1111.computeIfAbsent(var2, (var2x) -> {
            Method[] declaredMethods = var0.getDeclaredMethods();
            for (Method var7 : declaredMethods) {
                if (var1.test(var7)) {
                    return new Class_147(var7);
                }
            }

            return null;
        });
    }

    public static ArrayList<Class_225> method_959(Class<?> var0, Predicate<Field> var1) {
        ArrayList<Class_225> var2 = new ArrayList<>();
        Field[] var3 = var0.getDeclaredFields();
        for (Field var7 : var3) {
            if (var1.test(var7)) {
                var2.add(new Class_225(var7));
            }
        }
        return var2;
    }

    public static ArrayList<Class_147> method_960(Class<?> var0, Predicate<Method> var1) {
        ArrayList var2 = new ArrayList<>();
        Method[] var3 = var0.getDeclaredMethods();
        Method[] var4 = var3;
        int var5 = var3.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            Method var7 = var4[var6];
            if (var1.test(var7)) {
                var2.add(new Class_147(var7));
            }
        }

        return var2;
    }

    public static <T> Constructor<T> method_961(Class<T> var0, Class<?>... var1) {
        try {
            return var0.getConstructor(var1);
        } catch (NoSuchMethodException var3) {
            var3.hashCode();
            return null;
        }
    }
}
