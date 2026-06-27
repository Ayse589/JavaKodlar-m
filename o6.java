import java.util.Scanner;

public class o6 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int sayi;
        boolean asal =true;
        do {
            System.out.println("lutfen bir sayi giriniz:");
             sayi=giris.nextInt();
            
            
            
        } while (sayi<2);
        for(int i =2;i<sayi;i++){
            if(sayi%i==0){
                asal =false;
                break;
            }
        }
        if(asal){
            System.out.println("girdiginiz sayi: " +sayi+  " asaldir");
        }
        else{
            System.out.println("girdiginiz sayi: " +sayi+ " asal degildir.");
        }
    }
}
