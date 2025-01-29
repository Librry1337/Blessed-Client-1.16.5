package zov.blessed.crack.by.laqwrt;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import zov.blessed.crack.by.laqwrt.module.Module;
import zov.blessed.crack.by.laqwrt.setting.settings.BooleanSetting;
import zov.blessed.crack.by.laqwrt.setting.settings.ModeSetting;
import zov.blessed.crack.by.laqwrt.setting.settings.SliderSetting;
import zov.blessed.crack.by.laqwrt.setting.Setting;

import java.awt.Color;
import java.util.Arrays;

public class Class_186 {
   public String method_792() {
      Gson var1 = (new GsonBuilder()).setLenient().create();
      JsonObject var2 = new JsonObject();
      Module[] var3 = (Module[]) Blessed.getInstance().getModuleManager().getModules().toArray(new Module[0]);

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Module var5 = var3[var4];
         JsonObject var6 = new JsonObject();
         var6.addProperty("s", var5.isState() ? "1" : "0");
         var6.addProperty("k", var5.getKey());
         Setting[] var7 = (Setting[])var5.getSettings().toArray(new Setting[0]);

         for(int var8 = 0; var8 < var7.length; ++var8) {
            Setting var9 = var7[var8];
            String var10 = String.valueOf(Arrays.hashCode(var9.method_577()));
            if (var9 instanceof SliderSetting) {
               SliderSetting var11 = (SliderSetting)var9;
               var6.addProperty(var10, var11.method_1240());
            } else if (var9 instanceof BooleanSetting) {
               BooleanSetting var13 = (BooleanSetting)var9;
               var6.addProperty(var10, (Boolean)var13.method_580() ? "1" : "0");
            } else if (var9 instanceof ModeSetting) {
               ModeSetting var14 = (ModeSetting)var9;
               var6.addProperty(var10, var14.method_436());
            } else if (var9 instanceof Class_28) {
               Class_28 var15 = (Class_28)var9;
               var6.addProperty(var10, var15.method_40().getRGB());
            }
         }

         var2.add(String.valueOf(Arrays.hashCode(var5.getName())), var6);
      }

      System.gc();
      String var12 = var1.toJson(var2);
      return Class_195.method_857(var12).toString();
   }

   public void method_793(String var1) throws Exception {
      if (var1 != null && !var1.isEmpty()) {
         try {
            this.method_794(var1);
         } catch (Exception var3) {
            var3.hashCode();
         }

      }
   }

   private void method_794(String var1) throws Exception {
      try {
         var1 = Class_195.method_859(var1).toString();
      } catch (Exception var15) {
         var15.hashCode();
      }

      var1 = var1.trim();
      Gson var2 = (new GsonBuilder()).setLenient().create();
      JsonObject var3 = (JsonObject)var2.fromJson(var1, JsonObject.class);
      Module[] var4 = (Module[]) Blessed.getInstance().getModuleManager().getModules().toArray(new Module[0]);

      for(int var5 = 0; var5 < var4.length; ++var5) {
         Module var6 = var4[var5];
         if (var3.has(String.valueOf(Arrays.hashCode(var6.getName())))) {
            JsonElement var7 = var3.get(String.valueOf(Arrays.hashCode(var6.getName())));
            if (var7 != null && var7.isJsonObject()) {
               JsonObject var8 = var7.getAsJsonObject();
               if (var8.has("s")) {
                  var6.toggle(Integer.parseInt(var8.get("s").getAsString()) != 0);
               }

               if (var8.has("k")) {
                  var6.setKey(var8.get("k").getAsInt());
               }

               Setting[] var9 = (Setting[])var6.getSettings().toArray(new Setting[0]);

               for(int var10 = 0; var10 < var9.length; ++var10) {
                  Setting var11 = var9[var10];
                  if (var8.has(String.valueOf(Arrays.hashCode(var11.method_577())))) {
                     try {
                        JsonElement var12 = var8.get(String.valueOf(Arrays.hashCode(var11.method_577())));
                        if (var11 instanceof SliderSetting) {
                           SliderSetting var13 = (SliderSetting)var11;
                           var13.method_1239(var12.getAsFloat());
                        } else if (var11 instanceof BooleanSetting) {
                           BooleanSetting var16 = (BooleanSetting)var11;
                           var16.method_578(Integer.parseInt(var12.getAsString()) != 0);
                        } else if (var11 instanceof ModeSetting) {
                           ModeSetting var17 = (ModeSetting)var11;
                           var17.method_437(var12.getAsInt());
                        } else if (var11 instanceof Class_28) {
                           Class_28 var18 = (Class_28)var11;
                           var18.method_578(new Color(var12.getAsInt()));
                        }
                     } catch (Exception var14) {
                        var14.hashCode();
                     }
                  }
               }
            }
         }
      }

      System.gc();
      var1 = null;
      var3 = null;
   }
}
