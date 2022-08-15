import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       int r,aci;
       double pi = 3.14,dairedilimininalani;

       Scanner inp = new Scanner(System.in);

       System.out.println("Dairenin yaricapini giriniz : ");
       r=inp.nextInt();

       System.out.println("Daire diliminin acisini giriniz : ");
       aci=inp.nextInt();

       dairedilimininalani = (pi * (r*r) * aci)/360;

       System.out.print("Daire diliminin alani : " + dairedilimininalani);



    }
}