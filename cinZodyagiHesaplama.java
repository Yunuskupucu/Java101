import javax.swing.plaf.synth.SynthUI;
import java.util.Scanner;

public class cinZodyagiHesaplama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int dogumYili,kalan;

        System.out.print("Dogum Yilinizi Giriniz : ");
        dogumYili = input.nextInt();

        kalan = dogumYili % 12;

        if(kalan == 0){
            System.out.println("Cin Zodyagi Burcunuz : Maymun");
        } else if (kalan == 1) {
            System.out.println("Cin Zodyagi Burcunuz : Horoz");
        } else if (kalan == 2) {
            System.out.println("Cin Zodyagi Burcunuz : Kopek");
        } else if (kalan == 3) {
            System.out.println("Cin Zodyagi Burcunuz : Domuz");
        } else if (kalan == 4) {
            System.out.println("Cin Zodyagi Burcunuz : Fare");
        } else if (kalan == 5) {
            System.out.println("Cin Zodyagi Burcunuz : Okuz");
        } else if (kalan == 6) {
            System.out.println("Cin Zodyagi Burcunuz : Kaplan");
        } else if (kalan == 7) {
            System.out.println("Cin Zodyagi Burcunuz : Tavsan");
        } else if (kalan == 8) {
            System.out.println("Cin Zodyagi Burcunuz : Ejderha");
        } else if (kalan == 9) {
            System.out.println("Cin Zodyagi Burcunuz : Yılan");
        } else if (kalan == 10) {
            System.out.println("Cin Zodyagi Burcunuz : At");
        } else if (kalan == 11) {
            System.out.println("Koyun");
        } else{
            System.out.println("Hatali Giris Yaptiniz !");
        }
    }
}
