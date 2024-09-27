 //concatenantion of array
 import java.util.*;
 class ques2{
    public int[] getConcatination(int[] nums){
        int n = nums.length ;
        int[] ans = new int[2 * n];
        for(int i = 0 ; i < n ; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        } 
        return ans;
    }

    public static void main(String args[]){
        int[] nums = {1,3,2,1};
        ques2 obj = new ques2();
        System.out.print(Arrays.toString(obj.getConcatination(nums)));
    }
 }