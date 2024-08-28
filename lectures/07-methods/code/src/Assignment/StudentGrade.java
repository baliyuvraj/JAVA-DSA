import java.util.*;
public class StudentGrade {
    public static void main(String[] args) {
        grade();
        
    }
    static void grade(){
        int TotalMarks = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter total number of subjects : ");
        int SubCount = sc.nextInt();
        System.out.print("enter marks in " + SubCount + " subjects ");
        for(int i = 0 ; i< SubCount ; i++){
             TotalMarks += sc.nextInt();
        }
        System.out.println("total marks is : " + TotalMarks);
        float percentage = (TotalMarks/(SubCount*100))*100;
        switch((int)percentage/10){
            case 9 -> System.out.print("grade : A+");
            case 8, 7 -> System.out.print("grade : A");
            case 6 -> System.out.print("grade : B");
            case 5 -> System.out.print("grade : C");
            default -> System.out.print("grade : D");
        }
    }
}