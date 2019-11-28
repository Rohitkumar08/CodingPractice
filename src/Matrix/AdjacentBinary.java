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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created 5/13/2019 12:12 AM
 *
 * @author Rohit Rawani
 */
public class AdjacentBinary {
  public static void printMaxPairs(int[][] arr, int m, int n){
    int count=0;
    for(int i=0; i<=m; i++){
      for(int j=0; j<=n; j++){
        if(arr[i][j]!=1){
          continue;
        }
        if(j!=n && i!=m){
            if(arr[i][j+1]==1){
              count++;
            }
            if( arr[i+1][j+1]==1 ){
              count++;
            }
            if(arr[i+1][j]==1){
              count++;
            }
          if(i>0 && arr[i-1][j+1]==1){
            count++;
          }
        }else if(j==n && i!=m){
            if(arr[i+1][j]==1){
              count++;
            }
        }else if(i==m && j!=n){
          if(arr[i][j+1]==1){
            count++;
          }
          if(arr[i-1][j+1]==1){
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }

  public static void main(String[] args) {

  int[] arr1 ={1,5,};

    System.out.println(arr1[0]+"dsf"+arr1.length);
    StringBuilder build=new StringBuilder();
    for(int i=0; i<5; i++){
      build.append(i+"&");
    }
    String queryparam = new String(build);
    System.out.println(queryparam);
    int arr[][] ={{1,1,1},
        {1,1,1},
        {1,1,1}};
    printMaxPairs(arr,2,2 );
  }


}
