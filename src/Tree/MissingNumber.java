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
package Tree;

/**
 * Created 9/30/2019 8:44 PM
 *
 * @author Rohit Rawani
 */
public class MissingNumber {

  public static int getMissingNumber(int[] arr, int k){
    int n = arr.length;
    if(n==0){
      return -1;
    }
    if(n==1){
      return arr[0]==1 ? 2 : 1;
    }
    int low = 0;
    int high = arr.length-1;
    int mid =0;
    while((high-low)>1){
      mid = (low+high)/2;
      if((arr[low]-low) != (arr[mid]-mid)){
        high = mid;
      }else if((arr[high]-high) != (arr[mid]-mid)){
        low= mid;
      }
    }
    return arr[mid]+1;
//    int result = modifiedBinarySearch(arr, low, high);
//    return result;
  }

  public static int modifiedBinarySearch(int[] arr, int low, int high){
    if(low==high){
      return arr[low-1]+1;
    }
    int mid = low + ((high - low)/2);
    if(low==mid && arr[mid]!=mid+1){
      return arr[mid]+1;
    }
    if(arr[mid]==mid+1){
     return  modifiedBinarySearch(arr, mid+1, high);
    }else if(arr[mid]>mid+1){
     return  modifiedBinarySearch(arr, low, mid);
    }
    return -1;
  }

  static int search(int ar[],
      int size)
  {
    int a = 0, b = size - 1;
    while (b>=a)
    {
      int mid = (a+ b) / 2;
      if (ar[mid] != mid + 1 &&
        ar[mid - 1] == mid)
      return (mid + 1);

      // if this is not the first
      // missing element search
      // in left side
      if (ar[mid] != mid + 1)
        b = mid - 1;

        // if it follows index+1
        // property then search
        // in right side
      else
        a = mid + 1;
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {1,2,3,4, 6,7,8,9};
    int k =9;
    System.out.println(search(arr, arr.length));
  }

}
