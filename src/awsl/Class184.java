package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;

public class Class184 extends Class193 {
   private BufferedImageOp Field1142;
   private BufferedImageOp Field1143;

   public Class184(BufferedImageOp a, BufferedImageOp a) {
      this.Field1142 = a;
      this.Field1143 = a;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      BufferedImage var3 = this.Field1142.Method62(a, a);
      var3 = this.Field1143.Method62(var3, a);
      return var3;
   }
}
