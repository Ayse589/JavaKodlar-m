public class enuzuncumle {

    public static String enUzunCumle(String... cumleler) {
        String uzunCumle = "";
        int maxKelime = 0;

        try {
            for (String cumle : cumleler) {
                if (cumle == null) {
                    continue; // null cümle varsa atla
                }
                String[] kelimeler = cumle.split(" ");
                int adet = kelimeler.length;

                if (adet > maxKelime) {
                    maxKelime = adet;
                    uzunCumle = cumle;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("HATA: Null değer geldi.");
            return "HATA";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("HATA: Dizi sınırları aşıldı.");
            return "HATA";
        } catch (Exception e) { // en genel en sonda olmalı
            System.out.println("HATA: Beklenmeyen hata -> " + e.getMessage());
            return "HATA";
        }

        return uzunCumle;
    }

    public static void main(String[] args) {
        String sonuc = enUzunCumle(
                "ayse bugun dısarı cıkcak",
                "bugun hava gunesli gorunuyor",
                "yarın yagmur yagacakmıs",
                "pazartesi gunu matematık sınavım var",
                "java dilini sevmiyorum");
        System.out.println("En uzun cümle: " + sonuc);
    }
}
