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
 * Created 7/19/2019 4:47 PM
 *
 * @author Rohit Rawani
 */
public class EagerInitializedSingleton {

  private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

  //private constructor to avoid client applications to use constructor
  private EagerInitializedSingleton(){}

  public static EagerInitializedSingleton getInstance(){
    return instance;
  }
}
