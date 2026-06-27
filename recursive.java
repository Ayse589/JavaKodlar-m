public class recursive {
    public static int topla(int a, int b) {
        int toplam = 0;
        if (a == b) {
            return a;
        }

        else {
            return a + topla(a + 1, b);

        }

    }

    public static void main(String[] args) {
        int sonuc = topla(7, 10);
        System.out.println(sonuc);

    }
}
/*
 * 2. Kendisine yollanan iki pozitif tam sayı arasındaki sayıların toplamını
 * bulan bir recursive metot yazınız. (Örnek: sayilariTopla(5,20)
 * metodu çağrıldığında geriye 5+6+……+19+20 işleminin sonucunu döndürecektir.
 * 1.sayının her zaman 2.sayıdan küçük olduğunu
 * varsayınız.)
 */
