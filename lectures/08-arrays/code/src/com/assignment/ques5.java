//shuffle the array
import java.util.*;
public class ques5{
    public static void main(String args[]){
        int[] nums = {2,5,1,3,4,7};
        int[] arr = new int[nums.length];
        int n = 3 ;
        int count = 0 ;
        for(int i = 0 ; i < n ; i++){
            arr[count] = nums[i];
            arr[count + 1] = nums[i+n];
            count = count + 2 ;
        }
        System.out.print(Arrays.toString(arr));
    }
}