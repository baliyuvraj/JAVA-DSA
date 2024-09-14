public class maxArray{
    public static int findMax(int[] arr){
        int maxElem = arr[0];
        for(int i = 1 ; i< arr.length ; i++){
            if(arr[i] > maxElem){
                maxElem = arr[i];
            }
        }
        return maxElem ;
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,6};
        System.out.print(findMax(arr));
    }
}
