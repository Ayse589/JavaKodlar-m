public class booleankelime {
    public static boolean kelimevarmi(String cumle, String kelime) {

        return cumle.contains(kelime);

    }

    public static void main(String[] args) {
        boolean sonuc = kelimevarmi("bugun hava guzel", "havabb");
        System.out.println(sonuc);

    }
}
/*
 * boolean kelimeVarmi(String cumle, String kelime) adındaki metoda parametre
 * olarak bir cümle ve bir kelime yollanacaktır.
 * Cümlede aranan kelime var ise geriye true yoksa false değerini döndürecek.
 * Ör: kelimeVarmi("Bugün hava çok güzel","hava") ==> çalışır ise geriye true
 * döndürecek
 * Ör: kelimeVarmi("Bugün hava çok güzel","ali") ==> çalışır ise geriye false
 * döndürecek
 */
