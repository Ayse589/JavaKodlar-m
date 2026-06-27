import java.util.Arrays;

public class metot3 {
    public static void main(String[] args) {
        int [] sayilar={1,5,7,86,44,5,4,3456,312,4};
        int[] sonuc=ciftGetir(sayilar);
        System.out.println(Arrays.toString(sonuc));
        
    }
    public static int[]  ciftGetir(int [] gelenDizi){
        int []ciftler;
        int kalan=0;
        int adet=0;
        for(int eleman:gelenDizi){
            kalan=eleman%2;
            if(kalan==0)
                adet++;
        }
        ciftler=new int[adet];
        int index=0;
        for(int i=0;i<gelenDizi.length;i++){
            int eleman=gelenDizi[i];
            kalan=eleman%2;
            if(kalan==0){
                ciftler[index]=eleman;
            index++;
             
            }
        }
        return ciftler;


    }
}
