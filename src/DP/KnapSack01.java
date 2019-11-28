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
package DP;

/**
 * Created 6/25/2019 12:33 AM
 *
 * @author Rohit Rawani
 */
public class KnapSack01 {
  static int max(int a, int b) { return (a > b)? a : b; }

  public static int knapSack(int w, int[] wt, int[] val, int n){
    int dp[][]= new int[n+1][w+1];
    for(int i=0; i<=n; i++){
      for(int j=0; j<=w; j++){
        if(i==0 || j==0){
          dp[i][j] =0;
        }
        else if(wt[i-1] <= j){
            dp[i][j] =max(val[i-1]+dp[i-1][j-wt[i-1]], dp[i-1][w]);
        }else{
          dp[i][j]=dp[i-1][w];
        }
      }
    }
    return dp[n][w];
  }

  public static void main(String[] args) {
    int val[] = new int[]{60, 100, 120};
    int wt[] = new int[]{10, 20, 30};
    int  W = 50;
    int n = val.length;
    System.out.println(knapSack(W, wt, val, n));
  }
}
