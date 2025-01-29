package zov.blessed.crack.by.laqwrt;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL30;

public class Class_53 implements Class_169 {
   private static final List<Class_53> field_268 = new ArrayList<>();
   static Minecraft field_269 = Minecraft.getInstance();
   static MainWindow field_270;
   public static int field_271;
   private int field_272 = -1;
   private int field_273;
   private static String field_274;

   public Class_53(String var1) {
      RenderSystem.recordRenderCall(() -> {
         int var2 = GlStateManager.glCreateProgram();

         try {
            int var3 = GlStateManager.glCreateShader(35632);
            GlStateManager.glShaderSource(var3, var1);
            GlStateManager.glCompileShader(var3);
            int var4 = GL30.glGetShaderi(var3, 35713);
            if (var4 == 0) {
               GlStateManager.glDeleteShader(var3);
            }

            GlStateManager.glAttachShader(var2, field_271);
            GlStateManager.glAttachShader(var2, var3);
            GlStateManager.glLinkProgram(var2);
            this.field_272 = var3;
         } catch (Exception var5) {
            var5.hashCode();
         }

         this.field_273 = var2;
         field_268.add(this);
      });
   }

   public boolean method_130() {
      return this.field_273 != 0;
   }

   public void method_131() {
      if (this.field_273 != 0) {
         GlStateManager._glUseProgram(this.field_273);
      }
   }

   public void method_132() {
      if (this.field_273 != 0) {
         GlStateManager._glUseProgram(0);
      }
   }

   public void method_133(String var1, float... var2) {
      if (this.field_273 != 0) {
         int var3 = GL30.glGetUniformLocation(this.field_273, var1);
         switch(var2.length) {
         case 1:
            GL30.glUniform1f(var3, var2[0]);
            break;
         case 2:
            GL30.glUniform2f(var3, var2[0], var2[1]);
            break;
         case 3:
            GL30.glUniform3f(var3, var2[0], var2[1], var2[2]);
            break;
         case 4:
            GL30.glUniform4f(var3, var2[0], var2[1], var2[2], var2[3]);
         }

      }
   }

   public void method_134(String var1, int... var2) {
      if (this.field_273 != 0) {
         int var3 = GL30.glGetUniformLocation(this.field_273, var1);
         switch(var2.length) {
         case 1:
            GL30.glUniform1i(var3, var2[0]);
            break;
         case 2:
            GL30.glUniform2i(var3, var2[0], var2[1]);
            break;
         case 3:
            GL30.glUniform3i(var3, var2[0], var2[1], var2[2]);
            break;
         case 4:
            GL30.glUniform4i(var3, var2[0], var2[1], var2[2], var2[3]);
         }

      }
   }

   public void method_135(String var1, FloatBuffer var2) {
      if (this.field_273 != 0) {
         GL30.glUniform1fv(GL30.glGetUniformLocation(this.field_273, var1), var2);
      }
   }

   public static void method_136() {
      method_137(0.0D, 0.0D, (double)field_270.getGuiScaledWidth(), (double)field_270.getGuiScaledHeight());
   }

   public static void method_137(double var0, double var2, double var4, double var6) {
      GL30.glBegin(7);
      GL30.glTexCoord2d(0.0D, 0.0D);
      GL30.glVertex2d(var0, var2);
      GL30.glTexCoord2d(0.0D, 1.0D);
      GL30.glVertex2d(var0, var2 + var6);
      GL30.glTexCoord2d(1.0D, 1.0D);
      GL30.glVertex2d(var0 + var4, var2 + var6);
      GL30.glTexCoord2d(1.0D, 0.0D);
      GL30.glVertex2d(var0 + var4, var2);
      GL30.glEnd();
   }

   public static void method_138() {
      RenderSystem.recordRenderCall(() -> {
         for(int var0 = 0; var0 < field_268.size(); ++var0) {
            Class_53 var1 = (Class_53)field_268.get(var0);
            if (var1.field_272 != -1) {
               GlStateManager.glDeleteShader(var1.field_272);
            }

            GlStateManager.glDeleteProgram(var1.field_273);
         }

         GlStateManager.glDeleteShader(field_271);
      });
   }

   static {
      field_270 = field_269.getWindow();
      field_271 = -1;
      field_274 = "#version 120\n\nvoid main() {\n    gl_TexCoord[0] = gl_MultiTexCoord0;\n    gl_Position = gl_ModelViewProjectionMatrix * gl_Vertex;\n}";
      RenderSystem.recordRenderCall(() -> {
         field_271 = GlStateManager.glCreateShader(35633);
         GlStateManager.glShaderSource(field_271, field_274);
         GlStateManager.glCompileShader(field_271);
      });
   }
}
