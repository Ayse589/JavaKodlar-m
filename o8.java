import java.util.Random;
import java.util.Scanner;

public class o8 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        Random rnd = new Random();
        int puan = 0, cevap;
        String secim;
        do {
            int sayi1 = 100 + rnd.nextInt(101);
            int sayi2 = 100 + rnd.nextInt(101);
            System.out.println("sayi1: " + sayi1);
            System.out.println("sayi2: " + sayi2);
            System.out.println("hangi sayi daha buyuk?");
            cevap = giris.nextInt();
            giris.nextLine();
            if (cevap == 1 && sayi1 > sayi2) {
                System.out.println("dogru");
                puan += 5;
            } else if (cevap == 2 && sayi1 < sayi2) {
                System.out.println("dogru");
                puan += 5;
            } else {
                System.out.println("yanlis");
                puan -= 2;
            }
            System.out.println("tamam mi devam mi");
            secim = giris.nextLine();

        } while (secim.equals("d") || secim.equals("D"));
        System.out.println("puaniniz: " + puan);

    }

}
/*
 * Oyun başladığında 100-200 arasında rastgele 2 tane sayı tutulacak ve ekrana
 * 1.Sayı değeri ile 2.Sayı değeri
 * yazdırılacak (Sayıların aynı gelmediği/tutulmadığını varsayınız. Yani
 * sayıların farklı olması için ek bir
 * kontrol/kod yazılmayacak. Tutulan sayıların farklı olduğunu düşününüz.).
 * 2. Kullanıcıya hangi sayı büyük diye sorulacak.
 * 3. Kullanıcı klavyeden 1 veya 2 bilgisi girecek (1 girer ise 1.sayıyı, 2
 * girerse 2.sayıyı temsil edecek)
 * 4. Girilen cevaba göre kullanıcıya “Doğru” veya “Yanlış” diye ekrana mesaj
 * yazdırılacak.
 * 5. Her doğru cevap için puanı 5 puan artacak, her yanlış cevap için puanı 2
 * azalacak.
 * 6. Her soru cevaplamasından sonra kullanıcıya “Devam mı, tamam mı?(D/T):”
 * sorusu sorulacak.
 * 7. Kullanıcı klavyeden d veya D girer ise yeni soru sorulacak.
 * 8. Kullanıcı d veya D dışında cevap girer ise oyun sonlanacak.
 */