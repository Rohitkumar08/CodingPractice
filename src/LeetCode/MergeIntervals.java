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

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * Created 6/30/2019 11:17 PM
 *
 * @author Rohit Rawani
 *
 */
public class MergeIntervals {
  public static int[][] merge(int[][] arr){
    int[][] result = new int[5][2];
    System.out.println(result.toString());
    Arrays.sort(arr, new Comparator<int[]>(){

      public int compare(int[] a, int[] b)
      {
        //sort based on start value
        return (a[0]-b[0]);
      }

    });

    for(int i=0; i<arr.length; i++){
      if(i==arr.length-1 ){
        result[i][0] = arr[i][0];
        result[i][1] = arr[i][1];
      }
      else if(arr[i][1] >= arr[i+1][0]){
        result[i][0]=arr[i][0];
        result[i][1] = arr[i+1][1];
        i++;
      }else{
        result[i][0] = arr[i][0];
        result[i][1] = arr[i][1];
      }
    }
    Set<String> set = new LinkedHashSet<>();
    for(int j=0;j<result.length;j++)
      set.add(Arrays.toString(result[j]));

    List<String> list = set.stream().filter(i->!i.contains("[0, 0]")).collect(Collectors.toList());
    System.out.println(list);
    return result;

  }

  public static void main(String[] args) {
   int[][] data = {{1,3},{2,6},{8,10},{15,18}};
//    int[][] data = {{1,4},{4,5}};
    merge(data);
  }
}
