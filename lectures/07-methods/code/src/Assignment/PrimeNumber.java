import java.util.*;
public class PrimeNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number to be checked ");
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.print(n + " is a prime number");
        }
        else{
            System.out.print(n + " is not a prime number ");
        }

    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i =2 ; i<=n/2 ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}