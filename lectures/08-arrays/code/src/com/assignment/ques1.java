//build an array from permutation
import java.util.*;
public class ques1{
    public static void main(String args[]){
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(arr(nums)));
    }
    static int[] arr(int[] nums){
        int[] result = new int[nums.length];
        for(int i = 0 ; i<nums.length ; i++){
            result[i] = nums[nums[i]];
        }
        return result;
    }
}