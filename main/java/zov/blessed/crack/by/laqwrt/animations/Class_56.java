package zov.blessed.crack.by.laqwrt.animations;

public final class Class_56 {
   private static double field_281 = 1.70158D;
   private static double field_282 = 2.5949095D;
   private static double field_283 = 2.70158D;
   private static double field_284 = 2.0943951023931953D;
   private static double field_285 = 1.3962634015954636D;
   public static final Class_137 field_286 = (var0) -> {
      return var0;
   };
   public static final Class_137 field_287 = method_159(2);
   public static final Class_137 field_288 = method_161(2);
   public static final Class_137 field_289 = method_162(2.0D);
   public static final Class_137 field_290 = method_159(3);
   public static final Class_137 field_291 = method_161(3);
   public static final Class_137 field_292 = method_162(3.0D);
   public static final Class_137 field_293 = method_159(4);
   public static final Class_137 field_294 = method_161(4);
   public static final Class_137 field_295 = method_162(4.0D);
   public static final Class_137 field_296 = method_159(5);
   public static final Class_137 field_297 = method_161(5);
   public static final Class_137 field_298 = method_162(5.0D);
   public static final Class_137 field_299 = (var0) -> {
      return 1.0D - Math.cos(var0 * 3.141592653589793D / 2.0D);
   };
   public static final Class_137 field_300 = (var0) -> {
      return Math.sin(var0 * 3.141592653589793D / 2.0D);
   };
   public static final Class_137 field_301 = (var0) -> {
      return -(Math.cos(3.141592653589793D * var0) - 1.0D) / 2.0D;
   };
   public static final Class_137 field_302 = (var0) -> {
      return 1.0D - Math.sqrt(1.0D - Math.pow(var0, 2.0D));
   };
   public static final Class_137 field_303 = (var0) -> {
      return Math.sqrt(1.0D - Math.pow(var0 - 1.0D, 2.0D));
   };
   public static final Class_137 field_304 = (var0) -> {
      return var0 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(2.0D * var0, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(-2.0D * var0 + 2.0D, 2.0D)) + 1.0D) / 2.0D;
   };
   public static final Class_137 field_305 = (var0) -> {
      return var0 != 0.0D && var0 != 1.0D ? Math.pow(-2.0D, 10.0D * var0 - 10.0D) * Math.sin((var0 * 10.0D - 10.75D) * 2.0943951023931953D) : var0;
   };
   public static final Class_137 field_306 = (var0) -> {
      return var0 != 0.0D && var0 != 1.0D ? Math.pow(2.0D, -10.0D * var0) * Math.sin((var0 * 10.0D - 0.75D) * 2.0943951023931953D) + 1.0D : var0;
   };
   public static final Class_137 field_307 = (var0) -> {
      if (var0 != 0.0D && var0 != 1.0D) {
         return var0 < 0.5D ? -(Math.pow(2.0D, 20.0D * var0 - 10.0D) * Math.sin((20.0D * var0 - 11.125D) * 1.3962634015954636D)) / 2.0D : Math.pow(2.0D, -20.0D * var0 + 10.0D) * Math.sin((20.0D * var0 - 11.125D) * 1.3962634015954636D) / 2.0D + 1.0D;
      } else {
         return var0;
      }
   };
   public static final Class_137 field_308 = (var0) -> {
      return var0 != 0.0D ? Math.pow(2.0D, 10.0D * var0 - 10.0D) : var0;
   };
   public static final Class_137 field_309 = (var0) -> {
      return var0 != 1.0D ? 1.0D - Math.pow(2.0D, -10.0D * var0) : var0;
   };
   public static final Class_137 field_310 = (var0) -> {
      if (var0 != 0.0D && var0 != 1.0D) {
         return var0 < 0.5D ? Math.pow(2.0D, 20.0D * var0 - 10.0D) / 2.0D : (2.0D - Math.pow(2.0D, -20.0D * var0 + 10.0D)) / 2.0D;
      } else {
         return var0;
      }
   };
   public static final Class_137 field_311 = (var0) -> {
      return 2.70158D * Math.pow(var0, 3.0D) - 1.70158D * Math.pow(var0, 2.0D);
   };
   public static final Class_137 field_312 = (var0) -> {
      return 1.0D + 2.70158D * Math.pow(var0 - 1.0D, 3.0D) + 1.70158D * Math.pow(var0 - 1.0D, 2.0D);
   };
   public static final Class_137 field_313 = (var0) -> {
      return var0 < 0.5D ? Math.pow(2.0D * var0, 2.0D) * (7.189819D * var0 - 2.5949095D) / 2.0D : (Math.pow(2.0D * var0 - 2.0D, 2.0D) * (3.5949095D * (var0 * 2.0D - 2.0D) + 2.5949095D) + 2.0D) / 2.0D;
   };
   public static final Class_137 field_314 = (var0) -> {
      double var2 = 7.5625D;
      double var4 = 2.75D;
      if (var0 < 1.0D / var4) {
         return var2 * Math.pow(var0, 2.0D);
      } else if (var0 < 2.0D / var4) {
         return var2 * Math.pow(var0 - 1.5D / var4, 2.0D) + 0.75D;
      } else {
         return var0 < 2.5D / var4 ? var2 * Math.pow(var0 - 2.25D / var4, 2.0D) + 0.9375D : var2 * Math.pow(var0 - 2.625D / var4, 2.0D) + 0.984375D;
      }
   };
   public static final Class_137 field_315 = (var0) -> {
      return 1.0D - field_314.むナ12(1.0D - var0);
   };
   public static final Class_137 field_316 = (var0) -> {
      return var0 < 0.5D ? (1.0D - field_314.むナ12(1.0D - 2.0D * var0)) / 2.0D : (1.0D + field_314.むナ12(2.0D * var0 - 1.0D)) / 2.0D;
   };

   private Class_56() {
   }

   private static Class_137 method_158(double var0) {
      return (var2) -> {
         return Math.pow(var2, var0);
      };
   }

   private static Class_137 method_159(int var0) {
      return method_158((double)var0);
   }

   private static Class_137 method_160(double var0) {
      return (var2) -> {
         return 1.0D - Math.pow(1.0D - var2, var0);
      };
   }

   private static Class_137 method_161(int var0) {
      return method_160((double)var0);
   }

   private static Class_137 method_162(double var0) {
      return (var2) -> {
         return var2 < 0.5D ? Math.pow(2.0D, var0 - 1.0D) * Math.pow(var2, var0) : 1.0D - Math.pow(-2.0D * var2 + 2.0D, var0) / 2.0D;
      };
   }
}
