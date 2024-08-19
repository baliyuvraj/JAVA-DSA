import java.util.*;
public class maxMin{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int a = sc.nextInt();
        System.out.print("enter second number : ");
        int b = sc.nextInt();
        System.out.print("enter third number : ");
        int c = sc.nextInt();
        int minNumber = min(a, b, c);
        int maxNumber = max(a, b, c);
        System.out.println("the minimum of three numbers is : "+ minNumber);
        System.out.println("the maximum of three numbers is : "+ maxNumber);

    }
    static int max(int a , int b , int c){
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }

        return max;
    }

    static int min(int a,int b, int c){
        int min = a;
        if(b<min){
            min = b;
        }
        if(c<min){
            c = min;
        }
        return min;
    }

}