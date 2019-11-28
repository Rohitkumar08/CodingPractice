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
 * Created 8/11/2019 3:33 AM
 *
 * @author Rohit Rawani
 */
public class ReverseString2 {
  public static String reverseStr(String s, int k) {
    String result =s;
    if(s.length()<k){
      return reverse(0, s.length(), s);
    }
    for(int j=0; j<s.length(); j=j+2*k){
      result=reverse(j, j+k,  result);
    }
    return result;
  }
  public  static String reverse(int start, int end, String s){
    if(s.length()<end){
      end=s.length();
    }
    String result="";
    for(int i=end-1; i>=start; i--){
      result+=s.charAt(i);
    }
    return s.substring(0,start)+result+s.substring(end);
  }
  public static void main(String[] args) {
    System.out.println(reverseStr("hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl",
        39));
  }

}
