package zov.blessed.crack.by.laqwrt.govno;

public abstract class Class_192 {
   protected final int field_1033;
   public Class_192 field_1034;

   public Class_192(int var1) {
      this(var1, (Class_192)null);
   }

   public Class_192(int var1, Class_192 var2) {
      if (var1 != 589824 && var1 != 524288 && var1 != 458752 && var1 != 393216 && var1 != 327680 && var1 != 262144 && var1 != 17432576) {
         throw new IllegalArgumentException("Unsupported api " + var1);
      } else {
         if (var1 == 17432576) {
            Class_20.method_17(this);
         }

         this.field_1033 = var1;
         this.field_1034 = var2;
      }
   }

   public Class_194 method_842(String var1, boolean var2) {
      return this.field_1034 != null ? this.field_1034.method_842(var1, var2) : null;
   }

   public Class_194 method_843(int var1, Class_82 var2, String var3, boolean var4) {
      if (this.field_1033 < 327680) {
         throw new UnsupportedOperationException("This feature requires ASM5");
      } else {
         return this.field_1034 != null ? this.field_1034.method_843(var1, var2, var3, var4) : null;
      }
   }

   public void method_844(Class_98 var1) {
      if (this.field_1034 != null) {
         this.field_1034.method_844(var1);
      }

   }

   public void method_845() {
      if (this.field_1034 != null) {
         this.field_1034.method_845();
      }

   }
}
