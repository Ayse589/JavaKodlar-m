public class sinav3 {
    public static int sutun(int[][] dizi, int a, int b) {
        try {

            int toplam = 0;
            for (int i = 0; i < dizi.length; i++) {
                toplam+= dizi[i][a] + dizi[i][b];
            }
            System.out.println(toplam);
            return toplam;
        } catch (Exception e) {
            System.out.println("HATA");
        }
        return -1;

    }

    public static void main(String[] args) {
        int[][] dizi = { { 1, 2, 34, 5 },
                         { 3, 45, 67, 5 },
                         { 3,56,74,3  }};
        int sonuc = sutun(dizi, 1, 2);

    }
}
/*
 * . Bir metoda parametre olarak int tipindeki iki boyutlu bir dizi ve 2 tane
 * sütun indeksi yollanacaktır. Metot yollanan
 * indekslerdeki sütunların satırlarını toplayıp ekrana yazdıracaktır. Ayrıca
 * metot içerisinde her türlü hatanın kontrol edildiği
 * istisnai durum kontrolü yapılacak. Eğer hata oluşur ise ekrana “HATA”
 * yazdırılacaktır aksi durumda işlem sonucu yazdırılacak.
 * Sadece metodu yazınız.
 */
