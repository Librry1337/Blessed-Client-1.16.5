package zov.blessed.crack.by.laqwrt.setting.settings;

import zov.blessed.crack.by.laqwrt.setting.Setting;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SliderSetting extends Setting<Float> {
   private float field_1276;
   private float field_1277;
   private float field_1278;
   private int field_1279;
   private String field_1280;

   public SliderSetting(String[] var1, float var2, float var3, float var4, int var5) {
      super(var1, var2);
      this.field_1277 = var4;
      this.field_1276 = var3;
      this.field_1278 = var2;
      this.field_1279 = var5;
      this.field_1280 = null;
   }

   public String method_1235() {
      return this.field_1280;
   }

   public void method_1236(String var1) {
      this.field_1280 = var1;
   }

   public float method_1237() {
      return this.field_1277;
   }

   public float method_1238() {
      return this.field_1276;
   }

   public void method_1239(float var1) {
      this.field_1278 = var1;
      super.method_578(var1);
   }

   public Float method_1240() {
      if (this.field_1278 > this.field_1277) {
         return this.field_1277;
      } else if (this.field_1278 < this.field_1276) {
         return this.field_1276;
      } else {
         BigDecimal var1 = new BigDecimal((double)this.field_1278);
         var1 = var1.setScale(this.field_1279, RoundingMode.HALF_UP);
         return var1.floatValue();
      }
   }

   public int method_1241() {
      return this.field_1279;
   }
}
