import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class o {
    public static void main(String[] args) {
        String file = "sayilar.txt";
        int toplam = 0;
        int adet = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("sayilcccar.txt"))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                satir = satir.trim();
                if (satir.isEmpty()) continue;
                try {
                    int sayi = Integer.parseInt(satir);
                    toplam += sayi;
                    adet++;
                } catch (NumberFormatException nfe) {
                    System.err.println("Skipped invalid line: \"" + satir + "\"");
                }
            }

            if (adet == 0) {
                System.out.println("No valid numbers found in `" + "sayilar.txt"+ "`.");
            } else {
                double ortalama = (double) toplam / adet;
                System.out.println("Toplam: " + toplam + ", Adet: " + adet + ", Ortalama: " + ortalama);
            }
        } catch (IOException e) {
            System.err.println("I/O error reading `" +" sayilar.txt"+ "`: " + e.getMessage());
        }
    }
}