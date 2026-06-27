
import java.util.Scanner;

public class besinkati {
    public static void besinKati() {
        Scanner giris = new Scanner(System.in);
        System.out.println("baslangic degerini girin:");
        int sayi1 = giris.nextInt();
        System.out.println("bitis degerini giriniz:");
        int sayi2 = giris.nextInt();
        
        System.out.println("5'in katlari:");
        for (int i = sayi1; i < sayi2; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        besinKati();
    }
}
