package zov.blessed.crack.by.laqwrt.module;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.util.MovementInput;
import zov.blessed.crack.by.laqwrt.animations.Class_56;
import zov.blessed.crack.by.laqwrt.Class_132;
import zov.blessed.crack.by.laqwrt.Class_41;
import zov.blessed.crack.by.laqwrt.Class_64;
import zov.blessed.crack.by.laqwrt.setting.Setting;

public class Module {
   private boolean state;
   private boolean field_341;
   private String[] name;
   private int key;
   private Category category;
   protected Minecraft mc = Minecraft.getInstance();
   private ArrayList<Setting> settings;
   public final Class_132 field_347;

   public Module(String[] name, Category category) {
      this.name = name;
      this.category = category;
      this.settings = new ArrayList<>();
      this.field_347 = new Class_132(Class_56.field_297);
   }

   public ArrayList<Setting> getSettings() {
      return this.settings;
   }

   public void addSettings(Setting... var1) {
      Setting[] var2 = var1;
      int var3 = var1.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Setting var5 = var2[var4];
         this.getSettings().add(var5);
      }

   }

   public boolean isState() {
      return this.state;
   }

   public boolean method_200() {
      return this.field_341;
   }

   public void method_201(boolean var1) {
      this.field_341 = var1;
   }

   public String[] getName() {
      return this.name;
   }

   public int getKey() {
      return this.key;
   }

   public void setKey(int var1) {
      this.key = var1;
   }

   public Category category() {
      return this.category;
   }

   public void toggle(boolean state) {
      this.state = state;
      if (this.state) {
         this.onEnable();
      } else {
         this.onDisable();
      }
   }

   public void method_207() {
   }

   public void method_208() {
   }

   public void onEnable() {
   }

   public void onDisable() {
   }

   public void method_211() {
   }

   public void method_212() {
   }

   public boolean packetEvent(Object var1, Class_64 var2) {
      return true;
   }

   public void method_214() {
   }

   public void method_215(MovementInput var1) {
   }

   public void method_216(int var1, int var2, int var3) {
   }

   public void method_217(Class_41 var1) {
   }
}
