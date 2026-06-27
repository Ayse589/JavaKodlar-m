import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ss {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("sayilar.txt"))) {
            String satir;
            int toplam = 0;
            int adet = 0;

            // Dosyadaki tüm sayıları oku
            while ((satir = br.readLine()) != null) {
                satir = satir.trim();
                if (!satir.isEmpty()) { // boş satır kontrolü
                    int sayi = Integer.parseInt(satir);
                    toplam += sayi;
                    adet++;
                }
            }br.close();

            if (adet == 0) {
                System.out.println("Dosya boş, ortalama hesaplanamadı.");
                return;
            }

            double ortalama = (double) toplam / adet;
            System.out.println("Dosyadaki sayıların ortalaması: " +"\n"+ ortalama);
            System.out.println();

            // Ortalamanın altındaki sayıları yeni dosyaya yaz
            try (BufferedReader br2 = new BufferedReader(new FileReader("sayilar.txt"));
                 FileWriter fw = new FileWriter("kucuksayilar.txt", false)) {

                while ((satir = br2.readLine()) != null) {
                    satir = satir.trim();
                    if (!satir.isEmpty()) {
                        int sayi = Integer.parseInt(satir);
                        if (sayi < ortalama) {
                            fw.write(sayi + "\n");
                        }
                    }
                }

            fw.close();
        br2.close();
    }
        } catch (IOException e) {
            System.out.println("Dosya okuma/yazma hatası: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Dosyada sayı dışında karakter var: " + e.getMessage());
        }
    }
}
