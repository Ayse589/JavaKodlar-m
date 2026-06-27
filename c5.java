import java.util.Scanner;

public class c5 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        System.out.println(" bir cumle giriniz:");
        String cumle=giris.nextLine();
        int sayac=0;
        for(int i=0;i<cumle.length();i++){
            char ch=cumle.charAt(i);
            if(Character.isDigit(ch)){
                sayac++;
            }
        }
        System.out.println(sayac);
        
    }
}
