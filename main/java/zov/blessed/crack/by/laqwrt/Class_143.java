package zov.blessed.crack.by.laqwrt;

import zov.blessed.crack.by.laqwrt.animations.Class_137;
import zov.blessed.crack.by.laqwrt.animations.Class_56;

public abstract class Class_143<T> {
   private long field_721;
   private double field_722;
   private T field_723;
   private T field_724;
   private T field_725;
   private Class_137 field_726;
   private boolean field_727;

   public Class_143(Class_137 var1) {
      this.field_726 = var1;
      this.field_727 = false;
      this.field_725 = this.ヌル();
   }

   public Class_143() {
      this(Class_56.field_286);
   }

   public <F extends Class_143<T>> F method_483(T var1, double var2) {
      if (this.method_492() != null) {
         this.method_484();
      }

      if (this.method_489(this.method_496(), var1)) {
         this.method_501(var2 * 1000.0D);
         this.method_497(System.currentTimeMillis());
         this.method_498(this.method_494());
         this.method_499(var1);
      }

      return (F) this;
   }

   public <F extends Class_143<T>> F method_484() {
      double var1 = this.method_488();
      Object var3;
      if (var1 <= 1.0D) {
         var1 = this.method_495().むナ12(var1);
         var3 = this.ヒあ1(this.method_492(), this.method_493(), var1);
      } else {
         this.method_497(0L);
         var3 = this.method_493();
      }

      this.method_500((T) var3);
      return (F) this;
   }

   public boolean method_485() {
      return !this.method_486();
   }

   public boolean method_486() {
      return this.method_488() >= 1.0D;
   }

   public void method_487() {
      this.method_497(System.currentTimeMillis());
   }

   public double method_488() {
      return (double)(System.currentTimeMillis() - this.method_490()) / this.method_491();
   }

   public boolean method_489(boolean var1, T var2) {
      boolean var3 = !var2.equals(this.method_493());
      return var1 ? !this.method_485() && var3 : var3;
   }

   public abstract T ヒあ1(T var1, T var2, double var3);

   public abstract T ヌル();

   public long method_490() {
      return this.field_721;
   }

   public double method_491() {
      return this.field_722;
   }

   public T method_492() {
      return this.field_723;
   }

   public T method_493() {
      return this.field_724;
   }

   public T method_494() {
      return this.field_725;
   }

   public Class_137 method_495() {
      return this.field_726;
   }

   public boolean method_496() {
      return this.field_727;
   }

   public <F extends Class_143<T>> Class_143<T> method_497(long var1) {
      this.field_721 = var1;
      return (F) this;
   }

   public <F extends Class_143<T>> Class_143<T> method_498(T var1) {
      this.field_723 = var1;
      return this;
   }

   public <F extends Class_143<T>> Class_143<T> method_499(T var1) {
      this.field_724 = var1;
      return this;
   }

   public <F extends Class_143<T>> Class_143<T> method_500(T var1) {
      this.field_725 = var1;
      return this;
   }

   public <F extends Class_143<T>> Class_143<T> method_501(double var1) {
      this.field_722 = var1;
      return this;
   }

   public <F extends Class_143<T>> Class_143<T> method_502(Class_137 var1) {
      this.field_726 = var1;
      return this;
   }

   public <F extends Class_143<T>> Class_143<T> method_503(boolean var1) {
      this.field_727 = var1;
      return this;
   }

   public String toString() {
      return "Animation(value=" + this.field_725.toString() + ", duration=" + this.field_722 + ", safe=" + this.field_727 + ")";
   }
}
