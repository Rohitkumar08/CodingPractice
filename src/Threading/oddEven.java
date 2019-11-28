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

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created 7/22/2019 2:23 AM
 *
 * @author Rohit Rawani
 */
public class oddEven {

  public static void main(String[] args) throws InterruptedException {
    AtomicInteger num = new AtomicInteger(1);
    Object lock =  new Object();
    EvenThread t1 = new EvenThread(num, lock);
    OddThread t2= new OddThread(num, lock);
    t1.start();
    t2.start();

  }

}
class EvenThread extends Thread{
  private AtomicInteger num;
  public Object lock;

  public EvenThread(AtomicInteger num, Object lock) {
    this.num = num;
    this.lock = lock;
  }

  @Override public void run(){
    synchronized (lock){
      while(num.get()<=100){
        if(num.get()%2!=0){
          try{
            lock.wait();
          }catch(InterruptedException ex){}
        }else{
          System.out.println(Thread.currentThread().getName()+" "+num.get());
/*          try{
            Thread.sleep(10000);
          }catch(InterruptedException ex){}*/
          num.incrementAndGet();
          lock.notifyAll();
        }
      }
    }

  }
}
class OddThread extends Thread{
  private AtomicInteger num;
  public Object lock;

  public OddThread(AtomicInteger num, Object lock) {
    this.num = num;
    this.lock = lock;
  }
  @Override public void run(){
    synchronized (lock){
      while(num.get()<=100){
        if(num.get()%2==0){
          try{
            lock.wait();
          }catch(InterruptedException ex){}
        }else{
          System.out.println(Thread.currentThread().getName()+" "+num.get());
     /*     try{
            Thread.sleep(10000);
          }catch(InterruptedException ex){}*/
          num.incrementAndGet();
          lock.notifyAll();
        }
      }
    }
  }
}
