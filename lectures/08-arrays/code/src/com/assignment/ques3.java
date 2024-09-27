//runnins sum of 1d array
import java.util.*;
class ques3{
    public int[] runningSum(int[] nums){
        for(int i = 1 ; i < nums.length ; i++){
            nums[i] += nums[i-1]; 
        }
        return nums;
    }

    public static void main(String args[]){
        int[] nums = {1,1,1,1,1};
        ques3 obj = new ques3();
        System.out.print(Arrays.toString(obj.runningSum(nums)));

    }
}