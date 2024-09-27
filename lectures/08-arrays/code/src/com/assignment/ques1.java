//build an array from permutation
import java.util.*;
class ques1{
    public int[] buildArray(int[] nums){
        int[] ans = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {5,0,1,2,3,4};
        ques1 obj = new ques1();
        System.out.print(Arrays.toString(obj.buildArray(nums)));

    }
}