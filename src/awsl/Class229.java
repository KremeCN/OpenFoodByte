package awsl;

public class Class229 extends Class167 {
   private String Field1282;
   private Class267 Field1283;
   private final String Field1284;
   private int Field1285;

   public Class229(String a, Class167 a) {
      this(327680, a, a);
   }

   protected Class229(int a, String a, Class167 a) {
      super(a, a);
      this.Field1284 = a;
   }

   public void Method1447(int a, int a, String a, String a, String a, String[] a) {
      this.Field1035.Method1447(a, a, a, a, a, a);
      this.Field1282 = a;
   }

   public Class267 Method1451(int a, String a, String a, String a, String[] a) {
      int a = Class37.Method3382();
      if ("<clinit>".equals(a)) {
         int a = 10;
         String a = this.Field1284 + this.Field1285++;
         this.Field1035.Method1451(a, a, a, a, a);
         if (this.Field1283 == null) {
            this.Field1283 = this.Field1035.Method1451(a, a, a, (String)null, (String[])null);
         }

         this.Field1283.Method1954(184, this.Field1282, a, a, false);
      }

      Class267 a = this.Field1035.Method1451(a, a, a, a, a);
      return a;
   }

   public void Method1460() {
      if (this.Field1283 != null) {
         this.Field1283.Method1948(177);
         this.Field1283.Method1842(0, 0);
      }

      this.Field1035.Method1460();
   }
}
