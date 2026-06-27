import java.util.Scanner;

public class dizienbuyuk {
    public static int enBuyuk() {
        Scanner giris = new Scanner(System.in);
        int i;
        int[] dizi = new int[10];
        System.out.println("dizinin elemanlarini girin:");
        for (i = 0; i < dizi.length; i++) {
            dizi[i] = giris.nextInt();
        }
        
        int enBuyuk = dizi[0];
        for (i = 1; i < dizi.length; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
        }
        return enBuyuk;
    }

    public static void main(String[] args) {
        int sonuc = enBuyuk();
        System.out.println("enbuyuk: " + sonuc);
    }
}
