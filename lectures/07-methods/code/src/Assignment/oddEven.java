import java.util.*;
public class oddEven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number to be checked : ");
        int num = sc.nextInt();
        oddEven(num);


    }
    static void oddEven(int num){
        if(num%2==0){
            System.out.print("number is even ");
        }
        else{
            System.out.print("number is odd ");
        }
    }
}