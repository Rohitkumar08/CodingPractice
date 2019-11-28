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

import java.util.Arrays;

/**
 * Created 6/27/2019 12:31 AM
 *
 * @author Rohit Rawani
 */
public class KBookings {

  public static boolean isBookingPossible(int[] arr, int[] dep, int k){
    Arrays.sort(arr);
    Arrays.sort(dep);
    int rooms=1;
    for(int i=0; i<arr.length-1; i++){
      if(dep[i] > arr[i+1]){
        rooms++;
      }
      if(rooms>k){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    int arrival[] = { 1, 3, 5 };
    int departure[] = { 2, 6, 8 };
    System.out.println(isBookingPossible(arrival, departure, 2));
  }
}
