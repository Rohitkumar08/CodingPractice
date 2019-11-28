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
 * Created 7/22/2019 1:23 AM
 *
 * @author Rohit Rawani
 */
public class ThreadA {

  public static void main(String[] args) throws InterruptedException{

    ThreadB runnable = new ThreadB();
    Thread t = new Thread(runnable);
    t.start();
/*  t.join();  we are expecting some updation so use wait if after the for loop there is 1crore line is ther the main thead
    will have to wait for that much long.*/
    /**
     * if the main thread got chance then only we will get the o/p if we call Thread.sleep(100000) then child thread
     * will get chance and it will update the value and notify after that main thread will get chance and will go into waiting state
     * forever as child class already completed so no one is there to notify in that case call runnable.wait(100000)
     */
    synchronized (runnable){
//      main thread trying to call wait method
      runnable.wait();
    }

    System.out.println(runnable.total);
  }
}
class ThreadB implements Runnable{
  int total=0;
  @Override public void run() {
  synchronized (this){
    for(int i=1; i<=100; i++){
      total+=i;
    }
    //child thread trying to give notification to main thread
    this.notify();
  }
  }
}
