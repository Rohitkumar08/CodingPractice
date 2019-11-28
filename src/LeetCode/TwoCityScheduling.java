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
import java.util.Comparator;

/**
 * Created 6/27/2019 2:03 AM
 *
 * @author Rohit Rawani
 */
public class TwoCityScheduling {

  public static int twoCitySchedCost(int[][] costs){
  /*int n = costs.length;
  int aCount=0;
  int bCount=0;
  int sum=0;
    for(int i=0; i<n; i++){
        if(aCount<n/2 && costs[i][0]< costs[i][1]){
          aCount++;
          sum+=costs[i][0];
        }else if(bCount<n/2){
          bCount++;
          sum+=costs[i][1];
        }
        else if(bCount==n/2 && aCount<n/2){
          sum+=less(costs[i][0], costs[i][1]);
        }else if(aCount==n/2 && bCount<n/2){
          sum+=less(costs[i][0], costs[i][1]);
        }
    }
    System.out.println(sum);
    return sum;*/
    if(costs==null || costs.length==0) return 0;

    Arrays.sort(costs,new Comparator<int[]>(){

      public int compare(int[] a, int[] b)
      {
        // max difference
        return (b[1] - b[0]) -(a[1]-a[0]);
      }

    });
    int total=0;
    int i=0;
    while(i<costs.length/2)
    {
      total+=costs[i][0];
      i++;
    }


    while(i<costs.length)
    {
      total+=costs[i][1];
      i++;
    }
    for(int j=0;j<costs.length;j++)
      System.out.println(Arrays.toString(costs[j]));
    return total;
  }
  public static int less(int a, int b){
    return a>b? b : a;
  }
  public static void main(String[] args) {
    int[][] costs = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
//    int[][] costs = {{10,20},{30,200},{400,50},{30,20}};
    System.out.println(twoCitySchedCost(costs));
  }

}
