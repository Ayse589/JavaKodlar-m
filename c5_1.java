import java.util.Scanner;

public class c5_1 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("bir cumle gir");
        String cumle = giris.nextLine();
        String harf = cumle.replaceAll("[0-9]", "");
    
        int toplam = 0;
        int rakam=0;
        for (int i = 0; i < cumle.length(); i++) {
        char ch=cumle.charAt(i);
        if(Character.isDigit(ch)){
            rakam++;
            toplam+=Character.getNumericValue(ch);
        }


        }
        System.out.println("rakam sayisi:" + rakam);
        System.out.println("toplam: " + toplam);
    }
}