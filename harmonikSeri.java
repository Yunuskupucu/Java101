import java.util.Scanner;

public class harmonikSeri {
                                                //Harmonik Seri Formülü : 1 + (1/2) + (1/3) + (1/4) + (1/i)
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        double result = 0.0;

        System.out.print("N sayisini Giriniz :");
        n = input.nextInt();

        for(double i = 1; i <= n ;i++){
            result += (1/i);
        }
        System.out.print(result);
    }
}
