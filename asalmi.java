public class asalmi {
    public static boolean asalmi(int sayi){
        for(int i=2;i<sayi;i++){
            if(sayi%i==0){
                return false;
            }
         
        }
        return true;

    }
    public static void main(String[] args) {
        boolean sonuc=asalmi(9);
        System.out.println(sonuc);
        
    }
}
