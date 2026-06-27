import java.util.Arrays;
import java.util.Random;

public class DiziSiralaa {

    public static void DiziyiSirala(int[] dizi) {
        Arrays.sort(dizi);

        System.out.println("Sirali dizi:");
        for (int sayi : dizi) {
            System.out.print(sayi + " ");
        }
    }

    public static void main(String[] args) {

        int[] dizi = new int[50];
        Random rnd = new Random();

        // 0-100 arası rastgele sayılar
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rnd.nextInt(101);
        }

        DiziyiSirala(dizi);
    }
}