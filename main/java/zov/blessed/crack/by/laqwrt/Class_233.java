package zov.blessed.crack.by.laqwrt;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.vector.Vector3d;

public class Class_233 {
   public static double method_1064(double var0) {
      return (double)Math.round(var0);
   }

   public static double method_1065(double var0, int var2) {
      double var3 = Math.pow(10.0D, (double)var2);
      return (double)Math.round(var0 * var3) / var3;
   }

   public static double method_1066(double var0) {
      return Math.abs(var0 > 0.0D ? var0 - Math.floor(var0) : (var0 - Math.ceil(var0)) * -1.0D);
   }

   public static double method_1067(double var0, double var2, double var4, double var6, double var8) {
      var0 = method_1072(var0, var2, var4);
      double var10 = (var0 - var2) / (var4 - var2);
      return method_1076(var6, var8, var10);
   }

   public static float method_1068(float var0, float var1, float var2, float var3, float var4) {
      var0 = method_1071(var0, var1, var2);
      float var5 = (var0 - var1) / (var2 - var1);
      return method_1075(var3, var4, var5);
   }

   public static double method_1069(double var0, double var2, double var4, double var6, double var8) {
      var0 = method_1072(var2, var4, var0);
      double var10 = (var0 - var2) / (var4 - var2);
      return method_1076(var6, var8, var10);
   }

   public static int method_1070(int var0, int var1, int var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }

   public static float method_1071(float var0, float var1, float var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }

   public static double method_1072(double var0, double var2, double var4) {
      if (var0 < var2) {
         return var2;
      } else {
         return var0 > var4 ? var4 : var0;
      }
   }

   public static double method_1073(double var0, double var2) {
      return Math.abs(var0 > var2 ? var2 / var0 : var0 / var2);
   }

   public static int method_1074(int var0, int var1, double var2) {
      return (int)((double)var0 + (double)(var1 - var0) * var2);
   }

   public static float method_1075(float var0, float var1, float var2) {
      return var0 + (var1 - var0) * var2;
   }

   public static double method_1076(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * var4;
   }

   public static Vector3d method_1077(Vector3d var0, Vector3d var1, float var2) {
      double var3 = method_1076(var1.x, var0.x, (double)var2);
      double var5 = method_1076(var1.y, var0.y, (double)var2);
      double var7 = method_1076(var1.z, var0.z, (double)var2);
      return new Vector3d(var3, var5, var7);
   }

   public static AxisAlignedBB method_1078(AxisAlignedBB var0, AxisAlignedBB var1, float var2) {
      double var3 = method_1076(var1.minX, var0.minX, (double)var2);
      double var5 = method_1076(var1.minY, var0.minY, (double)var2);
      double var7 = method_1076(var1.minZ, var0.minZ, (double)var2);
      double var9 = method_1076(var1.maxX, var0.maxX, (double)var2);
      double var11 = method_1076(var1.maxY, var0.maxY, (double)var2);
      double var13 = method_1076(var1.maxZ, var0.maxZ, (double)var2);
      return new AxisAlignedBB(var3, var5, var7, var9, var11, var13);
   }
}
