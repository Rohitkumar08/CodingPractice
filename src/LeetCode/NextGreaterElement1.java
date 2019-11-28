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
import java.util.Stack;
import java.util.stream.IntStream;

/**
 * Created 7/30/2019 12:05 AM
 *
 * @author Rohit Rawani
 */
public class NextGreaterElement1 {
  public static  int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int[] result= new int[nums1.length];
    int k=0;
    int j;
    result[nums1.length-1]=-1;
    for(int i=0; i<nums1.length-1; i++){
      j=0;
      while(j<nums2.length-1 && nums2[j]!=nums1[i]){
        j++;
      }
      while(j<nums2.length-1){
        if(nums2[j+1]>nums1[i]){
          result[k]=nums2[j+1];
          k++;
          break;
        }
        j++;
      }
      if(j==nums2.length-1){
        result[k]=-1;
        k++;
      }
    }
    IntStream.of(result).forEach(System.out::print);
    return result;
  }
  public static int[] nextGreaterElement1(int[] findNums, int[] nums) {
    Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
    Stack<Integer> stack = new Stack<>();
    for (int num : nums) {
      while (!stack.isEmpty() && stack.peek() < num)
        map.put(stack.pop(), num);
      stack.push(num);
    }
    for (int i = 0; i < findNums.length; i++)
      findNums[i] = map.getOrDefault(findNums[i], -1);
    IntStream.of(findNums).forEach(System.out::print);
    return findNums;
  }

  public static void main(String[] args) {
    int[] arr1={4,1,2};
    int[] arr2 = {1,3,4,2};
//    nextGreaterElement(arr1, arr2);
    nextGreaterElement1(arr1, arr2);
  }

}
