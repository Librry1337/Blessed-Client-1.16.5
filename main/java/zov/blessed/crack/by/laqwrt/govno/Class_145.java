package zov.blessed.crack.by.laqwrt.govno;

public class Class_145 {
   public static int field_729 = 0;
   public static int field_730 = 1;
   public static int field_731 = 16;
   public static int field_732 = 17;
   public static int field_733 = 18;
   public static int field_734 = 19;
   public static int field_735 = 20;
   public static int field_736 = 21;
   public static int field_737 = 22;
   public static int field_738 = 23;
   public static int field_739 = 64;
   public static int field_740 = 65;
   public static int field_741 = 66;
   public static int field_742 = 67;
   public static int field_743 = 68;
   public static int field_744 = 69;
   public static int field_745 = 70;
   public static int field_746 = 71;
   public static int field_747 = 72;
   public static int field_748 = 73;
   public static int field_749 = 74;
   public static int field_750 = 75;
   private final int field_751;

   public Class_145(int var1) {
      this.field_751 = var1;
   }

   public static Class_145 method_504(int var0) {
      return new Class_145(var0 << 24);
   }

   public static Class_145 method_505(int var0, int var1) {
      return new Class_145(var0 << 24 | var1 << 16);
   }

   public static Class_145 method_506(int var0, int var1, int var2) {
      return new Class_145(var0 << 24 | var1 << 16 | var2 << 8);
   }

   public static Class_145 method_507(int var0) {
      return new Class_145(268435456 | (var0 & '\uffff') << 8);
   }

   public static Class_145 method_508(int var0) {
      return new Class_145(369098752 | var0 << 16);
   }

   public static Class_145 method_509(int var0) {
      return new Class_145(385875968 | var0 << 8);
   }

   public static Class_145 method_510(int var0) {
      return new Class_145(1107296256 | var0 << 8);
   }

   public static Class_145 method_511(int var0, int var1) {
      return new Class_145(var0 << 24 | var1);
   }

   public int method_512() {
      return this.field_751 >>> 24;
   }

   public int method_513() {
      return (this.field_751 & 16711680) >> 16;
   }

   public int method_514() {
      return (this.field_751 & '\uff00') >> 8;
   }

   public int method_515() {
      return (short)((this.field_751 & 16776960) >> 8);
   }

   public int method_516() {
      return (this.field_751 & 16711680) >> 16;
   }

   public int method_517() {
      return (this.field_751 & 16776960) >> 8;
   }

   public int method_518() {
      return (this.field_751 & 16776960) >> 8;
   }

   public int method_519() {
      return this.field_751 & 255;
   }

   public int method_520() {
      return this.field_751;
   }

   static void method_521(int var0, Class_25 var1) {
      switch(var0 >>> 24) {
      case 0:
      case 1:
      case 22:
         var1.method_24(var0 >>> 16);
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
      case 64:
      case 65:
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
         var1.method_25(var0 >>> 24, (var0 & 16776960) >> 8);
         break;
      case 19:
      case 20:
      case 21:
         var1.method_22(var0 >>> 24);
         break;
      case 71:
      case 72:
      case 73:
      case 74:
      case 75:
         var1.method_27(var0);
      }

   }
}
