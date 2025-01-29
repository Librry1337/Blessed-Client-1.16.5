package zov.blessed.crack.by.laqwrt.govno;

public abstract class Class_193 {
   protected final int field_1035;
   public Class_193 field_1036;

   public Class_193(int var1) {
      this(var1, (Class_193)null);
   }

   public Class_193(int var1, Class_193 var2) {
      if (var1 != 589824 && var1 != 524288 && var1 != 458752 && var1 != 393216 && var1 != 327680 && var1 != 262144 && var1 != 17432576) {
         throw new IllegalArgumentException("Unsupported api " + var1);
      } else {
         if (var1 == 17432576) {
            Class_20.method_17(this);
         }

         this.field_1035 = var1;
         this.field_1036 = var2;
      }
   }

   public Class_193 method_846() {
      return this.field_1036;
   }

   public Class_194 method_847(String var1, boolean var2) {
      return this.field_1036 != null ? this.field_1036.method_847(var1, var2) : null;
   }

   public Class_194 method_848(int var1, Class_82 var2, String var3, boolean var4) {
      return this.field_1036 != null ? this.field_1036.method_848(var1, var2, var3, var4) : null;
   }

   public void method_849(Class_98 var1) {
      if (this.field_1036 != null) {
         this.field_1036.method_849(var1);
      }

   }

   public void method_850() {
      if (this.field_1036 != null) {
         this.field_1036.method_850();
      }

   }
}
