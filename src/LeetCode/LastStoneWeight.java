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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created 6/27/2019 1:22 AM
 *
 * @author Rohit Rawani
 */
public class LastStoneWeight {
  public static void getStonesLeft(int[] arr){
    int n = arr.length;

    List<Integer> list = new ArrayList<>();
    for(int a: arr){
      list.add(a);
    }
    while(list.size()!=1){
      if(!isSorted(list)){
        Collections.sort(list);
        Collections.reverse(list);
      }
      int diff = (Integer)list.get(0)-(Integer)list.get(1);
      list.add(diff);
      list.remove(0);
      list.remove(0);
    }
    System.out.println(list.get(0));
  }
  public static boolean isSorted(List<Integer> arr){
    for(int i=0; i<arr.size()-1; i++){

      if(arr.get(i) < arr.get(i+1)){
          return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int arr[] ={4,2,1,2,2};
    getStonesLeft(arr);
  }

}
