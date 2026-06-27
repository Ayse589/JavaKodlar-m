import java.util.Scanner;

public class switchh {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle = giris.nextLine();
        String sesliler = "aeıiuoüö";
        int sayac = 0;
        for (int i = 0; i < cumle.length(); i++) {
            char ch = Character.toLowerCase(cumle.charAt(i));

            switch (ch) {
                case 'a':

                case 'e':

                case 'i':

                case 'ı':

                case 'o':

                case 'ö':

                case 'ü':

                case 'u':
                    sayac++;
                    break;

            }}
            System.out.println(sayac);

        
    
    }

}
