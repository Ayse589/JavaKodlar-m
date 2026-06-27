public class enbuyuk {
    public static int enbuyk(int[] dizi,int index){
        if (index==dizi.length-1){
            return dizi[index];
        }
        
            int enbuyuk=enbuyk(dizi, index+1);
            if(enbuyuk>dizi[index]){
                return enbuyuk;
            }
            else{
                return dizi[index];
            }

     
    }
    public static void main(String[] args) {
        int [] dizi={4,67,8,77,655,4,3,21,1,35,6,7};
        int sonuc=enbuyk(dizi, 0);
        System.out.println(sonuc);
        
    }

}