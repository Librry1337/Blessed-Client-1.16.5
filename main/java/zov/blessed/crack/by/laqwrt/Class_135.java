package zov.blessed.crack.by.laqwrt;

import zov.blessed.crack.by.laqwrt.govno.Class_213;

import java.util.ListIterator;

public class Class_135 implements Iterable<Class_228> {
   private int イみテろカツをさのユいまめのネくオ;
   private Class_228 ウニかほえみヌマよいセイよケんオス;
   private Class_228 エてすフさナいホよさのぬろひトらは;
   Class_228[] オルをハきミゆエれもツヌオをマエせ;

   public int size() {
      return this.イみテろカツをさのユいまめのネくオ;
   }

   public Class_228 getFirst() {
      return this.ウニかほえみヌマよいセイよケんオス;
   }

   public Class_228 getLast() {
      return this.エてすフさナいホよさのぬろひトらは;
   }

   public Class_228 get(int var1) {
      if (var1 >= 0 && var1 < this.イみテろカツをさのユいまめのネくオ) {
         if (this.オルをハきミゆエれもツヌオをマエせ == null) {
            this.オルをハきミゆエれもツヌオをマエせ = this.toArray();
         }

         return this.オルをハきミゆエれもツヌオをマエせ[var1];
      } else {
         throw new IndexOutOfBoundsException();
      }
   }

   public boolean contains(Class_228 var1) {
      Class_228 var2;
      for(var2 = this.ウニかほえみヌマよいセイよケんオス; var2 != null && var2 != var1; var2 = var2.field_1170) {
      }

      return var2 != null;
   }

   public int indexOf(Class_228 var1) {
      if (this.オルをハきミゆエれもツヌオをマエせ == null) {
         this.オルをハきミゆエれもツヌオをマエせ = this.toArray();
      }

      return var1.field_1171;
   }

   public void accept(Class_213 var1) {
      for(Class_228 var2 = this.ウニかほえみヌマよいセイよケんオス; var2 != null; var2 = var2.field_1170) {
         var2.よう(var1);
      }

   }

   public ListIterator<Class_228> iterator() {
      return this.iterator(0);
   }

   public ListIterator<Class_228> iterator(int var1) {
      return new Class_183(this, var1);
   }

   public Class_228[] toArray() {
      int var1 = 0;
      Class_228 var2 = this.ウニかほえみヌマよいセイよケんオス;

      Class_228[] var3;
      for(var3 = new Class_228[this.イみテろカツをさのユいまめのネくオ]; var2 != null; var2 = var2.field_1170) {
         var3[var1] = var2;
         var2.field_1171 = var1++;
      }

      return var3;
   }

   public void set(Class_228 var1, Class_228 var2) {
      Class_228 var3 = var1.field_1170;
      var2.field_1170 = var3;
      if (var3 != null) {
         var3.field_1169 = var2;
      } else {
         this.エてすフさナいホよさのぬろひトらは = var2;
      }

      Class_228 var4 = var1.field_1169;
      var2.field_1169 = var4;
      if (var4 != null) {
         var4.field_1170 = var2;
      } else {
         this.ウニかほえみヌマよいセイよケんオス = var2;
      }

      if (this.オルをハきミゆエれもツヌオをマエせ != null) {
         int var5 = var1.field_1171;
         this.オルをハきミゆエれもツヌオをマエせ[var5] = var2;
         var2.field_1171 = var5;
      } else {
         var2.field_1171 = 0;
      }

      var1.field_1171 = -1;
      var1.field_1169 = null;
      var1.field_1170 = null;
   }

   public void add(Class_228 var1) {
      ++this.イみテろカツをさのユいまめのネくオ;
      if (this.エてすフさナいホよさのぬろひトらは == null) {
         this.ウニかほえみヌマよいセイよケんオス = var1;
         this.エてすフさナいホよさのぬろひトらは = var1;
      } else {
         this.エてすフさナいホよさのぬろひトらは.field_1170 = var1;
         var1.field_1169 = this.エてすフさナいホよさのぬろひトらは;
      }

      this.エてすフさナいホよさのぬろひトらは = var1;
      this.オルをハきミゆエれもツヌオをマエせ = null;
      var1.field_1171 = 0;
   }

   public void add(Class_135 var1) {
      if (var1.イみテろカツをさのユいまめのネくオ != 0) {
         this.イみテろカツをさのユいまめのネくオ += var1.イみテろカツをさのユいまめのネくオ;
         if (this.エてすフさナいホよさのぬろひトらは == null) {
            this.ウニかほえみヌマよいセイよケんオス = var1.ウニかほえみヌマよいセイよケんオス;
            this.エてすフさナいホよさのぬろひトらは = var1.エてすフさナいホよさのぬろひトらは;
         } else {
            Class_228 var2 = var1.ウニかほえみヌマよいセイよケんオス;
            this.エてすフさナいホよさのぬろひトらは.field_1170 = var2;
            var2.field_1169 = this.エてすフさナいホよさのぬろひトらは;
            this.エてすフさナいホよさのぬろひトらは = var1.エてすフさナいホよさのぬろひトらは;
         }

         this.オルをハきミゆエれもツヌオをマエせ = null;
         var1.removeAll(false);
      }
   }

   public void insert(Class_228 var1) {
      ++this.イみテろカツをさのユいまめのネくオ;
      if (this.ウニかほえみヌマよいセイよケんオス == null) {
         this.ウニかほえみヌマよいセイよケんオス = var1;
         this.エてすフさナいホよさのぬろひトらは = var1;
      } else {
         this.ウニかほえみヌマよいセイよケんオス.field_1169 = var1;
         var1.field_1170 = this.ウニかほえみヌマよいセイよケんオス;
      }

      this.ウニかほえみヌマよいセイよケんオス = var1;
      this.オルをハきミゆエれもツヌオをマエせ = null;
      var1.field_1171 = 0;
   }

   public void insert(Class_135 var1) {
      if (var1.イみテろカツをさのユいまめのネくオ != 0) {
         this.イみテろカツをさのユいまめのネくオ += var1.イみテろカツをさのユいまめのネくオ;
         if (this.ウニかほえみヌマよいセイよケんオス == null) {
            this.ウニかほえみヌマよいセイよケんオス = var1.ウニかほえみヌマよいセイよケんオス;
            this.エてすフさナいホよさのぬろひトらは = var1.エてすフさナいホよさのぬろひトらは;
         } else {
            Class_228 var2 = var1.エてすフさナいホよさのぬろひトらは;
            this.ウニかほえみヌマよいセイよケんオス.field_1169 = var2;
            var2.field_1170 = this.ウニかほえみヌマよいセイよケんオス;
            this.ウニかほえみヌマよいセイよケんオス = var1.ウニかほえみヌマよいセイよケんオス;
         }

         this.オルをハきミゆエれもツヌオをマエせ = null;
         var1.removeAll(false);
      }
   }

   public void insert(Class_228 var1, Class_228 var2) {
      ++this.イみテろカツをさのユいまめのネくオ;
      Class_228 var3 = var1.field_1170;
      if (var3 == null) {
         this.エてすフさナいホよさのぬろひトらは = var2;
      } else {
         var3.field_1169 = var2;
      }

      var1.field_1170 = var2;
      var2.field_1170 = var3;
      var2.field_1169 = var1;
      this.オルをハきミゆエれもツヌオをマエせ = null;
      var2.field_1171 = 0;
   }

   public void insert(Class_228 var1, Class_135 var2) {
      if (var2.イみテろカツをさのユいまめのネくオ != 0) {
         this.イみテろカツをさのユいまめのネくオ += var2.イみテろカツをさのユいまめのネくオ;
         Class_228 var3 = var2.ウニかほえみヌマよいセイよケんオス;
         Class_228 var4 = var2.エてすフさナいホよさのぬろひトらは;
         Class_228 var5 = var1.field_1170;
         if (var5 == null) {
            this.エてすフさナいホよさのぬろひトらは = var4;
         } else {
            var5.field_1169 = var4;
         }

         var1.field_1170 = var3;
         var4.field_1170 = var5;
         var3.field_1169 = var1;
         this.オルをハきミゆエれもツヌオをマエせ = null;
         var2.removeAll(false);
      }
   }

   public void insertBefore(Class_228 var1, Class_228 var2) {
      ++this.イみテろカツをさのユいまめのネくオ;
      Class_228 var3 = var1.field_1169;
      if (var3 == null) {
         this.ウニかほえみヌマよいセイよケんオス = var2;
      } else {
         var3.field_1170 = var2;
      }

      var1.field_1169 = var2;
      var2.field_1170 = var1;
      var2.field_1169 = var3;
      this.オルをハきミゆエれもツヌオをマエせ = null;
      var2.field_1171 = 0;
   }

   public void insertBefore(Class_228 var1, Class_135 var2) {
      if (var2.イみテろカツをさのユいまめのネくオ != 0) {
         this.イみテろカツをさのユいまめのネくオ += var2.イみテろカツをさのユいまめのネくオ;
         Class_228 var3 = var2.ウニかほえみヌマよいセイよケんオス;
         Class_228 var4 = var2.エてすフさナいホよさのぬろひトらは;
         Class_228 var5 = var1.field_1169;
         if (var5 == null) {
            this.ウニかほえみヌマよいセイよケんオス = var3;
         } else {
            var5.field_1170 = var3;
         }

         var1.field_1169 = var4;
         var4.field_1170 = var1;
         var3.field_1169 = var5;
         this.オルをハきミゆエれもツヌオをマエせ = null;
         var2.removeAll(false);
      }
   }

   public void remove(Class_228 var1) {
      --this.イみテろカツをさのユいまめのネくオ;
      Class_228 var2 = var1.field_1170;
      Class_228 var3 = var1.field_1169;
      if (var2 == null) {
         if (var3 == null) {
            this.ウニかほえみヌマよいセイよケんオス = null;
            this.エてすフさナいホよさのぬろひトらは = null;
         } else {
            var3.field_1170 = null;
            this.エてすフさナいホよさのぬろひトらは = var3;
         }
      } else if (var3 == null) {
         this.ウニかほえみヌマよいセイよケんオス = var2;
         var2.field_1169 = null;
      } else {
         var3.field_1170 = var2;
         var2.field_1169 = var3;
      }

      this.オルをハきミゆエれもツヌオをマエせ = null;
      var1.field_1171 = -1;
      var1.field_1169 = null;
      var1.field_1170 = null;
   }

   void removeAll(boolean var1) {
      Class_228 var3;
      if (var1) {
         for(Class_228 var2 = this.ウニかほえみヌマよいセイよケんオス; var2 != null; var2 = var3) {
            var3 = var2.field_1170;
            var2.field_1171 = -1;
            var2.field_1169 = null;
            var2.field_1170 = null;
         }
      }

      this.イみテろカツをさのユいまめのネくオ = 0;
      this.ウニかほえみヌマよいセイよケんオス = null;
      this.エてすフさナいホよさのぬろひトらは = null;
      this.オルをハきミゆエれもツヌオをマエせ = null;
   }

   public void clear() {
      this.removeAll(false);
   }

   public void resetLabels() {
      for(Class_228 var1 = this.ウニかほえみヌマよいセイよケんオス; var1 != null; var1 = var1.field_1170) {
         if (var1 instanceof Class_252) {
            ((Class_252)var1).method_1141();
         }
      }

   }
}
