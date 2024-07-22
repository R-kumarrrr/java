package Questions;
import java.util.*;
public class ArrayQ2 {
    public static void main(String[] args) {
        int numbers [] = {10,20,45,54,28,23};
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if ( numbers[i]  < min) {
                min = numbers[i];
            }
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("Min value is: " + min);
        System.out.println("Max value is: " + max);
    }
}
