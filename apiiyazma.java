
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class odev_2416501055 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        try {
            String apiUrl = "https://api.tvmaze.com/shows";
            URL url = URI.create(apiUrl).toURL();
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);

            }
            reader.close();
            String json = sb.toString();
            while (true) {
                System.out.println("[1]: veri cek ");
                System.out.println("[2]: listele ");
                System.out.println("[2a]: isime göre listele");
                System.out.println("[2b]: dile göre listele");
                System.out.println("[2c]: tarihe göre listele ");
                System.out.println("[2d]:  türe göre listele ");
                System.out.println("[2e]: hepsini listele");
                System.out.println("[3]: guncelle ");
                System.out.println("[3a]: isim bilgisine gore guncelle ");
                System.out.println("[4]: sil ");
                System.out.println("[4a]: tarih bilgisine gore ara ve sil");
                System.out.println("[5]: CIKIS");
                System.out.println(" lütfen secim yapiniz ");
                String secim = giris.nextLine();
                switch (secim) {
                    case "1":
                        FileWriter fw = new FileWriter("diziler.txt", false);
                        String[] diziler = json.split("\\},\\{");
                        for (String parca : diziler) {
                            String isim = "";
                            if (parca.contains("\"name\"")) {
                                int baslangicc = parca.indexOf("\"name\":\"") + 8;
                                int bitis = parca.indexOf("\"", baslangicc);
                                isim = parca.substring(baslangicc, bitis);
                            }
                            String dil = "";
                            if (parca.contains("\"language\"")) {
                                int baslangicc = parca.indexOf("\"language\":\"") + 12;
                                int bitis = parca.indexOf("\"", baslangicc);
                                dil = parca.substring(baslangicc, bitis);
                            }
                            String tarih = "";
                            if (parca.contains("\"premiered\"")) {
                                int baslangicc = parca.indexOf("\"premiered\":\"") + 13;
                                int bitis = parca.indexOf("\"", baslangicc);
                                tarih = parca.substring(baslangicc, bitis);
                            }
                            String tur = "";
                            if (parca.contains("\"genres\"")) {

                                int baslangic = parca.indexOf("[");
                                int bitis = parca.indexOf("]");
                                String turBilgisi = parca.substring(baslangic + 1, bitis);

                                String[] Tür = turBilgisi.replace("\"", "").split(",");

                                tur = Tür[0];
                                String turler = " ";

                                for (String t : Tür) {
                                    turler += t + "";
                                }

                                tur = turler;

                            }
                            fw.write(isim + ";" + dil + ";" + tarih + ";" + tur + "\n");

                        }
                        fw.close();

                        System.out.println("veriler dosyaya yazildiii zaten .");
                        System.out.println();
                        break;
                    case "2a":
                        System.out.println("aramak istediğiniz isim: ");
                        String arananIsim = giris.nextLine();
                        BufferedReader br1 = new BufferedReader(new FileReader("diziler.txt"));
                        String satir1;
                        while ((satir1 = br1.readLine()) != null) {
                            String[] parca = satir1.split(";");

                            if (parca[0].trim().equalsIgnoreCase(arananIsim)) {
                                System.out.println(satir1);
                            }

                        }
                        br1.close();
                        break;

                    case "2b":
                        System.out.println("aramak istediğiniz dil: ");
                        String arananDil = giris.nextLine();
                        BufferedReader br2 = new BufferedReader(new FileReader("diziler.txt"));
                        String satir2;
                        while ((satir2 = br2.readLine()) != null) {
                            if (satir2.contains(arananDil)) {
                                System.out.println(satir2);
                            }
                        }
                        br2.close();
                        break;

                    case "2c":
                        System.out.println("aramak istediğiniz tarih: ");
                        String arananTarih = giris.nextLine();
                        BufferedReader br3 = new BufferedReader(new FileReader("diziler.txt"));
                        String satir3;
                        while ((satir3 = br3.readLine()) != null) {
                            if (satir3.contains(arananTarih)) {
                                System.out.println(satir3);
                            }
                        }
                        br3.close();
                        break;

                    case "2d":
                        System.out.println("aramak istediğiniz tur : ");
                        String arananTur = giris.nextLine();
                        BufferedReader br4 = new BufferedReader(new FileReader("diziler.txt"));
                        String satir4;
                        while ((satir4 = br4.readLine()) != null) {
                            if (satir4.contains(arananTur)) {
                                System.out.println(satir4);
                            }
                        }
                        br4.close();
                        break;

                    case "2e":

                        BufferedReader br = new BufferedReader(new FileReader("diziler.txt"));

                        String satir;

                        while ((satir = br.readLine()) != null) {

                            String[] parca = satir.split(";");

                            System.out.println("İSİM: " + parca[0].trim());
                            System.out.println("DİL: " + parca[1].trim());
                            System.out.println("TARİH: " + parca[2].trim());
                            System.out.println("TÜR: " + parca[3].trim());
                            System.out.println("**********************");
                        }

                        br.close();

                        break;

                    case "3a":
                        System.out.println("güncellemek istediğiniz isim:");
                        String eski = giris.nextLine();
                        BufferedReader br6 = new BufferedReader(new FileReader("diziler.txt"));
                        StringBuilder yeni = new StringBuilder();
                        String satir6;
                        boolean DegistiMi = false;
                        while ((satir6 = br6.readLine()) != null) {
                            String[] parca = satir6.split(";");

                            if (parca[0].trim().equalsIgnoreCase(eski)) {

                                System.out.println(satir6);
                                System.out.print("e/h: ");
                                String cevap = giris.nextLine();

                                if (cevap.equalsIgnoreCase("e")) {
                                    System.out.print("yeni isim: ");
                                    String yeniIsim = giris.nextLine();

                                    parca[0] = yeniIsim;

                                    satir6 = parca[0] + ";" +
                                            parca[1] + ";" +
                                            parca[2] + ";" +
                                            parca[3];

                                    DegistiMi = true;
                                }
                            }

                            yeni.append(satir6).append("\n");
                        }
                        br6.close();
                        FileWriter fw2 = new FileWriter("diziler.txt");
                        fw2.write(yeni.toString());
                        fw2.close();

                        if (DegistiMi) {
                            System.out.println("guncellendii");
                        } else {
                            System.out.println("bulunamadi");

                        }
                        break;

                    case "4a":
                        System.out.print("Silmek istediğiniz tarih: ");
                        String silTarih = giris.nextLine();
                        BufferedReader br7 = new BufferedReader(
                                new FileReader("diziler.txt"));
                        ArrayList<String> liste = new ArrayList<>();
                        String satir7;

                        boolean silindi = false;

                        while ((satir7 = br7.readLine()) != null) {
                            String[] parca = satir7.split(";");
                            if (parca[2].trim().equals(silTarih)) {

                                System.out.println(satir7);
                                System.out.print("Silmek istiyor musunuz? (e/h): ");
                                String cevap = giris.nextLine();

                                if (cevap.equalsIgnoreCase("e")) {
                                    silindi = true;
                                    continue;
                                }
                            }
                            liste.add(satir7);
                        }
                        br7.close();

                        FileWriter fw3 = new FileWriter("diziler.txt");
                        for (String s : liste) {
                            fw3.write(s + "\n");
                        }
                        fw3.close();
                        if (silindi) {
                            System.out.println("Silindi");

                        } else {

                            System.out.println("Bulunamadi");
                        }

                        break;

                    case "5":
                        System.out.println("cikis yapiliyorr");
                        return;

                    default:
                        System.out.println("hatali secim yaptiniz ");

                }

            }
        } catch (Exception e) {
            System.out.println("API baglantisinda hata olustu");

            try {
                FileWriter logYaz = new FileWriter("log.txt", true);
                logYaz.write(
                        "HATA: API baglantisi kurulamadi\n");

                logYaz.write(
                        "Hata mesaji: " +
                                e.getMessage() + "\n");

                logYaz.write(
                        "-----------------------\n");

                logYaz.close();

            } catch (Exception hata) {

                System.out.println(
                        "log dosyasina yazilamadi");
            }
        }

    }
}
