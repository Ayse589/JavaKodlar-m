public class rakamlaritoplami {
    public static int rakamtoplam(int sayi) {
            int toplam=0;
            if(sayi==0){
                return 0;
            }
            else{
                toplam+=sayi%10;
                return toplam+rakamtoplam(sayi/10);
            }
    }

    public static void main(String[] args) {
    int sonuc=  rakamtoplam(77777);
    System.out.println("rakamlari toplami:"+ sonuc) ;
    }
}
