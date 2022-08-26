import java.util.Scanner;

public class recursiveAsalSayi {

    static void asal(int a,int i){
        if (i == a) {
            System.out.print(a + " asal sayidir.");
            return;
        } else if (a%i == 0) {
            System.out.print(a + " asal sayi degildir.");
            return;
        }

        asal(a, i + 1);

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.print("Bir Sayi Giriniz :");
        a = scan.nextInt();
        asal(a,2);
    }
}
