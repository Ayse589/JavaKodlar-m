public class Stringcevirr {
    public static String cevir(String cumle){
        String ters="";
        String[] kelimeler=cumle.split("");
        for(int i=kelimeler.length-1;i>=0;i--){
            ters+=kelimeler[i];
        }
        return ters;
    }
    public static void main(String[] args) {
        String sonuc=cevir("bugun hava guzeldi");
        System.out.println(sonuc);
    }
    
}// recursive degil bun metot unutmmmaa!!!
