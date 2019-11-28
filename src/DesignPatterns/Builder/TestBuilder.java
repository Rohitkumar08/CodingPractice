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
 * Created 8/2/2019 2:12 AM
 *
 * @author Rohit Rawani
 */
public class TestBuilder {

  public static void main(String[] args) {
    Computer comp= new Computer.ComputerBuilder("500gb", "6gb").setBluetoothEnabled(true)
        .setGraphicsCardEnabled(true).build();
    System.out.println(comp);
  }
}
