import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       double boy,kilo,Vki;

       Scanner input = new Scanner(System.in);

       System.out.println("Lutfen Boyunuzu Giriniz : ");
       boy=input.nextDouble();

       System.out.println("Lutfen Kilonuzu Giriniz : ");
       kilo=input.nextDouble();

       Vki = kilo / (boy*boy);
       System.out.print("Vucut Kitle Indeksiniz : ");
       System.out.print(Vki);
    }
}
