public class yerdeğistirdizi {
    public static void   f(int dizi[],int a,int b){
        int gecici=dizi[a];
        dizi[a]=dizi[b];
        dizi[b]=gecici;
    }
public static void main(String[] args) {
     int[] dizi={1,3,5,79,753,3};
    f(dizi,2, 3);
    for(int i=0;i<dizi.length;i++){
        System.out.println(dizi[i]);
    }
    
}
}
