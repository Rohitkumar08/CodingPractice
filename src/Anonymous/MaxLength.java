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
 * Created 9/18/2019 2:30 PM
 *
 * @author Rohit Rawani
 */
public class MaxLength {
  public static int getMaxLength(int x, int a, int b, int c){
    int count=0;
    if(x%a==0){
      count=count+x/a;
    }

  return 0;
  }

  public static void main(String[] args) {
    int x =7;
    int a=2;
    int b=3; int c=4;
    int mxLength = getMaxLength(x, a, b, c);
    System.out.println(mxLength);
  }

}
