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
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created 4/10/2019 5:39 PM
 *
 * @author Rohit Rawani
 */
public class Heisenberg {

  public static int findLength(String[] arr, int n){
    String c="";
    for(int i=0; i<n-1; i++){
     c= concat(arr[i], arr[i+1]);
      arr[i+1]=c;
    }
    System.out.println(c);
    return c.length();
  }

  public static String concat(String a, String b){
    String s;
   char[] arr= a.toCharArray();
   char[] arr1 = b.toCharArray();
    List<Character> listC = new ArrayList<Character>();
    for (char c : arr1) {
      listC.add(c);
    }
  int index=0;
   for(int i=arr.length-1; i>=0; i--){
      if(arr[i]==listC.get(0)){
        index=i;
        break;
      }
   }
   int jindex=0, j;
   for(j=index; j<arr.length-1; j++){
     if(arr[j]!=listC.get(jindex)){
       break;
     }
     jindex++;
   }
   if(j==arr.length-1){
     for(int k=0; k<=jindex; k++)
     listC.remove(k);
   }
    StringBuilder s2= new StringBuilder();
    for(char c: listC){
     s2.append(c);
   }
   String s1= s2.toString();
   return a.concat(s1);
  }

  public static void main(String[] args) {

    List<String> lst = new ArrayList<String>();
    lst.add("a");
    lst.add("b");
    lst.add("c");
    Random rand = new Random();
    for(int i=0; i<lst.size(); i++){
      int randIndex = rand.nextInt(lst.size());
      System.out.println(lst.get(randIndex));
    }
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    String[] arr =new String[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.next();
    }
    int result = findLength(arr, n);
    System.out.println(result);
  }
}
