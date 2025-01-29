package zov.blessed.crack.by.laqwrt;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.Kernel;
import java.util.HashMap;
import java.util.Hashtable;

public class Class_83 {
   private static final HashMap<Integer, Kernel> field_635 = new HashMap();
   public static int field_636 = 1;
   public static int field_637 = 2;
   private float field_638;
   private boolean field_639 = true;
   private boolean field_640 = true;
   private Kernel field_641;

   public Class_83(int var1) {
      this.field_638 = (float)var1;
      this.field_641 = (Kernel)field_635.getOrDefault(var1, null);
      if (this.field_641 == null) {
         this.field_641 = method_299((float)var1);
         field_635.put(var1, this.field_641);
      }

   }

   public void method_293(boolean var1) {
      this.field_639 = var1;
   }

   public void method_294(boolean var1) {
      this.field_640 = var1;
   }

   public BufferedImage method_295(BufferedImage var1, BufferedImage var2) {
      int var3 = var1.getWidth();
      int var4 = var1.getHeight();
      if (var2 == null) {
         var2 = this.method_296(var1, (ColorModel)null);
      }

      int[] var5 = new int[var3 * var4];
      int[] var6 = new int[var3 * var4];
      var1.getRGB(0, 0, var3, var4, var5, 0, var3);
      if (this.field_638 > 0.0F) {
         method_297(this.field_641, var5, var6, var3, var4, this.field_639, this.field_639 && this.field_640, false, 1);
         method_297(this.field_641, var6, var5, var4, var3, this.field_639, false, this.field_639 && this.field_640, 1);
      }

      var2.setRGB(0, 0, var3, var4, var5, 0, var3);
      return var2;
   }

   public BufferedImage method_296(BufferedImage var1, ColorModel var2) {
      if (var2 == null) {
         var2 = var1.getColorModel();
      }

      return new BufferedImage(var2, var2.createCompatibleWritableRaster(var1.getWidth(), var1.getHeight()), var2.isAlphaPremultiplied(), (Hashtable)null);
   }

   public static void method_297(Kernel var0, int[] var1, int[] var2, int var3, int var4, boolean var5, boolean var6, boolean var7, int var8) {
      float[] var9 = var0.getKernelData((float[])null);
      int var10 = var0.getWidth();
      int var11 = var10 / 2;

      for(int var12 = 0; var12 < var4; ++var12) {
         int var13 = var12;
         int var14 = var12 * var3;

         for(int var15 = 0; var15 < var3; ++var15) {
            float var16 = 0.0F;
            float var17 = 0.0F;
            float var18 = 0.0F;
            float var19 = 0.0F;
            int var20 = var11;

            int var21;
            int var23;
            int var24;
            for(var21 = -var11; var21 <= var11; ++var21) {
               float var22 = var9[var20 + var21];
               if (var22 != 0.0F) {
                  var23 = var15 + var21;
                  if (var23 < 0) {
                     if (var8 == 1) {
                        var23 = 0;
                     } else if (var8 == 2) {
                        var23 = (var15 + var3) % var3;
                     }
                  } else if (var23 >= var3) {
                     if (var8 == 1) {
                        var23 = var3 - 1;
                     } else if (var8 == 2) {
                        var23 = (var15 + var3) % var3;
                     }
                  }

                  var24 = var1[var14 + var23];
                  int var25 = var24 >> 24 & 255;
                  int var26 = var24 >> 16 & 255;
                  int var27 = var24 >> 8 & 255;
                  int var28 = var24 & 255;
                  if (var6) {
                     float var29 = (float)var25 * 0.003921569F;
                     var26 = (int)((float)var26 * var29);
                     var27 = (int)((float)var27 * var29);
                     var28 = (int)((float)var28 * var29);
                  }

                  var19 += var22 * (float)var25;
                  var16 += var22 * (float)var26;
                  var17 += var22 * (float)var27;
                  var18 += var22 * (float)var28;
               }
            }

            if (var7 && var19 != 0.0F && var19 != 255.0F) {
               float var30 = 255.0F / var19;
               var16 *= var30;
               var17 *= var30;
               var18 *= var30;
            }

            var21 = var5 ? method_298((int)((double)var19 + 0.5D)) : 255;
            int var31 = method_298((int)((double)var16 + 0.5D));
            var23 = method_298((int)((double)var17 + 0.5D));
            var24 = method_298((int)((double)var18 + 0.5D));
            var2[var13] = var21 << 24 | var31 << 16 | var23 << 8 | var24;
            var13 += var4;
         }
      }

   }

   public static int method_298(int var0) {
      if (var0 < 0) {
         return 0;
      } else {
         return var0 > 255 ? 255 : var0;
      }
   }

   public static Kernel method_299(float var0) {
      int var1 = (int)Math.ceil((double)var0);
      int var2 = var1 * 2 + 1;
      float[] var3 = new float[var2];
      float var4 = var0 / 3.0F;
      float var5 = 2.0F * var4 * var4;
      float var6 = 6.2831855F * var4;
      float var7 = (float)Math.sqrt((double)var6);
      float var8 = var0 * var0;
      float var9 = 0.0F;
      int var10 = 0;

      int var11;
      for(var11 = -var1; var11 <= var1; ++var11) {
         float var12 = (float)(var11 * var11);
         if (var12 > var8) {
            var3[var10] = 0.0F;
         } else {
            var3[var10] = (float)Math.exp((double)(-var12 / var5)) / var7;
         }

         var9 += var3[var10];
         ++var10;
      }

      for(var11 = 0; var11 < var2; ++var11) {
         var3[var11] /= var9;
      }

      return new Kernel(var2, 1, var3);
   }
}
