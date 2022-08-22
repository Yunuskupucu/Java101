import java.util.Scanner;

public class dortVeBesinKuvvetleri {
    public static void main(String[] args){
        int n,i;
        Scanner input = new Scanner(System.in);

        System.out.print("Ust Siniri Giriniz : ");
        //--------------4'un Katlari--------------"
        n = input.nextInt();

        for( i=1 ; i<=n ; i*=4 ){
            System.out.println(i);
        }

        System.out.print("\n\n");

        //--------------5'in Katlari--------------

        for( i=1 ; i<=n ; i*=5 ){
            System.out.println(i);
        }
    }
}
