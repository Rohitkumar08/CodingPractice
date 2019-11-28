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
 * Created 7/19/2019 4:46 PM
 *
 * @author Rohit Rawani
 */

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

  public static void main(String[] args) {

    EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
    EagerInitializedSingleton instanceTwo = null;
    try {
      Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
      for (Constructor constructor : constructors) {
        //Below code will destroy the singleton pattern
        constructor.setAccessible(true);
        instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
        break;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(instanceOne.hashCode());
    System.out.println(instanceTwo.hashCode());
  }

}

