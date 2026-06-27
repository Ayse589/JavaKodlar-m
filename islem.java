public class islem {
    public static  void hesaplama(int  sayi1, int sayi2, char islem) {
  double   sonuc = 0;
        switch (islem) {
            case '+':
                sonuc += sayi1 + sayi2;
                break;

            case '-':
               sonuc+= sayi1 - sayi2;
                break;

            case '*':
                sonuc += sayi1 * sayi2;
                break;

            case '/':
             sonuc += sayi1 / sayi2;

        }
        System.out.println(sonuc);
    }

    public static void main(String[] args) {
      hesaplama(5, 6, '*');
        

    }
}
/*
 * hesaplamaIslemiYap(double sayi1,double sayi2,char islem) metodu kendisine
 * parametre olarak yollanan sayi1 ve sayi2 i işlem
 * tipine göre dört temel matematiksel işlemden birini yapacak. Yani
 * HesaplamaIslemiYap(20,40,’+’)  sonucu 60 bulunmalı
 * HesaplamaIslemiYap(20,40,’*’)  sonucu 80 bulunmalı
 */
