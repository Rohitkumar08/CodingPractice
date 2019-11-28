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

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created 6/26/2019 1:19 AM
 *
 * @author Rohit Rawani
 */
public class TwoSum {

  public static int[] twoSum(int[] nums, int target) {
    int[] result= new int[2];
    for(int i=0; i<nums.length; i++){
      for(int j=i+1; j<nums.length; j++){
       if(nums[i]+nums[j] ==target){
          result[0]=i;
          result[1]=j;
          System.out.println(result[0]+","+result[1]);
          return result;
        }
      }
    }
    return result;
  }
  //efficient soln o(n)
  public int[] twoSumMap(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement) && map.get(complement) != i) {
        return new int[] { i, map.get(complement) };
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }
  public static void main(String[] args) {
    int[] arr = {2, 7, 11, 15};
    int target = 9;
    twoSum(arr, target);
  }

}
