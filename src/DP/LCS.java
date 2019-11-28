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
package DP;

import java.util.HashMap;
import java.util.Map;

/**
 * Created 6/21/2019 12:04 AM
 *
 * this was a top-down approach.
 * @author Rohit Rawani
 */
public class LCS {

  public static int findLCSLength(String x, String y, int m , int n, Map<String, Integer> lookup){
    if(m==0 || n==0){
      return 0;
    }

    // construct a unique map key from dynamic elements of the input
    String key = m + "|" + n;

    if(!lookup.containsKey(key)){
      if(x.charAt(m-1) == y.charAt(n-1)){
        lookup.put(key, findLCSLength(x, y, m-1, n-1, lookup) +1);
      }
      else{
        lookup.put(key, Math.max(findLCSLength(x, y, m, n-1, lookup),
            findLCSLength(x, y, m-1, n, lookup)));
      }
    }

    return  lookup.get(key);
  }

  public static void main(String[] args) {
    String X = "ABCBDAB", Y = "BDCABA";
    Map<String, Integer> lookup = new HashMap<>();
    int result = findLCSLength(X, Y, X.length(), Y.length(), lookup);
    System.out.println(result);
  }

}
