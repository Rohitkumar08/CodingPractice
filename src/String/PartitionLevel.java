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
package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created 6/25/2019 1:57 AM
 *
 * @author Rohit Rawani
 */
public class PartitionLevel {
/*  static HashMap<Character, Integer> hmap = new HashMap<>();
  public static void printPartitionList(String s){
    List<Integer> result = new ArrayList<>();
    Set<Character> set = new HashSet<>();
    char[] c= s.toCharArray();
    for(int i=0; i<s.length(); i++){
        set.add(c[i]);
    }

    for(char ch : set){
      hmap.put(ch, s.lastIndexOf(ch));
    }
    int start=0;
    for(char chr : set){
      int val = maxValue(getCharInGivenIndex(start, hmap.get(chr), s));
      if(val != 0){
        result.add(val);
      }
      start = result.get(result.size()-1);
    }
    List<Integer> finalResult= new ArrayList<>();
    for(int i=0; i<result.size(); i++){
      if(i==0){
        finalResult.add(result.get(0)+1);
      }else{
        finalResult.add(result.get(i)-result.get(i-1));
      }
    }

    System.out.println(finalResult);
  }

  private static Set<Character> getCharInGivenIndex(int st, int e, String s){
    Set<Character> data = new HashSet<>();
    if(st> e){
      return Collections.emptySet();
    }else if(st ==e){
      data.add(s.charAt(st));
      return data;
    }

    for(int i=st+1; i<=e; i++){
      data.add(s.charAt(i));
    }
    return data;
  }

  private static int maxValue(Set<Character> lst){
    if(lst.size() ==0){
      return 0;
    }
    int max=Integer.MIN_VALUE;
    for(char c : lst){
      if(max<hmap.get(c))
      max=hmap.get(c);
    }
    return max;
  }*/
public static void printPartitionList(String S){
  List<Integer> out = new ArrayList<>();
  HashMap<Character, Integer> map = new HashMap<>();
  for (int i=0; i<S.length(); i++) {
    map.put(S.charAt(i), i);
  }
//  int[] data = out.stream().mapToInt(i->i).toArray();
  Integer end=0, begin=0;
  System.out.print(map);
  for (int i=0; i<S.length(); i++) {
    Integer index = map.get(S.charAt(i));
    if (index.intValue() > end.intValue()) {
      end = index;
    }
    if(i == end.intValue()) {
      out.add(end.intValue() - begin.intValue() + 1);
      begin = i + 1;
    }
  }
  System.out.println(out);
}

  public static void main(String[] args) {
    String s= "ababcbacadefegdehijhklij";
//    String s ="qvmwtmzzse";
    printPartitionList(s);
  }

}
