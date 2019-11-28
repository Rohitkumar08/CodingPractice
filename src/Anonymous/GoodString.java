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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Created 4/14/2019 1:30 PM
 *
 * @author Rohit Rawani
 */
public class GoodString {

  public static void goodString(String s){
    List<Character> up = new ArrayList<>();
    List<Character> low = new ArrayList<>();
    int result=0;
    char[] ch = s.toCharArray();
    for(char c : ch){
      if(Character.isLetter(c)){
        if(Character.isUpperCase(c))
          up.add(c);
        else{
          low.add(c);
        }
      }

    }
    if(up.size() ==0 && low.size() ==0){
      System.out.println("Invalid Input");
      return;
    }
    if(up.size()>low.size()){
      result =low.size();
    }else{
      result =up.size();
    }
    System.out.println(result);
  }
  public static void main(String[] args) {
    String[] arr=null;
    Set<String> set = new HashSet<>();
    set.add("a");
    set.add("b");
    set.add("c");
    set.add("d");
    set.add("e");
    arr=set.stream().toArray(String[]::new);

    if(arr == null){
      System.out.println("executed");
    }
    Scanner sc = new Scanner(System.in);
    int t=0;
    try{
      t = sc.nextInt();
    }catch(InputMismatchException e){
      System.out.println("Invalid Test");
    }

    for(int i=0; i<t; i++){
      String s = sc.next();
      goodString(s);
    }
  }
}
