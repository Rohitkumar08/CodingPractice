package Recursion;

/**
 * Created 20/11/21 8:35 PM
 *
 * @author Rohit Rawani
 */
public class PerfectSquares {
    public static int result= Integer.MAX_VALUE;
    public static void main(String[] args) {
        System.out.println(getPerfectSquare(1,12));
    }

    public static int getPerfectSquare(int sq, int target){
        if(target==0){
            return 0;
        }
        if(sq*sq> target){
            return Integer.MAX_VALUE;
        }
        int result= Integer.MAX_VALUE;
        for(int i=sq; i*i<=target; i++){
            int ans = getPerfectSquare(i, target-(i*i));
            result = Math.min(ans, result);
        }
        if(result == Integer.MAX_VALUE){
            return result;
        }
        return result+1;
    }
}
