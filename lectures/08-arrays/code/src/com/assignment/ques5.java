//kids with greatest number of candies
import java.util.*;
class ques5{
    public List<Boolean> kidsWithCandies(int[] candies , int extraCandies){
        List<Boolean> res = new ArrayList<>();
        int[] temp = candies.clone();
        Arrays.sort(temp);
        for(int i = 0 ; i < candies.length ; i++){
            if(candies[i] + extraCandies >= temp[candies.length - 1]){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res ;
    }
    public static void main(String args[]){
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3 ;
        ques5 obj = new ques5();
        System.out.print(obj.kidsWithCandies(candies, extraCandies));
    }
}