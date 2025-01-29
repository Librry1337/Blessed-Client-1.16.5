package zov.blessed.crack.by.laqwrt.govno;

public abstract class Class_194 {
   protected final int field_1037;
   protected Class_194 field_1038;

   public Class_194(int var1) {
      this(var1, (Class_194)null);
   }

   public Class_194(int var1, Class_194 var2) {
      if (var1 != 589824 && var1 != 524288 && var1 != 458752 && var1 != 393216 && var1 != 327680 && var1 != 262144 && var1 != 17432576) {
         throw new IllegalArgumentException("Unsupported api " + var1);
      } else {
         if (var1 == 17432576) {
            Class_20.method_17(this);
         }

         this.field_1037 = var1;
         this.field_1038 = var2;
      }
   }

   public void method_851(String var1, Object var2) {
      if (this.field_1038 != null) {
         this.field_1038.method_851(var1, var2);
      }

   }

   public void method_852(String var1, String var2, String var3) {
      if (this.field_1038 != null) {
         this.field_1038.method_852(var1, var2, var3);
      }

   }

   public Class_194 method_853(String var1, String var2) {
      return this.field_1038 != null ? this.field_1038.method_853(var1, var2) : null;
   }

   public Class_194 method_854(String var1) {
      return this.field_1038 != null ? this.field_1038.method_854(var1) : null;
   }

   public void method_855() {
      if (this.field_1038 != null) {
         this.field_1038.method_855();
      }

   }
}
