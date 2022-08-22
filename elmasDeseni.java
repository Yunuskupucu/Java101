import java.util.Scanner;

public class elmasDeseni {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Basamak Sayisini Giriniz :");
        n = input.nextInt();

        for (int i = 0; i <= n ; i++) {

            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int i =0; i <= n ; i++){

            for(int j =0; j <= i-1; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= (2 * n - (2 * i - 1)); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
