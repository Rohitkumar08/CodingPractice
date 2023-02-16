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


import java.util.Stack;

/**
 * Created 7/23/2019 2:05 AM
 *
 * @author Rohit Rawani
 */
public class DecodeString {

  public static String decodeString(String s) {
    StringBuilder result=new StringBuilder();
    Stack<String> ch =  new Stack<>();
    Stack<Integer> num =  new Stack<>();
    for(int i=0; i<s.length(); i++){
      if(Character.isDigit(s.charAt(i))){
        StringBuilder temp= new StringBuilder();
        temp.append(s.charAt(i));
        while(Character.isDigit(s.charAt(i+1))){
          temp.append(String.valueOf(s.charAt(i+1)));
          i++;
        }
        num.push(Integer.parseInt(temp.toString()));
      }else if(s.charAt(i)=='['){
        StringBuilder temp= new StringBuilder();
        while(Character.isLetter(s.charAt(i+1))){
            temp.append(String.valueOf(s.charAt(i+1)));
            i++;
        }
        ch.push(temp.toString());
      }else if(s.charAt(i)==']'){
        StringBuilder tenp2 = new StringBuilder();
        String popped=ch.pop();
        int value = num.pop();
        for(int k=0; k<value; k++){
          tenp2=tenp2.append(popped);
        }
        if(!ch.isEmpty()){
          ch.push(ch.pop().concat(tenp2.toString()));
        }else{
          ch.push(tenp2.toString());
        }
      }else{
        if(!ch.isEmpty()){
          ch.push(ch.pop().concat(String.valueOf(s.charAt(i))));
        }else{
          ch.push(String.valueOf(s.charAt(i)));
        }

      }
    }
  return ch.pop();
  }

  public static void main(String[] args) {
//    String s ="3[a]2[bc]";
//    String s ="3[a2[c]]";
    String s ="100[leetcode]";

    System.out.println(decodeString(s));
  }
}
