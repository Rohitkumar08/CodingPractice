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

/**
 * Created 8/8/2019 11:27 PM
 *
 * @author Rohit Rawani
 */
public class PermutationOfString {

  public static void printPermute(String s, String prefix){
    if(s.length() ==0){
      System.out.println(prefix +" ");
      return;
    }
    for(int i=0; i<s.length(); i++){
      char ch = s.charAt(i);
      Character.getNumericValue('a');
      // Rest of the string after excluding
      // the ith character
      String rem = s.substring(0, i)+ s.substring(i+1);
      printPermute(rem, prefix+ch);
    }
  }

  public static void main(String[] args) {
    System.out.println(Character.getNumericValue('z'));
    String s = "123";
    printPermute(s, "");
  }

}
