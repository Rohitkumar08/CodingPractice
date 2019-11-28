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
package Anonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created 10/15/2019 9:59 PM
 *
 * @author Rohit Rawani
 */
public class Solution {


  public static int maxEvents(List<Integer> arrival, List<Integer> duration) {
   if(arrival.size()==1){
      return 1;
    }
    int count=0;
    int temp=0;
    for(int i=0; i<arrival.size()-1; i++){
      temp = arrival.get(i)+duration.get(i);
        if(temp>arrival.get(i+1)){
          continue;
        }else{
          count++;
        }
    }
    if(temp<=arrival.get(arrival.size()-1)){
      count++;
    }
    System.out.println(count);
    return count;
  }

  public static void main(String[] args) {
    List<Integer> arrival = Arrays.asList(1);

    List<Integer> duration = Arrays.asList(5);
    maxEvents(arrival, duration);
  }

}