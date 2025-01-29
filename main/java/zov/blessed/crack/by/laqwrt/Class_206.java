package zov.blessed.crack.by.laqwrt;

public final class Class_206 {
   private final int field_1072;
   private final String field_1073;
   private final String field_1074;
   private final String field_1075;
   private final boolean field_1076;

   /** @deprecated */
   @Deprecated
   public Class_206(int var1, String var2, String var3, String var4) {
      this(var1, var2, var3, var4, var1 == 9);
   }

   public Class_206(int var1, String var2, String var3, String var4, boolean var5) {
      this.field_1072 = var1;
      this.field_1073 = var2;
      this.field_1074 = var3;
      this.field_1075 = var4;
      this.field_1076 = var5;
   }

   public int method_900() {
      return this.field_1072;
   }

   public String method_901() {
      return this.field_1073;
   }

   public String method_902() {
      return this.field_1074;
   }

   public String method_903() {
      return this.field_1075;
   }

   public boolean method_904() {
      return this.field_1076;
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Class_206)) {
         return false;
      } else {
         Class_206 var2 = (Class_206)var1;
         return this.field_1072 == var2.field_1072 && this.field_1076 == var2.field_1076 && this.field_1073.equals(var2.field_1073) && this.field_1074.equals(var2.field_1074) && this.field_1075.equals(var2.field_1075);
      }
   }

   public int hashCode() {
      return this.field_1072 + (this.field_1076 ? 64 : 0) + this.field_1073.hashCode() * this.field_1074.hashCode() * this.field_1075.hashCode();
   }

   public String toString() {
      return this.field_1073 + '.' + this.field_1074 + this.field_1075 + " (" + this.field_1072 + (this.field_1076 ? " itf" : "") + ')';
   }
}
