import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, day;

        System.out.print("Kacinci ayda dogdugunuzu girin : ");
        month = input.nextInt();
        System.out.print("Dogdugunuz gunu girin :");
        day = input.nextInt();

        if (month > 0 && month < 13 && day > 0 && day < 32) {
            if (month == 1) {
                if (day < 22) {
                    System.out.println("Oglak");
                } else {
                    System.out.println("Kova");
                }
            }
        }
        if (month == 2) {
            if (day < 20) {
                System.out.println("Kova");
            } else {
                System.out.println("Balık");
            }
        }
        if (month == 3) {
            if (day < 21) {
                System.out.println("Balık");
            } else {
                System.out.println("Koc");
            }
        }
        if (month == 4) {
            if (day < 21) {
                System.out.println("Koc");
            } else {
                System.out.println("Boga");
            }
        }
        if (month == 5) {
            if (day < 22) {
                System.out.println("Boga");
            } else {
                System.out.println("Ikizler");
            }
        }
        if (month == 6) {
            if (day < 23) {
                System.out.println("Ikizler");
            } else {
                System.out.println("Yengec");
            }
        }
        if (month == 7) {
            if (day < 23) {
                System.out.println("Yengec");
            } else {
                System.out.println("Aslan");
            }
        }
        if (month == 8) {
            if (day < 23) {
                System.out.println("Aslan");
            } else {
                System.out.println("Basak");
            }
        }
        if (month == 9) {
            if (day < 23) {
                System.out.println("Basak");
            } else {
                System.out.println("Terazi");
            }
        }
        if (month == 10) {
            if (day < 23) {
                System.out.println("Terazi");
            } else {
                System.out.println("Akrep");
            }
        }
        if (month == 11) {
            if (day < 22) {
                System.out.println("Akrep");
            } else {
                System.out.println("Yay");
            }
        }
        if (month == 12) {
            if (day < 22) {
                System.out.println("Yay");
            } else {
                System.out.println("Oglak");
            }
        }
    }
}
