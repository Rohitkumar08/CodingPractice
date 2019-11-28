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
package Array;

import java.util.HashMap;

/**
 * Created 9/24/2019 8:20 PM
 *
 * @author Rohit Rawani
 */
public class SubArraySumBest {

  public static void subArraySum(int[] arr, int n, int sum) {
    //cur_sum to keep track of cummulative sum till that point
    int cur_sum = 0;
    int start = 0;
    int end = -1;
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    for (int i = 0; i < n; i++) {
      cur_sum = cur_sum + arr[i];
      //check whether cur_sum - sum = 0, if 0 it means
      //the sub array is starting from index 0- so stop
      if (cur_sum - sum == 0) {
        start = 0;
        end = i;
        break;
      }
      //if hashMap already has the value, means we already
      // have subarray with the sum - so stop
      if (hashMap.containsKey(cur_sum - sum)) {
        start = hashMap.get(cur_sum - sum) + 1;
        end = i;
        break;
      }
      //if value is not present then add to hashmap
      hashMap.put(cur_sum, i);
    }
    // if end is -1 : means we have reached end without the sum
    if (end == -1) {
      System.out.println("No subarray with given sum exists");
    } else {
      System.out.println("Sum found between indexes "
          + start + " to " + end);
    }

  }

  // Driver code
  public static void main(String[] args) {
    int[] arr = {10, 2, -2, -20, 10};
    int n = arr.length;
    int sum = -10;
    subArraySum(arr, n, sum);

  }
}

