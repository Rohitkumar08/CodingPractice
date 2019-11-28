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

import javax.print.attribute.IntegerSyntax;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created 8/19/2019 12:29 AM
 *
 * @author Rohit Rawani
 */
public class LargestDivisibleSubset {
  public static List<Integer> largestDivisibleSubset(int[] nums) {
    if(nums== null || nums.length==0){
      return new ArrayList<>();
    }
    List<List<Integer>> data = new ArrayList<>();
    boolean one = IntStream.of(nums).anyMatch(i->i==1);
    Arrays.sort(nums);

    for(int i=0; i<nums.length-1; i++){
      if(nums[i]==1){
        data.add(new ArrayList<Integer>(){
          {
            add(1);
          }
        });
        continue;
      }
      int index=data.size();
      boolean contains= false;
      for(List<Integer> temp : data){
        if(temp.contains(nums[i])){
          index = data.indexOf(temp);
          contains = true;
          break;
        }
      }
      if(!contains){
        List<Integer> lst = new ArrayList<>();
        lst.add(nums[i]);
        data.add(lst);
      }
      for(int j=i+1; j<nums.length; j++){
        if(nums[j]%nums[i]==0){
          data.get(index).add(nums[j]);
          break;
        }
      }
      if(one && !data.get(index).contains(1)){
        data.get(index).add(0, 1);
      }
    }

    Collections.sort(data, new Comparator<List<Integer>>() {

      @Override public int compare(List<Integer> o1, List<Integer> o2) {
        return o2.size()-o1.size();
      }
    });
    return data.get(0);
  }

  public static void main(String[] args) {
    System.out.println(largestDivisibleSubset(new int[]{2,4, 8, 24}));
  }
}
