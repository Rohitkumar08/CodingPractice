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
 * Created 7/22/2019 4:19 PM
 *
 * @author Rohit Rawani
 */
public class ComputerFactory {

  public static Computer getComputer(String type, String ram, String hdd, String cpu){
    if("PC".equalsIgnoreCase(type)){
      return new PC(ram, cpu, hdd );
    }
    else if("Server".equalsIgnoreCase(type)){
      return new Server(ram, cpu, hdd );
    }
    return null;
  }
}
