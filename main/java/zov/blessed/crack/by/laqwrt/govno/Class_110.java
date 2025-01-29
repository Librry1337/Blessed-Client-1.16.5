package zov.blessed.crack.by.laqwrt.govno;

final class Class_110 extends Class_193 {
   private final Class_170 field_678;
   private final int field_679;
   private final int field_680;
   private int field_681;
   private Class_34 field_682;
   private Class_34 field_683;
   private Class_34 field_684;
   private Class_34 field_685;
   private Class_98 field_686;

   Class_110(Class_170 var1, String var2, String var3, String var4) {
      super(589824);
      this.field_678 = var1;
      this.field_679 = var1.method_685(var2);
      this.field_680 = var1.method_685(var3);
      if (var4 != null) {
         this.field_681 = var1.method_685(var4);
      }

   }

   public Class_194 method_847(String var1, boolean var2) {
      return var2 ? (this.field_682 = Class_34.method_54(this.field_678, var1, this.field_682)) : (this.field_683 = Class_34.method_54(this.field_678, var1, this.field_683));
   }

   public Class_194 method_848(int var1, Class_82 var2, String var3, boolean var4) {
      return var4 ? (this.field_684 = Class_34.method_55(this.field_678, var1, var2, var3, this.field_684)) : (this.field_685 = Class_34.method_55(this.field_678, var1, var2, var3, this.field_685));
   }

   public void method_849(Class_98 var1) {
      var1.field_655 = this.field_686;
      this.field_686 = var1;
   }

   public void method_850() {
   }

   int method_396() {
      byte var1 = 6;
      int var2 = var1 + Class_98.method_333(this.field_678, 0, this.field_681);
      var2 += Class_34.method_57(this.field_682, this.field_683, this.field_684, this.field_685);
      if (this.field_686 != null) {
         var2 += this.field_686.method_331(this.field_678);
      }

      return var2;
   }

   void method_397(Class_25 var1) {
      var1.method_24(this.field_679).method_24(this.field_680);
      int var2 = 0;
      if (this.field_681 != 0) {
         ++var2;
      }

      if (this.field_682 != null) {
         ++var2;
      }

      if (this.field_683 != null) {
         ++var2;
      }

      if (this.field_684 != null) {
         ++var2;
      }

      if (this.field_685 != null) {
         ++var2;
      }

      if (this.field_686 != null) {
         var2 += this.field_686.method_330();
      }

      var1.method_24(var2);
      Class_98.method_336(this.field_678, 0, this.field_681, var1);
      Class_34.method_59(this.field_678, this.field_682, this.field_683, this.field_684, this.field_685, var1);
      if (this.field_686 != null) {
         this.field_686.method_334(this.field_678, var1);
      }

   }

   final void method_398(Class_11 var1) {
      var1.method_1(this.field_686);
   }
}
