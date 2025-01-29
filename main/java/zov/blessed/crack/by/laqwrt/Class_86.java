package zov.blessed.crack.by.laqwrt;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import java.util.HashMap;

public class Class_86 {
   private static final HashMap<Integer, HashMap<String, String>> field_645 = (HashMap)Class_138.method_443(new HashMap(), (var0) -> {
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
   });
   private int field_646;

   public Class_86(int var1) {
      this.field_646 = var1;
   }

   public String method_301(String var1) {
      HashMap var2 = (HashMap)field_645.get(this.field_646);
      return var2 == null ? var1 : (String)var2.getOrDefault(var1, var1);
   }

   public int method_302() {
      return this.field_646;
   }
}
