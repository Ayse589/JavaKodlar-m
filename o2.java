import java.util.Scanner;

public class o2 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
       
        System.out.println(" faktoriyelini istediğiniz bir sayi girin");
        int sayi1 =giris.nextInt();
        int fact=1;
        if(sayi1<0){
            System.out.println("gecersiz sayi");
        
        }
        else{
        while(sayi1>0){ 
            fact=fact*sayi1;
            sayi1--;

        }
        System.out.println("faktoriyel="+fact);
       
        }
    }
}
