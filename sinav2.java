public class sinav2 {
public static int recursive(int m ,int n){
    
    if(m<1||n<1){
        return-1;
    }
    else if (m == 1){  
return ((1 + 1) * (1 + 1)) + (n * n);
    }
   else{
return (m+1)*(m+1)+(n*n)+recursive(m-1, n);

   }




}

        public static void main(String[] args) {
            recursive(3, 6);

    }
}
/*
 * 2. Kendisine yollanan iki pozitif tam sayı m ve n ‘e göre aşağıdaki işlemin
 * sonucunu bulan bir recursive metot yazınız.
 * (Örnek: islemiHesapla(3,8) metodu çağrıldığında geriye [(1+1)2+82] +
 * [(2+1)2+82] + [(3+1)2+82] hesaplayıp sonucunu
 * döndürmelidir. Eğer 1.sayı veya 2.sayıdan herhangi biri 1 den küçük ise
 * geriye -1 değeri döndürecektir.) Sadece metodu
 * yazınız.
 */
