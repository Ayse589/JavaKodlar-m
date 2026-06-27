import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class sozelpuan {
    public static void sozelpuan(String ogretimturu){
        try {

            BufferedReader br=new BufferedReader(new FileReader("ogrencilerr.txt"));
String satir;
while((satir=br.readLine())!=null) {
    String[] parcalar=satir.split(";");
    String isim=parcalar[0];
    String numara=parcalar[1];
    int sozelpuan=Integer.parseInt(parcalar[3]);
    char ogretim=numara.charAt(2);
    if(String.valueOf(ogretim).equals(ogretimturu)){
        System.out.println(isim + " "+"sozel puani:"+ sozelpuan);
    }
    BufferedReader br2=new BufferedReader(new FileReader("ogrencilerr.txt"));
  
        ArrayList<String> satirlar=new ArrayList<>();
        String satirr;
        boolean silindi= false;
        while((satir=br2.readLine())!=null){
            String[] parca=satir.split(";");
            String sozelpuan1= parcalar[3];
            if(sozelpuan1.equals( "82")){
                System.out.println(satir);

            }
            silindi =true;
            continue;
        }
        br2.close();
        satirlar.add(satir);
          FileWriter fw=new FileWriter("ogrenciler.txt");
        for(String s:satirlar){
            fw.write(s+"\n");
            fw.close();
        }

}br.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
    public static void main(String[] args) {
     sozelpuan("2");

    }
}
/*
 * C:\ogrenciler.txt dosyası içerisinde her bir satırda aşağıdaki biçimde
 * öğrencilere ait şu bilgiler bulunmaktadır:
 * ÖğrenciAdı;ÖğrenciNumarası;SayısalPuanı;SözelPuanı
 * sozelPuanListele(String ogretimTuru) adındaki metot ile kendisine parametre
 * olarak yollanan öğretim türü bilgisine göre öğrencilerin
 * sözel puanlarını ekrana yazdıran metodu yazınız. Öğrencilerin öğretim türü
 * bilgisi öğrenci numarası içerisinde yer almaktadır. Her bir
 * öğrenci numarası 10 karakterden oluşmaktadır. Öğrenci numarasında üçüncü
 * karakter mutlaka ya 1 yada 2 dir. Eğer üçüncü karakter
 * 1 ise öğrenci birinci öğretim öğrencisidir. Eğer üçüncü karakter 2 ise
 * öğrenci ikinci öğretim öğrencisidir. Örneğin sozelPuanListele(“1”)
 * şeklinde metot kullanılır ise dosyadan sadece birinci öğretim öğrencileri nin
 * sadece sözel puanı listelenmelidir. sozelPuanListele(“2”)
 * şeklinde metot kullanılır ise dosyadan sadece ikinci öğretim öğrencileri nin
 * sadece sözel puanı listelenmelidir. Parametre olarak sadece
 * 1 veya 2 bilgisi yollandığını varsayınız. Metot içerisinde oluşabilecek her
 * türlü hatanın da yakalanabileceği ve kullanıcının mesaj ile
 * uyarılacağı istisnai durum kontrolünü de yapınız.
 */
