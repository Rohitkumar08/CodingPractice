package Matrix;

import java.util.Arrays;

public class GridUniquePaths {
    public static void main(String[] args) {
        GridUniquePaths paths = new GridUniquePaths();
        int m = 50;
        int n = 50;
        long[][] dp = new long[m][n];
        long start1 = System.currentTimeMillis();
        for(int i=0; i<m; i++){
           Arrays.fill(dp[i], -1);
        }
        System.out.println(paths.countPathsUsingDP(m, n, 0, 0, dp));
        System.out.println("time taken by dp : " + (System.currentTimeMillis() - start1));

        long start = System.currentTimeMillis();
        System.out.println(paths.countPaths(m, n, 0, 0));
        System.out.println("time taken by brute force : " + (System.currentTimeMillis() - start));
    }


    //merge subproblems using dp
    public long countPathsUsingDP(int m, int n, int i, int j, long[][] dp){
        //reached at the bottom right
        if(i==m-1 && j==n-1){
            return 1;
        }
        //out of boundary
        if(i>m-1 || j>n-1){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        dp[i][j] = countPathsUsingDP(m, n, i, j+1, dp) + countPathsUsingDP(m, n, i+1, j, dp);
        //only right and down traversal is allowed
        return dp[i][j];
    }

    //brute force recursion
    public long countPaths(int m, int n, int i, int j){
        //reached at the bottom right
        if(i==m-1 && j==n-1){
            return 1;
        }
        //out of boundary
        if(i>m-1 || j>n-1){
            return 0;
        }
        //only right and down traversal is allowed
        return countPaths(m, n, i, j+1) + countPaths(m, n, i+1, j);
    }
}
