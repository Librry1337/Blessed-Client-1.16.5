package zov.blessed.crack.by.laqwrt.clickgui;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import net.minecraft.client.renderer.texture.DynamicTexture;
import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.Class_234;
import zov.blessed.crack.by.laqwrt.component.Component;
import zov.blessed.crack.by.laqwrt.component.components.SliderComponent;
import zov.blessed.crack.by.laqwrt.imagesBytes.*;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.module.Module;
import zov.blessed.crack.by.laqwrt.module.modules.ROFLAN;

import java.awt.*;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NativeImage extends zov.blessed.crack.by.laqwrt.component.Component {
    private Category category;
    private boolean field_1210;
    private DynamicTexture combatGuiImage;
    private DynamicTexture visualGuiImage;
    private DynamicTexture playerGuiImage;
    private DynamicTexture clientGuiImage;
    private DynamicTexture betaGuiImage;
    private List<Button> buttons;
    private ClickGUIScreen clickGUIScreen;
    private double field_1218;

    public NativeImage(int var1, int var2, int var3, int var4, Category category, ClickGUIScreen clickGUIScreen) {
        super(var1, var2, var3, var4);
        this.category = category;
        this.clickGUIScreen = clickGUIScreen;
        this.buttons = new ArrayList<>();
        this.method_1176();
        this.initGuiImages();
    }

    private void method_1176() {
        for (Module module : Blessed.getInstance().getModuleManager().getModulesForCategory(category)) {
            if (module.getClass() != ROFLAN.class) {
                buttons.add(new Button(method_1119() + 45, clickGUIScreen.getY() + 20, 150, 20, module));
            }
        }

        this.method_1179();
    }

    private void initGuiImages() {
        try {
            combatGuiImage = byteToDynamicTexture(CombatGuiImageBytes.image);
            visualGuiImage = byteToDynamicTexture(VisualGuiImageBytes.image);
            playerGuiImage = byteToDynamicTexture(PlayerGuiImageBytes.image);
            clientGuiImage = byteToDynamicTexture(ClientGuiImageBytes.image);
            betaGuiImage = byteToDynamicTexture(BetaGuiImageBytes.image);
        } catch (Exception ignored) {
        }
    }

    private DynamicTexture byteToDynamicTexture(byte[] var1) throws Exception {
        return new DynamicTexture(net.minecraft.client.renderer.texture.NativeImage.read(new ByteArrayInputStream(var1)));
    }

    private void method_1179() {
        ArrayList<Button> var1 = new ArrayList<>();
        ArrayList<Button> var2 = new ArrayList<>();
        int var3 = 0;
        int var4 = 0;

        for (Button var6 : this.buttons) {
            int var7 = var6.method_1122();
            if (var3 <= var4) {
                var1.add(var6);
                var3 += var7 + 2;
            } else {
                var2.add(var6);
                var4 += var7 + 2;
            }
        }

        this.method_1180(var1, this.clickGUIScreen.getX() + 45, this.clickGUIScreen.getY() + 20);
        this.method_1180(var2, this.clickGUIScreen.getX() + 45 + var1.get(0).method_1121() + 5, this.clickGUIScreen.getY() + 20);
    }

    private void method_1180(List<Button> var1, int var2, int var3) {
        int var4 = 0;

        Button var6;
        for (Iterator<Button> var5 = var1.iterator(); var5.hasNext(); var4 += var6.method_1122() + 2) {
            var6 = var5.next();
            var6.method_1115(var2);
            var6.method_1116(var3 + var4 + (int) this.field_1218);
        }

    }

    private void method_1181() {
        for (Button var2 : this.buttons) {
            int var3 = 20;

            zov.blessed.crack.by.laqwrt.component.Component var5;
            for (Iterator<Component> var4 = var2.method_984().iterator(); var4.hasNext(); var3 += var5.method_1122() + 5) {
                var5 = var4.next();
                var5.method_1115(var2.method_1119());
                var5.method_1116(var2.method_1120() + var3);
                if (var5 instanceof SliderComponent) {
                    var5.method_1115(var2.method_1119() + var2.method_1121() / 2 - 30);
                }
            }
        }

    }

    public void method_1124(int var1, int var2) {
        Iterator var3 = this.buttons.iterator();

        while (var3.hasNext()) {
            Button var4 = (Button) var3.next();
            var4.method_1124(var1, var2);
        }

        super.method_1124(var1, var2);
    }

    public void method_1123(int var1, int var2) {
        this.method_1179();
        this.method_1181();
        this.method_1182();
        if (this.method_1184()) {
            Iterator var3 = this.buttons.iterator();

            while (var3.hasNext()) {
                Button var4 = (Button) var3.next();
                var4.method_1123(var1, var2);
            }
        }

        super.method_1123(var1, var2);
    }

    private void method_1182() {
        Color var1 = this.method_1184() ? new Color(139, 0, 255) : new Color(79, 79, 79);
        switch (this.category) {
            case combat:
                this.method_1183(combatGuiImage, var1);
                break;
            case visual:
                this.method_1183(visualGuiImage, var1);
                break;
            case player:
                this.method_1183(playerGuiImage, var1);
                break;
            case client:
                this.method_1183(clientGuiImage, var1);
                break;
            case beta:
                this.method_1183(betaGuiImage, var1);
        }
    }

    private void method_1183(DynamicTexture var1, Color var2) {
        Class_234.method_1083((double) (this.method_1119() + 5), (double) this.method_1120(), 15.0D, 15.0D, var1, 1.0F, var2);
    }

    public boolean method_1184() {
        return this.field_1210;
    }

    public void method_1185(boolean var1) {
        this.field_1210 = var1;
    }

    public void method_1126(double var1, double var3, int var5) {
        if (this.method_1125((int) var1, (int) var3)) {
            this.method_1186();
            this.method_1185(true);
        }

        if (this.method_1184()) {
            Iterator var6 = this.buttons.iterator();

            while (var6.hasNext()) {
                Button var7 = (Button) var6.next();
                var7.method_1126(var1, var3, var5);
            }
        }

        super.method_1126(var1, var3, var5);
    }

    private void method_1186() {
        Iterator var1 = Blessed.getInstance().getClickGUIScreen().getCategories().iterator();

        while (var1.hasNext()) {
            NativeImage var2 = (NativeImage) var1.next();
            var2.method_1185(false);
        }

    }

    public void method_1128(int var1, int var2, int var3) {
        if (this.method_1184()) {
            Iterator var4 = this.buttons.iterator();

            while (var4.hasNext()) {
                Button var5 = (Button) var4.next();
                var5.method_1128(var1, var2, var3);
            }
        }

        super.method_1128(var1, var2, var3);
    }

    public void method_1127(double var1, double var3, int var5) {
        if (this.method_1184()) {
            Iterator var6 = this.buttons.iterator();

            while (var6.hasNext()) {
                Button var7 = (Button) var6.next();
                var7.method_1127(var1, var3, var5);
            }
        }

        super.method_1127(var1, var3, var5);
    }

    public void method_1129(double var1, double var3, double var5) {
        if (this.method_1184() && !this.buttons.isEmpty()) {
            double var7 = this.method_1187(var5);
            this.field_1218 += var7;
        }

        super.method_1129(var1, var3, var5);
    }

    private double method_1187(double var1) {
        if (var1 < 0.0D && ((Button) this.buttons.get(this.buttons.size() - 1)).method_1120() - 5 <= Blessed.getInstance().getClickGUIScreen().getY() + 20) {
            return 0.0D;
        } else {
            return var1 > 0.0D && ((Button) this.buttons.get(0)).method_1120() >= Blessed.getInstance().getClickGUIScreen().getY() + 20 ? 0.0D : var1 * 16.0D;
        }
    }
}
