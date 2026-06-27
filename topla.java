public class topla {
    public static void topla(int... sayilar) {
        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }
        System.out.println("Toplam: " + toplam);
    }

    public static void main(String[] args) {
        topla(4, 4, 8, 86);
        topla(1, 2, 3, 4, 5);
    }
}
