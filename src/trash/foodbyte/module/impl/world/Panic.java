package trash.foodbyte.module.impl.world;

import java.util.Iterator;
import obfuscate.a;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.value.FloatValue;

public class Panic extends Module {
   public Panic() {
      FloatValue.Method2450();
      super("Panic", Category.WORLD);
      this.setDescription("一键关闭所有功能");
      a.trash(new String[5]);
   }

   public void onEnable() {
      int var10000 = FloatValue.Method2450();
      Iterator var2 = ModuleManager.getAllModules().Method1383();
      int a = var10000;
      if (var2.Method932()) {
         Module a = (Module)var2.Method933();
         if (!a.getState()) {
            ;
         }

         a.setState(false);
      }

      if (a.trash() == null) {
         ++a;
         FloatValue.Method2440(a);
      }

   }
}
