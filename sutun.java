public class sutun {
    public static int length;

    public static String[][] sutunlariGeriDondur(String[][] dizi, int birinciSutunIndex, int ikinciSutunIndex) {
        int a = dizi.length;
        String[] birlestir = new String[a*2];
        for (int i = 0; i < a; i++) {
            birlestir[i] = dizi[i][birinciSutunIndex] + " " +
                    dizi[i][ikinciSutunIndex];

        }

        return dizi;

    }

    public static void main(String[] args) {

        String[][] dizi = { { "ayse", "busra", "ceren" }, { "deniz", "eylul", "fatma" },
                { "gaziantep", "hatay", "isviçre" }, { "antalya", "van", "amerika" } };
        String[][] sonuc = sutunlariGeriDondur(dizi, 1, 2);
        for (int i = 0; i < sonuc.length; i++) {
            System.out.println(sonuc[i]);
        }
    }
}
/*
 * 1. Kendisine parametre olarak yollanan String iki boyutlu dizinin yine
 * kendisine parametre olarak yollanan iki sütunundaki
 * elemanları bir boyutlu başka bir dizide birleştirerek geriye döndüren metodu
 * yazınız. NOT: Sütun Index değerlerinin olup
 * olmadığını kontrol ettirmeyiniz. Sadece metot yazılacaktır.
 * 
 * public static String[] sutunlariGeriDondur (String[ ][ ] dizi, int
 * birinciSutunIndex, int ikinciSutunIndex ){
 */
