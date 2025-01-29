package zov.blessed.crack.by.laqwrt.govno;

import zov.blessed.crack.by.laqwrt.Class_206;

final class Class_170 {
   final Class_160 field_906;
   private final Class_81 field_907;
   private int field_908;
   private String field_909;
   private int field_910;
   private Class_189[] field_911;
   private int field_912;
   private Class_25 field_913;
   private int field_914;
   private Class_25 field_915;
   private int field_916;
   private Class_189[] field_917;

   Class_170(Class_160 var1) {
      this.field_906 = var1;
      this.field_907 = null;
      this.field_911 = new Class_189[256];
      this.field_912 = 1;
      this.field_913 = new Class_25();
   }

   Class_170(Class_160 var1, Class_81 var2) {
      this.field_906 = var1;
      this.field_907 = var2;
      byte[] var3 = var2.field_623;
      int var4 = var2.method_271(1) - 1;
      int var5 = var2.field_622 - var4;
      this.field_912 = var2.method_270();
      this.field_913 = new Class_25(var5);
      this.field_913.method_32(var3, var4, var5);
      this.field_911 = new Class_189[this.field_912 * 2];
      char[] var6 = new char[var2.method_272()];
      boolean var7 = false;

      byte var10;
      for(int var8 = 1; var8 < this.field_912; var8 += var10 != 5 && var10 != 6 ? 1 : 2) {
         int var9 = var2.method_271(var8);
         var10 = var3[var9 - 1];
         int var11;
         switch(var10) {
         case 1:
            this.method_686(var8, var2.method_279(var8, var6));
            break;
         case 2:
         case 13:
         case 14:
         default:
            throw new IllegalArgumentException();
         case 3:
         case 4:
            this.method_678(var8, var10, var2.method_276(var9));
            break;
         case 5:
         case 6:
            this.method_682(var8, var10, var2.method_277(var9));
            break;
         case 7:
         case 8:
         case 16:
         case 19:
         case 20:
            this.method_697(var8, var10, var2.method_278(var9, var6));
            break;
         case 9:
         case 10:
         case 11:
            var11 = var2.method_271(var2.method_274(var9 + 2));
            this.method_673(var8, var10, var2.method_282(var9, var6), var2.method_278(var11, var6), var2.method_278(var11 + 2, var6));
            break;
         case 12:
            this.method_684(var8, var2.method_278(var9, var6), var2.method_278(var9 + 2, var6));
            break;
         case 15:
            int var12 = var2.method_271(var2.method_274(var9 + 1));
            var11 = var2.method_271(var2.method_274(var12 + 2));
            this.method_688(var8, var2.method_273(var9), var2.method_282(var12, var6), var2.method_278(var11, var6), var2.method_278(var11 + 2, var6));
            break;
         case 17:
         case 18:
            var7 = true;
            var11 = var2.method_271(var2.method_274(var9 + 2));
            this.method_693(var10, var8, var2.method_278(var11, var6), var2.method_278(var11 + 2, var6), var2.method_274(var9));
         }
      }

      if (var7) {
         this.method_655(var2, var6);
      }

   }

   private void method_655(Class_81 var1, char[] var2) {
      byte[] var3 = var1.field_623;
      int var4 = var1.method_267();

      int var5;
      for(var5 = var1.method_274(var4 - 2); var5 > 0; --var5) {
         String var6 = var1.method_278(var4, var2);
         if ("BootstrapMethods".equals(var6)) {
            this.field_914 = var1.method_274(var4 + 6);
            break;
         }

         var4 += 6 + var1.method_276(var4 + 2);
      }

      if (this.field_914 > 0) {
         var5 = var4 + 8;
         int var14 = var1.method_276(var4 + 2) - 2;
         this.field_915 = new Class_25(var14);
         this.field_915.method_32(var3, var5, var14);
         int var7 = var5;

         for(int var8 = 0; var8 < this.field_914; ++var8) {
            int var9 = var7 - var5;
            int var10 = var1.method_274(var7);
            var7 += 2;
            int var11 = var1.method_274(var7);
            var7 += 2;

            int var12;
            int var13;
            for(var12 = var1.method_286(var10, var2).hashCode(); var11-- > 0; var12 ^= var1.method_286(var13, var2).hashCode()) {
               var13 = var1.method_274(var7);
               var7 += 2;
            }

            this.method_667(new Class_189(var8, 64, (long)var9, var12 & Integer.MAX_VALUE));
         }
      }

   }

   Class_81 method_656() {
      return this.field_907;
   }

   int method_657() {
      return this.field_908;
   }

   String method_658() {
      return this.field_909;
   }

   int method_659(int var1, String var2) {
      this.field_908 = var1;
      this.field_909 = var2;
      return this.method_669(var2).field_959;
   }

   int method_660() {
      return this.field_912;
   }

   int method_661() {
      return this.field_913.field_131;
   }

   void method_662(Class_25 var1) {
      var1.method_24(this.field_912).method_32(this.field_913.field_130, 0, this.field_913.field_131);
   }

   int method_663() {
      if (this.field_915 != null) {
         this.method_685("BootstrapMethods");
         return 8 + this.field_915.field_131;
      } else {
         return 0;
      }
   }

   void method_664(Class_25 var1) {
      if (this.field_915 != null) {
         var1.method_24(this.method_685("BootstrapMethods")).method_27(this.field_915.field_131 + 2).method_24(this.field_914).method_32(this.field_915.field_130, 0, this.field_915.field_131);
      }

   }

   private Class_189 method_665(int var1) {
      return this.field_911[var1 % this.field_911.length];
   }

   private Class_189 method_666(Class_189 var1) {
      int var2;
      if (this.field_910 > this.field_911.length * 3 / 4) {
         var2 = this.field_911.length;
         int var3 = var2 * 2 + 1;
         Class_189[] var4 = new Class_189[var3];

         Class_189 var8;
         for(int var5 = var2 - 1; var5 >= 0; --var5) {
            for(Class_189 var6 = this.field_911[var5]; var6 != null; var6 = var8) {
               int var7 = var6.field_1030 % var3;
               var8 = var6.field_1031;
               var6.field_1031 = var4[var7];
               var4[var7] = var6;
            }
         }

         this.field_911 = var4;
      }

      ++this.field_910;
      var2 = var1.field_1030 % this.field_911.length;
      var1.field_1031 = this.field_911[var2];
      return this.field_911[var2] = var1;
   }

   private void method_667(Class_189 var1) {
      ++this.field_910;
      int var2 = var1.field_1030 % this.field_911.length;
      var1.field_1031 = this.field_911[var2];
      this.field_911[var2] = var1;
   }

   Class_179 method_668(Object var1) {
      if (var1 instanceof Integer) {
         return this.method_675((Integer)var1);
      } else if (var1 instanceof Byte) {
         return this.method_675(((Byte)var1).intValue());
      } else if (var1 instanceof Character) {
         return this.method_675((Character)var1);
      } else if (var1 instanceof Short) {
         return this.method_675(((Short)var1).intValue());
      } else if (var1 instanceof Boolean) {
         return this.method_675((Boolean)var1 ? 1 : 0);
      } else if (var1 instanceof Float) {
         return this.method_676((Float)var1);
      } else if (var1 instanceof Long) {
         return this.method_679((Long)var1);
      } else if (var1 instanceof Double) {
         return this.method_680((Double)var1);
      } else if (var1 instanceof String) {
         return this.method_674((String)var1);
      } else if (var1 instanceof Class_260) {
         Class_260 var5 = (Class_260)var1;
         int var3 = var5.method_1214();
         if (var3 == 10) {
            return this.method_669(var5.method_1205());
         } else {
            return var3 == 11 ? this.method_689(var5.method_1207()) : this.method_669(var5.method_1207());
         }
      } else if (var1 instanceof Class_206) {
         Class_206 var4 = (Class_206)var1;
         return this.method_687(var4.method_900(), var4.method_901(), var4.method_902(), var4.method_903(), var4.method_904());
      } else if (var1 instanceof Class_242) {
         Class_242 var2 = (Class_242)var1;
         return this.method_690(var2.method_1106(), var2.method_1107(), var2.method_1108(), var2.method_1111());
      } else {
         throw new IllegalArgumentException("value " + var1);
      }
   }

   Class_179 method_669(String var1) {
      return this.method_696(7, var1);
   }

   Class_179 method_670(String var1, String var2, String var3) {
      return this.method_672(9, var1, var2, var3);
   }

   Class_179 method_671(String var1, String var2, String var3, boolean var4) {
      int var5 = var4 ? 11 : 10;
      return this.method_672(var5, var1, var2, var3);
   }

   private Class_189 method_672(int var1, String var2, String var3, String var4) {
      int var5 = method_711(var1, var2, var3, var4);

      for(Class_189 var6 = this.method_665(var5); var6 != null; var6 = var6.field_1031) {
         if (var6.field_960 == var1 && var6.field_1030 == var5 && var6.field_961.equals(var2) && var6.field_962.equals(var3) && var6.field_963.equals(var4)) {
            return var6;
         }
      }

      this.field_913.method_28(var1, this.method_669(var2).field_959, this.method_683(var3, var4));
      return this.method_666(new Class_189(this.field_912++, var1, var2, var3, var4, 0L, var5));
   }

   private void method_673(int var1, int var2, String var3, String var4, String var5) {
      this.method_667(new Class_189(var1, var2, var3, var4, var5, 0L, method_711(var2, var3, var4, var5)));
   }

   Class_179 method_674(String var1) {
      return this.method_696(8, var1);
   }

   Class_179 method_675(int var1) {
      return this.method_677(3, var1);
   }

   Class_179 method_676(float var1) {
      return this.method_677(4, Float.floatToRawIntBits(var1));
   }

   private Class_179 method_677(int var1, int var2) {
      int var3 = method_705(var1, var2);

      for(Class_189 var4 = this.method_665(var3); var4 != null; var4 = var4.field_1031) {
         if (var4.field_960 == var1 && var4.field_1030 == var3 && var4.field_964 == (long)var2) {
            return var4;
         }
      }

      this.field_913.method_22(var1).method_27(var2);
      return this.method_666(new Class_189(this.field_912++, var1, (long)var2, var3));
   }

   private void method_678(int var1, int var2, int var3) {
      this.method_667(new Class_189(var1, var2, (long)var3, method_705(var2, var3)));
   }

   Class_179 method_679(long var1) {
      return this.method_681(5, var1);
   }

   Class_179 method_680(double var1) {
      return this.method_681(6, Double.doubleToRawLongBits(var1));
   }

   private Class_179 method_681(int var1, long var2) {
      int var4 = method_706(var1, var2);

      for(Class_189 var5 = this.method_665(var4); var5 != null; var5 = var5.field_1031) {
         if (var5.field_960 == var1 && var5.field_1030 == var4 && var5.field_964 == var2) {
            return var5;
         }
      }

      int var6 = this.field_912;
      this.field_913.method_22(var1).method_29(var2);
      this.field_912 += 2;
      return this.method_666(new Class_189(var6, var1, var2, var4));
   }

   private void method_682(int var1, int var2, long var3) {
      this.method_667(new Class_189(var1, var2, var3, method_706(var2, var3)));
   }

   int method_683(String var1, String var2) {
      boolean var3 = true;
      int var4 = method_709(12, var1, var2);

      for(Class_189 var5 = this.method_665(var4); var5 != null; var5 = var5.field_1031) {
         if (var5.field_960 == 12 && var5.field_1030 == var4 && var5.field_962.equals(var1) && var5.field_963.equals(var2)) {
            return var5.field_959;
         }
      }

      this.field_913.method_28(12, this.method_685(var1), this.method_685(var2));
      return this.method_666(new Class_189(this.field_912++, 12, var1, var2, var4)).field_959;
   }

   private void method_684(int var1, String var2, String var3) {
      boolean var4 = true;
      this.method_667(new Class_189(var1, 12, var2, var3, method_709(12, var2, var3)));
   }

   int method_685(String var1) {
      int var2 = method_707(1, var1);

      for(Class_189 var3 = this.method_665(var2); var3 != null; var3 = var3.field_1031) {
         if (var3.field_960 == 1 && var3.field_1030 == var2 && var3.field_963.equals(var1)) {
            return var3.field_959;
         }
      }

   //   this.field_913.method_22(1).method_30(var1);
      return this.method_666(new Class_189(this.field_912++, 1, var1, var2)).field_959;
   }

   private void method_686(int var1, String var2) {
      this.method_667(new Class_189(var1, 1, var2, method_707(1, var2)));
   }

   Class_179 method_687(int var1, String var2, String var3, String var4, boolean var5) {
      boolean var6 = true;
      int var7 = method_712(15, var2, var3, var4, var1);

      for(Class_189 var8 = this.method_665(var7); var8 != null; var8 = var8.field_1031) {
         if (var8.field_960 == 15 && var8.field_1030 == var7 && var8.field_964 == (long)var1 && var8.field_961.equals(var2) && var8.field_962.equals(var3) && var8.field_963.equals(var4)) {
            return var8;
         }
      }

      if (var1 <= 4) {
         this.field_913.method_26(15, var1, this.method_670(var2, var3, var4).field_959);
      } else {
         this.field_913.method_26(15, var1, this.method_671(var2, var3, var4, var5).field_959);
      }

      return this.method_666(new Class_189(this.field_912++, 15, var2, var3, var4, (long)var1, var7));
   }

   private void method_688(int var1, int var2, String var3, String var4, String var5) {
      boolean var6 = true;
      int var7 = method_712(15, var3, var4, var5, var2);
      this.method_667(new Class_189(var1, 15, var3, var4, var5, (long)var2, var7));
   }

   Class_179 method_689(String var1) {
      return this.method_696(16, var1);
   }

   Class_179 method_690(String var1, String var2, Class_206 var3, Object... var4) {
      Class_179 var5 = this.method_698(var3, var4);
      return this.method_692(17, var1, var2, var5.field_959);
   }

   Class_179 method_691(String var1, String var2, Class_206 var3, Object... var4) {
      Class_179 var5 = this.method_698(var3, var4);
      return this.method_692(18, var1, var2, var5.field_959);
   }

   private Class_179 method_692(int var1, String var2, String var3, int var4) {
      int var5 = method_710(var1, var2, var3, var4);

      for(Class_189 var6 = this.method_665(var5); var6 != null; var6 = var6.field_1031) {
         if (var6.field_960 == var1 && var6.field_1030 == var5 && var6.field_964 == (long)var4 && var6.field_962.equals(var2) && var6.field_963.equals(var3)) {
            return var6;
         }
      }

      this.field_913.method_28(var1, var4, this.method_683(var2, var3));
      return this.method_666(new Class_189(this.field_912++, var1, (String)null, var2, var3, (long)var4, var5));
   }

   private void method_693(int var1, int var2, String var3, String var4, int var5) {
      int var6 = method_710(var1, var3, var4, var5);
      this.method_667(new Class_189(var2, var1, (String)null, var3, var4, (long)var5, var6));
   }

   Class_179 method_694(String var1) {
      return this.method_696(19, var1);
   }

   Class_179 method_695(String var1) {
      return this.method_696(20, var1);
   }

   private Class_179 method_696(int var1, String var2) {
      int var3 = method_707(var1, var2);

      for(Class_189 var4 = this.method_665(var3); var4 != null; var4 = var4.field_1031) {
         if (var4.field_960 == var1 && var4.field_1030 == var3 && var4.field_963.equals(var2)) {
            return var4;
         }
      }

      this.field_913.method_25(var1, this.method_685(var2));
      return this.method_666(new Class_189(this.field_912++, var1, var2, var3));
   }

   private void method_697(int var1, int var2, String var3) {
      this.method_667(new Class_189(var1, var2, var3, method_707(var2, var3)));
   }

   Class_179 method_698(Class_206 var1, Object... var2) {
      Class_25 var3 = this.field_915;
      if (var3 == null) {
         var3 = this.field_915 = new Class_25();
      }

      int var4 = var2.length;
      int[] var5 = new int[var4];

      int var6;
      for(var6 = 0; var6 < var4; ++var6) {
         var5[var6] = this.method_668(var2[var6]).field_959;
      }

      var6 = var3.field_131;
      var3.method_24(this.method_687(var1.method_900(), var1.method_901(), var1.method_902(), var1.method_903(), var1.method_904()).field_959);
      var3.method_24(var4);

      int var7;
      for(var7 = 0; var7 < var4; ++var7) {
         var3.method_24(var5[var7]);
      }

      var7 = var3.field_131 - var6;
      int var8 = var1.hashCode();
      Object[] var9 = var2;
      int var10 = var2.length;

      for(int var11 = 0; var11 < var10; ++var11) {
         Object var12 = var9[var11];
         var8 ^= var12.hashCode();
      }

      var8 &= Integer.MAX_VALUE;
      return this.method_699(var6, var7, var8);
   }

   private Class_179 method_699(int var1, int var2, int var3) {
      byte[] var4 = this.field_915.field_130;

      for(Class_189 var5 = this.method_665(var3); var5 != null; var5 = var5.field_1031) {
         if (var5.field_960 == 64 && var5.field_1030 == var3) {
            int var6 = (int)var5.field_964;
            boolean var7 = true;

            for(int var8 = 0; var8 < var2; ++var8) {
               if (var4[var1 + var8] != var4[var6 + var8]) {
                  var7 = false;
                  break;
               }
            }

            if (var7) {
               this.field_915.field_131 = var1;
               return var5;
            }
         }
      }

      return this.method_666(new Class_189(this.field_914++, 64, (long)var1, var3));
   }

   Class_179 method_700(int var1) {
      return this.field_917[var1];
   }

   int method_701(String var1) {
      int var2 = method_707(128, var1);

      for(Class_189 var3 = this.method_665(var2); var3 != null; var3 = var3.field_1031) {
         if (var3.field_960 == 128 && var3.field_1030 == var2 && var3.field_963.equals(var1)) {
            return var3.field_959;
         }
      }

      return this.method_704(new Class_189(this.field_916, 128, var1, var2));
   }

   int method_702(String var1, int var2) {
      int var3 = method_708(129, var1, var2);

      for(Class_189 var4 = this.method_665(var3); var4 != null; var4 = var4.field_1031) {
         if (var4.field_960 == 129 && var4.field_1030 == var3 && var4.field_964 == (long)var2 && var4.field_963.equals(var1)) {
            return var4.field_959;
         }
      }

      return this.method_704(new Class_189(this.field_916, 129, var1, (long)var2, var3));
   }

   int method_703(int var1, int var2) {
      long var3 = var1 < var2 ? (long)var1 | (long)var2 << 32 : (long)var2 | (long)var1 << 32;
      int var5 = method_705(130, var1 + var2);

      for(Class_189 var6 = this.method_665(var5); var6 != null; var6 = var6.field_1031) {
         if (var6.field_960 == 130 && var6.field_1030 == var5 && var6.field_964 == var3) {
            return var6.field_965;
         }
      }

      String var7 = this.field_917[var1].field_963;
      String var8 = this.field_917[var2].field_963;
      int var9 = this.method_701(this.field_906.method_599(var7, var8));
      this.method_666(new Class_189(this.field_916, 130, var3, var5)).field_965 = var9;
      return var9;
   }

   private int method_704(Class_189 var1) {
      if (this.field_917 == null) {
         this.field_917 = new Class_189[16];
      }

      if (this.field_916 == this.field_917.length) {
         Class_189[] var2 = new Class_189[2 * this.field_917.length];
         System.arraycopy(this.field_917, 0, var2, 0, this.field_917.length);
         this.field_917 = var2;
      }

      this.field_917[this.field_916++] = var1;
      return this.method_666(var1).field_959;
   }

   private static int method_705(int var0, int var1) {
      return Integer.MAX_VALUE & var0 + var1;
   }

   private static int method_706(int var0, long var1) {
      return Integer.MAX_VALUE & var0 + (int)var1 + (int)(var1 >>> 32);
   }

   private static int method_707(int var0, String var1) {
      return 0;
   }

   private static int method_708(int var0, String var1, int var2) {
      return Integer.MAX_VALUE & var0 + var1.hashCode() + var2;
   }

   private static int method_709(int var0, String var1, String var2) {
      return Integer.MAX_VALUE & var0 + var1.hashCode() * var2.hashCode();
   }

   private static int method_710(int var0, String var1, String var2, int var3) {
      return Integer.MAX_VALUE & var0 + var1.hashCode() * var2.hashCode() * (var3 + 1);
   }

   private static int method_711(int var0, String var1, String var2, String var3) {
      return Integer.MAX_VALUE & var0 + var1.hashCode() * var2.hashCode() * var3.hashCode();
   }

   private static int method_712(int var0, String var1, String var2, String var3, int var4) {
      return Integer.MAX_VALUE & var0 + var1.hashCode() * var2.hashCode() * var3.hashCode() * var4;
   }
}
