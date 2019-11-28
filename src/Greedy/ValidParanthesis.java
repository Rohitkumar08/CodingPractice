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

import java.util.Stack;

/**
 * Created 6/29/2019 1:39 AM
 *
 * @author Rohit Rawani
 */
public class ValidParanthesis {
  public static int minAddToMakeValid(String s) {
    char[] ch = s.toCharArray();
    Stack<Character> stk = new Stack<>();
    int open=0;
    int close=0;
    for(char c: ch){
      if(c=='('){
        stk.push('(');
      }else{
        if(stk.isEmpty()){
          close++;
        }else{
          stk.pop();
        }
      }
    }
    while(!stk.isEmpty()){
      stk.pop();
      open++;
    }
    return (close+open);
  }

  public static void main(String[] args) {
    System.out.println(minAddToMakeValid("()"));
  }
}
