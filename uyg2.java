import java.util.Scanner;

public class uyg2 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sayi1, sayi2;
        System.out.println("sayi gir");
        sayi1= giris.nextInt();
        System.out.println("sayi gir");
        sayi2= giris.nextInt();
        if(sayi1>sayi2){
            System.out.println("sayi1 buyuktur");

        }
        else if(sayi1< sayi2){
            System.out.println("sayi2 buyuktur");

        }
        else if (sayi1==sayi2){
            System.out.println("sayilar farkli olmali");
        }
        
        }
    }


