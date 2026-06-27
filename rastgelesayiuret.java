import java.util.Random;

public class rastgelesayiuret {
    public static void rastgele(int a,int b,int c){
        Random rnd =new Random();
      
       for( int i=0;i<c;i++){
        int  sayi =a+rnd.nextInt(b-a+1);
     
       
       System.out.println(sayi);

    }
}
    public static void main(String[] args) {
        rastgele(10,45,7);
    }
}


