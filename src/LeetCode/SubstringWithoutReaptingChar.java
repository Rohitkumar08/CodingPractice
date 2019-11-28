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

import java.util.ArrayList;
import java.util.List;

/**
 * Created 11/7/2019 12:38 AM
 *
 * @author Rohit Rawani
 */
public class SubstringWithoutReaptingChar {
  public static int lengthOfLongestSubstring(String s) {
    if(s==null){
      return -1;
    }
    if(s.length()==1){
      return 1;
    }
    List<Character> lst = new ArrayList<>();
    int maxLength=0;
    int currLength=0;
    for(int i=0; i<s.length(); i++){
      if(!lst.contains(s.charAt(i))){
        lst.add(s.charAt(i));
      }else{
        currLength= lst.size();
        if(maxLength<currLength){
          maxLength=currLength;
        }
        for(int j=i-1; j>=0; j--){
          if(s.charAt(i)==s.charAt(j)){
            i=j;
            break;
          }
        }
        lst.clear();
      }
    }
    if(lst.size()>maxLength){
      maxLength=lst.size();
    }
    System.out.println(maxLength);
    return maxLength;
  }

  public static void main(String[] args) {
    lengthOfLongestSubstring("pwwkew");
  }

}
