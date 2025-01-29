package zov.blessed.crack.by.laqwrt;

import zov.blessed.crack.by.laqwrt.govno.*;

import java.util.ArrayList;
import java.util.List;

public class Class_23 extends Class_181 {
   public int field_106;
   public int field_107;
   public String field_108;
   public String field_109;
   public String field_110;
   public List<String> field_111;
   public String field_112;
   public String field_113;
   public Class_269 field_114;
   public String field_115;
   public String field_116;
   public String field_117;
   public List<Class_136> field_118;
   public List<Class_136> field_119;
   public List<Class_273> field_120;
   public List<Class_273> field_121;
   public List<Class_98> field_122;
   public List<Class_221> field_123;
   public String field_124;
   public List<String> field_125;
   public List<String> field_126;
   public List<Class_50> field_127;
   public List<Class_203> field_128;
   public List<Class_211> field_129;

   public Class_23() {
      this(589824);
      if (this.getClass() != Class_23.class) {
         throw new IllegalStateException();
      }
   }

   public Class_23(int var1) {
      super(var1);
      this.field_111 = new ArrayList<>();
      this.field_123 = new ArrayList<>();
      this.field_128 = new ArrayList<>();
      this.field_129 = new ArrayList<>();
   }

   public void method_747(int var1, int var2, String var3, String var4, String var5, String[] var6) {
      this.field_106 = var1;
      this.field_107 = var2;
      this.field_108 = var3;
      this.field_109 = var4;
      this.field_110 = var5;
      this.field_111 = Class_166.method_641(var6);
   }

   public void method_748(String var1, String var2) {
      this.field_112 = var1;
      this.field_113 = var2;
   }

   public Class_65 method_749(String var1, int var2, String var3) {
      this.field_114 = new Class_269(var1, var2, var3);
      return this.field_114;
   }

   public void method_750(String var1) {
      this.field_124 = var1;
   }

   public void method_751(String var1, String var2, String var3) {
      this.field_115 = var1;
      this.field_116 = var2;
      this.field_117 = var3;
   }

   public Class_194 method_752(String var1, boolean var2) {
      Class_136 var3 = new Class_136(var1);
      if (var2) {
         this.field_118 = Class_166.method_639(this.field_118, var3);
      } else {
         this.field_119 = Class_166.method_639(this.field_119, var3);
      }

      return var3;
   }

   public Class_194 method_753(int var1, Class_82 var2, String var3, boolean var4) {
      Class_273 var5 = new Class_273(var1, var2, var3);
      if (var4) {
         this.field_120 = Class_166.method_639(this.field_120, var5);
      } else {
         this.field_121 = Class_166.method_639(this.field_121, var5);
      }

      return var5;
   }

   public void method_754(Class_98 var1) {
      this.field_122 = Class_166.method_639(this.field_122, var1);
   }

   public void method_755(String var1) {
      this.field_125 = Class_166.method_639(this.field_125, var1);
   }

   public void method_756(String var1) {
      this.field_126 = Class_166.method_639(this.field_126, var1);
   }

   public void method_757(String var1, String var2, String var3, int var4) {
      Class_221 var5 = new Class_221(var1, var2, var3, var4);
      this.field_123.add(var5);
   }

   public Class_193 method_758(String var1, String var2, String var3) {
      Class_50 var4 = new Class_50(var1, var2, var3);
      this.field_127 = Class_166.method_639(this.field_127, var4);
      return var4;
   }

   public Class_192 method_759(int var1, String var2, String var3, String var4, Object var5) {
      Class_203 var6 = new Class_203(var1, var2, var3, var4, var5);
      this.field_128.add(var6);
      return var6;
   }

   public Class_213 method_760(int var1, String var2, String var3, String var4, String[] var5) {
      Class_211 var6 = new Class_211(var1, var2, var3, var4, var5);
      this.field_129.add(var6);
      return var6;
   }

   public void method_761() {
   }

   public void method_20(int var1) {
      if (var1 < 589824 && this.field_126 != null) {
         throw new Class_52();
      } else if (var1 < 524288 && ((this.field_107 & 65536) != 0 || this.field_127 != null)) {
         throw new Class_52();
      } else if (var1 >= 458752 || this.field_124 == null && this.field_125 == null) {
         if (var1 < 393216 && this.field_114 != null) {
            throw new Class_52();
         } else {
            if (var1 < 327680) {
               if (this.field_120 != null && !this.field_120.isEmpty()) {
                  throw new Class_52();
               }

               if (this.field_121 != null && !this.field_121.isEmpty()) {
                  throw new Class_52();
               }
            }

            int var2;
            if (this.field_118 != null) {
               for(var2 = this.field_118.size() - 1; var2 >= 0; --var2) {
                  ((Class_136)this.field_118.get(var2)).method_439(var1);
               }
            }

            if (this.field_119 != null) {
               for(var2 = this.field_119.size() - 1; var2 >= 0; --var2) {
                  ((Class_136)this.field_119.get(var2)).method_439(var1);
               }
            }

            if (this.field_120 != null) {
               for(var2 = this.field_120.size() - 1; var2 >= 0; --var2) {
                  ((Class_273)this.field_120.get(var2)).method_439(var1);
               }
            }

            if (this.field_121 != null) {
               for(var2 = this.field_121.size() - 1; var2 >= 0; --var2) {
                  ((Class_273)this.field_121.get(var2)).method_439(var1);
               }
            }

            if (this.field_127 != null) {
               for(var2 = this.field_127.size() - 1; var2 >= 0; --var2) {
                  ((Class_50)this.field_127.get(var2)).method_123(var1);
               }
            }

            for(var2 = this.field_128.size() - 1; var2 >= 0; --var2) {
               ((Class_203)this.field_128.get(var2)).method_894(var1);
            }

            for(var2 = this.field_129.size() - 1; var2 >= 0; --var2) {
               ((Class_211)this.field_129.get(var2)).method_912(var1);
            }

         }
      } else {
         throw new Class_52();
      }
   }

   public void method_21(Class_181 var1) {
      String[] var2 = new String[this.field_111.size()];
      this.field_111.toArray(var2);
      var1.method_747(this.field_106, this.field_107, this.field_108, this.field_109, this.field_110, var2);
      if (this.field_112 != null || this.field_113 != null) {
         var1.method_748(this.field_112, this.field_113);
      }

      if (this.field_114 != null) {
         this.field_114.method_1244(var1);
      }

      if (this.field_124 != null) {
         var1.method_750(this.field_124);
      }

      if (this.field_115 != null) {
         var1.method_751(this.field_115, this.field_116, this.field_117);
      }

      int var3;
      int var4;
      Class_136 var5;
      if (this.field_118 != null) {
         var3 = 0;

         for(var4 = this.field_118.size(); var3 < var4; ++var3) {
            var5 = (Class_136)this.field_118.get(var3);
            var5.method_440(var1.method_752(var5.field_712, true));
         }
      }

      if (this.field_119 != null) {
         var3 = 0;

         for(var4 = this.field_119.size(); var3 < var4; ++var3) {
            var5 = (Class_136)this.field_119.get(var3);
            var5.method_440(var1.method_752(var5.field_712, false));
         }
      }

      Class_273 var6;
      if (this.field_120 != null) {
         var3 = 0;

         for(var4 = this.field_120.size(); var3 < var4; ++var3) {
            var6 = (Class_273)this.field_120.get(var3);
            var6.method_440(var1.method_753(var6.field_1301, var6.field_1302, var6.field_712, true));
         }
      }

      if (this.field_121 != null) {
         var3 = 0;

         for(var4 = this.field_121.size(); var3 < var4; ++var3) {
            var6 = (Class_273)this.field_121.get(var3);
            var6.method_440(var1.method_753(var6.field_1301, var6.field_1302, var6.field_712, false));
         }
      }

      if (this.field_122 != null) {
         var3 = 0;

         for(var4 = this.field_122.size(); var3 < var4; ++var3) {
            var1.method_754((Class_98)this.field_122.get(var3));
         }
      }

      if (this.field_125 != null) {
         var3 = 0;

         for(var4 = this.field_125.size(); var3 < var4; ++var3) {
            var1.method_755((String)this.field_125.get(var3));
         }
      }

      if (this.field_126 != null) {
         var3 = 0;

         for(var4 = this.field_126.size(); var3 < var4; ++var3) {
            var1.method_756((String)this.field_126.get(var3));
         }
      }

      var3 = 0;

      for(var4 = this.field_123.size(); var3 < var4; ++var3) {
         ((Class_221)this.field_123.get(var3)).method_987(var1);
      }

      if (this.field_127 != null) {
         var3 = 0;

         for(var4 = this.field_127.size(); var3 < var4; ++var3) {
            ((Class_50)this.field_127.get(var3)).method_124(var1);
         }
      }

      var3 = 0;

      for(var4 = this.field_128.size(); var3 < var4; ++var3) {
         ((Class_203)this.field_128.get(var3)).method_895(var1);
      }

      var3 = 0;

      for(var4 = this.field_129.size(); var3 < var4; ++var3) {
         ((Class_211)this.field_129.get(var3)).method_913(var1);
      }

      var1.method_761();
   }
}
