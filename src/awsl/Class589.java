package awsl;

public class Class589 extends Class588 {
   public Class589() {
      this(0.0F, 0.0F, 0.0F);
   }

   public Class589(float[] a) {
      this.Field2775 = a[0];
      this.Field2776 = a[1];
      this.Field2777 = a[2];
   }

   public Class589(float a, float a, float a) {
      this.Field2775 = a;
      this.Field2776 = a;
      this.Field2777 = a;
   }

   public Class589(Class589 a) {
      this.Field2775 = a.Field2775;
      this.Field2776 = a.Field2776;
      this.Field2777 = a.Field2777;
   }

   public Class589(Class588 a) {
      this.Field2775 = a.Field2775;
      this.Field2776 = a.Field2776;
      this.Field2777 = a.Field2777;
   }

   public float Method377(Class589 a) {
      return Math.abs(this.Field2775 - a.Field2775) + Math.abs(this.Field2776 - a.Field2776) + Math.abs(this.Field2777 - a.Field2777);
   }

   public float Method378(Class589 a) {
      float var2 = this.Field2775 - a.Field2775;
      float var3 = this.Field2776 - a.Field2776;
      float var4 = this.Field2777 - a.Field2777;
      return var2 * var2 + var3 * var3 + var4 * var4;
   }

   public float Method379(Class589 a) {
      float var2 = this.Field2775 - a.Field2775;
      float var3 = this.Field2776 - a.Field2776;
      float var4 = this.Field2777 - a.Field2777;
      return (float)Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
   }
}
