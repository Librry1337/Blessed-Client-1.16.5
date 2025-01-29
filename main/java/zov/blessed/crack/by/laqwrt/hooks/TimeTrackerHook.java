package zov.blessed.crack.by.laqwrt.hooks;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import net.minecraft.profiler.IProfileResult;
import net.minecraft.profiler.IProfiler;
import net.minecraft.profiler.IResultableProfiler;
import net.minecraft.profiler.TimeTracker;

public class TimeTrackerHook extends TimeTracker {
   private final LongSupplier realTime;
   private final IntSupplier tickCount;
   private IResultableProfiler profiler;

   public TimeTrackerHook(LongSupplier realTime, IntSupplier tickCount) {
      super(realTime, tickCount);
      this.profiler = ProfilerHook.instance;
      this.realTime = realTime;
      this.tickCount = tickCount;
   }

   public boolean isEnabled() {
      return this.profiler != ProfilerHook.instance;
   }

   public void disable() {
      this.profiler = ProfilerHook.instance;
   }

   public void enable() {
      this.profiler = new ProfilerHook();
   }

   public IProfiler getFiller() {
      return this.profiler;
   }

   public IProfileResult getResults() {
      return this.profiler.getResults();
   }
}
