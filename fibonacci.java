public class fibonacci {
    public static int fibo(int sayi){
        if(sayi==0){
            return 0;
        }
        else if(sayi==1){
            return 1;
        }
         else{
             return fibo(sayi-1)+fibo(sayi-2);

         }

    }
    public static void main(String[] args) {
        int cevap=fibo(8);
        System.out.println(cevap);
        
    }
}
