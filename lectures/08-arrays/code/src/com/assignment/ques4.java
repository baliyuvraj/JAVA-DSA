//richest customer wealth
class ques4{
    public int maximumWealth(int[][] accounts){
        int maxWealth = 0 ; 
        for(int i = 0 ; i < accounts.length ; i++){
            int currentWealth = 0;
            for(int j = 0 ; j < accounts[i].length ; j++){
                currentWealth += accounts[i][j];
            }
            if(currentWealth > maxWealth){
                maxWealth = currentWealth ;
            }
        }
        return maxWealth ;
    }

    public static void main(String args[]){
        int[][] accounts = {{1,5},{7,3},{3,5}};
        ques4 obj = new ques4();
        System.out.print(obj.maximumWealth(accounts));

    }
}