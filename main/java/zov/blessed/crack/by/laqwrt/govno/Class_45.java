package zov.blessed.crack.by.laqwrt.govno;

import zov.blessed.crack.by.laqwrt.Class_63;

class Class_45 {
   static final int field_183 = 0;
   static final int field_184 = 64;
   static final int field_185 = 128;
   static final int field_186 = 247;
   static final int field_187 = 248;
   static final int field_188 = 251;
   static final int field_189 = 252;
   static final int field_190 = 255;
   static final int field_191 = 0;
   static final int field_192 = 1;
   static final int field_193 = 2;
   static final int field_194 = 3;
   static final int field_195 = 4;
   static final int field_196 = 5;
   static final int field_197 = 6;
   static final int field_198 = 7;
   static final int field_199 = 8;
   private static final int field_200 = 9;
   private static final int field_201 = 10;
   private static final int field_202 = 11;
   private static final int field_203 = 12;
   private static final int field_204 = 6;
   private static final int field_205 = 4;
   private static final int field_206 = 2;
   private static final int field_207 = 20;
   private static final int field_208 = 26;
   private static final int field_209 = 22;
   private static final int field_210 = 20;
   private static final int field_211 = -67108864;
   private static final int field_212 = 62914560;
   private static final int field_213 = 1048575;
   private static final int field_214 = 67108864;
   private static final int field_215 = -67108864;
   private static final int field_216 = 4194304;
   private static final int field_217 = 8388608;
   private static final int field_218 = 12582912;
   private static final int field_219 = 16777216;
   private static final int field_220 = 20971520;
   private static final int field_221 = 1048576;
   private static final int field_222 = 4194304;
   private static final int field_223 = 4194313;
   private static final int field_224 = 4194314;
   private static final int field_225 = 4194315;
   private static final int field_226 = 4194316;
   private static final int field_227 = 4194305;
   private static final int field_228 = 4194306;
   private static final int field_229 = 4194308;
   private static final int field_230 = 4194307;
   private static final int field_231 = 4194309;
   private static final int field_232 = 4194310;
   Class_262 field_233;
   private int[] field_234;
   private int[] field_235;
   private int[] field_236;
   private int[] field_237;
   private short field_238;
   private short field_239;
   private int field_240;
   private int[] field_241;

   Class_45(Class_262 var1) {
      this.field_233 = var1;
   }

   final void method_96(Class_45 var1) {
      this.field_234 = var1.field_234;
      this.field_235 = var1.field_235;
      this.field_238 = 0;
      this.field_236 = var1.field_236;
      this.field_237 = var1.field_237;
      this.field_239 = var1.field_239;
      this.field_240 = var1.field_240;
      this.field_241 = var1.field_241;
   }

   static int method_97(Class_170 var0, Object var1) {
      if (var1 instanceof Integer) {
         return 4194304 | (Integer)var1;
      } else if (var1 instanceof String) {
         String var2 = Class_260.method_1193((String)var1).method_1207();
         return method_99(var0, var2, 0);
      } else {
         return 12582912 | var0.method_702("", ((Class_262)var1).field_1264);
      }
   }

   static int method_98(Class_170 var0, String var1) {
      return 8388608 | var0.method_701(var1);
   }

   private static int method_99(Class_170 var0, String var1, int var2) {
      String var3;
      switch(var1.charAt(var2)) {
      case 'B':
      case 'C':
      case 'I':
      case 'S':
      case 'Z':
         return 4194305;
      case 'D':
         return 4194307;
      case 'E':
      case 'G':
      case 'H':
      case 'K':
      case 'M':
      case 'N':
      case 'O':
      case 'P':
      case 'Q':
      case 'R':
      case 'T':
      case 'U':
      case 'W':
      case 'X':
      case 'Y':
      default:
         throw new IllegalArgumentException();
      case 'F':
         return 4194306;
      case 'J':
         return 4194308;
      case 'L':
         var3 = var1.substring(var2 + 1, var1.length() - 1);
         return 8388608 | var0.method_701(var3);
      case 'V':
         return 0;
      case '[':
         int var4;
         for(var4 = var2 + 1; var1.charAt(var4) == '['; ++var4) {
         }

         int var5;
         switch(var1.charAt(var4)) {
         case 'B':
            var5 = 4194314;
            break;
         case 'C':
            var5 = 4194315;
            break;
         case 'D':
            var5 = 4194307;
            break;
         case 'E':
         case 'G':
         case 'H':
         case 'K':
         case 'M':
         case 'N':
         case 'O':
         case 'P':
         case 'Q':
         case 'R':
         case 'T':
         case 'U':
         case 'V':
         case 'W':
         case 'X':
         case 'Y':
         default:
            throw new IllegalArgumentException();
         case 'F':
            var5 = 4194306;
            break;
         case 'I':
            var5 = 4194305;
            break;
         case 'J':
            var5 = 4194308;
            break;
         case 'L':
            var3 = var1.substring(var4 + 1, var1.length() - 1);
            var5 = 8388608 | var0.method_701(var3);
            break;
         case 'S':
            var5 = 4194316;
            break;
         case 'Z':
            var5 = 4194313;
         }

         return var4 - var2 << 26 | var5;
      }
   }

   final void method_100(Class_170 var1, int var2, String var3, int var4) {
      this.field_234 = new int[var4];
      this.field_235 = new int[0];
      int var5 = 0;
      if ((var2 & 8) == 0) {
         if ((var2 & 262144) == 0) {
            this.field_234[var5++] = 8388608 | var1.method_701(var1.method_658());
         } else {
            this.field_234[var5++] = 4194310;
         }
      }

      Class_260[] var6 = Class_260.method_1197(var3);
      int var7 = var6.length;

      for(int var8 = 0; var8 < var7; ++var8) {
         Class_260 var9 = var6[var8];
         int var10 = method_99(var1, var9.method_1207(), 0);
         this.field_234[var5++] = var10;
         if (var10 == 4194308 || var10 == 4194307) {
            this.field_234[var5++] = 4194304;
         }
      }

      while(var5 < var4) {
         this.field_234[var5++] = 4194304;
      }

   }

   final void method_101(Class_170 var1, int var2, Object[] var3, int var4, Object[] var5) {
      int var6 = 0;

      int var7;
      for(var7 = 0; var7 < var2; ++var7) {
         this.field_234[var6++] = method_97(var1, var3[var7]);
         if (var3[var7] == Class_63.field_428 || var3[var7] == Class_63.field_427) {
            this.field_234[var6++] = 4194304;
         }
      }

      while(var6 < this.field_234.length) {
         this.field_234[var6++] = 4194304;
      }

      var7 = 0;

      int var8;
      for(var8 = 0; var8 < var4; ++var8) {
         if (var5[var8] == Class_63.field_428 || var5[var8] == Class_63.field_427) {
            ++var7;
         }
      }

      this.field_235 = new int[var4 + var7];
      var8 = 0;

      for(int var9 = 0; var9 < var4; ++var9) {
         this.field_235[var8++] = method_97(var1, var5[var9]);
         if (var5[var9] == Class_63.field_428 || var5[var9] == Class_63.field_427) {
            this.field_235[var8++] = 4194304;
         }
      }

      this.field_239 = 0;
      this.field_240 = 0;
   }

   final int method_102() {
      return this.field_235.length;
   }

   private int method_103(int var1) {
      if (this.field_236 != null && var1 < this.field_236.length) {
         int var2 = this.field_236[var1];
         if (var2 == 0) {
            var2 = this.field_236[var1] = 16777216 | var1;
         }

         return var2;
      } else {
         return 16777216 | var1;
      }
   }

   private void method_104(int var1, int var2) {
      if (this.field_236 == null) {
         this.field_236 = new int[10];
      }

      int var3 = this.field_236.length;
      if (var1 >= var3) {
         int[] var4 = new int[Math.max(var1 + 1, 2 * var3)];
         System.arraycopy(this.field_236, 0, var4, 0, var3);
         this.field_236 = var4;
      }

      this.field_236[var1] = var2;
   }

   private void method_105(int var1) {
      if (this.field_237 == null) {
         this.field_237 = new int[10];
      }

      int var2 = this.field_237.length;
      if (this.field_239 >= var2) {
         int[] var3 = new int[Math.max(this.field_239 + 1, 2 * var2)];
         System.arraycopy(this.field_237, 0, var3, 0, var2);
         this.field_237 = var3;
      }

      int[] var10000 = this.field_237;
      short var10003 = this.field_239;
      this.field_239 = (short)(var10003 + 1);
      var10000[var10003] = var1;
      short var4 = (short)(this.field_238 + this.field_239);
      if (var4 > this.field_233.field_1268) {
         this.field_233.field_1268 = var4;
      }

   }

   private void method_106(Class_170 var1, String var2) {
      int var3 = var2.charAt(0) == '(' ? Class_260.method_1202(var2) : 0;
      int var4 = method_99(var1, var2, var3);
      if (var4 != 0) {
         this.method_105(var4);
         if (var4 == 4194308 || var4 == 4194307) {
            this.method_105(4194304);
         }
      }

   }

   private int method_107() {
      return this.field_239 > 0 ? this.field_237[--this.field_239] : 20971520 | -(--this.field_238);
   }

   private void method_108(int var1) {
      if (this.field_239 >= var1) {
         this.field_239 = (short)(this.field_239 - var1);
      } else {
         this.field_238 = (short)(this.field_238 - (var1 - this.field_239));
         this.field_239 = 0;
      }

   }

   private void method_109(String var1) {
      char var2 = var1.charAt(0);
      if (var2 == '(') {
         this.method_108((Class_260.method_1218(var1) >> 2) - 1);
      } else if (var2 != 'J' && var2 != 'D') {
         this.method_108(1);
      } else {
         this.method_108(2);
      }

   }

   private void method_110(int var1) {
      if (this.field_241 == null) {
         this.field_241 = new int[2];
      }

      int var2 = this.field_241.length;
      if (this.field_240 >= var2) {
         int[] var3 = new int[Math.max(this.field_240 + 1, 2 * var2)];
         System.arraycopy(this.field_241, 0, var3, 0, var2);
         this.field_241 = var3;
      }

      this.field_241[this.field_240++] = var1;
   }

   private int method_111(Class_170 var1, int var2) {
      if (var2 == 4194310 || (var2 & -4194304) == 12582912) {
         for(int var3 = 0; var3 < this.field_240; ++var3) {
            int var4 = this.field_241[var3];
            int var5 = var4 & -67108864;
            int var6 = var4 & 62914560;
            int var7 = var4 & 1048575;
            if (var6 == 16777216) {
               var4 = var5 + this.field_234[var7];
            } else if (var6 == 20971520) {
               var4 = var5 + this.field_235[this.field_235.length - var7];
            }

            if (var2 == var4) {
               if (var2 == 4194310) {
                  return 8388608 | var1.method_701(var1.method_658());
               }

               return 8388608 | var1.method_701(var1.method_700(var2 & 1048575).field_963);
            }
         }
      }

      return var2;
   }

   void method_112(int var1, int var2, Class_179 var3, Class_170 var4) {
      int var5;
      int var6;
      int var7;
      int var11;
      switch(var1) {
      case 0:
      case 116:
      case 117:
      case 118:
      case 119:
      case 145:
      case 146:
      case 147:
      case 167:
      case 177:
         break;
      case 1:
         this.method_105(4194309);
         break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 16:
      case 17:
      case 21:
         this.method_105(4194305);
         break;
      case 9:
      case 10:
      case 22:
         this.method_105(4194308);
         this.method_105(4194304);
         break;
      case 11:
      case 12:
      case 13:
      case 23:
         this.method_105(4194306);
         break;
      case 14:
      case 15:
      case 24:
         this.method_105(4194307);
         this.method_105(4194304);
         break;
      case 18:
         switch(var3.field_960) {
         case 3:
            this.method_105(4194305);
            return;
         case 4:
            this.method_105(4194306);
            return;
         case 5:
            this.method_105(4194308);
            this.method_105(4194304);
            return;
         case 6:
            this.method_105(4194307);
            this.method_105(4194304);
            return;
         case 7:
            this.method_105(8388608 | var4.method_701("java/lang/Class"));
            return;
         case 8:
            this.method_105(8388608 | var4.method_701("java/lang/String"));
            return;
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         default:
            throw new AssertionError();
         case 15:
            this.method_105(8388608 | var4.method_701("java/lang/invoke/MethodHandle"));
            return;
         case 16:
            this.method_105(8388608 | var4.method_701("java/lang/invoke/MethodType"));
            return;
         case 17:
            this.method_106(var4, var3.field_963);
            return;
         }
      case 19:
      case 20:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      case 33:
      case 34:
      case 35:
      case 36:
      case 37:
      case 38:
      case 39:
      case 40:
      case 41:
      case 42:
      case 43:
      case 44:
      case 45:
      case 59:
      case 60:
      case 61:
      case 62:
      case 63:
      case 64:
      case 65:
      case 66:
      case 67:
      case 68:
      case 69:
      case 70:
      case 71:
      case 72:
      case 73:
      case 74:
      case 75:
      case 76:
      case 77:
      case 78:
      case 196:
      default:
         throw new IllegalArgumentException();
      case 25:
         this.method_105(this.method_103(var2));
         break;
      case 46:
      case 51:
      case 52:
      case 53:
      case 96:
      case 100:
      case 104:
      case 108:
      case 112:
      case 120:
      case 122:
      case 124:
      case 126:
      case 128:
      case 130:
      case 136:
      case 142:
      case 149:
      case 150:
         this.method_108(2);
         this.method_105(4194305);
         break;
      case 47:
      case 143:
         this.method_108(2);
         this.method_105(4194308);
         this.method_105(4194304);
         break;
      case 48:
      case 98:
      case 102:
      case 106:
      case 110:
      case 114:
      case 137:
      case 144:
         this.method_108(2);
         this.method_105(4194306);
         break;
      case 49:
      case 138:
         this.method_108(2);
         this.method_105(4194307);
         this.method_105(4194304);
         break;
      case 50:
         this.method_108(1);
         var5 = this.method_107();
         this.method_105(var5 == 4194309 ? var5 : -67108864 + var5);
         break;
      case 54:
      case 56:
      case 58:
         var5 = this.method_107();
         this.method_104(var2, var5);
         if (var2 > 0) {
            var11 = this.method_103(var2 - 1);
            if (var11 != 4194308 && var11 != 4194307) {
               if ((var11 & 62914560) == 16777216 || (var11 & 62914560) == 20971520) {
                  this.method_104(var2 - 1, var11 | 1048576);
               }
            } else {
               this.method_104(var2 - 1, 4194304);
            }
         }
         break;
      case 55:
      case 57:
         this.method_108(1);
         var5 = this.method_107();
         this.method_104(var2, var5);
         this.method_104(var2 + 1, 4194304);
         if (var2 > 0) {
            var11 = this.method_103(var2 - 1);
            if (var11 != 4194308 && var11 != 4194307) {
               if ((var11 & 62914560) == 16777216 || (var11 & 62914560) == 20971520) {
                  this.method_104(var2 - 1, var11 | 1048576);
               }
            } else {
               this.method_104(var2 - 1, 4194304);
            }
         }
         break;
      case 79:
      case 81:
      case 83:
      case 84:
      case 85:
      case 86:
         this.method_108(3);
         break;
      case 80:
      case 82:
         this.method_108(4);
         break;
      case 87:
      case 153:
      case 154:
      case 155:
      case 156:
      case 157:
      case 158:
      case 170:
      case 171:
      case 172:
      case 174:
      case 176:
      case 191:
      case 194:
      case 195:
      case 198:
      case 199:
         this.method_108(1);
         break;
      case 88:
      case 159:
      case 160:
      case 161:
      case 162:
      case 163:
      case 164:
      case 165:
      case 166:
      case 173:
      case 175:
         this.method_108(2);
         break;
      case 89:
         var5 = this.method_107();
         this.method_105(var5);
         this.method_105(var5);
         break;
      case 90:
         var5 = this.method_107();
         var6 = this.method_107();
         this.method_105(var5);
         this.method_105(var6);
         this.method_105(var5);
         break;
      case 91:
         var5 = this.method_107();
         var6 = this.method_107();
         var7 = this.method_107();
         this.method_105(var5);
         this.method_105(var7);
         this.method_105(var6);
         this.method_105(var5);
         break;
      case 92:
         var5 = this.method_107();
         var6 = this.method_107();
         this.method_105(var6);
         this.method_105(var5);
         this.method_105(var6);
         this.method_105(var5);
         break;
      case 93:
         var5 = this.method_107();
         var6 = this.method_107();
         var7 = this.method_107();
         this.method_105(var6);
         this.method_105(var5);
         this.method_105(var7);
         this.method_105(var6);
         this.method_105(var5);
         break;
      case 94:
         var5 = this.method_107();
         var6 = this.method_107();
         var7 = this.method_107();
         int var8 = this.method_107();
         this.method_105(var6);
         this.method_105(var5);
         this.method_105(var8);
         this.method_105(var7);
         this.method_105(var6);
         this.method_105(var5);
         break;
      case 95:
         var5 = this.method_107();
         var6 = this.method_107();
         this.method_105(var5);
         this.method_105(var6);
         break;
      case 97:
      case 101:
      case 105:
      case 109:
      case 113:
      case 127:
      case 129:
      case 131:
         this.method_108(4);
         this.method_105(4194308);
         this.method_105(4194304);
         break;
      case 99:
      case 103:
      case 107:
      case 111:
      case 115:
         this.method_108(4);
         this.method_105(4194307);
         this.method_105(4194304);
         break;
      case 121:
      case 123:
      case 125:
         this.method_108(3);
         this.method_105(4194308);
         this.method_105(4194304);
         break;
      case 132:
         this.method_104(var2, 4194305);
         break;
      case 133:
      case 140:
         this.method_108(1);
         this.method_105(4194308);
         this.method_105(4194304);
         break;
      case 134:
         this.method_108(1);
         this.method_105(4194306);
         break;
      case 135:
      case 141:
         this.method_108(1);
         this.method_105(4194307);
         this.method_105(4194304);
         break;
      case 139:
      case 190:
      case 193:
         this.method_108(1);
         this.method_105(4194305);
         break;
      case 148:
      case 151:
      case 152:
         this.method_108(4);
         this.method_105(4194305);
         break;
      case 168:
      case 169:
         throw new IllegalArgumentException("JSR/RET are not supported with computeFrames option");
      case 178:
         this.method_106(var4, var3.field_963);
         break;
      case 179:
         this.method_109(var3.field_963);
         break;
      case 180:
         this.method_108(1);
         this.method_106(var4, var3.field_963);
         break;
      case 181:
         this.method_109(var3.field_963);
         this.method_107();
         break;
      case 182:
      case 183:
      case 184:
      case 185:
         this.method_109(var3.field_963);
         if (var1 != 184) {
            var5 = this.method_107();
            if (var1 == 183 && var3.field_962.charAt(0) == '<') {
               this.method_110(var5);
            }
         }

         this.method_106(var4, var3.field_963);
         break;
      case 186:
         this.method_109(var3.field_963);
         this.method_106(var4, var3.field_963);
         break;
      case 187:
         this.method_105(12582912 | var4.method_702(var3.field_963, var2));
         break;
      case 188:
         this.method_107();
         switch(var2) {
         case 4:
            this.method_105(71303177);
            return;
         case 5:
            this.method_105(71303179);
            return;
         case 6:
            this.method_105(71303170);
            return;
         case 7:
            this.method_105(71303171);
            return;
         case 8:
            this.method_105(71303178);
            return;
         case 9:
            this.method_105(71303180);
            return;
         case 10:
            this.method_105(71303169);
            return;
         case 11:
            this.method_105(71303172);
            return;
         default:
            throw new IllegalArgumentException();
         }
      case 189:
         String var9 = var3.field_963;
         this.method_107();
         if (var9.charAt(0) == '[') {
            this.method_106(var4, '[' + var9);
         } else {
            this.method_105(75497472 | var4.method_701(var9));
         }
         break;
      case 192:
         String var10 = var3.field_963;
         this.method_107();
         if (var10.charAt(0) == '[') {
            this.method_106(var4, var10);
         } else {
            this.method_105(8388608 | var4.method_701(var10));
         }
         break;
      case 197:
         this.method_108(var2);
         this.method_106(var4, var3.field_963);
      }

   }

   private int method_113(int var1, int var2) {
      int var3 = var1 & -67108864;
      int var4 = var1 & 62914560;
      int var5;
      if (var4 == 16777216) {
         var5 = var3 + this.field_234[var1 & 1048575];
         if ((var1 & 1048576) != 0 && (var5 == 4194308 || var5 == 4194307)) {
            var5 = 4194304;
         }

         return var5;
      } else if (var4 != 20971520) {
         return var1;
      } else {
         var5 = var3 + this.field_235[var2 - (var1 & 1048575)];
         if ((var1 & 1048576) != 0 && (var5 == 4194308 || var5 == 4194307)) {
            var5 = 4194304;
         }

         return var5;
      }
   }

   final boolean method_114(Class_170 var1, Class_45 var2, int var3) {
      boolean var4 = false;
      int var5 = this.field_234.length;
      int var6 = this.field_235.length;
      if (var2.field_234 == null) {
         var2.field_234 = new int[var5];
         var4 = true;
      }

      int var7;
      int var8;
      int var9;
      for(var7 = 0; var7 < var5; ++var7) {
         if (this.field_236 != null && var7 < this.field_236.length) {
            var9 = this.field_236[var7];
            if (var9 == 0) {
               var8 = this.field_234[var7];
            } else {
               var8 = this.method_113(var9, var6);
            }
         } else {
            var8 = this.field_234[var7];
         }

         if (this.field_241 != null) {
            var8 = this.method_111(var1, var8);
         }

         var4 |= method_115(var1, var8, var2.field_234, var7);
      }

      if (var3 <= 0) {
         var7 = this.field_235.length + this.field_238;
         if (var2.field_235 == null) {
            var2.field_235 = new int[var7 + this.field_239];
            var4 = true;
         }

         for(var8 = 0; var8 < var7; ++var8) {
            var9 = this.field_235[var8];
            if (this.field_241 != null) {
               var9 = this.method_111(var1, var9);
            }

            var4 |= method_115(var1, var9, var2.field_235, var8);
         }

         for(var8 = 0; var8 < this.field_239; ++var8) {
            var9 = this.field_237[var8];
            int var10 = this.method_113(var9, var6);
            if (this.field_241 != null) {
               var10 = this.method_111(var1, var10);
            }

            var4 |= method_115(var1, var10, var2.field_235, var7 + var8);
         }

         return var4;
      } else {
         for(var7 = 0; var7 < var5; ++var7) {
            var4 |= method_115(var1, this.field_234[var7], var2.field_234, var7);
         }

         if (var2.field_235 == null) {
            var2.field_235 = new int[1];
            var4 = true;
         }

         var4 |= method_115(var1, var3, var2.field_235, 0);
         return var4;
      }
   }

   private static boolean method_115(Class_170 var0, int var1, int[] var2, int var3) {
      int var4 = var2[var3];
      if (var4 == var1) {
         return false;
      } else {
         int var5 = var1;
         if ((var1 & 67108863) == 4194309) {
            if (var4 == 4194309) {
               return false;
            }

            var5 = 4194309;
         }

         if (var4 == 0) {
            var2[var3] = var5;
            return true;
         } else {
            int var6;
            if ((var4 & -67108864) == 0 && (var4 & 62914560) != 8388608) {
               if (var4 == 4194309) {
                  var6 = (var5 & -67108864) == 0 && (var5 & 62914560) != 8388608 ? 4194304 : var5;
               } else {
                  var6 = 4194304;
               }
            } else {
               if (var5 == 4194309) {
                  return false;
               }

               int var7;
               if ((var5 & -4194304) == (var4 & -4194304)) {
                  if ((var4 & 62914560) == 8388608) {
                     var6 = var5 & -67108864 | 8388608 | var0.method_703(var5 & 1048575, var4 & 1048575);
                  } else {
                     var7 = -67108864 + (var5 & -67108864);
                     var6 = var7 | 8388608 | var0.method_701("java/lang/Object");
                  }
               } else if ((var5 & -67108864) == 0 && (var5 & 62914560) != 8388608) {
                  var6 = 4194304;
               } else {
                  var7 = var5 & -67108864;
                  if (var7 != 0 && (var5 & 62914560) != 8388608) {
                     var7 += -67108864;
                  }

                  int var8 = var4 & -67108864;
                  if (var8 != 0 && (var4 & 62914560) != 8388608) {
                     var8 += -67108864;
                  }

                  var6 = Math.min(var7, var8) | 8388608 | var0.method_701("java/lang/Object");
               }
            }

            if (var6 != var4) {
               var2[var3] = var6;
               return true;
            } else {
               return false;
            }
         }
      }
   }

   final void method_116(Class_156 var1) {
      int[] var2 = this.field_234;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;

      while(var5 < var2.length) {
         int var6 = var2[var5];
         var5 += var6 != 4194308 && var6 != 4194307 ? 1 : 2;
         if (var6 == 4194304) {
            ++var4;
         } else {
            var3 += var4 + 1;
            var4 = 0;
         }
      }

      int[] var10 = this.field_235;
      int var7 = 0;

      int var8;
      for(var5 = 0; var5 < var10.length; ++var7) {
         var8 = var10[var5];
         var5 += var8 != 4194308 && var8 != 4194307 ? 1 : 2;
      }

      var8 = var1.method_564(this.field_233.field_1264, var3, var7);
      var5 = 0;

      int var9;
      while(var3-- > 0) {
         var9 = var2[var5];
         var5 += var9 != 4194308 && var9 != 4194307 ? 1 : 2;
         var1.method_565(var8++, var9);
      }

      var5 = 0;

      while(var7-- > 0) {
         var9 = var10[var5];
         var5 += var9 != 4194308 && var9 != 4194307 ? 1 : 2;
         var1.method_565(var8++, var9);
      }

      var1.method_566();
   }

   static void method_117(Class_170 var0, int var1, Class_25 var2) {
      int var3 = (var1 & -67108864) >> 26;
      if (var3 == 0) {
         int var4 = var1 & 1048575;
         switch(var1 & 62914560) {
         case 4194304:
            var2.method_22(var4);
            break;
         case 8388608:
            var2.method_22(7).method_24(var0.method_669(var0.method_700(var4).field_963).field_959);
            break;
         case 12582912:
            var2.method_22(8).method_24((int)var0.method_700(var4).field_964);
            break;
         default:
            throw new AssertionError();
         }
      } else {
         StringBuilder var5 = new StringBuilder();

         while(var3-- > 0) {
            var5.append('[');
         }

         if ((var1 & 62914560) == 8388608) {
            var5.append('L').append(var0.method_700(var1 & 1048575).field_963).append(';');
         } else {
            switch(var1 & 1048575) {
            case 1:
               var5.append('I');
               break;
            case 2:
               var5.append('F');
               break;
            case 3:
               var5.append('D');
               break;
            case 4:
               var5.append('J');
               break;
            case 5:
            case 6:
            case 7:
            case 8:
            default:
               throw new AssertionError();
            case 9:
               var5.append('Z');
               break;
            case 10:
               var5.append('B');
               break;
            case 11:
               var5.append('C');
               break;
            case 12:
               var5.append('S');
            }
         }

         var2.method_22(7).method_24(var0.method_669(var5.toString()).field_959);
      }

   }
}
