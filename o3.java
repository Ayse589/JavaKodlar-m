import java.util.Scanner;
public class o3 {
    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
         double vize,finnal,ortalama;
         System.out.println("birinci sinavi gir");
         vize= giris.nextDouble();
         System.out.println("ikinci sinavi gir");
         finnal= giris.nextDouble();
         ortalama=(vize*0.4)+(finnal*0.6);
         System.out.println("ortalama"+ortalama);

          if(ortalama>70){
            System.out.println("basarili");

          }else{
            System.out.println("basarisiz");
          }


      
    }
}


