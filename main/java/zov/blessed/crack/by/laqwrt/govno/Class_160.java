package zov.blessed.crack.by.laqwrt.govno;

import zov.blessed.crack.by.laqwrt.Class_206;
import zov.blessed.crack.by.laqwrt.Class_265;

public class Class_160 extends Class_181 {
   public static int field_827 = 1;
   public static int field_828 = 2;
   private int field_829;
   private final Class_170 field_830;
   private int field_831;
   private int field_832;
   private int field_833;
   private int field_834;
   private int[] field_835;
   private Class_43 field_836;
   private Class_43 field_837;
   private Class_156 field_838;
   private Class_156 field_839;
   private int field_840;
   private Class_25 field_841;
   private int field_842;
   private int field_843;
   private int field_844;
   private int field_845;
   private Class_25 field_846;
   private Class_34 field_847;
   private Class_34 field_848;
   private Class_34 field_849;
   private Class_34 field_850;
   private Class_163 field_851;
   private int field_852;
   private int field_853;
   private Class_25 field_854;
   private int field_855;
   private Class_25 field_856;
   private Class_110 field_857;
   private Class_110 field_858;
   private Class_98 field_859;
   private int field_860;

   public Class_160(int var1) {
      this((Class_81)null, var1);
   }

   public Class_160(Class_81 var1, int var2) {
      super(589824);
      this.field_830 = var1 == null ? new Class_170(this) : new Class_170(this, var1);
      if ((var2 & 2) != 0) {
         this.field_860 = 4;
      } else if ((var2 & 1) != 0) {
         this.field_860 = 1;
      } else {
         this.field_860 = 0;
      }

   }

   public final void method_747(int var1, int var2, String var3, String var4, String var5, String[] var6) {
      this.field_829 = var1;
      this.field_831 = var2;
      this.field_832 = this.field_830.method_659(var1 & '\uffff', var3);
      if (var4 != null) {
         this.field_844 = this.field_830.method_685(var4);
      }

      this.field_833 = var5 == null ? 0 : this.field_830.method_669(var5).field_959;
      if (var6 != null && var6.length > 0) {
         this.field_834 = var6.length;
         this.field_835 = new int[this.field_834];

         for(int var7 = 0; var7 < this.field_834; ++var7) {
            this.field_835[var7] = this.field_830.method_669(var6[var7]).field_959;
         }
      }

      if (this.field_860 == 1 && (var1 & '\uffff') >= 51) {
         this.field_860 = 2;
      }

   }

   public final void method_748(String var1, String var2) {
      if (var1 != null) {
         this.field_845 = this.field_830.method_685(var1);
      }

      if (var2 != null) {
         this.field_846 = (new Class_25()).method_31(var2, 0, Integer.MAX_VALUE);
      }

   }

   public final Class_65 method_749(String var1, int var2, String var3) {
      return this.field_851 = new Class_163(this.field_830, this.field_830.method_694(var1).field_959, var2, var3 == null ? 0 : this.field_830.method_685(var3));
   }

   public final void method_750(String var1) {
      this.field_852 = this.field_830.method_669(var1).field_959;
   }

   public final void method_751(String var1, String var2, String var3) {
      this.field_842 = this.field_830.method_669(var1).field_959;
      if (var2 != null && var3 != null) {
         this.field_843 = this.field_830.method_683(var2, var3);
      }

   }

   public final Class_194 method_752(String var1, boolean var2) {
      return var2 ? (this.field_847 = Class_34.method_54(this.field_830, var1, this.field_847)) : (this.field_848 = Class_34.method_54(this.field_830, var1, this.field_848));
   }

   public final Class_194 method_753(int var1, Class_82 var2, String var3, boolean var4) {
      return var4 ? (this.field_849 = Class_34.method_55(this.field_830, var1, var2, var3, this.field_849)) : (this.field_850 = Class_34.method_55(this.field_830, var1, var2, var3, this.field_850));
   }

   public final void method_754(Class_98 var1) {
      var1.field_655 = this.field_859;
      this.field_859 = var1;
   }

   public final void method_755(String var1) {
      if (this.field_854 == null) {
         this.field_854 = new Class_25();
      }

      ++this.field_853;
      this.field_854.method_24(this.field_830.method_669(var1).field_959);
   }

   public final void method_756(String var1) {
      if (this.field_856 == null) {
         this.field_856 = new Class_25();
      }

      ++this.field_855;
      this.field_856.method_24(this.field_830.method_669(var1).field_959);
   }

   public final void method_757(String var1, String var2, String var3, int var4) {
      if (this.field_841 == null) {
         this.field_841 = new Class_25();
      }

      Class_179 var5 = this.field_830.method_669(var1);
      if (var5.field_965 == 0) {
         ++this.field_840;
         this.field_841.method_24(var5.field_959);
         this.field_841.method_24(var2 == null ? 0 : this.field_830.method_669(var2).field_959);
         this.field_841.method_24(var3 == null ? 0 : this.field_830.method_685(var3));
         this.field_841.method_24(var4);
         var5.field_965 = this.field_840;
      }

   }

   public final Class_193 method_758(String var1, String var2, String var3) {
      Class_110 var4 = new Class_110(this.field_830, var1, var2, var3);
      if (this.field_857 == null) {
         this.field_857 = var4;
      } else {
         this.field_858.field_1036 = var4;
      }

      return this.field_858 = var4;
   }

   public final Class_192 method_759(int var1, String var2, String var3, String var4, Object var5) {
      Class_43 var6 = new Class_43(this.field_830, var1, var2, var3, var4, var5);
      if (this.field_836 == null) {
         this.field_836 = var6;
      } else {
         this.field_837.field_1034 = var6;
      }

      return this.field_837 = var6;
   }

   public final Class_213 method_760(int var1, String var2, String var3, String var4, String[] var5) {
      Class_156 var6 = new Class_156(this.field_830, var1, var2, var3, var4, var5, this.field_860);
      if (this.field_838 == null) {
         this.field_838 = var6;
      } else {
         this.field_839.field_1109 = var6;
      }

      return this.field_839 = var6;
   }

   public final void method_761() {
   }

   public byte[] method_583() {
      int var1 = 24 + 2 * this.field_834;
      int var2 = 0;

      Class_43 var3;
      for(var3 = this.field_836; var3 != null; var3 = (Class_43)var3.field_1034) {
         ++var2;
         var1 += var3.method_91();
      }

      int var4 = 0;

      Class_156 var5;
      for(var5 = this.field_838; var5 != null; var5 = (Class_156)var5.field_1109) {
         ++var4;
         var1 += var5.method_572();
      }

      int var6 = 0;
      if (this.field_841 != null) {
         ++var6;
         var1 += 8 + this.field_841.field_131;
         this.field_830.method_685("InnerClasses");
      }

      if (this.field_842 != 0) {
         ++var6;
         var1 += 10;
         this.field_830.method_685("EnclosingMethod");
      }

      if ((this.field_831 & 4096) != 0 && (this.field_829 & '\uffff') < 49) {
         ++var6;
         var1 += 6;
         this.field_830.method_685("Synthetic");
      }

      if (this.field_844 != 0) {
         ++var6;
         var1 += 8;
         this.field_830.method_685("Signature");
      }

      if (this.field_845 != 0) {
         ++var6;
         var1 += 8;
         this.field_830.method_685("SourceFile");
      }

      if (this.field_846 != null) {
         ++var6;
         var1 += 6 + this.field_846.field_131;
         this.field_830.method_685("SourceDebugExtension");
      }

      if ((this.field_831 & 131072) != 0) {
         ++var6;
         var1 += 6;
         this.field_830.method_685("Deprecated");
      }

      if (this.field_847 != null) {
         ++var6;
         var1 += this.field_847.method_56("RuntimeVisibleAnnotations");
      }

      if (this.field_848 != null) {
         ++var6;
         var1 += this.field_848.method_56("RuntimeInvisibleAnnotations");
      }

      if (this.field_849 != null) {
         ++var6;
         var1 += this.field_849.method_56("RuntimeVisibleTypeAnnotations");
      }

      if (this.field_850 != null) {
         ++var6;
         var1 += this.field_850.method_56("RuntimeInvisibleTypeAnnotations");
      }

      if (this.field_830.method_663() > 0) {
         ++var6;
         var1 += this.field_830.method_663();
      }

      if (this.field_851 != null) {
         var6 += this.field_851.method_636();
         var1 += this.field_851.method_637();
      }

      if (this.field_852 != 0) {
         ++var6;
         var1 += 8;
         this.field_830.method_685("NestHost");
      }

      if (this.field_854 != null) {
         ++var6;
         var1 += 8 + this.field_854.field_131;
         this.field_830.method_685("NestMembers");
      }

      if (this.field_856 != null) {
         ++var6;
         var1 += 8 + this.field_856.field_131;
         this.field_830.method_685("PermittedSubclasses");
      }

      int var7 = 0;
      int var8 = 0;
      if ((this.field_831 & 65536) != 0 || this.field_857 != null) {
         for(Class_110 var9 = this.field_857; var9 != null; var9 = (Class_110)var9.field_1036) {
            ++var7;
            var8 += var9.method_396();
         }

         ++var6;
         var1 += 8 + var8;
         this.field_830.method_685("Record");
      }

      if (this.field_859 != null) {
         var6 += this.field_859.method_330();
         var1 += this.field_859.method_331(this.field_830);
      }

      var1 += this.field_830.method_661();
      int var15 = this.field_830.method_660();
      if (var15 > 65535) {
         throw new Class_265(this.field_830.method_658(), var15);
      } else {
         Class_25 var10 = new Class_25(var1);
         var10.method_27(-889275714).method_27(this.field_829);
         this.field_830.method_662(var10);
         int var11 = (this.field_829 & '\uffff') < 49 ? 4096 : 0;
         var10.method_24(this.field_831 & ~var11).method_24(this.field_832).method_24(this.field_833);
         var10.method_24(this.field_834);

         for(int var12 = 0; var12 < this.field_834; ++var12) {
            var10.method_24(this.field_835[var12]);
         }

         var10.method_24(var2);

         for(var3 = this.field_836; var3 != null; var3 = (Class_43)var3.field_1034) {
            var3.method_92(var10);
         }

         var10.method_24(var4);
         boolean var16 = false;
         boolean var13 = false;

         for(var5 = this.field_838; var5 != null; var5 = (Class_156)var5.field_1109) {
            var16 |= var5.method_557();
            var13 |= var5.method_558();
            var5.method_573(var10);
         }

         var10.method_24(var6);
         if (this.field_841 != null) {
            var10.method_24(this.field_830.method_685("InnerClasses")).method_27(this.field_841.field_131 + 2).method_24(this.field_840).method_32(this.field_841.field_130, 0, this.field_841.field_131);
         }

         if (this.field_842 != 0) {
            var10.method_24(this.field_830.method_685("EnclosingMethod")).method_27(4).method_24(this.field_842).method_24(this.field_843);
         }

         if ((this.field_831 & 4096) != 0 && (this.field_829 & '\uffff') < 49) {
            var10.method_24(this.field_830.method_685("Synthetic")).method_27(0);
         }

         if (this.field_844 != 0) {
            var10.method_24(this.field_830.method_685("Signature")).method_27(2).method_24(this.field_844);
         }

         if (this.field_845 != 0) {
            var10.method_24(this.field_830.method_685("SourceFile")).method_27(2).method_24(this.field_845);
         }

         if (this.field_846 != null) {
            int var14 = this.field_846.field_131;
            var10.method_24(this.field_830.method_685("SourceDebugExtension")).method_27(var14).method_32(this.field_846.field_130, 0, var14);
         }

         if ((this.field_831 & 131072) != 0) {
            var10.method_24(this.field_830.method_685("Deprecated")).method_27(0);
         }

         Class_34.method_59(this.field_830, this.field_847, this.field_848, this.field_849, this.field_850, var10);
         this.field_830.method_664(var10);
         if (this.field_851 != null) {
            this.field_851.method_638(var10);
         }

         if (this.field_852 != 0) {
            var10.method_24(this.field_830.method_685("NestHost")).method_27(2).method_24(this.field_852);
         }

         if (this.field_854 != null) {
            var10.method_24(this.field_830.method_685("NestMembers")).method_27(this.field_854.field_131 + 2).method_24(this.field_853).method_32(this.field_854.field_130, 0, this.field_854.field_131);
         }

         if (this.field_856 != null) {
            var10.method_24(this.field_830.method_685("PermittedSubclasses")).method_27(this.field_856.field_131 + 2).method_24(this.field_855).method_32(this.field_856.field_130, 0, this.field_856.field_131);
         }

         if ((this.field_831 & 65536) != 0 || this.field_857 != null) {
            var10.method_24(this.field_830.method_685("Record")).method_27(var8 + 2).method_24(var7);

            for(Class_110 var17 = this.field_857; var17 != null; var17 = (Class_110)var17.field_1036) {
               var17.method_397(var10);
            }
         }

         if (this.field_859 != null) {
            this.field_859.method_334(this.field_830, var10);
         }

         return var13 ? this.method_584(var10.field_130, var16) : var10.field_130;
      }
   }

   private byte[] method_584(byte[] var1, boolean var2) {
      Class_98[] var3 = this.method_585();
      this.field_836 = null;
      this.field_837 = null;
      this.field_838 = null;
      this.field_839 = null;
      this.field_847 = null;
      this.field_848 = null;
      this.field_849 = null;
      this.field_850 = null;
      this.field_851 = null;
      this.field_852 = 0;
      this.field_853 = 0;
      this.field_854 = null;
      this.field_855 = 0;
      this.field_856 = null;
      this.field_857 = null;
      this.field_858 = null;
      this.field_859 = null;
      this.field_860 = var2 ? 3 : 0;
    //  (new Class_81(var1, 0, false)).method_249(this, var3, (var2 ? 8 : 0) | 256);
      return this.method_583();
   }

   private Class_98[] method_585() {
      Class_11 var1 = new Class_11();
      var1.method_1(this.field_859);

      for(Class_43 var2 = this.field_836; var2 != null; var2 = (Class_43)var2.field_1034) {
         var2.method_93(var1);
      }

      for(Class_156 var3 = this.field_838; var3 != null; var3 = (Class_156)var3.field_1109) {
         var3.method_574(var1);
      }

      for(Class_110 var4 = this.field_857; var4 != null; var4 = (Class_110)var4.field_1036) {
         var4.method_398(var1);
      }

      return var1.method_2();
   }

   public int method_586(Object var1) {
      return this.field_830.method_668(var1).field_959;
   }

   public int method_587(String var1) {
      return this.field_830.method_685(var1);
   }

   public int method_588(String var1) {
      return this.field_830.method_669(var1).field_959;
   }

   public int method_589(String var1) {
      return this.field_830.method_689(var1).field_959;
   }

   public int method_590(String var1) {
      return this.field_830.method_694(var1).field_959;
   }

   public int method_591(String var1) {
      return this.field_830.method_695(var1).field_959;
   }

   /** @deprecated */
   @Deprecated
   public int method_592(int var1, String var2, String var3, String var4) {
      return this.method_593(var1, var2, var3, var4, var1 == 9);
   }

   public int method_593(int var1, String var2, String var3, String var4, boolean var5) {
      return this.field_830.method_687(var1, var2, var3, var4, var5).field_959;
   }

   public int method_594(String var1, String var2, Class_206 var3, Object... var4) {
      return this.field_830.method_690(var1, var2, var3, var4).field_959;
   }

   public int method_595(String var1, String var2, Class_206 var3, Object... var4) {
      return this.field_830.method_691(var1, var2, var3, var4).field_959;
   }

   public int method_596(String var1, String var2, String var3) {
      return this.field_830.method_670(var1, var2, var3).field_959;
   }

   public int method_597(String var1, String var2, String var3, boolean var4) {
      return this.field_830.method_671(var1, var2, var3, var4).field_959;
   }

   public int method_598(String var1, String var2) {
      return this.field_830.method_683(var1, var2);
   }

   protected String method_599(String var1, String var2) {
      ClassLoader var3 = this.method_600();

      Class var4;
      try {
         var4 = Class.forName(var1.replace('/', '.'), false, var3);
      } catch (ClassNotFoundException var8) {
         throw new TypeNotPresentException(var1, var8);
      }

      Class var5;
      try {
         var5 = Class.forName(var2.replace('/', '.'), false, var3);
      } catch (ClassNotFoundException var7) {
         throw new TypeNotPresentException(var2, var7);
      }

      if (var4.isAssignableFrom(var5)) {
         return var1;
      } else if (var5.isAssignableFrom(var4)) {
         return var2;
      } else if (!var4.isInterface() && !var5.isInterface()) {
         do {
            var4 = var4.getSuperclass();
         } while(!var4.isAssignableFrom(var5));

         return var4.getName().replace('.', '/');
      } else {
         return "java/lang/Object";
      }
   }

   protected ClassLoader method_600() {
      return this.getClass().getClassLoader();
   }
}
