package zov.blessed.crack.by.laqwrt.clickgui;

public class TimerUtil {
   private long field_757 = 0L;
   private long field_758 = 0L;

   public boolean method_538(long var1) {
      return System.currentTimeMillis() - this.field_757 >= var1;
   }

   public long method_539() {
      return System.nanoTime() / 1000000L;
   }

   public void method_540(long var1) {
      this.field_757 = var1;
   }

   public void method_541() {
      this.field_757 = System.currentTimeMillis();
   }

   public int method_542(int var1) {
      return 1000 / var1;
   }

   public boolean method_543(float var1) {
      return (float)(this.method_539() - this.field_757) >= var1;
   }

   public boolean method_544(double var1) {
      return (double)this.method_549() >= var1;
   }

   public boolean method_545(float var1) {
      boolean var2 = (float)(this.method_539() - this.field_757) >= var1;
      if (var2) {
         this.method_546();
      }

      return var2;
   }

   public void method_546() {
      this.field_757 = this.method_539();
   }

   public boolean method_547(float var1) {
      return (float)(this.method_548() - this.field_758) >= var1;
   }

   public long method_548() {
      return System.nanoTime() / 1000000L;
   }

   public long method_549() {
      return this.method_539() - this.field_757;
   }
}
