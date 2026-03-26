import java.util.Scanner;

public class o6 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
       // Klavyeden girilen 3 basamaklı bir sayının basamaklardaki sayı değerlerini ekrana yazdırınız
        System.out.println("uc basamakli bir sayi girin");
        int sayi=giris.nextInt();
        int a=sayi/100;
        int b=(sayi/10)%10;
        int c=sayi%10;
       System.out.println("basamak1="+a*100);
       System.out.println("basamak2="+b*10);
       System.out.println("basamak3="+c*1);
       


        
    }
}
