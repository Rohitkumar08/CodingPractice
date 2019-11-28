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

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * Created 2/11/2019 4:46 PM
 *
 * @author Rohit Rawani
 */
public class Autoboxing {


/*  public static void sum(int a, Integer b){
    System.out.println("primitive : " +a);
  }*/
  public static Integer sum(Integer a, int b){

    System.out.println("wrapper : " +a);
    return a;
  }
  public static Integer sum(int a, int b){

    System.out.println("wrapper : " +a);
    return a;
  }
public static void sumLong(long a){

}
  public static void sumLong(Long a){

  }
  public static void main(String[] args) {


    Autoboxing a;
//    System.out.println(a);
    String[] arr = new String[10];
    arr[3]="3";
    arr[7]="7";
    List<String> list = Arrays.asList(arr);
    System.out.println(list.size());
    int c=5;
    Integer d = sum(c,4);
    if(d!=null){
      System.out.println("done");
    }
    sumLong(new Long(5));
    String s =new String("JHVJ jhbb Hkjkjbkb");
    System.out.println(s.toLowerCase());

  }

}
