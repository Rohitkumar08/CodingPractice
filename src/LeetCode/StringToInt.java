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
 * Created 8/18/2019 7:32 PM
 *
 * @author Rohit Rawani
 */
public class StringToInt {
  public  static int myAtoi(String str) {
    str = str.trim();
    System.out.println(str);
    if(str.isEmpty()){
      return 0;
    }
    boolean numeric=false;
    boolean negative =false;
    boolean endNumeric = false;
    char[] c = str.toCharArray();
    int start=0;
    int end =str.length();
    for(int i=0; i<c.length; i++){
      if(!numeric && c[i]=='-' && Character.isDigit(c[i+1])){
        negative = true;
      }
      if(Character.isDigit(c[i])){
        if(!numeric && negative){
          start=i-1;
        }else if(!numeric){
          start =i;
        }
        numeric = true;
        end =i;
        if(i == c.length-1){
          endNumeric=true;
        }
      }
      if(numeric && !Character.isDigit(c[i])){
        end= i;
        if(negative){
          start= start-1;
        }
        str = str.substring(start, end);
        break;
      }
    }
    if(str.length()>end){
      if(endNumeric){
        str = str.substring(start, end+1);
      }else{
        str = str.substring(start, end);
      }
    }

    long result = Long.valueOf(str.trim());
    if(result > Integer.MAX_VALUE){
      return Integer.MAX_VALUE;
    }else if(result<Integer.MIN_VALUE){
      return Integer.MIN_VALUE;
    }
    return (int)result;
  }

  public static void main(String[] args) {
    System.out.println(myAtoi("-987 fsdgsfgsgs sdfds "));
  }
}
