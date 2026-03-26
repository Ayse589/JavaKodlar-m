import java.util.Scanner;

public class o3 {
    
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        System.out.println("uc basamakli bir sayi girin");
        int sayi =giris.nextInt();
        double toplam=0;
        int a = sayi / 100;
        int b = (sayi / 10) % 10;
        int c = sayi % 10;
         double kupA = Math.pow(a, 3);
          double kupB = Math.pow(b, 3);
           double kupC = Math.pow(c, 3);
           toplam= kupA+kupB+kupC;
           if(sayi==toplam){
            System.out.println("girdiginiz sayi bir armstrong sayidir.");

           }
           else{
            System.out.println("girdiginiz sayi bir armstrong sayi degildir.");
           }


    }
}
