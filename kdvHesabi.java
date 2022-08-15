import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double tutar,kdvOran=0.18,kdvTutar,kdvliTutar,kdvYuzdesi;

        Scanner input = new Scanner(System.in);
        System.out.print("Ucret Tutarini Giriniz : ");
        tutar = input.nextDouble();

        kdvYuzdesi = (tutar <= 1000) ? 0.18 : 0.08;

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutari :" + tutar);
        System.out.println("KDV Orani :" + kdvOran);
        System.out.println("KDV Tutari :" + kdvTutar);
        System.out.println("KDV li Tutari :" + kdvliTutar);

    }
}
