import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak Sayisini Giriniz :");
        int sayi=input.nextInt();

        for (int i=sayi;i>0;i--){

            for (int bosluk=sayi-i;bosluk>0;bosluk--){
                System.out.print(" ");
            }

            for (int yildiz = 2*i-1; yildiz > 0; yildiz--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
