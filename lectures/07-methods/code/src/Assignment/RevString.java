public class RevString{
    public static String reverseString(String s){
        String reverse = "";
        for(int i = 0 ; i<s.length() ; i++){
            reverse = s.charAt(i) + reverse ;
        }
        return reverse ;
    }
    public static void main(String args[]){
        String str = "hello";
        System.out.print(reverseString(str));
    }
}