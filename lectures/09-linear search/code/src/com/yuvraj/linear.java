import java.util.*;
public class linear{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String arr = "Yuvraj123";
        char target = 'u' ;        
        System.out.print(StrSearch(arr,target));
    }
    static int linearSearch(int[] arr , int target){
        if(arr.length == 0){
            return -1 ;
        }
        for(int i = 0 ; i < arr.length ; i++){
            int element = arr[i];
            if(element == target){
                return i ;
            }
        }
        return -1 ;
    }

    static int linearSearch2(int[] arr , int index){
        if(arr.length == 0){
            return -1 ;
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(i == index){
                return arr[i] ;
            }
        }
        return -1 ;
    }

    static boolean StrSearch(String arr , char str){
        if(arr.length() == 0){
            return false ;
        }
        for(int i = 0 ; i < arr.length() ; i++){
            if(str == arr.charAt(i)){
                return true ;
            }
        }
        return false ;
    }
}
