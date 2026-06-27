import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class liste2 {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            sayilar.add(i);
        }
        List<Integer> liste1 = Arrays.asList(1, 3, 5);
        System.out.println(sayilar);
        System.out.println(liste1);

        ArrayList<Integer> sayilarr = new ArrayList<Integer>();
        for (int k1 = 0; k1 < 10; k1++) {
            sayilarr.add(k1);
        }
        System.out.println(sayilarr);

        System.out.println("liste1 size: " + liste1.size());

        List<Integer> sayilar2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        for (Integer k : sayilar2) {
            System.out.print(k + " ");
        }
        System.out.println();

        int birinciSayi = sayilar2.get(0);
        System.out.println("birinci sayi: " + birinciSayi);
    }
}
