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
package DesignPatterns;

/**
 * Created 7/23/2019 1:35 AM
 *
 * @author Rohit Rawani
 */
public class ThrowsExecp
{
  static void fun() throws IllegalAccessException
  {
    System.out.println("Inside fun(). ");
    throw new IllegalAccessException("demo");
  }
  public static void main(String args[]) throws MyException
  {
    try
    {
      int a='1'-'0';
      System.out.println(a);
     throw new RuntimeException();
    }
    catch(Exception e)
    {
      System.out.println("caught in main.");
      System.out.println(e.getMessage());
      throw new MyException("My first exception");
    }
  }
}
class MyException extends  Exception{
  public MyException(String s){
    super(s);
  }
}
