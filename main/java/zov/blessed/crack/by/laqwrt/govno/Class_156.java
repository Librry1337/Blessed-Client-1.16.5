package zov.blessed.crack.by.laqwrt.govno;

import zov.blessed.crack.by.laqwrt.Class_206;
import zov.blessed.crack.by.laqwrt.Class_63;
import zov.blessed.crack.by.laqwrt.Class_90;

final class Class_156 extends Class_213 {
   static final int field_764 = 0;
   static final int field_765 = 1;
   static final int field_766 = 2;
   static final int field_767 = 3;
   static final int field_768 = 4;
   private static final int field_769 = 0;
   private static final int[] field_770 = new int[]{0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0};
   private final Class_170 field_771;
   private final int field_772;
   private final int field_773;
   private final String field_774;
   private final int field_775;
   private final String field_776;
   private int field_777;
   private int field_778;
   private final Class_25 field_779 = new Class_25();
   private Class_67 field_780;
   private Class_67 field_781;
   private int field_782;
   private Class_25 field_783;
   private int field_784;
   private Class_25 field_785;
   private int field_786;
   private Class_25 field_787;
   private int field_788;
   private Class_25 field_789;
   private Class_34 field_790;
   private Class_34 field_791;
   private Class_98 field_792;
   private final int field_793;
   private final int[] field_794;
   private final int field_795;
   private Class_34 field_796;
   private Class_34 field_797;
   private int field_798;
   private Class_34[] field_799;
   private int field_800;
   private Class_34[] field_801;
   private Class_34 field_802;
   private Class_34 field_803;
   private Class_25 field_804;
   private int field_805;
   private Class_25 field_806;
   private Class_98 field_807;
   private final int field_808;
   private Class_262 field_809;
   private Class_262 field_810;
   private Class_262 field_811;
   private int field_812;
   private int field_813;
   private int field_814;
   private int field_815;
   private int[] field_816;
   private int[] field_817;
   private boolean field_818;
   private boolean field_819;
   private int field_820;
   private int field_821;
   private int field_822;

   Class_156(Class_170 var1, int var2, String var3, String var4, String var5, String[] var6, int var7) {
      super(589824);
      this.field_771 = var1;
      this.field_772 = "<init>".equals(var3) ? var2 | 262144 : var2;
      this.field_773 = var1.method_685(var3);
      this.field_774 = var3;
      this.field_775 = var1.method_685(var4);
      this.field_776 = var4;
      this.field_795 = var5 == null ? 0 : var1.method_685(var5);
      int var8;
      if (var6 != null && var6.length > 0) {
         this.field_793 = var6.length;
         this.field_794 = new int[this.field_793];

         for(var8 = 0; var8 < this.field_793; ++var8) {
            this.field_794[var8] = var1.method_669(var6[var8]).field_959;
         }
      } else {
         this.field_793 = 0;
         this.field_794 = null;
      }

      this.field_808 = var7;
      if (var7 != 0) {
         var8 = Class_260.method_1218(var4) >> 2;
         if ((var2 & 8) != 0) {
            --var8;
         }

         this.field_778 = var8;
         this.field_814 = var8;
         this.field_809 = new Class_262();
         this.method_938(this.field_809);
      }

   }

   boolean method_557() {
      return this.field_788 > 0;
   }

   boolean method_558() {
      return this.field_819;
   }

   public void method_920(String var1, int var2) {
      if (this.field_806 == null) {
         this.field_806 = new Class_25();
      }

      ++this.field_805;
      this.field_806.method_24(var1 == null ? 0 : this.field_771.method_685(var1)).method_24(var2);
   }

   public Class_194 method_921() {
      this.field_804 = new Class_25();
      return new Class_34(this.field_771, false, this.field_804, (Class_34)null);
   }

   public Class_194 method_922(String var1, boolean var2) {
      return var2 ? (this.field_796 = Class_34.method_54(this.field_771, var1, this.field_796)) : (this.field_797 = Class_34.method_54(this.field_771, var1, this.field_797));
   }

   public Class_194 method_923(int var1, Class_82 var2, String var3, boolean var4) {
      return var4 ? (this.field_802 = Class_34.method_55(this.field_771, var1, var2, var3, this.field_802)) : (this.field_803 = Class_34.method_55(this.field_771, var1, var2, var3, this.field_803));
   }

   public void method_924(int var1, boolean var2) {
      if (var2) {
         this.field_798 = var1;
      } else {
         this.field_800 = var1;
      }

   }

   public Class_194 method_925(int var1, String var2, boolean var3) {
      if (var3) {
         if (this.field_799 == null) {
            this.field_799 = new Class_34[Class_260.method_1197(this.field_776).length];
         }

         return this.field_799[var1] = Class_34.method_54(this.field_771, var2, this.field_799[var1]);
      } else {
         if (this.field_801 == null) {
            this.field_801 = new Class_34[Class_260.method_1197(this.field_776).length];
         }

         return this.field_801[var1] = Class_34.method_54(this.field_771, var2, this.field_801[var1]);
      }
   }

   public void method_926(Class_98 var1) {
      if (var1.method_326()) {
         var1.field_655 = this.field_792;
         this.field_792 = var1;
      } else {
         var1.field_655 = this.field_807;
         this.field_807 = var1;
      }

   }

   public void method_927() {
   }

   public void method_928(int var1, int var2, Object[] var3, int var4, Object[] var5) {
      if (this.field_808 != 4) {
         int var6;
         if (this.field_808 == 3) {
            if (this.field_811.field_1270 == null) {
               this.field_811.field_1270 = new Class_236(this.field_811);
               this.field_811.field_1270.method_100(this.field_771, this.field_772, this.field_776, var2);
               this.field_811.field_1270.method_116(this);
            } else {
               if (var1 == -1) {
                  this.field_811.field_1270.method_101(this.field_771, var2, var3, var4, var5);
               }

               this.field_811.field_1270.method_116(this);
            }
         } else {
            int var7;
            if (var1 == -1) {
               if (this.field_816 == null) {
                  var6 = Class_260.method_1218(this.field_776) >> 2;
                  Class_45 var8 = new Class_45(new Class_262());
                  var8.method_100(this.field_771, this.field_772, this.field_776, var6);
                  var8.method_116(this);
               }

               this.field_814 = var2;
               var6 = this.method_564(this.field_779.field_131, var2, var4);

               for(var7 = 0; var7 < var2; ++var7) {
                  this.field_817[var6++] = Class_45.method_97(this.field_771, var3[var7]);
               }

               for(var7 = 0; var7 < var4; ++var7) {
                  this.field_817[var6++] = Class_45.method_97(this.field_771, var5[var7]);
               }

               this.method_566();
            } else {
               if (this.field_771.method_657() < 50) {
                  throw new IllegalArgumentException("Class versions V1_5 or less must use F_NEW frames.");
               }

               if (this.field_789 == null) {
                  this.field_789 = new Class_25();
                  var6 = this.field_779.field_131;
               } else {
                  var6 = this.field_779.field_131 - this.field_815 - 1;
                  if (var6 < 0) {
                     if (var1 == 3) {
                        return;
                     }

                     throw new IllegalStateException();
                  }
               }

               label124:
               switch(var1) {
               case 0:
                  this.field_814 = var2;
                  this.field_789.method_22(255).method_24(var6).method_24(var2);

                  for(var7 = 0; var7 < var2; ++var7) {
                     this.method_569(var3[var7]);
                  }

                  this.field_789.method_24(var4);
                  var7 = 0;

                  while(true) {
                     if (var7 >= var4) {
                        break label124;
                     }

                     this.method_569(var5[var7]);
                     ++var7;
                  }
               case 1:
                  this.field_814 += var2;
                  this.field_789.method_22(251 + var2).method_24(var6);
                  var7 = 0;

                  while(true) {
                     if (var7 >= var2) {
                        break label124;
                     }

                     this.method_569(var3[var7]);
                     ++var7;
                  }
               case 2:
                  this.field_814 -= var2;
                  this.field_789.method_22(251 - var2).method_24(var6);
                  break;
               case 3:
                  if (var6 < 64) {
                     this.field_789.method_22(var6);
                  } else {
                     this.field_789.method_22(251).method_24(var6);
                  }
                  break;
               case 4:
                  if (var6 < 64) {
                     this.field_789.method_22(64 + var6);
                  } else {
                     this.field_789.method_22(247).method_24(var6);
                  }

                  this.method_569(var5[0]);
                  break;
               default:
                  throw new IllegalArgumentException();
               }

               this.field_815 = this.field_779.field_131;
               ++this.field_788;
            }
         }

         if (this.field_808 == 2) {
            this.field_812 = var4;

            for(var6 = 0; var6 < var4; ++var6) {
               if (var5[var6] == Class_63.field_428 || var5[var6] == Class_63.field_427) {
                  ++this.field_812;
               }
            }

            if (this.field_812 > this.field_813) {
               this.field_813 = this.field_812;
            }
         }

         this.field_777 = Math.max(this.field_777, var4);
         this.field_778 = Math.max(this.field_778, this.field_814);
      }
   }

   public void method_929(int var1) {
      this.field_820 = this.field_779.field_131;
      this.field_779.method_22(var1);
      if (this.field_811 != null) {
         if (this.field_808 != 4 && this.field_808 != 3) {
            int var2 = this.field_812 + field_770[var1];
            if (var2 > this.field_813) {
               this.field_813 = var2;
            }

            this.field_812 = var2;
         } else {
            this.field_811.field_1270.method_112(var1, 0, (Class_179)null, (Class_170)null);
         }

         if (var1 >= 172 && var1 <= 177 || var1 == 191) {
            this.method_563();
         }
      }

   }

   public void method_930(int var1, int var2) {
      this.field_820 = this.field_779.field_131;
      if (var1 == 17) {
         this.field_779.method_25(var1, var2);
      } else {
         this.field_779.method_23(var1, var2);
      }

      if (this.field_811 != null) {
         if (this.field_808 != 4 && this.field_808 != 3) {
            if (var1 != 188) {
               int var3 = this.field_812 + 1;
               if (var3 > this.field_813) {
                  this.field_813 = var3;
               }

               this.field_812 = var3;
            }
         } else {
            this.field_811.field_1270.method_112(var1, var2, (Class_179)null, (Class_170)null);
         }
      }

   }

   public void method_931(int var1, int var2) {
      this.field_820 = this.field_779.field_131;
      int var3;
      if (var2 < 4 && var1 != 169) {
         if (var1 < 54) {
            var3 = 26 + (var1 - 21 << 2) + var2;
         } else {
            var3 = 59 + (var1 - 54 << 2) + var2;
         }

         this.field_779.method_22(var3);
      } else if (var2 >= 256) {
         this.field_779.method_22(196).method_25(var1, var2);
      } else {
         this.field_779.method_23(var1, var2);
      }

      if (this.field_811 != null) {
         if (this.field_808 != 4 && this.field_808 != 3) {
            if (var1 == 169) {
               Class_262 var10000 = this.field_811;
               var10000.field_1261 = (short)(var10000.field_1261 | 64);
               this.field_811.field_1267 = (short)this.field_812;
               this.method_563();
            } else {
               var3 = this.field_812 + field_770[var1];
               if (var3 > this.field_813) {
                  this.field_813 = var3;
               }

               this.field_812 = var3;
            }
         } else {
            this.field_811.field_1270.method_112(var1, var2, (Class_179)null, (Class_170)null);
         }
      }

      if (this.field_808 != 0) {
         if (var1 != 22 && var1 != 24 && var1 != 55 && var1 != 57) {
            var3 = var2 + 1;
         } else {
            var3 = var2 + 2;
         }

         if (var3 > this.field_778) {
            this.field_778 = var3;
         }
      }

      if (var1 >= 54 && this.field_808 == 4 && this.field_780 != null) {
         this.method_938(new Class_262());
      }

   }

   public void method_932(int var1, String var2) {
      this.field_820 = this.field_779.field_131;
      Class_179 var3 = this.field_771.method_669(var2);
      this.field_779.method_25(var1, var3.field_959);
      if (this.field_811 != null) {
         if (this.field_808 != 4 && this.field_808 != 3) {
            if (var1 == 187) {
               int var4 = this.field_812 + 1;
               if (var4 > this.field_813) {
                  this.field_813 = var4;
               }

               this.field_812 = var4;
            }
         } else {
            this.field_811.field_1270.method_112(var1, this.field_820, var3, this.field_771);
         }
      }

   }

   public void method_933(int var1, String var2, String var3, String var4) {
      this.field_820 = this.field_779.field_131;
      Class_179 var5 = this.field_771.method_670(var2, var3, var4);
      this.field_779.method_25(var1, var5.field_959);
      if (this.field_811 != null) {
         if (this.field_808 != 4 && this.field_808 != 3) {
            int var6;
            label77: {
               char var7 = var4.charAt(0);
               switch(var1) {
               case 178:
                  var6 = this.field_812 + (var7 != 'D' && var7 != 'J' ? 1 : 2);
                  break label77;
               case 179:
                  var6 = this.field_812 + (var7 != 'D' && var7 != 'J' ? -1 : -2);
                  break label77;
               case 180:
                  var6 = this.field_812 + (var7 != 'D' && var7 != 'J' ? 0 : 1);
                  break label77;
               case 181:
               }

               var6 = this.field_812 + (var7 != 'D' && var7 != 'J' ? -2 : -3);
            }

            if (var6 > this.field_813) {
               this.field_813 = var6;
            }

            this.field_812 = var6;
         } else {
            this.field_811.field_1270.method_112(var1, 0, var5, this.field_771);
         }
      }

   }

   public void method_935(int var1, String var2, String var3, String var4, boolean var5) {
      this.field_820 = this.field_779.field_131;
      Class_179 var6 = this.field_771.method_671(var2, var3, var4, var5);
      if (var1 == 185) {
         this.field_779.method_25(185, var6.field_959).method_23(var6.method_745() >> 2, 0);
      } else {
         this.field_779.method_25(var1, var6.field_959);
      }

      if (this.field_811 != null) {
         if (this.field_808 != 4 && this.field_808 != 3) {
            int var7 = var6.method_745();
            int var8 = (var7 & 3) - (var7 >> 2);
            int var9;
            if (var1 == 184) {
               var9 = this.field_812 + var8 + 1;
            } else {
               var9 = this.field_812 + var8;
            }

            if (var9 > this.field_813) {
               this.field_813 = var9;
            }

            this.field_812 = var9;
         } else {
            this.field_811.field_1270.method_112(var1, 0, var6, this.field_771);
         }
      }

   }

   public void method_936(String var1, String var2, Class_206 var3, Object... var4) {
      this.field_820 = this.field_779.field_131;
      Class_179 var5 = this.field_771.method_691(var1, var2, var3, var4);
      this.field_779.method_25(186, var5.field_959);
      this.field_779.method_24(0);
      if (this.field_811 != null) {
         if (this.field_808 != 4 && this.field_808 != 3) {
            int var6 = var5.method_745();
            int var7 = (var6 & 3) - (var6 >> 2) + 1;
            int var8 = this.field_812 + var7;
            if (var8 > this.field_813) {
               this.field_813 = var8;
            }

            this.field_812 = var8;
         } else {
            this.field_811.field_1270.method_112(186, 0, var5, this.field_771);
         }
      }

   }

   public void method_937(int var1, Class_262 var2) {
      this.field_820 = this.field_779.field_131;
      int var3 = var1 >= 200 ? var1 - 33 : var1;
      boolean var4 = false;
      if ((var2.field_1261 & 4) != 0 && var2.field_1264 - this.field_779.field_131 < -32768) {
         if (var3 == 167) {
            this.field_779.method_22(200);
         } else if (var3 == 168) {
            this.field_779.method_22(201);
         } else {
            this.field_779.method_22(var3 >= 198 ? var3 ^ 1 : (var3 + 1 ^ 1) - 1);
            this.field_779.method_24(8);
            this.field_779.method_22(220);
            this.field_819 = true;
            var4 = true;
         }

         var2.method_1224(this.field_779, this.field_779.field_131 - 1, true);
      } else if (var3 != var1) {
         this.field_779.method_22(var1);
         var2.method_1224(this.field_779, this.field_779.field_131 - 1, true);
      } else {
         this.field_779.method_22(var3);
         var2.method_1224(this.field_779, this.field_779.field_131 - 1, false);
      }

      if (this.field_811 != null) {
         Class_262 var5 = null;
         Class_262 var10000;
         if (this.field_808 == 4) {
            this.field_811.field_1270.method_112(var3, 0, (Class_179)null, (Class_170)null);
            var10000 = var2.method_1221();
            var10000.field_1261 = (short)(var10000.field_1261 | 2);
            this.method_562(0, var2);
            if (var3 != 167) {
               var5 = new Class_262();
            }
         } else if (this.field_808 == 3) {
            this.field_811.field_1270.method_112(var3, 0, (Class_179)null, (Class_170)null);
         } else if (this.field_808 == 2) {
            this.field_812 += field_770[var3];
         } else if (var3 == 168) {
            if ((var2.field_1261 & 32) == 0) {
               var2.field_1261 = (short)(var2.field_1261 | 32);
               this.field_818 = true;
            }

            var10000 = this.field_811;
            var10000.field_1261 = (short)(var10000.field_1261 | 16);
            this.method_562(this.field_812 + 1, var2);
            var5 = new Class_262();
         } else {
            this.field_812 += field_770[var3];
            this.method_562(this.field_812, var2);
         }

         if (var5 != null) {
            if (var4) {
               var5.field_1261 = (short)(var5.field_1261 | 2);
            }

            this.method_938(var5);
         }

         if (var3 == 167) {
            this.method_563();
         }
      }

   }

   public void method_938(Class_262 var1) {
      this.field_819 |= var1.method_1226(this.field_779.field_130, this.field_779.field_131);
      if ((var1.field_1261 & 1) == 0) {
         if (this.field_808 == 4) {
            Class_262 var10000;
            if (this.field_811 != null) {
               if (var1.field_1264 == this.field_811.field_1264) {
                  var10000 = this.field_811;
                  var10000.field_1261 = (short)(var10000.field_1261 | var1.field_1261 & 2);
                  var1.field_1270 = this.field_811.field_1270;
                  return;
               }

               this.method_562(0, var1);
            }

            if (this.field_810 != null) {
               if (var1.field_1264 == this.field_810.field_1264) {
                  var10000 = this.field_810;
                  var10000.field_1261 = (short)(var10000.field_1261 | var1.field_1261 & 2);
                  var1.field_1270 = this.field_810.field_1270;
                  this.field_811 = this.field_810;
                  return;
               }

               this.field_810.field_1271 = var1;
            }

            this.field_810 = var1;
            this.field_811 = var1;
            var1.field_1270 = new Class_45(var1);
         } else if (this.field_808 == 3) {
            if (this.field_811 == null) {
               this.field_811 = var1;
            } else {
               this.field_811.field_1270.field_233 = var1;
            }
         } else if (this.field_808 == 1) {
            if (this.field_811 != null) {
               this.field_811.field_1268 = (short)this.field_813;
               this.method_562(this.field_812, var1);
            }

            this.field_811 = var1;
            this.field_812 = 0;
            this.field_813 = 0;
            if (this.field_810 != null) {
               this.field_810.field_1271 = var1;
            }

            this.field_810 = var1;
         } else if (this.field_808 == 2 && this.field_811 == null) {
            this.field_811 = var1;
         }

      }
   }

   public void method_939(Object var1) {
      this.field_820 = this.field_779.field_131;
      Class_179 var2 = this.field_771.method_668(var1);
      int var3 = var2.field_959;
      char var4;
      boolean var5 = var2.field_960 == 5 || var2.field_960 == 6 || var2.field_960 == 17 && ((var4 = var2.field_963.charAt(0)) == 'J' || var4 == 'D');
      if (var5) {
         this.field_779.method_25(20, var3);
      } else if (var3 >= 256) {
         this.field_779.method_25(19, var3);
      } else {
         this.field_779.method_23(18, var3);
      }

      if (this.field_811 != null) {
         if (this.field_808 != 4 && this.field_808 != 3) {
            int var6 = this.field_812 + (var5 ? 2 : 1);
            if (var6 > this.field_813) {
               this.field_813 = var6;
            }

            this.field_812 = var6;
         } else {
            this.field_811.field_1270.method_112(18, 0, var2, this.field_771);
         }
      }

   }

   public void method_940(int var1, int var2) {
      this.field_820 = this.field_779.field_131;
      if (var1 <= 255 && var2 <= 127 && var2 >= -128) {
         this.field_779.method_22(132).method_23(var1, var2);
      } else {
         this.field_779.method_22(196).method_25(132, var1).method_24(var2);
      }

      if (this.field_811 != null && (this.field_808 == 4 || this.field_808 == 3)) {
         this.field_811.field_1270.method_112(132, var1, (Class_179)null, (Class_170)null);
      }

      if (this.field_808 != 0) {
         int var3 = var1 + 1;
         if (var3 > this.field_778) {
            this.field_778 = var3;
         }
      }

   }

   public void method_941(int var1, int var2, Class_262 var3, Class_262... var4) {
      this.field_820 = this.field_779.field_131;
      this.field_779.method_22(170).method_32((byte[])null, 0, (4 - this.field_779.field_131 % 4) % 4);
      var3.method_1224(this.field_779, this.field_820, true);
      this.field_779.method_27(var1).method_27(var2);
      Class_262[] var5 = var4;
      int var6 = var4.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         Class_262 var8 = var5[var7];
         var8.method_1224(this.field_779, this.field_820, true);
      }

      this.method_559(var3, var4);
   }

   public void method_942(Class_262 var1, int[] var2, Class_262[] var3) {
      this.field_820 = this.field_779.field_131;
      this.field_779.method_22(171).method_32((byte[])null, 0, (4 - this.field_779.field_131 % 4) % 4);
      var1.method_1224(this.field_779, this.field_820, true);
      this.field_779.method_27(var3.length);

      for(int var4 = 0; var4 < var3.length; ++var4) {
         this.field_779.method_27(var2[var4]);
         var3[var4].method_1224(this.field_779, this.field_820, true);
      }

      this.method_559(var1, var3);
   }

   private void method_559(Class_262 var1, Class_262[] var2) {
      if (this.field_811 != null) {
         Class_262[] var3;
         int var4;
         int var5;
         Class_262 var6;
         if (this.field_808 == 4) {
            this.field_811.field_1270.method_112(171, 0, (Class_179)null, (Class_170)null);
            this.method_562(0, var1);
            Class_262 var10000 = var1.method_1221();
            var10000.field_1261 = (short)(var10000.field_1261 | 2);
            var3 = var2;
            var4 = var2.length;

            for(var5 = 0; var5 < var4; ++var5) {
               var6 = var3[var5];
               this.method_562(0, var6);
               var10000 = var6.method_1221();
               var10000.field_1261 = (short)(var10000.field_1261 | 2);
            }
         } else if (this.field_808 == 1) {
            --this.field_812;
            this.method_562(this.field_812, var1);
            var3 = var2;
            var4 = var2.length;

            for(var5 = 0; var5 < var4; ++var5) {
               var6 = var3[var5];
               this.method_562(this.field_812, var6);
            }
         }

         this.method_563();
      }

   }

   public void method_943(String var1, int var2) {
      this.field_820 = this.field_779.field_131;
      Class_179 var3 = this.field_771.method_669(var1);
      this.field_779.method_25(197, var3.field_959).method_22(var2);
      if (this.field_811 != null) {
         if (this.field_808 != 4 && this.field_808 != 3) {
            this.field_812 += 1 - var2;
         } else {
            this.field_811.field_1270.method_112(197, var2, var3, this.field_771);
         }
      }

   }

   public Class_194 method_944(int var1, Class_82 var2, String var3, boolean var4) {
      return var4 ? (this.field_790 = Class_34.method_55(this.field_771, var1 & -16776961 | this.field_820 << 8, var2, var3, this.field_790)) : (this.field_791 = Class_34.method_55(this.field_771, var1 & -16776961 | this.field_820 << 8, var2, var3, this.field_791));
   }

   public void method_945(Class_262 var1, Class_262 var2, Class_262 var3, String var4) {
      Class_67 var5 = new Class_67(var1, var2, var3, var4 != null ? this.field_771.method_669(var4).field_959 : 0, var4);
      if (this.field_780 == null) {
         this.field_780 = var5;
      } else {
         this.field_781.field_595 = var5;
      }

      this.field_781 = var5;
   }

   public Class_194 method_946(int var1, Class_82 var2, String var3, boolean var4) {
      return var4 ? (this.field_790 = Class_34.method_55(this.field_771, var1, var2, var3, this.field_790)) : (this.field_791 = Class_34.method_55(this.field_771, var1, var2, var3, this.field_791));
   }

   public void method_947(String var1, String var2, String var3, Class_262 var4, Class_262 var5, int var6) {
      if (var3 != null) {
         if (this.field_787 == null) {
            this.field_787 = new Class_25();
         }

         ++this.field_786;
         this.field_787.method_24(var4.field_1264).method_24(var5.field_1264 - var4.field_1264).method_24(this.field_771.method_685(var1)).method_24(this.field_771.method_685(var3)).method_24(var6);
      }

      if (this.field_785 == null) {
         this.field_785 = new Class_25();
      }

      ++this.field_784;
      this.field_785.method_24(var4.field_1264).method_24(var5.field_1264 - var4.field_1264).method_24(this.field_771.method_685(var1)).method_24(this.field_771.method_685(var2)).method_24(var6);
      if (this.field_808 != 0) {
         char var7 = var2.charAt(0);
         int var8 = var6 + (var7 != 'J' && var7 != 'D' ? 1 : 2);
         if (var8 > this.field_778) {
            this.field_778 = var8;
         }
      }

   }

   public Class_194 method_948(int var1, Class_82 var2, Class_262[] var3, Class_262[] var4, int[] var5, String var6, boolean var7) {
      Class_25 var8 = new Class_25();
      var8.method_22(var1 >>> 24).method_24(var3.length);

      for(int var9 = 0; var9 < var3.length; ++var9) {
         var8.method_24(var3[var9].field_1264).method_24(var4[var9].field_1264 - var3[var9].field_1264).method_24(var5[var9]);
      }

      Class_82.method_291(var2, var8);
      var8.method_24(this.field_771.method_685(var6)).method_24(0);
      return var7 ? (this.field_790 = new Class_34(this.field_771, true, var8, this.field_790)) : (this.field_791 = new Class_34(this.field_771, true, var8, this.field_791));
   }

   public void method_949(int var1, Class_262 var2) {
      if (this.field_783 == null) {
         this.field_783 = new Class_25();
      }

      ++this.field_782;
      this.field_783.method_24(var2.field_1264);
      this.field_783.method_24(var1);
   }

   public void method_950(int var1, int var2) {
      if (this.field_808 == 4) {
         this.method_560();
      } else if (this.field_808 == 1) {
         this.method_561();
      } else if (this.field_808 == 2) {
         this.field_777 = this.field_813;
      } else {
         this.field_777 = var1;
         this.field_778 = var2;
      }

   }

   private void method_560() {
      Class_262 var5;
      Class_262 var6;
      for(Class_67 var1 = this.field_780; var1 != null; var1 = var1.field_595) {
         String var2 = var1.field_594 == null ? "java/lang/Throwable" : var1.field_594;
         int var3 = Class_45.method_98(this.field_771, var2);
         Class_262 var4 = var1.field_592.method_1221();
         var4.field_1261 = (short)(var4.field_1261 | 2);
         var5 = var1.field_590.method_1221();

         for(var6 = var1.field_591.method_1221(); var5 != var6; var5 = var5.field_1271) {
            var5.field_1272 = new Class_54(var3, var4, var5.field_1272);
         }
      }

      Class_45 var10 = this.field_809.field_1270;
      var10.method_100(this.field_771, this.field_772, this.field_776, this.field_778);
      var10.method_116(this);
      Class_262 var11 = this.field_809;
      var11.field_1273 = Class_262.field_1259;
      int var12 = 0;

      while(var11 != Class_262.field_1259) {
         var5 = var11;
         var11 = var11.field_1273;
         var5.field_1273 = null;
         var5.field_1261 = (short)(var5.field_1261 | 8);
         int var13 = var5.field_1270.method_102() + var5.field_1268;
         if (var13 > var12) {
            var12 = var13;
         }

         for(Class_54 var7 = var5.field_1272; var7 != null; var7 = var7.field_279) {
            Class_262 var8 = var7.field_278.method_1221();
            boolean var9 = var5.field_1270.method_114(this.field_771, var8.field_1270, var7.field_277);
            if (var9 && var8.field_1273 == null) {
               var8.field_1273 = var11;
               var11 = var8;
            }
         }
      }

      for(var5 = this.field_809; var5 != null; var5 = var5.field_1271) {
         if ((var5.field_1261 & 10) == 10) {
            var5.field_1270.method_116(this);
         }

         if ((var5.field_1261 & 8) == 0) {
            var6 = var5.field_1271;
            int var14 = var5.field_1264;
            int var15 = (var6 == null ? this.field_779.field_131 : var6.field_1264) - 1;
            if (var15 >= var14) {
               int var16;
               for(var16 = var14; var16 < var15; ++var16) {
                  this.field_779.field_130[var16] = 0;
               }

               this.field_779.field_130[var15] = -65;
               var16 = this.method_564(var14, 0, 1);
               this.field_817[var16] = Class_45.method_98(this.field_771, "java/lang/Throwable");
               this.method_566();
               this.field_780 = Class_67.method_226(this.field_780, var5, var6);
               var12 = Math.max(var12, 1);
            }
         }
      }

      this.field_777 = var12;
   }

   private void method_561() {
      Class_262 var2;
      Class_262 var3;
      Class_262 var4;
      for(Class_67 var1 = this.field_780; var1 != null; var1 = var1.field_595) {
         var2 = var1.field_592;
         var3 = var1.field_590;

         for(var4 = var1.field_591; var3 != var4; var3 = var3.field_1271) {
            if ((var3.field_1261 & 16) == 0) {
               var3.field_1272 = new Class_54(Integer.MAX_VALUE, var2, var3.field_1272);
            } else {
               var3.field_1272.field_279.field_279 = new Class_54(Integer.MAX_VALUE, var2, var3.field_1272.field_279.field_279);
            }
         }
      }

      if (this.field_818) {
         short var9 = 1;
         this.field_809.method_1227(var9);

         for(short var10 = 1; var10 <= var9; ++var10) {
            for(var4 = this.field_809; var4 != null; var4 = var4.field_1271) {
               if ((var4.field_1261 & 16) != 0 && var4.field_1269 == var10) {
                  Class_262 var5 = var4.field_1272.field_279.field_278;
                  if (var5.field_1269 == 0) {
                     ++var9;
                     var5.method_1227(var9);
                  }
               }
            }
         }

         for(var3 = this.field_809; var3 != null; var3 = var3.field_1271) {
            if ((var3.field_1261 & 16) != 0) {
               var4 = var3.field_1272.field_279.field_278;
               var4.method_1228(var3);
            }
         }
      }

      var2 = this.field_809;
      var2.field_1273 = Class_262.field_1259;
      int var11 = this.field_777;

      while(var2 != Class_262.field_1259) {
         var4 = var2;
         var2 = var2.field_1273;
         short var12 = var4.field_1266;
         int var6 = var12 + var4.field_1268;
         if (var6 > var11) {
            var11 = var6;
         }

         Class_54 var7 = var4.field_1272;
         if ((var4.field_1261 & 16) != 0) {
            var7 = var7.field_279;
         }

         for(; var7 != null; var7 = var7.field_279) {
            Class_262 var8 = var7.field_278;
            if (var8.field_1273 == null) {
               var8.field_1266 = (short)(var7.field_277 == Integer.MAX_VALUE ? 1 : var12 + var7.field_277);
               var8.field_1273 = var2;
               var2 = var8;
            }
         }
      }

      this.field_777 = var11;
   }

   public void method_951() {
   }

   private void method_562(int var1, Class_262 var2) {
      this.field_811.field_1272 = new Class_54(var1, var2, this.field_811.field_1272);
   }

   private void method_563() {
      if (this.field_808 == 4) {
         Class_262 var1 = new Class_262();
         var1.field_1270 = new Class_45(var1);
         var1.method_1226(this.field_779.field_130, this.field_779.field_131);
         this.field_810.field_1271 = var1;
         this.field_810 = var1;
         this.field_811 = null;
      } else if (this.field_808 == 1) {
         this.field_811.field_1268 = (short)this.field_813;
         this.field_811 = null;
      }

   }

   int method_564(int var1, int var2, int var3) {
      int var4 = 3 + var2 + var3;
      if (this.field_817 == null || this.field_817.length < var4) {
         this.field_817 = new int[var4];
      }

      this.field_817[0] = var1;
      this.field_817[1] = var2;
      this.field_817[2] = var3;
      return 3;
   }

   void method_565(int var1, int var2) {
      this.field_817[var1] = var2;
   }

   void method_566() {
      if (this.field_816 != null) {
         if (this.field_789 == null) {
            this.field_789 = new Class_25();
         }

         this.method_567();
         ++this.field_788;
      }

      this.field_816 = this.field_817;
      this.field_817 = null;
   }

   private void method_567() {
      int var1 = this.field_817[1];
      int var2 = this.field_817[2];
      if (this.field_771.method_657() < 50) {
         this.field_789.method_24(this.field_817[0]).method_24(var1);
         this.method_568(3, 3 + var1);
         this.field_789.method_24(var2);
         this.method_568(3 + var1, 3 + var1 + var2);
      } else {
         int var3 = this.field_788 == 0 ? this.field_817[0] : this.field_817[0] - this.field_816[0] - 1;
         int var4 = this.field_816[1];
         int var5 = var1 - var4;
         int var6 = 255;
         if (var2 == 0) {
            switch(var5) {
            case -3:
            case -2:
            case -1:
               var6 = 248;
               break;
            case 0:
               var6 = var3 < 64 ? 0 : 251;
               break;
            case 1:
            case 2:
            case 3:
               var6 = 252;
            }
         } else if (var5 == 0 && var2 == 1) {
            var6 = var3 < 63 ? 64 : 247;
         }

         if (var6 != 255) {
            int var7 = 3;

            for(int var8 = 0; var8 < var4 && var8 < var1; ++var8) {
               if (this.field_817[var7] != this.field_816[var7]) {
                  var6 = 255;
                  break;
               }

               ++var7;
            }
         }

         switch(var6) {
         case 0:
            this.field_789.method_22(var3);
            break;
         case 64:
            this.field_789.method_22(64 + var3);
            this.method_568(3 + var1, 4 + var1);
            break;
         case 247:
            this.field_789.method_22(247).method_24(var3);
            this.method_568(3 + var1, 4 + var1);
            break;
         case 248:
            this.field_789.method_22(251 + var5).method_24(var3);
            break;
         case 251:
            this.field_789.method_22(251).method_24(var3);
            break;
         case 252:
            this.field_789.method_22(251 + var5).method_24(var3);
            this.method_568(3 + var4, 3 + var1);
            break;
         case 255:
         default:
            this.field_789.method_22(255).method_24(var3).method_24(var1);
            this.method_568(3, 3 + var1);
            this.field_789.method_24(var2);
            this.method_568(3 + var1, 3 + var1 + var2);
         }

      }
   }

   private void method_568(int var1, int var2) {
      for(int var3 = var1; var3 < var2; ++var3) {
         Class_45.method_117(this.field_771, this.field_817[var3], this.field_789);
      }

   }

   private void method_569(Object var1) {
      if (var1 instanceof Integer) {
         this.field_789.method_22((Integer)var1);
      } else if (var1 instanceof String) {
         this.field_789.method_22(7).method_24(this.field_771.method_669((String)var1).field_959);
      } else {
         this.field_789.method_22(8).method_24(((Class_262)var1).field_1264);
      }

   }

   boolean method_570(Class_81 var1, boolean var2, boolean var3, int var4, int var5, int var6) {
      if (var1 == this.field_771.method_656() && var4 == this.field_775 && var5 == this.field_795 && var3 == ((this.field_772 & 131072) != 0)) {
         boolean var7 = this.field_771.method_657() < 49 && (this.field_772 & 4096) != 0;
         if (var2 != var7) {
            return false;
         } else {
            if (var6 == 0) {
               if (this.field_793 != 0) {
                  return false;
               }
            } else if (var1.method_274(var6) == this.field_793) {
               int var8 = var6 + 2;

               for(int var9 = 0; var9 < this.field_793; ++var9) {
                  if (var1.method_274(var8) != this.field_794[var9]) {
                     return false;
                  }

                  var8 += 2;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   void method_571(int var1, int var2) {
      this.field_821 = var1 + 6;
      this.field_822 = var2 - 6;
   }

   int method_572() {
      if (this.field_821 != 0) {
         return 6 + this.field_822;
      } else {
         int var1 = 8;
         if (this.field_779.field_131 > 0) {
            if (this.field_779.field_131 > 65535) {
               throw new Class_90(this.field_771.method_658(), this.field_774, this.field_776, this.field_779.field_131);
            }

            this.field_771.method_685("Code");
            var1 += 16 + this.field_779.field_131 + Class_67.method_228(this.field_780);
            if (this.field_789 != null) {
               boolean var2 = this.field_771.method_657() >= 50;
               this.field_771.method_685(var2 ? "StackMapTable" : "StackMap");
               var1 += 8 + this.field_789.field_131;
            }

            if (this.field_783 != null) {
               this.field_771.method_685("LineNumberTable");
               var1 += 8 + this.field_783.field_131;
            }

            if (this.field_785 != null) {
               this.field_771.method_685("LocalVariableTable");
               var1 += 8 + this.field_785.field_131;
            }

            if (this.field_787 != null) {
               this.field_771.method_685("LocalVariableTypeTable");
               var1 += 8 + this.field_787.field_131;
            }

            if (this.field_790 != null) {
               var1 += this.field_790.method_56("RuntimeVisibleTypeAnnotations");
            }

            if (this.field_791 != null) {
               var1 += this.field_791.method_56("RuntimeInvisibleTypeAnnotations");
            }

            if (this.field_792 != null) {
               var1 += this.field_792.method_332(this.field_771, this.field_779.field_130, this.field_779.field_131, this.field_777, this.field_778);
            }
         }

         if (this.field_793 > 0) {
            this.field_771.method_685("Exceptions");
            var1 += 8 + 2 * this.field_793;
         }

         var1 += Class_98.method_333(this.field_771, this.field_772, this.field_795);
         var1 += Class_34.method_57(this.field_796, this.field_797, this.field_802, this.field_803);
         if (this.field_799 != null) {
            var1 += Class_34.method_60("RuntimeVisibleParameterAnnotations", this.field_799, this.field_798 == 0 ? this.field_799.length : this.field_798);
         }

         if (this.field_801 != null) {
            var1 += Class_34.method_60("RuntimeInvisibleParameterAnnotations", this.field_801, this.field_800 == 0 ? this.field_801.length : this.field_800);
         }

         if (this.field_804 != null) {
            this.field_771.method_685("AnnotationDefault");
            var1 += 6 + this.field_804.field_131;
         }

         if (this.field_806 != null) {
            this.field_771.method_685("MethodParameters");
            var1 += 7 + this.field_806.field_131;
         }

         if (this.field_807 != null) {
            var1 += this.field_807.method_331(this.field_771);
         }

         return var1;
      }
   }

   void method_573(Class_25 var1) {
      boolean var2 = this.field_771.method_657() < 49;
      int var3 = var2 ? 4096 : 0;
      var1.method_24(this.field_772 & ~var3).method_24(this.field_773).method_24(this.field_775);
      if (this.field_821 != 0) {
         var1.method_32(this.field_771.method_656().field_623, this.field_821, this.field_822);
      } else {
         int var4 = 0;
         if (this.field_779.field_131 > 0) {
            ++var4;
         }

         if (this.field_793 > 0) {
            ++var4;
         }

         if ((this.field_772 & 4096) != 0 && var2) {
            ++var4;
         }

         if (this.field_795 != 0) {
            ++var4;
         }

         if ((this.field_772 & 131072) != 0) {
            ++var4;
         }

         if (this.field_796 != null) {
            ++var4;
         }

         if (this.field_797 != null) {
            ++var4;
         }

         if (this.field_799 != null) {
            ++var4;
         }

         if (this.field_801 != null) {
            ++var4;
         }

         if (this.field_802 != null) {
            ++var4;
         }

         if (this.field_803 != null) {
            ++var4;
         }

         if (this.field_804 != null) {
            ++var4;
         }

         if (this.field_806 != null) {
            ++var4;
         }

         if (this.field_807 != null) {
            var4 += this.field_807.method_330();
         }

         var1.method_24(var4);
         int var6;
         if (this.field_779.field_131 > 0) {
            int var5 = 10 + this.field_779.field_131 + Class_67.method_228(this.field_780);
            var6 = 0;
            if (this.field_789 != null) {
               var5 += 8 + this.field_789.field_131;
               ++var6;
            }

            if (this.field_783 != null) {
               var5 += 8 + this.field_783.field_131;
               ++var6;
            }

            if (this.field_785 != null) {
               var5 += 8 + this.field_785.field_131;
               ++var6;
            }

            if (this.field_787 != null) {
               var5 += 8 + this.field_787.field_131;
               ++var6;
            }

            if (this.field_790 != null) {
               var5 += this.field_790.method_56("RuntimeVisibleTypeAnnotations");
               ++var6;
            }

            if (this.field_791 != null) {
               var5 += this.field_791.method_56("RuntimeInvisibleTypeAnnotations");
               ++var6;
            }

            if (this.field_792 != null) {
               var5 += this.field_792.method_332(this.field_771, this.field_779.field_130, this.field_779.field_131, this.field_777, this.field_778);
               var6 += this.field_792.method_330();
            }

            var1.method_24(this.field_771.method_685("Code")).method_27(var5).method_24(this.field_777).method_24(this.field_778).method_27(this.field_779.field_131).method_32(this.field_779.field_130, 0, this.field_779.field_131);
            Class_67.method_229(this.field_780, var1);
            var1.method_24(var6);
            if (this.field_789 != null) {
               boolean var7 = this.field_771.method_657() >= 50;
               var1.method_24(this.field_771.method_685(var7 ? "StackMapTable" : "StackMap")).method_27(2 + this.field_789.field_131).method_24(this.field_788).method_32(this.field_789.field_130, 0, this.field_789.field_131);
            }

            if (this.field_783 != null) {
               var1.method_24(this.field_771.method_685("LineNumberTable")).method_27(2 + this.field_783.field_131).method_24(this.field_782).method_32(this.field_783.field_130, 0, this.field_783.field_131);
            }

            if (this.field_785 != null) {
               var1.method_24(this.field_771.method_685("LocalVariableTable")).method_27(2 + this.field_785.field_131).method_24(this.field_784).method_32(this.field_785.field_130, 0, this.field_785.field_131);
            }

            if (this.field_787 != null) {
               var1.method_24(this.field_771.method_685("LocalVariableTypeTable")).method_27(2 + this.field_787.field_131).method_24(this.field_786).method_32(this.field_787.field_130, 0, this.field_787.field_131);
            }

            if (this.field_790 != null) {
               this.field_790.method_58(this.field_771.method_685("RuntimeVisibleTypeAnnotations"), var1);
            }

            if (this.field_791 != null) {
               this.field_791.method_58(this.field_771.method_685("RuntimeInvisibleTypeAnnotations"), var1);
            }

            if (this.field_792 != null) {
               this.field_792.method_335(this.field_771, this.field_779.field_130, this.field_779.field_131, this.field_777, this.field_778, var1);
            }
         }

         if (this.field_793 > 0) {
            var1.method_24(this.field_771.method_685("Exceptions")).method_27(2 + 2 * this.field_793).method_24(this.field_793);
            int[] var10 = this.field_794;
            var6 = var10.length;

            for(int var9 = 0; var9 < var6; ++var9) {
               int var8 = var10[var9];
               var1.method_24(var8);
            }
         }

         Class_98.method_336(this.field_771, this.field_772, this.field_795, var1);
         Class_34.method_59(this.field_771, this.field_796, this.field_797, this.field_802, this.field_803, var1);
         if (this.field_799 != null) {
            Class_34.method_61(this.field_771.method_685("RuntimeVisibleParameterAnnotations"), this.field_799, this.field_798 == 0 ? this.field_799.length : this.field_798, var1);
         }

         if (this.field_801 != null) {
            Class_34.method_61(this.field_771.method_685("RuntimeInvisibleParameterAnnotations"), this.field_801, this.field_800 == 0 ? this.field_801.length : this.field_800, var1);
         }

         if (this.field_804 != null) {
            var1.method_24(this.field_771.method_685("AnnotationDefault")).method_27(this.field_804.field_131).method_32(this.field_804.field_130, 0, this.field_804.field_131);
         }

         if (this.field_806 != null) {
            var1.method_24(this.field_771.method_685("MethodParameters")).method_27(1 + this.field_806.field_131).method_22(this.field_805).method_32(this.field_806.field_130, 0, this.field_806.field_131);
         }

         if (this.field_807 != null) {
            this.field_807.method_334(this.field_771, var1);
         }

      }
   }

   final void method_574(Class_11 var1) {
      var1.method_1(this.field_807);
      var1.method_1(this.field_792);
   }
}
