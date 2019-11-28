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
 * Created 7/22/2019 5:15 PM
 *
 * @author Rohit Rawani
 */
public class PCFactory implements ComputerAbstractFactory {
  private String RAM;
  private String CPU;
  private String HDD;

  public PCFactory(String RAM, String CPU, String HDD) {
    this.RAM = RAM;
    this.CPU = CPU;
    this.HDD = HDD;
  }
  @Override public Computer createComputer() {
    return new PC(RAM, HDD, CPU);
  }
}
