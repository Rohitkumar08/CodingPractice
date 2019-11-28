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
 * Created 7/23/2019 3:15 PM
 *
 * @author Rohit Rawani
 */
public class ServerFactory implements ComputerAbstractFactory {
  private String RAM;
  private String CPU;
  private String HDD;

  public ServerFactory(String RAM, String CPU, String HDD) {
    this.RAM = RAM;
    this.CPU = CPU;
    this.HDD = HDD;
  }

  @Override public Computer createComputer() {
    return new Server(RAM, HDD, CPU);
  }
}
