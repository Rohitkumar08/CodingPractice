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
package DesignPatterns.Builder;

/**
 * Created 8/2/2019 2:06 AM
 *
 * @author Rohit Rawani
 */
public class Computer {

  //required parameters
  private String HDD;
  private String RAM;


  //optional parameters
  private boolean isGraphicsCardEnabled;
  private boolean isBluetoothEnabled;

  public String getHDD() {
    return HDD;
  }

  public String getRAM() {
    return RAM;
  }

  public boolean isGraphicsCardEnabled() {
    return isGraphicsCardEnabled;
  }

  public boolean isBluetoothEnabled() {
    return isBluetoothEnabled;
  }
  private Computer(ComputerBuilder builder){
    this.HDD=builder.HDD;
    this.RAM=builder.RAM;
    this.isBluetoothEnabled=builder.isBluetoothEnabled;
    this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
  }

  @Override public String toString() {
    return "RAM= "+this.getRAM()+", HDD="+this.getHDD();
  }

  //static class to access class level data
  public static class ComputerBuilder{
    //required parameters
    private String HDD;
    private String RAM;

    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public ComputerBuilder(String hdd, String ram){
      this.HDD=hdd;
      this.RAM=ram;
    }
    //setters for optional params

    public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
      this.isGraphicsCardEnabled = graphicsCardEnabled;
      return this;
    }

    public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
      this.isBluetoothEnabled = bluetoothEnabled;
      return this;
    }

    public Computer build(){
      return new Computer(this);
    }

  }


}
