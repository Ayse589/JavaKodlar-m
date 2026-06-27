public class o1 {
public static String[] sutunlariGeriDondur
        (String[][] dizi,
         int birinciSutunIndex,
         int ikinciSutunIndex) {

    int satirSayisi = dizi.length;

    // Yeni dizi oluştur
    String[] yeniDizi = new String[satirSayisi * 2];

    int index = 0;

    // Satırları dolaş
    for (int i = 0; i < satirSayisi; i++) {

        // İlk sütunu ekle
        yeniDizi[index] =
                dizi[i][birinciSutunIndex];
        index++;

        // İkinci sütunu ekle
        yeniDizi[index] =
                dizi[i][ikinciSutunIndex];
        index++;
    }

    return yeniDizi;
}

    public static void main(String[] args) {

        String[][] dizi = {
                { "ayse", "busra", "ceren" },
                { "deniz", "eylul", "fatma" },
                { "gaziantep", "hatay", "isviçre" },
                { "antalya", "van", "amerika" }
        };

        // 1. ve 2. sütunları birleştir
        String[] sonuc =
                sutunlariGeriDondur(dizi, 1, 2);

        // Yazdır
        for (int i = 0; i < sonuc.length; i++) {

            System.out.println(sonuc[i]);
        }
    }
}
