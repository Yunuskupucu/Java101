import java.util.Arrays;

public class ElemanlarinHarmonikOrtalamasi {
    public static void main(String[] args){
            int [] numbers = {1, 2, 3, 4, 5};
            int sum = 0;
            for(int i:numbers){
                sum += 1/i;
            }
            double average = numbers.length/sum;
            System.out.println("Harmonik Ortalama : " + average);
        }
    }


