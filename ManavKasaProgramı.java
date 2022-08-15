import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       double A=2.14, E=3.67, D=1.11 , M=0.95, P=5.00;
       double Armutkilo,Elmakilo,Domateskilo,Muzkilo,Patlıcankilo;
       Scanner input = new Scanner(System.in);

       System.out.print("Kac kilo Armut ? :");
       Armutkilo = input.nextDouble();
       double top_armut = A*Armutkilo;

        System.out.print("Kac kilo Elma ? :");
        Elmakilo = input.nextDouble();
        double top_elma = E*Elmakilo;

        System.out.print("Kac kilo Domates ? :");
        Domateskilo = input.nextDouble();
        double top_domates = D*Domateskilo;

        System.out.print("Kac kilo Muz ? :");
        Muzkilo = input.nextDouble();
        double top_muz= M*Muzkilo;

        System.out.print("Kac kilo Patlican ? :");
        Patlıcankilo = input.nextDouble();
        double top_patlıcan = P*Patlıcankilo;

        double toplam=top_elma+top_armut+top_muz+top_domates+top_patlıcan;
        System.out.print("Toplam tutar : " + toplam + "TL");


    }
}
