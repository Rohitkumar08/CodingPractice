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
 * Created 7/18/2019 1:19 PM
 *
 * @author Rohit Rawani
 */
interface Animal1 {
  default public String identifyMyself() {
    return "I am an animal.";
  }
}
interface EggLayer extends Animal1 {
  default public String identifyMyself() {
    return "I am able to lay eggs.";
  }
}
interface FireBreather extends Animal1 { }

public class Dragon implements EggLayer, FireBreather {
  public static void main (String... args) {
    Dragon myApp = new Dragon();
    System.out.println(myApp.identifyMyself());
  }
}