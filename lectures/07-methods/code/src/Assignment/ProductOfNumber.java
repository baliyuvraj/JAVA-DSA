import java.util.*;
public class ProductOfNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first = sc.nextInt();
        System.out.print("Enter second number : ");
        int second = sc.nextInt();
        System.out.print("the product is : " + ProductOfNumber(first, second));

    }
    static int ProductOfNumber(int first , int second){
        int product = first * second ;
        return product;
    }
    
 }