import java.util.Scanner;

public class o7 {
    public static void main(String[] args) {
         Scanner giris=new Scanner(System.in);
         int km,yas,tip;
         System.out.println("mesafeyi giriniz :");
         km=giris.nextInt();
         System.out.println("\nyasinizi giriniz :");
         yas=giris.nextInt();
         System.out.println("\nyolculuk tipini giriniz(1=tek gidiş,2=gidiş/dönüş)");
         tip=giris.nextInt();
          double normalFiyat,yasIndirimi,tipIndirimi;
          if(km>0&&yas>0&&(tip==1||tip==2)){
            normalFiyat=km*0.10;
            if(yas<12){
                yasIndirimi=normalFiyat*0.50;

            }
            else if(yas>=12&&yas<=24){
                yasIndirimi=normalFiyat*0.10;
            }
            else if(yas>65){
                yasIndirimi=normalFiyat*0.30;

            }
            else{
               yasIndirimi=0;
            }
            normalFiyat-=yasIndirimi;
            if(tip==2){
                tipIndirimi=normalFiyat*0.20;
                normalFiyat=(normalFiyat-tipIndirimi)*2;
            }
            System.out.println("bilet tutariniz:  "+normalFiyat+"$");

          }else{
            System.out.println("girdiğiniz değerler eksik olabilir tekrar deneyin1");
          }


        
    }
}
