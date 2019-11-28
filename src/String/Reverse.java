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

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created 5/10/2019 12:16 AM
 *
 * @author Rohit Rawani
 */
enum vehicle{
  name, watch, hire;

}
public class Reverse {
  public static void printReverse(String s){
    System.out.println("ordinal = "+vehicle.watch.ordinal());
    char c = s.charAt(0);
    if(s.length()==1){
      System.out.print(c);
      return;
    }else{
    printReverse(s.substring(1));
      System.out.print(c);
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t= sc.nextInt();
    for(int i=0; i<t; i++){
      String s=sc.next();
        printReverse(s);

    }
  }

}
