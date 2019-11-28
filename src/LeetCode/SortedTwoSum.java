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
package LeetCode;

/**
 * Created 6/26/2019 2:10 AM
 *
 * @author Rohit Rawani
 */
public class SortedTwoSum {
  public static  boolean findTarget(int[] arr , int k) {
    int n =arr.length;
    int i=0;
    int j= n-1;
    while(i<j && arr[i]+arr[j] != k){
      if(arr[i]+arr[j] > k){
        j--;
      }else if(arr[i]+arr[j] < k){
        i++;
      }
    }

    return (arr[i]+arr[j] == k);

  }
  public static void main(String[] args) {
    int[] arr = {2, 7, 11, 15};
    int target = 9;
    findTarget(arr, target);
  }
}
