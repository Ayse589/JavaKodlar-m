import java.util.Scanner;

public class c2 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        System.out.println("bir cumle girin");
        String cumle=giris.nextLine();
        String newcumle= cumle.replaceAll(" ","");
        System.out.println(newcumle);

    }
}/*
  * Klavyeden girilen bir cümledeki boşlukları kaldırıp, cümleyi bitişik halde
  * ekrana yazan programı yazınız. (Sadece main metodu içindeki kodları yazınız.)
  */
