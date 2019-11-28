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

import java.util.Comparator;
import java.util.Scanner;

/**
 * Created 7/15/2019 9:14 PM
 *
 * @author Rohit Rawani
 */
public class Roatation {

  public static int getCount(int n, String str){
    Comparator comp = new Comparator() {

      @Override public int compare(Object o1, Object o2) {
        return 0;
      }
    };
    
    System.out.println(comp instanceof  Object);
    char[] arr = str.toCharArray();
    int mid = (arr.length/2);
    int result=0;
    String news=str;
    result = rotateAndUpdate(str.toCharArray(), mid, result);
    while(!str.equals(rotateStr(news))){
      news = rotateStr(news);
      result = rotateAndUpdate(news.toCharArray(), mid, result);
    }
    return result;
  }

  public static String rotateStr(String s){
    return s.substring(s.length()-1).concat(s.substring(0,s.length()-1));
  }

  public static int  rotateAndUpdate(char[] arr, int mid, int result){
    int countLeft=0;
    int countRight=0;
    for(int i=0; i<mid; i++){
      if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
        countLeft++;
      }
    }
    for(int i=mid; i<arr.length; i++){
      if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
        countRight++;
      }
    }
    if(countLeft>countRight){
      result++;
    }
    return result;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i=0; i<t; i++){
      int n =sc.nextInt();
      String str = sc.nextLine();
      String str1 = sc.nextLine();
      System.out.println(getCount(n, str1));
    }
  }
}
