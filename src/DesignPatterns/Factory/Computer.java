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

import java.util.concurrent.Future;

/**
 * Created 7/22/2019 4:07 PM
 * can make it an interface also
 * java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
 * valueOf() method in wrapper classes like Boolean, Integer etc.
 *
 * @author Rohit Rawani
 */
public abstract class Computer {

  public abstract String getRAM();
  public abstract String getHDD();
  public abstract String getCPU();

  @Override
  public String toString(){
    return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
  }

}
