
package DP;

import java.util.Arrays;

/**
 * Created 6/24/2019 11:32 PM
 *
 * @author Rohit Rawani
 */
public class MinCostPath {

  public static int minCost(int cost[][], int m, int n) {
    int dp[][] = new int[m + 1][n + 1];
    Arrays.fill(dp, -1);
    dp[0][0] = cost[0][0];
    /**
     * first initialize all the frst column values.
     */
    for (int i = 1; i <= m; i++) {
      dp[i][0] = dp[i - 1][0] + cost[i][0];
    }
    /**
     * frst row values
     */
    for (int i = 1; i <= n; i++) {
      dp[0][i] = dp[0][i - 1] + cost[0][i];
    }
    /**
     * to get the min cost at any posn we should have these values already counted: [m-1][n], [m-1][n-1], [m][n-1]
     */
    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        dp[i][j] = min(dp[i - 1][j], dp[i - 1][j - 1], dp[i][j - 1]) + cost[i][j];
      }
    }
    //this will always return the minCost of the indexes passed
    return dp[m][n];
  }
  private static int min(int x, int y, int z)
  {
    if (x < y)
      return (x < z)? x : z;
    else
      return (y < z)? y : z;
  }
  public static void main(String[] args) {
    int cost[][]= {{1, 2, 3},
        {4, 8, 2},
        {1, 5, 3}};
    System.out.println(minCost(cost,2,2));
  }
}
