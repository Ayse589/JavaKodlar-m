public class o7 {
    public static void nufus(double nufus,double artis,int yil){
        for(int i=0;i<yil;i++){
        nufus+=nufus*artis/100;
    }
    System.out.println(nufus);
}
    public static void main(String[] args) {
        nufus(82.1888,1.5,6);
        
    }
}
