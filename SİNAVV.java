public class SİNAVV {
    public static String[] dizii(String[][] sutun, int index1, int index2) {
        int a = sutun.length;
        String[] sonuc = new String[a * 2]; // her satırdan 2 eleman gelecek

        int k = 0;
        for (int i = 0; i < a; i++) {
            sonuc[k++] = sutun[i][index1]; // önce birinci sütun
            sonuc[k++] = sutun[i][index2]; // sonra ikinci sütun
        }

        return sonuc;

    }

    public static void main(String[] args) {
        String[][] dizi = { { "ayse", "ali", "veli" }, { "fatma", "ahmet", "mehmet" }, { "hatay", "izmir", "new york" },
                { "mus", "agri", "losangelas" } };
        String[] sonuc = dizii(dizi, 2, 1);
        for (int i = 0; i < sonuc.length; i++) {
            System.out.println(sonuc[i]);
        }
    }
}
/*
 * 1. Kendisine parametre olarak yollanan String iki boyutlu dizinin yine
 * kendisine parametre olarak yollanan iki sütunundaki"
 * elemanları bir boyutlu başka bir dizide birleştirerek geriye döndüren metodu
 * yazınız. NOT: Sütun Index değerlerinin olup
 * olmadığını kontrol ettirmeyiniz. Sadece metot yazılacaktır.
 * Ali
 * Ayşe
 * İzmir
 * Veli
 * Eğirdir
 * Fatma İstanbul Gönen
 * Ahmet Dilek Muğla Atabey
 * Hasan Elif
 * Isparta
 * Senirkent
 * Örnek:
 * sutunlariGeriDondur(dizi,0,3); ➔
 * Ali
 * Veli
 * Ahmet
 * Hasan
 * Eğirdir
 * Gönen
 * Atabey
 * Senirkent
 * public static String[] sutunlariGeriDondur (String[ ][ ] dizi, int
 * birinciSutunIndex, int ikinciSutunIndex ){
 */