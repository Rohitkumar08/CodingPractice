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
package LeetCode;

import java.util.Arrays;
import java.util.List;

/**
 * Created 8/9/2019 1:20 AM
 *
 * @author Rohit Rawani
 */
public class Power {
  public static double myPow(double x, int n) {
    if (x == 1 || n == 0) {
      return 1.0;
    }
    if (n < 0) {
      return 1.0 / (x * myPow(x, -(n + 1)));
    }
    double y = myPow(x, n / 2);
    if (n % 2 == 0) {
      return y * y;
    } else {
      return x*y*y;
    }
  }

  public static void main(String[] args) {
    System.out.println(myPow(5, 3));
  }

}
