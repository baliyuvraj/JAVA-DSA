
import java.util.*;

public class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to be checked : ");
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        if(ans==true){
            System.out.print("number is prime ");
        }
        else{
            System.out.print("not prime");
        }

    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2 ; i<=n/2 ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}