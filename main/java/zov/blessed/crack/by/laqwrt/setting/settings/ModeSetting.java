package zov.blessed.crack.by.laqwrt.setting.settings;

import zov.blessed.crack.by.laqwrt.setting.Setting;

import java.util.ArrayList;

public class ModeSetting extends Setting {
   private int field_709;
   private ArrayList<String[]> field_710 = new ArrayList<>();

   public ModeSetting(String[] var1, ArrayList<String[]> var2, int var3) {
      super(var1, var2);
      this.field_710 = var2;
      this.field_709 = var3;
   }

   public String[] method_433() {
      return (String[])this.field_710.get(this.field_709);
   }

   public ArrayList<String[]> method_434() {
      return this.field_710;
   }

   public void method_435(ArrayList<String[]> var1) {
      this.field_710 = var1;
   }

   public int method_436() {
      return this.field_709;
   }

   public void method_437(int var1) {
      this.field_709 = var1;
   }
}
