import java.util.Scanner;

public class maxVeMin {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sayim, number, min = 1, max = 1;

        System.out.print("Kac Adet Sayi Gireceksiniz : ");
        sayim = input.nextInt();

        for(int i = 1; i <= sayim; i++){
            System.out.print(i + ". Sayiyi Giriniz : ");
            number = input.nextInt();

            if (i == 1){
                max = number;
                min = number;
            }

            if (number > max){
                max = number;
            }

            if (number < min){
                min = number;
            }
        }
        System.out.println("En buyuk sayi :" + max);
        System.out.print("En kucuk sayi :" + min);
    }
}
