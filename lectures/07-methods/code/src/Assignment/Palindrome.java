import java.util.*;
public class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to be checked : ");
        int n = sc.nextInt();
        if(isPalindrome(n)){
            System.out.print("Yes " + n + " is a palindrome ");
        }
        else{
            System.out.print("No" + n + " is not a palindrome ");
        }

    }
    static boolean isPalindrome(int n){
        int original = n;
        int reverse = 0 ;
        while(n>0){
            int LastDigit = n%10;
            reverse = (reverse*10) + LastDigit ; 
            n = n/10 ; 
        }
        return reverse == original ; 
    }
}