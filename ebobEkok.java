import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int kucukSayi = 1, ekok = 1, ebob = 1;

        System.out.print("1.Sayiyi giriniz :");
        int sayi1 = input.nextInt();

        System.out.print("2.Sayiyi Giriniz :");
        int sayi2 = input.nextInt();

        if(sayi1 < sayi2){
            kucukSayi = sayi1;
        } else if (sayi2 < sayi1) {
            kucukSayi = sayi2;
        } else if (sayi2 == sayi1) {
            System.out.println("Esit Olamazlar !");
        }

        System.out.println("Iki sayidan kucuk olani : " + kucukSayi);
        int a = kucukSayi;

        while (a >=1){
            if (sayi1 % a == 0 && sayi2 % a == 0){
                ebob = a;
                System.out.println("Ebob : " + ebob);
                break;
            }a--;
        }
        System.out.println("Ekok : " + (sayi1*sayi2)/ebob);
    }
}
