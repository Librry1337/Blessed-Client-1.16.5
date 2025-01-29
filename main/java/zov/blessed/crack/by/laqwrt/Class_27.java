package zov.blessed.crack.by.laqwrt;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import com.google.common.collect.Queues;
import com.mojang.blaze3d.systems.IRenderCall;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.shader.Framebuffer;

public class Class_27 implements Class_169 {
   static Minecraft mc = Minecraft.getInstance();
   static MainWindow mainWindow;
   private static String field_134;
   private static final Class_53 field_135;
   private static final ConcurrentLinkedQueue<IRenderCall> field_136;
   private static Framebuffer field_137;
   private static Framebuffer field_138;

   public static void method_35() {
   }

   public static void method_36(IRenderCall var0) {
   }

   public static void method_37(int var0) {
   }

   private static void method_38(Framebuffer var0) {
      int var1 = mainWindow.getScreenWidth();
      int var2 = mainWindow.getScreenHeight();
      if (var0.viewWidth != var1 || var0.viewHeight != var2) {
         var0.resize(var1, var2, Minecraft.ON_OSX);
      }

      var0.bindWrite(false);

      try {
         var0.clear(Minecraft.ON_OSX);
      } catch (RuntimeException var4) {
         var4.hashCode();
      }

      var0.setClearColor(0.0F, 0.0F, 0.0F, 0.0F);
   }

   static {
      mainWindow = mc.getWindow();
      field_134 = "#version 120\n\nuniform sampler2D sampler1;\nuniform sampler2D sampler2;\nuniform vec2 texelSize;\nuniform vec2 direction;\nuniform float radius;\nuniform float kernel[64];\n\nvoid main()\n{\n    vec2 uv = gl_TexCoord[0].st;\n    uv.y = 1.0f - uv.y;\n\n    float alpha = texture2D(sampler2, uv).a;\n    if (direction.x == 0.0 && alpha == 0.0) {\n        discard;\n    }\n\n    vec4 pixel_color = texture2D(sampler1, uv) * kernel[0];\n    for (float f = 1; f <= radius; f++) {\n        vec2 offset = f * texelSize * direction;\n        pixel_color += texture2D(sampler1, uv - offset) * kernel[int(f)];\n        pixel_color += texture2D(sampler1, uv + offset) * kernel[int(f)];\n    }\n\n    gl_FragColor = vec4(pixel_color.rgb, direction.x == 0.0 ? alpha : 1.0);\n}\n";
      field_135 = new Class_53(field_134);
      field_136 = Queues.newConcurrentLinkedQueue();
      field_137 = null;
      field_138 = null;
   }
}
