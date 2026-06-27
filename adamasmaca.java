import java.util.Random;
import java.util.Scanner;

public class odev_2416501055 {

    static String[] kelimeler = {
            "bilgisayar", "kalkulus", "programlama", "muhendislik",
            "klavye", "yemekhane", "kitaplik", "matematik",
            "duşakabin", "telefon"
    };

    static Random rnd = new Random();
    static Scanner giris = new Scanner(System.in);

    public static void main(String[] args) {

        int oyun = 0;

        while (oyun < 5) {

            String kelime = kelimeSec();
            char[] gorunen = olustur(kelime);

            int hak = 15;

            while (hak > 0) {

                System.out.println(gorunen);

                System.out.print("Harf gir: ");
                char harf = giris.next().toUpperCase().charAt(0);

                boolean bulundu = false;

                for (int i = 0; i < kelime.length(); i++) {

                    if (Character.toUpperCase(kelime.charAt(i)) == harf) {
                        gorunen[i] = Character.toUpperCase(kelime.charAt(i));
                        bulundu = true;
                    }
                }

                if (!bulundu) {
                    System.out.println("harf yok");
                }

                if (String.valueOf(gorunen).equals(kelime.toUpperCase())) {
                    System.out.println("Tebrikler");
                    break;
                }
                hak--;
            }
            if (hak == 0) {
                System.out.println("Bilemediniz");
            }

            System.out.print("Tekrar oynansın mı (e/h): ");
            char cevap = giris.next().toLowerCase().charAt(0);

            if (cevap != 'e') {
                break;
            }

            oyun++;
        }
    }

    static String kelimeSec() {
        return kelimeler[rnd.nextInt(kelimeler.length)];
    }

    static char[] olustur(String kelime) {

        char[] dizi = new char[kelime.length()];

        if (kelime.length() == 6 || kelime.length() == 7) {

            dizi[0] = Character.toUpperCase(kelime.charAt(0));

            for (int i = 1; i < dizi.length; i++) {
                dizi[i] = '*';
            }

        } else {

            dizi[0] = Character.toUpperCase(kelime.charAt(0));
            dizi[dizi.length - 1] = Character.toUpperCase(kelime.charAt(dizi.length - 1));

            for (int i = 1; i < dizi.length - 1; i++) {
                dizi[i] = '*';
            }
        }

        return dizi;
    }
}