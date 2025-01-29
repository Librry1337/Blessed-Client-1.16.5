package zov.blessed.crack.by.laqwrt;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import com.google.common.collect.Queues;
import com.mojang.blaze3d.systems.IRenderCall;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.shader.Framebuffer;

public class Class_48 implements Class_169 {
   static Minecraft mc = Minecraft.getInstance();
   static MainWindow mainWindow;
   private static String field_244;
   private static final Class_53 field_245;
   private static final ConcurrentLinkedQueue<IRenderCall> field_246;
   private static Framebuffer field_247;
   private static Framebuffer field_248;

   public static void method_118() {
   }

   public static void method_119(IRenderCall var0) {
   }

   public static void method_120(int var0) {
   }

   private static void method_121(Framebuffer var0) {
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
      field_244 = "#version 120\n\nuniform sampler2D sampler1;\nuniform sampler2D sampler2;\nuniform vec2 texelSize;\nuniform vec2 direction;\nuniform float radius;\nuniform float kernel[64];\n\nvoid main(void)\n{\n    vec2 uv = gl_TexCoord[0].st;\n\n    if (direction.x == 0.0 && texture2D(sampler2, uv).a > 0.0) {\n    \tdiscard;\n    }\n\n    vec4 pixel_color = texture2D(sampler1, uv);\n    pixel_color.rgb *= pixel_color.a;\n    pixel_color *= kernel[0];\n\n    for (float f = 1; f <= radius; f++) {\n        vec2 offset = f * texelSize * direction;\n        vec4 left = texture2D(sampler1, uv - offset);\n        vec4 right = texture2D(sampler1, uv + offset);\n        left.rgb *= left.a;\n        right.rgb *= right.a;\n        pixel_color += (left + right) * kernel[int(f)];\n    }\n\n    gl_FragColor = vec4(pixel_color.rgb / pixel_color.a, pixel_color.a);\n}\n";
      field_245 = new Class_53(field_244);
      field_246 = Queues.newConcurrentLinkedQueue();
      field_247 = null;
      field_248 = null;
   }
}
