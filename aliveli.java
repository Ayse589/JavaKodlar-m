import java.util.Scanner;

public class aliveli {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        double mesafe = 0;

        int ay;
        System.out.println("kac km mesafe gidilecek?");
        mesafe = giris.nextDouble();
        System.out.println("kac ay boyunca yolculuk yapilacak?");
        ay = giris.nextInt();
        for (int i = 0; i < ay; i++) {
            double ali = (mesafe /100.0)*8.0;
            double veli = 0;

            if (i % 2 == 1) {
                veli = (mesafe /100.0)*8.5;

            } else {
                veli = (mesafe /100.0) *7.5;
            }

            System.out.println(i + 1 + ".ay harcanan yakit ");
          
            System.out.println("Ali:  " + ali);
            System.out.println("Veli:   " + veli);
              System.out.println();
                  mesafe *= 1.5;
        }

    }
}
/*
 * . Ali ve Veli her ay arabayla bir önceki aya göre 1,5 kat daha fazla mesafe
 * gitmektedirler. Ali’nin arabası her ay sabit olarak
 * her 100km için 8 litre yakıt tüketir. Veli’nin arabası ise bir ay 100km için
 * 7,5 litre yakıt tüketir, Veli’nin arabası sonraki ay ise
 * 100km için 8,5 litre tüketir (sırasıyla artar ve azalır). Kullanıcıdan ilk ay
 * gidilecek mesafe (km) bilgisi sayısal olarak girilecek
 * ve kaç ay boyunca bu yolculuk yapıldığı bilgisi alınacak, her ay sonunda Ali
 * ve Veli’nin harcadığı yakıt miktarları ayrı ayrı
 * ekrana yazdırılacaktır. Bu işlemi yapan sadece main ana metodu içerisindeki
 * kodları yazınız.
 */
