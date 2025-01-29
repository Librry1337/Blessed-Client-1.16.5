package zov.blessed.crack.by.laqwrt.govno;

import zov.blessed.crack.by.laqwrt.Class_206;

public abstract class Class_213 {
   private static String field_1107 = "This feature requires ASM5";
   protected final int field_1108;
   public Class_213 field_1109;

   public Class_213(int var1) {
      this(var1, (Class_213)null);
   }

   public Class_213(int var1, Class_213 var2) {
      if (var1 != 589824 && var1 != 524288 && var1 != 458752 && var1 != 393216 && var1 != 327680 && var1 != 262144 && var1 != 17432576) {
         throw new IllegalArgumentException("Unsupported api " + var1);
      } else {
         if (var1 == 17432576) {
            Class_20.method_17(this);
         }

         this.field_1108 = var1;
         this.field_1109 = var2;
      }
   }

   public void method_920(String var1, int var2) {
      if (this.field_1108 < 327680) {
         throw new UnsupportedOperationException("This feature requires ASM5");
      } else {
         if (this.field_1109 != null) {
            this.field_1109.method_920(var1, var2);
         }

      }
   }

   public Class_194 method_921() {
      return this.field_1109 != null ? this.field_1109.method_921() : null;
   }

   public Class_194 method_922(String var1, boolean var2) {
      return this.field_1109 != null ? this.field_1109.method_922(var1, var2) : null;
   }

   public Class_194 method_923(int var1, Class_82 var2, String var3, boolean var4) {
      if (this.field_1108 < 327680) {
         throw new UnsupportedOperationException("This feature requires ASM5");
      } else {
         return this.field_1109 != null ? this.field_1109.method_923(var1, var2, var3, var4) : null;
      }
   }

   public void method_924(int var1, boolean var2) {
      if (this.field_1109 != null) {
         this.field_1109.method_924(var1, var2);
      }

   }

   public Class_194 method_925(int var1, String var2, boolean var3) {
      return this.field_1109 != null ? this.field_1109.method_925(var1, var2, var3) : null;
   }

   public void method_926(Class_98 var1) {
      if (this.field_1109 != null) {
         this.field_1109.method_926(var1);
      }

   }

   public void method_927() {
      if (this.field_1109 != null) {
         this.field_1109.method_927();
      }

   }

   public void method_928(int var1, int var2, Object[] var3, int var4, Object[] var5) {
      if (this.field_1109 != null) {
         this.field_1109.method_928(var1, var2, var3, var4, var5);
      }

   }

   public void method_929(int var1) {
      if (this.field_1109 != null) {
         this.field_1109.method_929(var1);
      }

   }

   public void method_930(int var1, int var2) {
      if (this.field_1109 != null) {
         this.field_1109.method_930(var1, var2);
      }

   }

   public void method_931(int var1, int var2) {
      if (this.field_1109 != null) {
         this.field_1109.method_931(var1, var2);
      }

   }

   public void method_932(int var1, String var2) {
      if (this.field_1109 != null) {
         this.field_1109.method_932(var1, var2);
      }

   }

   public void method_933(int var1, String var2, String var3, String var4) {
      if (this.field_1109 != null) {
         this.field_1109.method_933(var1, var2, var3, var4);
      }

   }

   /** @deprecated */
   @Deprecated
   public void method_934(int var1, String var2, String var3, String var4) {
      int var5 = var1 | (this.field_1108 < 327680 ? 256 : 0);
      this.method_935(var5, var2, var3, var4, var1 == 185);
   }

   public void method_935(int var1, String var2, String var3, String var4, boolean var5) {
      if (this.field_1108 < 327680 && (var1 & 256) == 0) {
         if (var5 != (var1 == 185)) {
            throw new UnsupportedOperationException("INVOKESPECIAL/STATIC on interfaces requires ASM5");
         } else {
            this.method_934(var1, var2, var3, var4);
         }
      } else {
         if (this.field_1109 != null) {
            this.field_1109.method_935(var1 & -257, var2, var3, var4, var5);
         }

      }
   }

   public void method_936(String var1, String var2, Class_206 var3, Object... var4) {
      if (this.field_1108 < 327680) {
         throw new UnsupportedOperationException("This feature requires ASM5");
      } else {
         if (this.field_1109 != null) {
            this.field_1109.method_936(var1, var2, var3, var4);
         }

      }
   }

   public void method_937(int var1, Class_262 var2) {
      if (this.field_1109 != null) {
         this.field_1109.method_937(var1, var2);
      }

   }

   public void method_938(Class_262 var1) {
      if (this.field_1109 != null) {
         this.field_1109.method_938(var1);
      }

   }

   public void method_939(Object var1) {
      if (this.field_1108 < 327680 && (var1 instanceof Class_206 || var1 instanceof Class_260 && ((Class_260)var1).method_1214() == 11)) {
         throw new UnsupportedOperationException("This feature requires ASM5");
      } else if (this.field_1108 < 458752 && var1 instanceof Class_242) {
         throw new UnsupportedOperationException("This feature requires ASM7");
      } else {
         if (this.field_1109 != null) {
            this.field_1109.method_939(var1);
         }

      }
   }

   public void method_940(int var1, int var2) {
      if (this.field_1109 != null) {
         this.field_1109.method_940(var1, var2);
      }

   }

   public void method_941(int var1, int var2, Class_262 var3, Class_262... var4) {
      if (this.field_1109 != null) {
         this.field_1109.method_941(var1, var2, var3, var4);
      }

   }

   public void method_942(Class_262 var1, int[] var2, Class_262[] var3) {
      if (this.field_1109 != null) {
         this.field_1109.method_942(var1, var2, var3);
      }

   }

   public void method_943(String var1, int var2) {
      if (this.field_1109 != null) {
         this.field_1109.method_943(var1, var2);
      }

   }

   public Class_194 method_944(int var1, Class_82 var2, String var3, boolean var4) {
      if (this.field_1108 < 327680) {
         throw new UnsupportedOperationException("This feature requires ASM5");
      } else {
         return this.field_1109 != null ? this.field_1109.method_944(var1, var2, var3, var4) : null;
      }
   }

   public void method_945(Class_262 var1, Class_262 var2, Class_262 var3, String var4) {
      if (this.field_1109 != null) {
         this.field_1109.method_945(var1, var2, var3, var4);
      }

   }

   public Class_194 method_946(int var1, Class_82 var2, String var3, boolean var4) {
      if (this.field_1108 < 327680) {
         throw new UnsupportedOperationException("This feature requires ASM5");
      } else {
         return this.field_1109 != null ? this.field_1109.method_946(var1, var2, var3, var4) : null;
      }
   }

   public void method_947(String var1, String var2, String var3, Class_262 var4, Class_262 var5, int var6) {
      if (this.field_1109 != null) {
         this.field_1109.method_947(var1, var2, var3, var4, var5, var6);
      }

   }

   public Class_194 method_948(int var1, Class_82 var2, Class_262[] var3, Class_262[] var4, int[] var5, String var6, boolean var7) {
      if (this.field_1108 < 327680) {
         throw new UnsupportedOperationException("This feature requires ASM5");
      } else {
         return this.field_1109 != null ? this.field_1109.method_948(var1, var2, var3, var4, var5, var6, var7) : null;
      }
   }

   public void method_949(int var1, Class_262 var2) {
      if (this.field_1109 != null) {
         this.field_1109.method_949(var1, var2);
      }

   }

   public void method_950(int var1, int var2) {
      if (this.field_1109 != null) {
         this.field_1109.method_950(var1, var2);
      }

   }

   public void method_951() {
      if (this.field_1109 != null) {
         this.field_1109.method_951();
      }

   }
}
