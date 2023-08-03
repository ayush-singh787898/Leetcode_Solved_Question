/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int i=0;        // i shows start
        int j=n;        // j shows end
        while(i<=n){
            int mid=i+(j-i)/2;
            int gval=guess(mid);
            if(gval==0){
                return mid;
            }
            else if(gval==1){
                i= mid+1;
            }
            else{
                j= mid-1;
            }
        }
        return -1;
    }
}