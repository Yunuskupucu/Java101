import java.util.Scanner;

public class ortalama {
    public static void main(String[] args){
        double sayi,toplam = 0,sonuc,sayac = 0;
        int i;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lutfen islem yapmak istediginiz sayiyi girin : ");
        sayi = inp.nextDouble();

        for(i = 1;i <= sayi;i++){
            if( (i % 3 == 0) && (i% 4 ==0)){
                toplam += i;
                sayac++;
                System.out.println("Bulunan sayi : " + i);
            }
        }
        sonuc = toplam/sayac;
        System.out.println("Sonuc : " + sonuc);
    }
}
