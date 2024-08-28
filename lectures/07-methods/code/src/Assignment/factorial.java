import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number whose factorial is to be calculated : ");
        int n = sc.nextInt();
        System.out.println("the factorial of " + n +" is : " + fact(n));
    }
    static int fact(int n){
        int fact = 1 ;
        if(n==0 || n==1){
            return 1;
        }
        for(int i = 1 ; i<=n ; i++){
            fact *= i ;
        }
        return fact ;

    }
}