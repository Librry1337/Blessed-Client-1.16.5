package zov.blessed.crack.by.laqwrt;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import java.util.HashMap;

public class Class_89 {
   private static final HashMap<Integer, HashMap<String, String>> field_648 = (HashMap)Class_138.method_443(new HashMap(), (var0) -> {
      var0.put(0, (HashMap)Class_138.method_443(new HashMap(), (var0x) -> {
         var0x.put("tick", "tick");
         var0x.put("onUpdateWalkingPlayer", "sendPosition");
         var0x.put("jump", "jumpFromGround");
      }));
      var0.put(1, (HashMap)Class_138.method_443(new HashMap(), (var0x) -> {
         var0x.put("tick", "j");
         var0x.put("onUpdateWalkingPlayer", "O");
         var0x.put("jump", "dK");
      }));
      var0.put(3, (HashMap)Class_138.method_443(new HashMap(), (var0x) -> {
         var0x.put("tick", "method_5773");
         var0x.put("onUpdateWalkingPlayer", "method_3136");
         var0x.put("jump", "method_6043");
      }));
   });
   private int field_649;

   public Class_89(int var1) {
      this.field_649 = var1;
   }

   public String method_310(String var1) {
      HashMap var2 = (HashMap)field_648.get(this.field_649);
      return var2 == null ? var1 : (String)var2.getOrDefault(var1, var1);
   }

   public int method_311() {
      return this.field_649;
   }
}
