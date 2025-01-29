package zov.blessed.crack.by.laqwrt.govno;

public class Class_262 {
   static int field_1246 = 1;
   static int field_1247 = 2;
   static int field_1248 = 4;
   static int field_1249 = 8;
   static int field_1250 = 16;
   static int field_1251 = 32;
   static int field_1252 = 64;
   static int field_1253 = 4;
   static int field_1254 = 6;
   static int field_1255 = -268435456;
   static int field_1256 = 268435456;
   static int field_1257 = 536870912;
   static int field_1258 = 268435455;
   static final Class_262 field_1259 = new Class_262();
   public Object field_1260;
   short field_1261;
   private short field_1262;
   private int[] field_1263;
   int field_1264;
   private int[] field_1265;
   short field_1266;
   short field_1267;
   short field_1268;
   short field_1269;
   Class_45 field_1270;
   Class_262 field_1271;
   Class_54 field_1272;
   Class_262 field_1273;

   public int method_1220() {
      if ((this.field_1261 & 4) == 0) {
         throw new IllegalStateException("Label offset position has not been resolved yet");
      } else {
         return this.field_1264;
      }
   }

   final Class_262 method_1221() {
      return this.field_1270 == null ? this : this.field_1270.field_233;
   }

   final void method_1222(int var1) {
      if (this.field_1262 == 0) {
         this.field_1262 = (short)var1;
      } else {
         if (this.field_1263 == null) {
            this.field_1263 = new int[4];
         }

         int var2 = ++this.field_1263[0];
         if (var2 >= this.field_1263.length) {
            int[] var3 = new int[this.field_1263.length + 4];
            System.arraycopy(this.field_1263, 0, var3, 0, this.field_1263.length);
            this.field_1263 = var3;
         }

         this.field_1263[var2] = var1;
      }

   }

   final void method_1223(Class_213 var1, boolean var2) {
      var1.method_938(this);
      if (var2 && this.field_1262 != 0) {
         var1.method_949(this.field_1262 & '\uffff', this);
         if (this.field_1263 != null) {
            for(int var3 = 1; var3 <= this.field_1263[0]; ++var3) {
               var1.method_949(this.field_1263[var3], this);
            }
         }
      }

   }

   final void method_1224(Class_25 var1, int var2, boolean var3) {
      if ((this.field_1261 & 4) == 0) {
         if (var3) {
            this.method_1225(var2, 536870912, var1.field_131);
            var1.method_27(-1);
         } else {
            this.method_1225(var2, 268435456, var1.field_131);
            var1.method_24(-1);
         }
      } else if (var3) {
         var1.method_27(this.field_1264 - var2);
      } else {
         var1.method_24(this.field_1264 - var2);
      }

   }

   private void method_1225(int var1, int var2, int var3) {
      if (this.field_1265 == null) {
         this.field_1265 = new int[6];
      }

      int var4 = this.field_1265[0];
      if (var4 + 2 >= this.field_1265.length) {
         int[] var5 = new int[this.field_1265.length + 6];
         System.arraycopy(this.field_1265, 0, var5, 0, this.field_1265.length);
         this.field_1265 = var5;
      }

      ++var4;
      this.field_1265[var4] = var1;
      ++var4;
      this.field_1265[var4] = var2 | var3;
      this.field_1265[0] = var4;
   }

   final boolean method_1226(byte[] var1, int var2) {
      this.field_1261 = (short)(this.field_1261 | 4);
      this.field_1264 = var2;
      if (this.field_1265 == null) {
         return false;
      } else {
         boolean var3 = false;

         for(int var4 = this.field_1265[0]; var4 > 0; var4 -= 2) {
            int var5 = this.field_1265[var4 - 1];
            int var6 = this.field_1265[var4];
            int var7 = var2 - var5;
            int var8 = var6 & 268435455;
            if ((var6 & -268435456) != 268435456) {
               var1[var8++] = (byte)(var7 >>> 24);
               var1[var8++] = (byte)(var7 >>> 16);
               var1[var8++] = (byte)(var7 >>> 8);
               var1[var8] = (byte)var7;
            } else {
               if (var7 < -32768 || var7 > 32767) {
                  int var9 = var1[var5] & 255;
                  if (var9 < 198) {
                     var1[var5] = (byte)(var9 + 49);
                  } else {
                     var1[var5] = (byte)(var9 + 20);
                  }

                  var3 = true;
               }

               var1[var8++] = (byte)(var7 >>> 8);
               var1[var8] = (byte)var7;
            }
         }

         return var3;
      }
   }

   final void method_1227(short var1) {
      Class_262 var2 = this;
      this.field_1273 = field_1259;

      while(var2 != field_1259) {
         Class_262 var3 = var2;
         var2 = var2.field_1273;
         var3.field_1273 = null;
         if (var3.field_1269 == 0) {
            var3.field_1269 = var1;
            var2 = var3.method_1229(var2);
         }
      }

   }

   final void method_1228(Class_262 var1) {
      Class_262 var2 = field_1259;
      Class_262 var3 = this;

      Class_262 var4;
      for(this.field_1273 = field_1259; var3 != field_1259; var3 = var4.method_1229(var3)) {
         var4 = var3;
         var3 = var3.field_1273;
         var4.field_1273 = var2;
         var2 = var4;
         if ((var4.field_1261 & 64) != 0 && var4.field_1269 != var1.field_1269) {
            var4.field_1272 = new Class_54(var4.field_1267, var1.field_1272.field_278, var4.field_1272);
         }
      }

      while(var2 != field_1259) {
         var4 = var2.field_1273;
         var2.field_1273 = null;
         var2 = var4;
      }

   }

   private Class_262 method_1229(Class_262 var1) {
      Class_262 var2 = var1;

      for(Class_54 var3 = this.field_1272; var3 != null; var3 = var3.field_279) {
         boolean var4 = (this.field_1261 & 16) != 0 && var3 == this.field_1272.field_279;
         if (!var4 && var3.field_278.field_1273 == null) {
            var3.field_278.field_1273 = var2;
            var2 = var3.field_278;
         }
      }

      return var2;
   }

   public String toString() {
      return "L" + System.identityHashCode(this);
   }
}
