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

import java.sql.SQLOutput;

/**
 * Created 8/2/2019 6:28 PM
 *
 * @author Rohit Rawani
 */
public class RealInternet implements Internet {

  @Override public void connectTo(String siteName) {
    System.out.println("Connecting to the website.... "+ siteName);
  }
}
