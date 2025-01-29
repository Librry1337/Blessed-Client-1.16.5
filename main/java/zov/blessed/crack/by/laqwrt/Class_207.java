package zov.blessed.crack.by.laqwrt;

import zov.blessed.crack.by.laqwrt.govno.Class_213;

import java.util.Map;

public class Class_207 extends Class_228 {
   public String field_1077;
   public String field_1078;
   public String field_1079;
   public boolean field_1080;

   public Class_207(int var1, String var2, String var3, String var4) {
      this(var1, var2, var3, var4, var1 == 185);
   }

   public Class_207(int var1, String var2, String var3, String var4, boolean var5) {
      super(var1);
      this.field_1077 = var2;
      this.field_1078 = var3;
      this.field_1079 = var4;
      this.field_1080 = var5;
   }

   public void method_906(int var1) {
      this.field_1166 = var1;
   }

   public int いい() {
      return 5;
   }

   public void よう(Class_213 var1) {
      var1.method_935(this.field_1166, this.field_1077, this.field_1078, this.field_1079, this.field_1080);
      this.method_1035(var1);
   }

   public Class_228 ユえ(Map<Class_252, Class_252> var1) {
      return (new Class_207(this.field_1166, this.field_1077, this.field_1078, this.field_1079, this.field_1080)).method_1038(this);
   }
}
