public class Stringboolean {
    public static boolean palindrom(String kelime){
       
        String ters="";
        String[] harfler=kelime.split("");
        for(int i=harfler.length-1;i>=0;i--){
            ters+=harfler[i];
        }
        if(ters.equals(kelime)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        boolean sonuc=palindrom("ece");
        System.out.println(sonuc);
        
    }
}// recursive degillll
