package zov.blessed.crack.by.laqwrt.hooks;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import java.util.function.Supplier;
import net.minecraft.client.Minecraft;
import net.minecraft.profiler.IProfileResult;
import net.minecraft.profiler.IResultableProfiler;
import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.module.modules.NoHurtCam;

public class ProfilerHook implements IResultableProfiler {
   public static IResultableProfiler instance = new ProfilerHook();

   public void startTick() {
   }

   public void endTick() {
   }

   public void push(String var1) {
      if (Minecraft.getInstance().player != null && Minecraft.getInstance().level != null) {
         if (var1.contains("tick")) {
            Blessed.getInstance().method_814();
         }

         if (var1.contains("push")) {
            Blessed.getInstance().method_822();
         }

         if (var1.contains("bossHealth")/* && !Blessed.getInstance().getModuleManager().getModuleByClass(ObsBypass.class).isState()*/) {
            Blessed.getInstance().method_816();
         }

      }
   }

   public void push(Supplier<String> var1) {
   }

   public void pop() {
   }

   public void popPush(String var1) {
      if (Minecraft.getInstance().player != null && Minecraft.getInstance().level != null) {
         if (var1.contains("weather")) {
            Blessed.getInstance().method_820();
         }

         if (var1.contains("textures")) {
            Blessed.getInstance().method_821();
         }

         if (var1.equals("hand") || var1.equals("camera")) {
            NoHurtCam.instance.method_394();
         }

      }
   }

   public void popPush(Supplier<String> var1) {
   }

   public void incrementCounter(String var1) {
   }

   public void incrementCounter(Supplier<String> var1) {
   }

   public IProfileResult getResults() {
      return null;
   }
}
