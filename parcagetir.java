public class parcagetir {
    public static String parcagetir(String cumle, int baslangic, int bitis) {
        if (cumle == null || baslangic < 1 || baslangic > bitis) {
            return "";
        }

        return cumle.substring(baslangic - 1, bitis);

    }

    public static void main(String[] args) {
        System.out.println(parcagetir("java", 1, 3));

    }
}
/*
 * string parcaGetir(String kelime,int baslangic,int bitis)
 * parcaGetir(“merhaba”,1,3)  mer
 * parcaGetir(“ali”,2,3)  li
 * parcaGetir(“ali”,1,5)  hiçbir değer geri döndürmeyecek
 */
