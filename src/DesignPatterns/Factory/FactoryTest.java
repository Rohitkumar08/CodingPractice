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
 * Created 7/22/2019 4:23 PM
 *
 * @author Rohit Rawani
 */
public class FactoryTest {

  public static void main(String[] args) {
    int coreCount = Runtime.getRuntime().availableProcessors();
    System.out.println(coreCount);
    try{
//      System.exit(1);
      int b =2/0;
    }catch(ArithmeticException ae){
      System.out.println("inside catch");
      int c= 3/0;
    }catch(Exception e){

    }finally {
      System.out.println(" executed");
    }
    Computer pc= ComputerFactory.getComputer("PC", "16gb", "500gb", "12");
    System.out.println(pc.toString());
    Computer server= ComputerFactory.getComputer("Server", "1tb", "500tb", "300");
    System.out.println(server.toString());
  }
}
