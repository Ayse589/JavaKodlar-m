import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ornek {

    public static void sozelPuanListele(String ogretimTuru) {

        try {

            BufferedReader br =
                    new BufferedReader(new FileReader("ogrenciler.txt"));

            String satir;

            while ((satir = br.readLine()) != null) {

                String[] parcalar = satir.split(";");

                String ad = parcalar[0];
                String numara = parcalar[1];
                int sozelPuan = Integer.parseInt(parcalar[3]);

            
                char ogretim = numara.charAt(2);

        
                if (String.valueOf(ogretim).equals(ogretimTuru)) {

                    System.out.println(ad +
                            " -> Sözel Puan: " + sozelPuan);
                }
            }

            br.close();

        } catch (IOException e) {

            System.out.println("Dosya okunurken hata oluştu!");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Dosya formatı hatalı!");

        } catch (NumberFormatException e) {

            System.out.println("Puan bilgisi sayı değil!");

        } catch (Exception e) {

            System.out.println("Beklenmeyen hata oluştu!");
        }
    }

    public static void main(String[] args) {

        System.out.println("Birinci öğretim:");
        sozelPuanListele("1");


        System.out.println("İkinci öğretim:");
        sozelPuanListele("2");
    }
}