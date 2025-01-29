package zov.blessed.crack.by.laqwrt.govno;

public class Class_25 {
   byte[] field_130;
   int field_131;

   public Class_25() {
      this.field_130 = new byte[64];
   }

   public Class_25(int var1) {
      this.field_130 = new byte[var1];
   }

   Class_25(byte[] var1) {
      this.field_130 = var1;
      this.field_131 = var1.length;
   }

   public Class_25 method_22(int var1) {
      int var2 = this.field_131;
      if (var2 + 1 > this.field_130.length) {
         this.method_33(1);
      }

      this.field_130[var2++] = (byte)var1;
      this.field_131 = var2;
      return this;
   }

   final Class_25 method_23(int var1, int var2) {
      int var3 = this.field_131;
      if (var3 + 2 > this.field_130.length) {
         this.method_33(2);
      }

      byte[] var4 = this.field_130;
      var4[var3++] = (byte)var1;
      var4[var3++] = (byte)var2;
      this.field_131 = var3;
      return this;
   }

   public Class_25 method_24(int var1) {
      int var2 = this.field_131;
      if (var2 + 2 > this.field_130.length) {
         this.method_33(2);
      }

      byte[] var3 = this.field_130;
      var3[var2++] = (byte)(var1 >>> 8);
      var3[var2++] = (byte)var1;
      this.field_131 = var2;
      return this;
   }

   final Class_25 method_25(int var1, int var2) {
      int var3 = this.field_131;
      if (var3 + 3 > this.field_130.length) {
         this.method_33(3);
      }

      byte[] var4 = this.field_130;
      var4[var3++] = (byte)var1;
      var4[var3++] = (byte)(var2 >>> 8);
      var4[var3++] = (byte)var2;
      this.field_131 = var3;
      return this;
   }

   final Class_25 method_26(int var1, int var2, int var3) {
      int var4 = this.field_131;
      if (var4 + 4 > this.field_130.length) {
         this.method_33(4);
      }

      byte[] var5 = this.field_130;
      var5[var4++] = (byte)var1;
      var5[var4++] = (byte)var2;
      var5[var4++] = (byte)(var3 >>> 8);
      var5[var4++] = (byte)var3;
      this.field_131 = var4;
      return this;
   }

   public Class_25 method_27(int var1) {
      int var2 = this.field_131;
      if (var2 + 4 > this.field_130.length) {
         this.method_33(4);
      }

      byte[] var3 = this.field_130;
      var3[var2++] = (byte)(var1 >>> 24);
      var3[var2++] = (byte)(var1 >>> 16);
      var3[var2++] = (byte)(var1 >>> 8);
      var3[var2++] = (byte)var1;
      this.field_131 = var2;
      return this;
   }

   final Class_25 method_28(int var1, int var2, int var3) {
      int var4 = this.field_131;
      if (var4 + 5 > this.field_130.length) {
         this.method_33(5);
      }

      byte[] var5 = this.field_130;
      var5[var4++] = (byte)var1;
      var5[var4++] = (byte)(var2 >>> 8);
      var5[var4++] = (byte)var2;
      var5[var4++] = (byte)(var3 >>> 8);
      var5[var4++] = (byte)var3;
      this.field_131 = var4;
      return this;
   }

   public Class_25 method_29(long var1) {
      int var3 = this.field_131;
      if (var3 + 8 > this.field_130.length) {
         this.method_33(8);
      }

      byte[] var4 = this.field_130;
      int var5 = (int)(var1 >>> 32);
      var4[var3++] = (byte)(var5 >>> 24);
      var4[var3++] = (byte)(var5 >>> 16);
      var4[var3++] = (byte)(var5 >>> 8);
      var4[var3++] = (byte)var5;
      var5 = (int)var1;
      var4[var3++] = (byte)(var5 >>> 24);
      var4[var3++] = (byte)(var5 >>> 16);
      var4[var3++] = (byte)(var5 >>> 8);
      var4[var3++] = (byte)var5;
      this.field_131 = var3;
      return this;
   }

   public Class_25 method_30(String var1) {
      int var2 = var1.length();
      if (var2 > 65535) {
         throw new IllegalArgumentException("UTF8 string too large");
      } else {
         int var3 = this.field_131;
         if (var3 + 2 + var2 > this.field_130.length) {
            this.method_33(2 + var2);
         }

         byte[] var4 = this.field_130;
         var4[var3++] = (byte)(var2 >>> 8);
         var4[var3++] = (byte)var2;

         for(int var5 = 0; var5 < var2; ++var5) {
            char var6 = var1.charAt(var5);
            if (var6 < 1 || var6 > 127) {
               this.field_131 = var3;
               return this.method_31(var1, var5, 65535);
            }

            var4[var3++] = (byte)var6;
         }

         this.field_131 = var3;
         return this;
      }
   }

   final Class_25 method_31(String var1, int var2, int var3) {
      int var4 = var1.length();
      int var5 = var2;

      int var6;
      for(var6 = var2; var6 < var4; ++var6) {
         char var7 = var1.charAt(var6);
         if (var7 >= 1 && var7 <= 127) {
            ++var5;
         } else if (var7 <= 2047) {
            var5 += 2;
         } else {
            var5 += 3;
         }
      }

      if (var5 > var3) {
         throw new IllegalArgumentException("UTF8 string too large");
      } else {
         var6 = this.field_131 - var2 - 2;
         if (var6 >= 0) {
            this.field_130[var6] = (byte)(var5 >>> 8);
            this.field_130[var6 + 1] = (byte)var5;
         }

         if (this.field_131 + var5 - var2 > this.field_130.length) {
            this.method_33(var5 - var2);
         }

         int var10 = this.field_131;

         for(int var8 = var2; var8 < var4; ++var8) {
            char var9 = var1.charAt(var8);
            if (var9 >= 1 && var9 <= 127) {
               this.field_130[var10++] = (byte)var9;
            } else if (var9 <= 2047) {
               this.field_130[var10++] = (byte)(192 | var9 >> 6 & 31);
               this.field_130[var10++] = (byte)(128 | var9 & 63);
            } else {
               this.field_130[var10++] = (byte)(224 | var9 >> 12 & 15);
               this.field_130[var10++] = (byte)(128 | var9 >> 6 & 63);
               this.field_130[var10++] = (byte)(128 | var9 & 63);
            }
         }

         this.field_131 = var10;
         return this;
      }
   }

   public Class_25 method_32(byte[] var1, int var2, int var3) {
      if (this.field_131 + var3 > this.field_130.length) {
         this.method_33(var3);
      }

      if (var1 != null) {
         System.arraycopy(var1, var2, this.field_130, this.field_131, var3);
      }

      this.field_131 += var3;
      return this;
   }

   private void method_33(int var1) {
      int var2 = 2 * this.field_130.length;
      int var3 = this.field_131 + var1;
      byte[] var4 = new byte[var2 > var3 ? var2 : var3];
      System.arraycopy(this.field_130, 0, var4, 0, this.field_131);
      this.field_130 = var4;
   }
}
