package zov.blessed.crack.by.laqwrt;

public class Class_202 extends Class_127 {
   private final StringBuilder field_1056 = new StringBuilder();
   private boolean field_1057;
   private boolean field_1058;
   private int field_1059;

   public Class_202() {
      super(393216);
   }

   public void method_404(String var1) {
      if (!this.field_1057) {
         this.field_1057 = true;
         this.field_1056.append('<');
      }

      this.field_1056.append(var1);
      this.field_1056.append(':');
   }

   public Class_127 method_405() {
      return this;
   }

   public Class_127 method_406() {
      this.field_1056.append(':');
      return this;
   }

   public Class_127 method_407() {
      this.method_892();
      return this;
   }

   public Class_127 method_408() {
      return this;
   }

   public Class_127 method_409() {
      this.method_892();
      if (!this.field_1058) {
         this.field_1058 = true;
         this.field_1056.append('(');
      }

      return this;
   }

   public Class_127 method_410() {
      this.method_892();
      if (!this.field_1058) {
         this.field_1056.append('(');
      }

      this.field_1056.append(')');
      return this;
   }

   public Class_127 method_411() {
      this.field_1056.append('^');
      return this;
   }

   public void method_412(char var1) {
      this.field_1056.append(var1);
   }

   public void method_413(String var1) {
      this.field_1056.append('T');
      this.field_1056.append(var1);
      this.field_1056.append(';');
   }

   public Class_127 method_414() {
      this.field_1056.append('[');
      return this;
   }

   public void method_415(String var1) {
      this.field_1056.append('L');
      this.field_1056.append(var1);
      this.field_1059 *= 2;
   }

   public void method_416(String var1) {
      this.method_893();
      this.field_1056.append('.');
      this.field_1056.append(var1);
      this.field_1059 *= 2;
   }

   public void method_417() {
      if (this.field_1059 % 2 == 0) {
         this.field_1059 |= 1;
         this.field_1056.append('<');
      }

      this.field_1056.append('*');
   }

   public Class_127 method_418(char var1) {
      if (this.field_1059 % 2 == 0) {
         this.field_1059 |= 1;
         this.field_1056.append('<');
      }

      if (var1 != '=') {
         this.field_1056.append(var1);
      }

      return this;
   }

   public void method_419() {
      this.method_893();
      this.field_1056.append(';');
   }

   public String toString() {
      return this.field_1056.toString();
   }

   private void method_892() {
      if (this.field_1057) {
         this.field_1057 = false;
         this.field_1056.append('>');
      }

   }

   private void method_893() {
      if (this.field_1059 % 2 == 1) {
         this.field_1056.append('>');
      }

      this.field_1059 /= 2;
   }
}
