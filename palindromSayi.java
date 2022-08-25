import java.util.Scanner;

public class palindromSayi {

    static boolean isPalindrom(int number){
        int temp = number, reversenumber = 0,lastNumber;
        while (temp != 0){
            //System.out.println("==============");
           // System.out.println("Sayi => " + temp);
            lastNumber = temp % 10;
           // System.out.println("Son Basamak => " + lastNumber);
            reversenumber = (reversenumber * 10) + lastNumber;
           // System.out.println("Yeni Sayi => " + reversenumber);
            temp /= 10;
           // System.out.println("Yeni Temp => " + temp);
        }
        if (number == reversenumber)
            return true;
        else
            return false;

    }
    public static void main(String[] args){
        System.out.println(isPalindrom(101));
    }
}
