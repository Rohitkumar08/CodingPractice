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

import java.io.IOException;

/**
 * Created 9/18/2019 1:41 PM
 *
 * @author Rohit Rawani
 */
public class ThrowsExecp
{
  static void fun()
  {
    System.out.println("Inside fun(). ");
//    throw new IOException("demo");
  }
  public static void main(String args[])
  {
    fun();
/*    try
    {

    }
    catch(IllegalAccessException e)
    {
      System.out.println("caught in main.");
    }*/
  }
}