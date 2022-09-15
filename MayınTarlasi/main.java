package MayınTarlasi;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);

        System.out.print("Satir Sayisi : ");
        int a = input.nextInt();
        System.out.print("Sutun Sayisi : ");
        int b = input.nextInt();
        String[][] alan = MineSweeper.mayinTarlasiAlani(a,b);
        String[][] bosAlan = MineSweeper.bosAlan(a,b);
        MineSweeper.print(bosAlan);

        MineSweeper.check(alan, bosAlan, a, b);
    }
}
