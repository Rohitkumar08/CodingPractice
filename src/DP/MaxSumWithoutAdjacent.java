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
 * Created 6/15/2019 11:49 PM
 *
 * @author Rohit Rawani
 */
public class MaxSumWithoutAdjacent {
  public static int rob(int[] nums) {
    int excludingFirst = calculateSum(nums, 1, nums.length);
    int excludingLast = calculateSum(nums, 0, nums.length-1);
    return Math.max(excludingFirst, excludingLast );
  }

  public static int calculateSum(int[] nums, int s, int e){

    int cMax=0, pMax=0, ppMax=0;
    for(int i=s; i<e; i++){
      cMax= Math.max(pMax, nums[i]+ppMax);
      ppMax=pMax;
      pMax=cMax;

    }
    return cMax;
  }

  public static void main(String[] args) {
    int[] arr = new int[]{1, 2,3,1};
    int res = rob(arr);
    System.out.println(res);
  }
}
