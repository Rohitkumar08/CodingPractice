package DP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinCostClimbStairs {
    static Map<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(minCostCLimbingStarirs(Arrays.asList(10, 15, 20, 14, 25, 525, 52, 525, 2,5, 25, 2, 525, 25, 25,2, 5,2, 52, 52, 52,5, 2,5, 25 ,252, 52,5, 2,
                2)));
        System.out.println(System.currentTimeMillis()-start);

        long start1 = System.currentTimeMillis();
        System.out.println(minCostCLimbingStarirsMemoization(Arrays.asList(10, 15, 20, 14, 25, 525, 52, 525, 2,5, 25, 2, 525, 25, 25,2, 5,2, 52, 52, 52,5, 2,5, 25 ,252, 52,5, 2,
                2)));
        System.out.println(System.currentTimeMillis()-start1);


        long start2 = System.currentTimeMillis();
        System.out.println(minCostCLimbingStarirsTabulation(Arrays.asList(10, 15, 20, 14, 25, 525, 52, 525, 2,5, 25, 2, 525, 25, 25,2, 5,2, 52, 52, 52,5, 2,5, 25 ,252, 52,5, 2,
                2)));
        System.out.println(System.currentTimeMillis()-start2);

    }

    static int minCostCLimbingStarirs(List<Integer> cost){
        int n = cost.size();
        int step1 = solve(cost, n-1);
        int step2= solve(cost, n-2);
        return Math.min(step1 , step2);
    }


    static int minCostCLimbingStarirsMemoization(List<Integer> cost){
        int n = cost.size();
        int step1 = 0;
        int step2 = 0;
        if(map.containsKey(n-1)){
            step1 = map.get(n-1);
        }else{
            step1 = solve(cost, n-1);
            map.put(n-1, step1);
        }
        if(map.containsKey(n-2)){
            step2 = map.get(n-2);
        }else{
            step2= solve(cost, n-2);
            map.put(n-2, step2);
        }
        return Math.min(step1 , step2);
    }

    //bottom-up approach
    static int minCostCLimbingStarirsTabulation(List<Integer> cost){
        int n = cost.size();
        return solveUsingTabulation(cost, n);
    }

    public static int solveUsingTabulation(List<Integer> cost, int n){
        //1st step -> initialize the dp array
        int dp[] = new int[n+1];

        //2nd step --> populate base cases
        dp[0] = cost.get(0);
        dp[1] =  cost.get(1);

        //3rd step -> replace recursive call with for loop starting from baseCases+1
        for(int i=2; i< n; i++){
            dp[i] = Math.min(dp[i-1], dp[i-2])+ cost.get(i);
        }
        return Math.min(dp[n-1], dp[n-2]);
    }


    public static int solve(List<Integer> cost, int n){
        if(n == 0){
            return cost.get(0);
        }
        if(n==1){
            return cost.get(1);
        }
        return Math.min(solve(cost, n-1), solve(cost, n-2))+ cost.get(n);
    }
}
