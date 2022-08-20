import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {

    public static void main(String[] args){
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sicaklik giriniz : ");
        heat = input.nextInt();

        if(heat < 5){
            System.out.println("Kayak Yapabilirisiniz.");
        }else if (heat <= 25){
            if(heat <= 15){
                System.out.println("Sinemaya Gidebilirsiniz.");
            }
            if(heat >= 10){
                System.out.println("Piknige Gidebilirsiniz.");
            }
        }else{
            System.out.println("Yuzmeye Gidebilirsiniz.");
        }
    }
}
