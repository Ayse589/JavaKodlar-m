public class o9 {
    public static String  parcaGetir(String kelime,int baslangic,int bitis) {
        String sonuc="";
      for (int i = baslangic -1; i < bitis; i++) {

            sonuc += kelime.charAt(i);
        }
        return sonuc;
    }
    public static void main(String[] args) {
        System.out.println(parcaGetir("merhaba",1,3));
        System.out.println(parcaGetir("ayse",1,2));
        
    }
}

/*string parcaGetir(String kelime,int baslangic,int bitis) 
parcaGetir(“merhaba”,1,3)  mer 
parcaGetir(“ali”,2,3)  li 
parcaGetir(“ali”,1,5)  hiçbir değer geri döndürmeyece */