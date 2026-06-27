import java.util.Random;

public class o4 {
    public static int rastgele() {
        Random rnd = new Random();
        int sayi = rnd.nextInt(101);
        return sayi;
    }

    public static void main(String[] args) {
        int sonuc = rastgele();
        System.out.println("Tutulan sayi: " + sonuc);
    }
}
