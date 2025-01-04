//running sum of 1D array
import java.util.*;
public class ques3{
    public static void main(String args[]){
        int[] arr = {3,1,2,10,1};
        for(int i = 1 ; i < arr.length ; i++){
            arr[i] = arr[i] + arr[i-1];
        }
        System.out.print(Arrays.toString(arr));
    }
}