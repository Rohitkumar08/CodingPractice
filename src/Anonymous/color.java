/*
 * Copyright 2006-2019 (c) Care.com, Inc.
 * 1400 Main Street, Waltham, MA, 02451, U.S.A.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Care.com, Inc. ("Confidential Information").  You shall not disclose
 * such Confidential Information and shall use it only in accordance with
 * the terms of an agreement between you and CZen.
 *//*

package Anonymous;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

*/
/**
 * Created 4/11/2019 3:59 PM
 *
 * @author Rohit Rawani
 *//*

public class color {

  public static int checkProb(int strip){
    char[] c = {'w', 'r', 'b'};
    int count=0;
    ArrayList<String> lst = new ArrayList<>();
    char[] temparray = new char[strip];
    while(true){
      StringBuilder temp= new StringBuilder();
      for(int j=0; j<strip; j++){
        int i =getRand(0,2);
        if(c[i]=='w' || c[i]=='r'){
          if(j>0 && temparray[j-1] != c[i]){
            temparray[j]=c[i];
          }else{
            while (c[getRand(0, 2)]=='b') {
              getRand(0,2);
            }
            temparray[j]=c[i];
          }
        }

        if( c[i]=='b' && (j!=0 || j!=strip-1) && temparray[j-1]!='b'){
          temparray[j]=c[i];
        }

        temp.append(c[i]
      }
    }


  }
  public static int getRand(int max, int min){
    Random rand=null;

    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = rand.nextInt((max - min) + 1) + min;
    return randomNum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0; i<t; i++){
      int strip = sc.nextInt();
      int result= checkProb(strip);
      System.out.println(result);
    }
  }

}
*/
