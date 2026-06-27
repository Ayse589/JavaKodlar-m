
// ...existing code...
public class armstrong {
    public static boolean armstrongSayi(int a) {
        int sonuc = 0;
        int yuzler = (a / 100);
        int onlar = (a / 10) % 10;
        int birler = a % 10;

        int kup1 = (int) Math.pow(yuzler, 3);
        int kup2 = (int) Math.pow(onlar, 3);
        int kup3 = (int) Math.pow(birler, 3);
        sonuc = kup1 + kup2 + kup3;
        if (sonuc == a) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        boolean cevap = armstrongSayi(378);
        System.out.println(cevap);
    }
}

/*
 * 1. Üç basamaklı, basamaklarının küpleri toplamı kendisine eşit olan tam
 * sayılara Armstrong Sayı denir. Örneğin: 371 = 33 + 73 + 13 .
 * Kendisine yollanan üç basamaklı tam bir sayının Armstrong Sayı olup
 * olmadığını kontrol eden bir metot yazınız. Eğer sayı
 * Armstrong Sayı ise geriye true değilse false değer döndürsün. (Not: Metoda
 * yollanan sayının her zaman üç basamaklı olduğunu
 * varsayınız. Yani sayının kaç basamaklı olduğu ile ilgili bir kontrol
 * yapmayınız.)
 */