import java.io.IOException;

public class string {
    public static String kelimeler(String... cumle) {
        try {
            String enuzunCumle="";
            int kelime=0;
            for(int i=0;i<cumle.length;i++){
                String[] kelimeler=cumle[i].split(" ");
            
int adet=kelimeler.length;
 if (adet > kelime) {

                kelime = adet;
                    enuzunCumle = cumle[i];
            }}
        } catch (Exception e) {

            System.out.println("parametre bilgisi string değil!");
   return "HATA";
        }
        return null;

     
    }

    public static void main(String[] args) {
       String sonuc= kelimeler("bugun hava guneslı gorunuyordu aslında","sena cok medenıyetsiz bir insan ","java dilini hic sevmiyorum","cok uykum var ama ders calısmak zorundayım");
    
     System.out.println(sonuc);
    }
}
/*
 * 2. Kendisine yollanan String veri tipindeki her bir parametresi cümle olan ve
 * değişken sayıda parametre alabilen metot,
 * parametrelerinden (cümlelerden) en fazla kelimeye sahip olan cümleyi geriye
 * döndürecektir. Ayrıca metot içerisinde
 * oluşabilecek her hangi bir hatada (her türlü hatanın kontrolü yapılmalı)
 * geriye “HATA” mesajını String olarak
 * döndürecektir. Bu işlemi yapan metodu yazınız. Sadece metot yazılacaktır. (35
 * puan)
 */
