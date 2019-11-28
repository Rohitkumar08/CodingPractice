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

/**
 * Created 7/2/2019 1:22 AM
 *
 * @author Rohit Rawani
 */
public class JumpGame {

 /* public static boolean canJumpToEnd(int[] arr){
    if(arr[0]==0){
      return false;
    }
    int n= arr.length;
    if(arr[0]<n-1 && inDe creasingOrder(arr)){
      return false;
    }else if(getSum(arr)< n-1){
        return false;
    }else{
      return true;
    }
  }

  public static boolean inDecreasingOrder(int[] arr){
    int n= arr.length;
    for(int i=0; i<n-2; i++){
      if(arr[i]<=arr[i+1]){
        return false;
      }
    }
    return true;
  }
  public static int getSum(int[] arr){
    int n= arr.length;
    int sum=0;
    for(int i=0; i<n-1; i++){
      sum+=arr[i];
    }
    return sum;
  }*/
 public static boolean canJumpFromPosition(int position, int[] nums) {
   if (position == nums.length - 1) {
     return true;
   }

   int furthestJump = Math.min(position + nums[position], nums.length - 1);
   for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
     if (canJumpFromPosition(nextPosition, nums)) {
       return true;
     }
   }

   return false;
 }

  public static boolean canJump(int[] nums) {
    return canJumpFromPosition(0, nums);
  }
  public static void main(String[] args) {
    int[] arr  = {1,0,2};
    System.out.println(canJump(arr));
  }

}
