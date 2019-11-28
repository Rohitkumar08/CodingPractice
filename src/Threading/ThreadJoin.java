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
 * Created 7/21/2019 6:24 PM
 *
 * @author Rohit Rawani
 */
public class ThreadJoin {

  public static void main(String[] args) throws InterruptedException {
//    Thread.currentThread().join();
    MyThread runnnable = new MyThread();
    Thread t = new Thread(runnnable);
    t.start();
    t.join();

    for(int i=0; i<10; i++){
//      t.sleep(2000);
      System.out.println("parent thread : "+ i);
    }
  }
}
