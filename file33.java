import java.io.File;
import java.io.IOException;

public class file33 {
    public static void main(String[] args) throws IOException {

        File file = new File("d:\\programlama1");

        System.out.println("Klasör var mı? " + file.exists());

        File[] dosyalar = file.listFiles();

        if (dosyalar == null || dosyalar.length == 0) {
            System.out.println("Klasör boş veya okunamıyor");
            return;
        }

        for (File file1 : dosyalar) {

            if (file1.isFile()) {

                String dosyaAdi = file1.getName();

                String[] parcalar = dosyaAdi.split("\\.");

                // nokta yoksa hata olmasın
                if (parcalar.length < 2) {
                    System.out.println("Atlandı: " + dosyaAdi);
                    continue;
                }

                System.out.println("Orijinal: " + parcalar[0]);

                String yeniIsim = parcalar[0] + "Kopya";

                File kopyaDosya = new File(
                        "d:\\programlama1\\" + yeniIsim + "." + parcalar[1]
                );

                kopyaDosya.createNewFile();

                System.out.println("Oluşturuldu: " + kopyaDosya.getName());
            }
        }
    }
}