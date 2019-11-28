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
package Sorting;

import LeetCode.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created 7/12/2019 12:01 PM
 *
 * @author Rohit Rawani
 */
public class SortBasedOnFrequency {

  private StringBuffer append;

  public static void sortByFrequency(int[] arr){
  //step-1 sort the array
    Arrays.sort(arr);
    //step-2 create a 2d matrix

    int[][] mat = getUniqueCount(arr);
    for(int i=0; i<mat.length; i++){
      int count = mat[i][1];
      while(count>0){
        System.out.print(mat[i][0]+" ");
        count--;
      }
    }
  }

  public static int[][] getUniqueCount(int[] arr){
    int size=1;
    Map<Integer, Integer> hmap = new LinkedHashMap<>();
    for(int i: arr){
      if(hmap.containsKey(i)){
        hmap.put(i, hmap.get(i)+1);
      }else{
        hmap.put(i, 1);
      }
    }

    int[][] count= new int[hmap.size()][2];
    int i=0;
    for(Map.Entry<Integer, Integer> entry : hmap.entrySet()){
        count[i][0]=entry.getKey();
        count[i][1] = entry.getValue();
        i++;
    }
    Arrays.sort(count, new Comparator<int[]>() {

      @Override public int compare(int[] a, int[] b) {
        return b[1]-a[1];
      }
    });
    return count;
  }
  public static void main(String[] args) {
    String s ="abc";
    s= s.concat("djfdn");
    Data d = new Data("sdf", 30);


    List<Data> lst = new ArrayList<>();
    lst.add(new Data("abc", 10));
    lst.add(new Data("def", 20));
    lst.add(new Data("ghi", 15));
    Collections.sort(lst,   new Comparator<Data>() {

      @Override public int compare(Data o1, Data o2) {
        return o2.getRange()-o1.getRange();
      }
    });
    lst.stream().forEach(i-> System.out.println(i.getVideoName()));

    int[] arr= {2, 5, 2, 8, 5, 6, 8, 8};
    sortByFrequency(arr);
  }


}
