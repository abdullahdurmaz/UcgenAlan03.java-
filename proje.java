import java.util.Scanner;

public class proje {
     public static void main(String[] args) {
         double a,b ;
         double c;
         System.out.println("a kenarını giriniz");
         Scanner inp = new Scanner(System.in);
         a =inp.nextInt();
         System.out.println("b kenarını giriniz");
         b= inp.nextInt();
         c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
         System.out.println("sonuc="+c);

    }
}
