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
 * Created 6/15/2019 8:34 PM
 *
 * @author Rohit Rawani
 */
public class MaxSumSubArray {

/*  public static int maxSubArray(int[] nums){
    int maxSumTillNow=Integer.MIN_VALUE;
    int currentSum = Integer.MIN_VALUE;
    for(int i=0; i<nums.length; i++){
      currentSum =



      if(currentSum <0 && nums[i]>0){
        currentSum=0;
      }
      *//**
       * condn when the currrentSum would be -2457357 and num[i] is -1
       * in that case it should frst make the currentSum as 0 then
       * add it to the num[i] so that currentSum can be updated to -1
       *//*
      if(currentSum <0 && currentSum<nums[i] ){
        currentSum = 0;
      }
      currentSum +=nums[i];
      if(currentSum > maxSumTillNow ){
        maxSumTillNow = currentSum;
      }
    }
    System.out.println(maxSumTillNow);
    return maxSumTillNow;
  }*/
  public static int maxSubArray(int[] nums){
    nums= new int[4];

    int prevMax=Integer.MIN_VALUE;
    int currentMax;
    int result = Integer.MIN_VALUE;
    for(int i=0; i<nums.length; i++) {
      currentMax = Math.max(nums[i], nums[i]+prevMax);
      result=Math.max(result, currentMax);
      prevMax=currentMax;
    }
    System.out.println(result);
    return result;
  }

  public static void main(String[] args) {
    int[] arr = new int[]{5, -1, 2};
    maxSubArray(arr);
  }
}
