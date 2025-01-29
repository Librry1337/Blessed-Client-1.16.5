package zov.blessed.crack.by.laqwrt.govno;

public class Class_98 {
   public final String field_653;
   private byte[] field_654;
   Class_98 field_655;

   protected Class_98(String var1) {
      this.field_653 = var1;
   }

   public boolean method_325() {
      return true;
   }

   public boolean method_326() {
      return false;
   }

   protected Class_262[] method_327() {
      return new Class_262[0];
   }

   protected Class_98 method_328(Class_81 var1, int var2, int var3, char[] var4, int var5, Class_262[] var6) {
      Class_98 var7 = new Class_98(this.field_653);
      var7.field_654 = new byte[var3];
      System.arraycopy(var1.field_623, var2, var7.field_654, 0, var3);
      return var7;
   }

   protected Class_25 method_329(Class_160 var1, byte[] var2, int var3, int var4, int var5) {
      return new Class_25(this.field_654);
   }

   final int method_330() {
      int var1 = 0;

      for(Class_98 var2 = this; var2 != null; var2 = var2.field_655) {
         ++var1;
      }

      return var1;
   }

   final int method_331(Class_170 var1) {
      Object var2 = null;
      boolean var3 = false;
      boolean var4 = true;
      boolean var5 = true;
      return this.method_332(var1, (byte[])var2, 0, -1, -1);
   }

   final int method_332(Class_170 var1, byte[] var2, int var3, int var4, int var5) {
      Class_160 var6 = var1.field_906;
      int var7 = 0;

      for(Class_98 var8 = this; var8 != null; var8 = var8.field_655) {
         var1.method_685(var8.field_653);
         var7 += 6 + var8.method_329(var6, var2, var3, var4, var5).field_131;
      }

      return var7;
   }

   static int method_333(Class_170 var0, int var1, int var2) {
      int var3 = 0;
      if ((var1 & 4096) != 0 && var0.method_657() < 49) {
         var0.method_685("Synthetic");
         var3 += 6;
      }

      if (var2 != 0) {
         var0.method_685("Signature");
         var3 += 8;
      }

      if ((var1 & 131072) != 0) {
         var0.method_685("Deprecated");
         var3 += 6;
      }

      return var3;
   }

   final void method_334(Class_170 var1, Class_25 var2) {
      Object var3 = null;
      boolean var4 = false;
      boolean var5 = true;
      boolean var6 = true;
      this.method_335(var1, (byte[])var3, 0, -1, -1, var2);
   }

   final void method_335(Class_170 var1, byte[] var2, int var3, int var4, int var5, Class_25 var6) {
      Class_160 var7 = var1.field_906;

      for(Class_98 var8 = this; var8 != null; var8 = var8.field_655) {
         Class_25 var9 = var8.method_329(var7, var2, var3, var4, var5);
         var6.method_24(var1.method_685(var8.field_653)).method_27(var9.field_131);
         var6.method_32(var9.field_130, 0, var9.field_131);
      }

   }

   static void method_336(Class_170 var0, int var1, int var2, Class_25 var3) {
      if ((var1 & 4096) != 0 && var0.method_657() < 49) {
         var3.method_24(var0.method_685("Synthetic")).method_27(0);
      }

      if (var2 != 0) {
         var3.method_24(var0.method_685("Signature")).method_27(2).method_24(var2);
      }

      if ((var1 & 131072) != 0) {
         var3.method_24(var0.method_685("Deprecated")).method_27(0);
      }

   }
}
