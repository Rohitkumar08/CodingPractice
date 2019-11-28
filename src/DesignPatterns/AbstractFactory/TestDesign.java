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
package DesignPatterns.AbstractFactory;

/**
 * Created 7/23/2019 3:17 PM
 *
 * @author Rohit Rawani
 */
public class TestDesign {
  public static void main(String[] args) {
    testAbstractFactory();
  }

  private static void testAbstractFactory() {
    Computer PC = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
    Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
    System.out.println(PC);
    System.out.println(server);
  }

}
