import java.util.Arrays;
import java.util.Random;

public class hh {
    public static void dizi(int [] dizi){
        Arrays.sort(dizi);
for(int sayi: dizi)
    System.out.println(sayi+ " ");

    }
    
    public static void main(String[] args) {
        int dizii[]=new int [50];
        Random rnd =new Random();
        for(int i=0;i<dizii.length;i++){
        dizii[i]=rnd.nextInt(101);
        }

        dizi(dizii);

        
    }
}
