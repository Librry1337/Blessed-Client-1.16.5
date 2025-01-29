package zov.blessed.crack.by.laqwrt.govno;

final class Class_163 extends Class_65 {
   private final Class_170 field_873;
   private final int field_874;
   private final int field_875;
   private final int field_876;
   private int field_877;
   private final Class_25 field_878;
   private int field_879;
   private final Class_25 field_880;
   private int field_881;
   private final Class_25 field_882;
   private int field_883;
   private final Class_25 field_884;
   private int field_885;
   private final Class_25 field_886;
   private int field_887;
   private final Class_25 field_888;
   private int field_889;

   Class_163(Class_170 var1, int var2, int var3, int var4) {
      super(589824);
      this.field_873 = var1;
      this.field_874 = var2;
      this.field_875 = var3;
      this.field_876 = var4;
      this.field_878 = new Class_25();
      this.field_880 = new Class_25();
      this.field_882 = new Class_25();
      this.field_884 = new Class_25();
      this.field_886 = new Class_25();
      this.field_888 = new Class_25();
   }

   public void method_218(String var1) {
      this.field_889 = this.field_873.method_669(var1).field_959;
   }

   public void method_219(String var1) {
      this.field_888.method_24(this.field_873.method_695(var1).field_959);
      ++this.field_887;
   }

   public void method_220(String var1, int var2, String var3) {
      this.field_878.method_24(this.field_873.method_694(var1).field_959).method_24(var2).method_24(var3 == null ? 0 : this.field_873.method_685(var3));
      ++this.field_877;
   }

   public void method_221(String var1, int var2, String... var3) {
      this.field_880.method_24(this.field_873.method_695(var1).field_959).method_24(var2);
      if (var3 == null) {
         this.field_880.method_24(0);
      } else {
         this.field_880.method_24(var3.length);
         String[] var4 = var3;
         int var5 = var3.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            String var7 = var4[var6];
            this.field_880.method_24(this.field_873.method_694(var7).field_959);
         }
      }

      ++this.field_879;
   }

   public void method_222(String var1, int var2, String... var3) {
      this.field_882.method_24(this.field_873.method_695(var1).field_959).method_24(var2);
      if (var3 == null) {
         this.field_882.method_24(0);
      } else {
         this.field_882.method_24(var3.length);
         String[] var4 = var3;
         int var5 = var3.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            String var7 = var4[var6];
            this.field_882.method_24(this.field_873.method_694(var7).field_959);
         }
      }

      ++this.field_881;
   }

   public void method_223(String var1) {
      this.field_884.method_24(this.field_873.method_669(var1).field_959);
      ++this.field_883;
   }

   public void method_224(String var1, String... var2) {
      this.field_886.method_24(this.field_873.method_669(var1).field_959);
      this.field_886.method_24(var2.length);
      String[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         String var6 = var3[var5];
         this.field_886.method_24(this.field_873.method_669(var6).field_959);
      }

      ++this.field_885;
   }

   public void method_225() {
   }

   int method_636() {
      return 1 + (this.field_887 > 0 ? 1 : 0) + (this.field_889 > 0 ? 1 : 0);
   }

   int method_637() {
      this.field_873.method_685("Module");
      int var1 = 22 + this.field_878.field_131 + this.field_880.field_131 + this.field_882.field_131 + this.field_884.field_131 + this.field_886.field_131;
      if (this.field_887 > 0) {
         this.field_873.method_685("ModulePackages");
         var1 += 8 + this.field_888.field_131;
      }

      if (this.field_889 > 0) {
         this.field_873.method_685("ModuleMainClass");
         var1 += 8;
      }

      return var1;
   }

   void method_638(Class_25 var1) {
      int var2 = 16 + this.field_878.field_131 + this.field_880.field_131 + this.field_882.field_131 + this.field_884.field_131 + this.field_886.field_131;
      var1.method_24(this.field_873.method_685("Module")).method_27(var2).method_24(this.field_874).method_24(this.field_875).method_24(this.field_876).method_24(this.field_877).method_32(this.field_878.field_130, 0, this.field_878.field_131).method_24(this.field_879).method_32(this.field_880.field_130, 0, this.field_880.field_131).method_24(this.field_881).method_32(this.field_882.field_130, 0, this.field_882.field_131).method_24(this.field_883).method_32(this.field_884.field_130, 0, this.field_884.field_131).method_24(this.field_885).method_32(this.field_886.field_130, 0, this.field_886.field_131);
      if (this.field_887 > 0) {
         var1.method_24(this.field_873.method_685("ModulePackages")).method_27(2 + this.field_888.field_131).method_24(this.field_887).method_32(this.field_888.field_130, 0, this.field_888.field_131);
      }

      if (this.field_889 > 0) {
         var1.method_24(this.field_873.method_685("ModuleMainClass")).method_27(2).method_24(this.field_889);
      }

   }
}
