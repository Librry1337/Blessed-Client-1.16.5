package zov.blessed.crack.by.laqwrt;

import java.util.ListIterator;
import java.util.NoSuchElementException;

final class Class_183 implements ListIterator {
   Class_228 へイソりおえこミオもト;
   Class_228 ほきユりツあのハんなそ;
   Class_228 まフフまれシすくヘるす;
   // $FF: synthetic field
   final Class_135 みソヌメイなおなへマス;

   Class_183(Class_135 var1, int var2) {
      this.みソヌメイなおなへマス = var1;
      if (var2 >= 0 && var2 <= var1.size()) {
         if (var2 == var1.size()) {
            this.へイソりおえこミオもト = null;
            this.ほきユりツあのハんなそ = var1.getLast();
         } else {
            Class_228 var3 = var1.getFirst();

            for(int var4 = 0; var4 < var2; ++var4) {
               var3 = var3.field_1170;
            }

            this.へイソりおえこミオもト = var3;
            this.ほきユりツあのハんなそ = var3.field_1169;
         }

      } else {
         throw new IndexOutOfBoundsException();
      }
   }

   public boolean hasNext() {
      return this.へイソりおえこミオもト != null;
   }

   public Object next() {
      if (this.へイソりおえこミオもト == null) {
         throw new NoSuchElementException();
      } else {
         Class_228 var1 = this.へイソりおえこミオもト;
         this.ほきユりツあのハんなそ = var1;
         this.へイソりおえこミオもト = var1.field_1170;
         this.まフフまれシすくヘるす = var1;
         return var1;
      }
   }

   public void remove() {
      if (this.まフフまれシすくヘるす != null) {
         if (this.まフフまれシすくヘるす == this.へイソりおえこミオもト) {
            this.へイソりおえこミオもト = this.へイソりおえこミオもト.field_1170;
         } else {
            this.ほきユりツあのハんなそ = this.ほきユりツあのハんなそ.field_1169;
         }

         this.みソヌメイなおなへマス.remove(this.まフフまれシすくヘるす);
         this.まフフまれシすくヘるす = null;
      } else {
         throw new IllegalStateException();
      }
   }

   public boolean hasPrevious() {
      return this.ほきユりツあのハんなそ != null;
   }

   public Object previous() {
      if (this.ほきユりツあのハんなそ == null) {
         throw new NoSuchElementException();
      } else {
         Class_228 var1 = this.ほきユりツあのハんなそ;
         this.へイソりおえこミオもト = var1;
         this.ほきユりツあのハんなそ = var1.field_1169;
         this.まフフまれシすくヘるす = var1;
         return var1;
      }
   }

   public int nextIndex() {
      if (this.へイソりおえこミオもト == null) {
         return this.みソヌメイなおなへマス.size();
      } else {
         if (this.みソヌメイなおなへマス.オルをハきミゆエれもツヌオをマエせ == null) {
            this.みソヌメイなおなへマス.オルをハきミゆエれもツヌオをマエせ = this.みソヌメイなおなへマス.toArray();
         }

         return this.へイソりおえこミオもト.field_1171;
      }
   }

   public int previousIndex() {
      if (this.ほきユりツあのハんなそ == null) {
         return -1;
      } else {
         if (this.みソヌメイなおなへマス.オルをハきミゆエれもツヌオをマエせ == null) {
            this.みソヌメイなおなへマス.オルをハきミゆエれもツヌオをマエせ = this.みソヌメイなおなへマス.toArray();
         }

         return this.ほきユりツあのハんなそ.field_1171;
      }
   }

   public void add(Object var1) {
      if (this.へイソりおえこミオもト != null) {
         this.みソヌメイなおなへマス.insertBefore(this.へイソりおえこミオもト, (Class_228)var1);
      } else if (this.ほきユりツあのハんなそ != null) {
         this.みソヌメイなおなへマス.insert(this.ほきユりツあのハんなそ, (Class_228)var1);
      } else {
         this.みソヌメイなおなへマス.add((Class_228)var1);
      }

      this.ほきユりツあのハんなそ = (Class_228)var1;
      this.まフフまれシすくヘるす = null;
   }

   public void set(Object var1) {
      if (this.まフフまれシすくヘるす != null) {
         this.みソヌメイなおなへマス.set(this.まフフまれシすくヘるす, (Class_228)var1);
         if (this.まフフまれシすくヘるす == this.ほきユりツあのハんなそ) {
            this.ほきユりツあのハんなそ = (Class_228)var1;
         } else {
            this.へイソりおえこミオもト = (Class_228)var1;
         }

      } else {
         throw new IllegalStateException();
      }
   }
}
