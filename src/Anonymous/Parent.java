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

/**
 * Created 5/11/2019 8:15 AM
 *
 * @author Rohit Rawani
 */
public class Parent {

  int s = 452;

  void show(C c) {
    int s = 9999999;
    int x = 8729834;
    System.out.println("Printing data members...");
    System.out.println(s);
    System.out.println(this.s);
    System.out.println(c.s);
    System.out.println(c.p);
    System.out.println("Calling display...");
    display(x);
    this.display(x);
    c.display(x);
  }

  void display(int x) {
    System.out.println("Parent");
    System.out.println(x);
  }
}

class C extends Parent {

  int s = 6234;
  int p = 123;
  int x = 17823;

  void display(int x) {
    System.out.println("Child");
    System.out.println(x);
  }
}

class Main {

  public static void main(String[] args) {
    C a = new C();
    C b = new C();
    a.show(a);
    System.out.println();
    /*a.show(b);*/
  }
}