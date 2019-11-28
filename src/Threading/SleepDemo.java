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
package Threading;

/**
 * Created 7/21/2019 1:46 PM
 *
 * @author Rohit Rawani
 */
public class SleepDemo implements Runnable
{
  Thread t;
  public void run()
  {
    for (int i = 0; i < 4; i++)
    {
      System.out.println(Thread.currentThread().getName()
          + "  " + i);
      try
      {
        // thread to sleep for 1000 milliseconds
        Thread.sleep(1000);
      }

      catch (Exception e)
      {
        System.out.println(e);
      }
    }
  }

  public static void main(String[] args) throws Exception
  {
    Thread t = new Thread(new SleepDemo());

    // call run() function
    t.start();

    Thread t2 = new Thread(new SleepDemo());

    // call run() function
    t2.start();
  }
}