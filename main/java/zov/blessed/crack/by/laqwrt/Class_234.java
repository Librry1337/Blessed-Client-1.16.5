package zov.blessed.crack.by.laqwrt;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Objects;
import javax.imageio.ImageIO;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.vector.Matrix4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import zov.blessed.crack.by.laqwrt.utils.ShaderUtil;

public class Class_234 {
   private static HashMap<Integer, Integer> field_1178 = new HashMap();

   public static void method_1079(float var0, float var1, float var2, float var3, float var4, Color var5, ShaderUtil var6) {
      GlStateManager._enableBlend();
      GlStateManager._blendFunc(770, 771);
      var6.method_1252();
      method_1081(var0, var1, var2, var3, var4, var6);
      var6.method_1255("color", (float)var5.getRed() / 255.0F, (float)var5.getGreen() / 255.0F, (float)var5.getBlue() / 255.0F, (float)var5.getAlpha() / 255.0F);
      method_1082(var0 - 1.0F, var1 - 1.0F, var2 + 2.0F, var3 + 2.0F);
      var6.method_1256();
      GlStateManager._disableBlend();
      GlStateManager._clearCurrentColor();
   }

   public static void method_1080(int var0, int var1, int var2, int var3, int var4, Color var5, ShaderUtil var6) {
      method_1079((float)var0, (float)var1, (float)var2, (float)var3, (float)var4, var5, var6);
   }

   private static void method_1081(float var0, float var1, float var2, float var3, float var4, ShaderUtil var5) {
      MainWindow var6 = Minecraft.getInstance().getWindow();
      var5.method_1255("location", var0 * (float) Blessed.getInstance().method_806().method_1171(), (float)var6.getScreenHeight() - var3 * (float) Blessed.getInstance().method_806().method_1171() - var1 * (float) Blessed.getInstance().method_806().method_1171());
      var5.method_1255("rectSize", var2 * (float) Blessed.getInstance().method_806().method_1171(), var3 * (float) Blessed.getInstance().method_806().method_1171());
      var5.method_1255("radius", var4 * (float) Blessed.getInstance().method_806().method_1171());
   }

   public static void method_1082(float var0, float var1, float var2, float var3) {
      GL11.glBegin(7);
      GL11.glTexCoord2f(0.0F, 0.0F);
      GL11.glVertex2f(var0, var1);
      GL11.glTexCoord2f(0.0F, 1.0F);
      GL11.glVertex2f(var0, var1 + var3);
      GL11.glTexCoord2f(1.0F, 1.0F);
      GL11.glVertex2f(var0 + var2, var1 + var3);
      GL11.glTexCoord2f(1.0F, 0.0F);
      GL11.glVertex2f(var0 + var2, var1);
      GL11.glEnd();
   }

   public static void method_1083(double var0, double var2, double var4, double var6, DynamicTexture var8, float var9, Color var10) {
      double var11 = 1.0D;
      double var13 = 1.0D;
      double var15 = (var4 + var6) / 2.0D;
      long var17 = Math.round(var15);
      GlStateManager._pushMatrix();
      GL11.glEnable(3042);
      GL11.glScaled(var11, var13, 1.0D);
      GlStateManager._bindTexture(var8.getId());
      GL11.glColor4f((float)var10.getRed() / 255.0F, (float)var10.getGreen() / 255.0F, (float)var10.getBlue() / 255.0F, var9);
      GL11.glBegin(7);
      GL11.glTexCoord2d(0.0D, 0.0D);
      GL11.glVertex2d(var0 / var11, var2 / var13);
      GL11.glTexCoord2d(0.0D, var15 / (double)var17);
      GL11.glVertex2d(var0 / var11, var2 / var13 + var6);
      GL11.glTexCoord2d(1.0D, var15 / (double)var17);
      GL11.glVertex2d(var0 / var11 + var4, var2 / var13 + var6);
      GL11.glTexCoord2d(1.0D, 0.0D);
      GL11.glVertex2d(var0 / var11 + var4, var2 / var13);
      GL11.glEnd();
      GL11.glDisable(3042);
      GlStateManager._popMatrix();
   }

   public static void method_1084(double var0, double var2, double var4, double var6) {
      MainWindow var8 = Minecraft.getInstance().getWindow();
      double var9 = (double) Blessed.getInstance().method_806().method_1171();
      GL11.glScissor((int)(var0 * var9), (int)(((double)var8.getScreenHeight() / var9 - var6) * var9), (int)((var4 - var0) * var9), (int)((var6 - var2) * var9));
   }

   public static int method_1085(String var0) {
       int var2 = Objects.hash(var0);
      int var9;
      if (field_1178.containsKey(var2)) {
         var9 = field_1178.get(var2);
      } else {
         InputStream var3;

          var3 = Blessed.class.getResourceAsStream("/assets/" + var0);

          BufferedImage var4;

         try {
            var4 = ImageIO.read(var3);
         } catch (IOException var7) {
            throw new RuntimeException(var7);
         }

         try {
            var9 = method_1086(var4);
         } catch (Exception var6) {
            throw new RuntimeException(var6);
         }

         field_1178.put(var2, var9);
      }

      return var9;
   }

   public static int method_1086(BufferedImage var0) throws Exception {
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

      Method var7 = Buffer.class.getDeclaredMethod("flip");
      var7.setAccessible(true);
      var7.invoke(var2);
      var4 = GlStateManager._genTexture();
      GlStateManager._bindTexture(var4);
      GL30.glTexParameteri(3553, 10242, 33071);
      GL30.glTexParameteri(3553, 10243, 33071);
      GL30.glTexParameteri(3553, 10241, 9729);
      GL30.glTexParameteri(3553, 10240, 9729);
      GL30.glTexImage2D(3553, 0, 32856, var0.getWidth(), var0.getHeight(), 0, 6408, 5121, var2);
      GlStateManager._bindTexture(0);
      return var4;
   }

   public static void method_1087(double var0, double var2, float var4, float var5, float var6, float var7, double var8, double var10, float var12, float var13) {
      Matrix4f var14 = (new MatrixStack()).last().pose();
      float var15 = 1.0F / var12;
      float var16 = 1.0F / var13;
      Tessellator var17 = Tessellator.getInstance();
      BufferBuilder var18 = var17.getBuilder();
      var18.begin(7, DefaultVertexFormats.POSITION_TEX);
      var18.vertex(var14, (float)var0, (float)var2 + (float)var10, 0.0F).uv(var4 * var15, (var5 + var7) * var16).endVertex();
      var18.vertex(var14, (float)var0 + (float)var8, (float)var2 + (float)var10, 0.0F).uv((var4 + var6) * var15, (var5 + var7) * var16).endVertex();
      var18.vertex(var14, (float)var0 + (float)var8, (float)var2, 0.0F).uv((var4 + var6) * var15, var5 * var16).endVertex();
      var18.vertex(var14, (float)var0, (float)var2, 0.0F).uv(var4 * var15, var5 * var16).endVertex();
      var17.end();
   }

   public static void method_1088(double var0, double var2, double var4, double var6) {
      Matrix4f var8 = (new MatrixStack()).last().pose();
      Tessellator var9 = Tessellator.getInstance();
      BufferBuilder var10 = var9.getBuilder();
      var10.begin(7, DefaultVertexFormats.POSITION_TEX);
      var10.vertex(var8, (float)var0, (float)var2, 0.0F).uv(0.0F, 0.0F).endVertex();
      var10.vertex(var8, (float)var0, (float)var2 + (float)var6, 0.0F).uv(0.0F, 1.0F).endVertex();
      var10.vertex(var8, (float)var0 + (float)var4, (float)var2 + (float)var6, 0.0F).uv(1.0F, 1.0F).endVertex();
      var10.vertex(var8, (float)var0 + (float)var4, (float)var2, 0.0F).uv(1.0F, 0.0F).endVertex();
      var9.end();
   }
}
