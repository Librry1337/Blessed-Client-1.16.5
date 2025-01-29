package zov.blessed.crack.by.laqwrt;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import com.mojang.blaze3d.platform.GlStateManager;
import java.lang.reflect.Field;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public final class Class_238 {
   private static final Field field_1184 = Class_253.method_1143(Framebuffer.class, 7);
   private static final Minecraft field_1185 = Minecraft.getInstance();

   private static void method_1098(Framebuffer var0) {
      MainWindow var1 = field_1185.getWindow();
      int var2 = (Integer)Class_253.method_1159(field_1184, var0);
      GL30.glDeleteRenderbuffers(var2);
      int var3 = GL30.glGenRenderbuffers();
      GL30.glBindRenderbuffer(36161, var3);
      GL30.glRenderbufferStorage(36161, 34041, var1.getScreenWidth(), var1.getScreenHeight());
      GL30.glFramebufferRenderbuffer(36160, 36128, 36161, var3);
      GL30.glFramebufferRenderbuffer(36160, 36096, 36161, var3);
   }

   public static void method_1099(Framebuffer var0) {
      if (var0 != null) {
         int var1 = (Integer)Class_253.method_1159(field_1184, var0);
         if (var1 > -1) {
            method_1098(var0);
            Class_253.method_1161(field_1184, var0, -1);
         }

      }
   }

   public static void method_1100() {
      field_1185.getMainRenderTarget().bindWrite(false);
      method_1099(field_1185.getMainRenderTarget());
      GL11.glClear(1024);
      GL11.glEnable(2960);
      GL11.glStencilFunc(519, 1, 1);
      GL11.glStencilOp(7681, 7681, 7681);
      GL11.glColorMask(false, false, false, false);
      GlStateManager._enableBlend();
      GlStateManager._blendFunc(770, 771);
      GlStateManager._enableAlphaTest();
      GlStateManager._alphaFunc(516, 0.0F);
   }

   public static void method_1101() {
      GL11.glStencilFunc(519, 1, 1);
      GL11.glStencilOp(7681, 7681, 7681);
      GL11.glColorMask(false, false, false, false);
   }

   public static void method_1102(Class_107 var0) {
      GL11.glColorMask(true, true, true, true);
      GL11.glStencilFunc(514, var0.getAction(), 1);
      GL11.glStencilOp(7680, 7680, 7680);
   }

   public static void method_1103() {
      GL11.glDisable(2960);
   }

   private Class_238() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
