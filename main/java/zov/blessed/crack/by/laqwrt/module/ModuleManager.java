package zov.blessed.crack.by.laqwrt.module;

import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.module.modules.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ModuleManager {
   private final List<Module> modules = new ArrayList<>();

   public ModuleManager() {
      modules.add(new ClickGUI());
      modules.add(new MiddleClickPearl());
      modules.add(new ElytraSwap());
      modules.add(new AutoSprint());
      modules.add(new ShieldBreaker());
      modules.add(new SelfDestruct());
      modules.add(new AutoShiftTap());
      modules.add(new ESP());
      modules.add(new Tracers());
      modules.add(new NoBadEffects());
      modules.add(new FreeCam());
      modules.add(new HitBox());
      modules.add(new Reach());
      modules.add(new NameTags());
      modules.add(new NoInteract());
      modules.add(new Trajectories());
      modules.add(new MiddleClickFriend());
      modules.add(new AutoCrystall());
      modules.add(new TriggerBot());
      modules.add(new HUD());
      modules.add(new AimAissist());
      modules.add(new AutoTotem());
      modules.add(new ObsBypass());
      modules.add(new NoHurtCam());
      modules.add(new FullBright());
      modules.add(new ROFLAN());
      modules.add(new InventoryWalk());
      modules.add(new AutoMist());
      modules.add(new TargetESP());
      modules.add(new TargetHud());
      if (Blessed.isBeta != null) {
         this.modules.add(new PotionRecovery());
      }

      if (Blessed.isBeta != null) {
         this.modules.add(new Nahodilochka());
      }

      if (Blessed.isBeta != null) {
         this.modules.add(new WatermarklyBlurFace());
      }

      if (Blessed.isBeta != null) {
         this.modules.add(new DurationInfo());
      }

      if (Blessed.isBeta != null) {
         this.modules.add(new ROFLAN());
      }

   }

   public List<Module> getModules() {
      return this.modules;
   }

   public List<Module> getModulesForCategory(Category category) {
      ArrayList<Module> modulesForCategory = new ArrayList<>();
       for (Module module : getModules()) {
           if (module.category() == category) {
               modulesForCategory.add(module);
           }
       }
      return modulesForCategory;
   }

   public Module getModuleByClass(Class<?> clazz) {
      Iterator<Module> var2 = this.getModules().iterator();

      Module module;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         module = var2.next();
      } while(module.getClass() != clazz);

      return module;
   }
}
