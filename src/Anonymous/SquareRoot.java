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
 * Created 8/18/2019 1:54 PM
 *using BS
 * @author Rohit Rawani
 */
public class SquareRoot {
  public static int mySqrt(int x) {
    if (x < 2)
      return x;
    long num;
    int pivot, left = 2, right = x / 2;
    while (left <= right) {
      pivot = left + (right - left) / 2;
      num = (long) pivot * pivot;
      if (num > x) {
        right = pivot - 1;
      } else if (num < x) {
        left = pivot + 1;
      } else {
        return pivot;
      }
    }
    return right;
  }

  public static void main(String[] args) {
    System.out.println(mySqrt(2147483647));
  }
}
