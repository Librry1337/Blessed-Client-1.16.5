package zov.blessed.crack.by.laqwrt.govno;

final class Class_43 extends Class_192 {
   private final Class_170 field_166;
   private final int field_167;
   private final int field_168;
   private final int field_169;
   private int field_170;
   private int field_171;
   private Class_34 field_172;
   private Class_34 field_173;
   private Class_34 field_174;
   private Class_34 field_175;
   private Class_98 field_176;

   Class_43(Class_170 var1, int var2, String var3, String var4, String var5, Object var6) {
      super(589824);
      this.field_166 = var1;
      this.field_167 = var2;
      this.field_168 = var1.method_685(var3);
      this.field_169 = var1.method_685(var4);
      if (var5 != null) {
         this.field_170 = var1.method_685(var5);
      }

      if (var6 != null) {
         this.field_171 = var1.method_668(var6).field_959;
      }

   }

   public Class_194 method_842(String var1, boolean var2) {
      return var2 ? (this.field_172 = Class_34.method_54(this.field_166, var1, this.field_172)) : (this.field_173 = Class_34.method_54(this.field_166, var1, this.field_173));
   }

   public Class_194 method_843(int var1, Class_82 var2, String var3, boolean var4) {
      return var4 ? (this.field_174 = Class_34.method_55(this.field_166, var1, var2, var3, this.field_174)) : (this.field_175 = Class_34.method_55(this.field_166, var1, var2, var3, this.field_175));
   }

   public void method_844(Class_98 var1) {
      var1.field_655 = this.field_176;
      this.field_176 = var1;
   }

   public void method_845() {
   }

   int method_91() {
      int var1 = 8;
      if (this.field_171 != 0) {
         this.field_166.method_685("ConstantValue");
         var1 += 8;
      }

      var1 += Class_98.method_333(this.field_166, this.field_167, this.field_170);
      var1 += Class_34.method_57(this.field_172, this.field_173, this.field_174, this.field_175);
      if (this.field_176 != null) {
         var1 += this.field_176.method_331(this.field_166);
      }

      return var1;
   }

   void method_92(Class_25 var1) {
      boolean var2 = this.field_166.method_657() < 49;
      int var3 = var2 ? 4096 : 0;
      var1.method_24(this.field_167 & ~var3).method_24(this.field_168).method_24(this.field_169);
      int var4 = 0;
      if (this.field_171 != 0) {
         ++var4;
      }

      if ((this.field_167 & 4096) != 0 && var2) {
         ++var4;
      }

      if (this.field_170 != 0) {
         ++var4;
      }

      if ((this.field_167 & 131072) != 0) {
         ++var4;
      }

      if (this.field_172 != null) {
         ++var4;
      }

      if (this.field_173 != null) {
         ++var4;
      }

      if (this.field_174 != null) {
         ++var4;
      }

      if (this.field_175 != null) {
         ++var4;
      }

      if (this.field_176 != null) {
         var4 += this.field_176.method_330();
      }

      var1.method_24(var4);
      if (this.field_171 != 0) {
         var1.method_24(this.field_166.method_685("ConstantValue")).method_27(2).method_24(this.field_171);
      }

      Class_98.method_336(this.field_166, this.field_167, this.field_170, var1);
      Class_34.method_59(this.field_166, this.field_172, this.field_173, this.field_174, this.field_175, var1);
      if (this.field_176 != null) {
         this.field_176.method_334(this.field_166, var1);
      }

   }

   final void method_93(Class_11 var1) {
      var1.method_1(this.field_176);
   }
}
