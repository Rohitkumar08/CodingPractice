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
package WindowSliding;

/**
 * Created 6/17/2019 12:40 AM
 *
 * @author Rohit Rawani
 */
public class MaxConsecutiveSumArray {
  //O(n*k) time complexity
/*  public static int getMaxSum(int[] arr, int k){
    int currentSum=0;
    int result=0;
    for(int i=0; i<=arr.length -k; i++){
      currentSum=0;
      for(int j=i; j<k+i; j++){
        currentSum = currentSum+arr[j];
      }
      result = Math.max(result, currentSum);
    }
    return result;
  }*/

  //sliding window
  //O(n)
  // Returns maximum sum in
  // a subarray of size k.
  static int getMaxSum(int arr[], int k)
  {
    int n =arr.length;
    // k must be greater
    if (n < k) {
      System.out.println("Invalid");
      return -1;
    }

    // Compute sum of first window of size k
    int max_sum = 0;
    for (int i = 0; i < k; i++)
      max_sum += arr[i];

    // Compute sums of remaining windows by
    // removing first element of previous
    // window and adding last element of
    // current window.
    int window_sum = max_sum;
    for (int i = k; i < n; i++) {
      window_sum += arr[i] - arr[i - k];
      max_sum = Math.max(max_sum, window_sum);
    }

    return max_sum;
  }

  public static void main(String[] args) {
/*    int arr[] = new int[]{100,200,300,400};
    int k=2;*/
    int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
   int  k = 4;
/*    int arr[] = {2, 3};
    int k = 3;*/
    int result = getMaxSum(arr, k);
    System.out.println(result);
  }

}
