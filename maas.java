import java.util.Scanner;

public class maas {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        double maasAhmet = 0;
        double maasHasan = 0;
        int ay = 0;
        System.out.println("Ahmet'in maaşini giriniz:  ");
        maasAhmet = giris.nextDouble();
        System.out.println("Hasan'in maaşini giriniz:  ");
        maasHasan = giris.nextDouble();
        System.out.println("ay bilgisini girin:   ");
        ay = giris.nextInt();
        for (int i = 0; i < ay; i++) {

            if (i % 2 == 1) {
                maasAhmet += (maasAhmet) * 5.5 / 100;

            } else {
                maasAhmet -= (maasAhmet) * 2.5 / 100;

            }
            maasHasan += (maasHasan) * 3.5 / 100;
            System.out.println(i + 1 + ". Ay");
            System.out.println("Ahmet Maaşı: " + maasAhmet);
            System.out.println("Hasan Maaşı: " + maasHasan);
        }
    }
}
/*
 * Aynı firmada çalışan (Ahmet ve Hasan) iki işçiden birincisinin (Ahmet’in)
 * aylık ücreti bir ay %5,5 artmakta, sonraki ay %2,5
 * azalmaktadır. Diğerinin (Hasan’ın) ise ücreti her ay %3,5 artmaktadır. Her
 * ikisinin de başlangıç ücretleri ve hesaplanacak ay bilgisi
 * (tam sayı olarak-yani 5 girilir ise sonraki 5 ay için hesaplama yapılacak)
 * klavyeden girildikten sonra ay ay ücretlerinin ne olacağını
 * hesaplayan programı main() ana metodu içerisine yazınız.
 */
