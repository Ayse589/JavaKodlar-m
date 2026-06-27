public class faktoriyel {
    public static int faktoriyel(int sayi){
        if(sayi==1||sayi==0){
            return 1;
        }
        else{
            return sayi*faktoriyel(sayi-1);
        }
    }
    public static void main(String[] args) {
        int sonuc=faktoriyel(6);
        System.out.println(sonuc);
    }
}
