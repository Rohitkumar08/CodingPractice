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
package Matrix;

import java.util.stream.IntStream;

/**
 * Created 8/1/2019 1:22 AM
 *
 * @author Rohit Rawani
 */
public class RowWIthMax1 {

  public static int rowWithMax1s(int[][] arr) {
    int max1Row = 0;
    int n=arr[0].length;
    int currentMax1Row = getFirst(arr[0]);
    if (currentMax1Row == -1) {
      currentMax1Row=n-1;
    }
    for(int i=1; i<arr.length;i++){
      while(currentMax1Row>=0 && arr[i][currentMax1Row]==1){
        currentMax1Row-=1;
        max1Row=i;
      }
    }
    return max1Row;
  }
  public static int getFirst(int[] arr){
    for(int i=0; i<arr.length; i++){
      if(arr[i]==1){
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int mat[][] = { { 0, 0, 0, 1 },
        { 0, 1, 1, 1 },
        { 1, 1, 1, 1 },
        { 0, 0, 0, 0 } };
    System.out.println("Index of row with maximum 1s is "
        + rowWithMax1s(mat));
  }

}
