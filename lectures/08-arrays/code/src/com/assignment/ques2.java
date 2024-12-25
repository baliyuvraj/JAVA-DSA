//concatinantion of arrays
import java.util.* ;
public class ques2{
    public static void main(String args[]){
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(nums));
        System.out.print(Arrays.toString(quest2(nums)));

    }
    static int[] quest2(int[] nums){
        int n = nums.length ;
        int[] ans = new int[2*n];
        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans ;
    }
}