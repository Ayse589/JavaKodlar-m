import java.util.Scanner;

public class o3 {
    public static void main(String[] args) {
        int[] notlar = new int[7];
        int toplam = 0;

        Scanner giris = new Scanner(System.in);
        System.out.println("Notlarinizi girin:");
        System.out.println("Matematik: ");
        notlar[0] = giris.nextInt();
        System.out.println("Turkce: ");
        notlar[1] = giris.nextInt();
        System.out.println("Fizik: ");
        notlar[2] = giris.nextInt();
        System.out.println("Tarih: ");
        notlar[3] = giris.nextInt();
        System.out.println("Kimya: ");
        notlar[4] = giris.nextInt();
        System.out.println("Beden: ");
        notlar[5] = giris.nextInt();
        System.out.println("Muzik: ");
        notlar[6] = giris.nextInt();
        
        for (int not : notlar) {
            toplam += not;
        }
        
        double ortalama = toplam / (double) notlar.length;
        System.out.println("Ortalamaniz: " + ortalama);
    }
}
