import java.util.Random;

public class rastgele {
    public static void rastgele(int baslangic, int bitis, int adet) {
        Random rnd = new Random();
        for (int i = 0; i <adet; i++) {
            int sayi=rnd.nextInt(bitis-baslangic+1)+baslangic;
            System.out.println(sayi);

        }
    }

    public static void main(String[] args) {
        rastgele(4, 19, 5);

    }
}
/*
 * rastgeleSayiUret(int baslangicDegeri, int bitisDegeri, int adet) metodu
 * kendisine parametre olarak yollanan başlangıç değeri ile
 * bitiş değeri arasında istenilen adet kadar rastgele sayı tutup ekrana
 * yazdıracaktır.
 * Ör: rastgeleSayiUret(10,300,500); metodu çalışır ise 10 ile 300 arasında
 * rastgele 500 tane sayı tutup ekrana yazdıracaktır.
 */
