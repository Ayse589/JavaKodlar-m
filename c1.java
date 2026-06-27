import java.util.Scanner;

public class c1 {
    public static void main(String[] args) {
        Scanner giris= new Scanner((System.in));
        System.out.println("bir kelime giriniz:  ");
        String kelime=giris.nextLine();
        String ters="";
        String [] harfler=kelime.split("");
        for(int i=harfler.length-1;i>=0;i--){
            ters+=harfler[i];
        }
        System.out.println(ters);

  giris.close();
    }
  
}/*
  * Klavyeden girilen bir kelimeyi ters çevirip ekrana yazan programı yazınız.
  * (Sadece main metodu içindeki kodları yazınız.)
  */
