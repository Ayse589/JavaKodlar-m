public class string3 {
    public static String kelimeyigetir(String cumle, int index) {
        if (cumle == null) {
            return "Hata";
        }
        String[] parca = cumle.split(" ");

        if (index > parca.length) {
            return "hata";
        }
        return parca[index - 1];

    }

    public static void main(String[] args) {
        String sonuc = kelimeyigetir("bugun bayram erken kalkın cocuklar", 1);
        System.out.println(sonuc);

    }
}
/*
 * String kelimeyiGetir(String cumle, int kelimeSiraNo) adındaki metot çalışır
 * ise geriye cümledeki istenilen sıradaki kelime
 * döndürülecek.
 * Ör: kelimeyiGetir("Bugün hava çok güzel",2) ==> çalışır ise geriye "hava"
 * döndürülecek
 * Ör: kelimeVarmi("Bugün hava çok güzel",3) ==> çalışır ise geriye "çok"
 * döndürecek
 * -----------------------------------------------------------------------------
 * ---------------------------------------------------
 */
