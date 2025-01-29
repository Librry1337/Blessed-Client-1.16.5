package zov.blessed.crack.by.laqwrt.govno;

public abstract class Class_65 {
   protected final int field_588;
   protected Class_65 field_589;

   public Class_65(int var1) {
      this(var1, (Class_65)null);
   }

   public Class_65(int var1, Class_65 var2) {
      if (var1 != 589824 && var1 != 524288 && var1 != 458752 && var1 != 393216 && var1 != 327680 && var1 != 262144 && var1 != 17432576) {
         throw new IllegalArgumentException("Unsupported api " + var1);
      } else {
         if (var1 == 17432576) {
            Class_20.method_17(this);
         }

         this.field_588 = var1;
         this.field_589 = var2;
      }
   }

   public void method_218(String var1) {
      if (this.field_589 != null) {
         this.field_589.method_218(var1);
      }

   }

   public void method_219(String var1) {
      if (this.field_589 != null) {
         this.field_589.method_219(var1);
      }

   }

   public void method_220(String var1, int var2, String var3) {
      if (this.field_589 != null) {
         this.field_589.method_220(var1, var2, var3);
      }

   }

   public void method_221(String var1, int var2, String... var3) {
      if (this.field_589 != null) {
         this.field_589.method_221(var1, var2, var3);
      }

   }

   public void method_222(String var1, int var2, String... var3) {
      if (this.field_589 != null) {
         this.field_589.method_222(var1, var2, var3);
      }

   }

   public void method_223(String var1) {
      if (this.field_589 != null) {
         this.field_589.method_223(var1);
      }

   }

   public void method_224(String var1, String... var2) {
      if (this.field_589 != null) {
         this.field_589.method_224(var1, var2);
      }

   }

   public void method_225() {
      if (this.field_589 != null) {
         this.field_589.method_225();
      }

   }
}
