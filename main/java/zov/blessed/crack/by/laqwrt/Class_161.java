package zov.blessed.crack.by.laqwrt;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class Class_161 {
   public final Random field_861 = new Random();
   private final Color[] field_862 = new Color[256];
   private final int[] field_863 = new int[32];
   private Class_199 field_864;
   private Class_199 field_865;
   private Class_199 field_866;
   private Class_199 field_867;
   private String field_868 = "0123456789abcdefklmnor";
   private boolean field_869;
   public float field_870;

   public Class_161(Font var1, boolean var2, int var3) {
      this.method_619(var1, var2, var3);
      this.field_862[113] = new Color(0, 90, 163);
      this.field_868 = this.method_632();
      this.method_628();
      this.field_870 = (float)this.method_611();
   }

   public int method_601(String var1, float var2, float var3, int var4) {
      return this.method_607(var1, var2, var3, var4, false);
   }

   public int method_602(String var1, float var2, float var3, int var4) {
      this.method_607(var1, var2 + 0.5F, var3 + 0.5F, var4, true);
      this.method_607(var1, var2, var3, var4, false);
      return 0;
   }

   public Blessed method_603(String var1, int var2, int var3, int var4, boolean var5) {
      if (var5) {
         this.method_602(var1, (float)(var2 - this.method_618(var1) / 2), (float)var3, var4);
      } else {
         this.method_601(var1, (float)(var2 - this.method_618(var1) / 2), (float)var3, var4);
      }

      return null;
   }

   public Blessed method_604(String var1, int var2, int var3, int var4, boolean var5) {
      this.method_603(var1, var2, var3 - this.method_611() / 2, var4, var5);
      return null;
   }

   public Blessed method_605(String var1, int var2, int var3, int var4) {
      this.method_602(var1, (float)(var2 - this.method_618(var1) / 2), (float)var3, var4);
      return null;
   }

   public Blessed method_606(String var1, int var2, int var3, int var4) {
      this.method_601(var1, (float)(var2 - this.method_618(var1) / 2), (float)var3, var4);
      return null;
   }

   public int method_607(String var1, float var2, float var3, int var4, boolean var5) {
      int var6 = 0;
      String[] var7 = var1.split("\r");

      for(int var8 = 0; var8 < var7.length; ++var8) {
         var6 = this.method_608(var7[var8], var2, var3 + (float)(var8 * this.method_611()), var4, var5);
      }

      return var6;
   }

   private int method_608(String var1, float var2, float var3, int var4, boolean var5) {
      if (var1 == null) {
         return 0;
      } else {
         GL11.glPushMatrix();
         GL11.glTranslated((double)var2 - 1.5D, (double)var3 + 0.5D, 0.0D);
         boolean var6 = GL11.glGetBoolean(3042);
         GL11.glEnable(3008);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glEnable(3553);
         if ((var4 & -67108864) == 0) {
            var4 |= -16777216;
         }

         if (var5) {
            var4 = (var4 & 16579836) >> 2 | var4 & -16777216;
         }

         float var7 = (float)(var4 >> 16 & 255) / 255.0F;
         float var8 = (float)(var4 >> 8 & 255) / 255.0F;
         float var9 = (float)(var4 & 255) / 255.0F;
         float var10 = (float)(var4 >> 24 & 255) / 255.0F;
         Color var11 = new Color(var7, var8, var9, var10);
         if (var1.contains("§")) {
            String[] var12 = var1.split("§");
            Color var13 = var11;
            Class_199 var14 = this.field_864;
            int var15 = 0;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = false;
            boolean var19 = false;
            boolean var20 = false;

            for(int var21 = 0; var21 < var12.length; ++var21) {
               if (var12[var21].length() > 0) {
                  if (var21 == 0) {
                     var14.method_880(var12[var21], (double)var15, 0.0D, var13, var5);
                     var15 += var14.method_884(var12[var21]);
                  } else {
                     String var22 = var12[var21].substring(1);
                     char var23 = var12[var21].charAt(0);
                     int var24 = this.field_868.indexOf(var23);
                     if (var24 != -1) {
                        if (var24 < 16) {
                           int var25 = this.field_863[var24];
                           var13 = this.method_631(var25, var10);
                           var17 = false;
                           var18 = false;
                           var16 = false;
                           var20 = false;
                           var19 = false;
                        } else if (var24 == 16) {
                           var16 = true;
                        } else if (var24 == 17) {
                           var17 = true;
                        } else if (var24 == 18) {
                           var19 = true;
                        } else if (var24 == 19) {
                           var20 = true;
                        } else if (var24 == 20) {
                           var18 = true;
                        } else if (var24 == 21) {
                           var17 = false;
                           var18 = false;
                           var16 = false;
                           var20 = false;
                           var19 = false;
                           var13 = var11;
                        } else if (var24 > 21) {
                           Color var27 = this.field_862[var23];
                           var13 = new Color((float)var27.getRed() / 255.0F, (float)var27.getGreen() / 255.0F, (float)var27.getBlue() / 255.0F, var10);
                        }
                     }

                     if (var17 && var18) {
                        this.field_867.method_880(var16 ? this.method_609(var14, var22) : var22, (double)var15, 0.0D, var13, var5);
                        var14 = this.field_867;
                     } else if (var17) {
                        this.field_865.method_880(var16 ? this.method_609(var14, var22) : var22, (double)var15, 0.0D, var13, var5);
                        var14 = this.field_865;
                     } else if (var18) {
                        this.field_866.method_880(var16 ? this.method_609(var14, var22) : var22, (double)var15, 0.0D, var13, var5);
                        var14 = this.field_866;
                     } else {
                        this.field_864.method_880(var16 ? this.method_609(var14, var22) : var22, (double)var15, 0.0D, var13, var5);
                        var14 = this.field_864;
                     }

                     float var28 = (float)this.field_864.method_883() / 16.0F;
                     int var26 = var14.method_882(var22);
                     if (var19) {
                        this.method_625((double)var15 / 2.0D + 1.0D, (double)(var26 / 3), (double)(var15 + var14.method_884(var22)) / 2.0D + 1.0D, (double)(var26 / 3), var28);
                     }

                     if (var20) {
                        this.method_625((double)var15 / 2.0D + 1.0D, (double)(var26 / 2), (double)(var15 + var14.method_884(var22)) / 2.0D + 1.0D, (double)(var26 / 2), var28);
                     }

                     var15 += var14.method_884(var22);
                  }
               }
            }
         } else {
            this.field_864.method_880(var1, 0.0D, 0.0D, var11, var5);
         }

         if (!var6) {
            GL11.glDisable(3042);
         }

         GL11.glPopMatrix();
         GL11.glColor4f(255.0F, 255.0F, 255.0F, 255.0F);
         return (int)(var2 + (float)this.method_618(var1));
      }
   }

   private String method_609(Class_199 var1, String var2) {
      String var3 = "";
      String var4 = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\u0000";
      char[] var5 = var2.toCharArray();
      int var6 = var5.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         char var8 = var5[var7];
         if (Class_245.method_1131(var8)) {
            int var9 = this.field_861.nextInt("ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\u0000".length());
            var3 = var3 + "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\u0000".toCharArray()[var9];
         }
      }

      return var3;
   }

   public int method_610(String var1) {
      return var1 == null ? 0 : this.field_864.method_882(var1) / 2;
   }

   public int method_611() {
      return this.field_864.method_883() / 2;
   }

   public static String method_612(String var0) {
      String var1 = "";
      int var2 = -1;
      int var3 = var0.length();

      while((var2 = var0.indexOf(167, var2 + 1)) != -1) {
         if (var2 < var3 - 1) {
            char var4 = var0.charAt(var2 + 1);
            if (method_616(var4)) {
               var1 = "§" + var4;
            } else if (method_613(var4)) {
               var1 = var1 + "§" + var4;
            }
         }
      }

      return var1;
   }

   private static boolean method_613(char var0) {
      return var0 >= 'k' && var0 <= 'o' || var0 >= 'K' && var0 <= 'O' || var0 == 'r' || var0 == 'R';
   }

   public int method_614(char var1) {
      return this.field_863["0123456789abcdef".indexOf(var1)];
   }

   private int method_615(String var1, int var2) {
      int var3 = var1.length();
      int var4 = 0;
      int var5 = 0;
      int var6 = -1;

      for(boolean var7 = false; var5 < var3; ++var5) {
         char var8 = var1.charAt(var5);
         switch(var8) {
         case '\n':
            --var5;
            break;
         case ' ':
            var6 = var5;
         default:
            var4 += this.method_618(Character.toString(var8));
            if (var7) {
               ++var4;
            }
            break;
         case '§':
            if (var5 < var3 - 1) {
               ++var5;
               char var9 = var1.charAt(var5);
               if (var9 != 'l' && var9 != 'L') {
                  if (var9 == 'r' || var9 == 'R' || method_616(var9)) {
                     var7 = false;
                  }
               } else {
                  var7 = true;
               }
            }
         }

         if (var8 == '\n') {
            ++var5;
            var6 = var5;
            break;
         }

         if (var4 > var2) {
            break;
         }
      }

      return var5 != var3 && var6 != -1 && var6 < var5 ? var6 : var5;
   }

   private static boolean method_616(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'a' && var0 <= 'f' || var0 >= 'A' && var0 <= 'F';
   }

   public int method_617(char var1) {
      return this.method_618(Character.toString(var1));
   }

   public int method_618(String var1) {
      if (var1 == null) {
         return 0;
      } else if (!var1.contains("§")) {
         return this.field_864.method_884(var1) / 2;
      } else {
         String[] var2 = var1.split("§");
         Class_199 var3 = this.field_864;
         int var4 = 0;
         boolean var5 = false;
         boolean var6 = false;

         for(int var7 = 0; var7 < var2.length; ++var7) {
            if (var2[var7].length() > 0) {
               if (var7 == 0) {
                  var4 += var3.method_884(var2[var7]);
               } else {
                  String var8 = var2[var7].substring(1);
                  char var9 = var2[var7].charAt(0);
                  int var10 = this.field_868.indexOf(var9);
                  if (var10 != -1) {
                     if (var10 < 16) {
                        var5 = false;
                        var6 = false;
                     } else if (var10 != 16) {
                        if (var10 == 17) {
                           var5 = true;
                        } else if (var10 != 18 && var10 != 19) {
                           if (var10 == 20) {
                              var6 = true;
                           } else if (var10 == 21) {
                              var5 = false;
                              var6 = false;
                           }
                        }
                     }
                  }

                  if (var5 && var6) {
                     var3 = this.field_867;
                  } else if (var5) {
                     var3 = this.field_865;
                  } else if (var6) {
                     var3 = this.field_866;
                  } else {
                     var3 = this.field_864;
                  }

                  var4 += var3.method_884(var8);
               }
            }
         }

         return var4 / 2;
      }
   }

   public void method_619(Font var1, boolean var2, int var3) {
      synchronized(this) {
         this.field_864 = new Class_199(var1, var2, var3);
         this.field_865 = new Class_199(var1.deriveFont(1), var2, var3);
         this.field_866 = new Class_199(var1.deriveFont(2), var2, var3);
         this.field_867 = new Class_199(var1.deriveFont(3), var2, var3);
         this.field_870 = (float)this.method_611();
      }
   }

   public Class_199 method_620() {
      return this.field_864;
   }

   public String method_621() {
      return this.field_864.method_887().getFontName();
   }

   public int method_622() {
      return this.field_864.method_887().getSize();
   }

   public List<String> method_623(String var1, double var2) {
      ArrayList var4 = new ArrayList<>();
      if ((double)this.method_618(var1) > var2) {
         String[] var5 = var1.split(" ");
         String var6 = "";
         char var7 = '\uffff';
         String[] var8 = var5;
         int var9 = var5.length;

         for(int var10 = 0; var10 < var9; ++var10) {
            String var11 = var8[var10];

            for(int var12 = 0; var12 < var11.toCharArray().length; ++var12) {
               char var13 = var11.toCharArray()[var12];
               if (var13 == 167 && var12 < var11.toCharArray().length - 1) {
                  var7 = var11.toCharArray()[var12 + 1];
               }
            }

            if ((double)this.method_618(var6 + var11 + " ") < var2) {
               var6 = var6 + var11 + " ";
            } else {
               var4.add(var6);
               var6 = var7 == -1 ? var11 + " " : "§" + var7 + var11 + " ";
            }
         }

         if (!var6.equals("")) {
            if ((double)this.method_618(var6) < var2) {
               var4.add(var7 == -1 ? var6 + " " : "§" + var7 + var6 + " ");
               var6 = "";
            } else {
               Iterator var14 = this.method_624(var6, var2).iterator();

               while(var14.hasNext()) {
                  String var15 = (String)var14.next();
                  var4.add(var15);
               }
            }
         }
      } else {
         var4.add(var1);
      }

      return var4;
   }

   public List<String> method_624(String var1, double var2) {
      ArrayList var4 = new ArrayList<>();
      String var5 = "";
      char var6 = '\uffff';

      for(int var7 = 0; var7 < var1.toCharArray().length; ++var7) {
         char var8 = var1.toCharArray()[var7];
         if (var8 == 167 && var7 < var1.toCharArray().length - 1) {
            var6 = var1.toCharArray()[var7 + 1];
         }

         if ((double)this.method_618(var5 + var8) < var2) {
            var5 = var5 + var8;
         } else {
            var4.add(var5);
            var5 = var6 == -1 ? String.valueOf(var8) : "§" + var6 + var8;
         }
      }

      if (!var5.equals("")) {
         var4.add(var5);
      }

      return var4;
   }

   private void method_625(double var1, double var3, double var5, double var7, float var9) {
      GL11.glDisable(3553);
      GL11.glLineWidth(var9);
      GL11.glBegin(1);
      GL11.glVertex2d(var1, var3);
      GL11.glVertex2d(var5, var7);
      GL11.glEnd();
      GL11.glEnable(3553);
   }

   public boolean method_626() {
      return this.field_864.method_885() && this.field_865.method_885() && this.field_866.method_885() && this.field_867.method_885();
   }

   public void method_627(boolean var1) {
      this.field_864.method_886(var1);
      this.field_865.method_886(var1);
      this.field_866.method_886(var1);
      this.field_867.method_886(var1);
   }

   private void method_628() {
      for(int var1 = 0; var1 < 32; ++var1) {
         int var2 = (var1 >> 3 & 1) * 85;
         int var3 = (var1 >> 2 & 1) * 170 + var2;
         int var4 = (var1 >> 1 & 1) * 170 + var2;
         int var5 = (var1 >> 0 & 1) * 170 + var2;
         if (var1 == 6) {
            var3 += 85;
         }

         if (var1 >= 16) {
            var3 /= 4;
            var4 /= 4;
            var5 /= 4;
         }

         this.field_863[var1] = (var3 & 255) << 16 | (var4 & 255) << 8 | var5 & 255;
      }

   }

   public List<String> method_629(String var1, int var2) {
      return Arrays.asList(this.method_630(var1, var2).split("\n"));
   }

   protected String method_630(String var1, int var2) {
      int var3 = this.method_615(var1, var2);
      if (var1.length() <= var3) {
         return var1;
      } else {
         String var4 = var1.substring(0, var3);
         char var5 = var1.charAt(var3);
         boolean var6 = var5 == ' ' || var5 == '\n';
         String var7 = method_612(var4) + var1.substring(var3 + (var6 ? 1 : 0));
         return var4 + "\n" + this.method_630(var7, var2);
      }
   }

   public Color method_631(int var1, float var2) {
      return new Color((float)(var1 >> 16) / 255.0F, (float)(var1 >> 8 & 255) / 255.0F, (float)(var1 & 255) / 255.0F, var2);
   }

   private String method_632() {
      String var1 = "0123456789abcdefklmnor";

      for(int var2 = 0; var2 < this.field_862.length; ++var2) {
         if (this.field_862[var2] != null) {
            var1 = var1 + (char)var2;
         }
      }

      return var1;
   }
}
