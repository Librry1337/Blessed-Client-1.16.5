package zov.blessed.crack.by.laqwrt;//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-master\1.16.5 stable mappings"!

import io.netty.channel.Channel;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelPromise;
import java.lang.reflect.Field;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.client.CUseEntityPacket;
import net.minecraft.network.play.client.CUseEntityPacket.Action;

public class Class_96 extends ChannelDuplexHandler {
   public boolean flag = false;

   public Class_96() {
      try {
         Field[] var1 = Minecraft.getInstance().getConnection().getConnection().getClass().getDeclaredFields();
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            Field var4 = var1[var3];
            if (var4.getType().getName().contains(Channel.class.getName())) {
               var4.setAccessible(true);
               ChannelPipeline var5 = ((Channel)var4.get(Minecraft.getInstance().getConnection().getConnection())).pipeline();
               var5.addBefore("packet_handler", "1337", this);
            }
         }
      } catch (Exception var6) {
         var6.hashCode();
      }

   }

   public void channelRead(ChannelHandlerContext var1, Object var2) throws Exception {
      if (this.flag) {
         super.channelRead(var1, var2);
      } else if (Class_101.method_354(var2, Class_64.ヨミオニけことオかノマ)) {
         super.channelRead(var1, var2);
      }
   }

   public void write(ChannelHandlerContext var1, Object var2, ChannelPromise var3) throws Exception {
      if (this.flag) {
         super.write(var1, var2, var3);
      } else {
         if (var2 instanceof CUseEntityPacket) {
            CUseEntityPacket var4 = (CUseEntityPacket)var2;
            Entity var5 = var4.getTarget(Minecraft.getInstance().level);
            if (var4.getAction() == Action.ATTACK && var5 != null) {
               Blessed.field_1016 = var5;
            }
         }

         if (Class_101.method_354(var2, Class_64.ラもをスろりウやメきヤ)) {
            super.write(var1, var2, var3);
         }
      }
   }

   public void destruct() {
      try {
         Field[] var1 = Minecraft.getInstance().getConnection().getConnection().getClass().getDeclaredFields();
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            Field var4 = var1[var3];
            if (var4.getType().getName().contains(Channel.class.getName())) {
               var4.setAccessible(true);
               ChannelPipeline var5 = ((Channel)var4.get(Minecraft.getInstance().getConnection().getConnection())).pipeline();
               var5.remove("1337");
            }
         }
      } catch (Exception var6) {
         var6.hashCode();
      }

   }
}
