package zov.blessed.crack.by.laqwrt.govno;

final class Class_34 extends Class_194 {
   private final Class_170 field_149;
   private final boolean field_150;
   private final Class_25 field_151;
   private final int field_152;
   private int field_153;
   private final Class_34 field_154;
   private Class_34 field_155;

   Class_34(Class_170 var1, boolean var2, Class_25 var3, Class_34 var4) {
      super(589824);
      this.field_149 = var1;
      this.field_150 = var2;
      this.field_151 = var3;
      this.field_152 = var3.field_131 == 0 ? -1 : var3.field_131 - 2;
      this.field_154 = var4;
      if (var4 != null) {
         var4.field_155 = this;
      }

   }

   static Class_34 method_54(Class_170 var0, String var1, Class_34 var2) {
      Class_25 var3 = new Class_25();
      var3.method_24(var0.method_685(var1)).method_24(0);
      return new Class_34(var0, true, var3, var2);
   }

   static Class_34 method_55(Class_170 var0, int var1, Class_82 var2, String var3, Class_34 var4) {
      Class_25 var5 = new Class_25();
      Class_145.method_521(var1, var5);
      Class_82.method_291(var2, var5);
      var5.method_24(var0.method_685(var3)).method_24(0);
      return new Class_34(var0, true, var5, var4);
   }

   public void method_851(String var1, Object var2) {
      ++this.field_153;
      if (this.field_150) {
         this.field_151.method_24(this.field_149.method_685(var1));
      }

      if (var2 instanceof String) {
         this.field_151.method_25(115, this.field_149.method_685((String)var2));
      } else if (var2 instanceof Byte) {
         this.field_151.method_25(66, this.field_149.method_675((Byte)var2).field_959);
      } else if (var2 instanceof Boolean) {
         int var3 = (Boolean)var2 ? 1 : 0;
         this.field_151.method_25(90, this.field_149.method_675(var3).field_959);
      } else if (var2 instanceof Character) {
         this.field_151.method_25(67, this.field_149.method_675((Character)var2).field_959);
      } else if (var2 instanceof Short) {
         this.field_151.method_25(83, this.field_149.method_675((Short)var2).field_959);
      } else if (var2 instanceof Class_260) {
         this.field_151.method_25(99, this.field_149.method_685(((Class_260)var2).method_1207()));
      } else {
         int var5;
         int var6;
         if (var2 instanceof byte[]) {
            byte[] var9 = (byte[])var2;
            this.field_151.method_25(91, var9.length);
            byte[] var4 = var9;
            var5 = var9.length;

            for(var6 = 0; var6 < var5; ++var6) {
               byte var7 = var4[var6];
               this.field_151.method_25(66, this.field_149.method_675(var7).field_959);
            }
         } else if (var2 instanceof boolean[]) {
            boolean[] var10 = (boolean[])var2;
            this.field_151.method_25(91, var10.length);
            boolean[] var12 = var10;
            var5 = var10.length;

            for(var6 = 0; var6 < var5; ++var6) {
               boolean var25 = var12[var6];
               this.field_151.method_25(90, this.field_149.method_675(var25 ? 1 : 0).field_959);
            }
         } else if (var2 instanceof short[]) {
            short[] var11 = (short[])var2;
            this.field_151.method_25(91, var11.length);
            short[] var14 = var11;
            var5 = var11.length;

            for(var6 = 0; var6 < var5; ++var6) {
               short var26 = var14[var6];
               this.field_151.method_25(83, this.field_149.method_675(var26).field_959);
            }
         } else if (var2 instanceof char[]) {
            char[] var13 = (char[])var2;
            this.field_151.method_25(91, var13.length);
            char[] var16 = var13;
            var5 = var13.length;

            for(var6 = 0; var6 < var5; ++var6) {
               char var27 = var16[var6];
               this.field_151.method_25(67, this.field_149.method_675(var27).field_959);
            }
         } else if (var2 instanceof int[]) {
            int[] var15 = (int[])var2;
            this.field_151.method_25(91, var15.length);
            int[] var18 = var15;
            var5 = var15.length;

            for(var6 = 0; var6 < var5; ++var6) {
               int var28 = var18[var6];
               this.field_151.method_25(73, this.field_149.method_675(var28).field_959);
            }
         } else if (var2 instanceof long[]) {
            long[] var17 = (long[])var2;
            this.field_151.method_25(91, var17.length);
            long[] var20 = var17;
            var5 = var17.length;

            for(var6 = 0; var6 < var5; ++var6) {
               long var29 = var20[var6];
               this.field_151.method_25(74, this.field_149.method_679(var29).field_959);
            }
         } else if (var2 instanceof float[]) {
            float[] var19 = (float[])var2;
            this.field_151.method_25(91, var19.length);
            float[] var22 = var19;
            var5 = var19.length;

            for(var6 = 0; var6 < var5; ++var6) {
               float var30 = var22[var6];
               this.field_151.method_25(70, this.field_149.method_676(var30).field_959);
            }
         } else if (var2 instanceof double[]) {
            double[] var21 = (double[])var2;
            this.field_151.method_25(91, var21.length);
            double[] var24 = var21;
            var5 = var21.length;

            for(var6 = 0; var6 < var5; ++var6) {
               double var31 = var24[var6];
               this.field_151.method_25(68, this.field_149.method_680(var31).field_959);
            }
         } else {
            Class_179 var23 = this.field_149.method_668(var2);
            this.field_151.method_25(".s.IFJDCS".charAt(var23.field_960), var23.field_959);
         }
      }

   }

   public void method_852(String var1, String var2, String var3) {
      ++this.field_153;
      if (this.field_150) {
         this.field_151.method_24(this.field_149.method_685(var1));
      }

      this.field_151.method_25(101, this.field_149.method_685(var2)).method_24(this.field_149.method_685(var3));
   }

   public Class_194 method_853(String var1, String var2) {
      ++this.field_153;
      if (this.field_150) {
         this.field_151.method_24(this.field_149.method_685(var1));
      }

      this.field_151.method_25(64, this.field_149.method_685(var2)).method_24(0);
      return new Class_34(this.field_149, true, this.field_151, (Class_34)null);
   }

   public Class_194 method_854(String var1) {
      ++this.field_153;
      if (this.field_150) {
         this.field_151.method_24(this.field_149.method_685(var1));
      }

      this.field_151.method_25(91, 0);
      return new Class_34(this.field_149, false, this.field_151, (Class_34)null);
   }

   public void method_855() {
      if (this.field_152 != -1) {
         byte[] var1 = this.field_151.field_130;
         var1[this.field_152] = (byte)(this.field_153 >>> 8);
         var1[this.field_152 + 1] = (byte)this.field_153;
      }

   }

   int method_56(String var1) {
      if (var1 != null) {
         this.field_149.method_685(var1);
      }

      int var2 = 8;

      for(Class_34 var3 = this; var3 != null; var3 = var3.field_154) {
         var2 += var3.field_151.field_131;
      }

      return var2;
   }

   static int method_57(Class_34 var0, Class_34 var1, Class_34 var2, Class_34 var3) {
      int var4 = 0;
      if (var0 != null) {
         var4 += var0.method_56("RuntimeVisibleAnnotations");
      }

      if (var1 != null) {
         var4 += var1.method_56("RuntimeInvisibleAnnotations");
      }

      if (var2 != null) {
         var4 += var2.method_56("RuntimeVisibleTypeAnnotations");
      }

      if (var3 != null) {
         var4 += var3.method_56("RuntimeInvisibleTypeAnnotations");
      }

      return var4;
   }

   void method_58(int var1, Class_25 var2) {
      int var3 = 2;
      int var4 = 0;
      Class_34 var5 = this;

      Class_34 var6;
      for(var6 = null; var5 != null; var5 = var5.field_154) {
         var5.method_855();
         var3 += var5.field_151.field_131;
         ++var4;
         var6 = var5;
      }

      var2.method_24(var1);
      var2.method_27(var3);
      var2.method_24(var4);

      for(var5 = var6; var5 != null; var5 = var5.field_155) {
         var2.method_32(var5.field_151.field_130, 0, var5.field_151.field_131);
      }

   }

   static void method_59(Class_170 var0, Class_34 var1, Class_34 var2, Class_34 var3, Class_34 var4, Class_25 var5) {
      if (var1 != null) {
         var1.method_58(var0.method_685("RuntimeVisibleAnnotations"), var5);
      }

      if (var2 != null) {
         var2.method_58(var0.method_685("RuntimeInvisibleAnnotations"), var5);
      }

      if (var3 != null) {
         var3.method_58(var0.method_685("RuntimeVisibleTypeAnnotations"), var5);
      }

      if (var4 != null) {
         var4.method_58(var0.method_685("RuntimeInvisibleTypeAnnotations"), var5);
      }

   }

   static int method_60(String var0, Class_34[] var1, int var2) {
      int var3 = 7 + 2 * var2;

      for(int var4 = 0; var4 < var2; ++var4) {
         Class_34 var5 = var1[var4];
         var3 += var5 == null ? 0 : var5.method_56(var0) - 8;
      }

      return var3;
   }

   static void method_61(int var0, Class_34[] var1, int var2, Class_25 var3) {
      int var4 = 1 + 2 * var2;

      int var5;
      Class_34 var6;
      for(var5 = 0; var5 < var2; ++var5) {
         var6 = var1[var5];
         var4 += var6 == null ? 0 : var6.method_56((String)null) - 8;
      }

      var3.method_24(var0);
      var3.method_27(var4);
      var3.method_22(var2);

      for(var5 = 0; var5 < var2; ++var5) {
         var6 = var1[var5];
         Class_34 var7 = null;

         int var8;
         for(var8 = 0; var6 != null; var6 = var6.field_154) {
            var6.method_855();
            ++var8;
            var7 = var6;
         }

         var3.method_24(var8);

         for(var6 = var7; var6 != null; var6 = var6.field_155) {
            var3.method_32(var6.field_151.field_130, 0, var6.field_151.field_131);
         }
      }

   }
}
