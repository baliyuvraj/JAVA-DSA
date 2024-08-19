
import java.util.*;

public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.print("The sum of two numbers is " + sum(num1, num2));


    }
    static int sum(int num1, int num2){
        int sum = num1 + num2 ;
        return sum;
    }
}