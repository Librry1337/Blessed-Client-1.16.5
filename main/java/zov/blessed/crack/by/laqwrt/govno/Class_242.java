package zov.blessed.crack.by.laqwrt.govno;

import zov.blessed.crack.by.laqwrt.Class_206;

import java.util.Arrays;

public final class Class_242 {
   private final String field_1187;
   private final String field_1188;
   private final Class_206 field_1189;
   private final Object[] field_1190;

   public Class_242(String var1, String var2, Class_206 var3, Object... var4) {
      this.field_1187 = var1;
      this.field_1188 = var2;
      this.field_1189 = var3;
      this.field_1190 = var4;
   }

   public String method_1106() {
      return this.field_1187;
   }

   public String method_1107() {
      return this.field_1188;
   }

   public Class_206 method_1108() {
      return this.field_1189;
   }

   public int method_1109() {
      return this.field_1190.length;
   }

   public Object method_1110(int var1) {
      return this.field_1190[var1];
   }

   Object[] method_1111() {
      return this.field_1190;
   }

   public int method_1112() {
      char var1 = this.field_1188.charAt(0);
      return var1 != 'J' && var1 != 'D' ? 1 : 2;
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Class_242)) {
         return false;
      } else {
         Class_242 var2 = (Class_242)var1;
         return this.field_1187.equals(var2.field_1187) && this.field_1188.equals(var2.field_1188) && this.field_1189.equals(var2.field_1189) && Arrays.equals(this.field_1190, var2.field_1190);
      }
   }

   public int hashCode() {
      return this.field_1187.hashCode() ^ Integer.rotateLeft(this.field_1188.hashCode(), 8) ^ Integer.rotateLeft(this.field_1189.hashCode(), 16) ^ Integer.rotateLeft(Arrays.hashCode(this.field_1190), 24);
   }

   public String toString() {
      return this.field_1187 + " : " + this.field_1188 + ' ' + this.field_1189 + ' ' + Arrays.toString(this.field_1190);
   }
}
