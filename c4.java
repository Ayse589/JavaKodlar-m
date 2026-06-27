import java.util.Scanner;

public class c4 {
    public static void main(String[] args) {
        Scanner giris =new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle=giris.nextLine();
        int kelimesayisi=0;
        String[] kelimeler=cumle.split(" ");
        for(int i=0;i<kelimeler.length;i++){
            kelimesayisi++;
        }
        System.out.println(kelimesayisi);


    }
}/*
  * Klavyeden girilen bir cümledeki kelime sayısını bulan programı yazınız.
  * (Sadece main metodu içindeki kodları yazınız.)
  */
