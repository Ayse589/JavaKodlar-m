public class o12 {
    public static void main(String[] args) {
        String bulunanKelime;
        bulunanKelime = kelimeGetir_3("java zorlayici olmaya basladi",56);
        System.out.println(bulunanKelime);

    }

    public static String kelimeGetir(String cumle, int sira) {
        String kelime = "";
        String[] kelimeler = cumle.split(" ");
        kelime = kelimeler[sira - 1];
        return kelime;

    }

    public static String kelimeGetir_1(String cumle, int sira) {
        String kelime = "";
        try {
             String[] kelimeler = cumle.split(" ");
        kelime = kelimeler[sira - 1];
            
        } catch (Exception e) {
        kelime="";
        System.out.println("hata oldu");
        }

        return kelime;

    }
      public static String kelimeGetir_3(String cumle, int sira) {
        String kelime="";
     String[] kelimeler = cumle.split(" ");
        kelime = kelimeler[sira - 1];
          if (sira <= kelimeler.length)
            kelime = kelimeler[sira - 1];
        else
            System.out.println(" hata oldu ");
        return kelime;
      }
}
