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
import java.io.*;
import java.util.*;
/**
 * Created 11/9/2019 12:02 AM
 *
 * @author Rohit Rawani
 */
public class SmallestSubstringWithDistinctChar {
  public static void main(String[] args) throws IOException {
    System.out.println(SmallestSubString("aab"));
  }

  static int SmallestSubString(String S) {
    if(S == null || S.length()==0) return 0;

    Map<Character, Integer> map = new HashMap<>();
    int n = S.length();
    int st=0; int end=0; int maxLen = 1;
    int globalStart = 0; int globalEnd = 0;
    int uniqueCount = 1;
    int smallestSubStr = 1;
    map.put(S.charAt(0), 1);
    for(int i=1; i<n; i++) {
      char ch = S.charAt(i);
      if (map.get(ch) == null) {
        map.put(ch, 1);
        uniqueCount ++;
      } else {
        map.put(ch, map.get(ch)+1);
      }
      if(S.charAt(i) == S.charAt(st)) {
        while(st <=i && map.get(S.charAt(st)) > 1) {
          map.put(S.charAt(st), map.get(S.charAt(st))-1);
          st++;
        }
      }
      if(uniqueCount > maxLen) {
        maxLen = uniqueCount;
        smallestSubStr = i-st+1;
        globalStart = st;
        globalEnd = i;
      }else if(uniqueCount == maxLen) {
        if(i-st+1 < smallestSubStr) {
          smallestSubStr = i-st+1;
          globalStart = st;
          globalEnd = i;
        }
      }

    }
    System.out.println("start:" + globalStart + " end:" + globalEnd +  " length:" + smallestSubStr);
    return smallestSubStr;
    // Write your code here

  }
}
