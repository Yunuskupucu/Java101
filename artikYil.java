import java.util.Scanner;

public class artikYil {
    public static void main(String[] args){
        boolean artikYil = false;
        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen yil giriniz: ");
        year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0){
                    artikYil = true;
                }else{
                    artikYil = false;
                }
            }else {
                artikYil = true;
            }
        } else{
            artikYil = false;
        }

        if (artikYil){
            System.out.println(year + " yili bir artik yildir !");
        }else{
            System.out.println(year + " yili bir artik yil değildir !");
        }
    }
}
