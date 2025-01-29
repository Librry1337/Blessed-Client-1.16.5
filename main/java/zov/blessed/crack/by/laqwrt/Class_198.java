package zov.blessed.crack.by.laqwrt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;

public class Class_198 {
   public static <T extends Map<?, ?>> T method_868(T var0, Consumer<T> var1) {
      var1.accept(var0);
      return var0;
   }

   public static <K, V> void method_869(Map<K, V> var0, Comparator<K> var1) {
      ArrayList<Entry<K, V>> var2 = new ArrayList<>(var0.entrySet());
      var2.sort(Entry.comparingByKey(var1));
      var0.clear();
      var2.forEach((var1x) -> {
         var0.put(var1x.getKey(), var1x.getValue());
      });
   }

   public static <K, V> void method_870(Map<K, V> var0, Comparator<V> var1) {
      ArrayList<Entry<K, V>> var2 = new ArrayList<>(var0.entrySet());
      var2.sort(Entry.comparingByValue(var1));
      var0.clear();
      var2.forEach((var1x) -> {
         var0.put(var1x.getKey(), var1x.getValue());
      });
   }

   public static <K, V> void method_871(Map<K, V> var0, Comparator<Entry<K, V>> var1) {
      ArrayList<Entry<K, V>> var2 = new ArrayList<>(var0.entrySet());
      var2.sort(var1);
      var0.clear();
      var2.forEach((var1x) -> {
         var0.put(var1x.getKey(), var1x.getValue());
      });
   }
}
