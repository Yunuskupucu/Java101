import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int a,b,c,cevre;
        double alan;

        Scanner girdi = new Scanner(System.in);

        System.out.println("Ucgenin Kenarlarini Giriniz :");
        a=girdi.nextInt();
        b=girdi.nextInt();
        c=girdi.nextInt();

        cevre=a+b+c;
        System.out.println("Ucgenin Cevresi : " + cevre);

        alan = Math.sqrt(cevre*(cevre-a)*(cevre-b)*(cevre-c));
        System.out.print("Ucgenin Alani : " + alan);

    }
}