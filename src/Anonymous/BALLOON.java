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

import java.util.List;

/**
 * Created 7/31/2019 10:32 PM
 *
 * @author Rohit Rawani
 */
public class BALLOON {
  public static int countNoOfBalloon(String str){
    int i=0;
    int count=0;
    while(i+7<=str.length()){
      if(str.substring(i, i+7).contains("balloon")){
        count++;
        i+=7;
      }else{
        break;
      }
    }
    System.out.println(count);
    return count;

  }

  public static void main(String[] args) {
    countNoOfBalloon("balloonballoonballoonlloo");
  }

}
