import java.util.Random;
import java.util.Scanner;

public class sinavv {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner giris = new Scanner(System.in);
        int sayi1;
        int sayi2;
        String secim;
        int puan = 0;
        int cevap;
        do {

            sayi1 = rnd.nextInt(100);
            sayi2 = 100 + rnd.nextInt(100);
            System.out.println("sayi1:" + sayi1);
            System.out.println("sayi2:" + sayi2);
            System.out.println("hangi saya daha buyuk?(1:sayi1,2:sayi2)");
            cevap = giris.nextInt();
            giris.nextLine();
            if (cevap == 1 && sayi1 > sayi2) {
                System.out.println("dogru");
                puan += 5;
            }
            if (cevap == 2 && sayi2 > sayi1) {
                System.out.println("dogru");
                puan += 5;

            }

            else {
                System.out.println("yanlis");
                puan -= 2;
            }

            System.out.println("tamam mi devam mi?");
            secim = giris.nextLine();
        } while (secim.equals("d") || secim.equals("D"));

        System.out.println("puan:  " + puan);

    }
}
