import java.util.Arrays;

public class sirala {
    public sirala(int... sayilar){
    Arrays.sort(sayilar);

        System.out.println(sayilar[0]);
        System.out.println(sayilar[sayilar.length-1]);
    }

    public static void main(String[] args) {
       new sirala(4,7,77,5,54,53,53);
        
    }
}
