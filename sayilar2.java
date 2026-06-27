import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class sayilar2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Ssayilarr.txt"));
        String satir;
        int toplam = 0;
        int adet = 0;

        while ((satir = br.readLine()) != null) {
            int sayi = Integer.parseInt(satir);
            toplam += sayi;
            adet++;
        }
        br.close();

        double ortalama = (double) toplam / adet;
        System.out.println("Ortalama: " + ortalama);

        BufferedReader br2 = new BufferedReader(new FileReader("Ssayilarr.txt"));
        FileWriter fw = new FileWriter("kucuksayilarr.txt", false);

        while ((satir = br2.readLine()) != null) {
            int sayi = Integer.parseInt(satir);
            if (sayi < ortalama) {
                fw.write(sayi + "\n");
            }
        }

        fw.close();
        br2.close();
    }
}
