package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.EditSignScreen;
import net.minecraft.client.gui.screen.inventory.InventoryScreen;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.Items;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.client.CClickWindowPacket;
import net.minecraft.network.play.client.CCloseWindowPacket;
import net.minecraft.util.MovementInput;
import org.lwjgl.glfw.GLFW;
import zov.blessed.crack.by.laqwrt.clickgui.ClickGUIScreen;
import zov.blessed.crack.by.laqwrt.Class_64;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.setting.Setting;
import zov.blessed.crack.by.laqwrt.setting.settings.BooleanSetting;
import zov.blessed.crack.by.laqwrt.module.Module;

public class InventoryWalk extends Module {
   private BooleanSetting field_900;
   private BooleanSetting field_901;
   private final Queue<IPacket<?>> field_902 = new LinkedBlockingQueue();
   private boolean field_903;
   private boolean field_904;
   private int field_905;

   public InventoryWalk() {
      super(new String[]{"Inventory", "Walk"}, Category.player);
      this.field_900 = new BooleanSetting(new String[]{"Only", "Inventory"}, true, Items.CHEST);
      this.field_901 = new BooleanSetting(new String[]{"Byp", "ass", "F", "T"}, true, Items.DIAMOND);
      this.addSettings(new Setting[]{this.field_900, this.field_901});
   }

   @Override
   public void onEnable() {
      this.field_904 = false;
      this.field_903 = false;
      super.onEnable();
   }

   public void method_215(MovementInput var1) {
      if (this.field_903) {
         if (this.field_905 > 2 && !this.field_902.isEmpty()) {
            this.mc.getConnection().send((IPacket)this.field_902.remove());
            if (this.field_902.isEmpty()) {
               this.field_903 = false;
               this.field_905 = 0;
            }
         }

         var1.forwardImpulse = 0.0F;
         var1.leftImpulse = 0.0F;
         ++this.field_905;
      } else {
         if (this.field_904 || (Boolean)this.field_900.method_580() && !(this.mc.screen instanceof InventoryScreen) && !(this.mc.screen instanceof ClickGUIScreen)) {
            return;
         }

         if (this.mc.screen instanceof ChatScreen || this.mc.screen instanceof EditSignScreen) {
            return;
         }

         if (method_653(this.mc.options.keySprint)) {
            this.mc.player.setSprinting(true);
         }

         var1.up = method_653(this.mc.options.keyUp);
         var1.down = method_653(this.mc.options.keyDown);
         var1.left = method_653(this.mc.options.keyLeft);
         var1.right = method_653(this.mc.options.keyRight);
         var1.jumping = method_653(this.mc.options.keyJump);
         float var2 = var1.shiftKeyDown ? 0.3F : 1.0F;
         var1.forwardImpulse = var1.up == var1.down ? 0.0F : (var1.up ? var2 : -var2);
         var1.leftImpulse = var1.left == var1.right ? 0.0F : (var1.left ? var2 : -var2);
      }

   }

   @Override
   public boolean packetEvent(Object var1, Class_64 var2) {
      if (var2 == Class_64.ヨミオニけことオかノマ) {
         return super.packetEvent(var1, var2);
      } else if ((Boolean)this.field_901.method_580() && (this.mc.screen instanceof InventoryScreen || this.mc.screen == null)) {
         if (!this.field_904 && var1 instanceof CClickWindowPacket) {
            if (!this.method_652()) {
               this.field_904 = true;
               return true;
            } else {
               this.field_902.add((CClickWindowPacket)var1);
               return false;
            }
         } else if (var1 instanceof CCloseWindowPacket) {
            this.field_904 = false;
            if (this.field_902.isEmpty()) {
               return true;
            } else {
               this.field_902.add((CCloseWindowPacket)var1);
               this.field_903 = true;
               return false;
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public boolean method_652() {
      return (double)this.mc.player.input.leftImpulse != 0.0D || (double)this.mc.player.input.forwardImpulse != 0.0D;
   }

   public static boolean method_653(KeyBinding var0) {
      return method_654(var0.getDefaultKey().getValue());
   }

   public static boolean method_654(int var0) {
      Minecraft var1 = Minecraft.getInstance();
      return GLFW.glfwGetKey(var1.getWindow().getWindow(), var0) == 1;
   }
}
