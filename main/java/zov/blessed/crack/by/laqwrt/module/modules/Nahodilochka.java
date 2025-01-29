package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.block.*;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.client.CPlayerDiggingPacket;
import net.minecraft.network.play.server.SChangeBlockPacket;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.StringTextComponent;
import org.lwjgl.opengl.GL11;
import zov.blessed.crack.by.laqwrt.*;
import zov.blessed.crack.by.laqwrt.clickgui.TimerUtil;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

public class Nahodilochka extends Module {
    private final CopyOnWriteArrayList<Class_73> field_933 = new CopyOnWriteArrayList();
    private final CopyOnWriteArrayList<BlockPos> field_934 = new CopyOnWriteArrayList();
    private final CopyOnWriteArrayList<BlockPos> field_935 = new CopyOnWriteArrayList();
    private static int field_936 = -1;
    private TimerUtil field_937 = new TimerUtil();

    public Nahodilochka() {
        super(new String[]{"Nah", "odi", "loc", "hka"}, Category.beta);
    }

    @Override
    public void onDisable() {
        this.field_933.clear();
        this.field_934.clear();
        this.field_935.clear();
    }

    public void method_212() {
        this.field_933.forEach((var1x) -> {
            if (var1x.method_239()) {
                this.field_933.remove(var1x);
            }

        });
        if (this.mc.player.tickCount % 20 == 0) {
            AxisAlignedBB var1 = this.method_731();

            for (int var2 = (int) var1.minX; var2 < (int) var1.maxX; ++var2) {
                for (int var3 = (int) var1.minZ; var3 < (int) var1.maxZ; ++var3) {
                    for (int var4 = (int) var1.maxY - 1; var4 >= (int) var1.minY; --var4) {
                        BlockPos var5 = new BlockPos(var2, var4, var3);
                        if (this.mc.level.getWorldBorder().isWithinBounds(var5) && !(method_732(this.mc.player, var5) > 5.0D)) {
                            BlockState var6 = this.mc.level.getBlockState(var5);
                            Block var7 = var6.getBlock();
                            if (!(var7 instanceof FlowingFluidBlock) && this.field_934.addIfAbsent(var5)) {
                                this.field_933.add((new Class_73(this, var5)).method_235());
                            }
                        }
                    }
                }
            }
        }

    }

    private AxisAlignedBB method_731() {
        BlockPos var1 = this.mc.player.blockPosition();
        AxisAlignedBB var2 = (new AxisAlignedBB(var1)).expandTowards(5.0D, 5.0D, 5.0D).expandTowards(-5.0D, -5.0D, -5.0D);
        var2 = new AxisAlignedBB(var2.minX, MathHelper.clamp(var2.minY, 1.0D, 130.0D), var2.minZ, var2.maxX, MathHelper.clamp(var2.maxY, 1.0D, 130.0D), var2.maxZ);
        return var2;
    }

    public static double method_732(Entity var0, BlockPos var1) {
        return method_733(var0.getX(), var0.getY(), var0.getZ(), (double) var1.getX(), (double) var1.getY(), (double) var1.getZ());
    }

    public static double method_733(double var0, double var2, double var4, double var6, double var8, double var10) {
        double var12 = var0 - var6;
        double var14 = var2 - var8;
        double var16 = var4 - var10;
        return Math.sqrt(var12 * var12 + var14 * var14 + var16 * var16);
    }

    @Override
    public boolean packetEvent(Object var1, Class_64 var2) {
        if (var1 instanceof SChangeBlockPacket) {
            SChangeBlockPacket var3 = (SChangeBlockPacket) var1;
            BlockPos var4 = var3.getPos();
            Class_73 var5;
            if ((var5 = (Class_73) method_734(this.field_933, var4, (var0) -> {
                return var0.method_237();
            })) != null) {
                this.field_933.remove(var5);
                Block var6 = var3.getBlockState().getBlock();
                if (var6 == Blocks.ANCIENT_DEBRIS || var6 == Blocks.DIAMOND_ORE || var6 == Blocks.GOLD_ORE) {
                    this.field_935.add(var4);
                    this.mc.player.sendMessage(new StringTextComponent("NAIDENA!!! " + var6.getRegistryName().getPath()), this.mc.player.getUUID());
                    this.field_937.method_546();
                }
            }
        }

        return super.packetEvent(var1, var2);
    }

    public void method_211() {
        double var1 = -(this.mc.player.xOld + (this.mc.player.getX() - this.mc.player.xOld) * (double) this.mc.getFrameTime());
        double var3 = -(this.mc.player.yOld + (this.mc.player.getY() - this.mc.player.yOld) * (double) this.mc.getFrameTime());
        double var5 = -(this.mc.player.zOld + (this.mc.player.getZ() - this.mc.player.zOld) * (double) this.mc.getFrameTime());
        GL11.glTranslated(-var1, -var3, -var5);
        GL11.glDisable(3553);
        GL11.glEnable(2848);
        GL11.glEnable(3042);
        GL11.glLineWidth(1.5F);
        GL11.glDisable(2929);
        Vector3d var7 = this.mc.getEntityRenderDispatcher().camera.getPosition();
        Vector3d var8 = this.mc.player.getLookAngle();
        GL11.glBegin(1);
        this.field_935.forEach((var3x) -> {
            Block var4 = this.mc.level.getBlockState(var3x).getBlock();
            RenderSystem.color3f(255.0F, 255.0F, 255.0F);
            if (var4 == Blocks.DIAMOND_ORE) {
                RenderSystem.color3f(0.0F, 255.0F, 255.0F);
            } else if (var4 == Blocks.ANCIENT_DEBRIS) {
                RenderSystem.color3f(196.0F, 133.0F, 0.0F);
            } else if (var4 == Blocks.GOLD_ORE) {
                RenderSystem.color3f(255.0F, 255.0F, 0.0F);
            }

            Vector3d vec = Vector3d.atCenterOf(var3x).subtract(var7);
            GL11.glVertex3d(var8.x, var8.y, var8.z);
            GL11.glVertex3d(vec.x, vec.y, vec.z);
        });
        GL11.glEnd();
        GL11.glDisable(2848);
        GL11.glEnable(2929);
        GL11.glEnable(3553);
    }

    public void method_208() {
        if (field_936 == -1) {
            try {
                field_936 = Class_234.method_1085("a.png");
                this.mc.player.sendMessage(new StringTextComponent("DOWNLOAD " + field_936), this.mc.player.getUUID());
            } catch (Exception var8) {
                var8.hashCode();
            }
        }

        if (field_936 != -1) {
            this.field_935.forEach((var1x) -> {
                Block var2 = this.mc.level.getBlockState(var1x).getBlock();
                if (var2 instanceof AirBlock) {
                    this.field_935.remove(var1x);
                } else {
                    double var3 = Math.sin((double) System.currentTimeMillis() / 1000.0D);
                    float var5 = 70.0F;
                    Vector3d var6 = Class_101.method_356((double) var1x.getX() + 0.5D, (double) var1x.getY() + 0.5D, (double) var1x.getZ() + 0.5D);
                    if (var6 != null) {
                        GlStateManager._pushMatrix();
                        GlStateManager._translated(var6.x, var6.y, 0.0D);
                        GlStateManager._rotatef((float) var3 * 360.0F, 0.0F, 0.0F, 1.0F);
                        GlStateManager._translated(-var6.x, -var6.y, 0.0D);
                        RenderSystem.color3f(255.0F, 255.0F, 255.0F);
                        if (var2 == Blocks.DIAMOND_ORE) {
                            RenderSystem.color3f(0.0F, 255.0F, 255.0F);
                        } else if (var2 == Blocks.ANCIENT_DEBRIS) {
                            RenderSystem.color3f(196.0F, 133.0F, 0.0F);
                        } else if (var2 == Blocks.GOLD_ORE) {
                            RenderSystem.color3f(255.0F, 255.0F, 0.0F);
                        }

                        RenderSystem.enableTexture();
                        RenderSystem.bindTexture(field_936);
                        Class_234.method_1088(var6.x - (double) (var5 / 2.0F), var6.y - (double) (var5 / 2.0F), (double) var5, (double) var5);
                        RenderSystem.disableTexture();
                        GlStateManager._popMatrix();
                    }

                }
            });
        } else {
            this.toggle(false);
            this.mc.player.sendMessage(new StringTextComponent("LOX"), this.mc.player.getUUID());
        }

        if (!this.field_937.method_543(3000.0F)) {
            String[] var1 = new String[]{"NAIDENO!!!"};
            float var2 = (float) this.field_937.method_549() / 1000.0F;
            float var3 = 3.0F;
            float var4 = (float) Blessed.getInstance().method_823().method_193(var1);
            float var5 = 9.0F;
            float var6 = (float) (Minecraft.getInstance().getWindow().getGuiScaledWidth() / 2) - var4 / 2.0F;
            float var7 = (float) (Minecraft.getInstance().getWindow().getGuiScaledHeight() / 2) - var5 / 2.0F;
            var6 += var4 / 2.0F * (1.0F - var2 * var3);
            var7 += var5 / 2.0F * (1.0F - var2);
            var6 /= var2 * var3;
            var7 /= var2;
            GL11.glPushMatrix();
            GL11.glScalef(var2 * var3, var2, 1.0F);
            Blessed.getInstance().method_823().method_191(var1, (float) ((int) var6), (float) ((int) var7), -65536);
            GL11.glPopMatrix();
        }

    }

    public static <T, R> T method_734(List<T> var0, Object var1, Function<T, R> var2) {
        Object[] var3 = var0.toArray();

        for (int var4 = 0; var4 < var3.length; ++var4) {
            Object var5 = var3[var4];
            if (var2.apply((T) var5).equals(var1)) {
                return (T) var5;
            }
        }

        return null;
    }

    public static Class_95<Direction, Optional<Vector3d>> method_735(AxisAlignedBB var0, Vector3d var1, Vector3d var2) {
        double[] var3 = new double[]{1.0D};
        double var4 = var2.x - var1.x;
        double var6 = var2.y - var1.y;
        double var8 = var2.z - var1.z;
        Direction var10 = method_736(var0, var1, var3, (Direction) null, var4, var6, var8);
        Optional var11 = Optional.empty();
        if (var10 != null) {
            double var12 = var3[0];
            var11 = Optional.of(var1.add(var12 * var4, var12 * var6, var12 * var8));
        }

        return Class_95.method_318(var10, var11);
    }

    private static Direction method_736(AxisAlignedBB var0, Vector3d var1, double[] var2, Direction var3, double var4, double var6, double var8) {
        if (var4 > 1.0E-7D) {
            var3 = method_737(var2, var3, var4, var6, var8, var0.minX, var0.minY, var0.maxY, var0.minZ, var0.maxZ, Direction.WEST, var1.x, var1.y, var1.z);
        } else if (var4 < -1.0E-7D) {
            var3 = method_737(var2, var3, var4, var6, var8, var0.maxX, var0.minY, var0.maxY, var0.minZ, var0.maxZ, Direction.EAST, var1.x, var1.y, var1.z);
        }

        if (var6 > 1.0E-7D) {
            var3 = method_737(var2, var3, var6, var8, var4, var0.minY, var0.minZ, var0.maxZ, var0.minX, var0.maxX, Direction.DOWN, var1.y, var1.z, var1.x);
        } else if (var6 < -1.0E-7D) {
            var3 = method_737(var2, var3, var6, var8, var4, var0.maxY, var0.minZ, var0.maxZ, var0.minX, var0.maxX, Direction.UP, var1.y, var1.z, var1.x);
        }

        if (var8 > 1.0E-7D) {
            var3 = method_737(var2, var3, var8, var4, var6, var0.minZ, var0.minX, var0.maxX, var0.minY, var0.maxY, Direction.NORTH, var1.z, var1.x, var1.y);
        } else if (var8 < -1.0E-7D) {
            var3 = method_737(var2, var3, var8, var4, var6, var0.maxZ, var0.minX, var0.maxX, var0.minY, var0.maxY, Direction.SOUTH, var1.z, var1.x, var1.y);
        }

        return var3;
    }

    private static Direction method_737(double[] var0, Direction var1, double var2, double var4, double var6, double var8, double var10, double var12, double var14, double var16, Direction var18, double var19, double var21, double var23) {
        double var25 = (var8 - var19) / var2;
        double var27 = var21 + var25 * var4;
        double var29 = var23 + var25 * var6;
        if (0.0D < var25 && var25 < var0[0] && var10 - 1.0E-7D < var27 && var27 < var12 + 1.0E-7D && var14 - 1.0E-7D < var29 && var29 < var16 + 1.0E-7D) {
            var0[0] = var25;
            return var18;
        } else {
            return var1;
        }
    }

    // $FF: synthetic method
    public static Minecraft method_742(Nahodilochka var0) {
        return var0.mc;
    }

    // $FF: synthetic method
    public static Minecraft method_743(Nahodilochka var0) {
        return var0.mc;
    }

    class Class_73 {
        private final BlockPos field_606;
        private long field_607;
        // $FF: synthetic field
        final Nahodilochka field_608;

        public Class_73(Nahodilochka var1, BlockPos var2) {
            this.field_608 = var1;
            this.field_606 = var2;
        }

        public Class_73 method_235() {
            AxisAlignedBB var1 = new AxisAlignedBB(this.field_606);
            Vector3d var2 = Nahodilochka.method_742(this.field_608).player.getEyePosition(1.0F);
            Vector3d var3 = Vector3d.atCenterOf(this.field_606);
            Class_95 var4 = Nahodilochka.method_735(var1, var2, var3);
            if (var4.method_319() == null) {
                return this;
            } else {
                Nahodilochka.method_743(this.field_608).getConnection().send(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.STOP_DESTROY_BLOCK, this.field_606, (Direction) var4.method_319()));
                this.method_236();
                return this;
            }
        }

        private void method_236() {
            this.field_607 = System.currentTimeMillis();
        }

        public BlockPos method_237() {
            return this.field_606;
        }

        public double method_238() {
            return (double) (System.currentTimeMillis() - this.field_607) / 600.0D;
        }

        public boolean method_239() {
            return this.method_238() >= 1.0D;
        }
    }
}

