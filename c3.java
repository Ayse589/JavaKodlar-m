import java.util.Scanner;

public class c3 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle=giris.nextLine();
        String sesliler="aeiıouüöAEİOUIÜÖ";
        int sayac=0;
        for(int i=0;i<cumle.length();i++){
        char ch=cumle.charAt(i);
        if(sesliler.indexOf(ch)!=-1){
            sayac++;
        }
        }
        System.out.println(sayac);
    }
}
