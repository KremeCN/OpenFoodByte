package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class179 extends Class187 {
   public Class179() {
      this.Field1150 = 10.0F;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1270();
      int a = a.getWidth();
      int a = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      int[] a = new int[a * a];
      int[] a = new int[a * a];
      a.getRGB(0, 0, a, a, a, 0, a);
      if (this.Field1150 > 0.0F) {
         Method1293(this.Field1151, a, a, a, a, this.Field1139, this.Field1139 && this.Field1140, false, Field1136);
         Method1293(this.Field1151, a, a, a, a, this.Field1139, false, this.Field1139 && this.Field1140, Field1136);
      }

      a.getRGB(0, 0, a, a, a, 0, a);
      int a = 0;
      int a = 0;
      if (a < a) {
         int a = 0;
         if (a < a) {
            int a = a[a];
            int a = a >> 16 & 255;
            int a = a >> 8 & 255;
            int a = a & 255;
            int a = a[a];
            int a = a >> 16 & 255;
            int a = a >> 8 & 255;
            int a = a & 255;
            a = (a + 255 - a) / 2;
            a = (a + 255 - a) / 2;
            a = (a + 255 - a) / 2;
            a[a] = a & -16777216 | a << 16 | a << 8 | a;
            ++a;
            ++a;
         }

         ++a;
      }

      a.setRGB(0, 0, a, a, a, 0, a);
      return a;
   }

   public String toString() {
      return "Blur/High Pass...";
   }
}
