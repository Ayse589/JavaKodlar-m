public class basamaktoplam {
    public static int basamaktoplam(int sayi) {
        int toplam = 0;
        if (sayi == 0) {
            return 0;
        } else {
            return sayi % 10 + basamaktoplam(sayi / 10);
        }
    }

    public static void main(String[] args) {
        int sonuc = basamaktoplam(4748);
        System.out.println(sonuc);

    }
}