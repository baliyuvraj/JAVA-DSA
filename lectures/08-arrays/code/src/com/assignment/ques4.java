//richest customer wealth 
public class ques4{
    public static void main(String args[]){
        int[][] accounts = {{1,2,3} , {3,2,1}};
        int maxWealth = 0;
        for(int i = 0 ; i < accounts.length ; i++){
            int currentWealth = 0 ;
            for(int j = 0 ; j < accounts[i].length ; j++){
                currentWealth = currentWealth + accounts[i][j];
            }
            if(currentWealth > maxWealth){
                maxWealth = currentWealth ;
            }
        }
        System.out.print(maxWealth);

    }
}