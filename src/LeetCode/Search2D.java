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

/**
 * Created 7/24/2019 3:27 AM
 *
 * @author Rohit Rawani
 */
public class Search2D {
  public static boolean searchMatrix(int[][] matrix, int target) {

    if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
      return false;
    }else if(matrix.length == 1 && matrix[0].length == 1){
      return target==matrix[0][0]?true:false;
    }
    int m = matrix.length;
    int n = matrix[0].length;
    if(target<matrix[0][0] || target> matrix[m-1][n-1]){
      return false;
    }
    if(matrix.length<2){
      return doBinarySearch(matrix[0], 0, matrix[0].length, target);
    }
    int row=0;
    int i=1;
    for(i=1; i<matrix.length; i++){
      if(target==matrix[i][0]){
        return true;
      }else if(target<matrix[i][0]){
        row=i-1;
        break;
      }else if(i==matrix.length-1 && target<=matrix[i][matrix[i].length-1]){
        row=i;
        break;
      }
    }
    return doBinarySearch(matrix[row], 0, matrix[i].length, target);

  }
  public static boolean doBinarySearch(int[] arr, int low, int high, int target){
    if(low>=high){
      return false;
    }
    int mid=(low+high)/2;
    System.out.println("mid="+mid);
    if(arr[mid]==target){
      return true;
    }else if(arr[mid]<target){
      return doBinarySearch(arr, mid+1, high, target);
    }else{
      return doBinarySearch(arr, 0, mid, target);
    }
  }
  public static void main(String[] args){
    int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,50}}/*{{1},{3}}*/;
    System.out.println(searchMatrix(arr, 50));
  }
}
