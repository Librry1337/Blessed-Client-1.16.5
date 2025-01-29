package zov.blessed.crack.by.laqwrt;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import net.minecraft.util.math.vector.Vector3d;
import zov.blessed.crack.by.laqwrt.animations.Class_137;

public class Class_106 extends Class_143<Vector3d> {
   public Class_106(Class_137 var1) {
      super(var1);
   }

   public Class_106() {
   }

   @Override
   public Vector3d ヒあ1(Vector3d var1, Vector3d var2, double var3) {
      return var1.add(var2.subtract(var1).scale(var3));
   }

   @Override
   public Vector3d ヌル() {
      return Vector3d.ZERO;
   }
}
