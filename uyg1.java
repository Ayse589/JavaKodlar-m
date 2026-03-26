import java.util.Scanner;

public class uyg1 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sayi;
        System.out.println(" sayiyi gir");
        sayi = giris.nextInt();
        if(sayi>0){
            System.out.println("sayi pozitif");
            


        }else if (sayi<0){
            System.out.println("sayi negatif");

        }
        else 
            System.out.println("sayi sifirdir");



    }
}
