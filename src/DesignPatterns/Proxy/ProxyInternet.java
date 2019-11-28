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

import java.util.ArrayList;
import java.util.List;

/**
 * Created 8/2/2019 6:29 PM
 *
 * @author Rohit Rawani
 */
public class ProxyInternet implements Internet {
  private Internet internet = new RealInternet();
  private static List<String> bannedSites;

  static {
    bannedSites = new ArrayList<>();
    bannedSites.add("abc.com");
    bannedSites.add("def.com");
    bannedSites.add("ijk.com");
    bannedSites.add("lnm.com");
  }

  @Override public void connectTo(String siteName) throws Exception {
    if(bannedSites.contains(siteName)){
      throw new Exception("Access denied..."+ siteName);
    }
    internet.connectTo(siteName);
  }
}
