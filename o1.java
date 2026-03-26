public class o1 {

    public static void main(String[] args) {

               
for(int x=30;x>=-30;x--){
    for(int y=30;y>=-30;y--){
        if(x!=y&& Math.abs(x)+Math.abs(y)<=30){
            System.out.println("("+x+","+y+")");
        }
    }
}
    
    }
}