import java.util.*;
public class VotingAge{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        VotingAge(age);

    }
    static void VotingAge(int age){
        if(age<0 || age>100){
            System.out.print("Enter a valid age ");
        }
        else if(age<18){
            System.out.print("Not eligible to vote ");
        }
        else{
            System.out.print("Eligibe");
        }
    }
}