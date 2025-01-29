package zov.blessed.crack.by.laqwrt;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import com.mojang.blaze3d.platform.GlStateManager;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class Class_199 {
   public int field_1046 = 1024;
   public int field_1047 = 1024;
   private int field_1048;
   private final Class_71[] field_1049 = new Class_71[2048];
   private final Font field_1050;
   private boolean field_1051;
   private int field_1052 = -1;
   private int field_1053 = 8;

   public Class_199(Font var1, boolean var2, int var3) {
      this.field_1050 = var1;
      this.field_1051 = var2;
      this.field_1053 = var3;
      this.method_875(var2);
   }

   public Class_199(Font var1, boolean var2) {
      this.field_1050 = var1;
      this.field_1051 = var2;
      this.field_1053 = 8;
      this.method_875(var2);
   }

   private void method_875(boolean var1) {
      if (this.field_1050.getSize() <= 15) {
         this.field_1046 = 256;
         this.field_1047 = 256;
      }

      if (this.field_1050.getSize() <= 43) {
         this.field_1046 = 512;
         this.field_1047 = 512;
      } else if (this.field_1050.getSize() <= 91) {
         this.field_1046 = 1024;
         this.field_1047 = 1024;
      } else {
         this.field_1046 = 2048;
         this.field_1047 = 2048;
      }

      BufferedImage var2 = new BufferedImage(this.field_1046, this.field_1047, 2);
      Graphics2D var3 = (Graphics2D)var2.getGraphics();
      var3.setFont(this.field_1050);
      var3.setColor(new Color(255, 255, 255, 0));
      var3.fillRect(0, 0, this.field_1046, this.field_1047);
      var3.setColor(Color.white);
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;

      for(int var7 = 0; var7 < 2048; ++var7) {
         char var8 = (char)var7;
         BufferedImage var9 = this.method_877(var8, var1);
         Class_71 var10 = new Class_71(this);
         var10.field_601 = var9.getWidth();
         var10.field_602 = var9.getHeight();
         if (var5 + var10.field_601 >= this.field_1046) {
            var5 = 0;
            var6 += var4;
            var4 = 0;
         }

         var10.field_603 = var5;
         var10.field_604 = var6;
         if (var10.field_602 > this.field_1052) {
            this.field_1052 = var10.field_602;
         }

         if (var10.field_602 > var4) {
            var4 = var10.field_602;
         }

         this.field_1049[var7] = var10;
         var3.drawImage(var9, var5, var6, (ImageObserver)null);
         var5 += var10.field_601;
      }

      try {
         this.field_1048 = method_876(var2);
      } catch (NullPointerException var11) {
         var11.hashCode();
      }

   }

   public static int method_876(BufferedImage var0) {
      int[] var1 = new int[var0.getWidth() * var0.getHeight()];
      var0.getRGB(0, 0, var0.getWidth(), var0.getHeight(), var1, 0, var0.getWidth());
      ByteBuffer var2 = BufferUtils.createByteBuffer(var0.getWidth() * var0.getHeight() * 4);

      int var3;
      for(var3 = 0; var3 < var0.getHeight(); ++var3) {
         for(int var4 = 0; var4 < var0.getWidth(); ++var4) {
            int var5 = var1[var3 * var0.getWidth() + var4];
            var2.put((byte)(var5 >> 16 & 255));
            var2.put((byte)(var5 >> 8 & 255));
            var2.put((byte)(var5 & 255));
            var2.put((byte)(var5 >> 24 & 255));
         }
      }

      var2.flip();
      var3 = GL11.glGenTextures();
      GL11.glBindTexture(3553, var3);
      GL11.glTexParameteri(3553, 10242, 33071);
      GL11.glTexParameteri(3553, 10243, 33071);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexImage2D(3553, 0, 32856, var0.getWidth(), var0.getHeight(), 0, 6408, 5121, var2);
      return var3;
   }

   private BufferedImage method_877(char var1, boolean var2) {
      BufferedImage var3 = new BufferedImage(1, 1, 2);
      Graphics2D var4 = (Graphics2D)var3.getGraphics();
      if (var2) {
         var4.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      } else {
         var4.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
      }

      var4.setFont(this.field_1050);
      FontMetrics var5 = var4.getFontMetrics();
      int var6 = var5.charWidth(var1) + 8;
      if (var6 <= 0) {
         var6 = 7;
      }

      int var7 = var5.getHeight() + 3;
      if (var7 <= 0) {
         var7 = this.field_1050.getSize();
      }

      BufferedImage var8 = new BufferedImage(var6, var7, 2);
      Graphics2D var9 = (Graphics2D)var8.getGraphics();
      if (var2) {
         var9.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      } else {
         var9.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
      }

      var9.setFont(this.field_1050);
      var9.setColor(Color.WHITE);
      boolean var10 = true;
      boolean var11 = true;
      var9.drawString(String.valueOf(var1), 3, 1 + var5.getAscent());
      return var8;
   }

   public void method_878(char var1, float var2, float var3) throws ArrayIndexOutOfBoundsException {
      try {
         this.method_879(var2, var3, (float)this.field_1049[var1].field_601, (float)this.field_1049[var1].field_602, (float)this.field_1049[var1].field_603, (float)this.field_1049[var1].field_604, (float)this.field_1049[var1].field_601, (float)this.field_1049[var1].field_602);
      } catch (Exception var5) {
         var5.hashCode();
      }

   }

   private void method_879(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = var5 / (float)this.field_1046;
      float var10 = var6 / (float)this.field_1047;
      float var11 = var7 / (float)this.field_1046;
      float var12 = var8 / (float)this.field_1047;
      GL11.glBegin(4);
      GL11.glTexCoord2f(var9 + var11, var10);
      GL11.glVertex2d((double)(var1 + var3), (double)var2);
      GL11.glTexCoord2f(var9, var10);
      GL11.glVertex2d((double)var1, (double)var2);
      GL11.glTexCoord2f(var9, var10 + var12);
      GL11.glVertex2d((double)var1, (double)(var2 + var4));
      GL11.glTexCoord2f(var9, var10 + var12);
      GL11.glVertex2d((double)var1, (double)(var2 + var4));
      GL11.glTexCoord2f(var9 + var11, var10 + var12);
      GL11.glVertex2d((double)(var1 + var3), (double)(var2 + var4));
      GL11.glTexCoord2f(var9 + var11, var10);
      GL11.glVertex2d((double)(var1 + var3), (double)var2);
      GL11.glEnd();
   }

   public void method_880(String var1, double var2, double var4, Color var6, boolean var7) {
      var2 *= 2.0D;
      var4 = var4 * 2.0D - 2.0D;
      GL11.glPushMatrix();
      GL11.glHint(3155, 4354);
      GL11.glScaled(0.25D, 0.25D, 0.25D);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GlStateManager._bindTexture(this.field_1048);
      this.method_881(var7 ? new Color(0.05F, 0.05F, 0.05F, (float)var6.getAlpha() / 255.0F) : var6);
      int var8 = var1.length();

      for(int var9 = 0; var9 < var8; ++var9) {
         char var10 = var1.charAt(var9);
         if (var10 < this.field_1049.length && var10 >= 0) {
            this.method_878(var10, (float)var2, (float)var4);
            var2 += (double)(this.field_1049[var10].field_601 - this.field_1053);
         }
      }

      GL11.glPopMatrix();
   }

   public void method_881(Color var1) {
      float var2 = (float)var1.getRed() / 255.0F;
      float var3 = (float)var1.getGreen() / 255.0F;
      float var4 = (float)var1.getBlue() / 255.0F;
      float var5 = (float)var1.getAlpha() / 255.0F;
      GL11.glColor4f(var2, var3, var4, var5);
   }

   public int method_882(String var1) {
      int var2 = 1;
      char[] var3 = var1.toCharArray();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         char var6 = var3[var5];
         if (var6 == '\n') {
            ++var2;
         }
      }

      return (this.field_1052 - this.field_1053) / 2 * var2;
   }

   public int method_883() {
      return (this.field_1052 - this.field_1053) / 2;
   }

   public int method_884(String var1) {
      int var2 = 0;
      char[] var3 = var1.toCharArray();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         char var6 = var3[var5];
         if (var6 < this.field_1049.length && var6 >= 0) {
            var2 += this.field_1049[var6].field_601 - this.field_1053;
         }
      }

      return var2 / 2;
   }

   public boolean method_885() {
      return this.field_1051;
   }

   public void method_886(boolean var1) {
      if (this.field_1051 != var1) {
         this.field_1051 = var1;
         this.method_875(var1);
      }

   }

   public Font method_887() {
      return this.field_1050;
   }
}
