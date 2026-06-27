public class recursive3 {
    public static int enbuyuk(int[] dizi, int index) {

        if (index == dizi.length - 1) {

            return dizi[index];
        }
        int enbuyuk = enbuyuk(dizi, index + 1);
        if (dizi[index] > enbuyuk) {
            return dizi[index];
        } else {
            return enbuyuk;
        }
    }

    public static void main(String[] args) {
        int[] dizi = { 1, 46, 87, 654, 43, 222, 456, 6, 321 };
        int sonuc = enbuyuk(dizi, 0);
        System.out.println(sonuc);

    }
}
