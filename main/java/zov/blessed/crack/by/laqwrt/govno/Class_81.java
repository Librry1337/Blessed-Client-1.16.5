package zov.blessed.crack.by.laqwrt.govno;

import zov.blessed.crack.by.laqwrt.Class_206;
import zov.blessed.crack.by.laqwrt.Class_63;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Class_81 {
   public static int field_614 = 1;
   public static int field_615 = 2;
   public static int field_616 = 4;
   public static int field_617 = 8;
   static int field_618 = 256;
   private static int field_619 = 1048576;
   private static int field_620 = 4096;
   /** @deprecated */
   @Deprecated
   public final byte[] field_621;
   public final int field_622;
   final byte[] field_623;
   private final int[] field_624;
   private final String[] field_625;
   private final Class_242[] field_626;
   private final int[] field_627;
   private final int field_628;

   public Class_81(byte[] var1) {
      this(var1, 0, var1.length);
   }

   public Class_81(byte[] var1, int var2, int var3) {
      this(var1, var2, true);
   }

   Class_81(byte[] var1, int var2, boolean var3) {
      this.field_623 = var1;
      this.field_621 = var1;
      if (var3 && this.method_275(var2 + 6) > 62) {
         throw new IllegalArgumentException("Unsupported class file major version " + this.method_275(var2 + 6));
      } else {
         int var4 = this.method_274(var2 + 8);
         this.field_624 = new int[var4];
         this.field_625 = new String[var4];
         int var5 = 1;
         int var6 = var2 + 10;
         int var7 = 0;
         boolean var8 = false;

         boolean var9;
         int var10;
         for(var9 = false; var5 < var4; var6 += var10) {
            this.field_624[var5++] = var6 + 1;
            switch(var1[var6]) {
            case 1:
               var10 = 3 + this.method_274(var6 + 1);
               if (var10 > var7) {
                  var7 = var10;
               }
               break;
            case 2:
            case 13:
            case 14:
            default:
               throw new IllegalArgumentException();
            case 3:
            case 4:
            case 9:
            case 10:
            case 11:
            case 12:
               var10 = 5;
               break;
            case 5:
            case 6:
               var10 = 9;
               ++var5;
               break;
            case 7:
            case 8:
            case 16:
            case 19:
            case 20:
               var10 = 3;
               break;
            case 15:
               var10 = 4;
               break;
            case 17:
               var10 = 5;
               var8 = true;
               var9 = true;
               break;
            case 18:
               var10 = 5;
               var8 = true;
            }
         }

         this.field_628 = var7;
         this.field_622 = var6;
         this.field_626 = var9 ? new Class_242[var4] : null;
         this.field_627 = var8 ? this.method_268(var7) : null;
      }
   }

   public Class_81(InputStream var1) throws IOException {
      this(method_242(var1, false));
   }

   public Class_81(String var1) throws IOException {
      this(method_242(ClassLoader.getSystemResourceAsStream(var1.replace('.', '/') + ".class"), true));
   }

   private static byte[] method_242(InputStream var0, boolean var1) throws IOException {
      if (var0 == null) {
         throw new IOException("Class not found");
      } else {
         int var2 = method_243(var0);

         try {
            ByteArrayOutputStream var3;
            byte[] var7;
            label146: {
               var3 = new ByteArrayOutputStream();

               try {
                  byte[] var4 = new byte[var2];

                  int var5;
                  int var6;
                  for(var6 = 0; (var5 = var0.read(var4, 0, var2)) != -1; ++var6) {
                     var3.write(var4, 0, var5);
                  }

                  var3.flush();
                  if (var6 == 1) {
                     var7 = var4;
                     break label146;
                  }

                  var7 = var3.toByteArray();
               } catch (Throwable var13) {
                  try {
                     var3.close();
                  } catch (Throwable var12) {
                     var13.addSuppressed(var12);
                  }

                  throw var13;
               }

               var3.close();
               return var7;
            }

            var3.close();
            return var7;
         } finally {
            if (var1) {
               var0.close();
            }

         }
      }
   }

   private static int method_243(InputStream var0) throws IOException {
      int var1 = var0.available();
      return var1 < 256 ? 4096 : Math.min(var1, 1048576);
   }

   public int method_244() {
      return this.method_274(this.field_622);
   }

   public String method_245() {
      return this.method_282(this.field_622 + 2, new char[this.field_628]);
   }

   public String method_246() {
      return this.method_282(this.field_622 + 4, new char[this.field_628]);
   }

   public String[] method_247() {
      int var1 = this.field_622 + 6;
      int var2 = this.method_274(var1);
      String[] var3 = new String[var2];
      if (var2 > 0) {
         char[] var4 = new char[this.field_628];

         for(int var5 = 0; var5 < var2; ++var5) {
            var1 += 2;
            var3[var5] = this.method_282(var1, var4);
         }
      }

      return var3;
   }

   public void method_248(Class_181 var1, int var2) {
      this.method_249(var1, new Class_98[0], var2);
   }

   public void method_249(Class_181 var1, Class_98[] var2, int var3) {
      Class_60 var4 = new Class_60();
      var4.field_321 = var2;
      var4.field_322 = var3;
      var4.field_323 = new char[this.field_628];
      char[] var5 = var4.field_323;
      int var6 = this.field_622;
      int var7 = this.method_274(var6);
      String var8 = this.method_282(var6 + 2, var5);
      String var9 = this.method_282(var6 + 4, var5);
      String[] var10 = new String[this.method_274(var6 + 6)];
      var6 += 8;

      int var11;
      for(var11 = 0; var11 < var10.length; ++var11) {
         var10[var11] = this.method_282(var6, var5);
         var6 += 2;
      }

      var11 = 0;
      int var12 = 0;
      String var13 = null;
      String var14 = null;
      String var15 = null;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      int var20 = 0;
      int var21 = 0;
      String var22 = null;
      String var23 = null;
      int var24 = 0;
      int var25 = 0;
      int var26 = 0;
      Class_98 var27 = null;
      int var28 = this.method_267();

      int var29;
      for(var29 = this.method_274(var28 - 2); var29 > 0; --var29) {
         String var30 = this.method_278(var28, var5);
         int var31 = this.method_276(var28 + 2);
         var28 += 6;
         if ("SourceFile".equals(var30)) {
            var14 = this.method_278(var28, var5);
         } else if ("InnerClasses".equals(var30)) {
            var11 = var28;
         } else if ("EnclosingMethod".equals(var30)) {
            var12 = var28;
         } else if ("NestHost".equals(var30)) {
            var23 = this.method_282(var28, var5);
         } else if ("NestMembers".equals(var30)) {
            var24 = var28;
         } else if ("PermittedSubclasses".equals(var30)) {
            var25 = var28;
         } else if ("Signature".equals(var30)) {
            var13 = this.method_278(var28, var5);
         } else if ("RuntimeVisibleAnnotations".equals(var30)) {
            var16 = var28;
         } else if ("RuntimeVisibleTypeAnnotations".equals(var30)) {
            var18 = var28;
         } else if ("Deprecated".equals(var30)) {
            var7 |= 131072;
         } else if ("Synthetic".equals(var30)) {
            var7 |= 4096;
         } else if ("SourceDebugExtension".equals(var30)) {
            if (var31 > this.field_623.length - var28) {
               throw new IllegalArgumentException();
            }

            var15 = this.method_280(var28, var31, new char[var31]);
         } else if ("RuntimeInvisibleAnnotations".equals(var30)) {
            var17 = var28;
         } else if ("RuntimeInvisibleTypeAnnotations".equals(var30)) {
            var19 = var28;
         } else if ("Record".equals(var30)) {
            var26 = var28;
            var7 |= 65536;
         } else if ("Module".equals(var30)) {
            var20 = var28;
         } else if ("ModuleMainClass".equals(var30)) {
            var22 = this.method_282(var28, var5);
         } else if ("ModulePackages".equals(var30)) {
            var21 = var28;
         } else if (!"BootstrapMethods".equals(var30)) {
            Class_98 var32 = this.method_269(var2, var30, var28, var31, var5, -1, (Class_262[])null);
            var32.field_655 = var27;
            var27 = var32;
         }

         var28 += var31;
      }

    //  var1.method_747(this.method_276(this.field_624[1] - 7), var7, var8, var13, var9, var10);
      if ((var3 & 2) == 0 && (var14 != null || var15 != null)) {
         var1.method_748(var14, var15);
      }

      if (var20 != 0) {
         this.method_250(var1, var4, var20, var21, var22);
      }

      if (var23 != null) {
         var1.method_750(var23);
      }

      int var34;
      String var35;
      if (var12 != 0) {
         String var33 = this.method_282(var12, var5);
         var34 = this.method_274(var12 + 2);
         var35 = var34 == 0 ? null : this.method_278(this.field_624[var34], var5);
         String var36 = var34 == 0 ? null : this.method_278(this.field_624[var34] + 2, var5);
         var1.method_751(var33, var35, var36);
      }

      if (var16 != 0) {
         var29 = this.method_274(var16);

         for(var34 = var16 + 2; var29-- > 0; var34 = this.method_262(var1.method_752(var35, true), var34, true, var5)) {
            var35 = this.method_278(var34, var5);
            var34 += 2;
         }
      }

      if (var17 != 0) {
         var29 = this.method_274(var17);

         for(var34 = var17 + 2; var29-- > 0; var34 = this.method_262(var1.method_752(var35, false), var34, true, var5)) {
            var35 = this.method_278(var34, var5);
            var34 += 2;
         }
      }

      if (var18 != 0) {
         var29 = this.method_274(var18);

         for(var34 = var18 + 2; var29-- > 0; var34 = this.method_262(var1.method_753(var4.field_328, var4.field_329, var35, true), var34, true, var5)) {
            var34 = this.method_260(var4, var34);
            var35 = this.method_278(var34, var5);
            var34 += 2;
         }
      }

      if (var19 != 0) {
         var29 = this.method_274(var19);

         for(var34 = var19 + 2; var29-- > 0; var34 = this.method_262(var1.method_753(var4.field_328, var4.field_329, var35, false), var34, true, var5)) {
            var34 = this.method_260(var4, var34);
            var35 = this.method_278(var34, var5);
            var34 += 2;
         }
      }

      while(var27 != null) {
         Class_98 var37 = var27.field_655;
         var27.field_655 = null;
         var1.method_754(var27);
         var27 = var37;
      }

      if (var24 != 0) {
         var29 = this.method_274(var24);

         for(var34 = var24 + 2; var29-- > 0; var34 += 2) {
            var1.method_755(this.method_282(var34, var5));
         }
      }

      if (var25 != 0) {
         var29 = this.method_274(var25);

         for(var34 = var25 + 2; var29-- > 0; var34 += 2) {
            var1.method_756(this.method_282(var34, var5));
         }
      }

      if (var11 != 0) {
         var29 = this.method_274(var11);

         for(var34 = var11 + 2; var29-- > 0; var34 += 8) {
            var1.method_757(this.method_282(var34, var5), this.method_282(var34 + 2, var5), this.method_278(var34 + 4, var5), this.method_274(var34 + 6));
         }
      }

      if (var26 != 0) {
         var29 = this.method_274(var26);

         for(var26 += 2; var29-- > 0; var26 = this.method_251(var1, var4, var26)) {
         }
      }

      var29 = this.method_274(var6);

      for(var6 += 2; var29-- > 0; var6 = this.method_252(var1, var4, var6)) {
      }

      var34 = this.method_274(var6);

      for(var6 += 2; var34-- > 0; var6 = this.method_253(var1, var4, var6)) {
      }

      var1.method_761();
   }

   private void method_250(Class_181 var1, Class_60 var2, int var3, int var4, String var5) {
      char[] var6 = var2.field_323;
      String var8 = this.method_283(var3, var6);
      int var9 = this.method_274(var3 + 2);
      String var10 = this.method_278(var3 + 4, var6);
      int var7 = var3 + 6;
      Class_65 var11 = var1.method_749(var8, var9, var10);
      if (var11 != null) {
         if (var5 != null) {
            var11.method_218(var5);
         }

         int var12;
         int var13;
         if (var4 != 0) {
            var12 = this.method_274(var4);

            for(var13 = var4 + 2; var12-- > 0; var13 += 2) {
               var11.method_219(this.method_284(var13, var6));
            }
         }

         var12 = this.method_274(var7);
         var7 += 2;

         int var14;
         String var15;
         while(var12-- > 0) {
            String var21 = this.method_283(var7, var6);
            var14 = this.method_274(var7 + 2);
            var15 = this.method_278(var7 + 4, var6);
            var7 += 6;
            var11.method_220(var21, var14, var15);
         }

         var13 = this.method_274(var7);

         int var16;
         String[] var17;
         int var18;
         String var22;
         int var23;
         for(var7 += 2; var13-- > 0; var11.method_221(var22, var23, var17)) {
            var22 = this.method_284(var7, var6);
            var23 = this.method_274(var7 + 2);
            var16 = this.method_274(var7 + 4);
            var7 += 6;
            var17 = null;
            if (var16 != 0) {
               var17 = new String[var16];

               for(var18 = 0; var18 < var16; ++var18) {
                  var17[var18] = this.method_283(var7, var6);
                  var7 += 2;
               }
            }
         }

         var14 = this.method_274(var7);

         String[] var26;
         for(var7 += 2; var14-- > 0; var11.method_222(var15, var16, var26)) {
            var15 = this.method_284(var7, var6);
            var16 = this.method_274(var7 + 2);
            int var24 = this.method_274(var7 + 4);
            var7 += 6;
            var26 = null;
            if (var24 != 0) {
               var26 = new String[var24];

               for(int var19 = 0; var19 < var24; ++var19) {
                  var26[var19] = this.method_283(var7, var6);
                  var7 += 2;
               }
            }
         }

         var23 = this.method_274(var7);

         for(var7 += 2; var23-- > 0; var7 += 2) {
            var11.method_223(this.method_282(var7, var6));
         }

         var16 = this.method_274(var7);
         var7 += 2;

         while(var16-- > 0) {
            String var25 = this.method_282(var7, var6);
            var18 = this.method_274(var7 + 2);
            var7 += 4;
            String[] var27 = new String[var18];

            for(int var20 = 0; var20 < var18; ++var20) {
               var27[var20] = this.method_282(var7, var6);
               var7 += 2;
            }

            var11.method_224(var25, var27);
         }

         var11.method_225();
      }
   }

   private int method_251(Class_181 var1, Class_60 var2, int var3) {
      char[] var4 = var2.field_323;
      String var6 = this.method_278(var3, var4);
      String var7 = this.method_278(var3 + 2, var4);
      int var5 = var3 + 4;
      String var8 = null;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      Class_98 var13 = null;
      int var14 = this.method_274(var5);

      int var16;
      for(var5 += 2; var14-- > 0; var5 += var16) {
         String var15 = this.method_278(var5, var4);
         var16 = this.method_276(var5 + 2);
         var5 += 6;
         if ("Signature".equals(var15)) {
            var8 = this.method_278(var5, var4);
         } else if ("RuntimeVisibleAnnotations".equals(var15)) {
            var9 = var5;
         } else if ("RuntimeVisibleTypeAnnotations".equals(var15)) {
            var11 = var5;
         } else if ("RuntimeInvisibleAnnotations".equals(var15)) {
            var10 = var5;
         } else if ("RuntimeInvisibleTypeAnnotations".equals(var15)) {
            var12 = var5;
         } else {
            Class_98 var17 = this.method_269(var2.field_321, var15, var5, var16, var4, -1, (Class_262[])null);
            var17.field_655 = var13;
            var13 = var17;
         }
      }

      Class_193 var19 = var1.method_758(var6, var7, var8);
      if (var19 == null) {
         return var5;
      } else {
         String var18;
         int var20;
         if (var9 != 0) {
            var16 = this.method_274(var9);

            for(var20 = var9 + 2; var16-- > 0; var20 = this.method_262(var19.method_847(var18, true), var20, true, var4)) {
               var18 = this.method_278(var20, var4);
               var20 += 2;
            }
         }

         if (var10 != 0) {
            var16 = this.method_274(var10);

            for(var20 = var10 + 2; var16-- > 0; var20 = this.method_262(var19.method_847(var18, false), var20, true, var4)) {
               var18 = this.method_278(var20, var4);
               var20 += 2;
            }
         }

         if (var11 != 0) {
            var16 = this.method_274(var11);

            for(var20 = var11 + 2; var16-- > 0; var20 = this.method_262(var19.method_848(var2.field_328, var2.field_329, var18, true), var20, true, var4)) {
               var20 = this.method_260(var2, var20);
               var18 = this.method_278(var20, var4);
               var20 += 2;
            }
         }

         if (var12 != 0) {
            var16 = this.method_274(var12);

            for(var20 = var12 + 2; var16-- > 0; var20 = this.method_262(var19.method_848(var2.field_328, var2.field_329, var18, false), var20, true, var4)) {
               var20 = this.method_260(var2, var20);
               var18 = this.method_278(var20, var4);
               var20 += 2;
            }
         }

         while(var13 != null) {
            Class_98 var21 = var13.field_655;
            var13.field_655 = null;
            var19.method_849(var13);
            var13 = var21;
         }

         var19.method_850();
         return var5;
      }
   }

   private int method_252(Class_181 var1, Class_60 var2, int var3) {
      char[] var4 = var2.field_323;
      int var6 = this.method_274(var3);
      String var7 = this.method_278(var3 + 2, var4);
      String var8 = this.method_278(var3 + 4, var4);
      int var5 = var3 + 6;
      Object var9 = null;
      String var10 = null;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      Class_98 var15 = null;
      int var16 = this.method_274(var5);

      int var18;
      int var19;
      for(var5 += 2; var16-- > 0; var5 += var18) {
         String var17 = this.method_278(var5, var4);
         var18 = this.method_276(var5 + 2);
         var5 += 6;
         if ("ConstantValue".equals(var17)) {
            var19 = this.method_274(var5);
            var9 = var19 == 0 ? null : this.method_286(var19, var4);
         } else if ("Signature".equals(var17)) {
            var10 = this.method_278(var5, var4);
         } else if ("Deprecated".equals(var17)) {
            var6 |= 131072;
         } else if ("Synthetic".equals(var17)) {
            var6 |= 4096;
         } else if ("RuntimeVisibleAnnotations".equals(var17)) {
            var11 = var5;
         } else if ("RuntimeVisibleTypeAnnotations".equals(var17)) {
            var13 = var5;
         } else if ("RuntimeInvisibleAnnotations".equals(var17)) {
            var12 = var5;
         } else if ("RuntimeInvisibleTypeAnnotations".equals(var17)) {
            var14 = var5;
         } else {
            Class_98 var22 = this.method_269(var2.field_321, var17, var5, var18, var4, -1, (Class_262[])null);
            var22.field_655 = var15;
            var15 = var22;
         }
      }

      Class_192 var21 = var1.method_759(var6, var7, var8, var10, var9);
      if (var21 == null) {
         return var5;
      } else {
         String var20;
         if (var11 != 0) {
            var18 = this.method_274(var11);

            for(var19 = var11 + 2; var18-- > 0; var19 = this.method_262(var21.method_842(var20, true), var19, true, var4)) {
               var20 = this.method_278(var19, var4);
               var19 += 2;
            }
         }

         if (var12 != 0) {
            var18 = this.method_274(var12);

            for(var19 = var12 + 2; var18-- > 0; var19 = this.method_262(var21.method_842(var20, false), var19, true, var4)) {
               var20 = this.method_278(var19, var4);
               var19 += 2;
            }
         }

         if (var13 != 0) {
            var18 = this.method_274(var13);

            for(var19 = var13 + 2; var18-- > 0; var19 = this.method_262(var21.method_843(var2.field_328, var2.field_329, var20, true), var19, true, var4)) {
               var19 = this.method_260(var2, var19);
               var20 = this.method_278(var19, var4);
               var19 += 2;
            }
         }

         if (var14 != 0) {
            var18 = this.method_274(var14);

            for(var19 = var14 + 2; var18-- > 0; var19 = this.method_262(var21.method_843(var2.field_328, var2.field_329, var20, false), var19, true, var4)) {
               var19 = this.method_260(var2, var19);
               var20 = this.method_278(var19, var4);
               var19 += 2;
            }
         }

         while(var15 != null) {
            Class_98 var23 = var15.field_655;
            var15.field_655 = null;
            var21.method_844(var15);
            var15 = var23;
         }

         var21.method_845();
         return var5;
      }
   }

   private int method_253(Class_181 var1, Class_60 var2, int var3) {
      char[] var4 = var2.field_323;
      var2.field_324 = this.method_274(var3);
      var2.field_325 = this.method_278(var3 + 2, var4);
      var2.field_326 = this.method_278(var3 + 4, var4);
      int var5 = var3 + 6;
      int var6 = 0;
      int var7 = 0;
      String[] var8 = null;
      boolean var9 = false;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      Class_98 var19 = null;
      int var20 = this.method_274(var5);

      int var22;
      int var27;
      for(var5 += 2; var20-- > 0; var5 += var22) {
         String var21 = this.method_278(var5, var4);
         var22 = this.method_276(var5 + 2);
         var5 += 6;
         if ("Code".equals(var21)) {
            if ((var2.field_322 & 1) == 0) {
               var6 = var5;
            }
         } else if ("Exceptions".equals(var21)) {
            var7 = var5;
            var8 = new String[this.method_274(var5)];
            var27 = var5 + 2;

            for(int var24 = 0; var24 < var8.length; ++var24) {
               var8[var24] = this.method_282(var27, var4);
               var27 += 2;
            }
         } else if ("Signature".equals(var21)) {
            var10 = this.method_274(var5);
         } else if ("Deprecated".equals(var21)) {
            var2.field_324 |= 131072;
         } else if ("RuntimeVisibleAnnotations".equals(var21)) {
            var11 = var5;
         } else if ("RuntimeVisibleTypeAnnotations".equals(var21)) {
            var15 = var5;
         } else if ("AnnotationDefault".equals(var21)) {
            var17 = var5;
         } else if ("Synthetic".equals(var21)) {
            var9 = true;
            var2.field_324 |= 4096;
         } else if ("RuntimeInvisibleAnnotations".equals(var21)) {
            var12 = var5;
         } else if ("RuntimeInvisibleTypeAnnotations".equals(var21)) {
            var16 = var5;
         } else if ("RuntimeVisibleParameterAnnotations".equals(var21)) {
            var13 = var5;
         } else if ("RuntimeInvisibleParameterAnnotations".equals(var21)) {
            var14 = var5;
         } else if ("MethodParameters".equals(var21)) {
            var18 = var5;
         } else {
            Class_98 var23 = this.method_269(var2.field_321, var21, var5, var22, var4, -1, (Class_262[])null);
            var23.field_655 = var19;
            var19 = var23;
         }
      }

      Class_213 var25 = var1.method_760(var2.field_324, var2.field_325, var2.field_326, var10 == 0 ? null : this.method_279(var10, var4), var8);
      if (var25 == null) {
         return var5;
      } else {
         if (var25 instanceof Class_156) {
            Class_156 var26 = (Class_156)var25;
            if (var26.method_570(this, var9, (var2.field_324 & 131072) != 0, this.method_274(var3 + 4), var10, var7)) {
               var26.method_571(var3, var5 - var3);
               return var5;
            }
         }

         if (var18 != 0 && (var2.field_322 & 2) == 0) {
            var22 = this.method_273(var18);

            for(var27 = var18 + 1; var22-- > 0; var27 += 4) {
               var25.method_920(this.method_278(var27, var4), this.method_274(var27 + 2));
            }
         }

         if (var17 != 0) {
            Class_194 var28 = var25.method_921();
            this.method_263(var28, var17, (String)null, var4);
            if (var28 != null) {
               var28.method_855();
            }
         }

         String var29;
         if (var11 != 0) {
            var22 = this.method_274(var11);

            for(var27 = var11 + 2; var22-- > 0; var27 = this.method_262(var25.method_922(var29, true), var27, true, var4)) {
               var29 = this.method_278(var27, var4);
               var27 += 2;
            }
         }

         if (var12 != 0) {
            var22 = this.method_274(var12);

            for(var27 = var12 + 2; var22-- > 0; var27 = this.method_262(var25.method_922(var29, false), var27, true, var4)) {
               var29 = this.method_278(var27, var4);
               var27 += 2;
            }
         }

         if (var15 != 0) {
            var22 = this.method_274(var15);

            for(var27 = var15 + 2; var22-- > 0; var27 = this.method_262(var25.method_923(var2.field_328, var2.field_329, var29, true), var27, true, var4)) {
               var27 = this.method_260(var2, var27);
               var29 = this.method_278(var27, var4);
               var27 += 2;
            }
         }

         if (var16 != 0) {
            var22 = this.method_274(var16);

            for(var27 = var16 + 2; var22-- > 0; var27 = this.method_262(var25.method_923(var2.field_328, var2.field_329, var29, false), var27, true, var4)) {
               var27 = this.method_260(var2, var27);
               var29 = this.method_278(var27, var4);
               var27 += 2;
            }
         }

         if (var13 != 0) {
            this.method_261(var25, var2, var13, true);
         }

         if (var14 != 0) {
            this.method_261(var25, var2, var14, false);
         }

         while(var19 != null) {
            Class_98 var30 = var19.field_655;
            var19.field_655 = null;
            var25.method_926(var19);
            var19 = var30;
         }

         if (var6 != 0) {
            var25.method_927();
            this.method_254(var25, var2, var6);
         }

         var25.method_951();
         return var5;
      }
   }

   private void method_254(Class_213 var1, Class_60 var2, int var3) {
      byte[] var5 = this.field_623;
      char[] var6 = var2.field_323;
      int var7 = this.method_274(var3);
      int var8 = this.method_274(var3 + 2);
      int var9 = this.method_276(var3 + 4);
      int var4 = var3 + 8;
      if (var9 > this.field_623.length - var4) {
         throw new IllegalArgumentException();
      } else {
         int var10 = var4;
         int var11 = var4 + var9;
         Class_262[] var12 = var2.field_327 = new Class_262[var9 + 1];

         int var13;
         int var14;
         int var15;
         label423:
         while(var4 < var11) {
            var13 = var4 - var10;
            var14 = var5[var4] & 255;
            switch(var14) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
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
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
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
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 190:
            case 191:
            case 194:
            case 195:
               ++var4;
               break;
            case 16:
            case 18:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 169:
            case 188:
               var4 += 2;
               break;
            case 17:
            case 19:
            case 20:
            case 132:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 187:
            case 189:
            case 192:
            case 193:
               var4 += 3;
               break;
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 198:
            case 199:
               this.method_256(var13 + this.method_275(var4 + 1), var12);
               var4 += 3;
               break;
            case 170:
               var4 += 4 - (var13 & 3);
               this.method_256(var13 + this.method_276(var4), var12);
               var15 = this.method_276(var4 + 8) - this.method_276(var4 + 4) + 1;
               var4 += 12;

               while(true) {
                  if (var15-- <= 0) {
                     continue label423;
                  }

                  this.method_256(var13 + this.method_276(var4), var12);
                  var4 += 4;
               }
            case 171:
               var4 += 4 - (var13 & 3);
               this.method_256(var13 + this.method_276(var4), var12);
               int var16 = this.method_276(var4 + 4);
               var4 += 8;

               while(true) {
                  if (var16-- <= 0) {
                     continue label423;
                  }

                  this.method_256(var13 + this.method_276(var4 + 4), var12);
                  var4 += 8;
               }
            case 185:
            case 186:
               var4 += 5;
               break;
            case 196:
               switch(var5[var4 + 1] & 255) {
               case 21:
               case 22:
               case 23:
               case 24:
               case 25:
               case 54:
               case 55:
               case 56:
               case 57:
               case 58:
               case 169:
                  var4 += 4;
                  continue;
               case 132:
                  var4 += 6;
                  continue;
               default:
                  throw new IllegalArgumentException();
               }
            case 197:
               var4 += 4;
               break;
            case 200:
            case 201:
            case 220:
               this.method_256(var13 + this.method_276(var4 + 1), var12);
               var4 += 5;
               break;
            case 202:
            case 203:
            case 204:
            case 205:
            case 206:
            case 207:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case 217:
            case 218:
            case 219:
               this.method_256(var13 + this.method_274(var4 + 1), var12);
               var4 += 3;
               break;
            default:
               throw new IllegalArgumentException();
            }
         }

         var13 = this.method_274(var4);
         var4 += 2;

         while(var13-- > 0) {
            Class_262 var41 = this.method_256(this.method_274(var4), var12);
            Class_262 var42 = this.method_256(this.method_274(var4 + 2), var12);
            Class_262 var43 = this.method_256(this.method_274(var4 + 4), var12);
            String var17 = this.method_278(this.field_624[this.method_274(var4 + 6)], var6);
            var4 += 8;
            var1.method_945(var41, var42, var43, var17);
         }

         var14 = 0;
         var15 = 0;
         boolean var44 = true;
         int var45 = 0;
         int var18 = 0;
         int[] var19 = null;
         int[] var20 = null;
         Class_98 var21 = null;
         int var22 = this.method_274(var4);

         int var24;
         int var26;
         int var27;
         int var47;
         for(var4 += 2; var22-- > 0; var4 += var24) {
            String var23 = this.method_278(var4, var6);
            var24 = this.method_276(var4 + 2);
            var4 += 6;
            int var28;
            if ("LocalVariableTable".equals(var23)) {
               if ((var2.field_322 & 2) == 0) {
                  var45 = var4;
                  var26 = this.method_274(var4);

                  for(var47 = var4 + 2; var26-- > 0; var47 += 10) {
                     var27 = this.method_274(var47);
                     this.method_257(var27, var12);
                     var28 = this.method_274(var47 + 2);
                     this.method_257(var27 + var28, var12);
                  }
               }
            } else if ("LocalVariableTypeTable".equals(var23)) {
               var18 = var4;
            } else if ("LineNumberTable".equals(var23)) {
               if ((var2.field_322 & 2) == 0) {
                  var26 = this.method_274(var4);
                  var47 = var4 + 2;

                  while(var26-- > 0) {
                     var27 = this.method_274(var47);
                     var28 = this.method_274(var47 + 2);
                     var47 += 4;
                     this.method_257(var27, var12);
                     var12[var27].method_1222(var28);
                  }
               }
            } else if ("RuntimeVisibleTypeAnnotations".equals(var23)) {
               var19 = this.method_258(var1, var2, var4, true);
            } else if ("RuntimeInvisibleTypeAnnotations".equals(var23)) {
               var20 = this.method_258(var1, var2, var4, false);
            } else if ("StackMapTable".equals(var23)) {
               if ((var2.field_322 & 4) == 0) {
                  var14 = var4 + 2;
                  var15 = var4 + var24;
               }
            } else if ("StackMap".equals(var23)) {
               if ((var2.field_322 & 4) == 0) {
                  var14 = var4 + 2;
                  var15 = var4 + var24;
                  var44 = false;
               }
            } else {
               Class_98 var25 = this.method_269(var2.field_321, var23, var4, var24, var6, var3, var12);
               var25.field_655 = var21;
               var21 = var25;
            }
         }

         boolean var46 = (var2.field_322 & 8) != 0;
         if (var14 != 0) {
            var2.field_333 = -1;
            var2.field_334 = 0;
            var2.field_335 = 0;
            var2.field_336 = 0;
            var2.field_337 = new Object[var8];
            var2.field_338 = 0;
            var2.field_339 = new Object[var7];
            if (var46) {
               this.method_264(var2);
            }

            for(var24 = var14; var24 < var15 - 2; ++var24) {
               if (var5[var24] == 8) {
                  var47 = this.method_274(var24 + 1);
                  if (var47 >= 0 && var47 < var9 && (var5[var10 + var47] & 255) == 187) {
                     this.method_256(var47, var12);
                  }
               }
            }
         }

         if (var46 && (var2.field_322 & 256) != 0) {
            var1.method_928(-1, var8, (Object[])null, 0, (Object[])null);
         }

         var24 = 0;
         var47 = this.method_259(var19, 0);
         var26 = 0;
         var27 = this.method_259(var20, 0);
         boolean var48 = false;
         int var29 = (var2.field_322 & 256) == 0 ? 33 : 0;
         var4 = var10;

         int var32;
         String var35;
         int var52;
         int var53;
         String var55;
         String var59;
         while(var4 < var11) {
            int var30 = var4 - var10;
            Class_262 var31 = var12[var30];
            if (var31 != null) {
               var31.method_1223(var1, (var2.field_322 & 2) == 0);
            }

            while(var14 != 0 && (var2.field_333 == var30 || var2.field_333 == -1)) {
               if (var2.field_333 != -1) {
                  if (var44 && !var46) {
                     var1.method_928(var2.field_334, var2.field_336, var2.field_337, var2.field_338, var2.field_339);
                  } else {
                     var1.method_928(-1, var2.field_335, var2.field_337, var2.field_338, var2.field_339);
                  }

                  var48 = false;
               }

               if (var14 < var15) {
                  var14 = this.method_265(var14, var44, var46, var2);
               } else {
                  var14 = 0;
               }
            }

            if (var48) {
               if ((var2.field_322 & 8) != 0) {
                  var1.method_928(256, 0, (Object[])null, 0, (Object[])null);
               }

               var48 = false;
            }

            var32 = var5[var4] & 255;
            Class_262 var33;
            String var36;
            int var37;
            Class_262[] var57;
            switch(var32) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 190:
            case 191:
            case 194:
            case 195:
               var1.method_929(var32);
               ++var4;
               break;
            case 16:
            case 188:
               var1.method_930(var32, var5[var4 + 1]);
               var4 += 2;
               break;
            case 17:
               var1.method_930(var32, this.method_275(var4 + 1));
               var4 += 3;
               break;
            case 18:
               var1.method_939(this.method_286(var5[var4 + 1] & 255, var6));
               var4 += 2;
               break;
            case 19:
            case 20:
               var1.method_939(this.method_286(this.method_274(var4 + 1), var6));
               var4 += 3;
               break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 169:
               var1.method_931(var32, var5[var4 + 1] & 255);
               var4 += 2;
               break;
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
               var32 -= 26;
               var1.method_931(21 + (var32 >> 2), var32 & 3);
               ++var4;
               break;
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
               var32 -= 59;
               var1.method_931(54 + (var32 >> 2), var32 & 3);
               ++var4;
               break;
            case 132:
               var1.method_940(var5[var4 + 1] & 255, var5[var4 + 2]);
               var4 += 3;
               break;
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 198:
            case 199:
               var1.method_937(var32, var12[var30 + this.method_275(var4 + 1)]);
               var4 += 3;
               break;
            case 170:
               var4 += 4 - (var30 & 3);
               var33 = var12[var30 + this.method_276(var4)];
               var53 = this.method_276(var4 + 4);
               int var56 = this.method_276(var4 + 8);
               var4 += 12;
               var57 = new Class_262[var56 - var53 + 1];

               for(var37 = 0; var37 < var57.length; ++var37) {
                  var57[var37] = var12[var30 + this.method_276(var4)];
                  var4 += 4;
               }

               var1.method_941(var53, var56, var33, var57);
               break;
            case 171:
               var4 += 4 - (var30 & 3);
               var33 = var12[var30 + this.method_276(var4)];
               var53 = this.method_276(var4 + 4);
               var4 += 8;
               int[] var54 = new int[var53];
               var57 = new Class_262[var53];

               for(var37 = 0; var37 < var53; ++var37) {
                  var54[var37] = this.method_276(var4);
                  var57[var37] = var12[var30 + this.method_276(var4 + 4)];
                  var4 += 8;
               }

               var1.method_942(var33, var54, var57);
               break;
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
               var52 = this.field_624[this.method_274(var4 + 1)];
               var53 = this.field_624[this.method_274(var52 + 2)];
               var35 = this.method_282(var52, var6);
               var36 = this.method_278(var53, var6);
               var59 = this.method_278(var53 + 2, var6);
               if (var32 < 182) {
                  var1.method_933(var32, var35, var36, var59);
               } else {
                  boolean var60 = var5[var52 - 1] == 11;
                  var1.method_935(var32, var35, var36, var59, var60);
               }

               if (var32 == 185) {
                  var4 += 5;
               } else {
                  var4 += 3;
               }
               break;
            case 186:
               var52 = this.field_624[this.method_274(var4 + 1)];
               var53 = this.field_624[this.method_274(var52 + 2)];
               var35 = this.method_278(var53, var6);
               var36 = this.method_278(var53 + 2, var6);
               var37 = this.field_627[this.method_274(var52)];
               Class_206 var38 = (Class_206)this.method_286(this.method_274(var37), var6);
               Object[] var39 = new Object[this.method_274(var37 + 2)];
               var37 += 4;

               for(int var40 = 0; var40 < var39.length; ++var40) {
                  var39[var40] = this.method_286(this.method_274(var37), var6);
                  var37 += 2;
               }

               var1.method_936(var35, var36, var38, var39);
               var4 += 5;
               break;
            case 187:
            case 189:
            case 192:
            case 193:
               var1.method_932(var32, this.method_282(var4 + 1, var6));
               var4 += 3;
               break;
            case 196:
               var32 = var5[var4 + 1] & 255;
               if (var32 == 132) {
                  var1.method_940(this.method_274(var4 + 2), this.method_275(var4 + 4));
                  var4 += 6;
               } else {
                  var1.method_931(var32, this.method_274(var4 + 2));
                  var4 += 4;
               }
               break;
            case 197:
               var1.method_943(this.method_282(var4 + 1, var6), var5[var4 + 3] & 255);
               var4 += 4;
               break;
            case 200:
            case 201:
               var1.method_937(var32 - var29, var12[var30 + this.method_276(var4 + 1)]);
               var4 += 5;
               break;
            case 202:
            case 203:
            case 204:
            case 205:
            case 206:
            case 207:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case 217:
            case 218:
            case 219:
               var32 = var32 < 218 ? var32 - 49 : var32 - 20;
               var33 = var12[var30 + this.method_274(var4 + 1)];
               if (var32 != 167 && var32 != 168) {
                  var32 = var32 < 167 ? (var32 + 1 ^ 1) - 1 : var32 ^ 1;
                  Class_262 var34 = this.method_256(var30 + 3, var12);
                  var1.method_937(var32, var34);
                  var1.method_937(200, var33);
                  var48 = true;
               } else {
                  var1.method_937(var32 + 33, var33);
               }

               var4 += 3;
               break;
            case 220:
               var1.method_937(200, var12[var30 + this.method_276(var4 + 1)]);
               var48 = true;
               var4 += 5;
               break;
            default:
               throw new AssertionError();
            }

            while(var19 != null && var24 < var19.length && var47 <= var30) {
               if (var47 == var30) {
                  var52 = this.method_260(var2, var19[var24]);
                  var55 = this.method_278(var52, var6);
                  var52 += 2;
                  this.method_262(var1.method_944(var2.field_328, var2.field_329, var55, true), var52, true, var6);
               }

               ++var24;
               var47 = this.method_259(var19, var24);
            }

            while(var20 != null && var26 < var20.length && var27 <= var30) {
               if (var27 == var30) {
                  var52 = this.method_260(var2, var20[var26]);
                  var55 = this.method_278(var52, var6);
                  var52 += 2;
                  this.method_262(var1.method_944(var2.field_328, var2.field_329, var55, false), var52, true, var6);
               }

               ++var26;
               var27 = this.method_259(var20, var26);
            }
         }

         if (var12[var9] != null) {
            var1.method_938(var12[var9]);
         }

         int[] var49;
         int var50;
         if (var45 != 0 && (var2.field_322 & 2) == 0) {
            var49 = null;
            if (var18 != 0) {
               var49 = new int[this.method_274(var18) * 3];
               var4 = var18 + 2;

               for(var50 = var49.length; var50 > 0; var4 += 10) {
                  --var50;
                  var49[var50] = var4 + 6;
                  --var50;
                  var49[var50] = this.method_274(var4 + 8);
                  --var50;
                  var49[var50] = this.method_274(var4);
               }
            }

            var50 = this.method_274(var45);

            int var58;
            for(var4 = var45 + 2; var50-- > 0; var1.method_947(var55, var35, var59, var12[var32], var12[var32 + var52], var58)) {
               var32 = this.method_274(var4);
               var52 = this.method_274(var4 + 2);
               var55 = this.method_278(var4 + 4, var6);
               var35 = this.method_278(var4 + 6, var6);
               var58 = this.method_274(var4 + 8);
               var4 += 10;
               var59 = null;
               if (var49 != null) {
                  for(int var61 = 0; var61 < var49.length; var61 += 3) {
                     if (var49[var61] == var32 && var49[var61 + 1] == var58) {
                        var59 = this.method_278(var49[var61 + 2], var6);
                        break;
                     }
                  }
               }
            }
         }

         if (var19 != null) {
            var49 = var19;
            var50 = var19.length;

            for(var32 = 0; var32 < var50; ++var32) {
               var52 = var49[var32];
               var53 = this.method_273(var52);
               if (var53 == 64 || var53 == 65) {
                  var4 = this.method_260(var2, var52);
                  var35 = this.method_278(var4, var6);
                  var4 += 2;
                  this.method_262(var1.method_948(var2.field_328, var2.field_329, var2.field_330, var2.field_331, var2.field_332, var35, true), var4, true, var6);
               }
            }
         }

         if (var20 != null) {
            var49 = var20;
            var50 = var20.length;

            for(var32 = 0; var32 < var50; ++var32) {
               var52 = var49[var32];
               var53 = this.method_273(var52);
               if (var53 == 64 || var53 == 65) {
                  var4 = this.method_260(var2, var52);
                  var35 = this.method_278(var4, var6);
                  var4 += 2;
                  this.method_262(var1.method_948(var2.field_328, var2.field_329, var2.field_330, var2.field_331, var2.field_332, var35, false), var4, true, var6);
               }
            }
         }

         while(var21 != null) {
            Class_98 var51 = var21.field_655;
            var21.field_655 = null;
            var1.method_926(var21);
            var21 = var51;
         }

         var1.method_950(var7, var8);
      }
   }

   protected Class_262 method_255(int var1, Class_262[] var2) {
      if (var2[var1] == null) {
         var2[var1] = new Class_262();
      }

      return var2[var1];
   }

   private Class_262 method_256(int var1, Class_262[] var2) {
      Class_262 var3 = this.method_255(var1, var2);
      var3.field_1261 = (short)(var3.field_1261 & -2);
      return var3;
   }

   private void method_257(int var1, Class_262[] var2) {
      if (var2[var1] == null) {
         Class_262 var10000 = this.method_255(var1, var2);
         var10000.field_1261 = (short)(var10000.field_1261 | 1);
      }

   }

   private int[] method_258(Class_213 var1, Class_60 var2, int var3, boolean var4) {
      char[] var5 = var2.field_323;
      int[] var7 = new int[this.method_274(var3)];
      int var6 = var3 + 2;

      for(int var8 = 0; var8 < var7.length; ++var8) {
         int var9;
         int var10;
         var7[var8] = var6;
         var9 = this.method_276(var6);
         label32:
         switch(var9 >>> 24) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 19:
         case 20:
         case 21:
         case 22:
         case 24:
         case 25:
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
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         default:
            throw new IllegalArgumentException();
         case 16:
         case 17:
         case 18:
         case 23:
         case 66:
         case 67:
         case 68:
         case 69:
         case 70:
            var6 += 3;
            break;
         case 64:
         case 65:
            var10 = this.method_274(var6 + 1);
            var6 += 3;

            while(true) {
               if (var10-- <= 0) {
                  break label32;
               }

               int var11 = this.method_274(var6);
               int var12 = this.method_274(var6 + 2);
               var6 += 6;
               this.method_256(var11, var2.field_327);
               this.method_256(var11 + var12, var2.field_327);
            }
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
            var6 += 4;
         }

         var10 = this.method_273(var6);
         if (var9 >>> 24 == 66) {
            Class_82 var13 = var10 == 0 ? null : new Class_82(this.field_623, var6);
            var6 += 1 + 2 * var10;
            String var14 = this.method_278(var6, var5);
            var6 += 2;
            var6 = this.method_262(var1.method_946(var9 & -256, var13, var14, var4), var6, true, var5);
         } else {
            var6 += 3 + 2 * var10;
            var6 = this.method_262((Class_194)null, var6, true, var5);
         }
      }

      return var7;
   }

   private int method_259(int[] var1, int var2) {
      return var1 != null && var2 < var1.length && this.method_273(var1[var2]) >= 67 ? this.method_274(var1[var2] + 1) : -1;
   }

   private int method_260(Class_60 var1, int var2) {
      int var3;
      int var4;
      int var5;
      var4 = this.method_276(var2);
      label26:
      switch(var4 >>> 24) {
      case 0:
      case 1:
      case 22:
         var4 &= -65536;
         var3 = var2 + 2;
         break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 24:
      case 25:
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
      case 46:
      case 47:
      case 48:
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
      case 58:
      case 59:
      case 60:
      case 61:
      case 62:
      case 63:
      default:
         throw new IllegalArgumentException();
      case 16:
      case 17:
      case 18:
      case 23:
      case 66:
         var4 &= -256;
         var3 = var2 + 3;
         break;
      case 19:
      case 20:
      case 21:
         var4 &= -16777216;
         var3 = var2 + 1;
         break;
      case 64:
      case 65:
         var4 &= -16777216;
         var5 = this.method_274(var2 + 1);
         var3 = var2 + 3;
         var1.field_330 = new Class_262[var5];
         var1.field_331 = new Class_262[var5];
         var1.field_332 = new int[var5];
         int var6 = 0;

         while(true) {
            if (var6 >= var5) {
               break label26;
            }

            int var7 = this.method_274(var3);
            int var8 = this.method_274(var3 + 2);
            int var9 = this.method_274(var3 + 4);
            var3 += 6;
            var1.field_330[var6] = this.method_256(var7, var1.field_327);
            var1.field_331[var6] = this.method_256(var7 + var8, var1.field_327);
            var1.field_332[var6] = var9;
            ++var6;
         }
      case 67:
      case 68:
      case 69:
      case 70:
         var4 &= -16777216;
         var3 = var2 + 3;
         break;
      case 71:
      case 72:
      case 73:
      case 74:
      case 75:
         var4 &= -16776961;
         var3 = var2 + 4;
      }

      var1.field_328 = var4;
      var5 = this.method_273(var3);
      var1.field_329 = var5 == 0 ? null : new Class_82(this.field_623, var3);
      return var3 + 1 + 2 * var5;
   }

   private void method_261(Class_213 var1, Class_60 var2, int var3, boolean var4) {
      int var5 = var3 + 1;
      int var6 = this.field_623[var3] & 255;
      var1.method_924(var6, var4);
      char[] var7 = var2.field_323;

      for(int var8 = 0; var8 < var6; ++var8) {
         int var9 = this.method_274(var5);

         String var10;
         for(var5 += 2; var9-- > 0; var5 = this.method_262(var1.method_925(var8, var10, var4), var5, true, var7)) {
            var10 = this.method_278(var5, var7);
            var5 += 2;
         }
      }

   }

   private int method_262(Class_194 var1, int var2, boolean var3, char[] var4) {
      int var6 = this.method_274(var2);
      int var5 = var2 + 2;
      if (var3) {
         while(var6-- > 0) {
            String var7 = this.method_278(var5, var4);
            var5 = this.method_263(var1, var5 + 2, var7, var4);
         }
      } else {
         while(var6-- > 0) {
            var5 = this.method_263(var1, var5, (String)null, var4);
         }
      }

      if (var1 != null) {
         var1.method_855();
      }

      return var5;
   }

   private int method_263(Class_194 var1, int var2, String var3, char[] var4) {
      if (var1 == null) {
         switch(this.field_623[var2] & 255) {
         case 64:
            return this.method_262((Class_194)null, var2 + 3, true, var4);
         case 91:
            return this.method_262((Class_194)null, var2 + 1, false, var4);
         case 101:
            return var2 + 5;
         default:
            return var2 + 3;
         }
      } else {
         int var5 = var2 + 1;
         switch(this.field_623[var2] & 255) {
         case 64:
            var5 = this.method_262(var1.method_853(var3, this.method_278(var5, var4)), var5 + 2, true, var4);
            break;
         case 65:
         case 69:
         case 71:
         case 72:
         case 75:
         case 76:
         case 77:
         case 78:
         case 79:
         case 80:
         case 81:
         case 82:
         case 84:
         case 85:
         case 86:
         case 87:
         case 88:
         case 89:
         case 92:
         case 93:
         case 94:
         case 95:
         case 96:
         case 97:
         case 98:
         case 100:
         case 102:
         case 103:
         case 104:
         case 105:
         case 106:
         case 107:
         case 108:
         case 109:
         case 110:
         case 111:
         case 112:
         case 113:
         case 114:
         default:
            throw new IllegalArgumentException();
         case 66:
            var1.method_851(var3, (byte)this.method_276(this.field_624[this.method_274(var5)]));
            var5 += 2;
            break;
         case 67:
            var1.method_851(var3, (char)this.method_276(this.field_624[this.method_274(var5)]));
            var5 += 2;
            break;
         case 68:
         case 70:
         case 73:
         case 74:
            var1.method_851(var3, this.method_286(this.method_274(var5), var4));
            var5 += 2;
            break;
         case 83:
            var1.method_851(var3, (short)this.method_276(this.field_624[this.method_274(var5)]));
            var5 += 2;
            break;
         case 90:
            var1.method_851(var3, this.method_276(this.field_624[this.method_274(var5)]) == 0 ? Boolean.FALSE : Boolean.TRUE);
            var5 += 2;
            break;
         case 91:
            int var6 = this.method_274(var5);
            var5 += 2;
            if (var6 == 0) {
               return this.method_262(var1.method_854(var3), var5 - 2, false, var4);
            }

            switch(this.field_623[var5] & 255) {
            case 66:
               byte[] var7 = new byte[var6];

               for(int var16 = 0; var16 < var6; ++var16) {
                  var7[var16] = (byte)this.method_276(this.field_624[this.method_274(var5 + 1)]);
                  var5 += 3;
               }

               var1.method_851(var3, var7);
               return var5;
            case 67:
               char[] var18 = new char[var6];

               for(int var19 = 0; var19 < var6; ++var19) {
                  var18[var19] = (char)this.method_276(this.field_624[this.method_274(var5 + 1)]);
                  var5 += 3;
               }

               var1.method_851(var3, var18);
               return var5;
            case 68:
               double[] var22 = new double[var6];

               for(int var15 = 0; var15 < var6; ++var15) {
                  var22[var15] = Double.longBitsToDouble(this.method_277(this.field_624[this.method_274(var5 + 1)]));
                  var5 += 3;
               }

               var1.method_851(var3, var22);
               return var5;
            case 69:
            case 71:
            case 72:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            default:
               var5 = this.method_262(var1.method_854(var3), var5 - 2, false, var4);
               return var5;
            case 70:
               float[] var21 = new float[var6];

               for(int var14 = 0; var14 < var6; ++var14) {
                  var21[var14] = Float.intBitsToFloat(this.method_276(this.field_624[this.method_274(var5 + 1)]));
                  var5 += 3;
               }

               var1.method_851(var3, var21);
               return var5;
            case 73:
               int[] var11 = new int[var6];

               for(int var20 = 0; var20 < var6; ++var20) {
                  var11[var20] = this.method_276(this.field_624[this.method_274(var5 + 1)]);
                  var5 += 3;
               }

               var1.method_851(var3, var11);
               return var5;
            case 74:
               long[] var12 = new long[var6];

               for(int var13 = 0; var13 < var6; ++var13) {
                  var12[var13] = this.method_277(this.field_624[this.method_274(var5 + 1)]);
                  var5 += 3;
               }

               var1.method_851(var3, var12);
               return var5;
            case 83:
               short[] var17 = new short[var6];

               for(int var10 = 0; var10 < var6; ++var10) {
                  var17[var10] = (short)this.method_276(this.field_624[this.method_274(var5 + 1)]);
                  var5 += 3;
               }

               var1.method_851(var3, var17);
               return var5;
            case 90:
               boolean[] var8 = new boolean[var6];

               for(int var9 = 0; var9 < var6; ++var9) {
                  var8[var9] = this.method_276(this.field_624[this.method_274(var5 + 1)]) != 0;
                  var5 += 3;
               }

               var1.method_851(var3, var8);
               return var5;
            }
         case 99:
            var1.method_851(var3, Class_260.method_1188(this.method_278(var5, var4)));
            var5 += 2;
            break;
         case 101:
            var1.method_852(var3, this.method_278(var5, var4), this.method_278(var5 + 2, var4));
            var5 += 4;
            break;
         case 115:
            var1.method_851(var3, this.method_278(var5, var4));
            var5 += 2;
         }

         return var5;
      }
   }

   private void method_264(Class_60 var1) {
      String var2 = var1.field_326;
      Object[] var3 = var1.field_337;
      int var4 = 0;
      if ((var1.field_324 & 8) == 0) {
         if ("<init>".equals(var1.field_325)) {
            var3[var4++] = Class_63.field_430;
         } else {
            var3[var4++] = this.method_282(this.field_622 + 2, var1.field_323);
         }
      }

      int var5 = 1;

      while(true) {
         int var6 = var5;
         switch(var2.charAt(var5++)) {
         case 'B':
         case 'C':
         case 'I':
         case 'S':
         case 'Z':
            var3[var4++] = Class_63.field_425;
            break;
         case 'D':
            var3[var4++] = Class_63.field_427;
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
            var1.field_335 = var4;
            return;
         case 'F':
            var3[var4++] = Class_63.field_426;
            break;
         case 'J':
            var3[var4++] = Class_63.field_428;
            break;
         case 'L':
            while(var2.charAt(var5) != ';') {
               ++var5;
            }

            var3[var4++] = var2.substring(var6 + 1, var5++);
            break;
         case '[':
            while(var2.charAt(var5) == '[') {
               ++var5;
            }

            if (var2.charAt(var5) == 'L') {
               ++var5;

               while(var2.charAt(var5) != ';') {
                  ++var5;
               }
            }

            int var10001 = var4++;
            ++var5;
            var3[var10001] = var2.substring(var6, var5);
         }
      }
   }

   private int method_265(int var1, boolean var2, boolean var3, Class_60 var4) {
      int var5 = var1;
      char[] var6 = var4.field_323;
      Class_262[] var7 = var4.field_327;
      int var8;
      if (var2) {
         var5 = var1 + 1;
         var8 = this.field_623[var1] & 255;
      } else {
         var8 = 255;
         var4.field_333 = -1;
      }

      var4.field_336 = 0;
      int var9;
      if (var8 < 64) {
         var9 = var8;
         var4.field_334 = 3;
         var4.field_338 = 0;
      } else if (var8 < 128) {
         var9 = var8 - 64;
         var5 = this.method_266(var5, var4.field_339, 0, var6, var7);
         var4.field_334 = 4;
         var4.field_338 = 1;
      } else {
         if (var8 < 247) {
            throw new IllegalArgumentException();
         }

         var9 = this.method_274(var5);
         var5 += 2;
         if (var8 == 247) {
            var5 = this.method_266(var5, var4.field_339, 0, var6, var7);
            var4.field_334 = 4;
            var4.field_338 = 1;
         } else if (var8 >= 248 && var8 < 251) {
            var4.field_334 = 2;
            var4.field_336 = 251 - var8;
            var4.field_335 -= var4.field_336;
            var4.field_338 = 0;
         } else if (var8 == 251) {
            var4.field_334 = 3;
            var4.field_338 = 0;
         } else {
            int var10;
            int var11;
            if (var8 < 255) {
               var10 = var3 ? var4.field_335 : 0;

               for(var11 = var8 - 251; var11 > 0; --var11) {
                  var5 = this.method_266(var5, var4.field_337, var10++, var6, var7);
               }

               var4.field_334 = 1;
               var4.field_336 = var8 - 251;
               var4.field_335 += var4.field_336;
               var4.field_338 = 0;
            } else {
               var10 = this.method_274(var5);
               var5 += 2;
               var4.field_334 = 0;
               var4.field_336 = var10;
               var4.field_335 = var10;

               for(var11 = 0; var11 < var10; ++var11) {
                  var5 = this.method_266(var5, var4.field_337, var11, var6, var7);
               }

               var11 = this.method_274(var5);
               var5 += 2;
               var4.field_338 = var11;

               for(int var12 = 0; var12 < var11; ++var12) {
                  var5 = this.method_266(var5, var4.field_339, var12, var6, var7);
               }
            }
         }
      }

      var4.field_333 += var9 + 1;
      this.method_256(var4.field_333, var7);
      return var5;
   }

   private int method_266(int var1, Object[] var2, int var3, char[] var4, Class_262[] var5) {
      int var6 = var1 + 1;
      int var7 = this.field_623[var1] & 255;
      switch(var7) {
      case 0:
         var2[var3] = Class_63.field_424;
         break;
      case 1:
         var2[var3] = Class_63.field_425;
         break;
      case 2:
         var2[var3] = Class_63.field_426;
         break;
      case 3:
         var2[var3] = Class_63.field_427;
         break;
      case 4:
         var2[var3] = Class_63.field_428;
         break;
      case 5:
         var2[var3] = Class_63.field_429;
         break;
      case 6:
         var2[var3] = Class_63.field_430;
         break;
      case 7:
         var2[var3] = this.method_282(var6, var4);
         var6 += 2;
         break;
      case 8:
         var2[var3] = this.method_256(this.method_274(var6), var5);
         var6 += 2;
         break;
      default:
         throw new IllegalArgumentException();
      }

      return var6;
   }

   final int method_267() {
      int var1 = this.field_622 + 8 + this.method_274(this.field_622 + 6) * 2;
      int var2 = this.method_274(var1);
      var1 += 2;

      int var3;
      while(var2-- > 0) {
         var3 = this.method_274(var1 + 6);

         for(var1 += 8; var3-- > 0; var1 += 6 + this.method_276(var1 + 2)) {
         }
      }

      var3 = this.method_274(var1);
      var1 += 2;

      while(var3-- > 0) {
         int var4 = this.method_274(var1 + 6);

         for(var1 += 8; var4-- > 0; var1 += 6 + this.method_276(var1 + 2)) {
         }
      }

      return var1 + 2;
   }

   private int[] method_268(int var1) {
      char[] var2 = new char[var1];
      int var3 = this.method_267();

      for(int var4 = this.method_274(var3 - 2); var4 > 0; --var4) {
         String var5 = this.method_278(var3, var2);
         int var6 = this.method_276(var3 + 2);
         var3 += 6;
         if ("BootstrapMethods".equals(var5)) {
            int[] var7 = new int[this.method_274(var3)];
            int var8 = var3 + 2;

            for(int var9 = 0; var9 < var7.length; ++var9) {
               var7[var9] = var8;
               var8 += 4 + this.method_274(var8 + 2) * 2;
            }

            return var7;
         }

         var3 += var6;
      }

      throw new IllegalArgumentException();
   }

   private Class_98 method_269(Class_98[] var1, String var2, int var3, int var4, char[] var5, int var6, Class_262[] var7) {
      Class_98[] var8 = var1;
      int var9 = var1.length;

      for(int var10 = 0; var10 < var9; ++var10) {
         Class_98 var11 = var8[var10];
         if (var11.field_653.equals(var2)) {
            return var11.method_328(this, var3, var4, var5, var6, var7);
         }
      }

      return (new Class_98(var2)).method_328(this, var3, var4, (char[])null, -1, (Class_262[])null);
   }

   public int method_270() {
      return this.field_624.length;
   }

   public int method_271(int var1) {
      return this.field_624[var1];
   }

   public int method_272() {
      return this.field_628;
   }

   public int method_273(int var1) {
      return this.field_623[var1] & 255;
   }

   public int method_274(int var1) {
      byte[] var2 = this.field_623;
      return (var2[var1] & 255) << 8 | var2[var1 + 1] & 255;
   }

   public short method_275(int var1) {
      byte[] var2 = this.field_623;
      return (short)((var2[var1] & 255) << 8 | var2[var1 + 1] & 255);
   }

   public int method_276(int var1) {
      byte[] var2 = this.field_623;
      return (var2[var1] & 255) << 24 | (var2[var1 + 1] & 255) << 16 | (var2[var1 + 2] & 255) << 8 | var2[var1 + 3] & 255;
   }

   public long method_277(int var1) {
      long var2 = (long)this.method_276(var1);
      long var4 = (long)this.method_276(var1 + 4) & 4294967295L;
      return var2 << 32 | var4;
   }

   public String method_278(int var1, char[] var2) {
      int var3 = this.method_274(var1);
      return var1 != 0 && var3 != 0 ? this.method_279(var3, var2) : null;
   }

   final String method_279(int var1, char[] var2) {
      String var3 = this.field_625[var1];
      if (var3 != null) {
         return var3;
      } else {
         int var4 = this.field_624[var1];
         return this.field_625[var1] = this.method_280(var4 + 2, this.method_274(var4), var2);
      }
   }

   private String method_280(int var1, int var2, char[] var3) {
      int var4 = var1;
      int var5 = var1 + var2;
      int var6 = 0;
      byte[] var7 = this.field_623;

      while(var4 < var5) {
         byte var8 = var7[var4++];
         if ((var8 & 128) == 0) {
            var3[var6++] = (char)(var8 & 127);
         } else if ((var8 & 224) == 192) {
            var3[var6++] = (char)(((var8 & 31) << 6) + (var7[var4++] & 63));
         } else {
            var3[var6++] = (char)(((var8 & 15) << 12) + ((var7[var4++] & 63) << 6) + (var7[var4++] & 63));
         }
      }

      return new String(var3, 0, var6);
   }

   private String method_281(int var1, char[] var2) {
      return ""/*this.method_278(this.field_624[this.method_274(var1)], var2)*/;
   }

   public String method_282(int var1, char[] var2) {
      return this.method_281(var1, var2);
   }

   public String method_283(int var1, char[] var2) {
      return this.method_281(var1, var2);
   }

   public String method_284(int var1, char[] var2) {
      return this.method_281(var1, var2);
   }

   private Class_242 method_285(int var1, char[] var2) {
      Class_242 var3 = this.field_626[var1];
      if (var3 != null) {
         return var3;
      } else {
         int var4 = this.field_624[var1];
         int var5 = this.field_624[this.method_274(var4 + 2)];
         String var6 = this.method_278(var5, var2);
         String var7 = this.method_278(var5 + 2, var2);
         int var8 = this.field_627[this.method_274(var4)];
         Class_206 var9 = (Class_206)this.method_286(this.method_274(var8), var2);
         Object[] var10 = new Object[this.method_274(var8 + 2)];
         var8 += 4;

         for(int var11 = 0; var11 < var10.length; ++var11) {
            var10[var11] = this.method_286(this.method_274(var8), var2);
            var8 += 2;
         }

         return this.field_626[var1] = new Class_242(var6, var7, var9, var10);
      }
   }

   public Object method_286(int var1, char[] var2) {
      int var3 = this.field_624[var1];
      switch(this.field_623[var3 - 1]) {
      case 3:
         return this.method_276(var3);
      case 4:
         return Float.intBitsToFloat(this.method_276(var3));
      case 5:
         return this.method_277(var3);
      case 6:
         return Double.longBitsToDouble(this.method_277(var3));
      case 7:
         return Class_260.method_1193(this.method_278(var3, var2));
      case 8:
         return this.method_278(var3, var2);
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      default:
         throw new IllegalArgumentException();
      case 15:
         int var4 = this.method_273(var3);
         int var5 = this.field_624[this.method_274(var3 + 1)];
         int var6 = this.field_624[this.method_274(var5 + 2)];
         String var7 = this.method_282(var5, var2);
         String var8 = this.method_278(var6, var2);
         String var9 = this.method_278(var6 + 2, var2);
         boolean var10 = this.field_623[var5 - 1] == 11;
         return new Class_206(var4, var7, var8, var9, var10);
      case 16:
         return Class_260.method_1194(this.method_278(var3, var2));
      case 17:
         return this.method_285(var1, var2);
      }
   }
}
