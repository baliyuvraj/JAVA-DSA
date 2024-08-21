import java.util.*;
public class javabasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 32;
        arr[1] = 354;
        arr[2] = 54;
        arr[3] = 67;
        arr[4] = 89;

        for(int i =0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    
    }
}