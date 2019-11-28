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

import java.text.Normalizer;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created 6/24/2019 12:20 AM
 *
 * @author Rohit Rawani
 */
public class PallindromicString{

  public static int getPallindromes(String s){
    int counter=0;
    int n=s.length();
    Set<String> pallindromes = new TreeSet<String>(new SortLength());
    boolean[][] dp = new boolean[n][n];
    /**
     * initialize all the single chars as true.
     */
    for(int i=0; i<n; i++){
      dp[i][i]= true;
      counter++;
      pallindromes.add(s.substring(i, i+1));
    }

    for(int j=1; j<n; j++){
      for(int i=0; i<j; i++){
        //condition when there is just one char in b/w i&j like ABA
        if(s.charAt(i) == s.charAt(j) && j-i<=2){
          dp[i][j]=true;
          counter++;
          pallindromes.add(s.substring(i, j+1));
      }
        //when there is more than one char in b/w them then check for inner  value like ABCA
        else if(s.charAt(i) == s.charAt(j) && j-i>2){
          if(dp[i+1][j-1]){
            dp[i][j] = dp[i+1][j-1];
            counter++;
            pallindromes.add(s.substring(i, j+1));
            }else{
              dp[i][j] = dp[i+1][j-1];
            }
        }
        else{
          dp[i][j] = false;
        }
      }
    }
    System.out.println(((TreeSet<String>) pallindromes));
//    printMatrix(dp);
    return counter;
  }

  public static void printMatrix(boolean[][] dp){
    for(int i=0; i<dp.length; i++){
      for(int j=0; j<dp.length; j++){
        System.out.print(dp[i][j]+" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    String s ="abbaabbadffd";
/*    String temp = "Cl��������";
    temp = temp.replaceAll("\uFFFD", "");
    for(char c: temp.toCharArray()){
      System.out.println(c);
    }*/

    int noOfPallindrome= getPallindromes(s);
    System.out.println(noOfPallindrome);
    //test 2

  }

}
class SortLength implements Comparator<String>{

  @Override public int compare(String o1, String o2) {
    return o2.length()-o1.length();
  }
}
