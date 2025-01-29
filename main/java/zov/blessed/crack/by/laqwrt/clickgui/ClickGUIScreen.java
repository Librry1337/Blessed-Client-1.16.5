package zov.blessed.crack.by.laqwrt.clickgui;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.IRenderCall;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.text.StringTextComponent;
import org.lwjgl.opengl.GL11;
import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.Class_234;
import zov.blessed.crack.by.laqwrt.Class_27;
import zov.blessed.crack.by.laqwrt.Class_59;
import zov.blessed.crack.by.laqwrt.component.Component;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.modules.ROFLAN;
import zov.blessed.crack.by.laqwrt.utils.RenderUtil;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ClickGUIScreen extends Screen {
    private int えきあ = 50;
    private int おつア = 50;
    private int かウコ = 400;
    private int きケイ = 250;
    public ArrayList<NativeImage> categories = new ArrayList<>();
    public ArrayList<Theme> themes;
    public Theme selectedTheme;
    int くヒよ = 0;
    public DynamicTexture themeIcon;
    public DynamicTexture bgpng;
    private int けネク;
    private int こもチ;
    private float さるめ;
    public static final ItemStack CLOCK_ITEM;
    public static long startTime;
    private boolean しへツ = false;
    private int すネフ = 0;
    private int せひニ = 0;
    private double そマヒ;

    public ClickGUIScreen() {
        super(new StringTextComponent(""));
        int var1 = 50;
        Category[] var2 = Category.values();
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            Category var5 = var2[var4];
            if (var5 != Category.beta || Blessed.isBeta != null) {
                NativeImage var6 = new NativeImage(this.えきあ + 10, this.おつア + 10 + var1, 30, 30, var5, this);
                this.categories.add(var6);
                var1 += var6.method_1122() + 3;
            }
        }

        this.categories.get(0).method_1185(true);
        this.themes = new ArrayList<>();
        this.themes.add(new Theme(new String[0], new Color(255, 255, 255), new Color(211, 212, 214), new Color(0, 0, 0)));
        this.themes.add(new Theme(new String[0], new Color(34, 34, 34), new Color(51, 51, 51), new Color(225, 227, 230)));
        this.selectedTheme = (Theme) this.themes.get(1);
    }

    public Theme getSelectedTheme() {
        return this.selectedTheme;
    }

    public ArrayList<NativeImage> getCategories() {
        return this.categories;
    }

    public static byte[] concat(byte[] var0, byte[] var1) {
        byte[] var2 = Arrays.copyOf(var0, var0.length + var1.length);
        System.arraycopy(var1, 0, var2, var0.length, var1.length);
        return var2;
    }

    public boolean isPauseScreen() {
        return false;
    }

    public void render(MatrixStack var1, int var2, int var3, float var4) {
        this.けネク = var2;
        this.こもチ = var3;
        this.さるめ = var4;
    }

    public void drawScreen() {
        this.selectedTheme = (Theme) this.themes.get(this.くヒよ);
        int[] var1 = Blessed.getInstance().method_806().method_1172(this.けネク, this.こもチ);
        this.けネク = var1[0];
        this.こもチ = var1[1];
        this.かウコ = Blessed.getInstance().getModuleManager().getModuleByClass(ROFLAN.class).isState() ? 450 : 360;
        if (this.bgpng != null && Blessed.getInstance().getModuleManager().getModuleByClass(ROFLAN.class).isState()) {
            double var2 = 300.0D;
            double var4 = 300.0D;
            Class_234.method_1083((double) this.getX(), (double) this.getY() - var4, var2, var4, this.bgpng, 1.0F, Color.WHITE);
        }

        Iterator var6 = this.categories.iterator();

        while (var6.hasNext()) {
            zov.blessed.crack.by.laqwrt.component.Component var3 = (zov.blessed.crack.by.laqwrt.component.Component) var6.next();
            var3.method_1124(this.けネク, this.こもチ);
        }

        if (this.しへツ) {
            this.えきあ = this.けネク + this.すネフ;
            this.おつア = this.こもチ + this.せひニ;
        }

        Class_27.method_36(new IRenderCall() {
            public void execute() {
                Minecraft var1 = Minecraft.getInstance();
                Screen.fill(new MatrixStack(), 0, 0, var1.getWindow().getScreenWidth(), var1.getWindow().getScreenHeight(), -1);
            }
        });
        RenderUtil.drawBlurredRounded((double) this.えきあ, (double) (this.おつア + this.きケイ), (double) this.かウコ, (double) this.きケイ, 20.0D, 10.0F, this.getSelectedTheme().method_375());
        Class_234.method_1080(this.えきあ, this.おつア, this.かウコ, this.きケイ, 20, this.getSelectedTheme().method_375(), Blessed.getInstance().method_809());
        GL11.glPushMatrix();
        GL11.glEnable(3089);
        Class_234.method_1084((double) this.getX(), (double) (this.getY() + 20), (double) (this.getX() + this.getWidth()), (double) (this.getY() + this.getHeight() - 5));
        int var7 = 50;
        Iterator var8 = this.categories.iterator();

        while (var8.hasNext()) {
            zov.blessed.crack.by.laqwrt.component.Component var10 = (zov.blessed.crack.by.laqwrt.component.Component) var8.next();
            var10.method_1115(this.えきあ + 10);
            var10.method_1116(this.おつア + 10 + var7);
            var7 += var10.method_1122() + 3;
            var10.method_1123(this.けネク, this.こもチ);
        }

        GL11.glDisable(3089);
        Minecraft.getInstance().getItemRenderer().renderGuiItem(CLOCK_ITEM, this.getX() + 15, this.getY() + this.getHeight() - 25);
        GL11.glPopMatrix();
        Class_59 var9 = Blessed.getInstance().method_823();
        String[] var11 = new String[]{"B", "l", "e", "s", "s", "e", "d", " ", "C", "l", "i", "e", "n", "t", " ", "C", "r", "a", "c", "k", "e", "d", " ", "b", "y", " ", "l", "a", "q", "w", "r", "t"};
        var9.method_191(var11, (float) (this.えきあ + this.かウコ / 2 - var9.method_193(var11) / 2), (float) (this.おつア + 4), this.selectedTheme.method_377().getRGB());
        if (this.bgpng != null && Blessed.getInstance().getModuleManager().getModuleByClass(ROFLAN.class).isState()) {
            Class_234.method_1083((double) (this.getX() + 340), (double) this.getY(), (double) (this.かウコ - 340), (double) this.きケイ, this.bgpng, 1.0F, Color.WHITE);
        }

    }

    public boolean mouseClicked(double var1, double var3, int var5) {
        int[] var6 = Blessed.getInstance().method_806().method_1172((int) var1, (int) var3);
        var1 = (double) var6[0];
        var3 = (double) var6[1];
        if (this.isMouseOver(var1, var3) && var3 < (double) (this.getY() + 20) && var5 == 0) {
            this.しへツ = true;
            this.すネフ = (int) ((double) this.getX() - var1);
            this.せひニ = (int) ((double) this.getY() - var3);
        }

        Iterator var7 = this.categories.iterator();

        while (var7.hasNext()) {
            zov.blessed.crack.by.laqwrt.component.Component var8 = (zov.blessed.crack.by.laqwrt.component.Component) var7.next();
            var8.method_1126(var1, var3, var5);
        }

        if (var1 >= (double) (this.getX() + 15) && var1 <= (double) (this.getX() + 30) && var3 >= (double) (this.getY() + this.getHeight() - 25) && var3 <= (double) (this.getY() + this.getHeight() - 10)) {
            ++this.くヒよ;
            if (this.くヒよ >= this.themes.size()) {
                this.くヒよ = 0;
            }

            startTime = System.currentTimeMillis();
        }

        return super.mouseClicked(var1, var3, var5);
    }

    public boolean isMouseOver(double var1, double var3) {
        return var1 >= (double) this.getX() && var1 < (double) (this.getX() + this.getWidth()) && var3 >= (double) this.getY() && var3 < (double) (this.getY() + this.getHeight());
    }

    public boolean mouseReleased(double var1, double var3, int var5) {
        if (var5 == 0) {
            this.しへツ = false;
        }

        int[] var6 = Blessed.getInstance().method_806().method_1172((int) var1, (int) var3);
        var1 = (double) var6[0];
        var3 = (double) var6[1];
        Iterator var7 = this.categories.iterator();

        while (var7.hasNext()) {
            zov.blessed.crack.by.laqwrt.component.Component var8 = (zov.blessed.crack.by.laqwrt.component.Component) var7.next();
            var8.method_1127(var1, var3, var5);
        }

        return super.mouseReleased(var1, var3, var5);
    }

    public boolean keyPressed(int var1, int var2, int var3) {
        Iterator var4 = this.categories.iterator();

        while (var4.hasNext()) {
            zov.blessed.crack.by.laqwrt.component.Component var5 = (zov.blessed.crack.by.laqwrt.component.Component) var4.next();
            var5.method_1128(var1, var2, var3);
        }

        return super.keyPressed(var1, var2, var3);
    }

    public void onClose() {
        Iterator var1 = this.categories.iterator();

        while (var1.hasNext()) {
            zov.blessed.crack.by.laqwrt.component.Component var2 = (zov.blessed.crack.by.laqwrt.component.Component) var1.next();
            var2.method_1114();
        }

        super.onClose();
    }

    public int getY() {
        return this.おつア;
    }

    public int getX() {
        return this.えきあ;
    }

    public int getWidth() {
        return this.かウコ;
    }

    public int getHeight() {
        return this.きケイ;
    }

    public boolean mouseScrolled(double var1, double var3, double var5) {
        Iterator var7 = this.categories.iterator();

        while (var7.hasNext()) {
            zov.blessed.crack.by.laqwrt.component.Component var8 = (Component) var7.next();
            var8.method_1129(var1, var3, var5);
        }

        var5 *= 16.0D;
        this.そマヒ += var5;
        return super.mouseScrolled(var1, var3, var5);
    }

    static {
        CLOCK_ITEM = new ItemStack(Items.CLOCK);
        startTime = 0L;
    }
}
