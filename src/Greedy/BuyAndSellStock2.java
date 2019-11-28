/*
 * Copyright 2006-2019 (c) Care.com, Inc.
 * 1400 Main Street, Waltham, MA, 02451, U.S.A.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Care.com, Inc. ("Confidential Information").  You shall not disclose
 * such Confidential Information and shall use it only in accordance with
 * the terms of an agreement between you and CZen.
 */
package Greedy;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created 6/28/2019 8:49 AM
 *  Just Take care of local minima and local maxima that should be enough.
 *  try to solve it through DP bottom up approach
 * @author Rohit Rawani
 */
public class BuyAndSellStock2 {
  public static int maxProfit(int[] prices) {
    if (prices.length <= 1) {
      return 0;
    }
    int smallest = Integer.MAX_VALUE;
    int smallestIndex=0;
    int i = 0;
    for (i = 0; i < prices.length; i++) {
      if (prices[i] < smallest) {
        smallest = prices[i];
        smallestIndex=i;
      }
    }
    int max = Integer.MIN_VALUE;
    for (int j = smallestIndex; j < prices.length; j++) {
      if (prices[j] > max) {
        max = prices[j];
      }
    }
    return max - smallest;
   /* int localMin=0;
    int localMax=0;
    int sum=0;
    for(int i=0; i<prices.length; i++){
      if(sum>0){
        localMax=0;
      }
      if(i==0 && prices[i]<=prices[i+1]){
        localMin=prices[i];
      }else if(i==prices.length-1 && prices[i]>=prices[i-1]){
        localMax=prices[i];
      }
      else if(i < prices.length-1 && prices[i]<=prices[i+1] && prices[i]<=prices[i-1]){
        localMin=prices[i];
      }else if(i < prices.length-1 && i>0 && prices[i]>=prices[i+1] && prices[i]>prices[i-1]){
        localMax=prices[i];
      }
      if(localMax>localMin)
        sum+=(localMax-localMin);
    }
    return sum;
  }*/
/*
  public static int maxProfit(int[] prices) {
    if (prices.length <= 1) {
      return 0;
    }
    int localMin = 0;
    int localMax = 0;
    int sum = 0;
    ArrayList<Integer> coolIndex = new ArrayList<>();
    Stack<Integer> visited = new Stack<>();
    for (int i = 0; i < prices.length; i++) {
      if (sum > 0) {
        localMax = 0;
      }
      if (i == 0 && prices[i] <= prices[i + 1]) {
        localMin = prices[i];
        visited.push(i);
      } else if (i == prices.length - 1 && prices[i] >= prices[i - 1]) {
        if(!visited.isEmpty())
        localMax = prices[i];
      } else if (i < prices.length - 1 && prices[i] <= prices[i + 1]
          && prices[i] <= prices[i - 1]) {
        if(coolIndex.contains(i-1)){
          continue;
        }
        localMin = prices[i];
        visited.add(i);
      } else if (i < prices.length - 1 && i > 0 && prices[i] >= prices[i + 1]
          && prices[i] > prices[i - 1]) {
        if(!visited.isEmpty()){
          visited.pop();
          localMax = prices[i];
          coolIndex.add(i);
        }
      }
      if (localMax > localMin)
        sum += (localMax - localMin);
    }
    return sum;
  }
*/
  }
  public static int maxProfitCool(int[] prices) {
    int n = prices.length;
    if(n<2){
      return 0;
    }
    int[][] dp = new int[n][2];
    // goal: max profit at last day with 0 stock in hand (dp[n-1][0])

    //base cases
    dp[0][0] = 0;
    dp[0][1] = -prices[0];
    dp[1][0] = Math.max(0, dp[0][1]+prices[1]);
    dp[1][1] = Math.max(dp[0][1], -prices[1]);
    //iterate through the loop starting from 2nd(index) day
    //because we have already covered the first two days
    //dp[i-2][0] beacuse in order to buy again we need to sell it day before.
    for(int i=2; i<n; i++){
      dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]+prices[i]);
      dp[i][1] =  Math.max(dp[i-1][1], dp[i-2][0]-prices[i]);
    }

    return dp[n-1][0];
  }

  public static void main(String[] args) {
  int[] arr = new int[]{ 7,6,4,3,1 };
//    int[] arr = new int[]{1, 2, 3, 0 ,2 };
//    int[] arr = new int[]{100,180, 260, 310, 40,535, 695 };

    System.out.println(maxProfit(arr));
  }
}
