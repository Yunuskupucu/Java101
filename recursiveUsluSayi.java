import java.util.Scanner;

public class recursiveUsluSayi {

    static int power(int a,int b){

        int result = 1;

        for(int i = 1; i <= b; i++){
            result *= a;
        }
        return result;

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Ussu alinacak sayiyi giriniz :");
        int a = input.nextInt();
        System.out.print("Us olacak sayiyi giriniz :");
        int b = input.nextInt();

        System.out.println(power(a,b));
    }
}
