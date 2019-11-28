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

import java.util.stream.IntStream;

/**
 * Created 7/21/2019 1:23 PM
 *
 * @author Rohit Rawani
 */
public class MyThread implements Runnable {

  @Override public void run() {

    for(int i=0; i<10; i++){
      System.out.println("child thread : " + i);
      try{
//        Thread.currentThread().join();
        Thread.sleep(2000);
      }catch(InterruptedException ex){

      }

    }
  }
}

class Demo{

  public static void main(String[] args) {
    MyThread runnnable = new MyThread();
    Thread t = new Thread(runnnable);
//    t.setPriority(10);
    t.start();
    for(int i=0; i<10; i++){
      Thread.yield();

      System.out.println("parent thread : "+ i);
    }
  }
}