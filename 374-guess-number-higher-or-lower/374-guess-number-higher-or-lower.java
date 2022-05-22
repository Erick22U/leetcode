/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        int l = 1;
        int r = n;
        
        while(l <= r){
            int pick = l + (r - l) /2;
            
            if(guess(pick) == 0){
                return pick;
            }
            else if(guess(pick) == -1){
                r = pick - 1;
            }
            else{
                l = pick + 1;
            }
        }
        return l;
    }
}