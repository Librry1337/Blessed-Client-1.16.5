//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

package main;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.opengl.GL11;
import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.module.modules.ObsBypass;

@Mod("blyased")
public class Main {
    private static final Minecraft mc = Minecraft.getInstance();

    public static void overlay() {
        if (Blessed.getInstance() != null && Blessed.getInstance().method_824() != null && Blessed.getInstance().method_823() != null) {
            if (Blessed.getInstance().getModuleManager().getModuleByClass(ObsBypass.class).isState()) {
                if (mc.player != null && mc.level != null) {
                    GL11.glPushMatrix();
                    MainWindow var0 = Minecraft.getInstance().getWindow();
                    GL11.glClear(256);
                    RenderSystem.matrixMode(5889);
                    RenderSystem.loadIdentity();
                    RenderSystem.ortho(0.0D, (double) var0.getWidth() / var0.getGuiScale(), (double) var0.getHeight() / var0.getGuiScale(), 0.0D, 1000.0D, 3000.0D);
                    RenderSystem.matrixMode(5888);
                    RenderSystem.loadIdentity();
                    RenderSystem.translatef(0.0F, 0.0F, -2000.0F);
                    if (Blessed.getInstance() != null && Blessed.getInstance().method_824() != null && Blessed.getInstance().method_823() != null && Blessed.getInstance().getModuleManager().getModuleByClass(ObsBypass.class).isState()) {
                        Blessed.getInstance().method_816();
                    }

                    GL11.glPopMatrix();
                }

            }
        }
    }

    public Main() {
        new Blessed("hwid", 0);
    }

    public static void rc(Object var0, byte[] var1) {
    }

    public static byte[] gcb(Object var0) {
        return new byte[1000];
    }

    public static void destruct() {
    }
}
