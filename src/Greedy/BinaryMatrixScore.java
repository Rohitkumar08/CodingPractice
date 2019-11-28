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
 * Created 7/2/2019 12:07 AM
 *
 * @author Rohit Rawani
 */
public class BinaryMatrixScore {

  public static int getScore(int[][] data){
    int m=Arrays.stream(data).map(row -> row.length).max(Integer::compare).get();
    for(int i=0; i<data.length; i++){
      if(data[i][0]==0){
        for(int j=0; j<m; j++){
          data[i][j]=data[i][j]==0 ? 1 :0;
        }
      }
    }
    for(int i=0; i<m; i++){
      if(majorityCountZero(i, data)){
        for(int j=0; j<data.length; j++){
          data[j][i]=(data[j][i]==0) ? 1 :0;
        }
      }
    }
    int sum = getSumScore(data,m);
    System.out.println(sum);
    return sum;
  }

  public static int getSumScore(int[][] data,int m){
    int sum=0;
    for(int i=0; i<data.length; i++){
      for(int j=0; j<m; j++){
        if(data[i][j]==1){
          sum+=Math.pow(2, m-1-j);
        }
      }
    }
    return sum;
  }

  public static boolean majorityCountZero(int i, int[][] arr){
    int zero=0, one=0;
    for(int k=0; k<arr.length; k++){
      if(arr[k][i]==0){
        zero++;
      }else{
        one++;
      }
    }
    return zero>one;
  }
  public static void main(String[] args) {
    int[][] data = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
    getScore(data);
  }

}
