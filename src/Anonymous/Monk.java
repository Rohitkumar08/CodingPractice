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

import java.util.Scanner;

/**
 * Created 4/17/2019 12:09 AM
 *
 * @author Rohit Rawani
 */
public class Monk {

  public static int getTotal(int[] call, int[] ideal, int n){
    int result=n;
    boolean matched=false;
      while(!matched){
        int count=0;
        for(int j=0; j<n; j++){
          if(call[count]!=ideal[count]){
            swap(call);
            result+=1;
            break;
          }else{
            count++;
          }
        }
        if(count==n){
          matched=true;
        }
      }
      return result;
  }
  public static void swap(int[] arr){
    int temp=arr[0];
    for(int i=0; i<arr.length; i++){
      if(i==arr.length-1){
        arr[i]=temp;
      }else{
        arr[i]=arr[i+1];
      }
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] call = new int[n];
    int[] ideal = new int[n];
    for(int i=0; i<n; i++){
      call[i]=sc.nextInt();
    }
    for(int j=0; j<n; j++){
      ideal[j]=sc.nextInt();
    }
    int total= getTotal(call,ideal,n);
    System.out.println(total);

  }

}
