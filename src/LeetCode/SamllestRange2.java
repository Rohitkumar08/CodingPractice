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

/**
 * Created 7/5/2019 9:56 PM
 *
 * @author Rohit Rawani
 */
public class SamllestRange2 {
  public static int getSmallestDiff(int[] arr, int k){
    if(arr.length==1){
      return 0;
    }
    Arrays.sort(arr);
    if(arr.length%2 ==0){
      for(int i=0; i<arr.length/2; i++){
        arr[i]= arr[i]+k;
      }
      for(int j=arr.length/2; j<arr.length; j++){
        arr[j]= arr[j]-k;
      }
    }
    else{
      for(int i=0; i<=arr.length/2; i++){
        arr[i]= arr[i]+k;
      }
      for(int j=(arr.length/2)+1; j<arr.length; j++){
        arr[j]= arr[j]-k;
      }
    }
    Arrays.sort(arr);
    Arrays.stream(arr).forEach(a-> System.out.println(a));
    return arr[arr.length-1]-arr[0];
  }

  public static void main(String[] args) {
    int arr[] = {7,8,8};
    int k=5;
    System.out.println(getSmallestDiff(arr, k));
  }
}
