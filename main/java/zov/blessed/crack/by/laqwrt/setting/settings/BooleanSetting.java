package zov.blessed.crack.by.laqwrt.setting.settings;

import net.minecraft.item.Item;
import zov.blessed.crack.by.laqwrt.setting.Setting;

public class BooleanSetting extends Setting<Boolean> {
   private Item field_1071;

   public BooleanSetting(String[] var1, boolean var2, Item var3) {
      super(var1, var2);
      this.field_1071 = var3;
   }

   public Item method_898() {
      return this.field_1071;
   }
}
