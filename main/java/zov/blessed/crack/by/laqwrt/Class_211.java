package zov.blessed.crack.by.laqwrt;

import zov.blessed.crack.by.laqwrt.govno.*;

import java.util.ArrayList;
import java.util.List;

public class Class_211 extends Class_213 {
   public int field_1083;
   public String field_1084;
   public String field_1085;
   public String field_1086;
   public List<String> field_1087;
   public List<Class_3> field_1088;
   public List<Class_136> field_1089;
   public List<Class_136> field_1090;
   public List<Class_273> field_1091;
   public List<Class_273> field_1092;
   public List<Class_98> field_1093;
   public Object field_1094;
   public int field_1095;
   public List<Class_136>[] field_1096;
   public int field_1097;
   public List<Class_136>[] field_1098;
   public Class_135 field_1099;
   public List<Class_271> field_1100;
   public int field_1101;
   public int field_1102;
   public List<Class_44> field_1103;
   public List<Class_31> field_1104;
   public List<Class_31> field_1105;
   private boolean field_1106;

   public Class_211() {
      this(589824);
      if (this.getClass() != Class_211.class) {
         throw new IllegalStateException();
      }
   }

   public Class_211(int var1) {
      super(var1);
      this.field_1099 = new Class_135();
   }

   public Class_211(int var1, String var2, String var3, String var4, String[] var5) {
      this(589824, var1, var2, var3, var4, var5);
      if (this.getClass() != Class_211.class) {
         throw new IllegalStateException();
      }
   }

   public Class_211(int var1, int var2, String var3, String var4, String var5, String[] var6) {
      super(var1);
      this.field_1083 = var2;
      this.field_1084 = var3;
      this.field_1085 = var4;
      this.field_1086 = var5;
      this.field_1087 = Class_166.method_641(var6);
      if ((var2 & 1024) == 0) {
         this.field_1103 = new ArrayList<>(5);
      }

      this.field_1100 = new ArrayList<>();
      this.field_1099 = new Class_135();
   }

   public void method_920(String var1, int var2) {
      if (this.field_1088 == null) {
         this.field_1088 = new ArrayList<>(5);
      }

      this.field_1088.add(new Class_3(var1, var2));
   }

   public Class_194 method_921() {
      return new Class_136(new ArrayList<Object>(0) {
         public boolean add(Object var1) {
            Class_211.this.field_1094 = var1;
            return super.add(var1);
         }
      });
   }

   public Class_194 method_922(String var1, boolean var2) {
      Class_136 var3 = new Class_136(var1);
      if (var2) {
         this.field_1089 = Class_166.method_639(this.field_1089, var3);
      } else {
         this.field_1090 = Class_166.method_639(this.field_1090, var3);
      }

      return var3;
   }

   public Class_194 method_923(int var1, Class_82 var2, String var3, boolean var4) {
      Class_273 var5 = new Class_273(var1, var2, var3);
      if (var4) {
         this.field_1091 = Class_166.method_639(this.field_1091, var5);
      } else {
         this.field_1092 = Class_166.method_639(this.field_1092, var5);
      }

      return var5;
   }

   public void method_924(int var1, boolean var2) {
      if (var2) {
         this.field_1095 = var1;
      } else {
         this.field_1097 = var1;
      }

   }

   public Class_194 method_925(int var1, String var2, boolean var3) {
      Class_136 var4 = new Class_136(var2);
      int var5;
      if (var3) {
         if (this.field_1096 == null) {
            var5 = Class_260.method_1197(this.field_1085).length;
            this.field_1096 = new List[var5];
         }

         this.field_1096[var1] = Class_166.method_639(this.field_1096[var1], var4);
      } else {
         if (this.field_1098 == null) {
            var5 = Class_260.method_1197(this.field_1085).length;
            this.field_1098 = new List[var5];
         }

         this.field_1098[var1] = Class_166.method_639(this.field_1098[var1], var4);
      }

      return var4;
   }

   public void method_926(Class_98 var1) {
      this.field_1093 = Class_166.method_639(this.field_1093, var1);
   }

   public void method_927() {
   }

   public void method_928(int var1, int var2, Object[] var3, int var4, Object[] var5) {
      this.field_1099.add((Class_228)(new Class_227(var1, var2, var3 == null ? null : this.method_911(var3), var4, var5 == null ? null : this.method_911(var5))));
   }

   public void method_929(int var1) {
      this.field_1099.add((Class_228)(new Class_159(var1)));
   }

   public void method_930(int var1, int var2) {
      this.field_1099.add((Class_228)(new Class_79(var1, var2)));
   }

   public void method_931(int var1, int var2) {
      this.field_1099.add((Class_228)(new Class_157(var1, var2)));
   }

   public void method_932(int var1, String var2) {
      this.field_1099.add((Class_228)(new Class_204(var1, var2)));
   }

   public void method_933(int var1, String var2, String var3, String var4) {
      this.field_1099.add((Class_228)(new Class_173(var1, var2, var3, var4)));
   }

   public void method_935(int var1, String var2, String var3, String var4, boolean var5) {
      if (this.field_1108 < 327680 && (var1 & 256) == 0) {
         super.method_935(var1, var2, var3, var4, var5);
      } else {
         int var6 = var1 & -257;
         this.field_1099.add((Class_228)(new Class_207(var6, var2, var3, var4, var5)));
      }
   }

   public void method_936(String var1, String var2, Class_206 var3, Object... var4) {
      this.field_1099.add((Class_228)(new Class_74(var1, var2, var3, var4)));
   }

   public void method_937(int var1, Class_262 var2) {
      this.field_1099.add((Class_228)(new Class_125(var1, this.method_909(var2))));
   }

   public void method_938(Class_262 var1) {
      this.field_1099.add((Class_228)this.method_909(var1));
   }

   public void method_939(Object var1) {
      this.field_1099.add((Class_228)(new Class_180(var1)));
   }

   public void method_940(int var1, int var2) {
      this.field_1099.add((Class_228)(new Class_58(var1, var2)));
   }

   public void method_941(int var1, int var2, Class_262 var3, Class_262... var4) {
      this.field_1099.add((Class_228)(new Class_121(var1, var2, this.method_909(var3), this.method_910(var4))));
   }

   public void method_942(Class_262 var1, int[] var2, Class_262[] var3) {
      this.field_1099.add((Class_228)(new Class_185(this.method_909(var1), var2, this.method_910(var3))));
   }

   public void method_943(String var1, int var2) {
      this.field_1099.add((Class_228)(new Class_167(var1, var2)));
   }

   public Class_194 method_944(int var1, Class_82 var2, String var3, boolean var4) {
      Class_228 var5;
      for(var5 = this.field_1099.getLast(); var5.method_1032() == -1; var5 = var5.method_1033()) {
      }

      Class_273 var6 = new Class_273(var1, var2, var3);
      if (var4) {
         var5.field_1167 = Class_166.method_639(var5.field_1167, var6);
      } else {
         var5.field_1168 = Class_166.method_639(var5.field_1168, var6);
      }

      return var6;
   }

   public void method_945(Class_262 var1, Class_262 var2, Class_262 var3, String var4) {
      Class_271 var5 = new Class_271(this.method_909(var1), this.method_909(var2), this.method_909(var3), var4);
      this.field_1100 = Class_166.method_639(this.field_1100, var5);
   }

   public Class_194 method_946(int var1, Class_82 var2, String var3, boolean var4) {
      Class_271 var5 = (Class_271)this.field_1100.get((var1 & 16776960) >> 8);
      Class_273 var6 = new Class_273(var1, var2, var3);
      if (var4) {
         var5.field_1295 = Class_166.method_639(var5.field_1295, var6);
      } else {
         var5.field_1296 = Class_166.method_639(var5.field_1296, var6);
      }

      return var6;
   }

   public void method_947(String var1, String var2, String var3, Class_262 var4, Class_262 var5, int var6) {
      Class_44 var7 = new Class_44(var1, var2, var3, this.method_909(var4), this.method_909(var5), var6);
      this.field_1103 = Class_166.method_639(this.field_1103, var7);
   }

   public Class_194 method_948(int var1, Class_82 var2, Class_262[] var3, Class_262[] var4, int[] var5, String var6, boolean var7) {
      Class_31 var8 = new Class_31(var1, var2, this.method_910(var3), this.method_910(var4), var5, var6);
      if (var7) {
         this.field_1104 = Class_166.method_639(this.field_1104, var8);
      } else {
         this.field_1105 = Class_166.method_639(this.field_1105, var8);
      }

      return var8;
   }

   public void method_949(int var1, Class_262 var2) {
      this.field_1099.add((Class_228)(new Class_210(var1, this.method_909(var2))));
   }

   public void method_950(int var1, int var2) {
      this.field_1101 = var1;
      this.field_1102 = var2;
   }

   public void method_951() {
   }

   protected Class_252 method_909(Class_262 var1) {
      if (!(var1.field_1260 instanceof Class_252)) {
         var1.field_1260 = new Class_252();
      }

      return (Class_252)var1.field_1260;
   }

   private Class_252[] method_910(Class_262[] var1) {
      Class_252[] var2 = new Class_252[var1.length];
      int var3 = 0;

      for(int var4 = var1.length; var3 < var4; ++var3) {
         var2[var3] = this.method_909(var1[var3]);
      }

      return var2;
   }

   private Object[] method_911(Object[] var1) {
      Object[] var2 = new Object[var1.length];
      int var3 = 0;

      for(int var4 = var1.length; var3 < var4; ++var3) {
         Object var5 = var1[var3];
         if (var5 instanceof Class_262) {
            var5 = this.method_909((Class_262)var5);
         }

         var2[var3] = var5;
      }

      return var2;
   }

   public void method_912(int var1) {
      int var2;
      Class_228 var5;
      Object var6;
      if (var1 == 262144) {
         if (this.field_1088 != null && !this.field_1088.isEmpty()) {
            throw new Class_52();
         }

         if (this.field_1091 != null && !this.field_1091.isEmpty()) {
            throw new Class_52();
         }

         if (this.field_1092 != null && !this.field_1092.isEmpty()) {
            throw new Class_52();
         }

         if (this.field_1100 != null) {
            for(var2 = this.field_1100.size() - 1; var2 >= 0; --var2) {
               Class_271 var3 = (Class_271)this.field_1100.get(var2);
               if (var3.field_1295 != null && !var3.field_1295.isEmpty()) {
                  throw new Class_52();
               }

               if (var3.field_1296 != null && !var3.field_1296.isEmpty()) {
                  throw new Class_52();
               }
            }
         }

         var2 = this.field_1099.size() - 1;

         while(true) {
            if (var2 < 0) {
               if (this.field_1104 != null && !this.field_1104.isEmpty()) {
                  throw new Class_52();
               }

               if (this.field_1105 != null && !this.field_1105.isEmpty()) {
                  throw new Class_52();
               }
               break;
            }

            var5 = this.field_1099.get(var2);
            if (var5.field_1167 != null && !var5.field_1167.isEmpty()) {
               throw new Class_52();
            }

            if (var5.field_1168 != null && !var5.field_1168.isEmpty()) {
               throw new Class_52();
            }

            if (var5 instanceof Class_207) {
               boolean var4 = ((Class_207)var5).field_1080;
               if (var4 != (var5.field_1166 == 185)) {
                  throw new Class_52();
               }
            } else if (var5 instanceof Class_180) {
               var6 = ((Class_180)var5).field_966;
               if (var6 instanceof Class_206 || var6 instanceof Class_260 && ((Class_260)var6).method_1214() == 11) {
                  throw new Class_52();
               }
            }

            --var2;
         }
      }

      if (var1 < 458752) {
         for(var2 = this.field_1099.size() - 1; var2 >= 0; --var2) {
            var5 = this.field_1099.get(var2);
            if (var5 instanceof Class_180) {
               var6 = ((Class_180)var5).field_966;
               if (var6 instanceof Class_242) {
                  throw new Class_52();
               }
            }
         }
      }

   }

   public void method_913(Class_181 var1) {
      String[] var2 = this.field_1087 == null ? null : (String[])this.field_1087.toArray(new String[0]);
      Class_213 var3 = var1.method_760(this.field_1083, this.field_1084, this.field_1085, this.field_1086, var2);
      if (var3 != null) {
         this.method_914(var3);
      }

   }

   public void method_914(Class_213 var1) {
      int var2;
      int var3;
      if (this.field_1088 != null) {
         var2 = 0;

         for(var3 = this.field_1088.size(); var2 < var3; ++var2) {
            ((Class_3)this.field_1088.get(var2)).method_0(var1);
         }
      }

      if (this.field_1094 != null) {
         Class_194 var8 = var1.method_921();
         Class_136.method_441(var8, (String)null, this.field_1094);
         if (var8 != null) {
            var8.method_855();
         }
      }

      Class_136 var4;
      if (this.field_1089 != null) {
         var2 = 0;

         for(var3 = this.field_1089.size(); var2 < var3; ++var2) {
            var4 = (Class_136)this.field_1089.get(var2);
            var4.method_440(var1.method_922(var4.field_712, true));
         }
      }

      if (this.field_1090 != null) {
         var2 = 0;

         for(var3 = this.field_1090.size(); var2 < var3; ++var2) {
            var4 = (Class_136)this.field_1090.get(var2);
            var4.method_440(var1.method_922(var4.field_712, false));
         }
      }

      Class_273 var9;
      if (this.field_1091 != null) {
         var2 = 0;

         for(var3 = this.field_1091.size(); var2 < var3; ++var2) {
            var9 = (Class_273)this.field_1091.get(var2);
            var9.method_440(var1.method_923(var9.field_1301, var9.field_1302, var9.field_712, true));
         }
      }

      if (this.field_1092 != null) {
         var2 = 0;

         for(var3 = this.field_1092.size(); var2 < var3; ++var2) {
            var9 = (Class_273)this.field_1092.get(var2);
            var9.method_440(var1.method_923(var9.field_1301, var9.field_1302, var9.field_712, false));
         }
      }

      if (this.field_1095 > 0) {
         var1.method_924(this.field_1095, true);
      }

      int var5;
      int var6;
      Class_136 var7;
      List var10;
      if (this.field_1096 != null) {
         var2 = 0;

         for(var3 = this.field_1096.length; var2 < var3; ++var2) {
            var10 = this.field_1096[var2];
            if (var10 != null) {
               var5 = 0;

               for(var6 = var10.size(); var5 < var6; ++var5) {
                  var7 = (Class_136)var10.get(var5);
                  var7.method_440(var1.method_925(var2, var7.field_712, true));
               }
            }
         }
      }

      if (this.field_1097 > 0) {
         var1.method_924(this.field_1097, false);
      }

      if (this.field_1098 != null) {
         var2 = 0;

         for(var3 = this.field_1098.length; var2 < var3; ++var2) {
            var10 = this.field_1098[var2];
            if (var10 != null) {
               var5 = 0;

               for(var6 = var10.size(); var5 < var6; ++var5) {
                  var7 = (Class_136)var10.get(var5);
                  var7.method_440(var1.method_925(var2, var7.field_712, false));
               }
            }
         }
      }

      if (this.field_1106) {
         this.field_1099.resetLabels();
      }

      if (this.field_1093 != null) {
         var2 = 0;

         for(var3 = this.field_1093.size(); var2 < var3; ++var2) {
            var1.method_926((Class_98)this.field_1093.get(var2));
         }
      }

      if (this.field_1099.size() > 0) {
         var1.method_927();
         if (this.field_1100 != null) {
            var2 = 0;

            for(var3 = this.field_1100.size(); var2 < var3; ++var2) {
               ((Class_271)this.field_1100.get(var2)).method_1247(var2);
               ((Class_271)this.field_1100.get(var2)).method_1248(var1);
            }
         }

         this.field_1099.accept(var1);
         if (this.field_1103 != null) {
            var2 = 0;

            for(var3 = this.field_1103.size(); var2 < var3; ++var2) {
               ((Class_44)this.field_1103.get(var2)).method_94(var1);
            }
         }

         if (this.field_1104 != null) {
            var2 = 0;

            for(var3 = this.field_1104.size(); var2 < var3; ++var2) {
               ((Class_31)this.field_1104.get(var2)).method_46(var1, true);
            }
         }

         if (this.field_1105 != null) {
            var2 = 0;

            for(var3 = this.field_1105.size(); var2 < var3; ++var2) {
               ((Class_31)this.field_1105.get(var2)).method_46(var1, false);
            }
         }

         var1.method_950(this.field_1101, this.field_1102);
         this.field_1106 = true;
      }

      var1.method_951();
   }
}
