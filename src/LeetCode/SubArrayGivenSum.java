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

import java.util.HashMap;
import java.util.Map;

/**
 * Created 8/15/2019 8:07 PM
 *
 * @author Rohit Rawani
 */
public class SubArrayGivenSum {

  public static int subarraySum(int[] arr, int k) {
    int count = 0;
    int currSum=0;
    Map<Integer, Integer> hmap = new HashMap<>();
    int start = 0;
    int end = -1;
    for(int i=0; i<arr.length; i++){
      currSum+=arr[i];
      if(currSum == k){
        start=0;
        end = i;
        break;
      }
      if(hmap.containsKey(currSum-k)){
        start = hmap.get(currSum-k)+1;
        end =i;
        break;
      }
      hmap.put(currSum, i);
    }
    if(end ==-1){
      System.out.println("no subarray found");
    }else{
      System.out.println("Sum found between indexes "
          + start + " to " + end);
    }
    return count;
  }

  public static void main(String[] args) {
    int[] arr = new int[]{10,2,-2,-20,10};
    System.out.println(subarraySum(arr, -10));
  }

}
