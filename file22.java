import java.io.File;

public class file22 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            File file = new File("d:\\ogrenciler" + i);

            if (!file.exists()) {
                file.mkdir();
            }
            file.delete();
        }

        // örnek olarak ogrenciler0 klasörünü listele
        File klasor = new File("d:\\ogrenciler0");

        String[] liste1 = klasor.list();

        if (liste1 != null) {
            for (String string : liste1) {
                System.out.println(string);
            }
        }
    }
}