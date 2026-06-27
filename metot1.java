import java.util.Arrays;

public class metot1 {
    public static void main(String[] args) {
         int[] sayilar = { 2, 3, 6, 5, 3, 9, 8,11 };
        int[] sonuc= tekleriGetir(sayilar);
        System.out.println(Arrays.toString(sonuc));
        
    }
    public static int[] tekleriGetir(int []gelenDizi){
        int [] tekler;
        int adet=0,kalan=0;
        for (int eleman : gelenDizi) {
            kalan = eleman % 2;
            if(kalan==1)
                adet++;
        }
    tekler = new int[adet];
        int yeniIndex = 0;
        for(int i=0;i<gelenDizi.length;i++){
                int eleman=gelenDizi[i];
                kalan=eleman%2;
                if(kalan==1){
                     tekler[yeniIndex] =eleman;
                yeniIndex++;
            }
                    
                }
                return tekler;

        }
        

    }
    

