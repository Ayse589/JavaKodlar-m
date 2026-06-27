import java.util.Scanner;

public class uzuncumle {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("bir cumle giriniz:");
        String cumle = giris.nextLine();

        int kelime = 0;
        String[] harfler = cumle.split(" ");
        String enuzun = " ";
        for (int i = 0; i < harfler.length; i++) {
            if (harfler[i].length()>enuzun.length()) {
                enuzun=harfler[i];

            }
        }
        System.out.println(enuzun);

    }
}
/*
 * Klavyeden girilen bir cümledeki en uzun kelimeyi bulan programı yazınız.
 * (Sadece main metodu içindeki kodları yazınız.)
 */
