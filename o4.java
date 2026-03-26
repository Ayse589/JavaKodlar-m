import java.util.Random;
import java.util.Scanner;

public class o4 {
    public static void main(String[] args) {
        int hak1;
        int kasa=0;
       
        Scanner giris=new Scanner(System.in);
        Random rnd=new Random(); 
         int sayi1 = 1+ rnd.nextInt(9);
         System.out.println(sayi1);
         kasa+=sayi1;
       
         System.out.println("kac sefer daha tutayım");
          hak1 =giris.nextInt();
         for(int i=0;i<hak1;i++){
             int sayi =  rnd.nextInt(9);
             System.out.println(sayi);
             kasa+=sayi;

         }
         if(kasa>35){
            System.out.println("TEBRIKLER KAZANDINIZ");

         }
         else{
            System.out.println("uzgunum kaybettiniz");
         }








    }
}
