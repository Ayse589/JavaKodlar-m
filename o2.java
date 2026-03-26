import java.time.Year;
import java.util.Scanner;

public class o2 {
    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
         double sinav1,sinav2,ortalama;
         System.out.println("birinci sinavi gir");
         sinav1= giris.nextDouble();
         System.out.println("ikinci sinavi gir");
         sinav2= giris.nextDouble();
         ortalama=(sinav1+sinav2)/2;
         System.out.println("ortalama"+ortalama);

          if(ortalama>70){
            System.out.println("basarili");

          }else{
            System.out.println("basarisiz");
          }



    }
}
