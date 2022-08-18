import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n1,n2,select;

        Scanner input = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz : ");
        n1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz :");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminiz : ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.print("Toplama isleminin sonucu : " + (n1+n2));
                break;
            case 2:
                System.out.print("Cikarma isleminin sonucu : " + (n1-n2));
                break;
            case 3:
                System.out.print("Carpma isleminin sonucu : " + (n1*n2));
                break;
            case 4:
                System.out.print("Bolme isleminin sonucu : " + (n1/n2));
                break;
            default:
                System.out.print("Hatali giris yaptiniz !");
        }




    }
}