import java.util.Random;

public class dizisirala implements dizisiral {
    public static void diziSirala(int dizii[]) {
        Random rnd = new Random();
        int[] sayilar = new int[50];

        // Fill array with random numbers
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = rnd.nextInt(101);
        }

        
        for (int i = 0; i < sayilar.length - 1; i++) {
            for (int j = 0; j < sayilar.length - 1 - i; j++) {
                if (sayilar[j] > sayilar[j + 1]) {
                    int temp = sayilar[j];
                    sayilar[j] = sayilar[j + 1];
                    sayilar[j + 1] = temp;
                }
            }
        }

   
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }
    }

    public static void main(String[] args) {
        diziSirala(null);
    }
}