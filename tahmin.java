import java.util.Random;
import java.util.Scanner;

public class tahmin {
    public static void main(String[] args) {
        int can = 5, tahmin, i = 0;
        Random rnd = new Random();
        Scanner giris = new Scanner(System.in);
        int sayi = rnd.nextInt(100);
        
        boolean oyunDurum = false;
        int[] tahminler = new int[5];
        System.out.println("Hosgeldiniz, 0 ile 99 arasinda tahmin yapiniz");

        while (can > 0) {
            System.out.println("Tahmin giriniz: ");
            tahmin = giris.nextInt();
            tahminler[i++] = tahmin;
            
            if (tahmin == sayi) {
                System.out.println("Tebrikler! Buldunuz!");
                oyunDurum = true;
                break;
            } else if (tahmin < sayi) {
                System.out.println("Daha buyuk bir sayi deneyin, kalan can: " + --can);
            } else {
                System.out.println("Daha kucuk bir sayi deneyin, kalan can: " + --can);
            }
        }
        
        if (oyunDurum) {
            System.out.println("Sayi: " + sayi);
            System.out.println("Kalan can: " + can);
        } else {
            System.out.println("Basaramadiniz! Sayi: " + sayi);
        }
        
        System.out.println("Tahminleriniz: ");
        for (int j = 0; j < i; j++) {
            System.out.println(tahminler[j]);
        }
    }
}
