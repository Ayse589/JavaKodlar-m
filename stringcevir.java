public class stringcevir {
    public static String tersCevir(String cumle) {
        // Temel durum: boş veya tek karakter
        if (cumle == null || cumle.length() <= 1) {
            return cumle;
        }
        // Recursive durum: ilk karakteri sona ekle
        return tersCevir(cumle.substring(1)) + cumle.charAt(0);
    }

    public static void main(String[] args) {
        String sonuc = tersCevir("bugun hava guzel");
        System.out.println(sonuc);
    }
}
