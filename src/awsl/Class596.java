package awsl;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;

public class Class596 implements Class594 {
   public static final int Field2786 = 0;
   public static final int Field2787 = 1;
   public static final int Field2788 = 2;
   protected int[] Field2789;
   protected int Field2790;
   protected int Field2791;
   protected int Field2792;
   protected boolean Field2793;

   public Class596(BufferedImage a) {
      this(a, false);
   }

   public Class596(BufferedImage a, boolean a) {
      this((BufferedImage)a, 0, a);
   }

   public Class596(BufferedImage a, int a, boolean a) {
      this.Field2792 = 0;
      this.Field2793 = false;
      this.Method105(this.Method104(a, 0, 0, a.getWidth(), a.getHeight(), (int[])null), a.getWidth(), a.getHeight(), a, a);
   }

   public Class596(int[] a, int a, int a, int a, boolean a) {
      this.Field2792 = 0;
      this.Field2793 = false;
      this.Method105(a, a, a, a, a);
   }

   public Class596(Image a) {
      this((Image)a, 0, false);
   }

   public Class596(Image a, int a, boolean a) {
      this.Field2792 = 0;
      this.Field2793 = false;
      PixelGrabber a = new PixelGrabber(a, 0, 0, -1, -1, (int[])null, 0, -1);

      try {
         a.grabPixels();
      } catch (InterruptedException var6) {
         throw new RuntimeException("interrupted waiting for pixels!");
      }

      if ((a.status() & 128) != 0) {
         throw new RuntimeException("image fetch aborted");
      } else {
         this.Method105((int[])((int[])a.getPixels()), a.getWidth(), a.getHeight(), a, a);
      }
   }

   public int[] Method104(BufferedImage a, int a, int a, int a, int a, int[] a) {
      int a = a.getType();
      return a != 2 && a != 1 ? a.getRGB(a, a, a, a, a, 0, a) : (int[])((int[])a.getRaster().getDataElements(a, a, a, a, a));
   }

   public void Method105(int[] a, int a, int a, int a, boolean a) {
      this.Field2789 = a;
      this.Field2790 = a;
      this.Field2791 = a;
      this.Field2792 = a;
      this.Field2793 = a;
   }

   public float Method20(float a, float a) {
      Class598.Method86();
      int a = (int)a;
      int a = (int)a;
      if (this.Field2792 == 2) {
         a = Class776.Method1715(a, this.Field2790);
         a = Class776.Method1715(a, this.Field2791);
      }

      if (a >= this.Field2790 || a >= this.Field2791) {
         if (this.Field2792 == 0) {
            return 0.0F;
         }

         a = 0;
         if (a >= this.Field2790) {
            a = this.Field2790 - 1;
         }

         a = 0;
         if (a >= this.Field2791) {
            a = this.Field2791 - 1;
         }
      }

      return this.Field2793 ? (float)(this.Field2789[a * this.Field2790 + a] >> 24 & 255) / 255.0F : (float)Class767.Method1689(this.Field2789[a * this.Field2790 + a]) / 255.0F;
   }

   public void Method9(int a) {
      this.Field2792 = a;
   }

   public int Method10() {
      return this.Field2792;
   }

   public int Method12() {
      return this.Field2790;
   }

   public int Method14() {
      return this.Field2791;
   }

   public int[] Method86() {
      return this.Field2789;
   }

   private static Exception Method106(Exception exception) {
      return exception;
   }
}
