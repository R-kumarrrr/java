package Questions;
import java.util.*;
public class LoopQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==0) {
            System.out.println("stop");
        } else{
            for (int i = 0; i < n; i++) {
                int marks = sc.nextInt();
                if (marks>=90) {
                    System.out.println("This is good");
                } else if(marks<=89 && marks>=60){
                    System.out.println("This is ok");
                } else{
                    System.out.println("This is bad");
                }
        }
    }
}
}
