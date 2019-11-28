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

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

/**
 * Created 9/9/2019 2:01 PM
 *
 * @author Rohit Rawani
 */
public class Time {
  public static Timestamp stringToTimeStamp(String strTime){
    Timestamp tempTimestamp = null;
    if(strTime!=null && !strTime.equals(""))
    {
      SimpleDateFormat dateFormat = new SimpleDateFormat(
          "yyyy-MM-dd");//format of date and time you have
      Instant inst = Instant.parse(strTime);
      System.out.println(inst.toString());
      Date parsedTimeStamp = null;
      try {
        parsedTimeStamp = dateFormat.parse(strTime);
      } catch (ParseException e) {
        e.printStackTrace();
      }

      tempTimestamp = new Timestamp(parsedTimeStamp.getTime());


    }
    System.out.println( tempTimestamp.toString());
    return tempTimestamp;
  }

  public static void main(String[] args) {
    stringToTimeStamp("2000-08-16");
  }
}
