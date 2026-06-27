public class recursise7 {
    public static int sayilariTopla(int sayi1,int sayi2){
        if(sayi1==sayi2){
            return sayi1;
        }
        else{
            return sayi1+sayilariTopla(sayi1+1, sayi2);
        }
    }

    public static void main(String[] args) {
        int cevap = sayilariTopla(7, 11);
        System.out.println(cevap);

    }
}
/*
 * 2. Kendisine yollanan iki pozitif tam sayı arasındaki sayıların toplamını
 * bulan bir recursive metot yazınız. (Örnek: sayilariTopla(5,20)
 * metodu çağrıldığında geriye 5+6+……+19+20 işleminin sonucunu döndürecektir.
 * 1.sayının her zaman 2.sayıdan küçük olduğunu
 * varsayınız.)
 */
