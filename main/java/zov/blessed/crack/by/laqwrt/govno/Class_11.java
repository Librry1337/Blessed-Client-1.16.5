package zov.blessed.crack.by.laqwrt.govno;

final class Class_11 {
   private static final int field_3 = 6;
   private int field_4;
   private Class_98[] field_5 = new Class_98[6];

   void method_1(Class_98 var1) {
      for(Class_98 var2 = var1; var2 != null; var2 = var2.field_655) {
         if (!this.method_3(var2)) {
            this.method_4(var2);
         }
      }

   }

   Class_98[] method_2() {
      Class_98[] var1 = new Class_98[this.field_4];
      System.arraycopy(this.field_5, 0, var1, 0, this.field_4);
      return var1;
   }

   private boolean method_3(Class_98 var1) {
      for(int var2 = 0; var2 < this.field_4; ++var2) {
         if (this.field_5[var2].field_653.equals(var1.field_653)) {
            return true;
         }
      }

      return false;
   }

   private void method_4(Class_98 var1) {
      if (this.field_4 >= this.field_5.length) {
         Class_98[] var2 = new Class_98[this.field_5.length + 6];
         System.arraycopy(this.field_5, 0, var2, 0, this.field_4);
         this.field_5 = var2;
      }

      this.field_5[this.field_4++] = var1;
   }
}
