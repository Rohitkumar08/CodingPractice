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
package DesignPatterns.Factory;

/**
 * Created 7/22/2019 4:13 PM
 *
 * @author Rohit Rawani
 */
public class PC extends Computer {
  private String RAM;
  private String CPU;
  private String HDD;

  public PC(String RAM, String CPU, String HDD) {
    this.RAM = RAM;
    this.CPU = CPU;
    this.HDD = HDD;
  }

  @Override public String getRAM() {
    return RAM;
  }

  public void setRAM(String RAM) {
    this.RAM = RAM;
  }

  @Override public String getCPU() {
    return CPU;
  }

  public void setCPU(String CPU) {
    this.CPU = CPU;
  }

  @Override public String getHDD() {
    return HDD;
  }

  public void setHDD(String HDD) {
    this.HDD = HDD;
  }


}
