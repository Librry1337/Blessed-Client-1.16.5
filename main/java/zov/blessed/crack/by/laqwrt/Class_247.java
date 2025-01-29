package zov.blessed.crack.by.laqwrt;

import java.util.ArrayList;
import java.util.Iterator;

public class Class_247 {
   private ArrayList<String> field_1198 = new ArrayList<>();

   public boolean method_1134(String var1) {
      Iterator var2 = this.field_1198.iterator();

      String var3;
      do {
         if (!var2.hasNext()) {
            return false;
         }

         var3 = (String)var2.next();
      } while(!var1.equals(var3));

      return true;
   }

   public void method_1135(String var1) {
      for(int var2 = 0; var2 < this.field_1198.size(); ++var2) {
         if (var1.equals(this.field_1198.get(var2))) {
            this.field_1198.remove(var2);
         }
      }

   }

   public void method_1136(String var1) {
      this.field_1198.add(var1);
   }
}
