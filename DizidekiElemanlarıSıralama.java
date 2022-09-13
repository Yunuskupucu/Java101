import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlarıSıralama {
    public static void main(String[] args){
        int size, temp =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Array boyutunu giriniz : ");
        size = input.nextInt();

        if (size > 0){
            int[] arr = new int[size];
            for (int i = 0; i < size; i++){
                System.out.print( i+1 + ".Elemani Giriniz : ");
                arr[i] = input.nextInt();
            }

            System.out.println("Siralanmamis Dizi : " + Arrays.toString(arr));

            for (int i = 0; i < size; i++){
                for (int j = i+1; j < size; j++){
                    if (arr[i] > arr[j]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            System.out.println("Siralanmis Dizi : " + Arrays.toString(arr));
        }
        else {
            System.out.print("Hatali Giris");
            System.exit(0);
        }
    }
}
