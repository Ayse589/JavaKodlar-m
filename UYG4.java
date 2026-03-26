import java.util.Scanner;


public class UYG4 {
    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
        int sayi1, sayi2;
        String islem;
        double sonuc=0;
        System.out.println("birinci sayiyi gir");
        sayi1=giris.nextInt();
        System.out.println("ikinci sayiyi gir");
        sayi2=giris.nextInt();
        System.out.println("islemi sec");
        islem=giris.next();
           
        if(islem.equals("+")){
            sonuc=sayi1 + sayi2;
            
        }
        else if(islem.equals("-")){
            sonuc=sayi1-sayi2;
        }
        else if(islem.equals("*")){
            sonuc=sayi1*sayi2;

        }
         else if(islem.equals("/")){
            sonuc=(double)sayi1/sayi2;
         }
         else 
         {
            System.out.println(" gecersiz islem");
         }
         System.out.println("sonuc: "+sonuc);


    }
}
