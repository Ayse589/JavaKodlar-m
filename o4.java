import java.util.Scanner;

public class o4 {
    public static void main(String[] args) {
        Scanner giris =new Scanner(System.in);
        int sayi1,sayi2;
        char islem;
        double sonuc;
        System.out.println("birinci sayiyi gir");
        sayi1= giris.nextInt();
        System.out.println("ikinci sayiyi gir");
        sayi2= giris.nextInt();
        System.out.println("islemi gir (+,-,*,/)");
        islem= giris.next().charAt(0);
        switch(islem){
            case '+':
                sonuc=(double)(sayi1+sayi2);
                break;
            case '-':
                sonuc=(double)(sayi1-sayi2);
                break;
            case '*':
                sonuc=(double)(sayi1*sayi2);
                break;
            case '/':
                sonuc=(double)(sayi1/sayi2);
                break;
            default:
                System.out.println("gecersiz islem");
                return;
        }
        System.out.println("sonuc: "+sonuc);


    }
}
