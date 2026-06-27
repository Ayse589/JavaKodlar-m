import java.util.Scanner;

public class sinav {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        String harf, buyukHarf;
        String yeniCumle, cumle;
        System.out.println("bir cumle yazin");
        cumle = giris.nextLine();

        System.out.println("harf girin");
        harf = giris.next();

        cumle = cumle.toLowerCase();
        buyukHarf = harf.toUpperCase();

        yeniCumle = cumle.replaceAll(harf, buyukHarf);
        System.out.println(yeniCumle);
    }
}
/*
 * 1. Klavyeden girilen bir cümle ve yine String olarak klavyeden veri girişi
 * yapılan bir karakteri; Cümle içerisinde geçtiği
 * yerlerde büyük-küçük fark etmez sadece o karakteri büyük harfe çevirip
 * diğerlerini küçük harfe çevirip, en sonunda
 * cümleyi ekrana yazan programın kodlarını yazınız. (Sadece main ana metodu
 * içerisindeki kodları yazınız)
 */
