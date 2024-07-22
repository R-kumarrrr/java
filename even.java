package Questions;
import java.util.*;
public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for (int i = 1; i < n; i++) {
            if (i%2==0) {
                System.out.println(i);
                count+=1;
            }
            // count+=1;

        }
        System.out.println(count);

    }
}
