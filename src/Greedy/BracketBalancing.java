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

/**
 * Created 6/26/2019 11:20 PM
 *
 * @author Rohit Rawani
 */
public class BracketBalancing {
  public static long swapCount(String s){
    char[] chars= s.toCharArray();
    long swap=0;
    int imbalance=0, countLeft=0, countRight=0;
    for(int i=0; i<chars.length; i++){
      if(chars[i]=='['){
          countLeft++;
          if(imbalance >0){
            swap+=imbalance;
            imbalance--;
          }
      }else if(chars[i]==']'){
        countRight++;
        imbalance=countRight-countLeft;
      }
    }
    return swap;
  }

  public static void main(String[] args) {
    String s = "[]][][";
    System.out.println(swapCount(s));

    s = "[[][]]";
    System.out.println(swapCount(s) );
  }

}
