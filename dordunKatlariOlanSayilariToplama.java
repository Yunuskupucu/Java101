import java.util.Scanner;

public class dordunKatlariOlanSayilariToplama {
    public static void main(String[] args){
        int n;
        double toplam = 0;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("Sayi Giriniz : ");
            n = scan.nextInt();
            if( n % 4 == 0 ){
                toplam += n;
            }
        }while( (n % 2 == 0) && (n % 4 == 0) );

        System.out.println("Toplam : " + toplam);

    }
}
