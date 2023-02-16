package DP;

import java.util.Arrays;

public class CombinationSum4 {

    public static void main(String[] args) {
        int[] arr = {1, 5, 6};
        System.out.println(findWays(arr, 7));
        int target = 7;
        int[] dp = new int[target+1];
        Arrays.fill(dp, -1);
        System.out.println(findWaysMem(arr, target, dp));
    }

    public static int findWays(int[] arr, int target){
        if(target<0){
            return 0;
        }
        if(target==0){
            return 1;
        }

        int result = 0;

        for(int i=0; i<arr.length; i++){
            result+= findWays(arr, target-arr[i]);
        }
        return result;
    }

    //using memoization since only one var(traget) is changing so 1D array
    public static int findWaysMem(int[] arr, int target, int[] dp){
        if(target<0){
            return 0;
        }
        if(target==0){
            return 1;
        }
        if(dp[target]!=-1){
            return dp[target];
        }
        int result = 0;

        for(int i=0; i<arr.length; i++){
            result+= findWaysMem(arr, target-arr[i], dp);
        }
        dp[target] = result;
        return dp[target];
    }
}
