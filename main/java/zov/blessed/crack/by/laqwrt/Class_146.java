package zov.blessed.crack.by.laqwrt;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import com.mojang.blaze3d.platform.GlStateManager;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.HashMap;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.client.renderer.texture.Texture;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL30;

public class Class_146 {
   static Minecraft field_752 = Minecraft.getInstance();
   static MainWindow field_753;
   private static final HashMap<Integer, FloatBuffer> field_754;
   private static Method field_755;

   public static FloatBuffer method_522(int var0) {
      FloatBuffer var1 = (FloatBuffer)field_754.get(var0);
      if (var1 == null) {
         var1 = BufferUtils.createFloatBuffer(var0);
         float[] var2 = new float[var0];
         float var3 = (float)var0 / 2.0F;
         float var4 = 0.0F;

         int var5;
         for(var5 = 0; var5 < var0; ++var5) {
            float var6 = (float)var5 / var3;
            var2[var5] = 1.0F / (Math.abs(var3) * 2.5066283F) * (float)Math.exp(-0.5D * (double)var6 * (double)var6);
            var4 += var5 > 0 ? var2[var5] * 2.0F : var2[0];
         }

         for(var5 = 0; var5 < var0; ++var5) {
            var2[var5] /= var4;
         }

         var1.put(var2);

         try {
            field_755.invoke(var1);
         } catch (IllegalArgumentException | InvocationTargetException | IllegalAccessException var7) {
            var7.hashCode();
         }

         field_754.put(var0, var1);
      }

      return var1;
   }

   public static int method_523(BufferedImage var0) throws Exception {
      int[] var1 = var0.getRGB(0, 0, var0.getWidth(), var0.getHeight(), (int[])null, 0, var0.getWidth());
      ByteBuffer var2 = BufferUtils.createByteBuffer(var1.length * 4);
      int[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = var3[var5];
         var2.put((byte)(var6 >> 16 & 255));
         var2.put((byte)(var6 >> 8 & 255));
         var2.put((byte)(var6 & 255));
         var2.put((byte)(var6 >> 24 & 255));
      }

      var2.flip();
      int var7 = GlStateManager._genTexture();
      GlStateManager._bindTexture(var7);
      GL30.glTexParameteri(3553, 10242, 33071);
      GL30.glTexParameteri(3553, 10243, 33071);
      GL30.glTexParameteri(3553, 10241, 9729);
      GL30.glTexParameteri(3553, 10240, 9729);
      GL30.glTexImage2D(3553, 0, 32856, var0.getWidth(), var0.getHeight(), 0, 6408, 5121, var2);
      GlStateManager._bindTexture(0);
      return var7;
   }

   public static int method_524(ResourceLocation var0) {
      Object var1 = field_752.getTextureManager().getTexture(var0);
      if (var1 == null) {
         var1 = new SimpleTexture(var0);
         field_752.getTextureManager().register(var0, (Texture)var1);
      }

      return ((Texture)var1).getId();
   }

   public static void method_525() {
      GL30.glEnable(2960);
      GL30.glClear(1024);
      GlStateManager._stencilFunc(514, 1, 1);
      GlStateManager._stencilOp(7681, 7681, 7681);
      GlStateManager._colorMask(false, false, false, false);
   }

   public static void method_526() {
      GlStateManager._colorMask(true, true, true, true);
      GlStateManager._stencilOp(7680, 7680, 7680);
      GlStateManager._stencilFunc(514, 1, 1);
   }

   static {
      field_753 = field_752.getWindow();
      field_754 = new HashMap();
      field_755 = null;

      try {
         field_755 = Buffer.class.getDeclaredMethod("flip");
         field_755.setAccessible(true);
      } catch (Exception var1) {
         var1.hashCode();
      }

   }
}
