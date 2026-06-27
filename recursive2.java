public class recursive2 {
    public static int faktoriyel(int a){
        int sonuc = 1;
        if (a==1||a==0){
             sonuc=1;
        }
        else {
            sonuc=a*faktoriyel(a-1);

        }
        return sonuc;
    }
    public static void main(String[] args) {
        int cevap=faktoriyel(7);
        System.out.println(cevap);
        
    }
}
