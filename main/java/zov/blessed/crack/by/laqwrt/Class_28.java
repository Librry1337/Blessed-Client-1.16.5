package zov.blessed.crack.by.laqwrt;

import zov.blessed.crack.by.laqwrt.setting.Setting;

import java.awt.Color;

public class Class_28 extends Setting<Color> {
   private Color field_139;
   private float field_140;
   private float field_141;

   public Class_28(String[] var1, Color var2) {
      super(var1, var2);
      this.field_139 = var2;
   }

   public Color method_40() {
      return this.field_139;
   }

   public void method_41(Color var1) {
      this.field_139 = var1;
   }

   public float method_42() {
      return this.field_140;
   }

   public float method_43() {
      return this.field_141;
   }

   public void method_44(float var1) {
      this.field_140 = var1;
   }

   public void method_45(float var1) {
      this.field_141 = var1;
   }
}
