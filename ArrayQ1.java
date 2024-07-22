package Questions;

import java.util.*;
public class ArrayQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String Names[] = new String [size];
        for(int i = 0; i < size; i++) {
            Names[i] = sc.next();
        }
        for(int i = 0; i < size; i++) {
            System.out.println("Name "+(i+1) + " is : "+Names[i]);
            }
    }
}
