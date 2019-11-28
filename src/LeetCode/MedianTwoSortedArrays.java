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
 * Created 7/17/2019 1:27 AM
 *
 * @author Rohit Rawani
 */
public class MedianTwoSortedArrays {
  public static float findMedianSortedArrays(int[] arr1, int[] arr2){
    int[] arr3 = merge(arr1, arr2);
    if(arr3.length%2!=0){
      return (arr3[arr3.length/2]);
    }else{
      return ((arr3[arr3.length/2]+arr3[(arr3.length/2)-1])/2f);
    }
  }

  public static int[] merge(int[] arr1, int[] arr2){
    if(arr1.length==0){
      return arr2;
    }else if(arr2.length==0){
      return arr1;
    }
    int[] arr3= new int[arr1.length+arr2.length];
    int k=0; int i=0; int j=0;
    while(i<arr1.length && j<arr2.length){
      if(arr1[i]<=arr2[j]){
        arr3[k]=arr1[i];
        i++;
      }
      else if(arr1[i]>=arr2[j]){
        arr3[k]=arr2[j];
        j++;
      }
      k++;
    }
    while(i<arr1.length){
      arr3[k] = arr1[i];
      i++;
      k++;
    }
    while(j<arr2.length){
      arr3[k] = arr2[j];
      j++;
      k++;
    }
    return arr3;
  }
  public static void main(String[] args) {
    int arr1[] ={1};
    int arr2[] = {1};
    System.out.println(findMedianSortedArrays(arr1, arr2));
  }
}
