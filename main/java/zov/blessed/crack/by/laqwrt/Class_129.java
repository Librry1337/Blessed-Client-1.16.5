package zov.blessed.crack.by.laqwrt;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import java.util.Objects;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;

public class Class_129 {
   private float field_704;
   private float field_705;

   public Class_129(Entity var1) {
      this(var1.yRot, var1.xRot);
   }

   public Class_129(float var1, float var2) {
      this.field_704 = var1;
      this.field_705 = var2;
   }

   public float method_421() {
      return this.field_704;
   }

   public float method_422() {
      return this.field_705;
   }

   public Class_129 method_423(Class_129 var1, float var2) {
      float var3 = MathHelper.lerp(var2, this.method_421(), var1.method_421());
      float var4 = MathHelper.lerp(var2, this.method_422(), var1.method_422());
      return new Class_129(var3, var4);
   }

   public Vector3d method_424() {
      float var1 = (float)Math.toRadians((double)this.field_705);
      float var2 = (float)Math.toRadians((double)(-this.field_704));
      float var3 = MathHelper.cos(var2);
      float var4 = MathHelper.sin(var2);
      float var5 = MathHelper.cos(var1);
      float var6 = MathHelper.sin(var1);
      return new Vector3d((double)(var4 * var5), (double)(-var6), (double)(var3 * var5));
   }

   public Class_129 method_425(Vector3d var1) {
      float var2 = (float)Math.toDegrees(Math.asin(-var1.y));
      float var3 = (float)Math.toDegrees(Math.atan2(var1.x, var1.z));
      return new Class_129(var2, var3);
   }

   public Class_129 method_426() {
      return new Class_129(this.field_704, this.field_705);
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.field_704, this.field_705});
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         Class_129 var2 = (Class_129)var1;
         return Float.floatToIntBits(this.field_705) == Float.floatToIntBits(var2.field_705) && Float.floatToIntBits(this.field_704) == Float.floatToIntBits(var2.field_704);
      }
   }

   public String toString() {
      return "Rotation [yaw=" + this.field_704 + ", pitch=" + this.field_705 + "]";
   }
}
