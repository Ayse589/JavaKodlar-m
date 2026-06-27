public class arm {
    public static boolean armstrong(int sayi) {

        int yuzler = (sayi / 100);
        int onlar = (sayi / 10) % 10;
        int birler = (sayi % 10);

        int kup1 = (int) Math.pow(yuzler, 3);
        int kup2 = (int) Math.pow(onlar, 3);
        int kup3 = (int) Math.pow(birler, 3);
        int sonuc = kup1 + kup2 + kup3;
        if (sonuc == sayi) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean cevap = armstrong(381);
        System.out.println(cevap);
    }
}
