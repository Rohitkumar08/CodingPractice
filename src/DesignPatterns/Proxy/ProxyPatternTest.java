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
package DesignPatterns.Proxy;

/**
 * Created 8/2/2019 5:44 PM
 *
 * @author Rohit Rawani
 */
public class ProxyPatternTest {

  public static void main(String[] args){
    CommandExecutor executor = new CommandExecutorProxyImpl("Pankaj", "wrong_pwd");
    try {
      executor.runCommand("ls -ltr");
      executor.runCommand(" rm -rf abc.pdf");
    } catch (Exception e) {
      System.out.println("Exception Message::"+e.getMessage());
    }

  }

}
