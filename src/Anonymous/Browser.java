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

/**
 * Created 4/13/2019 2:10 PM
 *
 * @author Rohit Rawani
 */
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Browser {
  public static void main(String[] args) {
    String url = "http://www.google.com";

    if(Desktop.isDesktopSupported()){
      Desktop desktop = Desktop.getDesktop();
      try {
        desktop.browse(new URI(url));
      } catch (IOException | URISyntaxException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }else{
      Runtime runtime = Runtime.getRuntime();
      try {
        runtime.exec("xdg-open " + url);
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}