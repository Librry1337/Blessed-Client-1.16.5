package zov.blessed.crack.by.laqwrt;

public class Class_59 {
   private Class_161 field_320;

   public Class_59(Class_161 var1) {
      this.field_320 = var1;
   }

   public Blessed method_191(String[] var1, float var2, float var3, int var4) {
      if (this.field_320 == null) {
         return null;
      } else {
         float var5 = var2;
         String[] var6 = var1;
         int var7 = var1.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            String var9 = var6[var8];
            this.field_320.method_601(var9, var5, var3, var4);
            var5 += (float)this.field_320.method_618(var9);
         }

         return null;
      }
   }

   public Blessed method_192(String[] var1, int var2, int var3, int var4) {
      if (this.field_320 == null) {
         return null;
      } else {
         int var5 = var2;
         String[] var6 = var1;
         int var7 = var1.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            String var9 = var6[var8];
            this.field_320.method_602(var9, (float)var5, (float)var3, var4);
            var5 += this.field_320.method_618(var9);
         }

         return null;
      }
   }

   public int method_193(String[] var1) {
      if (this.field_320 == null) {
         return 0;
      } else {
         int var2 = 0;
         String[] var3 = var1;
         int var4 = var1.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            String var6 = var3[var5];
            var2 += this.field_320.method_618(var6);
         }

         return var2;
      }
   }

   public int method_194() {
      return this.field_320 == null ? 0 : this.field_320.method_611();
   }

   public boolean method_195(String[] var1, String[] var2) {
      if (this.field_320 == null) {
         return false;
      } else if (var1.length != var2.length) {
         return false;
      } else {
         for(int var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3].contains(var2[var3])) {
               return true;
            }
         }

         return false;
      }
   }
}
