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
package Anonymous;

import com.sun.org.apache.xml.internal.security.encryption.EncryptedKey;

/**
 * Created 7/18/2019 1:32 PM
 *
 * @author Rohit Rawani
 */
interface OperateCar {
  // ...
  default public void startEngine(String key) {
    // Implementation
    System.out.println("operate car");
  }
}
interface FlyCar {
  // ...
  default public void startEngine(String key) {
    // Implementation
    System.out.println("fly car");
  }
}
public class FlyingCar implements OperateCar, FlyCar {
  // ...
  public void startEngine(String key) {
    FlyCar.super.startEngine(key);
    OperateCar.super.startEngine(key);
  }

  public static void main(String[] args) {
    FlyingCar car = new FlyingCar();
    car.startEngine("abc" );
  }
}
