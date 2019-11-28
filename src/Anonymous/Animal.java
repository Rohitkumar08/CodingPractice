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

import java.util.stream.IntStream;

/**
 * Created 7/18/2019 1:06 PM
 *
 * @author Rohit Rawani
 */
public class Animal {
  /*
  this method is used to print dummy text.
   */
  public static void testClassMethod() {
//    prints instance method/
    System.out.println("The static //method in Animal");
  }
}
class Cat extends Animal {
  public static void testClassMethod() {
    System.out.println("The static method in Cat");
  }
  public static void main(String[] args) {
    Cat myCat = new Cat();
    myCat.testClassMethod();
  }
}
