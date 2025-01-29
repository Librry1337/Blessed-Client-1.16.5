package zov.blessed.crack.by.laqwrt.utils;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import com.mojang.blaze3d.platform.GlStateManager;
import org.lwjgl.opengl.GL20;

public class ShaderUtil {
   public int field_1297 = 0;
   private int field_1298 = 0;
   private int field_1299 = 0;
   private final String fragmentShader;

   public ShaderUtil(String fragmentShader) {
      this.fragmentShader = fragmentShader;
      this.method_1250();
   }

   private void method_1250() {
      this.field_1297 = this.method_1251(this.fragmentShader);
   }

   public int method_1251(String var1) {
      int var2 = GL20.glCreateProgram();
      int var3 = GL20.glCreateShader(35632);
      GL20.glShaderSource(var3, var1);
      GL20.glCompileShader(var3);
      GL20.glAttachShader(var2, var3);
      if (GL20.glGetShaderi(var3, 35713) == 0) {
      }

      GL20.glLinkProgram(var2);
      GL20.glValidateProgram(var2);
      return var2;
   }

   public void method_1252() {
      this.field_1298 = GlStateManager._getInteger(35725);
      GL20.glUseProgram(this.field_1297);
      this.field_1299 = this.field_1297;
   }

   private void method_1253(int var1) {
      this.field_1298 = GlStateManager._getInteger(35725);
      GL20.glUseProgram(var1);
      this.field_1299 = var1;
   }

   public void method_1254(String var1, int var2) {
      if (this.field_1299 != 0) {
         int var3 = GL20.glGetUniformLocation(this.field_1299, var1);
         if (var3 != -1) {
            GL20.glUniform1i(var3, var2);
         }

      }
   }

   public void method_1255(String var1, float... var2) {
      int var3 = GL20.glGetUniformLocation(this.field_1299, var1);
      if (var3 != -1) {
         switch(var2.length) {
         case 1:
            GL20.glUniform1f(var3, var2[0]);
            break;
         case 2:
            GL20.glUniform2f(var3, var2[0], var2[1]);
            break;
         case 3:
            GL20.glUniform3f(var3, var2[0], var2[1], var2[2]);
            break;
         case 4:
            GL20.glUniform4f(var3, var2[0], var2[1], var2[2], var2[3]);
         }
      }

   }

   public void method_1256() {
      this.method_1253(this.field_1298);
   }
}
