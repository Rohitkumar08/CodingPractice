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

import java.util.stream.IntStream;

/**
 * Created 7/15/2019 1:56 AM
 *
 * @author Rohit Rawani
 */
public class TrappingRainWater {
  public static int trap(int[] arr) {
    int n = arr.length;
    int[] leftMax= new int[n];
    int[] rightMax = new int[n];
    leftMax[0]=arr[0];
    rightMax[n-1] = arr[n-1];
    for(int i=1; i<n; i++){
      if(arr[i]>leftMax[i-1]){
        leftMax[i]=arr[i];
      }else{
        leftMax[i] = leftMax[i-1];
      }
    }
    for(int i=n-2; i>=0; i--){
      if(arr[i]>rightMax[i+1]){
        rightMax[i]=arr[i];
      }else{
        rightMax[i] = rightMax[i+1];
      }
    }
/*    for(int a: leftMax)
    System.out.print(a);
    System.out.println();
    for(int b: rightMax)
      System.out.print(b);*/
    int sum=0;
    for(int i=0; i<n; i++){
      sum+=(Math.min(leftMax[i], rightMax[i])-arr[i]);
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
    System.out.println(trap(arr));
  }

}
