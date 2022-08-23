import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n,sum = 0;

        System.out.println("=====MUKEMMEL SAYI SORGULAMA=====\n");
        System.out.print("Sorgulanacak Sayiyi Giriniz :");
        n = input.nextInt();

        for(int i = n-1;  i >= 1; i--){

            if (n % i == 0){
                sum += i;
            }
        }
        if (sum ==n){
            System.out.println("Sayiniz mukemmel sayidir.");
        }else {
            System.out.println("Sayiniz mukemmel sayi degildir.");
        }
    }
}
