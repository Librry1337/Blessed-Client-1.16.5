package zov.blessed.crack.by.laqwrt.setting;

public class Setting<Value> {
   private Value field_824;
   private Value field_825;
   private String[] name;

   public Setting(String[] name, Value var2) {
      this.name = name;
      this.field_825 = var2;
      this.field_824 = var2;
   }

   public String[] method_577() {
      return this.name;
   }

   public void method_578(Value var1) {
      this.field_824 = var1;
   }

   public Value method_579() {
      return this.field_825;
   }

   public Value method_580() {
      return this.field_824;
   }
}
