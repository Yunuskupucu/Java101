import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args){
        int mesafe,yas,yolculuktipi;
        double indirimorani;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen Mesafeyi Giriniz (km) : ");
        mesafe = input.nextInt();

        System.out.print("Lutfen Yasinizi Giriniz : ");
        yas = input.nextInt();

        System.out.print("Lutfen yolculuk tipini giriniz : ");
        System.out.println("1 --> Tek Yon / 2 --> Gidis-Donus");
        yolculuktipi = input.nextInt();

        if((mesafe > 0) && (yas > 0) && (yolculuktipi==1 || yolculuktipi==2)){

            if(yas < 12){
                indirimorani = 0.50;
            }else if(yas > 12 && yas < 24){
                indirimorani = 0.10;
            }else if(yas > 65){
                indirimorani = 0.30;
            }else{
                indirimorani = 0;
            }

            double normalTutar = mesafe * 0.10;
            double yasİndirimi = normalTutar * indirimorani;
            double indirimliTutar = normalTutar - yasİndirimi;
            double toplamTutar;

            if(yolculuktipi == 2){

                double gidisDonusİndirimi = indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar - gidisDonusİndirimi) * 2;
            }else{
                toplamTutar = indirimliTutar;
            }

            System.out.println("Toplam Tutar = " + toplamTutar + "TL");
        }else{
            System.out.println("Hatali Veri Girdiniz !");
        }
    }
}