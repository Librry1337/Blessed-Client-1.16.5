package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.IRenderCall;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.vector.Vector3d;
import zov.blessed.crack.by.laqwrt.Class_101;
import zov.blessed.crack.by.laqwrt.Class_27;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;

import java.util.Iterator;

public class WatermarklyBlurFace extends Module {
    public WatermarklyBlurFace() {
        super(new String[]{"Water", "mark", "lyBlur", "Face"}, Category.beta);
    }

    public void method_208() {
        if (this.mc.screen == null) {
            Iterator var1 = this.mc.level.entitiesForRendering().iterator();

            while (true) {
                Entity var2;
                do {
                    do {
                        do {
                            if (!var1.hasNext()) {
                                return;
                            }

                            var2 = (Entity) var1.next();
                        } while (var2 == this.mc.player);
                    } while (!(var2 instanceof LivingEntity));
                } while (!this.mc.player.canSee(var2));

                Vector3d var3 = var2.getEyePosition(this.mc.getFrameTime()).subtract(0.0D, (double) var2.getEyeHeight(), 0.0D);
                double var4 = (double) (var2.getBbWidth() / 2.0F);
                double var6 = (double) var2.getBbHeight();
                if (var2.isShiftKeyDown()) {
                    var6 -= 0.3D;
                }

                AxisAlignedBB var8 = new AxisAlignedBB(var3.x - var4, var3.y, var3.z - var4, var3.x + var4, var3.y + var6, var3.z + var4);
                Class_141 var9 = null;

                for (int var10 = 0; var10 < 8; ++var10) {
                    Vector3d var11 = new Vector3d(var10 % 2 == 0 ? var8.minX : var8.maxX, var10 / 2 % 2 == 0 ? var8.minY : var8.maxY, var10 / 4 % 2 == 0 ? var8.minZ : var8.maxZ);
                    var11 = Class_101.method_356(var11.x, var11.y, var11.z);
                    if (var11 != null) {
                        if (var9 == null) {
                            var9 = new Class_141(this, var11.x, var11.y, var11.z, 0.0D);
                        }

                        var9.field_715 = Math.min(var11.x, var9.field_715);
                        var9.field_716 = Math.min(var11.y, var9.field_716);
                        var9.field_717 = Math.max(var11.x, var9.field_717);
                        var9.field_718 = Math.max(var11.y, var9.field_718);
                    }
                }

                if (var9 != null) {
                    double var19 = var9.field_715 * 0.666D;
                    double var12 = var9.field_716 * 0.666D;
                    double var14 = var9.field_717 * 0.666D;
                    double var16 = var9.field_718 * 0.666D;
                    IRenderCall var18 = () -> {
                        byte var8r = 1;
                        Screen.fill(new MatrixStack(), (int) var19 - var8r, (int) var12 - var8r, (int) var14 + var8r, (int) var12 + (int) ((var16 - var12) * 0.3D) + var8r, -1);
                    };
                    Class_27.method_36(var18);
                }
            }
        }
    }

    class Class_141 {
        public double field_715;
        public double field_716;
        public double field_717;
        public double field_718;
        // $FF: synthetic field
        final WatermarklyBlurFace field_719;

        public Class_141(WatermarklyBlurFace var1, double var2, double var4, double var6, double var8) {
            this.field_719 = var1;
            this.field_715 = var2;
            this.field_716 = var4;
            this.field_717 = var6;
            this.field_718 = var8;
        }
    }
}
