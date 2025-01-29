package zov.blessed.crack.by.laqwrt.govno;

public abstract class Class_181 {
   protected final int field_967;
   protected Class_181 field_968;

   public Class_181(int var1) {
      this(var1, (Class_181)null);
   }

   public Class_181(int var1, Class_181 var2) {
      if (var1 != 589824 && var1 != 524288 && var1 != 458752 && var1 != 393216 && var1 != 327680 && var1 != 262144 && var1 != 17432576) {
         throw new IllegalArgumentException("Unsupported api " + var1);
      } else {
         if (var1 == 17432576) {
            Class_20.method_17(this);
         }

         this.field_967 = var1;
         this.field_968 = var2;
      }
   }

   public void method_747(int var1, int var2, String var3, String var4, String var5, String[] var6) {
      if (this.field_967 < 524288 && (var2 & 65536) != 0) {
         throw new UnsupportedOperationException("Records requires ASM8");
      } else {
         if (this.field_968 != null) {
            this.field_968.method_747(var1, var2, var3, var4, var5, var6);
         }

      }
   }

   public void method_748(String var1, String var2) {
      if (this.field_968 != null) {
         this.field_968.method_748(var1, var2);
      }

   }

   public Class_65 method_749(String var1, int var2, String var3) {
      if (this.field_967 < 393216) {
         throw new UnsupportedOperationException("Module requires ASM6");
      } else {
         return this.field_968 != null ? this.field_968.method_749(var1, var2, var3) : null;
      }
   }

   public void method_750(String var1) {
      if (this.field_967 < 458752) {
         throw new UnsupportedOperationException("NestHost requires ASM7");
      } else {
         if (this.field_968 != null) {
            this.field_968.method_750(var1);
         }

      }
   }

   public void method_751(String var1, String var2, String var3) {
      if (this.field_968 != null) {
         this.field_968.method_751(var1, var2, var3);
      }

   }

   public Class_194 method_752(String var1, boolean var2) {
      return this.field_968 != null ? this.field_968.method_752(var1, var2) : null;
   }

   public Class_194 method_753(int var1, Class_82 var2, String var3, boolean var4) {
      if (this.field_967 < 327680) {
         throw new UnsupportedOperationException("TypeAnnotation requires ASM5");
      } else {
         return this.field_968 != null ? this.field_968.method_753(var1, var2, var3, var4) : null;
      }
   }

   public void method_754(Class_98 var1) {
      if (this.field_968 != null) {
         this.field_968.method_754(var1);
      }

   }

   public void method_755(String var1) {
      if (this.field_967 < 458752) {
         throw new UnsupportedOperationException("NestMember requires ASM7");
      } else {
         if (this.field_968 != null) {
            this.field_968.method_755(var1);
         }

      }
   }

   public void method_756(String var1) {
      if (this.field_967 < 589824) {
         throw new UnsupportedOperationException("PermittedSubclasses requires ASM9");
      } else {
         if (this.field_968 != null) {
            this.field_968.method_756(var1);
         }

      }
   }

   public void method_757(String var1, String var2, String var3, int var4) {
      if (this.field_968 != null) {
         this.field_968.method_757(var1, var2, var3, var4);
      }

   }

   public Class_193 method_758(String var1, String var2, String var3) {
      if (this.field_967 < 524288) {
         throw new UnsupportedOperationException("Record requires ASM8");
      } else {
         return this.field_968 != null ? this.field_968.method_758(var1, var2, var3) : null;
      }
   }

   public Class_192 method_759(int var1, String var2, String var3, String var4, Object var5) {
      return this.field_968 != null ? this.field_968.method_759(var1, var2, var3, var4, var5) : null;
   }

   public Class_213 method_760(int var1, String var2, String var3, String var4, String[] var5) {
      return this.field_968 != null ? this.field_968.method_760(var1, var2, var3, var4, var5) : null;
   }

   public void method_761() {
      if (this.field_968 != null) {
         this.field_968.method_761();
      }

   }
}
