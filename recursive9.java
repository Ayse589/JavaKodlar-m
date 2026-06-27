public class recursive9 {
    public static int dizi(int[] diizi,int index){
        int carpim=1;
        if(index==diizi.length-1){
            return diizi[index];
        }
        else{
            return  diizi[index]*dizi(diizi, index+1);
        }
    }
    public static void main(String[] args) {
        int [] dizi={3,7,3};
    int sonuc=dizi(dizi,0);
    System.out.println(sonuc);
        
    }
}
