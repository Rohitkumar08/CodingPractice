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
 * Created 7/22/2019 4:14 PM
 *
 * @author Rohit Rawani
 */
public class Server extends Computer {
  private String RAM;

  public String getRAM() {
    return RAM;
  }

  public void setRAM(String RAM) {
    this.RAM = RAM;
  }

  public String getCPU() {
    return CPU;
  }

  public void setCPU(String CPU) {
    this.CPU = CPU;
  }

  public String getHDD() {
    return HDD;
  }

  public void setHDD(String HDD) {
    this.HDD = HDD;
  }

  private String CPU;
  private String HDD;

  public Server(String RAM, String CPU, String HDD) {
    this.RAM = RAM;
    this.CPU = CPU;
    this.HDD = HDD;
  }

}
