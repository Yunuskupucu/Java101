import java.util.Scanner;

public class basSayıToplamı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayi Girin: ");


        int num = input.nextInt();

        int adet = 0,toplam=0;

        while(num != 0)
        {
            toplam +=  (num % 10);
            num /= 10;
            ++adet;
        }
        System.out.println("basamak sayisi : " + adet);
        System.out.println("basamak toplami: " + toplam);
    }
}
