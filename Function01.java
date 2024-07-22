import java.util.Scanner;

public class Function01 {
    public static int CalculateSum(int a , int b){
        int sum = a + b;
        return sum;
    }
    public static int CalculateProduct(int c,int d){
        int product = c * d;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int sum = CalculateSum(a,b);
        System.out.println("sum of a and b = "+sum);
        int product = CalculateProduct(c,d);
        System.out.println("product of c and d = "+product);
    }
}
