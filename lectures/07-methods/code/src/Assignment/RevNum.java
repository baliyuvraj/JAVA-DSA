public class RevNum{
    public static void main(String args){
        class Solution {
            public int reverse(int n) {
                int reverse = 0;
                
                while (n != 0) {
                    int LastD = n % 10;
                    
                    // Check for overflow/underflow before multiplying by 10
                    if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && LastD > 7)) return 0;
                    if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && LastD < -8)) return 0;
        
                    reverse = (reverse * 10) + LastD;
                    n /= 10;
                }
                return reverse;
            }
        }
        
    }
}

