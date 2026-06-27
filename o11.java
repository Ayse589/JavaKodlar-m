import java.util.Scanner;

public class o11 {

    static String[] ad = new String[7];
    static String[] soyad = new String[7];
    static String[] sinif = new String[7];
    static String[] cinsiyet = new String[7];
    static String[] numara = new String[7];
    static int index = 0;

    public static void main(String[] args) {
        ogrenciBilgiGirisi();
    }

    static void ogrenciBilgiGirisi() {
        Scanner giris = new Scanner(System.in);
        char secim;
        do {
            System.out.println("1: bilgi girisi");
            System.out.println("2: ogrenci listele");
            System.out.println("3: cikis");
            System.out.print("secim yapiniz:");
            secim = giris.next().charAt(0);
            switch (secim) {
                case '1':
                    bilgiGirisi(giris);

                    break;
                case '2':
                    ogrenciListele();
                    break;
                case '3':
                    System.out.println("cikis yapildi");
                    break;

            }

        } while (secim != '3');
    }

    static void bilgiGirisi(Scanner giris) {
        if (index >= 7) {
            System.out.println("liste dolu!");
            return;
        }

        giris.nextLine();

        System.out.println("ogrenci adi:");
        ad[index] = giris.nextLine();
        System.out.println("ogrenci soyadi:");
        soyad[index] = giris.nextLine();
        System.out.println("ogrenci sinifi:");
        sinif[index] = giris.nextLine();
        System.out.println("ogrenci cinsiyet:");
        cinsiyet[index] = giris.nextLine();
        System.out.println("ogrenci numara:");
        numara[index] = giris.nextLine();
        index++;
    }
    static void ogrenciListele() {
        for (int i = 0; i < index; i++) {
            System.out.println(ad[i] + " / " + soyad[i] + " / " +
                               sinif[i] + " / " +
                               cinsiyet[i] + " / " +
                               numara[i]);
        }
}
}

/*
 * [1] Bilgi Gir
 * [2] Öğrenci Listele
 * [3] Çıkış
 * Secim Yapınız:1-----------------------
 * Öğrenci Adı
 * Öğrenci Soyadı
 * Öğrenci Sınıf Ör:1,2,3 vb.
 * Öğrenci Cinsiyet Ör: E,K
 * Öğrenci Numara Ör:123,124,125,vb.-----------------------
 * En fazla 50 öğrenci veri girişi yapılaca
 */