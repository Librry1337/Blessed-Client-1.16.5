package zov.blessed.crack.by.laqwrt.module.modules;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.block.Blocks;
import net.minecraft.block.TallGrassBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EnderCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.play.client.CPlayerTryUseItemOnBlockPacket;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import zov.blessed.crack.by.laqwrt.Blessed;
import zov.blessed.crack.by.laqwrt.module.Category;
import zov.blessed.crack.by.laqwrt.Class_64;
import zov.blessed.crack.by.laqwrt.module.Module;

public class AutoCrystall extends Module {
   private ArrayList<BlockPos> field_1173 = new ArrayList<>();
   private int field_1174 = -1;

   public AutoCrystall() {
      super(new String[]{"AutoCr", "ystall"}, Category.combat);
   }

   private boolean method_1040(float var1, float var2) {
      return var1 >= var2;
   }

   public void method_207() {
      for(Iterator var1 = this.field_1173.iterator(); var1.hasNext(); var1.remove()) {
         final BlockPos var2 = (BlockPos)var1.next();
         if (this.mc.level.getBlockState(var2).getBlock() == Blocks.OBSIDIAN) {
            final int var3 = this.method_1041(Items.END_CRYSTAL);
            if (var3 != -1) {
               (new Thread(new Runnable() {
                  public void run() {
                     Iterator var1 = AutoCrystall.this.mc.level.players().iterator();

                     while(var1.hasNext()) {
                        PlayerEntity var2x = (PlayerEntity)var1.next();
                        if (var2x != AutoCrystall.this.mc.player && !(AutoCrystall.this.mc.player.distanceTo(var2x) > 6.0F) && !Blessed.getInstance().method_825().method_1134(var2x.getName().getString()) && AutoCrystall.this.method_1040((float)var2x.getY(), (float)(var2.getY() + 1))) {
                           AutoCrystall.this.field_1174 = AutoCrystall.this.mc.player.inventory.selected;

                           try {
                              Thread.sleep(100L);
                           } catch (Exception var10) {
                           }

                           AutoCrystall.this.mc.player.inventory.selected = var3;

                           try {
                              Thread.sleep(200L);
                           } catch (Exception var9) {
                           }

                           Vector3d var3x = Vector3d.upFromBottomCenterOf(var2, 1.0D);
                           BlockRayTraceResult var4 = new BlockRayTraceResult(var3x, Direction.UP, var2, false);
                           if (AutoCrystall.this.mc.gameMode.useItemOn(AutoCrystall.this.mc.player, AutoCrystall.this.mc.level, Hand.MAIN_HAND, var4) == ActionResultType.SUCCESS) {
                              AutoCrystall.this.mc.player.swing(Hand.MAIN_HAND);
                           }

                           try {
                              Thread.sleep(200L);
                           } catch (Exception var8) {
                           }

                           Iterator var5 = AutoCrystall.this.mc.level.entitiesForRendering().iterator();

                           while(var5.hasNext()) {
                              Entity var6 = (Entity)var5.next();
                              if (var6 instanceof EnderCrystalEntity && AutoCrystall.this.mc.player.distanceTo(var6) <= 4.0F) {
                                 AutoCrystall.this.mc.gameMode.attack(AutoCrystall.this.mc.player, var6);
                                 AutoCrystall.this.mc.player.swing(Hand.MAIN_HAND);
                              }
                           }

                           try {
                              Thread.sleep(100L);
                           } catch (Exception var7) {
                           }

                           AutoCrystall.this.mc.player.inventory.selected = AutoCrystall.this.field_1174;
                           break;
                        }
                     }

                  }
               })).start();
            }
         }
      }

   }

   public int method_1041(Item var1) {
      for(int var2 = 0; var2 < 9; ++var2) {
         ItemStack var3 = this.mc.player.inventory.getItem(var2);
         if (var3.getItem() == var1) {
            return var2;
         }
      }

      return -1;
   }

   @Override
   public boolean packetEvent(Object var1, Class_64 var2) {
      if (var1 instanceof CPlayerTryUseItemOnBlockPacket) {
         CPlayerTryUseItemOnBlockPacket var3 = (CPlayerTryUseItemOnBlockPacket)var1;
         BlockRayTraceResult var4 = var3.getHitResult();
         BlockPos var5 = var4.getBlockPos();
         if (!(this.mc.level.getBlockState(var4.getBlockPos()).getBlock() instanceof TallGrassBlock)) {
            if (var4.getDirection() == Direction.UP) {
               var5 = var5.offset(0, 1, 0);
            }

            if (var4.getDirection() == Direction.SOUTH) {
               var5 = var5.offset(0, 0, 1);
            }

            if (var4.getDirection() == Direction.NORTH) {
               var5 = var5.offset(0, 0, -1);
            }

            if (var4.getDirection() == Direction.EAST) {
               var5 = var5.offset(1, 0, 0);
            }

            if (var4.getDirection() == Direction.WEST) {
               var5 = var5.offset(-1, 0, 0);
            }
         }

         this.field_1173.add(var5);
      }

      return super.packetEvent(var1, var2);
   }
}
